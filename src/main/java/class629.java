import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class629 extends class298 {

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    private int field9110;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    private int field9106;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    private int field9114;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    private int field9115;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[Lwg;")
    public static class516[] field9104 = new class516[4];

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field9108 = -1;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "F")
    public static float field9109;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    private int field9105;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    private int field9111;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field9118;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field9119;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[B")
    private byte[] field9120;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBI)V", line = 15)
    public void method2189(int arg0, byte arg1, int arg2) {
        if (arg2 != -6820) {
            this.method2189(108, (byte) 17, 27);
        }
        this.field9120[arg0] = arg1;
        field9113++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 27)
    public final void method1857(boolean arg0) {
        field9121++;
        this.field9111 = 0;
        this.field9105 = 0;
        if (arg0) {
            method3621(32);
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 41)
    public static void method3621(int arg0) {
        if (arg0 != 0) {
            field9104 = null;
        }
        field9104 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V", line = 52)
    public final void method1862(byte arg0) {
        field9107++;
        this.field9105 >>= 0x4;
        this.field9115 = this.field9114;
        if (arg0 > -81) {
            this.field9120 = null;
        }
        if (this.field9105 < 0) {
            this.field9105 = 0;
        } else if (this.field9105 > 255) {
            this.field9105 = 255;
        }
        this.method2189(this.field9111++, (byte) this.field9105, -6820);
        this.field9105 = 0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 75)
    public static final String method3622(long arg0, int arg1) {
        field9116++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 != 4) {
                field9104 = null;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class204.field2786[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V", line = 128)
    public final void method1854(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field9118 = this.field9110 - (arg2 >= 0 ? arg2 : -arg2);
            this.field9118 = this.field9118 * this.field9118 >> 12;
            this.field9119 = 4096;
            this.field9105 = this.field9118;
        } else {
            this.field9119 = this.field9118 * this.field9106 >> 12;
            this.field9118 = this.field9110 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field9119 < 0) {
                this.field9119 = 0;
            } else if (this.field9119 > 4096) {
                this.field9119 = 4096;
            }
            this.field9118 = this.field9118 * this.field9118 >> 12;
            this.field9118 = this.field9119 * this.field9118 >> 12;
            this.field9105 += this.field9118 * this.field9115 >> 12;
            this.field9115 = this.field9115 * this.field9114 >> 12;
        }
        field9117++;
        int var4 = 91 / ((arg1 + 81) / 43);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIFFF)V", line = 162)
    public class629(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9110 = (int) (arg6 * 4096.0F);
        this.field9106 = (int) (arg7 * 4096.0F);
        this.field9115 = this.field9114 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
