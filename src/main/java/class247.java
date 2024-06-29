import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class247 extends class271 {

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Lwa;")
    public static class75 field4179 = class66.method560("W-=hlen Sie eine Welt", false);

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "Lwa;")
    private static class75 field4173 = class66.method560("flash2:", false);

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "Lwa;")
    public static class75 field4178 = field4173;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "Lwa;")
    public static class75 field4174 = field4173;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    private int field4182;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Lwa;")
    public class75 field4175;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lja;B)V", line = 6)
    public final void method1782(class60 arg0, byte arg1) {
        field4183++;
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                int var4 = 10 / ((arg1 + 63) / 53);
                return;
            }
            this.method1787(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V", line = 26)
    public static final void method1783(int arg0) {
        int var1 = 0;
        field4181++;
        for (int var2 = arg0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class9.method47(var3, var1, var2, class271.field4681, true, arg0 ^ 0x7A)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)Z", line = 59)
    public final boolean method1784(int arg0) {
        field4180++;
        if (arg0 != 4166) {
            this.field4176 = -88;
        }
        return this.field4182 == 115;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V", line = 89)
    public static void method1785(int arg0) {
        field4178 = null;
        field4179 = null;
        field4174 = null;
        field4173 = null;
        if (arg0 != 0) {
            method1783(58);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIZILpk;IIIZZI)V", line = 108)
    public static final void method1786(int arg0, int arg1, boolean arg2, int arg3, class104 arg4, int arg5, int arg6, int arg7, boolean arg8, boolean arg9, int arg10) {
        field4177++;
        if (arg2 && !class300.method2067(-12461) && (class204.field3459[0][arg1][arg3] & 0x2) == 0) {
            if ((class204.field3459[arg5][arg1][arg3] & 0x10) != 0) {
                return;
            }
            if (class152.method1166(arg1, arg5, arg3, -1) != class76.field1319) {
                return;
            }
        }
        if (arg5 < class151.field2586) {
            class151.field2586 = arg5;
        }
        if (arg8) {
            field4173 = (class75) null;
        }
        class108 var11 = class3.method14((byte) 83, arg6);
        if (var11.field1869) {
            return;
        }
        int var12;
        int var13;
        if (arg10 == 1 || arg10 == 3) {
            var13 = var11.field1837;
            var12 = var11.field1856;
        } else {
            var12 = var11.field1837;
            var13 = var11.field1856;
        }
        int var14;
        int var15;
        if ((arg1 + var13) <= 104) {
            var14 = (var13 + 1 >> 1) + arg1;
            var15 = arg1 + (var13 >> 1);
        } else {
            var14 = arg1 + 1;
            var15 = arg1;
        }
        int[][] var16 = class53.field879[arg0];
        int var17;
        int var18;
        if (arg3 + var12 > 104) {
            var17 = arg3 + 1;
            var18 = arg3;
        } else {
            var17 = (var12 + 1 >> 1) + arg3;
            var18 = (var12 >> 1) + arg3;
        }
        int var19 = (arg1 << 7) + (var13 << 6);
        int var20 = var16[var14][var17] + var16[var15][var18] + var16[var14][var18] + var16[var15][var17] >> 2;
        int var21 = (arg3 << 7) + (var12 << 6);
        int var22 = 0;
        if (arg0 != 0) {
            int[][] var23 = class53.field879[0];
            var22 = var20 - (var23[var15][var17] + var23[var14][var17] + var23[var14][var18] + var23[var15][var18] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg9) {
            var24 = class60.field1058[0];
        } else if (arg0 < 3) {
            var24 = class53.field879[arg0 + 1];
        }
        long var25 = (long) (arg10 | 0x400 << 20 | arg1 | arg3 << 7 | arg7 << 14);
        if (var11.field1851 == 0 || arg9) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field1829 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field1826) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg6 << 32;
        if (var11.method841((byte) -123)) {
            class76.method664(arg5, false, (class96) null, arg1, arg10, arg3, var11, (class295) null);
        }
        boolean var29 = !arg9 & var11.field1840;
        if (arg7 == 22) {
            if (class161.field2727 || var11.field1851 != 0 || var11.field1820 == 1 || var11.field1809) {
                class171 var77;
                if (var11.field1834 == -1 && var11.field1812 == null) {
                    class121 var76 = var11.method835((byte) 49, 22, var29, var24, var19, var21, var20, arg10, arg2, (class68) null, var16);
                    if (var29) {
                        class18.method108(var76.field2032, var19, var22, var21);
                    }
                    var77 = var76.field2033;
                } else {
                    var77 = new class214(arg6, 22, arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
                }
                class260.method1856(arg5, arg1, arg3, var20, var77, var27, var11.field1835);
                if (var11.field1820 == 1 && arg4 != null) {
                    arg4.method812((byte) 17, arg1, arg3);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class171 var71;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var70 = var11.method835((byte) 68, 10, var29, var24, var19, var21, var20, arg7 == 11 ? arg10 + 4 : arg10, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var70.field2032, var19, var22, var21);
                }
                var71 = var70.field2033;
            } else {
                var71 = new class214(arg6, 10, arg7 == 11 ? arg10 + 4 : arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            if (var71 != null) {
                boolean var72 = class295.method2049(arg5, arg1, arg3, var20, var13, var12, var71, 0, var27);
                if (var11.field1832 && var72 && arg2) {
                    int var73 = 15;
                    if (var71 instanceof class234) {
                        var73 = ((class234) var71).method430() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (class164.field2786[arg5][arg1 + var74][arg3 + var75] < var73) {
                                class164.field2786[arg5][arg1 + var74][arg3 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field1820 != 0 && arg4 != null) {
                arg4.method822(2, var13, var11.field1836, arg3, arg1, var12);
            }
        } else if (arg7 >= 12) {
            class171 var69;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var68 = var11.method835((byte) -98, arg7, var29, var24, var19, var21, var20, arg10, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var68.field2032, var19, var22, var21);
                }
                var69 = var68.field2033;
            } else {
                var69 = new class214(arg6, arg7, arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class295.method2049(arg5, arg1, arg3, var20, 1, 1, var69, 0, var27);
            if (arg2 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg5 > 0) {
                class51.field847[arg5][arg1][arg3] = class102.method799(class51.field847[arg5][arg1][arg3], 4);
            }
            if (var11.field1820 != 0 && arg4 != null) {
                arg4.method822(2, var13, var11.field1836, arg3, arg1, var12);
            }
        } else if (arg7 == 0) {
            class171 var31;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var30 = var11.method835((byte) 41, 0, var29, var24, var19, var21, var20, arg10, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var30.field2032, var19, var22, var21);
                }
                var31 = var30.field2033;
            } else {
                var31 = new class214(arg6, 0, arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class170.method1252(arg5, arg1, arg3, var20, var31, (class171) null, class173.field2916[arg10], 0, var27);
            if (arg2) {
                if (arg10 == 0) {
                    if (var11.field1832) {
                        class164.field2786[arg5][arg1][arg3] = 50;
                        class164.field2786[arg5][arg1][arg3 + 1] = 50;
                    }
                    if (var11.field1838) {
                        class51.field847[arg5][arg1][arg3] = class102.method799(class51.field847[arg5][arg1][arg3], 1);
                    }
                } else if (arg10 == 1) {
                    if (var11.field1832) {
                        class164.field2786[arg5][arg1][arg3 + 1] = 50;
                        class164.field2786[arg5][arg1 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field1838) {
                        class51.field847[arg5][arg1][arg3 + 1] = class102.method799(class51.field847[arg5][arg1][arg3 + 1], 2);
                    }
                } else if (arg10 == 2) {
                    if (var11.field1832) {
                        class164.field2786[arg5][arg1 + 1][arg3] = 50;
                        class164.field2786[arg5][arg1 + 1][arg3 + 1] = 50;
                    }
                    if (var11.field1838) {
                        class51.field847[arg5][arg1 + 1][arg3] = class102.method799(class51.field847[arg5][arg1 + 1][arg3], 1);
                    }
                } else if (arg10 == 3) {
                    if (var11.field1832) {
                        class164.field2786[arg5][arg1][arg3] = 50;
                        class164.field2786[arg5][arg1 + 1][arg3] = 50;
                    }
                    if (var11.field1838) {
                        class51.field847[arg5][arg1][arg3] = class102.method799(class51.field847[arg5][arg1][arg3], 2);
                    }
                }
            }
            if (var11.field1820 != 0 && arg4 != null) {
                arg4.method821(arg10, arg7, arg3, -1, arg1, var11.field1836);
            }
            if (var11.field1871 != 16) {
                class236.method1714(arg5, arg1, arg3, var11.field1871);
            }
        } else if (arg7 == 1) {
            class171 var33;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var32 = var11.method835((byte) 96, 1, var29, var24, var19, var21, var20, arg10, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var32.field2032, var19, var22, var21);
                }
                var33 = var32.field2033;
            } else {
                var33 = new class214(arg6, 1, arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class170.method1252(arg5, arg1, arg3, var20, var33, (class171) null, class86.field1419[arg10], 0, var27);
            if (var11.field1832 && arg2) {
                if (arg10 == 0) {
                    class164.field2786[arg5][arg1][arg3 + 1] = 50;
                } else if (arg10 == 1) {
                    class164.field2786[arg5][arg1 + 1][arg3 + 1] = 50;
                } else if (arg10 == 2) {
                    class164.field2786[arg5][arg1 + 1][arg3] = 50;
                } else if (arg10 == 3) {
                    class164.field2786[arg5][arg1][arg3] = 50;
                }
            }
            if (var11.field1820 != 0 && arg4 != null) {
                arg4.method821(arg10, arg7, arg3, -1, arg1, var11.field1836);
            }
        } else if (arg7 == 2) {
            int var63 = arg10 + 1 & 0x3;
            class171 var65;
            class171 var67;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var64 = var11.method835((byte) -82, 2, var29, var24, var19, var21, var20, arg10 + 4, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var64.field2032, var19, var22, var21);
                }
                var65 = var64.field2033;
                class121 var66 = var11.method835((byte) 113, 2, var29, var24, var19, var21, var20, var63, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var66.field2032, var19, var22, var21);
                }
                var67 = var66.field2033;
            } else {
                var65 = new class214(arg6, 2, arg10 + 4, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
                var67 = new class214(arg6, 2, var63, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class170.method1252(arg5, arg1, arg3, var20, var65, var67, class173.field2916[arg10], class173.field2916[var63], var27);
            if (var11.field1838 && arg2) {
                if (arg10 == 0) {
                    class51.field847[arg5][arg1][arg3] = class102.method799(class51.field847[arg5][arg1][arg3], 1);
                    class51.field847[arg5][arg1][arg3 + 1] = class102.method799(class51.field847[arg5][arg1][arg3 + 1], 2);
                } else if (arg10 == 1) {
                    class51.field847[arg5][arg1][arg3 + 1] = class102.method799(class51.field847[arg5][arg1][arg3 + 1], 2);
                    class51.field847[arg5][arg1 + 1][arg3] = class102.method799(class51.field847[arg5][arg1 + 1][arg3], 1);
                } else if (arg10 == 2) {
                    class51.field847[arg5][arg1 + 1][arg3] = class102.method799(class51.field847[arg5][arg1 + 1][arg3], 1);
                    class51.field847[arg5][arg1][arg3] = class102.method799(class51.field847[arg5][arg1][arg3], 2);
                } else if (arg10 == 3) {
                    class51.field847[arg5][arg1][arg3] = class102.method799(class51.field847[arg5][arg1][arg3], 2);
                    class51.field847[arg5][arg1][arg3] = class102.method799(class51.field847[arg5][arg1][arg3], 1);
                }
            }
            if (var11.field1820 != 0 && arg4 != null) {
                arg4.method821(arg10, arg7, arg3, -1, arg1, var11.field1836);
            }
            if (var11.field1871 != 16) {
                class236.method1714(arg5, arg1, arg3, var11.field1871);
            }
        } else if (arg7 == 3) {
            class171 var35;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var34 = var11.method835((byte) 71, 3, var29, var24, var19, var21, var20, arg10, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var34.field2032, var19, var22, var21);
                }
                var35 = var34.field2033;
            } else {
                var35 = new class214(arg6, 3, arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class170.method1252(arg5, arg1, arg3, var20, var35, (class171) null, class86.field1419[arg10], 0, var27);
            if (var11.field1832 && arg2) {
                if (arg10 == 0) {
                    class164.field2786[arg5][arg1][arg3 + 1] = 50;
                } else if (arg10 == 1) {
                    class164.field2786[arg5][arg1 + 1][arg3 + 1] = 50;
                } else if (arg10 == 2) {
                    class164.field2786[arg5][arg1 + 1][arg3] = 50;
                } else if (arg10 == 3) {
                    class164.field2786[arg5][arg1][arg3] = 50;
                }
            }
            if (var11.field1820 != 0 && arg4 != null) {
                arg4.method821(arg10, arg7, arg3, -1, arg1, var11.field1836);
            }
        } else if (arg7 == 9) {
            class171 var62;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var61 = var11.method835((byte) -84, arg7, var29, var24, var19, var21, var20, arg10, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var61.field2032, var19, var22, var21);
                }
                var62 = var61.field2033;
            } else {
                var62 = new class214(arg6, arg7, arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class295.method2049(arg5, arg1, arg3, var20, 1, 1, var62, 0, var27);
            if (var11.field1820 != 0 && arg4 != null) {
                arg4.method822(2, var13, var11.field1836, arg3, arg1, var12);
            }
            if (var11.field1871 != 16) {
                class236.method1714(arg5, arg1, arg3, var11.field1871);
            }
        } else if (arg7 == 4) {
            class171 var60;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var59 = var11.method835((byte) 60, 4, var29, var24, var19, var21, var20, arg10, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var59.field2032, var19, var22, var21);
                }
                var60 = var59.field2033;
            } else {
                var60 = new class214(arg6, 4, arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class260.method1858(arg5, arg1, arg3, var20, var60, (class171) null, class173.field2916[arg10], 0, 0, 0, var27);
        } else if (arg7 == 5) {
            int var36 = 16;
            long var37 = class230.method1684(arg5, arg1, arg3);
            if (var37 != 0L) {
                var36 = class3.method14((byte) 83, Integer.MAX_VALUE & (int) (var37 >>> 32)).field1871;
            }
            class171 var40;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var39 = var11.method835((byte) -88, 4, var29, var24, var19, var21, var20, arg10, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var39.field2032, var19 - (class10.field133[arg10] * 8), var22, var21 - class232.field3926[arg10] * 8);
                }
                var40 = var39.field2033;
            } else {
                var40 = new class214(arg6, 4, arg10, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class260.method1858(arg5, arg1, arg3, var20, var40, (class171) null, class173.field2916[arg10], 0, class10.field133[arg10] * var36, class232.field3926[arg10] * var36, var27);
        } else if (arg7 == 6) {
            int var41 = 8;
            long var42 = class230.method1684(arg5, arg1, arg3);
            if (var42 != 0L) {
                var41 = class3.method14((byte) 83, (int) (var42 >>> 32) & Integer.MAX_VALUE).field1871 / 2;
            }
            class171 var45;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var44 = var11.method835((byte) 78, 4, var29, var24, var19, var21, var20, arg10 + 4, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var44.field2032, var19 - (class276.field4750[arg10] * 8), var22, var21 - (class12.field163[arg10] * 8));
                }
                var45 = var44.field2033;
            } else {
                var45 = new class214(arg6, 4, arg10 + 4, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class260.method1858(arg5, arg1, arg3, var20, var45, (class171) null, 256, arg10, class276.field4750[arg10] * var41, class12.field163[arg10] * var41, var27);
        } else if (arg7 == 7) {
            int var56 = arg10 + 2 & 0x3;
            class171 var58;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                class121 var57 = var11.method835((byte) 38, 4, var29, var24, var19, var21, var20, var56 + 4, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var57.field2032, var19, var22, var21);
                }
                var58 = var57.field2033;
            } else {
                var58 = new class214(arg6, 4, var56 + 4, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class260.method1858(arg5, arg1, arg3, var20, var58, (class171) null, 256, var56, 0, 0, var27);
        } else if (arg7 == 8) {
            int var46 = 8;
            long var47 = class230.method1684(arg5, arg1, arg3);
            if (var47 != 0L) {
                var46 = class3.method14((byte) 83, (int) (var47 >>> 32) & Integer.MAX_VALUE).field1871 / 2;
            }
            int var49 = arg10 + 2 & 0x3;
            class171 var53;
            class171 var55;
            if (var11.field1834 == -1 && var11.field1812 == null) {
                int var50 = class276.field4750[arg10] * 8;
                int var51 = class12.field163[arg10] * 8;
                class121 var52 = var11.method835((byte) -123, 4, var29, var24, var19, var21, var20, arg10 + 4, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var52.field2032, var19 - var50, var22, var21 - var51);
                }
                var53 = var52.field2033;
                class121 var54 = var11.method835((byte) -117, 4, var29, var24, var19, var21, var20, var49 + 4, arg2, (class68) null, var16);
                if (var29) {
                    class18.method108(var54.field2032, var19 - var50, var22, var21 - var51);
                }
                var55 = var54.field2033;
            } else {
                var53 = new class214(arg6, 4, arg10 + 4, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
                var55 = new class214(arg6, 4, var49 + 4, arg0, arg1, arg3, var11.field1834, var11.field1850, (class171) null);
            }
            class260.method1858(arg5, arg1, arg3, var20, var53, var55, 256, arg10, class276.field4750[arg10] * var46, class12.field163[arg10] * var46, var27);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lja;IZ)V", line = 758)
    private final void method1787(class60 arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        if (arg1 == 1) {
            this.field4182 = arg0.method501(0);
        } else if (arg1 == 2) {
            this.field4176 = arg0.method505(255);
        } else if (arg1 == 5) {
            this.field4175 = arg0.method532(-1);
        }
        field4172++;
    }
}
