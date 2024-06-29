import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class19 extends class130 {

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "[I")
    public static int[] field328 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "Lsd;")
    public static class166 field336 = class135.method935("title_mute", 0);

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field335 = 0;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Lsc;")
    public static class165 field329 = new class165();

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Lsd;")
    private static class166 field342 = class135.method935("Select a world", 0);

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "Lsd;")
    public static class166 field346 = field342;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "Lsd;")
    private static class166 field345 = class135.method935("yellow:", 0);

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "Lsd;")
    public static class166 field343 = field345;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Lsd;")
    public static class166 field344 = field345;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
    public static long field330;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Lbh;")
    public class19 field332;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lbh;")
    public class19 field340;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "[I")
    public static int[] field341;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public final void method116(int arg0) {
        field334++;
        if (this.field332 == null) {
            return;
        }
        this.field332.field340 = this.field340;
        this.field340.field332 = this.field332;
        if (arg0 == 256) {
            this.field332 = null;
            this.field340 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    public static final void method117(int arg0) {
        if (arg0 != -1) {
            field335 = 77;
        }
        field338++;
        try {
            if (class86.field1706 == null) {
                class86.field1706 = new class61(class35.field664, class22.method148(new class166[] { class170.field3275, class196.field3895, class51.field931 }, 0).method1149(33));
            } else {
                byte[] var1 = class86.field1706.method512((byte) 121);
                if (var1 != null) {
                    class53 var2 = new class53(var1);
                    class106.field2065 = var2.method405(2);
                    class9.field179 = new class143[class106.field2065];
                    for (int var3 = 0; var3 < class106.field2065; var3++) {
                        class143 var4 = class9.field179[var3] = new class143();
                        int var5 = var2.method405(2);
                        var4.field2776 = (var5 & 0x8000) != 0;
                        var4.field2770 = var5 & 0x7FFF;
                        var4.field2775 = var2.method436((byte) 93);
                        var4.field2783 = var2.method421((byte) 107);
                        var4.field2785 = var3;
                        var4.field2769 = class175.method1199(var4.field2775, 23177);
                    }
                    class79.method649(class9.field179, class9.field179.length - 1, 0, class166.field3148, 8989, class12.field220);
                    class86.field1706 = null;
                    class117.field2265 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class86.field1706 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public static final void method118(int arg0) {
        if (arg0 >= -127) {
            field341 = null;
        }
        class142.field2765.method71(500);
        field331++;
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
    public static final void method119(int arg0) {
        field327++;
        if (class160.field3073 == 0) {
            class131.field2556 = new class73(4, 104, 104, class74.field1511);
            for (int var1 = 0; var1 < 4; var1++) {
                class46.field822[var1] = new class141(104, 104);
            }
            class8.field152 = new class158(512, 512);
            class160.field3073 = 20;
            class12.field239 = class154.field2961;
            class150.field2931 = 5;
        } else if (class160.field3073 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = class40.field717[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class73.method599(var2, 500, 800, 512, 334, 25, 3500);
            class12.field239 = class189.field3603;
            class150.field2931 = 10;
            class160.field3073 = 30;
        } else if (class160.field3073 == 30) {
            class169.field3272 = class160.method1086(true, false, (byte) -122, 0, true);
            class172.field3298 = class160.method1086(true, false, (byte) -118, 1, true);
            class95.field1842 = class160.method1086(true, true, (byte) 90, 2, false);
            class63.field1301 = class160.method1086(true, false, (byte) -116, 3, true);
            class142.field2764 = class160.method1086(true, false, (byte) 76, 4, true);
            class138.field2693 = class160.method1086(true, true, (byte) 98, 5, true);
            class11.field213 = class160.method1086(false, true, (byte) 96, 6, true);
            class98.field1866 = class160.method1086(true, false, (byte) -120, 7, true);
            class3.field33 = class160.method1086(true, false, (byte) -112, 8, true);
            class120.field2348 = class160.method1086(true, true, (byte) -113, 9, false);
            class64.field1337 = class160.method1086(true, false, (byte) -119, 10, true);
            class18.field303 = class160.method1086(true, false, (byte) -121, 11, true);
            class129.field2529 = class160.method1086(true, false, (byte) -110, 12, true);
            class203.field4004 = class160.method1086(true, true, (byte) -117, 13, false);
            class134.field2608 = class160.method1086(false, false, (byte) 108, 14, true);
            class105.field2052 = class160.method1086(true, false, (byte) 23, 15, true);
            class160.field3073 = 40;
            class150.field2931 = 20;
            class12.field239 = class124.field2445;
        } else if (class160.field3073 == 40) {
            byte var7 = 0;
            int var8 = var7 + class169.field3272.method154((byte) 126) * 4 / 100;
            int var9 = var8 + class172.field3298.method154((byte) 127) * 4 / 100;
            int var10 = var9 + class95.field1842.method154((byte) 38) * 2 / 100;
            int var11 = var10 + class63.field1301.method154((byte) 4) * 2 / 100;
            int var12 = var11 + class142.field2764.method154((byte) 125) * 6 / 100;
            int var13 = var12 + class138.field2693.method154((byte) -115) * 4 / 100;
            int var14 = var13 + class11.field213.method154((byte) 126) * 2 / 100;
            int var15 = var14 + class98.field1866.method154((byte) 125) * 60 / 100;
            int var16 = var15 + class3.field33.method154((byte) 125) * 2 / 100;
            int var17 = var16 + class120.field2348.method154((byte) 126) * 2 / 100;
            int var18 = var17 + class64.field1337.method154((byte) -124) * 2 / 100;
            int var19 = var18 + class18.field303.method154((byte) 18) * 2 / 100;
            int var20 = var19 + class129.field2529.method154((byte) -111) * 2 / 100;
            int var21 = var20 + class203.field4004.method154((byte) 125) * 2 / 100;
            int var22 = var21 + class134.field2608.method154((byte) 127) * 2 / 100;
            int var23 = var22 + class105.field2052.method154((byte) 126) * 2 / 100;
            if (var23 == 100) {
                class160.field3073 = 45;
                class12.field239 = class22.field387;
                class150.field2931 = 30;
            } else {
                if (var23 != 0) {
                    class12.field239 = class22.method148(new class166[] { class53.field968, class174.method1192(false, var23), class33.field625 }, 0);
                }
                class150.field2931 = 30;
            }
        } else if (class160.field3073 == 45) {
            class97.method736(!class97.field1858, 2, (byte) 99, 22050);
            class56 var24 = new class56();
            var24.method465(128, 16, 9);
            class89.field1761 = class25.method192(false, 22050, class114.field2219, 0, class35.field664);
            class89.field1761.method1183(16128, var24);
            class39.method267(class105.field2052, 789221, class142.field2764, class134.field2608, var24);
            class153.field2949 = class25.method192(false, 2048, class114.field2219, 1, class35.field664);
            class11.field206 = new class149();
            class153.field2949.method1183(16128, class11.field206);
            class140.field2735 = new class87(22050, class161.field3075);
            class12.field239 = class185.field3563;
            class150.field2931 = 35;
            class160.field3073 = 50;
        } else if (class160.field3073 == 50) {
            int var25 = 0;
            if (class160.field3068 == null) {
                class160.field3068 = class23.method158(class203.field4004, class109.field2119, -41, class196.field3891, class3.field33);
            } else {
                var25++;
            }
            if (class154.field2960 == null) {
                class154.field2960 = class160.field3068;
            } else {
                var25++;
            }
            if (class92.field1805 == null) {
                class92.field1805 = class23.method158(class203.field4004, class191.field3632, -90, class196.field3891, class3.field33);
            } else {
                var25++;
            }
            if (class125.field2464 == null) {
                class125.field2464 = class23.method158(class203.field4004, class143.field2778, -10, class196.field3891, class3.field33);
            } else {
                var25++;
            }
            if (var25 < 4) {
                class12.field239 = class22.method148(new class166[] { class200.field3969, class174.method1192(false, var25 * 100 / 4), class33.field625 }, 0);
                class150.field2931 = 40;
            } else {
                class12.field239 = class103.field2026;
                class150.field2931 = 40;
                class160.field3073 = 60;
            }
        } else if (class160.field3073 == 60) {
            int var26 = class60.method511(class64.field1337, -5011, class3.field33);
            int var27 = class138.method946(13913);
            if (var26 < var27) {
                class12.field239 = class22.method148(new class166[] { class8.field157, class174.method1192(false, var26 * 100 / var27), class33.field625 }, 0);
                class150.field2931 = 50;
            } else {
                class12.field239 = class167.field3217;
                class150.field2931 = 50;
                class88.method695((byte) -125, 5);
                class160.field3073 = 70;
            }
        } else if (class160.field3073 == 70) {
            if (class95.field1842.method351(0)) {
                class164.method1101(class95.field1842, -29923);
                class184.method1243(class95.field1842, (byte) -109);
                class115.method834(class98.field1866, class95.field1842, 24444);
                class51.method380(class97.field1858, (byte) 78, class95.field1842, class98.field1866);
                class180.method1216(class98.field1866, class95.field1842, 122);
                class35.method251(class95.field1842, 8, class154.field2960, class121.field2369, class98.field1866);
                class4.method25(class172.field3298, class169.field3272, class95.field1842, (byte) -52);
                class104.method777(class95.field1842, (byte) -47, class98.field1866);
                class10.method59(class95.field1842, true);
                class127.method906(class95.field1842, (byte) -48);
                class81.method664(27216, class3.field33, class98.field1866, class203.field4004, class63.field1301);
                class34.method245(class95.field1842, 15414);
                class12.method74(class95.field1842, 5);
                class12.field239 = class79.field1612;
                class160.field3073 = 80;
                class150.field2931 = 60;
            } else {
                class12.field239 = class22.method148(new class166[] { class166.field3172, class174.method1192(false, class95.field1842.method150(false)), class33.field625 }, 0);
                class150.field2931 = 60;
            }
        } else if (class160.field3073 == 80) {
            int var28 = 0;
            if (class106.field2072 == null) {
                class106.field2072 = class6.method38(class195.field3868, class196.field3891, class3.field33, -1);
            } else {
                var28++;
            }
            if (class122.field2393 == null) {
                class122.field2393 = class6.method38(class109.field2112, class196.field3891, class3.field33, -1);
            } else {
                var28++;
            }
            if (class193.field3791 == null) {
                class193.field3791 = class84.method678(class3.field33, class196.field3891, (byte) 126, class54.field1022);
            } else {
                var28++;
            }
            if (class116.field2244 == null) {
                class116.field2244 = class178.method1208(false, class196.field3891, class175.field3316, class3.field33);
            } else {
                var28++;
            }
            if (class196.field3904 == null) {
                class196.field3904 = class178.method1208(false, class196.field3891, class112.field2180, class3.field33);
            } else {
                var28++;
            }
            if (class112.field2182 == null) {
                class112.field2182 = class178.method1208(false, class196.field3891, class61.field1258, class3.field33);
            } else {
                var28++;
            }
            if (class120.field2358 == null) {
                class120.field2358 = class178.method1208(false, class196.field3891, class109.field2116, class3.field33);
            } else {
                var28++;
            }
            if (class159.field3045 == null) {
                class159.field3045 = class178.method1208(false, class196.field3891, class90.field1784, class3.field33);
            } else {
                var28++;
            }
            if (class12.field234 == null) {
                class12.field234 = class178.method1208(false, class196.field3891, class185.field3559, class3.field33);
            } else {
                var28++;
            }
            if (class111.field2164 == null) {
                class111.field2164 = class178.method1208(false, class196.field3891, class147.field2902, class3.field33);
            } else {
                var28++;
            }
            if (class5.field93 == null) {
                class5.field93 = class178.method1208(false, class196.field3891, class129.field2528, class3.field33);
            } else {
                var28++;
            }
            if (class117.field2279 == null) {
                class117.field2279 = class84.method678(class3.field33, class196.field3891, (byte) 125, class194.field3850);
            } else {
                var28++;
            }
            if (class59.field1222 == null) {
                class59.field1222 = class84.method678(class3.field33, class196.field3891, (byte) 125, class35.field656);
            } else {
                var28++;
            }
            if (class95.field1832 == null) {
                class95.field1832 = class18.method113(class196.field3891, class3.field33, class177.field3356, -126);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class12.field239 = class22.method148(new class166[] { class95.field1845, class174.method1192(false, var28 * 100 / 14), class33.field625 }, 0);
                class150.field2931 = 70;
            } else {
                class24.field437 = class59.field1222;
                int var29 = (int) (Math.random() * 21.0D) - 10;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 21.0D) - 10;
                int var32 = (int) (Math.random() * 41.0D) - 20;
                class122.field2393.method1061();
                for (int var33 = 0; var33 < class116.field2244.length; var33++) {
                    class116.field2244[var33].method1062(var29 + var32, var30 - -var32, var31 + var32);
                }
                class193.field3791[0].method730(var29 + var32, var30 + var32, var31 + var32);
                class123.method882(5464);
                class150.field2931 = 70;
                class12.field239 = class30.field562;
                class160.field3073 = 90;
            }
        } else {
            int var34 = -60 / ((63 - arg0) / 44);
            if (class160.field3073 == 90) {
                if (class120.field2348.method351(0)) {
                    class112 var35 = new class112(class120.field2348, class3.field33, 20, class97.field1858 ? 64 : 128);
                    class40.method273(var35);
                    class40.method280(0.7F);
                    class160.field3073 = 110;
                    class150.field2931 = 90;
                    class12.field239 = class56.field1050;
                } else {
                    class12.field239 = class22.method148(new class166[] { class142.field2767, class174.method1192(false, class120.field2348.method150(false)), class33.field625 }, 0);
                    class150.field2931 = 90;
                }
            } else if (class160.field3073 == 110) {
                class99.field1888 = new class114();
                class35.field664.method655(class99.field1888, 10, 1048576);
                class160.field3073 = 120;
                class12.field239 = class2.field20;
                class150.field2931 = 94;
            } else if (class160.field3073 == 120) {
                if (class64.field1337.method368((byte) -25, class196.field3891, class56.field1062)) {
                    class131 var36 = new class131(class64.field1337.method359(class56.field1062, true, class196.field3891));
                    class166.method1135(11005, var36);
                    class150.field2931 = 96;
                    class12.field239 = class121.field2384;
                    class160.field3073 = 130;
                } else {
                    class12.field239 = class22.method148(new class166[] { class3.field46, class107.field2082 }, 0);
                    class150.field2931 = 96;
                }
            } else if (class160.field3073 == 130) {
                if (!class63.field1301.method351(0)) {
                    class12.field239 = class22.method148(new class166[] { class79.field1623, class174.method1192(false, class63.field1301.method150(false) * 4 / 5), class33.field625 }, 0);
                    class150.field2931 = 100;
                } else if (!class129.field2529.method351(0)) {
                    class12.field239 = class22.method148(new class166[] { class79.field1623, class174.method1192(false, class129.field2529.method150(false) / 6 + 80), class33.field625 }, 0);
                    class150.field2931 = 100;
                } else if (class203.field4004.method351(0)) {
                    class12.field239 = class91.field1790;
                    class160.field3073 = 140;
                    class150.field2931 = 100;
                } else {
                    class12.field239 = class22.method148(new class166[] { class79.field1623, class174.method1192(false, class203.field4004.method150(false) / 20 + 96), class33.field625 }, 0);
                    class150.field2931 = 100;
                }
            } else if (class160.field3073 == 140) {
                class88.method695((byte) -125, 10);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
    public static void method120(int arg0) {
        field343 = null;
        field341 = null;
        field342 = null;
        if (arg0 > -75) {
            field335 = 43;
        }
        field345 = null;
        field344 = null;
        field328 = null;
        field346 = null;
        field336 = null;
        field329 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Z")
    public static final boolean method121(int arg0, int arg1) {
        if (arg0 >= -42) {
            field341 = null;
        }
        field337++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Li;IIIIILpf;III)V")
    public static final void method122(class73 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class141 arg6, int arg7, int arg8, int arg9) {
        field339++;
        class145 var10 = class170.method1185((byte) 62, arg7);
        int var11;
        int var12;
        if (arg8 == 1 || arg8 == 3) {
            var12 = var10.field2825;
            var11 = var10.field2832;
        } else {
            var11 = var10.field2825;
            var12 = var10.field2832;
        }
        int var13;
        int var14;
        if (arg9 + var11 > 104) {
            var13 = arg9;
            var14 = arg9 + 1;
        } else {
            var13 = (var11 >> 1) + arg9;
            var14 = (var11 + 1 >> 1) + arg9;
        }
        int[][] var15 = class74.field1511[arg3];
        int var16;
        int var17;
        if (arg5 + var12 <= 104) {
            var16 = (var12 + 1 >> 1) + arg5;
            var17 = (var12 >> 1) + arg5;
        } else {
            var16 = arg5 + 1;
            var17 = arg5;
        }
        int var18 = var15[var13][var17] + var15[var14][var17] + var15[var13][var16] + var15[var14][var16] >> 2;
        int var19 = (arg9 << 7) + (var11 << 6);
        int var20 = (arg5 << 7) + (var12 << 6);
        int var21 = (arg8 << 6) + arg4;
        if (var10.field2857 == 1) {
            var21 += 256;
        }
        int var22 = (arg5 << 7) + arg9 + (arg7 << 14) + 1073741824;
        if (var10.field2839 == 0) {
            var22 += Integer.MIN_VALUE;
        }
        if (arg4 == 22) {
            class42 var23;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var23 = var10.method996(var15, var19, var18, -1, arg8, 22, var20);
            } else {
                var23 = new class119(arg7, 22, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method591(arg2, arg9, arg5, var18, var23, var22, var21);
            if (var10.field2819 == 1) {
                arg6.method960(arg5, (byte) -97, arg9);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class42 var46;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var46 = var10.method996(var15, var19, var18, -1, arg8, 10, var20);
            } else {
                var46 = new class119(arg7, 10, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            if (var46 != null) {
                arg0.method607(arg2, arg9, arg5, var18, var11, var12, var46, arg4 == 11 ? 256 : 0, var22, var21);
            }
            if (var10.field2819 != 0) {
                arg6.method972(arg5, var10.field2866, var12, var11, arg9, true);
            }
        } else if (arg4 >= 12) {
            class42 var24;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var24 = var10.method996(var15, var19, var18, -1, arg8, arg4, var20);
            } else {
                var24 = new class119(arg7, arg4, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method607(arg2, arg9, arg5, var18, 1, 1, var24, 0, var22, var21);
            if (var10.field2819 != 0) {
                arg6.method972(arg5, var10.field2866, var12, var11, arg9, true);
            }
        } else if (arg4 == 0) {
            class42 var25;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var25 = var10.method996(var15, var19, var18, -1, arg8, 0, var20);
            } else {
                var25 = new class119(arg7, 0, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method592(arg2, arg9, arg5, var18, var25, null, class56.field1072[arg8], 0, var22, var21);
            if (var10.field2819 != 0) {
                arg6.method966(1, arg4, var10.field2866, arg9, arg8, arg5);
            }
        } else if (arg4 == 1) {
            class42 var26;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var26 = var10.method996(var15, var19, var18, -1, arg8, 1, var20);
            } else {
                var26 = new class119(arg7, 1, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method592(arg2, arg9, arg5, var18, var26, null, class154.field2972[arg8], 0, var22, var21);
            if (var10.field2819 != 0) {
                arg6.method966(1, arg4, var10.field2866, arg9, arg8, arg5);
            }
        } else if (arg4 == 2) {
            int var27 = arg8 + 1 & 0x3;
            class42 var28;
            class42 var29;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var28 = var10.method996(var15, var19, var18, -1, arg8 + 4, 2, var20);
                var29 = var10.method996(var15, var19, var18, arg1 + 5, var27, 2, var20);
            } else {
                var28 = new class119(arg7, 2, arg8 + 4, arg3, arg9, arg5, var10.field2844, true, null);
                var29 = new class119(arg7, 2, var27, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method592(arg2, arg9, arg5, var18, var28, var29, class56.field1072[arg8], class56.field1072[var27], var22, var21);
            if (var10.field2819 != 0) {
                arg6.method966(arg1 ^ 0xFFFFFFFB, arg4, var10.field2866, arg9, arg8, arg5);
            }
        } else if (arg4 == 3) {
            class42 var30;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var30 = var10.method996(var15, var19, var18, -1, arg8, 3, var20);
            } else {
                var30 = new class119(arg7, 3, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method592(arg2, arg9, arg5, var18, var30, null, class154.field2972[arg8], 0, var22, var21);
            if (var10.field2819 != 0) {
                arg6.method966(arg1 + 7, arg4, var10.field2866, arg9, arg8, arg5);
            }
        } else if (arg4 == 9) {
            class42 var31;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var31 = var10.method996(var15, var19, var18, -1, arg8, arg4, var20);
            } else {
                var31 = new class119(arg7, arg4, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method607(arg2, arg9, arg5, var18, 1, 1, var31, 0, var22, var21);
            if (var10.field2819 != 0) {
                arg6.method972(arg5, var10.field2866, var12, var11, arg9, true);
            }
        } else if (arg4 == 4) {
            class42 var32;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var32 = var10.method996(var15, var19, var18, -1, arg8, 4, var20);
            } else {
                var32 = new class119(arg7, 4, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method616(arg2, arg9, arg5, var18, var32, null, class56.field1072[arg8], 0, 0, 0, var22, var21);
        } else if (~arg4 == arg1) {
            int var33 = arg0.method595(arg2, arg9, arg5);
            int var34 = 16;
            if (var33 != 0) {
                var34 = class170.method1185((byte) 73, var33 >> 14 & 0x7FFF).field2824;
            }
            class42 var35;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var35 = var10.method996(var15, var19, var18, arg1 ^ 0x5, arg8, 4, var20);
            } else {
                var35 = new class119(arg7, 4, arg8, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method616(arg2, arg9, arg5, var18, var35, null, class56.field1072[arg8], 0, class123.field2408[arg8] * var34, class46.field820[arg8] * var34, var22, var21);
        } else if (arg4 == 6) {
            int var36 = 8;
            int var37 = arg0.method595(arg2, arg9, arg5);
            if (var37 != 0) {
                var36 = class170.method1185((byte) 84, var37 >> 14 & 0x7FFF).field2824 / 2;
            }
            class42 var38;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var38 = var10.method996(var15, var19, var18, -1, arg8 + 4, 4, var20);
            } else {
                var38 = new class119(arg7, 4, arg8 + 4, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method616(arg2, arg9, arg5, var18, var38, null, 256, arg8, field328[arg8] * var36, class52.field938[arg8] * var36, var22, var21);
        } else if (arg4 == 7) {
            int var39 = arg8 + 2 & 0x3;
            class42 var40;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var40 = var10.method996(var15, var19, var18, -1, var39 + 4, 4, var20);
            } else {
                var40 = new class119(arg7, 4, var39 + 4, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method616(arg2, arg9, arg5, var18, var40, null, 256, var39, 0, 0, var22, var21);
        } else if (arg4 == 8) {
            int var41 = 8;
            int var42 = arg0.method595(arg2, arg9, arg5);
            if (var42 != 0) {
                var41 = class170.method1185((byte) 49, var42 >> 14 & 0x7FFF).field2824 / 2;
            }
            int var43 = arg8 + 2 & 0x3;
            class42 var44;
            class42 var45;
            if (var10.field2844 == -1 && var10.field2813 == null) {
                var44 = var10.method996(var15, var19, var18, -1, arg8 + 4, 4, var20);
                var45 = var10.method996(var15, var19, var18, -1, var43 + 4, 4, var20);
            } else {
                var44 = new class119(arg7, 4, arg8 + 4, arg3, arg9, arg5, var10.field2844, true, null);
                var45 = new class119(arg7, 4, var43 + 4, arg3, arg9, arg5, var10.field2844, true, null);
            }
            arg0.method616(arg2, arg9, arg5, var18, var44, var45, 256, arg8, field328[arg8] * var41, class52.field938[arg8] * var41, var22, var21);
        }
    }
}
