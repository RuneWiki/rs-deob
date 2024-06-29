import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[Z")
    public static boolean[] field3 = new boolean[5];

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lwd;")
    public static class150 field16 = class2.method9(true, "::gc");

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lwd;")
    public static class150 field10 = class2.method9(true, "Hierhin gehen");

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lwd;")
    public static class150 field13 = class2.method9(true, "ams");

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lwd;")
    private static class150 field9 = class2.method9(true, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lwd;")
    public static class150 field4 = field9;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lwd;")
    private static class150 field8 = class2.method9(true, " from your ignore list first");

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lwd;")
    public static class150 field2 = field8;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lha;")
    public static class50 field15;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lkc;")
    public static class72 field12;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    public static int[] field6;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIB)I")
    public static final int method1(int arg0, int arg1, byte arg2) {
        if (arg2 != 50) {
            method3(-93);
        }
        int var3 = arg0 * 57 + arg1;
        field14++;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        field6 = null;
        if (arg0 != -1) {
            field12 = null;
        }
        field12 = null;
        field4 = null;
        field16 = null;
        field15 = null;
        field3 = null;
        field2 = null;
        field9 = null;
        field13 = null;
        field8 = null;
        field10 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static final void method3(int arg0) {
        if (arg0 < -79) {
            field5++;
            class143.field3461.method431(0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(JB)V")
    public static final void method4(long arg0, byte arg1) {
        field17++;
        if (arg0 == 0L) {
            return;
        }
        if (class74.field1858 >= 100) {
            class3.method16(99, 0, class3.field66, class43.field1167);
            return;
        }
        class150 var3 = class124.method940(arg0, 12391).method1175((byte) 71);
        for (int var4 = 0; var4 < class74.field1858; var4++) {
            if (class74.field1859[var4] == arg0) {
                class3.method16(99, 0, class111.method786((byte) -107, new class150[] { var3, class25.field745 }), class43.field1167);
                return;
            }
        }
        for (int var5 = 0; var5 < class50.field1347; var5++) {
            if (class3.field61[var5] == arg0) {
                class3.method16(99, 0, class111.method786((byte) -120, new class150[] { class72.field1799, var3, class112.field2596 }), class43.field1167);
                return;
            }
        }
        if (var3.method1192(class46.field1244.field2555, 1)) {
            return;
        }
        class74.field1859[class74.field1858++] = arg0;
        if (arg1 < -97) {
            class82.field1972 = true;
            class143.field3451.method965(true, 226);
            class23.field662++;
            class143.field3451.method1129(arg0, false);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    public static final int method5(int arg0, int arg1) {
        if (arg1 != 1) {
            field6 = null;
        }
        field11++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZILme;ILsa;III)V")
    public static final void method6(int arg0, boolean arg1, int arg2, class88 arg3, int arg4, class123 arg5, int arg6, int arg7, int arg8) {
        field1++;
        if (class20.field517 && (class131.field3097[0][arg0][arg7] & 0x2) == 0) {
            if ((class131.field3097[arg2][arg0][arg7] & 0x10) != 0) {
                return;
            }
            if (class149.method1158((byte) 97, arg0, arg2, arg7) != class107.field2435) {
                return;
            }
        }
        if (!arg1) {
            return;
        }
        if (class136.field3191 > arg2) {
            class136.field3191 = arg2;
        }
        int var9 = class121.field2789[arg2][arg0 + 1][arg7];
        int var10 = class121.field2789[arg2][arg0][arg7];
        int var11 = class121.field2789[arg2][arg0 + 1][arg7 + 1];
        int var12 = class121.field2789[arg2][arg0][arg7 + 1];
        int var13 = var9 + var10 + var12 + var11 >> 2;
        class61 var14 = class20.method145(arg8, (byte) -38);
        int var15 = (arg8 << 14) + (arg7 << 7) + arg0 + 1073741824;
        if (var14.field1602 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg6 << 6) + arg4;
        if (var14.field1547 == 1) {
            var16 += 256;
        }
        if (var14.method481(0)) {
            class18.method131(arg7, var14, arg6, arg0, arg2, 236);
        }
        if (arg4 == 22) {
            if (!class20.field517 || var14.field1602 != 0 || var14.field1576) {
                class29 var17;
                if (var14.field1596 == -1 && var14.field1560 == null) {
                    var17 = var14.method477(var12, 22, var10, var11, arg6, -96, var9);
                } else {
                    var17 = new class65(arg8, 22, arg6, var10, var9, var11, var12, var14.field1596, true, null);
                }
                arg5.method936(arg2, arg0, arg7, var13, var17, var15, var16);
                if (var14.field1581 == 1 && arg3 != null) {
                    arg3.method630(!arg1, arg7, arg0);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class29 var37;
            if (var14.field1596 == -1 && var14.field1560 == null) {
                var37 = var14.method477(var12, 10, var10, var11, arg6, -123, var9);
            } else {
                var37 = new class65(arg8, 10, arg6, var10, var9, var11, var12, var14.field1596, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg6 == 1 || arg6 == 3) {
                    var38 = var14.field1571;
                    var39 = var14.field1563;
                } else {
                    var38 = var14.field1563;
                    var39 = var14.field1571;
                }
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                if (arg5.method898(arg2, arg0, arg7, var13, var39, var38, var37, var40, var15, var16) && var14.field1584) {
                    int var41 = 15;
                    if (var37 instanceof class13) {
                        var41 = ((class13) var37).method95() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var39; var42++) {
                        for (int var43 = 0; var43 <= var38; var43++) {
                            if (class118.field2738[arg2][arg0 + var42][arg7 + var43] < var41) {
                                class118.field2738[arg2][arg0 + var42][arg7 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var14.field1581 != 0 && arg3 != null) {
                arg3.method626(var14.field1567, (byte) 117, arg6, var14.field1563, var14.field1571, arg7, arg0);
            }
        } else if (arg4 >= 12) {
            class29 var18;
            if (var14.field1596 == -1 && var14.field1560 == null) {
                var18 = var14.method477(var12, arg4, var10, var11, arg6, -102, var9);
            } else {
                var18 = new class65(arg8, arg4, arg6, var10, var9, var11, var12, var14.field1596, true, null);
            }
            arg5.method898(arg2, arg0, arg7, var13, 1, 1, var18, 0, var15, var16);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg2 > 0) {
                class94.field2189[arg2][arg0][arg7] = class147.method1100(class94.field2189[arg2][arg0][arg7], 2340);
            }
            if (var14.field1581 != 0 && arg3 != null) {
                arg3.method626(var14.field1567, (byte) 117, arg6, var14.field1563, var14.field1571, arg7, arg0);
            }
        } else if (arg4 == 0) {
            class29 var19;
            if (var14.field1596 == -1 && var14.field1560 == null) {
                var19 = var14.method477(var12, 0, var10, var11, arg6, -114, var9);
            } else {
                var19 = new class65(arg8, 0, arg6, var10, var9, var11, var12, var14.field1596, true, null);
            }
            arg5.method921(arg2, arg0, arg7, var13, var19, null, class101.field2297[arg6], 0, var15, var16);
            if (arg6 == 0) {
                if (var14.field1584) {
                    class118.field2738[arg2][arg0][arg7] = 50;
                    class118.field2738[arg2][arg0][arg7 + 1] = 50;
                }
                if (var14.field1555) {
                    class94.field2189[arg2][arg0][arg7] = class147.method1100(class94.field2189[arg2][arg0][arg7], 585);
                }
            } else if (arg6 == 1) {
                if (var14.field1584) {
                    class118.field2738[arg2][arg0][arg7 + 1] = 50;
                    class118.field2738[arg2][arg0 + 1][arg7 + 1] = 50;
                }
                if (var14.field1555) {
                    class94.field2189[arg2][arg0][arg7 + 1] = class147.method1100(class94.field2189[arg2][arg0][arg7 + 1], 1170);
                }
            } else if (arg6 == 2) {
                if (var14.field1584) {
                    class118.field2738[arg2][arg0 + 1][arg7] = 50;
                    class118.field2738[arg2][arg0 + 1][arg7 + 1] = 50;
                }
                if (var14.field1555) {
                    class94.field2189[arg2][arg0 + 1][arg7] = class147.method1100(class94.field2189[arg2][arg0 + 1][arg7], 585);
                }
            } else if (arg6 == 3) {
                if (var14.field1584) {
                    class118.field2738[arg2][arg0][arg7] = 50;
                    class118.field2738[arg2][arg0 + 1][arg7] = 50;
                }
                if (var14.field1555) {
                    class94.field2189[arg2][arg0][arg7] = class147.method1100(class94.field2189[arg2][arg0][arg7], 1170);
                }
            }
            if (var14.field1581 != 0 && arg3 != null) {
                arg3.method632((byte) 107, arg4, arg0, arg7, arg6, var14.field1567);
            }
            if (var14.field1589 != 16) {
                arg5.method918(arg2, arg0, arg7, var14.field1589);
            }
        } else if (arg4 == 1) {
            class29 var20;
            if (var14.field1596 == -1 && var14.field1560 == null) {
                var20 = var14.method477(var12, 1, var10, var11, arg6, -122, var9);
            } else {
                var20 = new class65(arg8, 1, arg6, var10, var9, var11, var12, var14.field1596, true, null);
            }
            arg5.method921(arg2, arg0, arg7, var13, var20, null, class10.field251[arg6], 0, var15, var16);
            if (var14.field1584) {
                if (arg6 == 0) {
                    class118.field2738[arg2][arg0][arg7 + 1] = 50;
                } else if (arg6 == 1) {
                    class118.field2738[arg2][arg0 + 1][arg7 + 1] = 50;
                } else if (arg6 == 2) {
                    class118.field2738[arg2][arg0 + 1][arg7] = 50;
                } else if (arg6 == 3) {
                    class118.field2738[arg2][arg0][arg7] = 50;
                }
            }
            if (var14.field1581 != 0 && arg3 != null) {
                arg3.method632((byte) 116, arg4, arg0, arg7, arg6, var14.field1567);
            }
        } else if (arg4 == 2) {
            int var21 = arg6 + 1 & 0x3;
            class29 var22;
            class29 var23;
            if (var14.field1596 == -1 && var14.field1560 == null) {
                var22 = var14.method477(var12, 2, var10, var11, arg6 + 4, -127, var9);
                var23 = var14.method477(var12, 2, var10, var11, var21, -124, var9);
            } else {
                var22 = new class65(arg8, 2, arg6 + 4, var10, var9, var11, var12, var14.field1596, true, null);
                var23 = new class65(arg8, 2, var21, var10, var9, var11, var12, var14.field1596, true, null);
            }
            arg5.method921(arg2, arg0, arg7, var13, var22, var23, class101.field2297[arg6], class101.field2297[var21], var15, var16);
            if (var14.field1555) {
                if (arg6 == 0) {
                    class94.field2189[arg2][arg0][arg7] = class147.method1100(class94.field2189[arg2][arg0][arg7], 585);
                    class94.field2189[arg2][arg0][arg7 + 1] = class147.method1100(class94.field2189[arg2][arg0][arg7 + 1], 1170);
                } else if (arg6 == 1) {
                    class94.field2189[arg2][arg0][arg7 + 1] = class147.method1100(class94.field2189[arg2][arg0][arg7 + 1], 1170);
                    class94.field2189[arg2][arg0 + 1][arg7] = class147.method1100(class94.field2189[arg2][arg0 + 1][arg7], 585);
                } else if (arg6 == 2) {
                    class94.field2189[arg2][arg0 + 1][arg7] = class147.method1100(class94.field2189[arg2][arg0 + 1][arg7], 585);
                    class94.field2189[arg2][arg0][arg7] = class147.method1100(class94.field2189[arg2][arg0][arg7], 1170);
                } else if (arg6 == 3) {
                    class94.field2189[arg2][arg0][arg7] = class147.method1100(class94.field2189[arg2][arg0][arg7], 1170);
                    class94.field2189[arg2][arg0][arg7] = class147.method1100(class94.field2189[arg2][arg0][arg7], 585);
                }
            }
            if (var14.field1581 != 0 && arg3 != null) {
                arg3.method632((byte) 125, arg4, arg0, arg7, arg6, var14.field1567);
            }
            if (var14.field1589 != 16) {
                arg5.method918(arg2, arg0, arg7, var14.field1589);
            }
        } else if (arg4 == 3) {
            class29 var24;
            if (var14.field1596 == -1 && var14.field1560 == null) {
                var24 = var14.method477(var12, 3, var10, var11, arg6, -104, var9);
            } else {
                var24 = new class65(arg8, 3, arg6, var10, var9, var11, var12, var14.field1596, true, null);
            }
            arg5.method921(arg2, arg0, arg7, var13, var24, null, class10.field251[arg6], 0, var15, var16);
            if (var14.field1584) {
                if (arg6 == 0) {
                    class118.field2738[arg2][arg0][arg7 + 1] = 50;
                } else if (arg6 == 1) {
                    class118.field2738[arg2][arg0 + 1][arg7 + 1] = 50;
                } else if (arg6 == 2) {
                    class118.field2738[arg2][arg0 + 1][arg7] = 50;
                } else if (arg6 == 3) {
                    class118.field2738[arg2][arg0][arg7] = 50;
                }
            }
            if (var14.field1581 != 0 && arg3 != null) {
                arg3.method632((byte) 91, arg4, arg0, arg7, arg6, var14.field1567);
            }
        } else if (arg4 == 9) {
            class29 var25;
            if (var14.field1596 == -1 && var14.field1560 == null) {
                var25 = var14.method477(var12, arg4, var10, var11, arg6, -107, var9);
            } else {
                var25 = new class65(arg8, arg4, arg6, var10, var9, var11, var12, var14.field1596, true, null);
            }
            arg5.method898(arg2, arg0, arg7, var13, 1, 1, var25, 0, var15, var16);
            if (var14.field1581 != 0 && arg3 != null) {
                arg3.method626(var14.field1567, (byte) 117, arg6, var14.field1563, var14.field1571, arg7, arg0);
            }
        } else {
            if (var14.field1577) {
                if (arg6 == 1) {
                    int var26 = var12;
                    var12 = var11;
                    var11 = var9;
                    var9 = var10;
                    var10 = var26;
                } else if (arg6 == 2) {
                    int var28 = var12;
                    var12 = var9;
                    var9 = var28;
                    int var29 = var11;
                    var11 = var10;
                    var10 = var29;
                } else if (arg6 == 3) {
                    int var27 = var12;
                    var12 = var10;
                    var10 = var9;
                    var9 = var11;
                    var11 = var27;
                }
            }
            if (arg4 == 4) {
                class29 var30;
                if (var14.field1596 == -1 && var14.field1560 == null) {
                    var30 = var14.method477(var12, 4, var10, var11, 0, -108, var9);
                } else {
                    var30 = new class65(arg8, 4, 0, var10, var9, var11, var12, var14.field1596, true, null);
                }
                arg5.method919(arg2, arg0, arg7, var13, var30, class101.field2297[arg6], arg6 * 512, 0, 0, var15, var16);
            } else if (arg4 == 5) {
                int var31 = 16;
                int var32 = arg5.method938(arg2, arg0, arg7);
                if (var32 != 0) {
                    var31 = class20.method145(var32 >> 14 & 0x7FFF, (byte) -96).field1589;
                }
                class29 var33;
                if (var14.field1596 == -1 && var14.field1560 == null) {
                    var33 = var14.method477(var12, 4, var10, var11, 0, -97, var9);
                } else {
                    var33 = new class65(arg8, 4, 0, var10, var9, var11, var12, var14.field1596, true, null);
                }
                arg5.method919(arg2, arg0, arg7, var13, var33, class101.field2297[arg6], arg6 * 512, class131.field3092[arg6] * var31, class22.field655[arg6] * var31, var15, var16);
            } else if (arg4 == 6) {
                class29 var34;
                if (var14.field1596 == -1 && var14.field1560 == null) {
                    var34 = var14.method477(var12, 4, var10, var11, 0, -113, var9);
                } else {
                    var34 = new class65(arg8, 4, 0, var10, var9, var11, var12, var14.field1596, true, null);
                }
                arg5.method919(arg2, arg0, arg7, var13, var34, 256, arg6, 0, 0, var15, var16);
            } else if (arg4 == 7) {
                class29 var35;
                if (var14.field1596 == -1 && var14.field1560 == null) {
                    var35 = var14.method477(var12, 4, var10, var11, 0, -98, var9);
                } else {
                    var35 = new class65(arg8, 4, 0, var10, var9, var11, var12, var14.field1596, true, null);
                }
                arg5.method919(arg2, arg0, arg7, var13, var35, 512, arg6, 0, 0, var15, var16);
            } else if (arg4 == 8) {
                class29 var36;
                if (var14.field1596 == -1 && var14.field1560 == null) {
                    var36 = var14.method477(var12, 4, var10, var11, 0, -128, var9);
                } else {
                    var36 = new class65(arg8, 4, 0, var10, var9, var11, var12, var14.field1596, true, null);
                }
                arg5.method919(arg2, arg0, arg7, var13, var36, 768, arg6, 0, 0, var15, var16);
            }
        }
    }
}
