import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class85 extends class137 {

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field1327 = 0;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Ltl;")
    private static class59 field1339 = method639("Loaded config", 9588);

    @OriginalMember(owner = "client!li", name = "z", descriptor = "Ltl;")
    public static class59 field1329 = field1339;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Z")
    public static boolean field1336 = false;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Ltl;")
    public class59 field1328;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "[I")
    public int[] field1325;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[I")
    public int[] field1330;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
    public int[] field1338;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "[I")
    public int[] field1341;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I", line = 6)
    public final int method633(int arg0, int arg1) {
        field1326++;
        if (this.field1330 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != 1) {
            method643(-39, (class263) null, -99);
        }
        while (this.field1330.length > var3) {
            if (this.field1338[var3] == arg1) {
                return this.field1330[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V", line = 41)
    public final void method634(byte arg0) {
        if (this.field1330 != null) {
            for (int var2 = 0; var2 < this.field1330.length; var2++) {
                this.field1330[var2] = class239.method1677(this.field1330[var2], 32768);
            }
        }
        if (this.field1341 != null) {
            for (int var3 = 0; var3 < this.field1341.length; var3++) {
                this.field1341[var3] = class239.method1677(this.field1341[var3], 32768);
            }
        }
        field1335++;
        if (arg0 != 72) {
            field1336 = true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ldl;IIIIBIIZZI)V", line = 86)
    public static final void method635(class30 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, boolean arg8, boolean arg9, int arg10) {
        field1342++;
        if (arg8 && !class125.method922((byte) -128) && (class308.field5219[0][arg4][arg3] & 0x2) == 0) {
            if ((class308.field5219[arg7][arg4][arg3] & 0x10) != 0) {
                return;
            }
            if (class311.method2149(arg4, 72, arg7, arg3) != class291.field4986) {
                return;
            }
        }
        if (class198.field3270 > arg7) {
            class198.field3270 = arg7;
        }
        class180 var11 = class188.method1390(arg6, false);
        if (class55.field815 && var11.field2960) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var12 = var11.field3006;
            var13 = var11.field2976;
        } else {
            var12 = var11.field2976;
            var13 = var11.field3006;
        }
        int var14;
        int var15;
        if (arg4 + var13 > 104) {
            var14 = arg4;
            var15 = arg4 + 1;
        } else {
            var15 = (var13 + 1 >> 1) + arg4;
            var14 = (var13 >> 1) + arg4;
        }
        int var16;
        int var17;
        if (arg3 + var12 <= 104) {
            var16 = (var12 + 1 >> 1) + arg3;
            var17 = (var12 >> 1) + arg3;
        } else {
            var17 = arg3;
            var16 = arg3 + 1;
        }
        if (arg5 != 58) {
            method641((byte) 115);
        }
        int var18 = (arg4 << 7) + (var13 << 6);
        int var19 = 0;
        int[][] var20 = class97.field1558[arg10];
        int var21 = var20[var14][var16] + var20[var14][var17] + var20[var15][var16] + var20[var15][var17] >> 2;
        int var22 = (arg3 << 7) + (var12 << 6);
        if (class55.field815 && arg10 != 0) {
            int[][] var23 = class97.field1558[0];
            var19 = var21 - (var23[var14][var16] + var23[var15][var17] + var23[var14][var17] + var23[var15][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg1 | 0x400 << 20 | arg2 << 14 | arg4 | arg3 << 7);
        if (arg9) {
            var24 = class239.field3993[0];
        } else if (arg10 < 3) {
            var24 = class97.field1558[arg10 + 1];
        }
        if (var11.field2944 == 0 || arg9) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field2967 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field2970) {
            var25 |= 0x80000000L;
        }
        if (var11.method1339(255)) {
            method640((class102) null, 81, arg1, arg4, (class23) null, arg7, var11, arg3);
        }
        boolean var27 = !arg9 & var11.field2953;
        long var28 = var25 | (long) arg6 << 32;
        if (arg2 == 22) {
            if (class198.field3288 || var11.field2944 != 0 || var11.field3011 == 1 || var11.field2991) {
                class176 var31;
                if (var11.field2972 == -1 && var11.field3005 == null) {
                    class78 var30 = var11.method1326(var24, var27, (class5) null, var22, 22, arg8, arg1, var18, 2978, var20, var21);
                    if (class55.field815 && var27) {
                        class158.method1119(var30.field1241, var18, var19, var22);
                    }
                    var31 = var30.field1243;
                } else {
                    var31 = new class237(arg6, 22, arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
                }
                class190.method1402(arg7, arg4, arg3, var21, var31, var28, var11.field2990);
                if (var11.field3011 == 1 && arg0 != null) {
                    arg0.method190((byte) 127, arg3, arg4);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class176 var73;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var72 = var11.method1326(var24, var27, (class5) null, var22, 10, arg8, arg2 == 11 ? arg1 + 4 : arg1, var18, arg5 ^ 0xB98, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var72.field1241, var18, var19, var22);
                }
                var73 = var72.field1243;
            } else {
                var73 = new class237(arg6, 10, arg2 == 11 ? arg1 + 4 : arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            if (var73 != null) {
                boolean var74 = class145.method1053(arg7, arg4, arg3, var21, var13, var12, var73, 0, var28);
                if (var11.field2988 && var74 && arg8) {
                    int var75 = 15;
                    if (var73 instanceof class57) {
                        var75 = ((class57) var73).method437() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var13; var76++) {
                        for (int var77 = 0; var77 <= var12; var77++) {
                            if (class249.field4145[arg7][arg4 + var76][arg3 + var77] < var75) {
                                class249.field4145[arg7][arg4 + var76][arg3 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field3011 != 0 && arg0 != null) {
                arg0.method188(arg4, -1, var13, arg3, var12, var11.field2948);
            }
        } else if (arg2 >= 12) {
            class176 var71;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var70 = var11.method1326(var24, var27, (class5) null, var22, arg2, arg8, arg1, var18, 2978, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var70.field1241, var18, var19, var22);
                }
                var71 = var70.field1243;
            } else {
                var71 = new class237(arg6, arg2, arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class145.method1053(arg7, arg4, arg3, var21, 1, 1, var71, 0, var28);
            if (arg8 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg7 > 0) {
                class1.field3[arg7][arg4][arg3] = class239.method1677(class1.field3[arg7][arg4][arg3], 4);
            }
            if (var11.field3011 != 0 && arg0 != null) {
                arg0.method188(arg4, -1, var13, arg3, var12, var11.field2948);
            }
        } else if (arg2 == 0) {
            class176 var69;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var68 = var11.method1326(var24, var27, (class5) null, var22, 0, arg8, arg1, var18, 2978, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var68.field1241, var18, var19, var22);
                }
                var69 = var68.field1243;
            } else {
                var69 = new class237(arg6, 0, arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class206.method1457(arg7, arg4, arg3, var21, var69, (class176) null, class268.field4656[arg1], 0, var28);
            if (arg8) {
                if (arg1 == 0) {
                    if (var11.field2988) {
                        class249.field4145[arg7][arg4][arg3] = 50;
                        class249.field4145[arg7][arg4][arg3 + 1] = 50;
                    }
                    if (var11.field2942) {
                        class1.field3[arg7][arg4][arg3] = class239.method1677(class1.field3[arg7][arg4][arg3], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field2988) {
                        class249.field4145[arg7][arg4][arg3 + 1] = 50;
                        class249.field4145[arg7][arg4 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field2942) {
                        class1.field3[arg7][arg4][arg3 + 1] = class239.method1677(class1.field3[arg7][arg4][arg3 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field2988) {
                        class249.field4145[arg7][arg4 + 1][arg3] = 50;
                        class249.field4145[arg7][arg4 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field2942) {
                        class1.field3[arg7][arg4 + 1][arg3] = class239.method1677(class1.field3[arg7][arg4 + 1][arg3], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field2988) {
                        class249.field4145[arg7][arg4][arg3] = 50;
                        class249.field4145[arg7][arg4 + 1][arg3] = 50;
                    }
                    if (var11.field2942) {
                        class1.field3[arg7][arg4][arg3] = class239.method1677(class1.field3[arg7][arg4][arg3], 2);
                    }
                }
            }
            if (var11.field3011 != 0 && arg0 != null) {
                arg0.method197(arg3, arg1, var11.field2948, arg2, (byte) -118, arg4);
            }
            if (var11.field3009 != 16) {
                class25.method161(arg7, arg4, arg3, var11.field3009);
            }
        } else if (arg2 == 1) {
            class176 var67;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var66 = var11.method1326(var24, var27, (class5) null, var22, 1, arg8, arg1, var18, arg5 ^ 0xB98, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var66.field1241, var18, var19, var22);
                }
                var67 = var66.field1243;
            } else {
                var67 = new class237(arg6, 1, arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class206.method1457(arg7, arg4, arg3, var21, var67, (class176) null, class227.field3650[arg1], 0, var28);
            if (var11.field2988 && arg8) {
                if (arg1 == 0) {
                    class249.field4145[arg7][arg4][arg3 + 1] = 50;
                } else if (arg1 == 1) {
                    class249.field4145[arg7][arg4 + 1][arg3 + 1] = 50;
                } else if (arg1 == 2) {
                    class249.field4145[arg7][arg4 + 1][arg3] = 50;
                } else if (arg1 == 3) {
                    class249.field4145[arg7][arg4][arg3] = 50;
                }
            }
            if (var11.field3011 != 0 && arg0 != null) {
                arg0.method197(arg3, arg1, var11.field2948, arg2, (byte) -118, arg4);
            }
        } else if (arg2 == 2) {
            int var32 = arg1 + 1 & 0x3;
            class176 var34;
            class176 var36;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var33 = var11.method1326(var24, var27, (class5) null, var22, 2, arg8, arg1 + 4, var18, 2978, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var33.field1241, var18, var19, var22);
                }
                var34 = var33.field1243;
                class78 var35 = var11.method1326(var24, var27, (class5) null, var22, 2, arg8, var32, var18, 2978, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var35.field1241, var18, var19, var22);
                }
                var36 = var35.field1243;
            } else {
                var34 = new class237(arg6, 2, arg1 + 4, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
                var36 = new class237(arg6, 2, var32, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class206.method1457(arg7, arg4, arg3, var21, var34, var36, class268.field4656[arg1], class268.field4656[var32], var28);
            if (var11.field2942 && arg8) {
                if (arg1 == 0) {
                    class1.field3[arg7][arg4][arg3] = class239.method1677(class1.field3[arg7][arg4][arg3], 1);
                    class1.field3[arg7][arg4][arg3 + 1] = class239.method1677(class1.field3[arg7][arg4][arg3 + 1], 2);
                } else if (arg1 == 1) {
                    class1.field3[arg7][arg4][arg3 + 1] = class239.method1677(class1.field3[arg7][arg4][arg3 + 1], 2);
                    class1.field3[arg7][arg4 + 1][arg3] = class239.method1677(class1.field3[arg7][arg4 + 1][arg3], 1);
                } else if (arg1 == 2) {
                    class1.field3[arg7][arg4 + 1][arg3] = class239.method1677(class1.field3[arg7][arg4 + 1][arg3], 1);
                    class1.field3[arg7][arg4][arg3] = class239.method1677(class1.field3[arg7][arg4][arg3], 2);
                } else if (arg1 == 3) {
                    class1.field3[arg7][arg4][arg3] = class239.method1677(class1.field3[arg7][arg4][arg3], 2);
                    class1.field3[arg7][arg4][arg3] = class239.method1677(class1.field3[arg7][arg4][arg3], 1);
                }
            }
            if (var11.field3011 != 0 && arg0 != null) {
                arg0.method197(arg3, arg1, var11.field2948, arg2, (byte) -118, arg4);
            }
            if (var11.field3009 != 16) {
                class25.method161(arg7, arg4, arg3, var11.field3009);
            }
        } else if (arg2 == 3) {
            class176 var65;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var64 = var11.method1326(var24, var27, (class5) null, var22, 3, arg8, arg1, var18, 2978, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var64.field1241, var18, var19, var22);
                }
                var65 = var64.field1243;
            } else {
                var65 = new class237(arg6, 3, arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class206.method1457(arg7, arg4, arg3, var21, var65, (class176) null, class227.field3650[arg1], 0, var28);
            if (var11.field2988 && arg8) {
                if (arg1 == 0) {
                    class249.field4145[arg7][arg4][arg3 + 1] = 50;
                } else if (arg1 == 1) {
                    class249.field4145[arg7][arg4 + 1][arg3 + 1] = 50;
                } else if (arg1 == 2) {
                    class249.field4145[arg7][arg4 + 1][arg3] = 50;
                } else if (arg1 == 3) {
                    class249.field4145[arg7][arg4][arg3] = 50;
                }
            }
            if (var11.field3011 != 0 && arg0 != null) {
                arg0.method197(arg3, arg1, var11.field2948, arg2, (byte) -118, arg4);
            }
        } else if (arg2 == 9) {
            class176 var63;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var62 = var11.method1326(var24, var27, (class5) null, var22, arg2, arg8, arg1, var18, arg5 ^ 0xB98, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var62.field1241, var18, var19, var22);
                }
                var63 = var62.field1243;
            } else {
                var63 = new class237(arg6, arg2, arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class145.method1053(arg7, arg4, arg3, var21, 1, 1, var63, 0, var28);
            if (var11.field3011 != 0 && arg0 != null) {
                arg0.method188(arg4, -1, var13, arg3, var12, var11.field2948);
            }
            if (var11.field3009 != 16) {
                class25.method161(arg7, arg4, arg3, var11.field3009);
            }
        } else if (arg2 == 4) {
            class176 var61;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var60 = var11.method1326(var24, var27, (class5) null, var22, 4, arg8, arg1, var18, arg5 + 2920, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var60.field1241, var18, var19, var22);
                }
                var61 = var60.field1243;
            } else {
                var61 = new class237(arg6, 4, arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class233.method1623(arg7, arg4, arg3, var21, var61, (class176) null, class268.field4656[arg1], 0, 0, 0, var28);
        } else if (arg2 == 5) {
            int var37 = 16;
            long var38 = class4.method25(arg7, arg4, arg3);
            if (var38 != 0L) {
                var37 = class188.method1390((int) (var38 >>> 32) & Integer.MAX_VALUE, false).field3009;
            }
            class176 var41;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var40 = var11.method1326(var24, var27, (class5) null, var22, 4, arg8, arg1, var18, 2978, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var40.field1241, var18 - (class288.field4947[arg1] * 8), var19, var22 - (class50.field767[arg1] * 8));
                }
                var41 = var40.field1243;
            } else {
                var41 = new class237(arg6, 4, arg1, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class233.method1623(arg7, arg4, arg3, var21, var41, (class176) null, class268.field4656[arg1], 0, class288.field4947[arg1] * var37, class50.field767[arg1] * var37, var28);
        } else if (arg2 == 6) {
            long var42 = class4.method25(arg7, arg4, arg3);
            int var44 = 8;
            if (var42 != 0L) {
                var44 = class188.method1390((int) (var42 >>> 32) & Integer.MAX_VALUE, false).field3009 / 2;
            }
            class176 var46;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var45 = var11.method1326(var24, var27, (class5) null, var22, 4, arg8, arg1 + 4, var18, arg5 ^ 0xB98, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var45.field1241, var18 - (class131.field2164[arg1] * 8), var19, var22 - (class129.field2126[arg1] * 8));
                }
                var46 = var45.field1243;
            } else {
                var46 = new class237(arg6, 4, arg1 + 4, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class233.method1623(arg7, arg4, arg3, var21, var46, (class176) null, 256, arg1, class131.field2164[arg1] * var44, class129.field2126[arg1] * var44, var28);
        } else if (arg2 == 7) {
            int var57 = arg1 + 2 & 0x3;
            class176 var59;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                class78 var58 = var11.method1326(var24, var27, (class5) null, var22, 4, arg8, var57 + 4, var18, 2978, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var58.field1241, var18, var19, var22);
                }
                var59 = var58.field1243;
            } else {
                var59 = new class237(arg6, 4, var57 + 4, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class233.method1623(arg7, arg4, arg3, var21, var59, (class176) null, 256, var57, 0, 0, var28);
        } else if (arg2 == 8) {
            int var47 = 8;
            long var48 = class4.method25(arg7, arg4, arg3);
            if (var48 != 0L) {
                var47 = class188.method1390(Integer.MAX_VALUE & (int) (var48 >>> 32), false).field3009 / 2;
            }
            int var50 = arg1 + 2 & 0x3;
            class176 var54;
            class176 var56;
            if (var11.field2972 == -1 && var11.field3005 == null) {
                int var51 = class131.field2164[arg1] * 8;
                int var52 = class129.field2126[arg1] * 8;
                class78 var53 = var11.method1326(var24, var27, (class5) null, var22, 4, arg8, arg1 + 4, var18, 2978, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var53.field1241, var18 - var51, var19, var22 - var52);
                }
                var54 = var53.field1243;
                class78 var55 = var11.method1326(var24, var27, (class5) null, var22, 4, arg8, var50 + 4, var18, arg5 ^ 0xB98, var20, var21);
                if (class55.field815 && var27) {
                    class158.method1119(var55.field1241, var18 - var51, var19, var22 - var52);
                }
                var56 = var55.field1243;
            } else {
                var54 = new class237(arg6, 4, arg1 + 4, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
                var56 = new class237(arg6, 4, var50 + 4, arg10, arg4, arg3, var11.field2972, var11.field2956, (class176) null);
            }
            class233.method1623(arg7, arg4, arg3, var21, var54, var56, 256, arg1, class131.field2164[arg1] * var47, class129.field2126[arg1] * var47, var28);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ls;II)V", line = 746)
    private final void method636(class170 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1328 = arg0.method1250(false);
        } else if (arg1 == 2) {
            int var4 = arg0.method1221(124);
            this.field1325 = new int[var4];
            this.field1341 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1341[var5] = arg0.method1214(arg2 - 18253);
                int var6 = arg0.method1221(97);
                if (var6 == 0) {
                    this.field1325[var5] = -1;
                } else {
                    this.field1325[var5] = var6;
                }
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method1221(92);
            this.field1330 = new int[var7];
            this.field1338 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1330[var8] = arg0.method1214(-18254);
                int var9 = arg0.method1221(arg2 + 103);
                if (var9 == 0) {
                    this.field1338[var8] = -1;
                } else {
                    this.field1338[var8] = var9;
                }
            }
        } else if (arg1 == 4) {
        }
        if (arg2 != -1) {
            this.method637(-93, 44);
        }
        field1340++;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I", line = 823)
    public final int method637(int arg0, int arg1) {
        field1333++;
        if (this.field1341 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field1341.length; var3++) {
            if (this.field1325[var3] == arg1) {
                return this.field1341[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ls;I)V", line = 852)
    public final void method638(class170 arg0, int arg1) {
        if (arg1 != -1) {
            this.method634((byte) -123);
        }
        field1334++;
        while (true) {
            int var3 = arg0.method1221(75);
            if (var3 == 0) {
                return;
            }
            this.method636(arg0, var3, -1);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;I)Ltl;", line = 887)
    public static final class59 method639(String arg0, int arg1) {
        if (arg1 != 9588) {
            return (class59) null;
        }
        field1332++;
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class59 var5 = new class59();
        var5.field889 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field889[var5.field863++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var5.field889[var5.field863++] = (byte) var6;
            }
        }
        var5.method490(0);
        return var5.method475(127);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lch;IIILp;ILsf;I)V", line = 932)
    public static final void method640(class102 arg0, int arg1, int arg2, int arg3, class23 arg4, int arg5, class180 arg6, int arg7) {
        int var8 = 56 / ((-arg1 - 61) / 34);
        field1343++;
        class308 var9 = new class308();
        var9.field5235 = arg3 * 128;
        var9.field5237 = arg5;
        var9.field5210 = arg7 * 128;
        if (arg6 != null) {
            var9.field5240 = arg6;
            var9.field5223 = arg6.field2963;
            var9.field5214 = arg6.field2965;
            var9.field5228 = arg6.field2985;
            var9.field5227 = arg6.field2947;
            int var11 = arg6.field2976;
            int var12 = arg6.field3006;
            if (arg2 == 1 || arg2 == 3) {
                var12 = arg6.field2976;
                var11 = arg6.field3006;
            }
            var9.field5217 = (arg3 + var12) * 128;
            var9.field5239 = (arg7 + var11) * 128;
            var9.field5221 = arg6.field2987 * 128;
            if (arg6.field3005 != null) {
                var9.field5226 = true;
                var9.method2136(-15031);
            }
            if (var9.field5223 != null) {
                var9.field5216 = var9.field5214 + (int) ((double) (var9.field5228 - var9.field5214) * Math.random());
            }
            class27.field357.method532(111, var9);
        } else if (arg4 != null) {
            var9.field5241 = arg4;
            class119 var10 = arg4.field314;
            if (var10.field1958 != null) {
                var9.field5226 = true;
                var10 = var10.method890(958);
            }
            if (var10 != null) {
                var9.field5239 = (var10.field1948 + arg7) * 128;
                var9.field5217 = (var10.field1948 + arg3) * 128;
                var9.field5227 = class282.method1982(15971, arg4);
                var9.field5221 = var10.field1949 * 128;
            }
            class130.field2157.method532(94, var9);
        } else if (arg0 != null) {
            var9.field5231 = arg0;
            var9.field5217 = (arg0.method776(true) + arg3) * 128;
            var9.field5239 = (arg0.method776(true) + arg7) * 128;
            var9.field5227 = class60.method506(24642, arg0);
            var9.field5221 = arg0.field1679 * 128;
            class206.field3365.method694(var9, (byte) -90, arg0.field1663.method488((byte) 85));
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V", line = 1015)
    public static void method641(byte arg0) {
        field1339 = null;
        field1329 = null;
        if (arg0 != 92) {
            field1336 = true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I", line = 1030)
    public static final int method642(int arg0, int arg1, int arg2, int arg3) {
        field1331++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else {
            if (arg1 < 40) {
                method642(-33, 59, 84, -107);
            }
            return var4 == 2 ? 7 - arg2 : arg0;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILma;I)I", line = 1051)
    public static final int method643(int arg0, class263 arg1, int arg2) {
        field1337++;
        if (arg1.field4396 == null || arg2 >= arg1.field4396.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg1.field4396[arg2];
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 1) {
                    var8 = class101.field1647[var4[var5++]];
                }
                if (var7 == 2) {
                    var8 = class102.field1666[var4[var5++]];
                }
                if (var7 == 3) {
                    var8 = class120.field2002[var4[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class263 var12 = class247.method1738(false, var11);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class81.method616(var13, (byte) 25).field712 || class26.field351)) {
                        for (int var14 = 0; var14 < var12.field4549.length; var14++) {
                            if ((var13 + 1) == var12.field4549[var14]) {
                                var8 += var12.field4444[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class116.field1915[var4[var5++]];
                }
                if (var7 == 6) {
                    var8 = class46.field750[class102.field1666[var4[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class116.field1915[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class286.field4920.field1658;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class6.field65[var15]) {
                            var8 += class102.field1666[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class263 var18 = class247.method1738(false, var17);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class81.method616(var19, (byte) 25).field712 || class26.field351)) {
                        for (int var20 = 0; var20 < var18.field4549.length; var20++) {
                            if (var19 + 1 == var18.field4549[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class33.field483;
                }
                if (var7 == 12) {
                    var8 = class193.field3213;
                }
                if (var7 == 13) {
                    int var21 = class116.field1915[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var8 = class291.method2017(var23, (byte) -49);
                }
                if (var7 == 18) {
                    var8 = (class286.field4920.field1774 >> 7) + class197.field3249;
                }
                if (var7 == 19) {
                    var8 = (class286.field4920.field1769 >> 7) + class187.field3135;
                }
                if (var7 == 20) {
                    var8 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return arg0 == 4365 ? -1 : -47;
        }
    }
}
