import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class319 extends class60 {

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Z")
    public boolean field3948 = false;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
    private boolean field3951 = true;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Z")
    public static boolean field3945 = true;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[F")
    public static float[] field3956 = new float[2];

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)S", line = 6)
    public static final short method1899(int arg0, byte arg1) {
        ++field3947;
        int var2 = 63 & arg0 >> 10;
        int var3 = arg0 >> 3 & 112;
        int var4 = arg0 & 127;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (-var4 + 127) * var3 >> 7;
        int var6 = var4 + var5;
        if (arg1 <= 47) {
            method1901(64);
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lkq;III)V", line = 34)
    public static final void method1900(class620 arg0, int arg1, int arg2, int arg3) {
        ++field3944;
        class513 var4 = arg0.method3531((byte) 33, class363.field4526);
        if (var4 != null) {
            if (arg2 < 30) {
                field3956 = null;
            }
            class363.field4526.method556(arg3, arg1, arg3 - -arg0.field8506, arg1 - -arg0.field8416);
            if (~class13.field218 <= -4) {
                class363.field4526.method617(-16777216, var4, arg3, arg1);
            } else {
                class331.field4095.method1839((float) arg0.field8506 / 2.0F + (float) arg3, (float) arg0.field8416 / 2.0F + (float) arg1, 4096, (16383 & (int) (-class47.field626)) << 2, var4, arg3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I", line = 57)
    public static final int method1901(int arg0) {
        ++field3958;
        if (arg0 != 3) {
            return 62;
        } else {
            return class727.field10184 == 1 ? class734.field10263 : class176.field2182;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(ILhd;)V", line = 71)
    public class319(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I", line = 74)
    public final int method405(boolean arg0) {
        this.field3948 = true;
        ++field3957;
        if (arg0) {
            return 93;
        } else {
            return !super.field798.method4288(0).method1437(-118) ? 0 : 2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[SI)[S", line = 89)
    public static final short[] method1902(int arg0, short[] arg1, int arg2) {
        ++field3954;
        if (arg0 != 3) {
            return null;
        } else {
            short[] var3 = new short[arg2];
            class211.method1334(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V", line = 103)
    public final void method407(byte arg0, int arg1) {
        this.field3948 = false;
        int var3 = 29 / ((28 - arg0) / 50);
        super.field799 = arg1;
        ++field3950;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)I", line = 114)
    public final int method1903(int arg0) {
        if (arg0 != 0) {
            method1906((byte) -69);
        }
        ++field3955;
        return super.field799;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z", line = 125)
    public static final boolean method1904(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field3945 = false;
        }
        ++field3952;
        return (class86.method797(57, arg0, arg1) | (arg1 & 8192) != 0 | class427.method2545(arg2 ^ 65536, arg1, arg0)) & class123.method957(arg1, false, arg0);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lhd;)V", line = 142)
    public class319(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Z", line = 145)
    public final boolean method1905(int arg0) {
        if (arg0 != 14784) {
            return false;
        } else {
            ++field3949;
            return this.field3951;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V", line = 156)
    public static void method1906(byte arg0) {
        if (arg0 >= 57) {
            field3956 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)I", line = 175)
    public final int method406(int arg0, int arg1) {
        ++field3953;
        if (!super.field798.method4288(arg0).method1437(-66)) {
            return 3;
        } else {
            return arg1 == 3 && !class454.method2751((byte) -44, "jagdx") ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V", line = 190)
    public final void method1907(int arg0, boolean arg1) {
        int var3 = -96 / ((-44 - arg0) / 33);
        this.field3951 = arg1;
        ++field3943;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V", line = 200)
    public final void method409(byte arg0) {
        if (!super.field798.method4288(0).method1437(-65)) {
            super.field799 = 0;
        }
        if (arg0 <= -27) {
            ++field3946;
            if (super.field799 < 0 || super.field799 > 5) {
                super.field799 = this.method405(false);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Z", line = 225)
    public final boolean method1908(byte arg0) {
        ++field3942;
        if (!super.field798.method4288(0).method1437(-104)) {
            return false;
        } else {
            return arg0 >= -61 ? true : true;
        }
    }
}
