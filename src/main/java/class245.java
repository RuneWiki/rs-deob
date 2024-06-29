import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class245 extends class190 {

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "J")
    public long field4249;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Lnh;")
    public static class112 field4251 = new class112(8);

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Lqe;")
    public static class168 field4254 = class66.method448("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -119);

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Lqe;")
    public static class168 field4256 = class66.method448("underlay)3dat", -122);

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "[I")
    public static int[] field4255;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BILrd;)V")
    public static final void method1605(byte arg0, int arg1, class207 arg2) {
        field4245++;
        if (class88.field1370 != null) {
            class88.field1370.field1821 = arg1 * 8 + 5;
            int var3 = class88.field1370.method769((byte) -86);
            int var4 = class88.field1370.method769((byte) -86);
            arg2.method1340((byte) -98, var3, var4);
            return;
        }
        class108.method707(255, (byte) 0, -80, 255, null, true, 0);
        class80.field1210[arg1] = arg2;
        if (arg0 > -100) {
            field4256 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1606(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4252++;
        int var7 = 0;
        class100.method659(arg2, false);
        int var8 = arg2 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = 50 / ((-arg3 - 48) / 34);
        int var10 = arg2;
        int var11 = -arg2;
        int var12 = var8;
        int var13 = -1;
        int var14 = -var8;
        int[] var15 = class241.field4117[arg5];
        int var16 = -1;
        int var17 = arg4 - var8;
        class232.method1501(arg1, arg4 - arg2, (byte) -108, var15, var17);
        int var18 = arg4 + var8;
        class232.method1501(arg0, var17, (byte) -108, var15, var18);
        class232.method1501(arg1, var18, (byte) -108, var15, arg4 + arg2);
        while (var10 > var7) {
            var13 += 2;
            var16 += 2;
            var14 += var16;
            var11 += var13;
            if (var14 >= 0 && var12 >= 1) {
                class238.field4077[var12] = var7;
                var12--;
                var14 -= var12 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var10--;
                var11 -= var10 << 1;
                if (var8 <= var10) {
                    int[] var19 = class241.field4117[arg5 + var10];
                    int var20 = arg4 + var7;
                    int[] var21 = class241.field4117[arg5 - var10];
                    int var22 = arg4 - var7;
                    class232.method1501(arg1, var22, (byte) -108, var19, var20);
                    class232.method1501(arg1, var22, (byte) -108, var21, var20);
                } else {
                    int[] var23 = class241.field4117[arg5 + var10];
                    int[] var24 = class241.field4117[arg5 - var10];
                    int var25 = class238.field4077[var10];
                    int var26 = arg4 - var7;
                    int var27 = arg4 + var7;
                    int var28 = arg4 + var25;
                    int var29 = arg4 - var25;
                    class232.method1501(arg1, var26, (byte) -108, var23, var29);
                    class232.method1501(arg0, var29, (byte) -108, var23, var28);
                    class232.method1501(arg1, var28, (byte) -108, var23, var27);
                    class232.method1501(arg1, var26, (byte) -108, var24, var29);
                    class232.method1501(arg0, var29, (byte) -108, var24, var28);
                    class232.method1501(arg1, var28, (byte) -108, var24, var27);
                }
            }
            int[] var30 = class241.field4117[arg5 + var7];
            int var31 = arg4 - var10;
            int[] var32 = class241.field4117[arg5 - var7];
            int var33 = arg4 + var10;
            if (var7 < var8) {
                int var34 = var7 <= var12 ? var12 : class238.field4077[var7];
                int var35 = arg4 + var34;
                int var36 = arg4 - var34;
                class232.method1501(arg1, var31, (byte) -108, var30, var36);
                class232.method1501(arg0, var36, (byte) -108, var30, var35);
                class232.method1501(arg1, var35, (byte) -108, var30, var33);
                class232.method1501(arg1, var31, (byte) -108, var32, var36);
                class232.method1501(arg0, var36, (byte) -108, var32, var35);
                class232.method1501(arg1, var35, (byte) -108, var32, var33);
            } else {
                class232.method1501(arg1, var31, (byte) -108, var30, var33);
                class232.method1501(arg1, var31, (byte) -108, var32, var33);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIILkb;)V")
    public static final void method1607(int arg0, int arg1, int arg2, int arg3, class70 arg4) {
        field4248++;
        if (arg0 != 128) {
            field4251 = null;
        }
        for (class185 var5 = (class185) class165.field2811.method315(-31594); var5 != null; var5 = (class185) class165.field2811.method312(1012)) {
            if (var5.field3247 == arg3 && arg2 * 128 == var5.field3257 && arg1 * 128 == var5.field3254 && var5.field3244.field1073 == arg4.field1073) {
                if (var5.field3266 != null) {
                    class86.field1341.method509(var5.field3266);
                    var5.field3266 = null;
                }
                if (var5.field3250 != null) {
                    class86.field1341.method509(var5.field3250);
                    var5.field3250 = null;
                }
                var5.method1234(arg0 + 17088);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public static final void method1608(int arg0) {
        field4253++;
        if (arg0 > -3) {
            field4254 = null;
        }
        class253.field4376++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIBIIZIII)Z")
    public static final boolean method1609(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field4250++;
        if (arg5 >= -51) {
            field4251 = null;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class58.field804[var12][var31] = 0;
                class200.field3456[var12][var31] = 99999999;
            }
        }
        class58.field804[arg7][arg10] = 99;
        int var13 = arg7;
        class200.field3456[arg7][arg10] = 0;
        int var14 = arg10;
        int var15 = 0;
        byte var16 = 0;
        class126.field2102[var16] = arg7;
        int var32 = var16 + 1;
        class166.field2825[var16] = arg10;
        int[][] var17 = class169.field2951[class196.field3401].field731;
        boolean var18 = false;
        while (var15 != var32) {
            var14 = class166.field2825[var15];
            var13 = class126.field2102[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg0 == var13 && arg4 == var14) {
                var18 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class169.field2951[class196.field3401].method363(var13, arg4, arg9 - 1, 100, var14, arg3, arg0, 2)) {
                    var18 = true;
                    break;
                }
                if (arg9 < 10 && class169.field2951[class196.field3401].method370(var13, 2, arg0, (byte) -63, arg4, arg3, arg9 - 1, var14)) {
                    var18 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg1 != 0 && class169.field2951[class196.field3401].method377(arg1, var14, arg4, arg6, var13, arg0, arg2, 2, 101)) {
                var18 = true;
                break;
            }
            int var30 = class200.field3456[var13][var14] + 1;
            if (var13 > 0 && class58.field804[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C010E) == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class126.field2102[var32] = var13 - 1;
                class166.field2825[var32] = var14;
                class58.field804[var13 - 1][var14] = 2;
                class200.field3456[var13 - 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && class58.field804[var13 + 1][var14] == 0 && (var17[var13 + 2][var14] & 0x12C0183) == 0 && (var17[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class126.field2102[var32] = var13 + 1;
                class166.field2825[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class58.field804[var13 + 1][var14] = 8;
                class200.field3456[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class58.field804[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C010E) == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class126.field2102[var32] = var13;
                class166.field2825[var32] = var14 - 1;
                class58.field804[var13][var14 - 1] = 1;
                class200.field3456[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class58.field804[var13][var14 + 1] == 0 && (var17[var13][var14 + 2] & 0x12C0138) == 0 && (var17[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class126.field2102[var32] = var13;
                class166.field2825[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class58.field804[var13][var14 + 1] = 4;
                class200.field3456[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class58.field804[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14] & 0x12C0138) == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13][var14 - 1] & 0x12C0183) == 0) {
                class126.field2102[var32] = var13 - 1;
                class166.field2825[var32] = var14 - 1;
                class58.field804[var13 - 1][var14 - 1] = 3;
                class200.field3456[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 > 0 && class58.field804[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 2][var14] & 0x12C01E0) == 0) {
                class126.field2102[var32] = var13 + 1;
                class166.field2825[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class58.field804[var13 + 1][var14 - 1] = 9;
                class200.field3456[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class58.field804[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var17[var13][var14 + 2] & 0x12C01E0) == 0) {
                class126.field2102[var32] = var13 - 1;
                class166.field2825[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class58.field804[var13 - 1][var14 + 1] = 6;
                class200.field3456[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class58.field804[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var17[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var17[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class126.field2102[var32] = var13 + 1;
                class166.field2825[var32] = var14 + 1;
                class58.field804[var13 + 1][var14 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class200.field3456[var13 + 1][var14 + 1] = var30;
            }
        }
        class187.field3286 = 0;
        if (!var18) {
            if (!arg8) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg0 - var21; var22 <= arg0 + var21; var22++) {
                for (int var23 = arg4 - var21; var23 <= arg4 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class200.field3456[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg0 > var22) {
                            var24 = arg0 - var22;
                        } else if (arg0 + arg6 - 1 < var22) {
                            var24 = var22 + 1 - arg0 - arg6;
                        }
                        if (arg4 > var23) {
                            var25 = arg4 - var23;
                        } else if (var23 > arg1 + arg4 - 1) {
                            var25 = var23 + 1 - arg4 - arg1;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && var20 > class200.field3456[var22][var23]) {
                            var14 = var23;
                            var20 = class200.field3456[var22][var23];
                            var19 = var26;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg7 == var13 && arg10 == var14) {
                return false;
            }
            class187.field3286 = 1;
        }
        byte var27 = 0;
        class126.field2102[var27] = var13;
        int var33 = var27 + 1;
        class166.field2825[var27] = var14;
        int var28;
        int var29 = var28 = class58.field804[var13][var14];
        while (arg7 != var13 || arg10 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class126.field2102[var33] = var13;
                class166.field2825[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class58.field804[var13][var14];
        }
        if (var33 > 0) {
            class76.method514(arg11, (byte) 120, var33);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
    public static void method1610(byte arg0) {
        field4255 = null;
        int var1 = 1 / ((arg0 + 82) / 44);
        field4254 = null;
        field4251 = null;
        field4256 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class245() {
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(J)V")
    public class245(long arg0) {
        this.field4249 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)I")
    public static final int method1611(byte arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field4247++;
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg0 == -47 ? arg2 : 6;
    }
}
