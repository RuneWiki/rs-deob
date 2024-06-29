import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 {

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public int field2822 = 0;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public int field2827 = 0;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
    public static int[] field2823 = new int[32];

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lec;")
    public static class32 field2832 = class73.method594("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", true);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lec;")
    public static class32 field2835 = class73.method594("Nehmen", true);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lec;")
    private static class32 field2837 = class73.method594("glow3:", true);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lec;")
    public static class32 field2826 = field2837;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lec;")
    public static class32 field2820 = field2837;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[Lvf;")
    public static class152[] field2834 = new class152[16];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Ldd;")
    public class26 field2819;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Ldd;")
    public class26 field2833;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLf;)Z")
    public static final boolean method934(boolean arg0, class36 arg1) {
        if (!arg0) {
            return true;
        }
        field2821++;
        if (class146.field3320) {
            if (class147.method1102(-120, arg1) != 0) {
                return false;
            }
            if (arg1.field756 == 0) {
                return false;
            }
        }
        return arg1.field741;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static final void method935(byte arg0) {
        field2829++;
        boolean var1 = true;
        method937(false, (byte) 127);
        class37.field880 = 0;
        for (int var2 = 0; var2 < class142.field3258.length; var2++) {
            if (class119.field2843[var2] != -1 && class142.field3258[var2] == null) {
                class142.field3258[var2] = class134.field3117.method206(class119.field2843[var2], 0, -110);
                if (class142.field3258[var2] == null) {
                    class37.field880++;
                    var1 = false;
                }
            }
            if (class74.field1748[var2] != -1 && class27.field483[var2] == null) {
                class27.field483[var2] = class134.field3117.method220(-118, class74.field1748[var2], class63.field1455[var2], 0);
                if (class27.field483[var2] == null) {
                    var1 = false;
                    class37.field880++;
                }
            }
        }
        if (!var1) {
            class119.field2841 = 1;
            return;
        }
        class152.field3489 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class142.field3258.length; var4++) {
            byte[] var56 = class27.field483[var4];
            if (var56 != null) {
                int var57 = (class39.field936[var4] >> 8) * 64 - class72.field1701;
                int var58 = (class39.field936[var4] & 0xFF) * 64 - field2838;
                if (class56.field1300) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class14.method76(var57, true, var56, var58);
            }
        }
        if (!var3) {
            class119.field2841 = 2;
            return;
        }
        if (class119.field2841 != 0) {
            class14.method72(class52.method403(new class32[] { class48.field1136, class110.field2588 }, (byte) -20), 16777215, true);
        }
        class125.method982(-7);
        class102.method826(-98);
        class125.method982(-7);
        class159.field3659.method1141();
        class125.method982(-7);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class105.field2484[var5].method925(109);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class3.field50[var6][var54][var55] = 0;
                }
            }
        }
        class125.method982(-7);
        class79.method628((byte) -82);
        int var7 = class142.field3258.length;
        class33.method284(false);
        method937(true, (byte) 124);
        if (!class56.field1300) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class39.field936[var8] & 0xFF) * 64 - field2838;
                byte[] var18 = class142.field3258[var8];
                int var19 = (class39.field936[var8] >> 8) * 64 - class72.field1701;
                if (var18 != null) {
                    class125.method982(-7);
                    class107.method867(var18, (class142.field3253 - 6) * 8, var17, 12809, class62.field1423 * 8 - 48, class105.field2484, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class39.field936[var9] >> 8) * 64 - class72.field1701;
                int var15 = (class39.field936[var9] & 0xFF) * 64 - field2838;
                byte[] var16 = class142.field3258[var9];
                if (var16 == null && class142.field3253 < 800) {
                    class125.method982(-7);
                    class79.method626(var15, var14, 64, 5037, 64);
                }
            }
            method937(true, (byte) 105);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class27.field483[var10];
                if (var11 != null) {
                    int var12 = (class39.field936[var10] >> 8) * 64 - class72.field1701;
                    int var13 = (class39.field936[var10] & 0xFF) * 64 - field2838;
                    class125.method982(-7);
                    class80.method635(var12, class159.field3659, var11, class105.field2484, -123, var13);
                }
            }
        }
        if (class56.field1300) {
            for (int var20 = 0; var20 < 4; var20++) {
                class125.method982(-7);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class32.field641[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class39.field936.length; var43++) {
                                if (class39.field936[var43] == var42 && class142.field3258[var43] != null) {
                                    var36 = true;
                                    class47.method361((var40 & 0x7) * 8, var35 * 8, var34 * 8, (var41 & 0x7) * 8, var38, class105.field2484, (byte) 106, class142.field3258[var43], var39, var20);
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class57.method452(var34 * 8, var35 * 8, var20, (byte) 77);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class32.field641[0][var21][var32];
                    if (var33 == -1) {
                        class79.method626(var32 * 8, var21 * 8, 8, 5037, 8);
                    }
                }
            }
            method937(true, (byte) 114);
            for (int var22 = 0; var22 < 4; var22++) {
                class125.method982(-7);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class32.field641[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class39.field936.length; var31++) {
                                if (class39.field936[var31] == var30 && class27.field483[var31] != null) {
                                    class158.method1226(1, var22, class27.field483[var31], var26, (var29 & 0x7) * 8, var24 * 8, var23 * 8, class159.field3659, var27, class105.field2484, (var28 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method937(true, (byte) 107);
        class102.method826(-90);
        class125.method982(-7);
        class65.method500(class105.field2484, 0, class159.field3659);
        method937(true, (byte) 113);
        if (arg0 > -14) {
            field2820 = null;
        }
        int var44 = class151.field3474;
        if (class43.field990 < var44) {
            var44 = class43.field990;
        }
        if (var44 < class43.field990 - 1) {
            int var45 = class43.field990 - 1;
        }
        if (class154.field3531) {
            class159.field3659.method1144(class151.field3474);
        } else {
            class159.field3659.method1144(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class157.method1207(-1, var53, var46);
            }
        }
        class125.method982(-7);
        class137.method1041((byte) 56);
        class115.field2722.method491(118);
        if (class11.field184 != null) {
            class85.field1993++;
            class44.field1027.method357(153, -126);
            class44.field1027.method531(false, 1057001181);
        }
        if (!class56.field1300) {
            int var47 = (class62.field1423 + 6) / 8;
            int var48 = (class142.field3253 + 6) / 8;
            int var49 = (class62.field1423 - 6) / 8;
            int var50 = (class142.field3253 - 6) / 8;
            for (int var51 = var49 - 1; var51 <= var47 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var48 + 1; var52++) {
                    if (var51 < var49 || var51 > var47 || var52 < var50 || var48 < var52) {
                        class134.field3117.method212((byte) 95, class52.method403(new class32[] { class36.field768, class159.method1230(var51, 0), class19.field361, class159.method1230(var52, 0) }, (byte) -20));
                        class134.field3117.method212((byte) 95, class52.method403(new class32[] { class114.field2671, class159.method1230(var51, 0), class19.field361, class159.method1230(var52, 0) }, (byte) -20));
                    }
                }
            }
        }
        class54.method426(0, 30);
        class125.method982(-7);
        class117.method929(false);
        class44.field1027.method357(39, -123);
        class113.method888(0);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method936(byte arg0) {
        field2832 = null;
        field2820 = null;
        field2826 = null;
        if (arg0 < -78) {
            field2834 = null;
            field2835 = null;
            field2823 = null;
            field2837 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZB)V")
    private static final void method937(boolean arg0, byte arg1) {
        class125.method982(-7);
        field2818++;
        if (arg1 < 100) {
            method935((byte) -101);
        }
        class70.field1659++;
        if (class70.field1659 < 50 && !arg0) {
            return;
        }
        class70.field1659 = 0;
        if (class82.field1919 || class143.field3275 == null) {
            return;
        }
        class44.field1027.method357(232, -110);
        try {
            class143.field3275.method49(class44.field1027.field1587, class44.field1027.field1569, 0, (byte) 123);
            class44.field1027.field1569 = 0;
        } catch (IOException var2) {
            class82.field1919 = true;
        }
        class64.field1479++;
    }
}
