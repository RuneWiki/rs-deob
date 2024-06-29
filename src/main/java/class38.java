import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class38 {

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lmj;")
    public static class129 field520 = null;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[I")
    public static int[] field521 = new int[2048];

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
    public static int[] field518 = new int[1000];

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Lqe;")
    public static class168 field519 = class66.method448("Untersuchen", -114);

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lqe;")
    public static class168 field525 = class66.method448("<col=40ff00>", 74);

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Loe;")
    public static class256 field515;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static void method256(boolean arg0) {
        if (!arg0) {
            method256(true);
        }
        field515 = null;
        field519 = null;
        field520 = null;
        field521 = null;
        field525 = null;
        field518 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[B)V")
    public static final void method257(int arg0, byte[] arg1) {
        class112 var2 = new class112(arg1);
        var2.field1821 = arg1.length - 2;
        class85.field1331 = var2.method731(false);
        class54.field746 = new int[class85.field1331];
        class85.field1332 = new int[class85.field1331];
        class33.field415 = new int[class85.field1331];
        field523++;
        class69.field981 = new boolean[class85.field1331];
        class7.field84 = new byte[class85.field1331][];
        class69.field978 = new int[class85.field1331];
        class21.field256 = new byte[class85.field1331][];
        var2.field1821 = arg1.length - class85.field1331 * 8 - 7;
        class243.field4225 = var2.method731(false);
        class150.field2597 = var2.method731(false);
        int var3 = (var2.method758(true) & 0xFF) + 1;
        for (int var4 = 0; var4 < class85.field1331; var4++) {
            class33.field415[var4] = var2.method731(false);
        }
        for (int var5 = 0; var5 < class85.field1331; var5++) {
            class54.field746[var5] = var2.method731(false);
        }
        for (int var6 = 0; var6 < class85.field1331; var6++) {
            class85.field1332[var6] = var2.method731(false);
        }
        for (int var7 = arg0; var7 < class85.field1331; var7++) {
            class69.field978[var7] = var2.method731(false);
        }
        var2.field1821 = arg1.length - class85.field1331 * 8 - (var3 + -1) * 3 - 7;
        class92.field1457 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class92.field1457[var8] = var2.method727(-27619);
            if (class92.field1457[var8] == 0) {
                class92.field1457[var8] = 1;
            }
        }
        var2.field1821 = 0;
        for (int var9 = 0; var9 < class85.field1331; var9++) {
            int var10 = class85.field1332[var9];
            int var11 = class69.field978[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class7.field84[var9] = var13;
            class21.field256[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method758(true);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method750(-126);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method750(90);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label97: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var10 <= var21) {
                                break label97;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var10 * var22 + var21] = var2.method750(49);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var13[var20 + var10 * var24] = var2.method750(class45.method298(arg0, 67));
                    }
                    var20++;
                }
            }
            class69.field981[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public static final void method258(int arg0, int arg1, int arg2) {
        field517++;
        if (class109.field1748 < 2 && class190.field3311 == 0 && !class84.field1277) {
            return;
        }
        class168 var3;
        if (class190.field3311 == 1 && class109.field1748 < 2) {
            var3 = class50.method347(2, new class168[] { class90.field1398, class237.field4052, class117.field1911, class66.field929 });
        } else if (class84.field1277 && class109.field1748 < 2) {
            var3 = class50.method347(2, new class168[] { class19.field236, class237.field4052, class128.field2118, class66.field929 });
        } else {
            var3 = class14.method53(-7303, class109.field1748 - 1);
        }
        if (class109.field1748 > 2) {
            var3 = class50.method347(arg0 - 2, new class168[] { var3, class108.field1738, class128.method867((byte) 120, class109.field1748 - 2), class100.field1585 });
        }
        int var4 = class123.field2028.method928(var3, arg2 + 4, arg1 + 15, 16777215, 0, class120.field1972, class149.field2590);
        class208.method1352(arg0 + arg2, -622332702, arg1, class123.field2028.method922(var3) + var4, 15);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(JI)V")
    public static final void method259(long arg0, int arg1) {
        field524++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class167.method1067((byte) 85, arg0 - 1L);
            class167.method1067((byte) 85, 1L);
        } else {
            class167.method1067((byte) 85, arg0);
        }
        if (arg1 != 31644) {
            method257(-122, null);
        }
    }
}
