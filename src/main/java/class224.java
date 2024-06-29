import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class224 extends class260 {

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "Lwt;")
    public static class330 field3064 = new class330();

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "Ljw;")
    public static class581 field3066 = new class581(45, 2);

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "[I")
    public static int[] field3075;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[BIBIII)V", line = 3)
    public static final void method1482(int arg0, byte[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field3071;
        if (~arg2 < -1 && !class117.method957(-6602, arg2)) {
            throw new IllegalArgumentException("");
        } else if (~arg0 < -1 && !class117.method957(-6602, arg0)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class639.method3561(arg4, false);
            int var8 = 0;
            if (arg3 >= -90) {
                field3066 = null;
            }
            int var9 = arg0 > arg2 ? arg2 : arg0;
            int var10 = arg2 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg1;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg6, arg2, arg0, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                for (int var15 = 0; ~var7 < ~var15; ++var15) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; ++var20) {
                        for (int var21 = 0; ~var21 > ~var10; ++var21) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg0 = var11;
                var12 = var16;
                arg2 = var10;
                ++var8;
                var11 >>= 1;
                var9 >>= 1;
                var10 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)I", line = 100)
    public final int method8(byte arg0) {
        ++field3068;
        return arg0 != 4 ? -25 : 1;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z", line = 112)
    public final boolean method1483(int arg0) {
        int var2 = 59 / ((56 - arg0) / 53);
        ++field3073;
        if (super.field3867.method740((byte) -108)) {
            return false;
        } else {
            return super.field3867.method737(false) == class380.field5545;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V", line = 129)
    public final void method2(boolean arg0) {
        if (super.field3867.method737(arg0) != class380.field5545) {
            super.field3868 = 1;
        } else if (super.field3867.method740((byte) -121)) {
            super.field3868 = 0;
        }
        ++field3074;
        if (super.field3868 != 0 && ~super.field3868 != -2) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)I", line = 150)
    public static final int method1484(int arg0, int arg1) {
        if (arg1 >= -123) {
            field3066 = null;
        }
        ++field3065;
        int var2 = 63 & arg0;
        int var3 = (198 & arg0) >> 6;
        if (var2 != 18) {
            if (var2 == 19 || var2 == 21) {
                if (var3 == 0) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
        } else {
            if (~var3 == -1) {
                return 1;
            }
            if (~var3 == -2) {
                return 2;
            }
            if (~var3 == -3) {
                return 4;
            }
            if (~var3 == -4) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)V", line = 203)
    public static void method1485(boolean arg0) {
        field3075 = null;
        if (!arg0) {
            field3064 = null;
            field3066 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(ILfca;)V", line = 218)
    public class224(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)I", line = 225)
    public final int method4(int arg0, byte arg1) {
        int var3 = -118 % ((arg1 - -53) / 50);
        ++field3072;
        if (super.field3867.method740((byte) -126)) {
            return 3;
        } else {
            return super.field3867.method737(false) == class380.field5545 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IB)V", line = 244)
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        ++field3070;
        if (arg1 != -107) {
            field3066 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lfca;)V", line = 258)
    public class224(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)I", line = 263)
    public final int method1486(int arg0) {
        if (arg0 <= 3) {
            field3075 = null;
        }
        ++field3067;
        return super.field3868;
    }
}
