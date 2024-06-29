import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class96 extends class99 {

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    private int field1848 = 2048;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
    private int field1853 = 8192;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    private int field1849 = 2048;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    private int field1846 = 12288;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    private int field1840 = 0;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    private int field1838 = 4096;

    @OriginalMember(owner = "client!i", name = "rb", descriptor = "I")
    private int field1865 = 0;

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "Lr;")
    private static class66 field1854 = class93.method641(43, "K");

    @OriginalMember(owner = "client!i", name = "db", descriptor = "Lr;")
    public static class66 field1851 = field1854;

    @OriginalMember(owner = "client!i", name = "lb", descriptor = "J")
    public static volatile long field1859 = 0L;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "J")
    public static long field1843 = 0L;

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "S")
    public static short field1856 = 256;

    @OriginalMember(owner = "client!i", name = "nb", descriptor = "I")
    public static int field1861 = 0;

    @OriginalMember(owner = "client!i", name = "kb", descriptor = "I")
    public static int field1858 = 0;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field1842 = 1;

    @OriginalMember(owner = "client!i", name = "tb", descriptor = "Lr;")
    public static class66 field1867 = field1854;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!i", name = "jb", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!i", name = "mb", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!i", name = "pb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!i", name = "qb", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "[Ljb;")
    public static class256[] field1845;

    @OriginalMember(owner = "client!i", name = "ob", descriptor = "[[[B")
    public static byte[][][] field1862;

    @OriginalMember(owner = "client!i", name = "sb", descriptor = "[[[S")
    public static short[][][] field1866;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)Z")
    private final boolean method657(int arg0, byte arg1, int arg2) {
        ++field1847;
        int var4 = 81 % ((50 - arg1) / 41);
        int var5 = (-arg0 + arg2) * this.field1846 >> 12;
        int var6 = class146.field2668[255 & var5 * 255 >> 12];
        int var7 = (var6 << 12) / this.field1846;
        int var8 = (var7 << 12) / this.field1853;
        int var9 = this.field1838 * var8 >> 12;
        return arg0 - -arg2 < var9 && ~(-var9) > ~(arg0 + arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILlh;)V")
    public static final void method658(int arg0, class249 arg1) {
        if (arg0 > 65) {
            while (true) {
                while (~arg1.field4350.length < ~arg1.field4335) {
                    boolean var2 = false;
                    int var3 = 0;
                    int var4 = 0;
                    if (~arg1.method1677(-6677) == -2) {
                        var2 = true;
                        var3 = arg1.method1677(-6677);
                        var4 = arg1.method1677(-6677);
                    }
                    int var5 = arg1.method1677(-6677);
                    int var6 = arg1.method1677(-6677);
                    int var7 = var5 * 64 + -class73.field1439;
                    int var8 = -(var6 * 64) + class16.field208 + class89.field1727 + -1;
                    if (~var7 <= -1 && ~(var8 + -63) <= -1 && class33.field500 > var7 + 63 && class89.field1727 > var8) {
                        int var9 = var7 >> 6;
                        int var10 = var8 >> 6;
                        for (int var11 = 0; ~var11 > -65; ++var11) {
                            for (int var12 = 0; ~var12 > -65; ++var12) {
                                if (!var2 || ~var11 <= ~(var3 * 8) && var3 * 8 + 8 > var11 && ~(var4 * 8) >= ~var12 && var12 < var4 * 8 + 8) {
                                    byte var13 = arg1.method1682(3390);
                                    if (~var13 != -1) {
                                        if (class209.field3627[var9][var10] == null) {
                                            class209.field3627[var9][var10] = new byte[4096];
                                        }
                                        class209.field3627[var9][var10][(-var12 + 63 << 6) - -var11] = var13;
                                        byte var14 = arg1.method1682(3390);
                                        if (class8.field88[var9][var10] == null) {
                                            class8.field88[var9][var10] = new byte[4096];
                                        }
                                        class8.field88[var9][var10][(-var12 + 63 << 6) - -var11] = var14;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var15 = 0; ~var15 > ~(var2 ? 64 : 4096); ++var15) {
                            byte var16 = arg1.method1682(3390);
                            if (var16 != 0) {
                                ++arg1.field4335;
                            }
                        }
                    }
                }
                ++field1850;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lr;B)V")
    public static final void method659(class66 arg0, byte arg1) {
        ++field1864;
        class42.field692 = arg0;
        if (class95.field1835.field2184 != null) {
            try {
                class66 var2 = class122.field2304.method480(class95.field1835.field2184, (byte) -31);
                class66 var3 = class8.field72.method480(class95.field1835.field2184, (byte) -31);
                class66 var4 = class212.method1372(2, new class66[] { var2, class85.field1671, arg0, class81.field1579, var3 });
                class66 var5;
                if (arg0.method460((byte) -118) != 0) {
                    var5 = class212.method1372(2, new class66[] { var4, class81.field1577, class222.method1415(-118, 94608000000L + class3.method13(17161)), class219.field3758, class101.method690(94608000L, -96) });
                } else {
                    var5 = class212.method1372(2, new class66[] { var4, class40.field655 });
                }
                if (arg1 > 118) {
                    class212.method1372(2, new class66[] { class129.field2401, var5, class102.field1996 }).method469((byte) -45, class95.field1835.field2184);
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
    public static final void method660(int arg0, int arg1) {
        class16 var2 = class110.field2124[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class16 var4 = class110.field2124[var3][arg0][arg1] = class110.field2124[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field215;
                for (int var5 = 0; var5 < var4.field219; ++var5) {
                    class44 var6 = var4.field220[var5];
                    if ((var6.field780 >> 29 & 3L) == 2L && var6.field791 == arg0 && var6.field790 == arg1) {
                        --var6.field786;
                    }
                }
            }
        }
        if (class110.field2124[0][arg0][arg1] == null) {
            class110.field2124[0][arg0][arg1] = new class16(0, arg0, arg1);
        }
        class110.field2124[0][arg0][arg1].field228 = var2;
        class110.field2124[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field1857;
        if (arg2 != -1) {
            this.field1846 = -119;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field1853 = arg0.method1674(arg2 + 1355769545);
                                }
                            } else {
                                this.field1838 = arg0.method1674(arg2 + 1355769545);
                            }
                        } else {
                            this.field1846 = arg0.method1674(1355769544);
                        }
                    } else {
                        this.field1849 = arg0.method1674(1355769544);
                    }
                } else {
                    this.field1865 = arg0.method1674(1355769544);
                }
            } else {
                this.field1840 = arg0.method1674(1355769544);
            }
        } else {
            this.field1848 = arg0.method1674(1355769544);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
    public static final void method661(byte arg0) {
        if (arg0 <= 14) {
            method665(-56, 26);
        }
        int var1 = class84.field1627.method572((byte) 0, 8);
        if (client.field1650 > var1) {
            for (int var2 = var1; var2 < client.field1650; ++var2) {
                class70.field1404[class4.field45++] = class192.field3335[var2];
            }
        }
        ++field1863;
        if (var1 > client.field1650) {
            throw new RuntimeException("gppov1");
        } else {
            client.field1650 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class192.field3335[var3];
                class45 var5 = class59.field988[var4];
                int var6 = class84.field1627.method572((byte) 0, 1);
                if (var6 == 0) {
                    class192.field3335[client.field1650++] = var4;
                    var5.field2091 = class75.field1501;
                } else {
                    int var7 = class84.field1627.method572((byte) 0, 2);
                    if (var7 == 0) {
                        class192.field3335[client.field1650++] = var4;
                        var5.field2091 = class75.field1501;
                        class83.field1599[class240.field4170++] = var4;
                    } else if (var7 == 1) {
                        class192.field3335[client.field1650++] = var4;
                        var5.field2091 = class75.field1501;
                        int var8 = class84.field1627.method572((byte) 0, 3);
                        var5.method734(false, var8, (byte) 21);
                        int var9 = class84.field1627.method572((byte) 0, 1);
                        if (var9 == 1) {
                            class83.field1599[class240.field4170++] = var4;
                        }
                    } else if (var7 == 2) {
                        class192.field3335[client.field1650++] = var4;
                        var5.field2091 = class75.field1501;
                        int var10 = class84.field1627.method572((byte) 0, 3);
                        var5.method734(true, var10, (byte) 21);
                        int var11 = class84.field1627.method572((byte) 0, 3);
                        var5.method734(true, var11, (byte) 21);
                        int var12 = class84.field1627.method572((byte) 0, 1);
                        if (~var12 == -2) {
                            class83.field1599[class240.field4170++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class70.field1404[class4.field45++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        class49.method347((byte) -128);
        if (arg0 <= -22) {
            ++field1855;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IBI)Z")
    private final boolean method662(int arg0, byte arg1, int arg2) {
        ++field1852;
        int var4 = (arg0 + arg2) * this.field1846 >> 12;
        if (arg1 <= 13) {
            this.field1865 = 10;
        }
        int var5 = class146.field2668[(var4 * 255 & 1048488) >> 12];
        int var6 = (var5 << 12) / this.field1846;
        int var7 = (var6 << 12) / this.field1853;
        int var8 = this.field1838 * var7 >> 12;
        return var8 > -arg0 + arg2 && -arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(B)V")
    public static void method663(byte arg0) {
        field1854 = null;
        field1862 = null;
        field1866 = null;
        field1845 = null;
        field1867 = null;
        field1851 = null;
        if (arg0 != -66) {
            field1860 = -85;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field1839;
        if (arg0 != -61) {
            field1851 = null;
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = class19.field261[arg1] + -2048;
            for (int var5 = 0; ~class199.field3432 < ~var5; ++var5) {
                int var6 = class10.field120[var5] + -2048;
                int var7 = this.field1840 + var4;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field1848 + var6;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 > 2048 ? var11 - 4096 : var11;
                int var13 = this.field1865 + var6;
                int var14 = this.field1849 + var4;
                int var15 = var13 >= -2048 ? var13 : var13 + 4096;
                int var16 = ~var15 < -2049 ? var15 + -4096 : var15;
                int var17 = ~var14 <= 2047 ? var14 : var14 - -4096;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method657(var12, (byte) 118, var9) && !this.method662(var16, (byte) 35, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(BI)Lhe;")
    public static final class234 method664(byte arg0, int arg1) {
        ++field1844;
        class234 var2 = (class234) class84.field1628.method1617(arg0 + 14285, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class218.field3750.method135(class244.method1606(arg1, 72), arg0 ^ 81, class41.method272(arg1, 654593194));
            class234 var4 = new class234();
            if (var3 != null) {
                var4.method1530(126, new class249(var3));
            }
            if (arg0 != 81) {
                return null;
            } else {
                class84.field1628.method1615(var4, 123, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)Lnd;")
    public static final class206 method665(int arg0, int arg1) {
        ++field1841;
        class206 var2 = (class206) class200.field3448.method1617(14366, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class97.field1909.method135(class62.method410(arg0, 522), 0, class107.method732(arg0, -95));
            class206 var4 = new class206();
            var4.field3568 = arg0;
            if (var3 != null) {
                var4.method1335(new class249(var3), (byte) -53);
            }
            int var5 = 100 / ((-43 - arg1) / 50);
            var4.method1344(24381);
            class200.field3448.method1615(var4, 104, (long) arg0);
            return var4;
        }
    }
}
