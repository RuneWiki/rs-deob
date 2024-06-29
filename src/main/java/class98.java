import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class98 extends class117 {

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Z")
    public static boolean field1381 = false;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static volatile int field1387 = -1;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field1383 = 0;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "[C")
    public static char[] field1382 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Z")
    public static boolean field1379 = true;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "F")
    public static float field1384;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "F")
    public static float field1385;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "Lph;")
    public static class361 field1388;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Lph;")
    public static class361 field1392;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "[I")
    public static int[] field1390;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)I", line = 6)
    public static final int method771(byte arg0, int arg1) {
        int var2 = 74 % ((arg0 - 27) / 48);
        int var3 = arg1 >>> 1;
        int var4 = var3 | var3 >>> 1;
        field1391++;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return ~var8 & arg1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 27)
    public static final void method772(int arg0, String arg1) {
        field1386++;
        if (class111.field1619 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class123.method924((byte) -53);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class28.method177("mem=" + var4 + "k", -19420);
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class123.method924((byte) -53);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class28.method177("Memory before cleanup=" + var7 + "k", -19420);
                class64.method537((byte) -70);
                class123.method924((byte) -53);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class28.method177("Memory after cleanup=" + var9 + "k", -19420);
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class28.method177("Number of player models in cache:" + class36.method264(true), -19420);
            }
            if (class141.field2031 && arg1.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class305.field4568);
                System.out.println("oncard_2d:" + class305.field4569);
                System.out.println("oncard_texture:" + class305.field4570);
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class312.method2183(40);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class57.field841.method241(30783);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class57.field841.method238((byte) -108);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class54.field787.method485((byte) 39);
                class67.field973.method1561((byte) 64);
                class57.field841.method235(true);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class11.field178 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class250.method1837(25, 40);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class91.field1265 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class91.field1265 = false;
            }
            if (arg1.equalsIgnoreCase("::wm0")) {
                class348.method2443(-1, false, (byte) -125, -1, 0);
            }
            if (arg1.equalsIgnoreCase("::wm1")) {
                class348.method2443(-1, false, (byte) -76, -1, 1);
            }
            if (arg1.equalsIgnoreCase("::wm2")) {
                class348.method2443(-1, false, (byte) -124, -1, 2);
            }
            if (arg1.equalsIgnoreCase("::wm3")) {
                class348.method2443(768, false, (byte) -110, 1024, 3);
            }
            if (arg1.startsWith("::setba")) {
                class93.field1299 = class28.method176((byte) 28, arg1.substring(8));
                class309.method2176(class54.field787, false);
                class56.field821 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class155.method1120(class28.method176((byte) 28, arg1.substring(15)));
                class309.method2176(class54.field787, false);
                class56.field821 = false;
            }
            if (arg1.startsWith("::fps ") && class14.field214 != 0) {
                class286.method2070(-126, class28.method176((byte) 28, arg1.substring(6)));
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class7.field139 = class28.method176((byte) 28, arg1.substring(12).trim());
                class28.method177("rect_debug=" + class7.field139, -19420);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class190.field2769 = true;
            }
            if (arg1.startsWith("::hdr") && class141.field2031 && !class281.method2043((byte) -45, !class233.method1731())) {
                class28.method177("Failed to enable hdr", -19420);
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class22.field335) {
                    class22.field335 = false;
                    class28.method177("Forced tweening disabled.", -19420);
                } else {
                    class22.field335 = true;
                    class28.method177("Forced tweening ENABLED!", -19420);
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class33.field471) {
                    System.out.println("Shift-click disabled.");
                    class33.field471 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class33.field471 = true;
                }
            }
            if (arg1.equalsIgnoreCase("::getcgcoord")) {
                class28.method177("x:" + (class1.field55.field5137 >> 7) + " z:" + (class1.field55.field5165 >> 7) + " groundh:" + class132.field1930[class321.field4835][class1.field55.field5137 >> 7][class1.field55.field5165 >> 7], -19420);
            }
            if (arg1.equalsIgnoreCase("::getheight")) {
                class28.method177("Height: " + class132.field1930[class321.field4835][class1.field55.field5137 >> 7][class1.field55.field5165 >> 7], -19420);
            }
        }
        class107.field1533.method1915(true, 66);
        class107.field1533.method1355((byte) -116, arg1.length() - 1);
        int var10 = -97 % ((arg0) / 49);
        class3.field93++;
        class107.field1533.method1343(arg1.substring(2), 0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Llg;IIIIIIZ)V", line = 261)
    public static final void method773(class100 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1436.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1436[var9] - class7.field142;
            int var11 = arg0.field1434[var9] - class253.field3770;
            int var12 = arg0.field1427[var9] - class126.field1843;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1438 != null) {
                class100.field1435[var9] = var13;
                class100.field1428[var9] = var16;
                class100.field1440[var9] = var17;
            }
            class100.field1442[var9] = (var13 << 9) / var17 + class345.field5348;
            class100.field1444[var9] = (var16 << 9) / var17 + class345.field5344;
        }
        class345.field5337 = 0;
        int var19 = arg0.field1431.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1431[var20];
            int var22 = arg0.field1437[var20];
            int var23 = arg0.field1429[var20];
            int var24 = class100.field1442[var21];
            int var25 = class100.field1442[var22];
            int var26 = class100.field1442[var23];
            int var27 = class100.field1444[var21];
            int var28 = class100.field1444[var22];
            int var29 = class100.field1444[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class179.field2562 && class197.method1419(class345.field5348 + class266.field4057, class57.field843 + class345.field5344, var27, var28, var29, var24, var25, var26)) {
                    class336.field5235 = arg5;
                    class358.field5486 = arg6;
                }
                if (!class141.field2031 && !arg7) {
                    class345.field5341 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class345.field5353 || var25 > class345.field5353 || var26 > class345.field5353) {
                        class345.field5341 = true;
                    }
                    if (arg0.field1438 == null || arg0.field1438[var20] == -1) {
                        if (arg0.field1446[var20] != 12345678) {
                            class345.method2421(var27, var28, var29, var24, var25, var26, arg0.field1446[var20], arg0.field1432[var20], arg0.field1447[var20]);
                        }
                    } else if (!class291.field4410) {
                        int var30 = class345.field5336.method591(arg0.field1438[var20], -119);
                        class345.method2421(var27, var28, var29, var24, var25, var26, class38.method280(var30, arg0.field1446[var20]), class38.method280(var30, arg0.field1432[var20]), class38.method280(var30, arg0.field1447[var20]));
                    } else if (arg0.field1443) {
                        class345.method2420(var27, var28, var29, var24, var25, var26, arg0.field1446[var20], arg0.field1432[var20], arg0.field1447[var20], class100.field1435[0], class100.field1435[1], class100.field1435[3], class100.field1428[0], class100.field1428[1], class100.field1428[3], class100.field1440[0], class100.field1440[1], class100.field1440[3], arg0.field1438[var20]);
                    } else {
                        class345.method2420(var27, var28, var29, var24, var25, var26, arg0.field1446[var20], arg0.field1432[var20], arg0.field1447[var20], class100.field1435[var21], class100.field1435[var22], class100.field1435[var23], class100.field1428[var21], class100.field1428[var22], class100.field1428[var23], class100.field1440[var21], class100.field1440[var22], class100.field1440[var23], arg0.field1438[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V", line = 385)
    public static void method774(int arg0) {
        field1390 = null;
        int var1 = 78 / ((-arg0 - 27) / 60);
        field1382 = null;
        field1392 = null;
        field1388 = null;
    }
}
