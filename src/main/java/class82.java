import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Lje;")
    private static class67 field1810 = class85.method592(255, "scrollbar");

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1801 = 127;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "[[[B")
    public static byte[][][] field1809 = new byte[4][104][104];

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "[I")
    public static int[] field1812 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Lje;")
    public static class67 field1813 = class85.method592(255, "<br>(X");

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lob;")
    public static class99 field1800 = new class99(20);

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Lje;")
    private static class67 field1817 = class85.method592(255, "0(U");

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Lje;")
    public static class67 field1816 = class85.method592(255, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Lje;")
    public static class67 field1815 = class85.method592(255, "lila:");

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Lje;")
    public static class67 field1814 = class85.method592(255, ")1j");

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Lje;")
    public static class67 field1819 = class85.method592(255, "<col=ff0000>");

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lua;")
    public static class140 field1798;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1807;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BLna;)V")
    public final void method577(int arg0, byte[] arg1, class91 arg2) {
        field1799++;
        if (arg2.field1991[arg2.field2043] != 31 || arg2.field1991[arg2.field2043 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1807 == null) {
            this.field1807 = new Inflater(true);
        }
        try {
            this.field1807.setInput(arg2.field1991, arg2.field2043 + 10, -arg2.field2043 - 10 - (8 - arg2.field1991.length));
            this.field1807.inflate(arg1);
        } catch (Exception var5) {
            this.field1807.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1807.reset();
        int var4 = -73 / ((arg0 + 43) / 37);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class82() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
    public static final byte[] method578(Object arg0, boolean arg1, byte arg2) {
        if (arg2 != -69) {
            return null;
        }
        field1805++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class65.method439(var3, (byte) -107) : var3;
        } else if (arg0 instanceof class159) {
            class159 var4 = (class159) arg0;
            return var4.method535(124);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
    public static int method579(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static final void method580(int arg0) {
        field1806++;
        if (class103.field2357 == 0) {
            class134.field3044 = new class51(4, 104, 104, class142.field3253);
            for (int var1 = 0; var1 < 4; var1++) {
                class86.field1900[var1] = new class34(104, 104);
            }
            class61.field1215 = new class113(512, 512);
            class106.field2425 = class23.field417;
            class103.field2357 = 20;
            class93.field2100 = 5;
        } else if (class103.field2357 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = class96.field2143[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class51.method348(var2, 500, 800, 512, 334);
            class103.field2357 = 30;
            class93.field2100 = 10;
            class106.field2425 = class77.field1679;
        } else if (class103.field2357 == 30) {
            class132.field2903 = class159.method1231((byte) -58, 0, false, true, true);
            class158.field3621 = class159.method1231((byte) -58, 1, false, true, true);
            class47.field896 = class159.method1231((byte) -58, 2, true, true, false);
            class147.field3364 = class159.method1231((byte) -58, 3, false, true, true);
            class39.field709 = class159.method1231((byte) -58, 4, false, true, true);
            class98.field2183 = class159.method1231((byte) -58, 5, true, true, true);
            class76.field1640 = class159.method1231((byte) -58, 6, true, false, true);
            class93.field2107 = class159.method1231((byte) -58, 7, false, true, true);
            class14.field255 = class159.method1231((byte) -58, 8, false, true, true);
            class83.field1842 = class159.method1231((byte) -58, 9, false, true, true);
            class112.field2531 = class159.method1231((byte) -58, 10, false, true, true);
            class128.field2818 = class159.method1231((byte) -58, 11, false, true, true);
            class81.field1795 = class159.method1231((byte) -58, 12, false, true, true);
            field1798 = class159.method1231((byte) -58, 13, true, true, false);
            class154.field3504 = class159.method1231((byte) -58, 14, false, false, true);
            class75.field1615 = class159.method1231((byte) -58, 15, false, true, true);
            class103.field2357 = 40;
            class93.field2100 = 20;
            class106.field2425 = class72.field1460;
        } else if (class103.field2357 == 40) {
            byte var7 = 0;
            int var8 = var7 + class132.field2903.method1054((byte) -99) * 4 / 100;
            int var9 = var8 + class158.field3621.method1054((byte) -87) * 4 / 100;
            int var10 = var9 + class47.field896.method1054((byte) -121) * 2 / 100;
            int var11 = var10 + class147.field3364.method1054((byte) -78) * 2 / 100;
            int var12 = var11 + class39.field709.method1054((byte) -110) * 6 / 100;
            int var13 = var12 + class98.field2183.method1054((byte) -121) * 4 / 100;
            int var14 = var13 + class76.field1640.method1054((byte) -117) * 2 / 100;
            int var15 = var14 + class93.field2107.method1054((byte) -119) * 60 / 100;
            int var16 = var15 + class14.field255.method1054((byte) -98) * 2 / 100;
            int var17 = var16 + class83.field1842.method1054((byte) -76) * 2 / 100;
            int var18 = var17 + class112.field2531.method1054((byte) -85) * 2 / 100;
            int var19 = var18 + class128.field2818.method1054((byte) -76) * 2 / 100;
            int var20 = var19 + class81.field1795.method1054((byte) -124) * 2 / 100;
            int var21 = var20 + field1798.method1054((byte) -124) * 2 / 100;
            int var22 = var21 + class154.field3504.method1054((byte) -124) * 2 / 100;
            int var23 = var22 + class75.field1615.method1054((byte) -100) * 2 / 100;
            if (var23 == 100) {
                class103.field2357 = 45;
                class106.field2425 = class60.field1191;
                class93.field2100 = 30;
            } else {
                if (var23 != 0) {
                    class106.field2425 = class49.method314(new class67[] { class41.field780, class60.method420(var23, 28498), class97.field2175 }, 0);
                }
                class93.field2100 = 30;
            }
        } else {
            if (arg0 != -4) {
                method580(-89);
            }
            if (class103.field2357 == 45) {
                class18.method128(2, 22050, !class41.field773, arg0 + 108);
                class141 var24 = new class141();
                var24.method1091(128, (byte) 86, 9);
                class39.field701 = class148.method1140(0, 1024, class98.field2193, 22050, class154.field3519);
                class39.field701.method1005(var24, (byte) 41);
                class83.method586(var24, (byte) 127, class75.field1615, class39.field709, class154.field3504);
                class35.field638 = class148.method1140(1, 1024, class98.field2193, 2048, class154.field3519);
                class95.field2132 = new class78();
                class35.field638.method1005(class95.field2132, (byte) 107);
                client.field383 = new class52(22050, class84.field1873);
                class103.field2357 = 50;
                class93.field2100 = 35;
                class106.field2425 = class115.field2601;
            } else if (class103.field2357 == 50) {
                int var25 = 0;
                if (class116.field2625 == null) {
                    class116.field2625 = class151.method1157(28098, class122.field2728, class52.field1030, field1798, class14.field255);
                } else {
                    var25++;
                }
                if (class40.field714 == null) {
                    class40.field714 = class151.method1157(28098, class41.field786, class52.field1030, field1798, class14.field255);
                } else {
                    var25++;
                }
                if (class89.field1976 == null) {
                    class89.field1976 = class151.method1157(arg0 + 28102, class155.field3523, class52.field1030, field1798, class14.field255);
                } else {
                    var25++;
                }
                if (var25 < 3) {
                    class106.field2425 = class49.method314(new class67[] { class37.field675, class60.method420(var25 * 100 / 3, 28498), class97.field2175 }, 0);
                    class93.field2100 = 40;
                } else {
                    class93.field2100 = 40;
                    class103.field2357 = 60;
                    class106.field2425 = class105.field2397;
                }
            } else if (class103.field2357 == 60) {
                int var26 = class134.method1020((byte) -7, class112.field2531, class14.field255);
                int var27 = method581((byte) 40);
                if (var27 > var26) {
                    class106.field2425 = class49.method314(new class67[] { class39.field706, class60.method420(var26 * 100 / var27, arg0 + 28502), class97.field2175 }, 0);
                    class93.field2100 = 50;
                } else {
                    class106.field2425 = class44.field827;
                    class93.field2100 = 50;
                    class27.method181(5, -88);
                    class103.field2357 = 70;
                }
            } else if (class103.field2357 == 70) {
                if (class47.field896.method270((byte) 45)) {
                    class49.method317(-105, class47.field896);
                    class84.method589(class47.field896, (byte) 48);
                    class40.method246((byte) 46, class47.field896, class93.field2107);
                    class116.method936(class41.field773, class93.field2107, 2, class47.field896);
                    class79.method568(class47.field896, -119, class93.field2107);
                    class101.method801((byte) -28, class112.field2523, class47.field896, class93.field2107, class116.field2625);
                    class144.method1112(class158.field3621, class47.field896, class132.field2903, 0);
                    class85.method594(class47.field896, -5, class93.field2107);
                    class147.method1133(arg0 ^ 0x3, class47.field896);
                    class72.method517(class47.field896, -121);
                    class12.method92(class147.field3364, 0, class14.field255, class93.field2107, field1798);
                    class95.method734(class47.field896, true);
                    class50.method323(class47.field896, 256);
                    class93.field2100 = 60;
                    class106.field2425 = class4.field63;
                    class103.field2357 = 80;
                } else {
                    class106.field2425 = class49.method314(new class67[] { class34.field622, class60.method420(class47.field896.method1061(-120), 28498), class97.field2175 }, 0);
                    class93.field2100 = 60;
                }
            } else if (class103.field2357 == 80) {
                int var28 = 0;
                if (class29.field517 == null) {
                    class29.field517 = class158.method1222(false, class14.field255, class32.field571, class52.field1030);
                } else {
                    var28++;
                }
                if (class129.field2829 == null) {
                    class129.field2829 = class158.method1222(false, class14.field255, class63.field1236, class52.field1030);
                } else {
                    var28++;
                }
                if (class30.field534 == null) {
                    class30.field534 = class56.method394(class52.field1030, class14.field255, class46.field852, -16958);
                } else {
                    var28++;
                }
                if (class14.field240 == null) {
                    class14.field240 = class18.method124((byte) 81, class152.field3488, class52.field1030, class14.field255);
                } else {
                    var28++;
                }
                if (class31.field563 == null) {
                    class31.field563 = class18.method124((byte) 33, class80.field1769, class52.field1030, class14.field255);
                } else {
                    var28++;
                }
                if (class80.field1775 == null) {
                    class80.field1775 = class18.method124((byte) 24, class3.field43, class52.field1030, class14.field255);
                } else {
                    var28++;
                }
                if (class77.field1692 == null) {
                    class77.field1692 = class18.method124((byte) 102, class149.field3415, class52.field1030, class14.field255);
                } else {
                    var28++;
                }
                if (class61.field1218 == null) {
                    class61.field1218 = class18.method124((byte) 75, class147.field3368, class52.field1030, class14.field255);
                } else {
                    var28++;
                }
                if (class17.field302 == null) {
                    class17.field302 = class18.method124((byte) 83, class144.field3323, class52.field1030, class14.field255);
                } else {
                    var28++;
                }
                if (class132.field2912 == null) {
                    class132.field2912 = class18.method124((byte) 99, class141.field3197, class52.field1030, class14.field255);
                } else {
                    var28++;
                }
                if (class69.field1412 == null) {
                    class69.field1412 = class18.method124((byte) 19, class66.field1294, class52.field1030, class14.field255);
                } else {
                    var28++;
                }
                if (class19.field363 == null) {
                    class19.field363 = class56.method394(class52.field1030, class14.field255, field1810, arg0 - 16954);
                } else {
                    var28++;
                }
                if (class120.field2701 == null) {
                    class120.field2701 = class56.method394(class52.field1030, class14.field255, class18.field338, -16958);
                } else {
                    var28++;
                }
                if (class46.field846 == null) {
                    class46.field846 = class58.method404(class52.field1030, (byte) 36, class88.field1952, class14.field255);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class106.field2425 = class49.method314(new class67[] { class147.field3358, class60.method420(var28 * 100 / 14, arg0 + 28502), class97.field2175 }, 0);
                    class93.field2100 = 70;
                } else {
                    class100.field2241 = class120.field2701;
                    class129.field2829.method903();
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 41.0D) - 20;
                    for (int var33 = 0; var33 < class14.field240.length; var33++) {
                        class14.field240[var33].method901(var29 + var32, var30 + var32, var31 + var32);
                    }
                    class30.field534[0].method532(var29 + var32, var30 + var32, var31 + var32);
                    class9.method81((byte) 110);
                    class93.field2100 = 70;
                    class106.field2425 = class34.field602;
                    class103.field2357 = 90;
                }
            } else if (class103.field2357 == 90) {
                if (class83.field1842.method270((byte) 45)) {
                    class69 var34 = new class69(class83.field1842, class14.field255, 20, 0.8D, class41.field773 ? 64 : 128);
                    class96.method739(var34);
                    class96.method744(0.8D);
                    class103.field2357 = 110;
                    class93.field2100 = 90;
                    class106.field2425 = class97.field2170;
                } else {
                    class106.field2425 = class49.method314(new class67[] { class27.field499, class60.method420(class83.field1842.method1061(100), 28498), class97.field2175 }, 0);
                    class93.field2100 = 90;
                }
            } else if (class103.field2357 == 110) {
                class137.field3090 = new class115();
                class154.field3519.method875(10, class137.field3090, 2);
                class103.field2357 = 120;
                class93.field2100 = 94;
                class106.field2425 = class159.field3658;
            } else if (class103.field2357 == 120) {
                if (class112.field2531.method256(class52.field1030, true, class59.field1189)) {
                    class33 var35 = new class33(class112.field2531.method269(0, class52.field1030, class59.field1189));
                    class59.method410(var35, 1);
                    class106.field2425 = class77.field1668;
                    class93.field2100 = 96;
                    class103.field2357 = 130;
                } else {
                    class106.field2425 = class49.method314(new class67[] { class130.field2854, field1817 }, arg0 ^ 0xFFFFFFFC);
                    class93.field2100 = 96;
                }
            } else if (class103.field2357 == 130) {
                if (!class147.field3364.method270((byte) 45)) {
                    class106.field2425 = class49.method314(new class67[] { class118.field2660, class60.method420(class147.field3364.method1061(-91) * 4 / 5, 28498), class97.field2175 }, 0);
                    class93.field2100 = 100;
                } else if (!class81.field1795.method270((byte) 45)) {
                    class106.field2425 = class49.method314(new class67[] { class118.field2660, class60.method420(class81.field1795.method1061(122) / 6 + 80, arg0 ^ 0xFFFF90AE), class97.field2175 }, arg0 ^ 0xFFFFFFFC);
                    class93.field2100 = 100;
                } else if (field1798.method270((byte) 45)) {
                    class103.field2357 = 140;
                    class106.field2425 = class150.field3434;
                    class93.field2100 = 100;
                } else {
                    class106.field2425 = class49.method314(new class67[] { class118.field2660, class60.method420(field1798.method1061(-123) / 20 + 96, 28498), class97.field2175 }, 0);
                    class93.field2100 = 100;
                }
            } else if (class103.field2357 == 140) {
                class27.method181(10, -92);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)I")
    private static final int method581(byte arg0) {
        if (arg0 != 40) {
            field1798 = null;
        }
        field1811++;
        return 6;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)[Lqb;")
    public static final class113[] method582(int arg0) {
        if (arg0 != -27435) {
            field1800 = null;
        }
        class113[] var1 = new class113[class16.field283];
        for (int var2 = 0; var2 < class16.field283; var2++) {
            class113 var3 = var1[var2] = new class113();
            var3.field2573 = class14.field246;
            var3.field2574 = client.field397;
            var3.field2576 = class4.field61[var2];
            var3.field2575 = class128.field2804[var2];
            var3.field2572 = class4.field65[var2];
            var3.field2570 = class69.field1409[var2];
            int var4 = var3.field2572 * var3.field2570;
            byte[] var5 = class152.field3489[var2];
            var3.field2571 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field2571[var6] = class85.field1888[class34.method213(255, var5[var6])];
            }
        }
        field1802++;
        class151.method1154(arg0 + 27435);
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1819 = null;
        field1798 = null;
        if (arg0 != 2) {
            field1813 = null;
        }
        field1800 = null;
        field1810 = null;
        field1812 = null;
        field1809 = null;
        field1815 = null;
        field1816 = null;
        field1817 = null;
        field1814 = null;
        field1813 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
    private class82(int arg0, int arg1, int arg2) {
    }
}
