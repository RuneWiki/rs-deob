import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class127 extends class279 {

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    private final int field2117;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    private final int field2118;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    private final int field2113;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2103 = 0;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "[Lbe;")
    public static class283[] field2102 = new class283[100];

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    private int field2108;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    private int field2114;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    private int field2115;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "[B")
    private byte[] field2104;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IIIIIFFF)V", line = 20)
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2117 = (int) (arg7 * 4096.0F);
        this.field2118 = (int) (arg6 * 4096.0F);
        this.field2119 = this.field2113 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lfe;I)Lla;", line = 34)
    public static final class130 method793(class229 arg0, int arg1) {
        if (arg1 != -28399) {
            return (class130) null;
        }
        field2106++;
        class130 var2 = new class130();
        var2.field2210 = arg0.method1496(true);
        var2.field2208 = class205.method1316(var2.field2210, arg1 ^ 0xFFFF917A);
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V", line = 48)
    public static void method794(int arg0) {
        if (arg0 != 0) {
            method794(45);
        }
        field2102 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 58)
    public static final Class method795(String arg0, int arg1) throws ClassNotFoundException {
        field2111++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg1 != 0) {
                field2102 = (class283[]) null;
            }
            if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)V", line = 104)
    public void method50(int arg0, byte arg1) {
        field2107++;
        this.field2104[arg0] = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V", line = 112)
    public final void method792(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field2108 = this.field2118 - (arg2 >= 0 ? arg2 : -arg2);
            this.field2108 = this.field2108 * this.field2108 >> 12;
            this.field2114 = 4096;
            this.field2115 = this.field2108;
        } else {
            this.field2114 = this.field2117 * this.field2108 >> 12;
            this.field2108 = this.field2118 - (arg2 >= 0 ? arg2 : -arg2);
            if (this.field2114 < 0) {
                this.field2114 = 0;
            } else if (this.field2114 > 4096) {
                this.field2114 = 4096;
            }
            this.field2108 = this.field2108 * this.field2108 >> 12;
            this.field2108 = this.field2114 * this.field2108 >> 12;
            this.field2115 += this.field2119 * this.field2108 >> 12;
            this.field2119 = this.field2119 * this.field2113 >> 12;
        }
        field2105++;
        int var4 = -16 / ((arg1 + 54) / 56);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 149)
    public final void method788(byte arg0) {
        field2116++;
        this.field2115 = 0;
        if (arg0 == 60) {
            this.field2112 = 0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V", line = 161)
    public final void method786(boolean arg0) {
        this.field2119 = this.field2113;
        if (arg0) {
            return;
        }
        field2109++;
        this.field2115 >>= 0x4;
        if (this.field2115 < 0) {
            this.field2115 = 0;
        } else if (this.field2115 > 255) {
            this.field2115 = 255;
        }
        this.method50(this.field2112++, (byte) this.field2115);
        this.field2115 = 0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIFIZII)[I", line = 191)
    public static final int[] method796(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int[] var8 = new int[arg6];
        field2110++;
        class61 var9 = new class61();
        var9.field848 = arg7;
        var9.field837 = arg4;
        var9.field842 = arg2;
        var9.field841 = (int) (arg3 * 4096.0F);
        var9.field860 = arg1;
        var9.field840 = arg5;
        var9.method276(3);
        class138.method857(arg6, 1, -90);
        var9.method399(arg0 ^ 0x683B, arg0, var8);
        return var8;
    }
}
