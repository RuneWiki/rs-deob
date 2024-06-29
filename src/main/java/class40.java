import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 extends class128 {

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "[J")
    private long[] field889 = new long[10];

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Ldb;")
    public static class21 field895 = new class21(4096);

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Lhb;")
    private static class44 field905 = class102.method810("Please contact customer support)3", -28606);

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "Lhb;")
    public static class44 field906 = class102.method810("::fpson", -28606);

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "[I")
    public static int[] field908 = new int[100];

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "Lhb;")
    public static class44 field907 = class102.method810("", -28606);

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "Lhb;")
    public static class44 field909 = field905;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "J")
    private long field887;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Ljb;")
    public static class56 field903;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
    public static int[] field888;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method347(boolean arg0) {
        field900++;
        for (class61 var1 = (class61) class46.field1134.method443((byte) -111); var1 != null; var1 = (class61) class46.field1134.method434(arg0)) {
            if (var1.field1545 != null) {
                class41.field948.method28(var1.field1545);
                var1.field1545 = null;
            }
            if (var1.field1542 != null) {
                class41.field948.method28(var1.field1542);
                var1.field1542 = null;
            }
        }
        if (!arg0) {
            field904 = 90;
        }
        class46.field1134.method450((byte) 111);
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V", line = 37)
    public static final void method348(int arg0) {
        field898++;
        int var1 = class48.field1193 * 128 + 64;
        int var2 = class52.field1298 * 128 + 64;
        int var3 = class55.method507(var2, class79.field1993, var1, -1) - class35.field851;
        if (class88.field2236 < var3) {
            class88.field2236 += (var3 - class88.field2236) * class47.field1170 / 1000 + class41.field935;
            if (var3 < class88.field2236) {
                class88.field2236 = var3;
            }
        }
        if (var2 > class51.field1279) {
            class51.field1279 += class41.field935 + (var2 - class51.field1279) * class47.field1170 / 1000;
            if (var2 < class51.field1279) {
                class51.field1279 = var2;
            }
        }
        if (class130.field3122 < var1) {
            class130.field3122 += class41.field935 + (var1 - class130.field3122) * class47.field1170 / 1000;
            if (class130.field3122 > var1) {
                class130.field3122 = var1;
            }
        }
        if (var3 < class88.field2236) {
            class88.field2236 -= (class88.field2236 - var3) * class47.field1170 / 1000 + class41.field935;
            if (var3 > class88.field2236) {
                class88.field2236 = var3;
            }
        }
        if (var2 < class51.field1279) {
            class51.field1279 -= (class51.field1279 - var2) * class47.field1170 / 1000 + class41.field935;
            if (class51.field1279 < var2) {
                class51.field1279 = var2;
            }
        }
        if (var1 < class130.field3122) {
            class130.field3122 -= (class130.field3122 - var1) * class47.field1170 / 1000 + class41.field935;
            if (var1 > class130.field3122) {
                class130.field3122 = var1;
            }
        }
        int var4 = class75.field1914 * 128 + 64;
        int var5 = class16.field327 * 128 + 64;
        int var6 = class55.method507(var4, class79.field1993, var5, -1) - class9.field175;
        int var7 = var5 - class130.field3122;
        int var8 = var6 - class88.field2236;
        int var9 = var4 - class51.field1279;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class101.field2579;
        if (class95.field2420 < var11) {
            class95.field2420 += (var11 - class95.field2420) * class35.field849 / 1000 + class67.field1684;
            if (class95.field2420 > var11) {
                class95.field2420 = var11;
            }
        }
        if (class95.field2420 > var11) {
            class95.field2420 -= (class95.field2420 - var11) * class35.field849 / 1000 + class67.field1684;
            if (class95.field2420 < var11) {
                class95.field2420 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class101.field2579 += class67.field1684 + class35.field849 * var13 / 1000;
            class101.field2579 &= 0x7FF;
        }
        if (arg0 > var13) {
            class101.field2579 -= -var13 * class35.field849 / 1000 + class67.field1684;
            class101.field2579 &= 0x7FF;
        }
        int var14 = var12 - class101.field2579;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class101.field2579 = var12;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I", line = 193)
    public final int method73(int arg0, int arg1, int arg2) {
        field894++;
        int var4 = this.field896;
        this.field896 = 1;
        int var5 = this.field892;
        this.field892 = 300;
        this.field887 = System.currentTimeMillis();
        if (this.field889[this.field890] == 0L) {
            this.field892 = var5;
            this.field896 = var4;
        } else if (this.field887 > this.field889[this.field890]) {
            this.field892 = (int) ((long) (arg2 * 2560) / (this.field887 - this.field889[this.field890]));
        }
        if (this.field892 < 25) {
            this.field892 = 25;
        }
        if (this.field892 > 256) {
            this.field892 = 256;
            this.field896 = (int) ((long) arg2 - (this.field887 - this.field889[this.field890]) / 10L);
        }
        if (arg2 < this.field896) {
            this.field896 = arg2;
        }
        this.field889[this.field890] = this.field887;
        this.field890 = (this.field890 + 1) % 10;
        if (this.field896 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field889[var6] != 0L) {
                    this.field889[var6] += this.field896;
                }
            }
        }
        if (arg0 > this.field896) {
            this.field896 = arg0;
        }
        int var7 = arg1;
        class47.method447((byte) -86, (long) this.field896);
        while (this.field899 < 256) {
            var7++;
            this.field899 += this.field892;
        }
        this.field899 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lhb;BZLhb;)V", line = 266)
    public static final void method349(class44 arg0, byte arg1, boolean arg2, class44 arg3) {
        field901++;
        if (class104.field2665) {
            class104.field2665 = false;
            class14.method100((byte) -76);
            class57.method544(1267);
            class21.method151(true);
            class96.method765(50);
            class27.method223(class71.field1745, 1, class103.field2631, class89.field2263, class39.field881);
            class28.method232(class39.field873, class47.field1152 == -1, -1, class107.field2728, 26691);
            class117.field2868 = true;
            class27.field619 = true;
            class64.field1626 = true;
        }
        short var4 = 151;
        class57.method537(-1);
        int var6 = var4 - 3;
        class103.field2631.method294(arg0, 257, var6, 0);
        class103.field2631.method294(arg0, 256, var6 - 1, 16777215);
        if (arg1 != 95) {
            field895 = null;
        }
        if (arg3 != null) {
            var6 += 15;
            if (arg2) {
                int var5 = class103.field2631.method297(arg3) + 4;
                class112.method856(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class103.field2631.method294(arg3, 257, var6, 0);
            class103.field2631.method294(arg3, 256, var6 - 1, 16777215);
        }
        class34.method334(1024);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 320)
    public static int method350(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 672)
    public class40() {
        this.method72(0);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 346)
    public final void method72(int arg0) {
        this.field896 = 1;
        this.field899 = 0;
        this.field892 = 256;
        this.field887 = System.currentTimeMillis();
        field893++;
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field889[var2] = this.field887;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)I", line = 367)
    public static final int method351(int arg0, int arg1, int arg2) {
        field886++;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 < 44) {
            field906 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 395)
    public final void method71(int arg0) {
        int var2 = 93 / ((-arg0 - 15) / 50);
        field897++;
        for (int var3 = 0; var3 < 10; var3++) {
            this.field889[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lm;B)V", line = 414)
    public static final void method352(class72 arg0, byte arg1) {
        field891++;
        int var2 = arg0.field1800;
        if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
            if (var2 == 1 && class105.field2686 == 0) {
                arg0.field1787 = 0;
                arg0.field1794 = class82.field2095;
            } else if (var2 == 1 && class105.field2686 == 1) {
                arg0.field1794 = class95.field2424;
                arg0.field1787 = 0;
            } else if (var2 == 2 && class105.field2686 != 2) {
                arg0.field1794 = class27.field651;
                arg0.field1787 = 0;
            } else {
                if (var2 <= 700) {
                    var2--;
                } else {
                    var2 -= 601;
                }
                int var3 = class49.field1208;
                if (class105.field2686 != 2) {
                    var3 = 0;
                }
                if (var3 <= var2) {
                    arg0.field1787 = 0;
                    arg0.field1794 = class51.field1274;
                } else {
                    arg0.field1794 = class52.field1300[var2];
                    arg0.field1787 = 1;
                }
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class49.field1208;
            if (class105.field2686 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field1787 = 0;
                arg0.field1794 = class51.field1274;
            } else {
                if (class25.field600[var2] == 0) {
                    arg0.field1794 = class117.method903(new class44[] { class93.field2367, class64.field1636 }, false);
                } else if (class25.field600[var2] < 5000) {
                    if (class25.field600[var2] == class84.field2142) {
                        arg0.field1794 = class117.method903(new class44[] { class109.field2738, class4.field104, class116.method893(10, class25.field600[var2]) }, false);
                    } else {
                        arg0.field1794 = class117.method903(new class44[] { class100.field2534, class4.field104, class116.method893(10, class25.field600[var2]) }, false);
                    }
                } else if (class25.field600[var2] == class84.field2142) {
                    arg0.field1794 = class117.method903(new class44[] { class109.field2738, class118.field2892, class116.method893(10, class25.field600[var2] - 5000) }, false);
                } else {
                    arg0.field1794 = class117.method903(new class44[] { class100.field2534, class118.field2892, class116.method893(10, class25.field600[var2] - 5000) }, false);
                }
                arg0.field1787 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class49.field1208;
            if (class105.field2686 != 2) {
                var5 = 0;
            }
            arg0.field1817 = var5 * 15 + 20;
            if (arg0.field1817 <= arg0.field1760) {
                arg0.field1817 = arg0.field1760 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class105.field2686 == 0) {
                arg0.field1794 = class86.field2187;
                arg0.field1787 = 0;
            } else if (var2 == 1 && class105.field2686 == 0) {
                arg0.field1794 = class27.field651;
                arg0.field1787 = 0;
            } else {
                int var6 = class43.field983;
                if (class105.field2686 == 0) {
                    var6 = 0;
                }
                if (var2 >= var6) {
                    arg0.field1794 = class51.field1274;
                    arg0.field1787 = 0;
                } else {
                    arg0.field1794 = class43.method361(class51.field1235[var2], true).method395(21611);
                    arg0.field1787 = 1;
                }
            }
        } else if (var2 == 503) {
            arg0.field1817 = class43.field983 * 15 + 20;
            if (arg0.field1817 <= arg0.field1760) {
                arg0.field1817 = arg0.field1760 + 1;
            }
        } else if (var2 == 327) {
            arg0.field1819 = 150;
            arg0.field1807 = (int) (Math.sin((double) class2.field73 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1823 = 5;
            arg0.field1808 = 0;
        } else {
            if (arg1 >= -46) {
                field907 = null;
            }
            if (var2 == 324) {
                if (class121.field2955 == -1) {
                    class121.field2955 = arg0.field1798;
                    class44.field1060 = arg0.field1764;
                }
                if (class95.field2413.field493) {
                    arg0.field1798 = class121.field2955;
                } else {
                    arg0.field1798 = class44.field1060;
                }
            } else if (var2 == 325) {
                if (class121.field2955 == -1) {
                    class121.field2955 = arg0.field1798;
                    class44.field1060 = arg0.field1764;
                }
                if (class95.field2413.field493) {
                    arg0.field1798 = class44.field1060;
                } else {
                    arg0.field1798 = class121.field2955;
                }
            } else if (var2 == 600) {
                arg0.field1794 = class117.method903(new class44[] { class51.field1255, class27.field646 }, false);
            } else if (var2 == 620) {
                if (class51.field1240 < 1) {
                    arg0.field1794 = class51.field1274;
                } else if (class16.field310) {
                    arg0.field1794 = class78.field1970;
                    arg0.field1831 = 16711680;
                } else {
                    arg0.field1831 = 16777215;
                    arg0.field1794 = class82.field2107;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 684)
    public static void method353(byte arg0) {
        field888 = null;
        field908 = null;
        field906 = null;
        if (arg0 < 103) {
            method352(null, (byte) -89);
        }
        field895 = null;
        field905 = null;
        field903 = null;
        field907 = null;
        field909 = null;
    }
}
