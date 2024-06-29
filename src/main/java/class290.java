import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class290 {

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "Ljo;")
    private class98 field4634 = new class98();

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "Ljo;")
    private class98 field4640 = new class98();

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "Ljo;")
    private class98 field4641 = new class98();

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "Ljo;")
    private class98 field4643 = new class98();

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "Lpi;")
    private class336 field4644 = new class336(4);

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "B")
    private byte field4648 = 0;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public volatile int field4649 = 0;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public volatile int field4650 = 0;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "Lpi;")
    private class336 field4651 = new class336(8);

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field4627 = 0;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field4628 = -1;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4626 = "purple:";

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    private int field4646;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "J")
    private long field4645;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "Lkh;")
    private class17 field4647;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "Lvg;")
    private class286 field4652;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "[[[I")
    public static int[][][] field4636;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 4)
    public final void method1974(int arg0) {
        field4639++;
        if (arg0 != 2083285280) {
            this.field4649 = -49;
        }
        if (this.field4647 != null) {
            this.field4647.method177(false);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZ)V", line = 24)
    public final void method1975(boolean arg0, boolean arg1) {
        field4622++;
        if (this.field4647 == null) {
            return;
        }
        try {
            this.field4644.field5353 = 0;
            this.field4644.method2370(arg1 ? 2 : 3, (byte) -20);
            this.field4644.method2319(0, (byte) -85);
            this.field4647.method178(0, 4, this.field4644.field5342, arg0);
        } catch (IOException var6) {
            try {
                this.field4647.method177(arg0);
            } catch (Exception var5) {
            }
            this.field4649++;
            this.field4650 = -2;
            this.field4647 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)I", line = 50)
    private final int method1976(int arg0) {
        field4629++;
        return arg0 == -1 ? this.field4641.method847(89) + this.field4643.method847(86) : -101;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZBII)Lvg;", line = 64)
    public final class286 method1977(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field4638++;
        long var6 = (long) ((arg0 << 16) + arg3);
        class286 var8 = new class286();
        var8.field2214 = var6;
        if (arg4 <= 25) {
            return (class286) null;
        }
        var8.field4554 = arg2;
        var8.field3033 = arg1;
        if (arg1) {
            if (this.method1990(Integer.MAX_VALUE) >= 20) {
                throw new RuntimeException();
            }
            this.field4634.method851(var8, (byte) -44);
        } else if (this.method1976(-1) < 20) {
            this.field4641.method851(var8, (byte) -44);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BZIILao;ZIIIII)V", line = 120)
    public static final void method1978(byte arg0, boolean arg1, int arg2, int arg3, class200 arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4633++;
        if (arg1 && !class56.method499(104) && (class152.field2683[0][arg10][arg9] & 0x2) == 0) {
            if ((class152.field2683[arg2][arg10][arg9] & 0x10) != 0) {
                return;
            }
            if (class64.method605(arg9, true, arg2, arg10) != class321.field5086) {
                return;
            }
        }
        if (arg2 < class44.field690) {
            class44.field690 = arg2;
        }
        class97 var11 = class92.method798((byte) 104, arg6);
        if (class43.field680 && var11.field1585) {
            return;
        }
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var13 = var11.field1549;
            var12 = var11.field1559;
        } else {
            var12 = var11.field1549;
            var13 = var11.field1559;
        }
        int var14;
        int var15;
        if (arg10 + var13 <= 104) {
            var14 = arg10 + (var13 >> 1);
            var15 = (var13 + 1 >> 1) + arg10;
        } else {
            var14 = arg10;
            var15 = arg10 + 1;
        }
        int var16;
        int var17;
        if ((arg9 + var12) <= 104) {
            var16 = (var12 + 1 >> 1) + arg9;
            var17 = (var12 >> 1) + arg9;
        } else {
            var16 = arg9 + 1;
            var17 = arg9;
        }
        int[][] var18 = class137.field2487[arg7];
        int var19 = var18[var14][var17] + var18[var15][var16] + var18[var15][var17] + var18[var14][var16] >> 2;
        int var20 = (arg10 << 7) + (var13 << 6);
        int var21 = (arg9 << 7) + (var12 << 6);
        int var22 = 0;
        if (class43.field680 && arg7 != 0) {
            int[][] var23 = class137.field2487[0];
            var22 = var19 - (var23[var14][var17] + var23[var15][var17] + var23[var15][var16] + var23[var14][var16] >> 2);
        }
        long var24 = (long) (arg3 << 20 | arg10 | arg9 << 7 | arg8 << 14 | 0x40000000);
        int[][] var26 = (int[][]) null;
        if (var11.field1571 == 0 || arg5) {
            var24 |= Long.MIN_VALUE;
        }
        if (arg5) {
            var26 = class255.field4110[0];
        } else if (arg7 < 3) {
            var26 = class137.field2487[arg7 + 1];
        }
        if (var11.field1540 == 1) {
            var24 |= 0x400000L;
        }
        if (var11.field1518) {
            var24 |= 0x80000000L;
        }
        if (var11.method843(-1)) {
            class288.method1962(arg10, 18913, arg9, arg3, (class205) null, arg2, (class278) null, var11);
        }
        long var27 = var24 | (long) arg6 << 32;
        boolean var29 = var11.field1586 & !arg5;
        if (arg8 == 22) {
            if (class48.field735 || var11.field1571 != 0 || var11.field1575 == 1 || var11.field1509) {
                class104 var77;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var76 = var11.method823(22, (class217) null, var29, var26, var18, arg3, var21, arg1, -14, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var76.field1643, var20, var22, var21);
                    }
                    var77 = var76.field1640;
                } else {
                    var77 = new class71(arg6, 22, arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class261.method1805(arg2, arg10, arg9, var19, var77, var27, var11.field1583);
                if (var11.field1575 == 1 && arg4 != null) {
                    arg4.method1501(15695, arg9, arg10);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class104 var71;
            if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                class102 var70 = var11.method823(10, (class217) null, var29, var26, var18, arg8 == 11 ? arg3 + 4 : arg3, var21, arg1, 125, var19, var20);
                if (class43.field680 && var29) {
                    class14.method136(var70.field1643, var20, var22, var21);
                }
                var71 = var70.field1640;
            } else {
                var71 = new class71(arg6, 10, arg8 == 11 ? arg3 + 4 : arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
            }
            if (var71 != null) {
                boolean var72 = class266.method1832(arg2, arg10, arg9, var19, var13, var12, var71, 0, var27);
                if (var11.field1544 && var72 && arg1) {
                    int var73 = 15;
                    if (var71 instanceof class10) {
                        var73 = ((class10) var71).method77() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (class224.field3745[arg2][arg10 + var74][arg9 + var75] < var73) {
                                class224.field3745[arg2][arg10 + var74][arg9 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field1575 != 0 && arg4 != null) {
                arg4.method1508(var12, var13, arg9, arg10, !var11.field1536, 0, var11.field1511);
            }
        } else if (arg8 >= 12) {
            class104 var31;
            if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                class102 var30 = var11.method823(arg8, (class217) null, var29, var26, var18, arg3, var21, arg1, 121, var19, var20);
                if (class43.field680 && var29) {
                    class14.method136(var30.field1643, var20, var22, var21);
                }
                var31 = var30.field1640;
            } else {
                var31 = new class71(arg6, arg8, arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
            }
            class266.method1832(arg2, arg10, arg9, var19, 1, 1, var31, 0, var27);
            if (arg1 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg2 > 0 && var11.field1515 != 0) {
                class226.field3798[arg2][arg10][arg9] = class144.method1159(class226.field3798[arg2][arg10][arg9], 4);
            }
            if (var11.field1575 != 0 && arg4 != null) {
                arg4.method1508(var12, var13, arg9, arg10, !var11.field1536, 0, var11.field1511);
            }
        } else {
            if (arg0 < 6) {
                method1978((byte) -55, true, 127, -33, (class200) null, true, -72, -101, 106, 77, -91);
            }
            if (arg8 == 0) {
                class104 var69;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var68 = var11.method823(0, (class217) null, var29, var26, var18, arg3, var21, arg1, 125, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var68.field1643, var20, var22, var21);
                    }
                    var69 = var68.field1640;
                } else {
                    var69 = new class71(arg6, 0, arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class286.method1955(arg2, arg10, arg9, var19, var69, (class104) null, class139.field2560[arg3], 0, var27);
                if (arg1) {
                    if (arg3 == 0) {
                        if (var11.field1544) {
                            class224.field3745[arg2][arg10][arg9] = 50;
                            class224.field3745[arg2][arg10][arg9 + 1] = 50;
                        }
                        if (var11.field1515 == 1) {
                            class226.field3798[arg2][arg10][arg9] = class144.method1159(class226.field3798[arg2][arg10][arg9], 1);
                        }
                    } else if (arg3 == 1) {
                        if (var11.field1544) {
                            class224.field3745[arg2][arg10][arg9 + 1] = 50;
                            class224.field3745[arg2][arg10 + 1][arg9 + 1] = 50;
                        }
                        if (var11.field1515 == 1) {
                            class226.field3798[arg2][arg10][arg9 + 1] = class144.method1159(class226.field3798[arg2][arg10][arg9 + 1], 2);
                        }
                    } else if (arg3 == 2) {
                        if (var11.field1544) {
                            class224.field3745[arg2][arg10 + 1][arg9] = 50;
                            class224.field3745[arg2][arg10 + 1][arg9 + 1] = 50;
                        }
                        if (var11.field1515 == 1) {
                            class226.field3798[arg2][arg10 + 1][arg9] = class144.method1159(class226.field3798[arg2][arg10 + 1][arg9], 1);
                        }
                    } else if (arg3 == 3) {
                        if (var11.field1544) {
                            class224.field3745[arg2][arg10][arg9] = 50;
                            class224.field3745[arg2][arg10 + 1][arg9] = 50;
                        }
                        if (var11.field1515 == 1) {
                            class226.field3798[arg2][arg10][arg9] = class144.method1159(class226.field3798[arg2][arg10][arg9], 2);
                        }
                    }
                }
                if (var11.field1575 != 0 && arg4 != null) {
                    arg4.method1513(arg10, -21952, arg8, var11.field1511, arg9, !var11.field1536, arg3);
                }
                if (var11.field1564 != 16) {
                    class230.method1660(arg2, arg10, arg9, var11.field1564);
                }
            } else if (arg8 == 1) {
                class104 var67;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var66 = var11.method823(1, (class217) null, var29, var26, var18, arg3, var21, arg1, -98, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var66.field1643, var20, var22, var21);
                    }
                    var67 = var66.field1640;
                } else {
                    var67 = new class71(arg6, 1, arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class286.method1955(arg2, arg10, arg9, var19, var67, (class104) null, class287.field4583[arg3], 0, var27);
                if (var11.field1544 && arg1) {
                    if (arg3 == 0) {
                        class224.field3745[arg2][arg10][arg9 + 1] = 50;
                    } else if (arg3 == 1) {
                        class224.field3745[arg2][arg10 + 1][arg9 + 1] = 50;
                    } else if (arg3 == 2) {
                        class224.field3745[arg2][arg10 + 1][arg9] = 50;
                    } else if (arg3 == 3) {
                        class224.field3745[arg2][arg10][arg9] = 50;
                    }
                }
                if (var11.field1575 != 0 && arg4 != null) {
                    arg4.method1513(arg10, -21952, arg8, var11.field1511, arg9, !var11.field1536, arg3);
                }
            } else if (arg8 == 2) {
                int var61 = arg3 + 1 & 0x3;
                class104 var63;
                class104 var65;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var62 = var11.method823(2, (class217) null, var29, var26, var18, arg3 + 4, var21, arg1, 118, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var62.field1643, var20, var22, var21);
                    }
                    var63 = var62.field1640;
                    class102 var64 = var11.method823(2, (class217) null, var29, var26, var18, var61, var21, arg1, 125, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var64.field1643, var20, var22, var21);
                    }
                    var65 = var64.field1640;
                } else {
                    var63 = new class71(arg6, 2, arg3 + 4, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                    var65 = new class71(arg6, 2, var61, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class286.method1955(arg2, arg10, arg9, var19, var63, var65, class139.field2560[arg3], class139.field2560[var61], var27);
                if (var11.field1515 == 1 && arg1) {
                    if (arg3 == 0) {
                        class226.field3798[arg2][arg10][arg9] = class144.method1159(class226.field3798[arg2][arg10][arg9], 1);
                        class226.field3798[arg2][arg10][arg9 + 1] = class144.method1159(class226.field3798[arg2][arg10][arg9 + 1], 2);
                    } else if (arg3 == 1) {
                        class226.field3798[arg2][arg10][arg9 + 1] = class144.method1159(class226.field3798[arg2][arg10][arg9 + 1], 2);
                        class226.field3798[arg2][arg10 + 1][arg9] = class144.method1159(class226.field3798[arg2][arg10 + 1][arg9], 1);
                    } else if (arg3 == 2) {
                        class226.field3798[arg2][arg10 + 1][arg9] = class144.method1159(class226.field3798[arg2][arg10 + 1][arg9], 1);
                        class226.field3798[arg2][arg10][arg9] = class144.method1159(class226.field3798[arg2][arg10][arg9], 2);
                    } else if (arg3 == 3) {
                        class226.field3798[arg2][arg10][arg9] = class144.method1159(class226.field3798[arg2][arg10][arg9], 2);
                        class226.field3798[arg2][arg10][arg9] = class144.method1159(class226.field3798[arg2][arg10][arg9], 1);
                    }
                }
                if (var11.field1575 != 0 && arg4 != null) {
                    arg4.method1513(arg10, -21952, arg8, var11.field1511, arg9, !var11.field1536, arg3);
                }
                if (var11.field1564 != 16) {
                    class230.method1660(arg2, arg10, arg9, var11.field1564);
                }
            } else if (arg8 == 3) {
                class104 var60;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var59 = var11.method823(3, (class217) null, var29, var26, var18, arg3, var21, arg1, -70, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var59.field1643, var20, var22, var21);
                    }
                    var60 = var59.field1640;
                } else {
                    var60 = new class71(arg6, 3, arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class286.method1955(arg2, arg10, arg9, var19, var60, (class104) null, class287.field4583[arg3], 0, var27);
                if (var11.field1544 && arg1) {
                    if (arg3 == 0) {
                        class224.field3745[arg2][arg10][arg9 + 1] = 50;
                    } else if (arg3 == 1) {
                        class224.field3745[arg2][arg10 + 1][arg9 + 1] = 50;
                    } else if (arg3 == 2) {
                        class224.field3745[arg2][arg10 + 1][arg9] = 50;
                    } else if (arg3 == 3) {
                        class224.field3745[arg2][arg10][arg9] = 50;
                    }
                }
                if (var11.field1575 != 0 && arg4 != null) {
                    arg4.method1513(arg10, -21952, arg8, var11.field1511, arg9, !var11.field1536, arg3);
                }
            } else if (arg8 == 9) {
                class104 var33;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var32 = var11.method823(arg8, (class217) null, var29, var26, var18, arg3, var21, arg1, 119, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var32.field1643, var20, var22, var21);
                    }
                    var33 = var32.field1640;
                } else {
                    var33 = new class71(arg6, arg8, arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class266.method1832(arg2, arg10, arg9, var19, 1, 1, var33, 0, var27);
                if (var11.field1575 != 0 && arg4 != null) {
                    arg4.method1508(var12, var13, arg9, arg10, !var11.field1536, 0, var11.field1511);
                }
                if (var11.field1564 != 16) {
                    class230.method1660(arg2, arg10, arg9, var11.field1564);
                }
            } else if (arg8 == 4) {
                class104 var58;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var57 = var11.method823(4, (class217) null, var29, var26, var18, arg3, var21, arg1, 123, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var57.field1643, var20, var22, var21);
                    }
                    var58 = var57.field1640;
                } else {
                    var58 = new class71(arg6, 4, arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class83.method750(arg2, arg10, arg9, var19, var58, (class104) null, class139.field2560[arg3], 0, 0, 0, var27);
            } else if (arg8 == 5) {
                int var34 = 16;
                long var35 = method1980(arg2, arg10, arg9);
                if (var35 != 0L) {
                    var34 = class92.method798((byte) 104, (int) (var35 >>> 32) & Integer.MAX_VALUE).field1564;
                }
                class104 var38;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var37 = var11.method823(4, (class217) null, var29, var26, var18, arg3, var21, arg1, -70, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var37.field1643, var20 - (class142.field2600[arg3] * 8), var22, var21 - (class191.field3199[arg3] * 8));
                    }
                    var38 = var37.field1640;
                } else {
                    var38 = new class71(arg6, 4, arg3, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class83.method750(arg2, arg10, arg9, var19, var38, (class104) null, class139.field2560[arg3], 0, class142.field2600[arg3] * var34, class191.field3199[arg3] * var34, var27);
            } else if (arg8 == 6) {
                int var52 = 8;
                long var53 = method1980(arg2, arg10, arg9);
                if (var53 != 0L) {
                    var52 = class92.method798((byte) 104, Integer.MAX_VALUE & (int) (var53 >>> 32)).field1564 / 2;
                }
                class104 var56;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var55 = var11.method823(4, (class217) null, var29, var26, var18, arg3 + 4, var21, arg1, -58, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var55.field1643, var20 - (class293.field4705[arg3] * 8), var22, var21 - (class321.field5104[arg3] * 8));
                    }
                    var56 = var55.field1640;
                } else {
                    var56 = new class71(arg6, 4, arg3 + 4, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class83.method750(arg2, arg10, arg9, var19, var56, (class104) null, 256, arg3, class293.field4705[arg3] * var52, class321.field5104[arg3] * var52, var27);
            } else if (arg8 == 7) {
                int var49 = arg3 + 2 & 0x3;
                class104 var51;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    class102 var50 = var11.method823(4, (class217) null, var29, var26, var18, var49 + 4, var21, arg1, -13, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var50.field1643, var20, var22, var21);
                    }
                    var51 = var50.field1640;
                } else {
                    var51 = new class71(arg6, 4, var49 + 4, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class83.method750(arg2, arg10, arg9, var19, var51, (class104) null, 256, var49, 0, 0, var27);
            } else if (arg8 == 8) {
                int var39 = 8;
                long var40 = method1980(arg2, arg10, arg9);
                if (var40 != 0L) {
                    var39 = class92.method798((byte) 104, (int) (var40 >>> 32) & Integer.MAX_VALUE).field1564 / 2;
                }
                int var42 = arg3 + 2 & 0x3;
                class104 var46;
                class104 var48;
                if (var11.field1510 == -1 && var11.field1581 == null && var11.field1579 == null && !var11.field1576) {
                    int var43 = class293.field4705[arg3] * 8;
                    int var44 = class321.field5104[arg3] * 8;
                    class102 var45 = var11.method823(4, (class217) null, var29, var26, var18, arg3 + 4, var21, arg1, 123, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var45.field1643, var20 - var43, var22, var21 - var44);
                    }
                    var46 = var45.field1640;
                    class102 var47 = var11.method823(4, (class217) null, var29, var26, var18, var42 + 4, var21, arg1, 122, var19, var20);
                    if (class43.field680 && var29) {
                        class14.method136(var47.field1643, var20 - var43, var22, var21 - var44);
                    }
                    var48 = var47.field1640;
                } else {
                    var46 = new class71(arg6, 4, arg3 + 4, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                    var48 = new class71(arg6, 4, var42 + 4, arg7, arg10, arg9, -1, var11.field1524, (class104) null);
                }
                class83.method750(arg2, arg10, arg9, var19, var46, var48, 256, arg3, class293.field4705[arg3] * var39, class321.field5104[arg3] * var39, var27);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 775)
    public final void method1979(int arg0) {
        try {
            this.field4647.method177(false);
        } catch (Exception var3) {
        }
        this.field4649++;
        this.field4650 = -1;
        if (arg0 == 2) {
            this.field4648 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field4647 = null;
            field4621++;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)J", line = 792)
    public static final long method1980(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        return var3 == null || var3.field4146 == null ? 0L : var3.field4146.field4732;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 801)
    public static void method1981(byte arg0) {
        field4626 = null;
        int var1 = 97 / ((arg0 - 86) / 37);
        field4636 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)Z", line = 814)
    public final boolean method1982(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field4620++;
            return this.method1990(Integer.MAX_VALUE) >= 20;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Z", line = 826)
    public final boolean method1983(byte arg0) {
        if (this.field4647 != null) {
            long var2 = class306.method2102(-289);
            int var4 = (int) (var2 - this.field4645);
            this.field4645 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4646 += var4;
            if (this.field4646 > 30000) {
                try {
                    this.field4647.method177(false);
                } catch (Exception var30) {
                }
                this.field4647 = null;
            }
        }
        field4637++;
        if (this.field4647 == null) {
            return this.method1990(Integer.MAX_VALUE) == 0 && this.method1976(-1) == 0;
        }
        try {
            this.field4647.method170(90);
            for (class286 var6 = (class286) this.field4634.method849(128); var6 != null; var6 = (class286) this.field4634.method850(-5714)) {
                this.field4644.field5353 = 0;
                this.field4644.method2370(1, (byte) -20);
                this.field4644.method2319((int) var6.field2214, (byte) -85);
                this.field4647.method178(0, 4, this.field4644.field5342, false);
                this.field4640.method851(var6, (byte) -44);
            }
            for (class286 var7 = (class286) this.field4641.method849(128); var7 != null; var7 = (class286) this.field4641.method850(-5714)) {
                this.field4644.field5353 = 0;
                this.field4644.method2370(0, (byte) -20);
                this.field4644.method2319((int) var7.field2214, (byte) -85);
                this.field4647.method178(0, 4, this.field4644.field5342, false);
                this.field4643.method851(var7, (byte) -44);
            }
            if (arg0 > -120) {
                this.method1982(true);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4647.method175(-21329);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                byte var10 = 0;
                if (this.field4652 == null) {
                    var10 = 8;
                } else if (this.field4652.field4547 == 0) {
                    var10 = 1;
                }
                this.field4646 = 0;
                if (var10 <= 0) {
                    int var11 = this.field4652.field4560.field5342.length - this.field4652.field4554;
                    int var12 = 512 - this.field4652.field4547;
                    if (var12 > (var11 - this.field4652.field4560.field5353)) {
                        var12 = var11 - this.field4652.field4560.field5353;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field4647.method179(this.field4652.field4560.field5342, this.field4652.field4560.field5353, var12, 9395);
                    if (this.field4648 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field4652.field4560.field5342[this.field4652.field4560.field5353 + var13] = (byte) class289.method1969(this.field4652.field4560.field5342[this.field4652.field4560.field5353 + var13], this.field4648);
                        }
                    }
                    this.field4652.field4547 += var12;
                    this.field4652.field4560.field5353 += var12;
                    if (this.field4652.field4560.field5353 == var11) {
                        this.field4652.method1067(40000);
                        this.field4652.field3029 = false;
                        this.field4652 = null;
                    } else if (this.field4652.field4547 == 512) {
                        this.field4652.field4547 = 0;
                    }
                } else {
                    int var14 = var10 - this.field4651.field5353;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field4647.method179(this.field4651.field5342, this.field4651.field5353, var14, 9395);
                    if (this.field4648 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field4651.field5342[this.field4651.field5353 + var15] = (byte) class289.method1969(this.field4651.field5342[this.field4651.field5353 + var15], this.field4648);
                        }
                    }
                    this.field4651.field5353 += var14;
                    if (this.field4651.field5353 >= var10) {
                        if (this.field4652 == null) {
                            this.field4651.field5353 = 0;
                            int var16 = this.field4651.method2364(-9069);
                            int var17 = this.field4651.method2339((byte) -46);
                            int var18 = this.field4651.method2364(-9069);
                            boolean var19 = (var18 & 0x80) != 0;
                            int var20 = this.field4651.method2338((byte) 18);
                            long var21 = (long) ((var16 << 16) + var17);
                            int var23 = var18 & 0x7F;
                            Object var24 = null;
                            class286 var25;
                            if (var19) {
                                for (var25 = (class286) this.field4643.method849(128); var25 != null && var25.field2214 != var21; var25 = (class286) this.field4643.method850(-5714)) {
                                }
                            } else {
                                for (var25 = (class286) this.field4640.method849(128); var25 != null && var25.field2214 != var21; var25 = (class286) this.field4640.method850(-5714)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field4652 = var25;
                            int var26 = var23 == 0 ? 5 : 9;
                            this.field4652.field4560 = new class336(var20 + var26 + this.field4652.field4554);
                            this.field4652.field4560.method2370(var23, (byte) -20);
                            this.field4652.field4560.method2320(-6128, var20);
                            this.field4651.field5353 = 0;
                            this.field4652.field4547 = 8;
                        } else if (this.field4652.field4547 != 0) {
                            throw new IOException();
                        } else if (this.field4651.field5342[0] == -1) {
                            this.field4652.field4547 = 1;
                            this.field4651.field5353 = 0;
                        } else {
                            this.field4652 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field4647.method177(false);
            } catch (Exception var29) {
            }
            this.field4647 = null;
            this.field4650 = -2;
            this.field4649++;
            return this.method1990(Integer.MAX_VALUE) == 0 && this.method1976(-1) == 0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 1102)
    public final void method1984(int arg0) {
        int var2 = 46 % ((arg0 + 51) / 52);
        field4631++;
        if (this.field4647 == null) {
            return;
        }
        try {
            this.field4644.field5353 = 0;
            this.field4644.method2370(7, (byte) -20);
            this.field4644.method2319(0, (byte) -85);
            this.field4647.method178(0, 4, this.field4644.field5342, false);
        } catch (IOException var6) {
            try {
                this.field4647.method177(false);
            } catch (Exception var5) {
            }
            this.field4650 = -2;
            this.field4649++;
            this.field4647 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lpi;I)V", line = 1128)
    public static final void method1985(class336 arg0, int arg1) {
        field4624++;
        int var2 = arg0.method2314((byte) 91);
        class132.field2265 = new class37[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class132.field2265[var3] = new class37();
            class132.field2265[var3].field540 = arg0.method2314((byte) 127);
            class132.field2265[var3].field538 = arg0.method2313(arg1 ^ 0xFFFFFF95);
        }
        class75.field1228 = arg0.method2314((byte) -115);
        class295.field4719 = arg0.method2314((byte) 109);
        class316.field5009 = arg0.method2314((byte) -69);
        class13.field212 = new class20[class295.field4719 - class75.field1228 - arg1];
        for (int var4 = 0; var4 < class316.field5009; var4++) {
            int var5 = arg0.method2314((byte) -81);
            class20 var6 = class13.field212[var5] = new class20();
            var6.field5237 = arg0.method2364(-9069);
            var6.field5230 = arg0.method2338((byte) 50);
            var6.field306 = class75.field1228 + var5;
            var6.field308 = arg0.method2313(106);
            var6.field313 = arg0.method2313(arg1 + 106);
        }
        class330.field5251 = arg0.method2338((byte) 58);
        class163.field2883 = true;
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)Z", line = 1176)
    public final boolean method1986(int arg0) {
        if (arg0 == -11818) {
            field4635++;
            return this.method1976(-1) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V", line = 1188)
    public final void method1987(byte arg0) {
        int var2 = -113 / ((-arg0 - 70) / 56);
        if (this.field4647 != null) {
            this.field4647.method176((byte) 126);
        }
        field4623++;
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V", line = 1204)
    private final void method1988(int arg0) {
        field4632++;
        if (arg0 > -95) {
            this.method1979(42);
        }
        if (this.field4647 == null) {
            return;
        }
        try {
            this.field4644.field5353 = 0;
            this.field4644.method2370(6, (byte) -20);
            this.field4644.method2319(3, (byte) -85);
            this.field4647.method178(0, 4, this.field4644.field5342, false);
        } catch (IOException var5) {
            try {
                this.field4647.method177(false);
            } catch (Exception var4) {
            }
            this.field4647 = null;
            this.field4649++;
            this.field4650 = -2;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILkh;Z)V", line = 1235)
    public final void method1989(int arg0, class17 arg1, boolean arg2) {
        field4642++;
        if (this.field4647 != null) {
            try {
                this.field4647.method177(false);
            } catch (Exception var11) {
            }
            this.field4647 = null;
        }
        this.field4647 = arg1;
        this.method1988(arg0 ^ 0x5247);
        this.method1975(false, arg2);
        this.field4651.field5353 = 0;
        if (arg0 != -21026) {
            field4626 = (String) null;
        }
        this.field4652 = null;
        while (true) {
            class286 var5 = (class286) this.field4640.method852(arg0 ^ 0xFFFF9A18);
            if (var5 == null) {
                while (true) {
                    class286 var6 = (class286) this.field4643.method852(14278);
                    if (var6 == null) {
                        if (this.field4648 != 0) {
                            try {
                                this.field4644.field5353 = 0;
                                this.field4644.method2370(4, (byte) -20);
                                this.field4644.method2370(this.field4648, (byte) -20);
                                this.field4644.method2359(arg0 - 805585174, 0);
                                this.field4647.method178(0, 4, this.field4644.field5342, false);
                            } catch (IOException var10) {
                                try {
                                    this.field4647.method177(false);
                                } catch (Exception var9) {
                                }
                                this.field4647 = null;
                                this.field4649++;
                                this.field4650 = -2;
                            }
                        }
                        this.field4646 = 0;
                        this.field4645 = class306.method2102(arg0 + 20737);
                        return;
                    }
                    this.field4641.method851(var6, (byte) -44);
                }
            }
            this.field4634.method851(var5, (byte) -44);
        }
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)I", line = 1304)
    public final int method1990(int arg0) {
        field4625++;
        if (arg0 != Integer.MAX_VALUE) {
            this.field4649 = 113;
        }
        return this.field4634.method847(24) + this.field4640.method847(arg0 ^ 0x7FFFFF9B);
    }
}
