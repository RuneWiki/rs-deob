import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class82 extends class37 {

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    private int field1908 = -1;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Ldd;")
    private static class35 field1906 = class180.method1196((byte) -77, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "Ldd;")
    public static class35 field1897 = field1906;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "Ldd;")
    public static class35 field1911 = class180.method1196((byte) -1, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "[I")
    public static int[] field1912 = new int[] { 1, -2, -1, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 4, 7, 0, 0, 20, 0, 0, 5, -2, 5, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 6, 0, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 6, 0, -2, 0, 6, 4, 0, 0, 0, 0, -1, 0, 0, 0, -1, 4, 0, 7, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 3, 10, -2, 0, 2, 0, 0, 0, 0, 0, 0, 3, 0, -1, 0, -1, 0, 0, 0, 0, 0, 7, 0, 0, 0, 6, 0, 12, 0, 0, 0, 0, 4, 0, 4, -2, 0, 6, 0, 15, 0, 6, 0, 0, 7, 0, 1, 0, 0, 0, 0, -2, 0, -2, 0, 6, 0, 0, 6, 0, 0, 14, 0, 0, -1, 0, -2, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 8, 0, 0, -2, 0, 0, 5, 0, 3, 2, 0, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 6, 0, 24, 0, -1, 0, 0, -2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0 };

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    public static int field1913 = 5063219;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    private int field1900;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "Lag;")
    public static class8 field1910;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[I")
    public static int[] field1902;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "[I")
    private int[] field1915;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)Z")
    private final boolean method621(int arg0) {
        ++field1909;
        if (arg0 != 29976) {
            method624(32, (class182) null, -80, false, -41);
        }
        if (this.field1915 != null) {
            return true;
        } else if (this.field1908 >= 0) {
            int var2 = !class65.field1549.method835(this.field1908, 87) ? 128 : 64;
            this.field1915 = class65.field1549.method836(false, this.field1908);
            this.field1900 = var2;
            this.field1914 = var2;
            return this.field1915 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field832.method653(-30711, arg0);
        ++field1901;
        if (super.field832.field1978 && this.method621(29976)) {
            int var4 = (class35.field782 != this.field1914 ? this.field1914 * arg0 / class35.field782 : arg0) * this.field1900;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class72.field1719 != this.field1900) {
                for (int var8 = 0; ~class72.field1719 < ~var8; ++var8) {
                    int var9 = this.field1900 * var8 / class72.field1719;
                    int var10 = this.field1915[var4 + var9];
                    var7[var8] = class208.method1372(4080, var10 << 4);
                    var6[var8] = class208.method1372(var10, 65280) >> 4;
                    var5[var8] = class208.method1372(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class72.field1719 < ~var11; ++var11) {
                    int var12 = this.field1915[var4++];
                    var7[var11] = class208.method1372(255, var12) << 4;
                    var6[var11] = class208.method1372(var12 >> 4, 4080);
                    var5[var11] = class208.method1372(var12, 16711680) >> 12;
                }
            }
        }
        if (arg1 <= 5) {
            this.field1914 = 120;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lnf;)V")
    public static final void method622(class131 arg0) {
        for (int var1 = arg0.field2816; var1 <= arg0.field2827; ++var1) {
            for (int var2 = arg0.field2812; var2 <= arg0.field2828; ++var2) {
                class54 var3 = class191.field3853[arg0.field2819][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1218; ++var4) {
                        if (var3.field1225[var4] == arg0) {
                            --var3.field1218;
                            for (int var5 = var4; var5 < var3.field1218; ++var5) {
                                var3.field1225[var5] = var3.field1225[var5 + 1];
                                var3.field1220[var5] = var3.field1220[var5 + 1];
                            }
                            var3.field1225[var3.field1218] = null;
                            break;
                        }
                    }
                    var3.field1209 = 0;
                    for (int var6 = 0; var6 < var3.field1218; ++var6) {
                        var3.field1209 |= var3.field1220[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
    public final int method366(byte arg0) {
        ++field1899;
        if (arg0 != 76) {
            method622((class131) null);
        }
        return this.field1908;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIB)V")
    public static final void method623(int arg0, int arg1, byte arg2) {
        ++field1898;
        if (class193.method1261((byte) 111, arg0)) {
            if (arg2 != -112) {
                method626(-72);
            }
            class58.method503(-34, arg1, class163.field3299[arg0]);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILtc;IZI)V")
    public static final void method624(int arg0, class182 arg1, int arg2, boolean arg3, int arg4) {
        ++field1905;
        if (arg3) {
            field1911 = null;
        }
        if (~class59.field1469 > -401) {
            if (arg1.field3719 != null) {
                arg1 = arg1.method1211(104);
            }
            if (arg1 != null) {
                if (arg1.field3733) {
                    class35 var5 = arg1.field3751;
                    if (~arg1.field3754 != -1) {
                        var5 = class63.method529(new class35[] { var5, class39.method378(8, class71.field1704.field2262, arg1.field3754), class200.field3999, class24.field466, class3.method19(arg1.field3754, -29578), class35.field768 }, (byte) 102);
                    }
                    if (~class128.field2765 != -2) {
                        if (!class130.field2799) {
                            ++class113.field2483;
                            class35[] var6 = arg1.field3724;
                            if (class8.field117) {
                                var6 = class198.method1300(var6, 0);
                            }
                            if (var6 != null) {
                                for (int var7 = 4; ~var7 <= -1; --var7) {
                                    if (var6[var7] != null && !var6[var7].method337(-107, class124.field2721)) {
                                        ++class2.field31;
                                        byte var8 = 0;
                                        if (~var7 == -1) {
                                            var8 = 7;
                                        }
                                        if (var7 == 1) {
                                            var8 = 6;
                                        }
                                        if (var7 == 2) {
                                            var8 = 36;
                                        }
                                        if (~var7 == -4) {
                                            var8 = 43;
                                        }
                                        if (~var7 == -5) {
                                            var8 = 45;
                                        }
                                        class15.method125(arg0, class63.method529(new class35[] { class103.field2298, var5 }, (byte) 102), -21056, var6[var7], var8, arg2, (long) arg4);
                                    }
                                }
                            }
                            if (var6 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (var6[var9] != null && var6[var9].method337(-79, class124.field2721)) {
                                        ++class96.field2126;
                                        short var10 = 0;
                                        if (~class71.field1704.field2262 > ~arg1.field3754) {
                                            var10 = 2000;
                                        }
                                        short var11 = 0;
                                        if (var9 == 0) {
                                            var11 = 7;
                                        }
                                        if (var9 == 1) {
                                            var11 = 6;
                                        }
                                        if (var9 == 2) {
                                            var11 = 36;
                                        }
                                        if (var9 == 3) {
                                            var11 = 43;
                                        }
                                        if (var9 == 4) {
                                            var11 = 45;
                                        }
                                        if (~var11 != -1) {
                                            var11 += var10;
                                        }
                                        class15.method125(arg0, class63.method529(new class35[] { class103.field2298, var5 }, (byte) 120), -21056, var6[var9], var11, arg2, (long) arg4);
                                    }
                                }
                            }
                            class15.method125(arg0, class63.method529(new class35[] { class103.field2298, var5 }, (byte) 74), -21056, class52.field1181, (short) 1006, arg2, (long) arg4);
                            return;
                        }
                        if (~(class123.field2700 & 2) == -3) {
                            class15.method125(arg0, class63.method529(new class35[] { class165.field3343, class170.field3394, var5 }, (byte) 50), -21056, class125.field2736, (short) 16, arg2, (long) arg4);
                            ++class105.field2338;
                            return;
                        }
                    } else {
                        class15.method125(arg0, class63.method529(new class35[] { class159.field3233, class170.field3394, var5 }, (byte) 111), -21056, class63.field1516, (short) 1, arg2, (long) arg4);
                        ++class132.field2836;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
    public static void method625(int arg0) {
        field1910 = null;
        field1912 = null;
        field1906 = null;
        if (arg0 != 0) {
            method625(121);
        }
        field1911 = null;
        field1902 = null;
        field1897 = null;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
    public static final void method626(int arg0) {
        Object var1 = class97.field2149;
        synchronized (class97.field2149) {
            if (arg0 != 15226) {
                return;
            }
            if (class69.field1673 != 0) {
                class69.field1673 = 1;
                try {
                    class97.field2149.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        ++field1903;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (~arg0 == -1) {
            this.field1908 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            this.method366((byte) -79);
        }
        ++field1907;
    }
}
