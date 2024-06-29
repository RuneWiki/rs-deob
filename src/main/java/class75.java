import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
    private int[] field1890;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[B")
    private byte[] field1902;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    private int[] field1896;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1899 = 0;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Z")
    public static boolean field1901 = false;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lhb;")
    public static class44 field1894 = class102.method810("(U", -28606);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lhb;")
    public static class44 field1904 = class102.method810("leuchten1:", -28606);

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field1907 = 0;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lhb;")
    private static class44 field1910 = class102.method810("Your ignore list is full)3 Max of 100 hit", -28606);

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Lhb;")
    private static class44 field1911 = class102.method810(" seconds)3", -28606);

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lhb;")
    public static class44 field1912 = field1911;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lhb;")
    private static class44 field1905 = class102.method810("Unable to connect)3", -28606);

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lhb;")
    public static class44 field1908 = field1905;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lhb;")
    public static class44 field1895 = field1910;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lhb;")
    public static class44 field1897 = field1905;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Ltd;")
    public static class116 field1900;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "[[B")
    public static byte[][] field1913;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI[B[BII)I", line = 12)
    public final int method633(boolean arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field1893++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1890[var8];
            }
            int var11;
            if ((var11 = this.field1890[var8]) < 0) {
                arg3[arg1++] = (byte) ~var11;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1890[var8];
            }
            int var12;
            if ((var12 = this.field1890[var8]) < 0) {
                arg3[arg1++] = (byte) ~var12;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1890[var8];
            }
            int var13;
            if ((var13 = this.field1890[var8]) < 0) {
                arg3[arg1++] = (byte) ~var13;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1890[var8];
            }
            int var14;
            if ((var14 = this.field1890[var8]) < 0) {
                arg3[arg1++] = (byte) ~var14;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1890[var8];
            }
            int var15;
            if ((var15 = this.field1890[var8]) < 0) {
                arg3[arg1++] = (byte) ~var15;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1890[var8];
            }
            int var16;
            if ((var16 = this.field1890[var8]) < 0) {
                arg3[arg1++] = (byte) ~var16;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1890[var8];
            }
            int var17;
            if ((var17 = this.field1890[var8]) < 0) {
                arg3[arg1++] = (byte) ~var17;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1890[var8];
            }
            int var18;
            if ((var18 = this.field1890[var8]) < 0) {
                arg3[arg1++] = (byte) ~var18;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg0) {
            field1910 = null;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V", line = 174)
    public static final void method634(int arg0, byte arg1) {
        if (arg0 == -3) {
            class2.method14(class63.field1612, class62.field1574, -92, class44.field1115);
        } else if (arg0 == -2) {
            class2.method14(class44.field1048, class1.field25, -81, class44.field1087);
        } else if (arg0 == -1) {
            class2.method14(class88.field2248, class62.field1573, -88, class44.field1067);
        } else if (arg0 == 3) {
            class2.method14(class44.field1084, class13.field247, -86, class44.field1068);
        } else if (arg0 == 4) {
            class2.method14(class82.field2117, class93.field2368, -80, class44.field1094);
        } else if (arg0 == 5) {
            class2.method14(class41.field926, class94.field2400, -94, class44.field1099);
        } else if (arg0 == 6) {
            class2.method14(class92.field2348, class86.field2194, -86, class44.field1057);
        } else if (arg0 == 7) {
            class2.method14(class69.field1711, class15.field302, -98, class44.field1111);
        } else if (arg0 == 8) {
            class2.method14(field1908, class107.field2700, -89, class44.field1033);
        } else if (arg0 == 9) {
            class2.method14(class11.field208, class57.field1483, -72, class44.field1116);
        } else if (arg0 == 10) {
            class2.method14(field1897, class39.field874, -109, class44.field1118);
        } else if (arg0 == 11) {
            class2.method14(class131.field3192, class9.field193, -122, class44.field1114);
        } else if (arg0 == 12) {
            class2.method14(class98.field2487, class77.field1941, -68, class44.field1073);
        } else if (arg0 == 13) {
            class2.method14(class101.field2559, class62.field1570, -101, class44.field1054);
        } else if (arg0 == 14) {
            class2.method14(class101.field2560, class101.field2554, -105, class44.field1049);
        } else if (arg0 == 16) {
            class2.method14(class34.field836, class101.field2561, -84, class44.field1081);
        } else if (arg0 == 17) {
            class2.method14(class9.field194, class42.field975, -87, class44.field1105);
        } else if (arg0 == 18) {
            class2.method14(class47.field1174, class51.field1281, -100, class44.field1095);
        } else if (arg0 == 20) {
            class2.method14(class82.field2112, class62.field1585, -98, class44.field1077);
        } else if (arg0 == 22) {
            class2.method14(class66.field1668, class72.field1754, -99, class44.field1036);
        } else if (arg0 == 23) {
            class2.method14(class2.field49, class101.field2582, -108, class44.field1085);
        } else if (arg0 == 24) {
            class2.method14(class36.field864, class40.field909, -84, class44.field1034);
        } else if (arg0 == 25) {
            class2.method14(class127.field3061, class62.field1572, -111, class44.field1109);
        } else if (arg0 == 26) {
            class2.method14(class82.field2114, class104.field2659, -65, class44.field1079);
        } else if (arg0 == 27) {
            class2.method14(class44.field1080, class35.field850, -94, class44.field1097);
        } else {
            class2.method14(class107.field2725, class62.field1582, -102, class44.field1052);
        }
        class131.method1009(10, -67);
        if (arg1 <= 112) {
            field1915 = 118;
        }
        field1906++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII[B[B)I", line = 290)
    public final int method635(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field1903++;
        int var7 = arg1 + arg3;
        int var8 = 0;
        int var9 = arg2 << 3;
        if (arg0 != -1) {
            return -44;
        }
        while (var7 > arg1) {
            int var10 = arg4[arg1] & 0xFF;
            int var11 = this.field1896[var10];
            byte var12 = this.field1902[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class40.method350(var16, var11 >>> var17));
            if (var13 < var15) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var15) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 362)
    public static void method636(int arg0) {
        field1900 = null;
        field1913 = null;
        if (arg0 != 0) {
            method637(120);
        }
        field1908 = null;
        field1912 = null;
        field1894 = null;
        field1897 = null;
        field1895 = null;
        field1911 = null;
        field1904 = null;
        field1910 = null;
        field1905 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 413)
    public static final void method637(int arg0) {
        field1909++;
        class101.method803((byte) 36);
        if (class69.field1709 != 10) {
            return;
        }
        int var1 = class128.field3074;
        int var2 = class57.field1508 - 202;
        int var3 = class40.field902 - 171;
        if (arg0 != 20) {
            return;
        }
        if (field1915 == 0) {
            byte var4 = 100;
            byte var5 = 120;
            if (var1 == 1 && var2 >= var4 - 75 && var2 <= var4 + 75 && var3 >= var5 - 20 && var3 <= var5 + 20) {
                field1915 = 3;
                class2.field81 = 0;
            }
            short var6 = 260;
            if (var1 == 1 && var2 >= var6 - 75 && var2 <= var6 + 75 && var5 - 20 <= var3 && var5 + 20 >= var3) {
                class89.field2292 = class44.field1044;
                field1915 = 2;
                class89.field2284 = class44.field1093;
                class89.field2290 = class4.field106;
                class2.field81 = 0;
                return;
            }
        } else if (field1915 == 2) {
            byte var9 = 60;
            int var15 = var9 + 30;
            short var10 = 150;
            byte var11 = 100;
            if (var1 == 1 && var3 >= var15 - 15 && var3 < var15) {
                class2.field81 = 0;
            }
            var15 += 15;
            if (var1 == 1 && var3 >= var15 - 15 && var15 > var3) {
                class2.field81 = 1;
            }
            var15 += 15;
            if (var1 == 1 && var11 - 75 <= var2 && var11 + 75 >= var2 && var10 - 20 <= var3 && var3 <= var10 + 20) {
                class89.field2282 = class89.field2282.method392((byte) -126).method395(21611);
                class2.method14(class44.field1041, class86.field2195, -128, class44.field1059);
                class131.method1009(20, arg0 - 134);
                return;
            }
            short var12 = 260;
            if (var1 == 1 && var2 >= var12 - 75 && var2 <= var12 + 75 && var3 >= var10 - 20 && var10 + 20 >= var3) {
                class89.field2285 = class89.field2286;
                field1915 = 0;
                class89.field2282 = class89.field2286;
            }
            while (true) {
                while (class129.method961(-14)) {
                    boolean var13 = false;
                    for (int var14 = 0; class107.field2723.method414((byte) 91) > var14; var14++) {
                        if (class31.field771 == class107.field2723.method385(arg0 + 235, var14)) {
                            var13 = true;
                            break;
                        }
                    }
                    if (class2.field81 == 0) {
                        if (class100.field2535 == 85 && class89.field2282.method414((byte) 31) > 0) {
                            class89.field2282 = class89.field2282.method396((byte) -107, 0, class89.field2282.method414((byte) 105) - 1);
                        }
                        if (class100.field2535 == 84 || class100.field2535 == 80) {
                            class2.field81 = 1;
                        }
                        if (var13 && class89.field2282.method414((byte) 43) < 12) {
                            class89.field2282 = class89.field2282.method397(true, class31.field771);
                        }
                    } else if (class2.field81 == 1) {
                        if (class100.field2535 == 85 && class89.field2285.method414((byte) 66) > 0) {
                            class89.field2285 = class89.field2285.method396((byte) -126, 0, class89.field2285.method414((byte) 81) - 1);
                        }
                        if (class100.field2535 == 84 || class100.field2535 == 80) {
                            class2.field81 = 0;
                        }
                        if (var13 && class89.field2285.method414((byte) 89) < 20) {
                            class89.field2285 = class89.field2285.method397(true, class31.field771);
                        }
                    }
                }
                return;
            }
        } else if (field1915 == 3) {
            short var7 = 150;
            short var8 = 180;
            if (var1 == 1 && var2 >= var8 - 75 && var8 + 75 >= var2 && var3 >= var7 - 20 && var3 <= var7 + 20) {
                field1915 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V", line = 560)
    public class75(byte[] arg0) {
        int var2 = arg0.length;
        this.field1890 = new int[8];
        int var3 = 0;
        this.field1902 = arg0;
        this.field1896 = new int[var2];
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1896[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class40.method350(var11, var12);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1890[var14] == 0) {
                            this.field1890[var14] = var3;
                        }
                        var14 = this.field1890[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1890.length) {
                        int[] var18 = new int[this.field1890.length * 2];
                        for (int var19 = 0; var19 < this.field1890.length; var19++) {
                            var18[var19] = this.field1890[var19];
                        }
                        this.field1890 = var18;
                    }
                }
                this.field1890[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 692)
    public static final void method638(boolean arg0) {
        class14.method96(100);
        field1892++;
        if (class71.field1742 == 1) {
            class78.field1950[class111.field2768 / 100].method428(class33.field792 - 8 - 4, class61.field1550 - 8 + -4);
        }
        if (class71.field1742 == 2) {
            class78.field1950[class111.field2768 / 100 + 4].method428(class33.field792 - 8 - 4, class61.field1550 + -12);
        }
        if (class22.field458 != -1) {
            class66.method582(2907, class22.field458);
            class31.method307(0, 0, -7291, -1, 512, 334, 4, 0, class22.field458);
        }
        if (class125.field3032 != -1) {
            class66.method582(2907, class125.field3032);
            class31.method307(0, 0, -7291, -1, 512, 334, 0, 0, class125.field3032);
        }
        class121.method935(116);
        if (!class15.field289) {
            class44.method404(10);
            class13.method88(false);
        } else if (class25.field584 == 0) {
            class55.method504(-21975);
        }
        if (!arg0) {
            field1908 = null;
        }
        if (class21.field425 == 1) {
            class39.field879.method428(472, 296);
        }
        if (class64.field1637) {
            short var1 = 507;
            byte var2 = 20;
            int var3 = 16776960;
            if (class81.field2089 < 30 && class81.field2085) {
                var3 = 16711680;
            }
            if (class81.field2089 < 20 && !class81.field2085) {
                var3 = 16711680;
            }
            class103.field2631.method299(class117.method903(new class44[] { class82.field2099, class116.method893(10, class81.field2089) }, false), var1, var2, var3);
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            int var6 = 16776960;
            if (var5 > 32768 && class81.field2085) {
                var6 = 16711680;
            }
            int var10 = var2 + 15;
            if (var5 > 65536 && !class81.field2085) {
                var6 = 16711680;
            }
            class103.field2631.method299(class117.method903(new class44[] { class61.field1531, class116.method893(10, var5), class42.field950 }, !arg0), var1, var10, var6);
            var10 += 15;
            if (class117.field2868) {
                class103.field2631.method299(class4.field100, var1, var10, 16711680);
                var10 += 15;
                class117.field2868 = false;
            }
            if (class27.field619) {
                class103.field2631.method299(class25.field591, var1, var10, 16711680);
                var10 += 15;
                class27.field619 = false;
            }
            if (class64.field1626) {
                class103.field2631.method299(class78.field1958, var1, var10, 16711680);
                class64.field1626 = false;
                var10 += 15;
            }
        }
        if (class35.field853 == 0) {
            return;
        }
        int var7 = class35.field853 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 >= 10) {
            class103.field2631.method301(class117.method903(new class44[] { class55.field1405, class116.method893(10, var8), class92.field2337, class116.method893(10, var9) }, false), 4, 329, 16776960);
        } else {
            class103.field2631.method301(class117.method903(new class44[] { class55.field1405, class116.method893(10, var8), class93.field2356, class116.method893(10, var9) }, false), 4, 329, 16776960);
        }
    }
}
