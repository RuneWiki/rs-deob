import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 extends class178 {

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Z")
    public static volatile boolean field473 = true;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Lqe;")
    private static class179 field477 = class206.method1380("Sorry invited players only)3", (byte) -128);

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field476 = -1;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Lqe;")
    private static class179 field474 = class206.method1380("You are standing in a members)2only area)3", (byte) 116);

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "Lqe;")
    public static class179 field478 = class206.method1380("Starte 3D)2Softwarebibliothek)3", (byte) -21);

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Lqe;")
    public static class179 field482 = field477;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "J")
    public static long field468 = 0L;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "Lqe;")
    public static class179 field484 = field474;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Ls;")
    public static class194 field469 = new class194(64);

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field485 = 0;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lee;")
    public static class49 field475;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[Lnb;")
    public static class143[] field479;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method132(int arg0) {
        field484 = null;
        field477 = null;
        field479 = null;
        field482 = null;
        if (arg0 == 6773) {
            field469 = null;
            field474 = null;
            field478 = null;
            field475 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Z")
    public static final boolean method133(boolean arg0) {
        field471++;
        if (!arg0) {
            return false;
        }
        try {
            if (class107.field2000 == 2) {
                if (class13.field325 == null) {
                    class13.field325 = class103.method684(class159.field2894, class178.field3235, class19.field494);
                    if (class13.field325 == null) {
                        return false;
                    }
                }
                if (class9.field266 == null) {
                    class9.field266 = new class173(class8.field252, class240.field4412);
                }
                if (class237.field4378.method662(class13.field325, class9.field266, 22050, 0, class32.field689)) {
                    class237.field4378.method648((byte) -117);
                    class237.field4378.method668(class237.field4361, (byte) -105);
                    class237.field4378.method657(119, class13.field325, class233.field4303);
                    class9.field266 = null;
                    class159.field2894 = null;
                    class107.field2000 = 0;
                    class13.field325 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class237.field4378.method652(-1);
            class107.field2000 = 0;
            class9.field266 = null;
            class159.field2894 = null;
            class13.field325 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)I")
    public static final int method134(byte arg0, int arg1) {
        if (arg0 <= 9) {
            return 80;
        } else {
            field472++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
    public static final void method135(int arg0, boolean arg1) {
        class29.field631 = arg1;
        int var2 = -19 % ((38 - arg0) / 62);
        if (class29.field631) {
            int var16 = class36.field789.method1237(84);
            int var17 = class36.field789.method1237(93);
            class36.field789.method73(false);
            for (int var18 = 0; var18 < 4; var18++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        int var38 = class36.field789.method71(1, 128);
                        if (var38 == 1) {
                            class177.field3226[var18][var36][var37] = class36.field789.method71(26, 128);
                        } else {
                            class177.field3226[var18][var36][var37] = -1;
                        }
                    }
                }
            }
            class36.field789.method65((byte) 0);
            int var19 = (class150.field2705 - class36.field789.field3432) / 16;
            class174.field3127 = new int[var19][4];
            for (int var20 = 0; var20 < var19; var20++) {
                for (int var35 = 0; var35 < 4; var35++) {
                    class174.field3127[var20][var35] = class36.field789.method1231(-4898);
                }
            }
            int var21 = class36.field789.method1252(2);
            int var22 = class36.field789.method1243(3);
            int var23 = class36.field789.method1250(2);
            class59.field1273 = new int[var19];
            class85.field1643 = new int[var19];
            class235.field4328 = new byte[var19][];
            class125.field2305 = new int[var19];
            class174.field3112 = new byte[var19][];
            int var24 = 0;
            for (int var25 = 0; var25 < 4; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        int var28 = class177.field3226[var25][var26][var27];
                        if (var28 != -1) {
                            int var29 = var28 >> 14 & 0x3FF;
                            int var30 = var28 >> 3 & 0x7FF;
                            int var31 = (var29 / 8 << 8) + var30 / 8;
                            for (int var32 = 0; var32 < var24; var32++) {
                                if (class125.field2305[var32] == var31) {
                                    var31 = -1;
                                    break;
                                }
                            }
                            if (var31 != -1) {
                                class125.field2305[var24] = var31;
                                int var33 = var31 & 0xFF;
                                int var34 = var31 >> 8 & 0xFF;
                                class85.field1643[var24] = class34.field753.method359(-1, class78.method502((byte) -82, new class179[] { class225.field4179, class148.method949((byte) -14, var34), class87.field1668, class148.method949((byte) -14, var33) }));
                                class59.field1273[var24] = class34.field753.method359(-1, class78.method502((byte) -89, new class179[] { class69.field1391, class148.method949((byte) -14, var34), class87.field1668, class148.method949((byte) -14, var33) }));
                                var24++;
                            }
                        }
                    }
                }
            }
            class202.method1342(var17, (byte) 124, var16, var23, var22, var21);
        } else {
            int var3 = class36.field789.method1237(-63);
            int var4 = class36.field789.method1252(2);
            int var5 = (class150.field2705 - class36.field789.field3432) / 16;
            class174.field3127 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class174.field3127[var6][var15] = class36.field789.method1231(-4898);
                }
            }
            int var7 = class36.field789.method1252(2);
            int var8 = class36.field789.method1223(125);
            int var9 = class36.field789.method1245(-94);
            class125.field2305 = new int[var5];
            class235.field4328 = new byte[var5][];
            class85.field1643 = new int[var5];
            class59.field1273 = new int[var5];
            boolean var10 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && (var9 / 8) == 48) {
                var10 = true;
            }
            class174.field3112 = new byte[var5][];
            int var11 = 0;
            if (var7 / 8 == 48 && var9 / 8 == 148) {
                var10 = true;
            }
            for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                for (int var13 = (var9 - 6) / 8; var13 <= (var9 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var10 && (var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || var12 == 49 && var13 == 47)) {
                        class125.field2305[var11] = var14;
                        class85.field1643[var11] = -1;
                        class59.field1273[var11] = -1;
                    } else {
                        class125.field2305[var11] = var14;
                        class85.field1643[var11] = class34.field753.method359(-1, class78.method502((byte) -111, new class179[] { class225.field4179, class148.method949((byte) -14, var12), class87.field1668, class148.method949((byte) -14, var13) }));
                        class59.field1273[var11] = class34.field753.method359(-1, class78.method502((byte) -100, new class179[] { class69.field1391, class148.method949((byte) -14, var12), class87.field1668, class148.method949((byte) -14, var13) }));
                    }
                    var11++;
                }
            }
            class202.method1342(var3, (byte) 124, var7, var9, var8, var4);
        }
        field470++;
    }
}
