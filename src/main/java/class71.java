import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class71 extends RuntimeException {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1308;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljava/lang/String;")
    public String field1309;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lkb;")
    private static class93 field1312 = class76.method390("::fpsoff", 0);

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lnb;")
    public static class120 field1310 = new class120(64);

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lkb;")
    public static class93 field1317 = class76.method390(" weitere Optionen", 0);

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class71(Throwable arg0, String arg1) {
        this.field1308 = arg0;
        this.field1309 = arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method374(byte arg0) {
        int var1 = -115 / ((-arg0 - 14) / 33);
        field1310 = null;
        field1317 = null;
        field1312 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII[I)I")
    public static final int method375(byte arg0, int arg1, int arg2, int[] arg3) {
        if (arg0 != -79) {
            field1316 = -52;
        }
        field1315++;
        return arg3[1] * arg1 + arg3[0] * arg2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method376(boolean arg0) {
        field1314++;
        boolean var1 = true;
        class140.method875(-116, arg0);
        class106.field1933 = 0;
        for (int var2 = 0; var2 < class158.field3145.length; var2++) {
            if (class62.field983[var2] != -1 && class158.field3145[var2] == null) {
                class158.field3145[var2] = class61.field974.method461(class62.field983[var2], (byte) 117, 0);
                if (class158.field3145[var2] == null) {
                    class106.field1933++;
                    var1 = false;
                }
            }
            if (class77.field1382[var2] != -1 && class133.field2547[var2] == null) {
                class133.field2547[var2] = class61.field974.method451(0, class77.field1382[var2], class170.field3379[var2], 0);
                if (class133.field2547[var2] == null) {
                    class106.field1933++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class142.field2783 = 1;
            return;
        }
        boolean var3 = true;
        class85.field1552 = 0;
        for (int var4 = 0; var4 < class158.field3145.length; var4++) {
            byte[] var56 = class133.field2547[var4];
            if (var56 != null) {
                int var57 = (class206.field4034[var4] >> 8) * 64 - class49.field787;
                int var58 = (class206.field4034[var4] & 0xFF) * 64 - class68.field1242;
                if (class195.field3826) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class121.method684(var58, var57, -104, var56);
            }
        }
        if (!var3) {
            class142.field2783 = 2;
            return;
        }
        if (class142.field2783 != 0) {
            class157.method1024(class203.method1321(new class93[] { class34.field542, class127.field2395 }, -55), true, 250);
        }
        class201.method1316(0);
        class186.method1211(59);
        class201.method1316(0);
        class175.field3458.method808();
        class201.method1316(0);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class145.field2822[var5].method946(0);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class136.field2637[var6][var54][var55] = 0;
                }
            }
        }
        class201.method1316(0);
        class181.method1181(-206548700);
        int var7 = class158.field3145.length;
        class63.method324((byte) -66);
        class140.method875(-30, true);
        if (!class195.field3826) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class206.field4034[var8] >> 8) * 64 - class49.field787;
                int var18 = (class206.field4034[var8] & 0xFF) * 64 - class68.field1242;
                byte[] var19 = class158.field3145[var8];
                if (var19 != null) {
                    class201.method1316(0);
                    class85.method427(class98.field1839 * 8 - 48, var18, class145.field2822, var17, class133.field2544 * 8 - 48, (byte) -78, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class206.field4034[var9] & 0xFF) * 64 - class68.field1242;
                int var15 = (class206.field4034[var9] >> 8) * 64 - class49.field787;
                byte[] var16 = class158.field3145[var9];
                if (var16 == null && class98.field1839 < 800) {
                    class201.method1316(0);
                    class128.method731(var14, 64, -7503, 64, var15);
                }
            }
            class140.method875(-115, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class133.field2547[var10];
                if (var11 != null) {
                    int var12 = (class206.field4034[var10] >> 8) * 64 - class49.field787;
                    int var13 = (class206.field4034[var10] & 0xFF) * 64 - class68.field1242;
                    class201.method1316(0);
                    class171.method1143(class145.field2822, var12, var13, class175.field3458, var11, -104);
                }
            }
        }
        if (class195.field3826) {
            for (int var20 = 0; var20 < 4; var20++) {
                class201.method1316(0);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class59.field950[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 1 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 24 & 0x3;
                            int var41 = var36 >> 3 & 0x7FF;
                            int var42 = (var39 / 8 << 8) + (var41 / 8);
                            for (int var43 = 0; var43 < class206.field4034.length; var43++) {
                                if (class206.field4034[var43] == var42 && class158.field3145[var43] != null) {
                                    var37 = true;
                                    class160.method1096((var39 & 0x7) * 8, var20, var38, var34 * 8, (var41 & 0x7) * 8, class158.field3145[var43], class145.field2822, var40, var35 * 8, 94);
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class81.method408(var34 * 8, var20, var35 * 8, -1);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class59.field950[0][var21][var32];
                    if (var33 == -1) {
                        class128.method731(var32 * 8, 8, -7503, 8, var21 * 8);
                    }
                }
            }
            class140.method875(-63, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class201.method1316(0);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class59.field950[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 1 & 0x3;
                            int var27 = var25 >> 24 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class206.field4034.length; var31++) {
                                if (class206.field4034[var31] == var30 && class133.field2547[var31] != null) {
                                    class113.method615(var23 * 8, var24 * 8, class175.field3458, var27, var26, var22, (byte) -116, class145.field2822, (var29 & 0x7) * 8, class133.field2547[var31], (var28 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class140.method875(-99, true);
        class186.method1211(-128);
        class201.method1316(0);
        class100.method560(class145.field2822, (byte) 5, class175.field3458);
        class140.method875(-78, true);
        int var44 = class169.field3368;
        if (class114.field2145 < var44) {
            var44 = class114.field2145;
        }
        if (var44 < class114.field2145 - 1) {
            int var45 = class114.field2145 - 1;
        }
        if (class82.field1515) {
            class175.field3458.method818(class169.field3368);
        } else {
            class175.field3458.method818(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class147.method903(256, var53, var46);
            }
        }
        class201.method1316(0);
        method378(-81);
        class186.method1211(37);
        if (class68.field1262 != null) {
            class151.field2908.method47(53, 8);
            class151.field2908.method1051(true, 1057001181);
            class193.field3756++;
        }
        if (!class195.field3826) {
            int var47 = (class133.field2544 + 6) / 8;
            int var48 = (class98.field1839 + 6) / 8;
            int var49 = (class133.field2544 - 6) / 8;
            int var50 = (class98.field1839 - 6) / 8;
            for (int var51 = var49 - 1; var51 <= var47 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var48 + 1; var52++) {
                    if (var51 < var49 || var47 < var51 || var52 < var50 || var48 < var52) {
                        class61.field974.method469(class203.method1321(new class93[] { class36.field590, class67.method357((byte) -118, var51), class111.field2007, class67.method357((byte) -112, var52) }, 91), 1);
                        class61.field974.method469(class203.method1321(new class93[] { class2.field40, class67.method357((byte) -124, var51), class111.field2007, class67.method357((byte) -102, var52) }, 99), 1);
                    }
                }
            }
        }
        class205.method1336(20, 30);
        class201.method1316(0);
        class133.method793((byte) 69);
        class151.field2908.method47(137, 8);
        class153.method982(true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILkb;)V")
    public static final void method377(int arg0, class93 arg1) {
        field1313++;
        if (class43.field707 >= 2) {
            if (arg1.method523(122, class158.field3156)) {
                System.gc();
            }
            if (arg1.method523(arg0 ^ 0xFFFFFF8D, class1.field23)) {
                class136.method857(104);
            }
            if (arg1.method523(arg0 ^ 0xFFFFFF80, class115.field2158)) {
                class186.field3663 = true;
            }
            if (arg1.method523(arg0 ^ 0xFFFFFF8A, field1312)) {
                class186.field3663 = false;
            }
            if (arg1.method523(119, class182.field3602)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class145.field2822[var2].field2916[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method501(arg0 - 4, class101.field1859) && class131.field2466 != 0) {
                class98.method553(1000, arg1.method514(arg0 + 92, 6).method520((byte) 67));
            }
            if (arg1.method523(arg0 ^ 0xFFFFFF82, class44.field725) && class131.field2466 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method501(-102, class89.field1638)) {
                class144.field2797 = arg1.method514(93, 12).method513(arg0 + 65).method520((byte) 67);
                class189.method1223(0, null, 2249, class203.method1321(new class93[] { class50.field804, class67.method357((byte) -86, class144.field2797) }, -77));
            }
            if (arg1.method523(114, class72.field1321)) {
                class135.field2620 = true;
            }
        }
        class151.field2908.method47(130, 8);
        class182.field3596++;
        class151.field2908.method1069(arg0 + arg1.method510(77), (byte) -26);
        class151.field2908.method1052((byte) 56, arg1.method514(72, 2));
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    private static final void method378(int arg0) {
        field1311++;
        if (arg0 > -49) {
            return;
        }
        for (class179 var1 = (class179) class1.field3.method692(false); var1 != null; var1 = (class179) class1.field3.method695(512)) {
            if (var1.field3567 == -1) {
                var1.field3564 = 0;
                class12.method62(-1, var1);
            } else {
                var1.method235(false);
            }
        }
    }
}
