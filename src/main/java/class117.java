import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class117 {

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    private int field1640 = 0;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[Lba;")
    public class188[] field1629;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field1638 = -1;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "J")
    private long field1637;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Lba;")
    private class188 field1635;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lba;")
    private class188 field1641;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lr;")
    public static class301 field1639;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
    public static int[] field1619;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 4)
    public static void method755(byte arg0) {
        if (arg0 != -95) {
            field1639 = (class301) null;
        }
        field1639 = null;
        field1619 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I", line = 23)
    public final int method756(int arg0) {
        int var2 = 0;
        field1636++;
        if (arg0 != 1) {
            field1639 = (class301) null;
        }
        for (int var3 = 0; var3 < this.field1617; var3++) {
            class188 var4 = this.field1629[var3];
            class188 var5 = var4.field2835;
            while (var4 != var5) {
                var5 = var5.field2835;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Lba;", line = 53)
    public final class188 method757(int arg0) {
        field1634++;
        if (this.field1640 > 0 && this.field1629[this.field1640 - 1] != this.field1641) {
            class188 var2 = this.field1641;
            this.field1641 = var2.field2835;
            return var2;
        }
        if (arg0 != -1) {
            this.field1629 = (class188[]) null;
        }
        class188 var3;
        do {
            if (this.field1617 <= this.field1640) {
                return null;
            }
            var3 = this.field1629[this.field1640++].field2835;
        } while (this.field1629[this.field1640 - 1] == var3);
        this.field1641 = var3.field2835;
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Lba;", line = 85)
    public final class188 method758(int arg0) {
        field1624++;
        if (this.field1635 == null) {
            return null;
        } else if (arg0 > -27) {
            return (class188) null;
        } else {
            class188 var2 = this.field1629[(int) ((long) (this.field1617 - 1) & this.field1637)];
            while (this.field1635 != var2) {
                if (this.field1635.field2834 == this.field1637) {
                    class188 var3 = this.field1635;
                    this.field1635 = this.field1635.field2835;
                    return var3;
                }
                this.field1635 = this.field1635.field2835;
            }
            this.field1635 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I", line = 120)
    public final int method759(byte arg0) {
        field1618++;
        if (arg0 != -105) {
            this.field1617 = -27;
        }
        return this.field1617;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJ)V", line = 132)
    public static final void method760(int arg0, long arg1) {
        field1628++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class95.field1313; var3++) {
            if (class229.field3477[var3] == arg1) {
                class95.field1313--;
                for (int var4 = var3; var4 < class95.field1313; var4++) {
                    class235.field3618[var4] = class235.field3618[var4 + 1];
                    class210.field3167[var4] = class210.field3167[var4 + 1];
                    class353.field5616[var4] = class353.field5616[var4 + 1];
                    class229.field3477[var4] = class229.field3477[var4 + 1];
                    class333.field5332[var4] = class333.field5332[var4 + 1];
                    class169.field2582[var4] = class169.field2582[var4 + 1];
                }
                class49.field566 = class181.field2734;
                class102.field1383++;
                class328.field5282.method304(197, 19830);
                class328.field5282.method1039(arg1, (byte) 67);
                break;
            }
        }
        if (arg0 != -1) {
            field1639 = (class301) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lba;", line = 183)
    public final class188 method761(int arg0) {
        this.field1640 = 0;
        field1626++;
        if (arg0 < 0) {
            this.field1629 = (class188[]) null;
        }
        return this.method757(-1);
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V", line = 199)
    public static final void method762(int arg0) {
        class348.field5519.method383((byte) -48);
        if (arg0 == -14711) {
            field1621++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[BIIZIZ[Lne;)V", line = 210)
    public static final void method763(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9, class262[] arg10) {
        if (!arg9) {
            field1619 = (int[]) null;
        }
        field1625++;
        class143 var11 = new class143(arg4);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1019(25180);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1027(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var11.method1043(true);
                int var19 = (var14 & 0xFF2) >> 6;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg8 == var17 && arg2 <= var19 && arg2 + 8 > var19 && var16 >= arg1 && arg1 + 8 > var16) {
                    class234 var22 = class123.method795(0, var12);
                    int var23 = class214.method1491(false, var22.field3590, var19 & 0x7, var16 & 0x7, var21, arg0, var22.field3577) + arg5;
                    int var24 = class56.method339(var19 & 0x7, var21, (byte) 87, var22.field3590, arg0, var22.field3577, var16 & 0x7) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class262 var25 = null;
                        if (!arg7) {
                            int var26 = arg3;
                            if ((class225.field3398[1][var23][var24] & 0x2) == 2) {
                                var26 = arg3 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg10[var26];
                            }
                        }
                        class100.method638(arg3, arg7, -55, var20, arg3, var25, var12, var24, !arg7, var21 + arg0 & 0x3, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILba;J)V", line = 296)
    public final void method764(int arg0, class188 arg1, long arg2) {
        if (arg1.field2833 != null) {
            arg1.method1290(-117);
        }
        class188 var5 = this.field1629[(int) ((long) (this.field1617 - 1) & arg2)];
        if (arg0 != 24369) {
            method760(97, -15L);
        }
        arg1.field2835 = var5;
        field1631++;
        arg1.field2833 = var5.field2833;
        arg1.field2834 = arg2;
        arg1.field2833.field2835 = arg1;
        arg1.field2835.field2833 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lsd;IIIIIIIZ)V", line = 317)
    public static final void method765(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class245.field3859;
        int var11;
        int var12 = var11 = (arg7 << 7) - class42.field457;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class72.field902[arg1][arg6][arg7] - class36.field415;
        int var18 = class72.field902[arg1][arg6 + 1][arg7] - class36.field415;
        int var19 = class72.field902[arg1][arg6 + 1][arg7 + 1] - class36.field415;
        int var20 = class72.field902[arg1][arg6][arg7 + 1] - class36.field415;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class104.field1427;
        int var46 = (var24 << 9) / var25 + class104.field1431;
        int var47 = (var27 << 9) / var31 + class104.field1427;
        int var48 = (var30 << 9) / var31 + class104.field1431;
        int var49 = (var33 << 9) / var37 + class104.field1427;
        int var50 = (var36 << 9) / var37 + class104.field1431;
        int var51 = (var39 << 9) / var43 + class104.field1427;
        int var52 = (var42 << 9) / var43 + class104.field1431;
        class104.field1433 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class226.field3412 && class32.method224(class6.field70 + class104.field1427, class250.field3969 + class104.field1431, var50, var52, var48, var49, var51, var47)) {
                class179.field2690 = arg6;
                class347.field5511 = arg7;
            }
            if (!class272.field4317 && !arg8) {
                class104.field1436 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class104.field1441 || var51 > class104.field1441 || var47 > class104.field1441) {
                    class104.field1436 = true;
                }
                if (arg0.field383 == -1) {
                    if (arg0.field385 != 12345678) {
                        class104.method662(var50, var52, var48, var49, var51, var47, arg0.field385, arg0.field388, arg0.field390);
                    }
                } else if (!class139.field2087) {
                    int var53 = class104.field1438.method878(-75, arg0.field383);
                    class104.method662(var50, var52, var48, var49, var51, var47, class110.method711(var53, arg0.field385), class110.method711(var53, arg0.field388), class110.method711(var53, arg0.field390));
                } else if (arg0.field391) {
                    class104.method672(var50, var52, var48, var49, var51, var47, arg0.field385, arg0.field388, arg0.field390, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field383);
                } else {
                    class104.method672(var50, var52, var48, var49, var51, var47, arg0.field385, arg0.field388, arg0.field390, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field383);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class226.field3412 && class32.method224(class6.field70 + class104.field1427, class250.field3969 + class104.field1431, var46, var48, var52, var45, var47, var51)) {
            class179.field2690 = arg6;
            class347.field5511 = arg7;
        }
        if (class272.field4317 || arg8) {
            return;
        }
        class104.field1436 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class104.field1441 || var47 > class104.field1441 || var51 > class104.field1441) {
            class104.field1436 = true;
        }
        if (arg0.field383 == -1) {
            if (arg0.field386 != 12345678) {
                class104.method662(var46, var48, var52, var45, var47, var51, arg0.field386, arg0.field390, arg0.field388);
            }
        } else if (class139.field2087) {
            class104.method672(var46, var48, var52, var45, var47, var51, arg0.field386, arg0.field390, arg0.field388, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field383);
        } else {
            int var54 = class104.field1438.method878(124, arg0.field383);
            class104.method662(var46, var48, var52, var45, var47, var51, class110.method711(var54, arg0.field386), class110.method711(var54, arg0.field390), class110.method711(var54, arg0.field388));
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V", line = 475)
    public static final void method766(byte arg0, int arg1, int arg2) {
        class190 var3 = class197.method1374((byte) -94, arg2);
        field1620++;
        if (arg0 <= 4) {
            method766((byte) 37, 115, -35);
        }
        int var4 = var3.field2850;
        int var5 = var3.field2853;
        int var6 = var3.field2857;
        int var7 = class108.field1486[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class253.method1793(true, ~var8 & class255.field4041[var4] | arg1 << var5 & var8, var4);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lba;B)I", line = 505)
    public final int method767(class188[] arg0, byte arg1) {
        field1622++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1617; var4++) {
            class188 var5 = this.field1629[var4];
            for (class188 var6 = var5.field2835; var6 != var5; var6 = var6.field2835) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 != -10) {
            method768(4);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V", line = 535)
    public class117(int arg0) {
        this.field1629 = new class188[arg0];
        this.field1617 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class188 var3 = this.field1629[var2] = new class188();
            var3.field2833 = var3;
            var3.field2835 = var3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)I", line = 558)
    public static final int method768(int arg0) {
        if (arg0 >= -97) {
            field1619 = (int[]) null;
        }
        field1630++;
        if (class80.field1065 != null) {
            return 3;
        } else if (class272.field4317 && class71.field889) {
            return 2;
        } else if (class272.field4317 && !class71.field889) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V", line = 579)
    public final void method769(int arg0) {
        field1632++;
        if (arg0 < 52) {
            return;
        }
        for (int var2 = 0; var2 < this.field1617; var2++) {
            class188 var3 = this.field1629[var2];
            while (true) {
                class188 var4 = var3.field2835;
                if (var3 == var4) {
                    break;
                }
                var4.method1290(-87);
            }
        }
        this.field1635 = null;
        this.field1641 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)Lba;", line = 613)
    public final class188 method770(long arg0, int arg1) {
        field1627++;
        this.field1637 = arg0;
        int var4 = 73 / ((arg1 - 7) / 32);
        class188 var5 = this.field1629[(int) (arg0 & (long) (this.field1617 - 1))];
        for (this.field1635 = var5.field2835; this.field1635 != var5; this.field1635 = this.field1635.field2835) {
            if (this.field1635.field2834 == arg0) {
                class188 var6 = this.field1635;
                this.field1635 = this.field1635.field2835;
                return var6;
            }
        }
        this.field1635 = null;
        return null;
    }
}
