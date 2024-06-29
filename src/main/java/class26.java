import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lr;")
    private static class118 field633 = class153.method1136(98, "flash3:");

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lr;")
    public static class118 field636 = field633;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lr;")
    public static class118 field632 = field633;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field631 = 0;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lr;")
    public static class118 field638 = class153.method1136(98, "k");

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "[I")
    public static int[] field639 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILwa;ILsc;IIIIB)V")
    public static final void method227(int arg0, class154 arg1, int arg2, class128 arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field640++;
        if (class68.field1582 && (class33.field830[0][arg6][arg0] & 0x2) == 0) {
            if ((class33.field830[arg2][arg6][arg0] & 0x10) != 0) {
                return;
            }
            if (class31.method266((byte) -79, arg2, arg6, arg0) != class62.field1441) {
                return;
            }
        }
        if (class39.field944 > arg2) {
            class39.field944 = arg2;
        }
        if (arg8 <= 74) {
            field639 = null;
        }
        class148 var9 = class47.method396(117, arg5);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var11 = var9.field3287;
            var10 = var9.field3279;
        } else {
            var10 = var9.field3287;
            var11 = var9.field3279;
        }
        int var12;
        int var13;
        if (arg6 + var11 <= 104) {
            var12 = (var11 + 1 >> 1) + arg6;
            var13 = arg6 + (var11 >> 1);
        } else {
            var13 = arg6;
            var12 = arg6 + 1;
        }
        int var14;
        int var15;
        if (arg0 + var10 > 104) {
            var14 = arg0;
            var15 = arg0 + 1;
        } else {
            var14 = (var10 >> 1) + arg0;
            var15 = (var10 + 1 >> 1) + arg0;
        }
        int[][] var16 = class72.field1668[arg2];
        int var17 = var16[var13][var14] + var16[var13][var15] + var16[var12][var14] + var16[var12][var15] >> 2;
        int var18 = (arg6 << 7) + (var11 << 6);
        int var19 = (arg0 << 7) + (var10 << 6);
        int var20 = (arg5 << 14) + (arg0 << 7) + arg6 + 1073741824;
        if (var9.field3302 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg7;
        if (var9.field3292 == 1) {
            var21 += 256;
        }
        if (var9.method1078(-16)) {
            class45.method379(arg6, var9, arg4, 128, arg0, arg2);
        }
        if (arg7 == 22) {
            if (!class68.field1582 || var9.field3302 != 0 || var9.field3297 == 1 || var9.field3276) {
                class89 var22;
                if (var9.field3324 == -1 && var9.field3310 == null) {
                    var22 = var9.method1090(var18, var19, 22, -105, arg4, var17, var16);
                } else {
                    var22 = new class157(arg5, 22, arg4, arg2, arg6, arg0, var9.field3324, true, null);
                }
                arg1.method1155(arg2, arg6, arg0, var17, var22, var20, var21);
                if (var9.field3297 == 1 && arg3 != null) {
                    arg3.method989(arg6, arg0, -1);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class89 var45;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var45 = var9.method1090(var18, var19, 10, -92, arg4, var17, var16);
            } else {
                var45 = new class157(arg5, 10, arg4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            if (var45 != null && arg1.method1175(arg2, arg6, arg0, var17, var11, var10, var45, arg7 == 11 ? 256 : 0, var20, var21) && var9.field3334) {
                int var46 = 15;
                if (var45 instanceof class155) {
                    var46 = ((class155) var45).method1207() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var11; var47++) {
                    for (int var48 = 0; var48 <= var10; var48++) {
                        if (class22.field541[arg2][arg6 + var47][arg0 + var48] < var46) {
                            class22.field541[arg2][arg6 + var47][arg0 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field3297 != 0 && arg3 != null) {
                arg3.method998(arg0, var10, var11, arg6, var9.field3278, -2);
            }
        } else if (arg7 >= 12) {
            class89 var23;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var23 = var9.method1090(var18, var19, arg7, -103, arg4, var17, var16);
            } else {
                var23 = new class157(arg5, arg7, arg4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1175(arg2, arg6, arg0, var17, 1, 1, var23, 0, var20, var21);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
                class68.field1564[arg2][arg6][arg0] = class19.method178(class68.field1564[arg2][arg6][arg0], 2340);
            }
            if (var9.field3297 != 0 && arg3 != null) {
                arg3.method998(arg0, var10, var11, arg6, var9.field3278, -2);
            }
        } else if (arg7 == 0) {
            class89 var24;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var24 = var9.method1090(var18, var19, 0, -111, arg4, var17, var16);
            } else {
                var24 = new class157(arg5, 0, arg4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1177(arg2, arg6, arg0, var17, var24, null, class134.field3056[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field3334) {
                    class22.field541[arg2][arg6][arg0] = 50;
                    class22.field541[arg2][arg6][arg0 + 1] = 50;
                }
                if (var9.field3271) {
                    class68.field1564[arg2][arg6][arg0] = class19.method178(class68.field1564[arg2][arg6][arg0], 585);
                }
            } else if (arg4 == 1) {
                if (var9.field3334) {
                    class22.field541[arg2][arg6][arg0 + 1] = 50;
                    class22.field541[arg2][arg6 + 1][arg0 + 1] = 50;
                }
                if (var9.field3271) {
                    class68.field1564[arg2][arg6][arg0 + 1] = class19.method178(class68.field1564[arg2][arg6][arg0 + 1], 1170);
                }
            } else if (arg4 == 2) {
                if (var9.field3334) {
                    class22.field541[arg2][arg6 + 1][arg0] = 50;
                    class22.field541[arg2][arg6 + 1][arg0 + 1] = 50;
                }
                if (var9.field3271) {
                    class68.field1564[arg2][arg6 + 1][arg0] = class19.method178(class68.field1564[arg2][arg6 + 1][arg0], 585);
                }
            } else if (arg4 == 3) {
                if (var9.field3334) {
                    class22.field541[arg2][arg6][arg0] = 50;
                    class22.field541[arg2][arg6 + 1][arg0] = 50;
                }
                if (var9.field3271) {
                    class68.field1564[arg2][arg6][arg0] = class19.method178(class68.field1564[arg2][arg6][arg0], 1170);
                }
            }
            if (var9.field3297 != 0 && arg3 != null) {
                arg3.method990(118, arg6, var9.field3278, arg4, arg0, arg7);
            }
            if (var9.field3322 != 16) {
                arg1.method1193(arg2, arg6, arg0, var9.field3322);
            }
        } else if (arg7 == 1) {
            class89 var25;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var25 = var9.method1090(var18, var19, 1, -110, arg4, var17, var16);
            } else {
                var25 = new class157(arg5, 1, arg4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1177(arg2, arg6, arg0, var17, var25, null, field639[arg4], 0, var20, var21);
            if (var9.field3334) {
                if (arg4 == 0) {
                    class22.field541[arg2][arg6][arg0 + 1] = 50;
                } else if (arg4 == 1) {
                    class22.field541[arg2][arg6 + 1][arg0 + 1] = 50;
                } else if (arg4 == 2) {
                    class22.field541[arg2][arg6 + 1][arg0] = 50;
                } else if (arg4 == 3) {
                    class22.field541[arg2][arg6][arg0] = 50;
                }
            }
            if (var9.field3297 != 0 && arg3 != null) {
                arg3.method990(116, arg6, var9.field3278, arg4, arg0, arg7);
            }
        } else if (arg7 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class89 var27;
            class89 var28;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var27 = var9.method1090(var18, var19, 2, -102, arg4 + 4, var17, var16);
                var28 = var9.method1090(var18, var19, 2, -107, var26, var17, var16);
            } else {
                var27 = new class157(arg5, 2, arg4 + 4, arg2, arg6, arg0, var9.field3324, true, null);
                var28 = new class157(arg5, 2, var26, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1177(arg2, arg6, arg0, var17, var27, var28, class134.field3056[arg4], class134.field3056[var26], var20, var21);
            if (var9.field3271) {
                if (arg4 == 0) {
                    class68.field1564[arg2][arg6][arg0] = class19.method178(class68.field1564[arg2][arg6][arg0], 585);
                    class68.field1564[arg2][arg6][arg0 + 1] = class19.method178(class68.field1564[arg2][arg6][arg0 + 1], 1170);
                } else if (arg4 == 1) {
                    class68.field1564[arg2][arg6][arg0 + 1] = class19.method178(class68.field1564[arg2][arg6][arg0 + 1], 1170);
                    class68.field1564[arg2][arg6 + 1][arg0] = class19.method178(class68.field1564[arg2][arg6 + 1][arg0], 585);
                } else if (arg4 == 2) {
                    class68.field1564[arg2][arg6 + 1][arg0] = class19.method178(class68.field1564[arg2][arg6 + 1][arg0], 585);
                    class68.field1564[arg2][arg6][arg0] = class19.method178(class68.field1564[arg2][arg6][arg0], 1170);
                } else if (arg4 == 3) {
                    class68.field1564[arg2][arg6][arg0] = class19.method178(class68.field1564[arg2][arg6][arg0], 1170);
                    class68.field1564[arg2][arg6][arg0] = class19.method178(class68.field1564[arg2][arg6][arg0], 585);
                }
            }
            if (var9.field3297 != 0 && arg3 != null) {
                arg3.method990(120, arg6, var9.field3278, arg4, arg0, arg7);
            }
            if (var9.field3322 != 16) {
                arg1.method1193(arg2, arg6, arg0, var9.field3322);
            }
        } else if (arg7 == 3) {
            class89 var29;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var29 = var9.method1090(var18, var19, 3, -122, arg4, var17, var16);
            } else {
                var29 = new class157(arg5, 3, arg4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1177(arg2, arg6, arg0, var17, var29, null, field639[arg4], 0, var20, var21);
            if (var9.field3334) {
                if (arg4 == 0) {
                    class22.field541[arg2][arg6][arg0 + 1] = 50;
                } else if (arg4 == 1) {
                    class22.field541[arg2][arg6 + 1][arg0 + 1] = 50;
                } else if (arg4 == 2) {
                    class22.field541[arg2][arg6 + 1][arg0] = 50;
                } else if (arg4 == 3) {
                    class22.field541[arg2][arg6][arg0] = 50;
                }
            }
            if (var9.field3297 != 0 && arg3 != null) {
                arg3.method990(111, arg6, var9.field3278, arg4, arg0, arg7);
            }
        } else if (arg7 == 9) {
            class89 var30;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var30 = var9.method1090(var18, var19, arg7, -114, arg4, var17, var16);
            } else {
                var30 = new class157(arg5, arg7, arg4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1175(arg2, arg6, arg0, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3297 != 0 && arg3 != null) {
                arg3.method998(arg0, var10, var11, arg6, var9.field3278, -2);
            }
            if (var9.field3322 != 16) {
                arg1.method1193(arg2, arg6, arg0, var9.field3322);
            }
        } else if (arg7 == 4) {
            class89 var31;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var31 = var9.method1090(var18, var19, 4, -110, arg4, var17, var16);
            } else {
                var31 = new class157(arg5, 4, arg4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1179(arg2, arg6, arg0, var17, var31, null, class134.field3056[arg4], 0, 0, 0, var20, var21);
        } else if (arg7 == 5) {
            int var32 = 16;
            int var33 = arg1.method1169(arg2, arg6, arg0);
            if (var33 != 0) {
                var32 = class47.method396(117, var33 >> 14 & 0x7FFF).field3322;
            }
            class89 var34;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var34 = var9.method1090(var18, var19, 4, -101, arg4, var17, var16);
            } else {
                var34 = new class157(arg5, 4, arg4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1179(arg2, arg6, arg0, var17, var34, null, class134.field3056[arg4], 0, class114.field2661[arg4] * var32, class113.field2642[arg4] * var32, var20, var21);
        } else if (arg7 == 6) {
            int var35 = arg1.method1169(arg2, arg6, arg0);
            int var36 = 8;
            if (var35 != 0) {
                var36 = class47.method396(117, var35 >> 14 & 0x7FFF).field3322 / 2;
            }
            class89 var37;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var37 = var9.method1090(var18, var19, 4, -128, arg4 + 4, var17, var16);
            } else {
                var37 = new class157(arg5, 4, arg4 + 4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1179(arg2, arg6, arg0, var17, var37, null, 256, arg4, class32.field825[arg4] * var36, class84.field2012[arg4] * var36, var20, var21);
        } else if (arg7 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class89 var39;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var39 = var9.method1090(var18, var19, 4, -119, var38 + 4, var17, var16);
            } else {
                var39 = new class157(arg5, 4, var38 + 4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1179(arg2, arg6, arg0, var17, var39, null, 256, var38, 0, 0, var20, var21);
        } else if (arg7 == 8) {
            int var40 = 8;
            int var41 = arg1.method1169(arg2, arg6, arg0);
            if (var41 != 0) {
                var40 = class47.method396(117, var41 >> 14 & 0x7FFF).field3322 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class89 var43;
            class89 var44;
            if (var9.field3324 == -1 && var9.field3310 == null) {
                var43 = var9.method1090(var18, var19, 4, -109, arg4 + 4, var17, var16);
                var44 = var9.method1090(var18, var19, 4, -128, var42 + 4, var17, var16);
            } else {
                var43 = new class157(arg5, 4, arg4 + 4, arg2, arg6, arg0, var9.field3324, true, null);
                var44 = new class157(arg5, 4, var42 + 4, arg2, arg6, arg0, var9.field3324, true, null);
            }
            arg1.method1179(arg2, arg6, arg0, var17, var43, var44, 256, arg4, class32.field825[arg4] * var40, class84.field2012[arg4] * var40, var20, var21);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BIBI)Lr;")
    public static final class118 method228(byte[] arg0, int arg1, byte arg2, int arg3) {
        field627++;
        class118 var4 = new class118();
        if (arg2 != 76) {
            method230(null, null, null, false);
        }
        var4.field2743 = 0;
        var4.field2746 = new byte[arg1];
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field2746[var4.field2743++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILff;IB)[Lvd;")
    public static final class150[] method229(int arg0, class42 arg1, int arg2, byte arg3) {
        field628++;
        if (arg3 != -75) {
            field633 = null;
        }
        return class9.method75(arg2, 1286850920, arg1, arg0) ? class95.method745(arg3 + 675) : null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lr;Lr;Lr;Z)V")
    public static final void method230(class118 arg0, class118 arg1, class118 arg2, boolean arg3) {
        class132.field3024 = arg1;
        class132.field3026 = arg2;
        field630++;
        class132.field3025 = arg0;
        if (!arg3) {
            field635 = 25;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method231(byte arg0) {
        field632 = null;
        field636 = null;
        field633 = null;
        field638 = null;
        if (arg0 <= -9) {
            field639 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLke;)V")
    public static final void method232(byte arg0, class74 arg1) {
        if (arg0 > 48) {
            field629++;
            if (class144.field3243 == arg1.field1749) {
                class54.field1274[arg1.field1752] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLpa;)V")
    public static final void method233(byte arg0, class105 arg1) {
        if (arg0 != -33) {
            field636 = null;
        }
        field634++;
        byte[] var2 = new byte[24];
        if (class91.field2187 != null) {
            try {
                class91.field2187.method67(-1, 0L);
                class91.field2187.method63((byte) -27, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method844(24, var2, (byte) -14, 0);
    }
}
