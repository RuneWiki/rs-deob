import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class483 {

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "F")
    public float field7078 = 1.0F;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "F")
    public float field7090 = 0.25F;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "F")
    public float field7092 = 1.0F;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public int field7085;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "F")
    public float field7098;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public int field7084;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public int field7082;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public int field7091;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public int field7081;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "Lpv;")
    public class50 field7089;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "F")
    public float field7077;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public int field7083;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "F")
    public float field7079;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "Z")
    public static boolean field7087 = false;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "Lff;")
    public static class9 field7080 = new class9(8);

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public static int field7093 = -50;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "Z")
    public static boolean field7095 = false;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "Lgv;")
    public static class56 field7097;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "Z")
    public static boolean field7099;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field7096;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLbs;)Z")
    public final boolean method2851(byte arg0, class483 arg1) {
        if (arg0 >= -37) {
            this.field7082 = -8;
        }
        field7094++;
        return this.field7084 == arg1.field7084 && this.field7077 == arg1.field7077 && this.field7079 == arg1.field7079 && this.field7098 == arg1.field7098 && this.field7090 == arg1.field7090 && this.field7092 == arg1.field7092 && this.field7078 == arg1.field7078 && this.field7081 == arg1.field7081 && this.field7082 == arg1.field7082 && this.field7089 == arg1.field7089;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[JI[II)V")
    public static final void method2852(int arg0, long[] arg1, int arg2, int[] arg3, int arg4) {
        field7086++;
        if (arg4 < arg0) {
            int var5 = (arg4 + arg0) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg0; var11++) {
                if (arg1[var11] < var7 + ((long) (var11 & var10))) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var9;
            method2852(var6 - 1, arg1, 0, arg3, arg4);
            method2852(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg2 != 0) {
            field7096 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method2853(int arg0) {
        if (arg0 != 0) {
            method2852(-3, null, 29, null, -26);
        }
        field7080 = null;
        field7097 = null;
        field7096 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILlh;)V")
    public final void method2854(int arg0, class365 arg1) {
        if (arg0 == 64) {
            this.field7092 = (float) (arg1.method2099(arg0 ^ 0xBF) * 8) / 255.0F;
            field7088++;
            this.field7090 = (float) (arg1.method2099(255) * 8) / 255.0F;
            this.field7078 = (float) (arg1.method2099(255) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class483() {
        this.field7085 = -50;
        this.field7098 = 1.2F;
        this.field7084 = class161.field2295;
        this.field7082 = 0;
        this.field7091 = -60;
        this.field7081 = class349.field4786;
        this.field7089 = class253.field3525;
        this.field7077 = 1.1523438F;
        this.field7083 = -50;
        this.field7079 = 0.69921875F;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Llh;)V")
    public class483(class365 arg0) {
        int var2 = arg0.method2099(255);
        if (class437.field6374.method1763(class278.field3761, (byte) 83) && class329.field4490.method528() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field7084 = class161.field2295;
            } else {
                this.field7084 = arg0.method2056((byte) 108);
            }
            if ((var2 & 0x2) == 0) {
                this.field7077 = 1.1523438F;
            } else {
                this.field7077 = (float) arg0.method2062((byte) 14) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field7079 = 0.69921875F;
            } else {
                this.field7079 = (float) arg0.method2062((byte) 14) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field7098 = 1.2F;
            } else {
                this.field7098 = (float) arg0.method2062((byte) 14) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2056((byte) -18);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2062((byte) 14);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2062((byte) 14);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2062((byte) 14);
            }
            this.field7079 = 0.69921875F;
            this.field7084 = class161.field2295;
            this.field7098 = 1.2F;
            this.field7077 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field7085 = -50;
            this.field7091 = -60;
            this.field7083 = -50;
        } else {
            this.field7083 = arg0.method2069(-123);
            this.field7091 = arg0.method2069(-121);
            this.field7085 = arg0.method2069(-122);
        }
        if ((var2 & 0x20) == 0) {
            this.field7081 = class349.field4786;
        } else {
            this.field7081 = arg0.method2056((byte) 78);
        }
        if ((var2 & 0x40) == 0) {
            this.field7082 = 0;
        } else {
            this.field7082 = arg0.method2062((byte) 14);
        }
        if ((var2 & 0x80) == 0) {
            this.field7089 = class253.field3525;
        } else {
            int var3 = arg0.method2062((byte) 14);
            int var4 = arg0.method2062((byte) 14);
            int var5 = arg0.method2062((byte) 14);
            int var6 = arg0.method2062((byte) 14);
            int var7 = arg0.method2062((byte) 14);
            int var8 = arg0.method2062((byte) 14);
            this.field7089 = class505.method2966(var8, var7, var4, var3, var5, var6, 82);
        }
    }
}
