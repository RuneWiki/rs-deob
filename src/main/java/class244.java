import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class244 extends class195 {

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
    private int field3953 = 32768;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "Lck;")
    public static class119 field3938 = class298.method1987((byte) 32, "leuchten2:");

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "Z")
    public static boolean field3943 = true;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "I")
    public static int field3952 = 0;

    @OriginalMember(owner = "client!wc", name = "sb", descriptor = "Lck;")
    private static class119 field3958 = class298.method1987((byte) 86, "Starting 3d library");

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
    public static int field3945 = 0;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "Lck;")
    private static class119 field3950 = class298.method1987((byte) 46, "Please remove ");

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "Lck;")
    public static class119 field3955 = field3950;

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "I")
    public static int field3956 = 0;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "Lck;")
    public static class119 field3941 = class298.method1987((byte) 65, "le");

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "Lck;")
    public static class119 field3954 = class298.method1987((byte) 20, "geforce");

    @OriginalMember(owner = "client!wc", name = "wb", descriptor = "Lck;")
    private static class119 field3962 = class298.method1987((byte) 29, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!wc", name = "tb", descriptor = "Lck;")
    public static class119 field3959 = field3958;

    @OriginalMember(owner = "client!wc", name = "ub", descriptor = "Lck;")
    private static class119 field3960 = class298.method1987((byte) 53, "Allocating memory");

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Lck;")
    public static class119 field3936 = field3960;

    @OriginalMember(owner = "client!wc", name = "vb", descriptor = "Lck;")
    public static class119 field3961 = field3962;

    @OriginalMember(owner = "client!wc", name = "xb", descriptor = "Lck;")
    public static class119 field3963 = class298.method1987((byte) 55, "(U");

    @OriginalMember(owner = "client!wc", name = "yb", descriptor = "Lck;")
    public static class119 field3964 = field3950;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!wc", name = "rb", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILec;IBIIZIILwe;IIII)Lec;", line = 34)
    public static final class28 method1588(int arg0, class28 arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class56 arg9, int arg10, int arg11, int arg12, int arg13) {
        long var14 = ((long) arg0 << 32) + ((long) arg13 << 48) + (long) ((arg4 << 16) - -(arg7 << 24) + arg12);
        class28 var16 = (class28) class117.field1763.method487(false, var14);
        field3937++;
        if (var16 == null) {
            byte var17;
            if (arg12 == 1) {
                var17 = 9;
            } else if (arg12 == 2) {
                var17 = 12;
            } else if (arg12 == 3) {
                var17 = 15;
            } else if (arg12 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class267 var20 = new class267((var17 * var19) + 1, var17 * var19 * 2 + -var17, 0);
            int var21 = var20.method1769(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg11 + (class284.field4698[var27] * var25) >> 16;
                    int var29 = class284.field4699[var27] * var24 + arg8 >> 16;
                    var22[var23][var26] = var20.method1769(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg4 * var32 + arg7 * var31 >> 8);
                short var34 = (short) (((arg0 & 0xFC00) * var32 + (arg13 & 0xFC00) * var31 & 0xFC0000) + ((arg0 & 0x380) * var32 + (arg13 & 0x380) * var31 & 0x38000) + ((arg0 & 0x7F) * var32 + (arg13 & 0x7F) * var31 & 0x7F00) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1772(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1772(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method1772(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method1775(64, 768, -50, -10, -50);
            class117.field1763.method488(var16, (byte) 37, var14);
        }
        int var36 = arg12 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg1.method201();
        int var41 = var36;
        if (arg3 != 122) {
            return (class28) null;
        }
        int var42 = arg1.method208();
        int var43 = arg1.method213();
        if (arg6) {
            if (arg10 > 128 && arg10 < 896) {
                var39 -= 128;
            }
            if (arg10 > 1664 || arg10 < 384) {
                var37 -= 128;
            }
            if (arg10 > 640 && arg10 < 1408) {
                var41 = var36 + 128;
            }
            if (arg10 > 1152 && arg10 < 1920) {
                var38 = var36 + 128;
            }
        }
        if (var42 > var38) {
            var42 = var38;
        }
        if (var39 > var40) {
            var40 = var39;
        }
        int var44 = arg1.method205();
        if (var44 > var41) {
            var44 = var41;
        }
        if (var37 > var43) {
            var43 = var37;
        }
        class113 var45 = null;
        if (arg9 != null) {
            int var46 = arg9.field916[arg5];
            var45 = class243.method1583(7, var46 >> 16);
            arg5 = var46 & 0xFFFF;
        }
        class28 var47;
        if (var45 == null) {
            var47 = var16.method218(true, true);
            var47.method206((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method223((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method218(!var45.method724(arg3 - 47, arg5), true);
            var47.method206((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method223((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method215(var45, arg5);
        }
        if (arg10 != 0) {
            var47.method222(arg10);
        }
        class228 var48 = (class228) var47;
        if (class207.method1304(class10.field189, (byte) 84, arg11 + var40, arg8 - -var43) != arg2 || arg2 != class207.method1304(class10.field189, (byte) 126, arg11 + var42, arg8 - -var44)) {
            for (int var49 = 0; var49 < var48.field3644; var49++) {
                var48.field3659[var49] += class207.method1304(class10.field189, (byte) 86, var48.field3672[var49] + arg11, var48.field3667[var49] - -arg8) - arg2;
            }
            var48.field3665.field2226 = false;
            var48.field3663.field231 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 239)
    public final void method14(int arg0) {
        class166.method1046((byte) 61);
        field3948++;
        if (arg0 != 2048879374) {
            field3963 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)[I", line = 257)
    public final int[] method11(int arg0, boolean arg1) {
        field3939++;
        if (arg1) {
            method1591(56, 16);
        }
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(1, 106, arg0);
            int[] var5 = this.method1253(2, 91, arg0);
            for (int var6 = 0; var6 < class157.field2504; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field3953 >> 12;
                int var9 = class237.field3802[var7] * var8 >> 12;
                int var10 = class67.field1045[var7] * var8 >> 12;
                int var11 = class59.field945 & (var10 >> 12) + arg0;
                int var12 = (var9 >> 12) + var6 & class254.field4088;
                int[] var13 = this.method1253(0, 77, var11);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V", line = 306)
    public static final void method1589(int arg0) {
        class171.field2719 = null;
        if (arg0 != -532684948) {
            field3955 = (class119) null;
        }
        field3942++;
        class136.method904();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lfj;II)V", line = 329)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3953 = arg0.method63((byte) 1) << 4;
        } else if (arg2 == 1) {
            this.field3127 = arg0.method64((byte) 110) == 1;
        }
        if (arg1 >= -117) {
            this.method14(-36);
        }
        field3947++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I", line = 362)
    public static final int method1590(int arg0, int arg1) {
        field3957++;
        return arg1 == 1023 ? arg0 & 0x3FF : 110;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V", line = 373)
    public static final void method1591(int arg0, int arg1) {
        field3935++;
        if (!class247.method1609(arg1 ^ 0xFFFFEE50, arg0)) {
            return;
        }
        class134[] var2 = class135.field2189[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class134 var4 = var2[var3];
            if (var4 != null) {
                var4.field2131 = 0;
                var4.field2178 = 0;
            }
        }
        if (arg1 != -26895) {
            method1589(27);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)[[I", line = 406)
    public final int[][] method9(byte arg0, int arg1) {
        if (arg0 != 3) {
            field3964 = (class119) null;
        }
        int[][] var3 = this.field3126.method603(arg1, -123);
        if (this.field3126.field1372) {
            int[] var4 = this.method1253(1, 85, arg1);
            int[] var5 = this.method1253(2, 97, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class157.field2504; var9++) {
                int var10 = var5[var9] * this.field3953 >> 12;
                int var11 = var4[var9] * 255 >> 12 & 0xFF;
                int var12 = class237.field3802[var11] * var10 >> 12;
                int var13 = class254.field4088 & (var12 >> 12) + var9;
                int var14 = class67.field1045[var11] * var10 >> 12;
                int var15 = class59.field945 & arg1 + (var14 >> 12);
                int[][] var16 = this.method1256(var15, 0, -10072);
                var6[var9] = var16[0][var13];
                var8[var9] = var16[1][var13];
                var7[var9] = var16[2][var13];
            }
        }
        field3940++;
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)I", line = 471)
    public static final int method1592(int arg0, int arg1, byte arg2) {
        field3946++;
        int var3 = 1;
        if (arg2 != 89) {
            return -39;
        }
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBII)I", line = 500)
    public static final int method1593(int arg0, byte arg1, int arg2, int arg3) {
        field3934++;
        int var4 = arg2 & 0x3;
        if (arg1 < 115) {
            field3938 = (class119) null;
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V", line = 530)
    public static void method1594(int arg0) {
        field3963 = null;
        field3954 = null;
        field3950 = null;
        field3962 = null;
        field3938 = null;
        field3964 = null;
        field3955 = null;
        field3961 = null;
        field3960 = null;
        field3958 = null;
        field3959 = null;
        field3941 = null;
        if (arg0 <= 89) {
            field3936 = (class119) null;
        }
        field3936 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZ)V", line = 563)
    public static final void method1595(boolean arg0, boolean arg1) {
        field3951++;
        if (class233.field3760 == null) {
            return;
        }
        try {
            if (!arg1) {
                return;
            }
            class3 var2 = new class3(4);
            var2.method32(arg0 ? 2 : 3, (byte) -99);
            var2.method21(0, 1535561064);
            class233.field3760.method1630(0, 4, (byte) -70, var2.field101);
        } catch (IOException var6) {
            try {
                class233.field3760.method1629(-108);
            } catch (Exception var5) {
            }
            class233.field3760 = null;
            class215.field3426++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 593)
    public class244() {
        super(3, false);
    }
}
