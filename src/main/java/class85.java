import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class85 {

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    private int field1563 = 0;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "[Ljf;")
    public class64[] field1554;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lid;")
    private static class149 field1551 = class60.method382("Discard", (byte) 71);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lid;")
    private static class149 field1541 = class60.method382("Loading config )2 ", (byte) 107);

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lid;")
    public static class149 field1548 = field1551;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Lid;")
    public static class149 field1558 = class60.method382("(U4", (byte) 91);

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lid;")
    public static class149 field1560 = field1541;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lgk;")
    public static class157 field1550 = new class157();

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "J")
    private long field1561;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljf;")
    private class64 field1549;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "Ljf;")
    private class64 field1562;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Ljf;")
    public final class64 method627(byte arg0) {
        field1559++;
        if (this.field1549 == null) {
            return null;
        }
        int var2 = -40 % ((arg0 + 6) / 60);
        class64 var3 = this.field1554[(int) (this.field1561 & (long) (this.field1545 - 1))];
        while (this.field1549 != var3) {
            if (this.field1549.field1148 == this.field1561) {
                class64 var4 = this.field1549;
                this.field1549 = this.field1549.field1144;
                return var4;
            }
            this.field1549 = this.field1549.field1144;
        }
        this.field1549 = null;
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public final void method628(boolean arg0) {
        if (!arg0) {
            this.field1561 = 69L;
        }
        for (int var2 = 0; var2 < this.field1545; var2++) {
            class64 var3 = this.field1554[var2];
            while (true) {
                class64 var4 = var3.field1144;
                if (var3 == var4) {
                    break;
                }
                var4.method401((byte) -118);
            }
        }
        this.field1562 = null;
        this.field1549 = null;
        field1555++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    public static int method629(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Ljf;")
    public final class64 method630(int arg0) {
        field1547++;
        if (this.field1563 > 0 && this.field1554[this.field1563 - 1] != this.field1562) {
            class64 var2 = this.field1562;
            this.field1562 = var2.field1144;
            return var2;
        }
        while (this.field1545 > this.field1563) {
            class64 var3 = this.field1554[this.field1563++].field1144;
            if (this.field1554[this.field1563 - 1] != var3) {
                this.field1562 = var3.field1144;
                return var3;
            }
        }
        if (arg0 != 11) {
            this.field1545 = -60;
        }
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public static final void method631(byte arg0) {
        class167.field3096++;
        class208.field3720.method162(2, 104);
        if (arg0 != 104) {
            method634(true, -99, 5, 125, 16, 51, -67, 25, true, (class108) null, 95);
        }
        field1544++;
        class208.field3720.method496(2, 0L);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
    public final int method632(int arg0) {
        if (arg0 == -1) {
            field1546++;
            return this.field1545;
        } else {
            return -78;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)Ljf;")
    public final class64 method633(byte arg0) {
        this.field1563 = 0;
        if (arg0 < 23) {
            this.method632(24);
        }
        field1552++;
        return this.method630(11);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIIIIIIZLke;I)V")
    public static final void method634(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class108 arg9, int arg10) {
        field1556++;
        if (arg8 && !class123.method869(true) && (class69.field1215[0][arg6][arg7] & 0x2) == 0) {
            if ((class69.field1215[arg1][arg6][arg7] & 0x10) != 0) {
                return;
            }
            if (class23.method134(false, arg6, arg1, arg7) != class223.field3932) {
                return;
            }
        }
        if (arg1 < class183.field3305) {
            class183.field3305 = arg1;
        }
        class268 var11 = class108.method755(11525, arg2);
        int var12;
        int var13;
        if (arg4 == 1 || arg4 == 3) {
            var13 = var11.field4820;
            var12 = var11.field4787;
        } else {
            var12 = var11.field4820;
            var13 = var11.field4787;
        }
        int var14;
        int var15;
        if ((arg6 + var12) > 104) {
            var14 = arg6;
            var15 = arg6 + 1;
        } else {
            var15 = (var12 + 1 >> 1) + arg6;
            var14 = (var12 >> 1) + arg6;
        }
        int var16;
        int var17;
        if (arg7 + var13 <= 104) {
            var16 = (var13 + 1 >> 1) + arg7;
            var17 = (var13 >> 1) + arg7;
        } else {
            var16 = arg7 + 1;
            var17 = arg7;
        }
        int[][] var18 = class189.field3393[arg3];
        int var19 = var18[var14][var17] + var18[var15][var17] + var18[var15][var16] + var18[var14][var16] >> 2;
        int var20 = (arg6 << 7) + (var12 << 6);
        int var21 = (arg7 << 7) + (var13 << 6);
        int[][] var22 = null;
        if (arg0) {
            var22 = class211.field3759[0];
        } else if (arg3 < 3) {
            var22 = class189.field3393[arg3 + 1];
        }
        long var23 = (long) (arg5 << 14 | arg6 | arg7 << 7 | arg4 << 20 | 0x40000000);
        if (var11.field4806 == 0 || arg0) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field4776 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field4797) {
            var23 |= 0x80000000L;
        }
        if (var11.method1855((byte) -95)) {
            class185.method1275(arg7, var11, 128, arg1, (class127) null, arg6, (class20) null, arg4);
        }
        if (arg10 != 2) {
            return;
        }
        boolean var25 = var11.field4822 & !arg0;
        long var26 = var23 | (long) arg2 << 32;
        if (arg5 == 22) {
            if (class211.field3761 || var11.field4806 != 0 || var11.field4831 == 1 || var11.field4779) {
                class199 var29;
                if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                    class6 var28 = var11.method1857(var22, 22, arg4, var19, arg8, (byte) -46, var18, (class282) null, var21, var20, var25);
                    var29 = var28.field71;
                } else {
                    var29 = new class287(arg2, 22, arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
                }
                class102.method725(arg1, arg6, arg7, var19, var29, var26, var11.field4804);
                if (var11.field4831 == 1 && arg9 != null) {
                    arg9.method759(false, arg7, arg6);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class199 var69;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var68 = var11.method1857(var22, 10, arg5 == 11 ? arg4 + 4 : arg4, var19, arg8, (byte) -103, var18, (class282) null, var21, var20, var25);
                var69 = var68.field71;
            } else {
                var69 = new class287(arg2, 10, arg5 == 11 ? arg4 + 4 : arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            if (var69 != null) {
                boolean var70 = class143.method990(arg1, arg6, arg7, var19, var12, var13, var69, 0, var26);
                if (var11.field4840 && var70 && arg8) {
                    int var71 = 15;
                    if (var69 instanceof class262) {
                        var71 = ((class262) var69).method849() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (class108.field1883[arg1][arg6 + var72][arg7 + var73] < var71) {
                                class108.field1883[arg1][arg6 + var72][arg7 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field4831 != 0 && arg9 != null) {
                arg9.method758(var13, (byte) 70, var11.field4801, var12, arg6, arg7);
            }
        } else if (arg5 >= 12) {
            class199 var31;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var30 = var11.method1857(var22, arg5, arg4, var19, arg8, (byte) -98, var18, (class282) null, var21, var20, var25);
                var31 = var30.field71;
            } else {
                var31 = new class287(arg2, arg5, arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class143.method990(arg1, arg6, arg7, var19, 1, 1, var31, 0, var26);
            if (arg8 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0) {
                class5.field66[arg1][arg6][arg7] = class40.method238(class5.field66[arg1][arg6][arg7], 4);
            }
            if (var11.field4831 != 0 && arg9 != null) {
                arg9.method758(var13, (byte) 70, var11.field4801, var12, arg6, arg7);
            }
        } else if (arg5 == 0) {
            class199 var33;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var32 = var11.method1857(var22, 0, arg4, var19, arg8, (byte) -112, var18, (class282) null, var21, var20, var25);
                var33 = var32.field71;
            } else {
                var33 = new class287(arg2, 0, arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class170.method1225(arg1, arg6, arg7, var19, var33, (class199) null, class24.field345[arg4], 0, var26);
            if (arg8) {
                if (arg4 == 0) {
                    if (var11.field4840) {
                        class108.field1883[arg1][arg6][arg7] = 50;
                        class108.field1883[arg1][arg6][arg7 + 1] = 50;
                    }
                    if (var11.field4786) {
                        class5.field66[arg1][arg6][arg7] = class40.method238(class5.field66[arg1][arg6][arg7], 1);
                    }
                } else if (arg4 == 1) {
                    if (var11.field4840) {
                        class108.field1883[arg1][arg6][arg7 + 1] = 50;
                        class108.field1883[arg1][arg6 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field4786) {
                        class5.field66[arg1][arg6][arg7 + 1] = class40.method238(class5.field66[arg1][arg6][arg7 + 1], 2);
                    }
                } else if (arg4 == 2) {
                    if (var11.field4840) {
                        class108.field1883[arg1][arg6 + 1][arg7] = 50;
                        class108.field1883[arg1][arg6 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field4786) {
                        class5.field66[arg1][arg6 + 1][arg7] = class40.method238(class5.field66[arg1][arg6 + 1][arg7], 1);
                    }
                } else if (arg4 == 3) {
                    if (var11.field4840) {
                        class108.field1883[arg1][arg6][arg7] = 50;
                        class108.field1883[arg1][arg6 + 1][arg7] = 50;
                    }
                    if (var11.field4786) {
                        class5.field66[arg1][arg6][arg7] = class40.method238(class5.field66[arg1][arg6][arg7], 2);
                    }
                }
            }
            if (var11.field4831 != 0 && arg9 != null) {
                arg9.method768(arg7, true, arg6, arg5, var11.field4801, arg4);
            }
            if (var11.field4814 != 16) {
                class230.method1530(arg1, arg6, arg7, var11.field4814);
            }
        } else if (arg5 == 1) {
            class199 var35;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var34 = var11.method1857(var22, 1, arg4, var19, arg8, (byte) -100, var18, (class282) null, var21, var20, var25);
                var35 = var34.field71;
            } else {
                var35 = new class287(arg2, 1, arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class170.method1225(arg1, arg6, arg7, var19, var35, (class199) null, class158.field2916[arg4], 0, var26);
            if (var11.field4840 && arg8) {
                if (arg4 == 0) {
                    class108.field1883[arg1][arg6][arg7 + 1] = 50;
                } else if (arg4 == 1) {
                    class108.field1883[arg1][arg6 + 1][arg7 + 1] = 50;
                } else if (arg4 == 2) {
                    class108.field1883[arg1][arg6 + 1][arg7] = 50;
                } else if (arg4 == 3) {
                    class108.field1883[arg1][arg6][arg7] = 50;
                }
            }
            if (var11.field4831 != 0 && arg9 != null) {
                arg9.method768(arg7, true, arg6, arg5, var11.field4801, arg4);
            }
        } else if (arg5 == 2) {
            int var36 = arg4 + 1 & 0x3;
            class199 var38;
            class199 var40;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var37 = var11.method1857(var22, 2, arg4 + 4, var19, arg8, (byte) -47, var18, (class282) null, var21, var20, var25);
                var38 = var37.field71;
                class6 var39 = var11.method1857(var22, 2, var36, var19, arg8, (byte) -56, var18, (class282) null, var21, var20, var25);
                var40 = var39.field71;
            } else {
                var38 = new class287(arg2, 2, arg4 + 4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
                var40 = new class287(arg2, 2, var36, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class170.method1225(arg1, arg6, arg7, var19, var38, var40, class24.field345[arg4], class24.field345[var36], var26);
            if (var11.field4786 && arg8) {
                if (arg4 == 0) {
                    class5.field66[arg1][arg6][arg7] = class40.method238(class5.field66[arg1][arg6][arg7], 1);
                    class5.field66[arg1][arg6][arg7 + 1] = class40.method238(class5.field66[arg1][arg6][arg7 + 1], 2);
                } else if (arg4 == 1) {
                    class5.field66[arg1][arg6][arg7 + 1] = class40.method238(class5.field66[arg1][arg6][arg7 + 1], 2);
                    class5.field66[arg1][arg6 + 1][arg7] = class40.method238(class5.field66[arg1][arg6 + 1][arg7], 1);
                } else if (arg4 == 2) {
                    class5.field66[arg1][arg6 + 1][arg7] = class40.method238(class5.field66[arg1][arg6 + 1][arg7], 1);
                    class5.field66[arg1][arg6][arg7] = class40.method238(class5.field66[arg1][arg6][arg7], 2);
                } else if (arg4 == 3) {
                    class5.field66[arg1][arg6][arg7] = class40.method238(class5.field66[arg1][arg6][arg7], 2);
                    class5.field66[arg1][arg6][arg7] = class40.method238(class5.field66[arg1][arg6][arg7], 1);
                }
            }
            if (var11.field4831 != 0 && arg9 != null) {
                arg9.method768(arg7, true, arg6, arg5, var11.field4801, arg4);
            }
            if (var11.field4814 != 16) {
                class230.method1530(arg1, arg6, arg7, var11.field4814);
            }
        } else if (arg5 == 3) {
            class199 var42;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var41 = var11.method1857(var22, 3, arg4, var19, arg8, (byte) -100, var18, (class282) null, var21, var20, var25);
                var42 = var41.field71;
            } else {
                var42 = new class287(arg2, 3, arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class170.method1225(arg1, arg6, arg7, var19, var42, (class199) null, class158.field2916[arg4], 0, var26);
            if (var11.field4840 && arg8) {
                if (arg4 == 0) {
                    class108.field1883[arg1][arg6][arg7 + 1] = 50;
                } else if (arg4 == 1) {
                    class108.field1883[arg1][arg6 + 1][arg7 + 1] = 50;
                } else if (arg4 == 2) {
                    class108.field1883[arg1][arg6 + 1][arg7] = 50;
                } else if (arg4 == 3) {
                    class108.field1883[arg1][arg6][arg7] = 50;
                }
            }
            if (var11.field4831 != 0 && arg9 != null) {
                arg9.method768(arg7, true, arg6, arg5, var11.field4801, arg4);
            }
        } else if (arg5 == 9) {
            class199 var44;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var43 = var11.method1857(var22, arg5, arg4, var19, arg8, (byte) -89, var18, (class282) null, var21, var20, var25);
                var44 = var43.field71;
            } else {
                var44 = new class287(arg2, arg5, arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class143.method990(arg1, arg6, arg7, var19, 1, 1, var44, 0, var26);
            if (var11.field4831 != 0 && arg9 != null) {
                arg9.method758(var13, (byte) 70, var11.field4801, var12, arg6, arg7);
            }
            if (var11.field4814 != 16) {
                class230.method1530(arg1, arg6, arg7, var11.field4814);
            }
        } else if (arg5 == 4) {
            class199 var46;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var45 = var11.method1857(var22, 4, arg4, var19, arg8, (byte) -43, var18, (class282) null, var21, var20, var25);
                var46 = var45.field71;
            } else {
                var46 = new class287(arg2, 4, arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class182.method1265(arg1, arg6, arg7, var19, var46, (class199) null, class24.field345[arg4], 0, 0, 0, var26);
        } else if (arg5 == 5) {
            int var47 = 16;
            long var48 = class108.method756(arg1, arg6, arg7);
            if (var48 != 0L) {
                var47 = class108.method755(11525, (int) (var48 >>> 32) & Integer.MAX_VALUE).field4814;
            }
            class199 var51;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var50 = var11.method1857(var22, 4, arg4, var19, arg8, (byte) -93, var18, (class282) null, var21, var20, var25);
                var51 = var50.field71;
            } else {
                var51 = new class287(arg2, 4, arg4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class182.method1265(arg1, arg6, arg7, var19, var51, (class199) null, class24.field345[arg4], 0, class272.field4891[arg4] * var47, class93.field1651[arg4] * var47, var26);
        } else if (arg5 == 6) {
            int var52 = 8;
            long var53 = class108.method756(arg1, arg6, arg7);
            if (var53 != 0L) {
                var52 = class108.method755(11525, (int) (var53 >>> 32) & Integer.MAX_VALUE).field4814 / 2;
            }
            class199 var56;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var55 = var11.method1857(var22, 4, arg4 + 4, var19, arg8, (byte) -87, var18, (class282) null, var21, var20, var25);
                var56 = var55.field71;
            } else {
                var56 = new class287(arg2, 4, arg4 + 4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class182.method1265(arg1, arg6, arg7, var19, var56, (class199) null, 256, arg4, class25.field379[arg4] * var52, class255.field4457[arg4] * var52, var26);
        } else if (arg5 == 7) {
            int var57 = arg4 + 2 & 0x3;
            class199 var59;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var58 = var11.method1857(var22, 4, var57 + 4, var19, arg8, (byte) -78, var18, (class282) null, var21, var20, var25);
                var59 = var58.field71;
            } else {
                var59 = new class287(arg2, 4, var57 + 4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class182.method1265(arg1, arg6, arg7, var19, var59, (class199) null, 256, var57, 0, 0, var26);
        } else if (arg5 == 8) {
            int var60 = 8;
            long var61 = class108.method756(arg1, arg6, arg7);
            if (var61 != 0L) {
                var60 = class108.method755(11525, Integer.MAX_VALUE & (int) (var61 >>> 32)).field4814 / 2;
            }
            int var63 = arg4 + 2 & 0x3;
            class199 var65;
            class199 var67;
            if (var11.field4796 == -1 && var11.field4767 == null && !var11.field4817) {
                class6 var64 = var11.method1857(var22, 4, arg4 + 4, var19, arg8, (byte) -94, var18, (class282) null, var21, var20, var25);
                var65 = var64.field71;
                class6 var66 = var11.method1857(var22, 4, var63 + 4, var19, arg8, (byte) -110, var18, (class282) null, var21, var20, var25);
                var67 = var66.field71;
            } else {
                var65 = new class287(arg2, 4, arg4 + 4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
                var67 = new class287(arg2, 4, var63 + 4, arg3, arg6, arg7, var11.field4796, var11.field4799, (class199) null);
            }
            class182.method1265(arg1, arg6, arg7, var19, var65, var67, 256, arg4, class25.field379[arg4] * var60, class255.field4457[arg4] * var60, var26);
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1551 = null;
        field1560 = null;
        if (arg0 != 1) {
            field1541 = null;
        }
        field1548 = null;
        field1550 = null;
        field1541 = null;
        field1558 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
    public static final void method636(boolean arg0, int arg1) {
        if (arg1 != -14896) {
            return;
        }
        field1543++;
        int var10002;
        for (int var2 = 0; var2 < class182.field3281; var2++) {
            class20 var19 = class38.field572[class110.field1906[var2]];
            if (var19 != null && var19.method117((byte) 62) && var19.field296.field1073 == arg0 && var19.field296.method370(-38)) {
                int var20 = var19.method885((byte) -124);
                if (var20 == 1) {
                    if ((var19.field2347 & 0x7F) == 64 && (var19.field2340 & 0x7F) == 64) {
                        int var21 = var19.field2340 >> 7;
                        int var22 = var19.field2347 >> 7;
                        if (var22 >= 0 && var22 < 104 && var21 >= 0 && var21 < 104) {
                            var10002 = class47.field785[var22][var21]++;
                        }
                    }
                } else if (((var20 & 0x1) != 0 || (var19.field2347 & 0x7F) == 0 && (var19.field2340 & 0x7F) == 0) && ((var20 & 0x1) != 1 || (var19.field2347 & 0x7F) == 64 && (var19.field2340 & 0x7F) == 64)) {
                    int var23 = var19.field2347 - (var20 * 64) >> 7;
                    int var24 = var19.field2340 - (var20 * 64) >> 7;
                    int var25 = var23 + var19.method885((byte) -104);
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    int var26 = var19.method885((byte) -41) + var24;
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    for (int var27 = var23; var27 < var25; var27++) {
                        for (int var28 = var24; var28 < var26; var28++) {
                            var10002 = class47.field785[var27][var28]++;
                        }
                    }
                }
            }
        }
        label193: for (int var3 = 0; var3 < class182.field3281; var3++) {
            class20 var4 = class38.field572[class110.field1906[var3]];
            long var5 = (long) class110.field1906[var3] << 32 | 0x20000000L;
            if (var4 != null && var4.method117((byte) 62) && var4.field296.field1073 == arg0 && var4.field296.method370(-118)) {
                int var7 = var4.method885((byte) -39);
                if (var7 == 1) {
                    if ((var4.field2347 & 0x7F) == 64 && (var4.field2340 & 0x7F) == 64) {
                        int var17 = var4.field2347 >> 7;
                        int var18 = var4.field2340 >> 7;
                        if (var17 < 0 || var17 >= 104 || var18 < 0 || var18 >= 104) {
                            continue;
                        }
                        if (class47.field785[var17][var18] > 1) {
                            var10002 = class47.field785[var17][var18]--;
                            continue;
                        }
                    }
                } else if ((var7 & 0x1) == 0 && (var4.field2347 & 0x7F) == 0 && (var4.field2340 & 0x7F) == 0 || (var7 & 0x1) == 1 && (var4.field2347 & 0x7F) == 64 && (var4.field2340 & 0x7F) == 64) {
                    int var8 = var4.field2347 - (var7 * 64) >> 7;
                    int var9 = var4.field2340 - (var7 * 64) >> 7;
                    int var10 = var7 + var9;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var11 = var7 + var8;
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    boolean var12 = true;
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    for (int var13 = var8; var13 < var11; var13++) {
                        for (int var16 = var9; var16 < var10; var16++) {
                            if (class47.field785[var13][var16] <= 1) {
                                var12 = false;
                                break;
                            }
                        }
                    }
                    if (var12) {
                        int var14 = var8;
                        while (true) {
                            if (var11 <= var14) {
                                continue label193;
                            }
                            for (int var15 = var9; var15 < var10; var15++) {
                                var10002 = class47.field785[var14][var15]--;
                            }
                            var14++;
                        }
                    }
                }
                if (!var4.field296.field1070) {
                    var5 |= Long.MIN_VALUE;
                }
                var4.field2329 = class287.method1968(class277.field4948, var4.field2347, var4.field2340, (byte) -106);
                class131.method927(class277.field4948, var4.field2347, var4.field2340, var4.field2329, (var7 - 1) * 64 + 60, var4, var4.field2354, var5, var4.field2313);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)I")
    public final int method637(byte arg0) {
        field1542++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -107) {
            this.method628(true);
        }
        while (var3 < this.field1545) {
            class64 var4 = this.field1554[var3];
            for (class64 var5 = var4.field1144; var5 != var4; var5 = var5.field1144) {
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLjf;J)V")
    public final void method638(byte arg0, class64 arg1, long arg2) {
        if (arg1.field1153 != null) {
            arg1.method401((byte) -118);
        }
        field1553++;
        class64 var5 = this.field1554[(int) ((long) (this.field1545 - 1) & arg2)];
        arg1.field1148 = arg2;
        arg1.field1144 = var5;
        arg1.field1153 = var5.field1153;
        arg1.field1153.field1144 = arg1;
        if (arg0 != -89) {
            method635(0);
        }
        arg1.field1144.field1153 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
    public class85(int arg0) {
        this.field1554 = new class64[arg0];
        this.field1545 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class64 var3 = this.field1554[var2] = new class64();
            var3.field1144 = var3;
            var3.field1153 = var3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BJ)Ljf;")
    public final class64 method639(byte arg0, long arg1) {
        this.field1561 = arg1;
        if (arg0 > -12) {
            this.field1554 = null;
        }
        field1557++;
        class64 var4 = this.field1554[(int) ((long) (this.field1545 - 1) & arg1)];
        for (this.field1549 = var4.field1144; this.field1549 != var4; this.field1549 = this.field1549.field1144) {
            if (this.field1549.field1148 == arg1) {
                class64 var5 = this.field1549;
                this.field1549 = this.field1549.field1144;
                return var5;
            }
        }
        this.field1549 = null;
        return null;
    }
}
