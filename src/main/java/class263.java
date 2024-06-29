import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class263 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    public static int[] field4299 = new int[4];

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lrg;")
    public static class248 field4304 = null;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4305 = " has logged in.";

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4298 = "Loaded sprites";

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
    public static int[] field4306 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "[I")
    public static int[] field4309 = new int[128];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
    public static int[] field4302;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)[Le;")
    public static final class67[] method1770(int arg0) {
        field4301++;
        class67[] var1 = new class67[class98.field1559];
        for (int var2 = arg0; var2 < class98.field1559; var2++) {
            byte[] var3 = class232.field3635[var2];
            int var4 = class217.field3413[var2] * class140.field2284[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class310.field5024[class233.method1609(var3[var6], 255)];
            }
            var1[var2] = new class67(class14.field295, class13.field272, class80.field1286[var2], class211.field3364[var2], class217.field3413[var2], class140.field2284[var2], var5);
        }
        class180.method1265(34);
        return var1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
    public static final void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4303++;
        for (class273 var5 = (class273) class203.field3282.method1553(true); var5 != null; var5 = (class273) class203.field3282.method1551(0)) {
            class224.method1557(arg0, arg2, var5, arg3, false, arg4);
        }
        if (arg1 != 3) {
            field4309 = null;
        }
        for (class273 var6 = (class273) class66.field1071.method1553(true); var6 != null; var6 = (class273) class66.field1071.method1551(0)) {
            byte var11 = 1;
            class254 var12 = var6.field4417.method403((byte) 124);
            if (var6.field4417.field947 == var12.field4180) {
                var11 = 0;
            } else if (var6.field4417.field947 == var12.field4183 || var6.field4417.field947 == var12.field4174 || var6.field4417.field947 == var12.field4196 || var6.field4417.field947 == var12.field4195) {
                var11 = 2;
            } else if (var6.field4417.field947 == var12.field4176 || var6.field4417.field947 == var12.field4194 || var6.field4417.field947 == var12.field4175 || var6.field4417.field947 == var12.field4168) {
                var11 = 3;
            }
            if (var6.field4416 != var11) {
                int var13 = class92.method644((byte) 120, var6.field4417);
                if (var6.field4418 != var13) {
                    if (var6.field4413 != null) {
                        class89.field1397.method1357(var6.field4413);
                        var6.field4413 = null;
                    }
                    var6.field4418 = var13;
                }
                var6.field4416 = var11;
            }
            var6.field4410 = var6.field4417.field994;
            var6.field4400 = var6.field4417.field994 + var6.field4417.method101(false) * 64;
            var6.field4394 = var6.field4417.field929;
            var6.field4397 = var6.field4417.field929 + (var6.field4417.method101(false) * 64);
            class224.method1557(arg0, arg2, var6, arg3, false, arg4);
        }
        for (class273 var7 = (class273) class33.field546.method379(-21146); var7 != null; var7 = (class273) class33.field546.method369(true)) {
            byte var8 = 1;
            class254 var9 = var7.field4414.method403((byte) 46);
            if (var7.field4414.field947 == var9.field4180) {
                var8 = 0;
            } else if (var7.field4414.field947 == var9.field4183 || var7.field4414.field947 == var9.field4174 || var7.field4414.field947 == var9.field4196 || var7.field4414.field947 == var9.field4195) {
                var8 = 2;
            } else if (var7.field4414.field947 == var9.field4176 || var7.field4414.field947 == var9.field4194 || var7.field4414.field947 == var9.field4175 || var7.field4414.field947 == var9.field4168) {
                var8 = 3;
            }
            if (var7.field4416 != var8) {
                int var10 = class83.method595((byte) -29, var7.field4414);
                if (var7.field4418 != var10) {
                    if (var7.field4413 != null) {
                        class89.field1397.method1357(var7.field4413);
                        var7.field4413 = null;
                    }
                    var7.field4418 = var10;
                }
                var7.field4416 = var8;
            }
            var7.field4410 = var7.field4414.field994;
            var7.field4400 = var7.field4414.field994 + var7.field4414.method101(false) * 64;
            var7.field4394 = var7.field4414.field929;
            var7.field4397 = var7.field4414.field929 + (var7.field4414.method101(false) * 64);
            class224.method1557(arg0, arg2, var7, arg3, false, arg4);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static final void method1772(int arg0) {
        field4300++;
        class200.field3201++;
        if (arg0 != 4) {
            method1776((byte) 7);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1773(int arg0, long arg1) {
        if (arg0 == -5) {
            field4296++;
            return class177.method1247(-16702, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lae;I)V")
    public static final void method1774(class180 arg0, int arg1) {
        field4308++;
        if (arg1 != -1) {
            method1772(57);
        }
        class162.field2646 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIZIIIZIILkb;I)V")
    public static final void method1775(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class55 arg9, int arg10) {
        field4295++;
        if (arg6 && !class143.method981(22351) && (class214.field3386[0][arg10][arg5] & 0x2) == 0) {
            if ((class214.field3386[arg0][arg10][arg5] & 0x10) != 0) {
                return;
            }
            if (class250.method1703(arg0, false, arg5, arg10) != class87.field1367) {
                return;
            }
        }
        if (arg0 < class272.field4390) {
            class272.field4390 = arg0;
        }
        if (arg3 <= 54) {
            field4304 = null;
        }
        class172 var11 = class49.method319(arg1, 0);
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var13 = var11.field2821;
            var12 = var11.field2809;
        } else {
            var12 = var11.field2821;
            var13 = var11.field2809;
        }
        int[][] var14 = class166.field2746[arg4];
        int var15;
        int var16;
        if ((arg5 + var13) > 104) {
            var15 = arg5;
            var16 = arg5 + 1;
        } else {
            var16 = (var13 + 1 >> 1) + arg5;
            var15 = (var13 >> 1) + arg5;
        }
        int var17;
        int var18;
        if (arg10 + var12 <= 104) {
            var17 = (var12 >> 1) + arg10;
            var18 = arg10 + (var12 + 1 >> 1);
        } else {
            var18 = arg10 + 1;
            var17 = arg10;
        }
        int var19 = (arg10 << 7) + (var12 << 6);
        int var20 = var14[var18][var15] + var14[var17][var16] + var14[var17][var15] + var14[var18][var16] >> 2;
        int[][] var21 = null;
        int var22 = (arg5 << 7) + (var13 << 6);
        if (arg2) {
            var21 = class300.field4915[0];
        } else if (arg4 < 3) {
            var21 = class166.field2746[arg4 + 1];
        }
        long var23 = (long) (arg7 << 20 | arg8 << 14 | arg10 | arg5 << 7 | 0x40000000);
        if (var11.field2808 == 0 || arg2) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field2860 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field2818) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg1 << 32;
        if (var11.method1225(0)) {
            class29.method231(-19232, (class104) null, arg10, (class12) null, arg5, arg0, var11, arg7);
        }
        boolean var27 = !arg2 & var11.field2884;
        if (arg8 == 22) {
            if (class296.field4835 || var11.field2808 != 0 || var11.field2861 == 1 || var11.field2883) {
                class34 var29;
                if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                    class193 var28 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7, 121, 22, var27);
                    var29 = var28.field3149;
                } else {
                    var29 = new class234(arg1, 22, arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
                }
                class232.method1606(arg0, arg10, arg5, var20, var29, var25, var11.field2806);
                if (var11.field2861 == 1 && arg9 != null) {
                    arg9.method351(121, arg5, arg10);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class34 var69;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var68 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg8 == 11 ? arg7 + 4 : arg7, 84, 10, var27);
                var69 = var68.field3149;
            } else {
                var69 = new class234(arg1, 10, arg8 == 11 ? arg7 + 4 : arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            if (var69 != null) {
                boolean var70 = class109.method766(arg0, arg10, arg5, var20, var12, var13, var69, 0, var25);
                if (var11.field2848 && var70 && arg6) {
                    int var71 = 15;
                    if (var69 instanceof class32) {
                        var71 = ((class32) var69).method36() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (var71 > class255.field4213[arg0][arg10 + var72][arg5 + var73]) {
                                class255.field4213[arg0][arg10 + var72][arg5 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field2861 != 0 && arg9 != null) {
                arg9.method354(arg10, var11.field2828, (byte) 54, var12, arg5, !var11.field2867, var13);
            }
        } else if (arg8 >= 12) {
            class34 var31;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var30 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7, -100, arg8, var27);
                var31 = var30.field3149;
            } else {
                var31 = new class234(arg1, arg8, arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class109.method766(arg0, arg10, arg5, var20, 1, 1, var31, 0, var25);
            if (arg6 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg0 > 0 && var11.field2853 != 0) {
                class44.field657[arg0][arg10][arg5] = class76.method555(class44.field657[arg0][arg10][arg5], 4);
            }
            if (var11.field2861 != 0 && arg9 != null) {
                arg9.method354(arg10, var11.field2828, (byte) -107, var12, arg5, !var11.field2867, var13);
            }
        } else if (arg8 == 0) {
            class34 var33;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var32 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7, -122, 0, var27);
                var33 = var32.field3149;
            } else {
                var33 = new class234(arg1, 0, arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class166.method1183(arg0, arg10, arg5, var20, var33, (class34) null, class237.field3723[arg7], 0, var25);
            if (arg6) {
                if (arg7 == 0) {
                    if (var11.field2848) {
                        class255.field4213[arg0][arg10][arg5] = 50;
                        class255.field4213[arg0][arg10][arg5 + 1] = 50;
                    }
                    if (var11.field2853 == 1) {
                        class44.field657[arg0][arg10][arg5] = class76.method555(class44.field657[arg0][arg10][arg5], 1);
                    }
                } else if (arg7 == 1) {
                    if (var11.field2848) {
                        class255.field4213[arg0][arg10][arg5 + 1] = 50;
                        class255.field4213[arg0][arg10 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field2853 == 1) {
                        class44.field657[arg0][arg10][arg5 + 1] = class76.method555(class44.field657[arg0][arg10][arg5 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var11.field2848) {
                        class255.field4213[arg0][arg10 + 1][arg5] = 50;
                        class255.field4213[arg0][arg10 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field2853 == 1) {
                        class44.field657[arg0][arg10 + 1][arg5] = class76.method555(class44.field657[arg0][arg10 + 1][arg5], 1);
                    }
                } else if (arg7 == 3) {
                    if (var11.field2848) {
                        class255.field4213[arg0][arg10][arg5] = 50;
                        class255.field4213[arg0][arg10 + 1][arg5] = 50;
                    }
                    if (var11.field2853 == 1) {
                        class44.field657[arg0][arg10][arg5] = class76.method555(class44.field657[arg0][arg10][arg5], 2);
                    }
                }
            }
            if (var11.field2861 != 0 && arg9 != null) {
                arg9.method358(var11.field2828, !var11.field2867, arg5, 2883848, arg7, arg10, arg8);
            }
            if (var11.field2840 != 16) {
                class62.method401(arg0, arg10, arg5, var11.field2840);
            }
        } else if (arg8 == 1) {
            class34 var35;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var34 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7, 29, 1, var27);
                var35 = var34.field3149;
            } else {
                var35 = new class234(arg1, 1, arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class166.method1183(arg0, arg10, arg5, var20, var35, (class34) null, class70.field1123[arg7], 0, var25);
            if (var11.field2848 && arg6) {
                if (arg7 == 0) {
                    class255.field4213[arg0][arg10][arg5 + 1] = 50;
                } else if (arg7 == 1) {
                    class255.field4213[arg0][arg10 + 1][arg5 + 1] = 50;
                } else if (arg7 == 2) {
                    class255.field4213[arg0][arg10 + 1][arg5] = 50;
                } else if (arg7 == 3) {
                    class255.field4213[arg0][arg10][arg5] = 50;
                }
            }
            if (var11.field2861 != 0 && arg9 != null) {
                arg9.method358(var11.field2828, !var11.field2867, arg5, 2883848, arg7, arg10, arg8);
            }
        } else if (arg8 == 2) {
            int var36 = arg7 + 1 & 0x3;
            class34 var38;
            class34 var40;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var37 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7 + 4, 87, 2, var27);
                var38 = var37.field3149;
                class193 var39 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, var36, 71, 2, var27);
                var40 = var39.field3149;
            } else {
                var38 = new class234(arg1, 2, arg7 + 4, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
                var40 = new class234(arg1, 2, var36, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class166.method1183(arg0, arg10, arg5, var20, var38, var40, class237.field3723[arg7], class237.field3723[var36], var25);
            if (var11.field2853 == 1 && arg6) {
                if (arg7 == 0) {
                    class44.field657[arg0][arg10][arg5] = class76.method555(class44.field657[arg0][arg10][arg5], 1);
                    class44.field657[arg0][arg10][arg5 + 1] = class76.method555(class44.field657[arg0][arg10][arg5 + 1], 2);
                } else if (arg7 == 1) {
                    class44.field657[arg0][arg10][arg5 + 1] = class76.method555(class44.field657[arg0][arg10][arg5 + 1], 2);
                    class44.field657[arg0][arg10 + 1][arg5] = class76.method555(class44.field657[arg0][arg10 + 1][arg5], 1);
                } else if (arg7 == 2) {
                    class44.field657[arg0][arg10 + 1][arg5] = class76.method555(class44.field657[arg0][arg10 + 1][arg5], 1);
                    class44.field657[arg0][arg10][arg5] = class76.method555(class44.field657[arg0][arg10][arg5], 2);
                } else if (arg7 == 3) {
                    class44.field657[arg0][arg10][arg5] = class76.method555(class44.field657[arg0][arg10][arg5], 2);
                    class44.field657[arg0][arg10][arg5] = class76.method555(class44.field657[arg0][arg10][arg5], 1);
                }
            }
            if (var11.field2861 != 0 && arg9 != null) {
                arg9.method358(var11.field2828, !var11.field2867, arg5, 2883848, arg7, arg10, arg8);
            }
            if (var11.field2840 != 16) {
                class62.method401(arg0, arg10, arg5, var11.field2840);
            }
        } else if (arg8 == 3) {
            class34 var42;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var41 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7, 38, 3, var27);
                var42 = var41.field3149;
            } else {
                var42 = new class234(arg1, 3, arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class166.method1183(arg0, arg10, arg5, var20, var42, (class34) null, class70.field1123[arg7], 0, var25);
            if (var11.field2848 && arg6) {
                if (arg7 == 0) {
                    class255.field4213[arg0][arg10][arg5 + 1] = 50;
                } else if (arg7 == 1) {
                    class255.field4213[arg0][arg10 + 1][arg5 + 1] = 50;
                } else if (arg7 == 2) {
                    class255.field4213[arg0][arg10 + 1][arg5] = 50;
                } else if (arg7 == 3) {
                    class255.field4213[arg0][arg10][arg5] = 50;
                }
            }
            if (var11.field2861 != 0 && arg9 != null) {
                arg9.method358(var11.field2828, !var11.field2867, arg5, 2883848, arg7, arg10, arg8);
            }
        } else if (arg8 == 9) {
            class34 var44;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var43 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7, 35, arg8, var27);
                var44 = var43.field3149;
            } else {
                var44 = new class234(arg1, arg8, arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class109.method766(arg0, arg10, arg5, var20, 1, 1, var44, 0, var25);
            if (var11.field2861 != 0 && arg9 != null) {
                arg9.method354(arg10, var11.field2828, (byte) 103, var12, arg5, !var11.field2867, var13);
            }
            if (var11.field2840 != 16) {
                class62.method401(arg0, arg10, arg5, var11.field2840);
            }
        } else if (arg8 == 4) {
            class34 var46;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var45 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7, 25, 4, var27);
                var46 = var45.field3149;
            } else {
                var46 = new class234(arg1, 4, arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class138.method953(arg0, arg10, arg5, var20, var46, (class34) null, class237.field3723[arg7], 0, 0, 0, var25);
        } else if (arg8 == 5) {
            long var47 = class180.method1266(arg0, arg10, arg5);
            int var49 = 16;
            if (var47 != 0L) {
                var49 = class49.method319((int) (var47 >>> 32) & Integer.MAX_VALUE, 0).field2840;
            }
            class34 var51;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var50 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7, 28, 4, var27);
                var51 = var50.field3149;
            } else {
                var51 = new class234(arg1, 4, arg7, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class138.method953(arg0, arg10, arg5, var20, var51, (class34) null, class237.field3723[arg7], 0, class64.field1041[arg7] * var49, class33.field541[arg7] * var49, var25);
        } else if (arg8 == 6) {
            int var52 = 8;
            long var53 = class180.method1266(arg0, arg10, arg5);
            if (var53 != 0L) {
                var52 = class49.method319((int) (var53 >>> 32) & Integer.MAX_VALUE, 0).field2840 / 2;
            }
            class34 var56;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var55 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7 + 4, -100, 4, var27);
                var56 = var55.field3149;
            } else {
                var56 = new class234(arg1, 4, arg7 + 4, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class138.method953(arg0, arg10, arg5, var20, var56, (class34) null, 256, arg7, class44.field655[arg7] * var52, class58.field847[arg7] * var52, var25);
        } else if (arg8 == 7) {
            int var57 = arg7 + 2 & 0x3;
            class34 var59;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var58 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, var57 + 4, 80, 4, var27);
                var59 = var58.field3149;
            } else {
                var59 = new class234(arg1, 4, var57 + 4, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class138.method953(arg0, arg10, arg5, var20, var59, (class34) null, 256, var57, 0, 0, var25);
        } else if (arg8 == 8) {
            int var60 = 8;
            long var61 = class180.method1266(arg0, arg10, arg5);
            if (var61 != 0L) {
                var60 = class49.method319((int) (var61 >>> 32) & Integer.MAX_VALUE, 0).field2840 / 2;
            }
            int var63 = arg7 + 2 & 0x3;
            class34 var65;
            class34 var67;
            if (var11.field2805 == -1 && var11.field2823 == null && var11.field2846 == null && !var11.field2838) {
                class193 var64 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, arg7 + 4, 122, 4, var27);
                var65 = var64.field3149;
                class193 var66 = var11.method1224(var20, var14, (class2) null, var21, var19, arg6, var22, var63 + 4, -117, 4, var27);
                var67 = var66.field3149;
            } else {
                var65 = new class234(arg1, 4, arg7 + 4, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
                var67 = new class234(arg1, 4, var63 + 4, arg4, arg10, arg5, -1, var11.field2855, (class34) null);
            }
            class138.method953(arg0, arg10, arg5, var20, var65, var67, 256, arg7, class44.field655[arg7] * var60, class58.field847[arg7] * var60, var25);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILhl;)Lhl;")
    public abstract class41 method289(int arg0, class41 arg1);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method1776(byte arg0) {
        field4299 = null;
        field4305 = null;
        field4304 = null;
        if (arg0 >= 115) {
            field4302 = null;
            field4306 = null;
            field4298 = null;
            field4309 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V")
    public static final void method1777(int arg0, boolean arg1) {
        field4307++;
        byte[][] var2 = class197.field3176;
        byte var3 = 4;
        int var4 = 0;
        int var5 = -69 % ((arg0 - 31) / 52);
        while (var4 < var3) {
            class243.method1653(false);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class290.field4757[var4][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0xFFD282) >> 14;
                            int var11 = var8 >> 1 & 0x3;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class122.field1938.length; var14++) {
                                if (class122.field1938[var14] == var13 && var2[var14] != null) {
                                    class54.method336(class310.field5021, var7 * 8, var6 * 8, 19, var4, arg1, (var10 & 0x7) * 8, var11, var2[var14], (var12 & 0x7) * 8, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }
}
