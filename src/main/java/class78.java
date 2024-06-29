import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class78 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    public static int[] field1134 = new int[500];

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lea;")
    public static class350 field1135 = null;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1136 = 0;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Ll;")
    public static class66 field1130 = new class66(64);

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[[[I")
    public static int[][][] field1137 = new int[2][][];

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field1139 = new String[100];

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Z")
    public static boolean field1138 = true;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Ljava/lang/String;")
    public String field1131;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 11)
    public static final void method717(int arg0) {
        field1125++;
        int var1 = class244.field3803.method1632(14538, 8);
        if (var1 < class66.field995) {
            for (int var2 = var1; var2 < class66.field995; var2++) {
                class318.field4903[class130.field2176++] = class345.field5495[var2];
            }
        }
        if (class66.field995 < var1) {
            throw new RuntimeException("gppov1");
        }
        class66.field995 = 0;
        if (arg0 != -14952) {
            field1139 = (String[]) null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class345.field5495[var3];
            class171 var5 = class177.field2795[var4];
            int var6 = class244.field3803.method1632(14538, 1);
            if (var6 == 0) {
                class345.field5495[class66.field995++] = var4;
                var5.field1385 = class360.field5718;
            } else {
                int var7 = class244.field3803.method1632(14538, 2);
                if (var7 == 0) {
                    class345.field5495[class66.field995++] = var4;
                    var5.field1385 = class360.field5718;
                    class326.field5010[class120.field1861++] = var4;
                } else if (var7 == 1) {
                    class345.field5495[class66.field995++] = var4;
                    var5.field1385 = class360.field5718;
                    int var8 = class244.field3803.method1632(14538, 3);
                    var5.method818(var8, (byte) -67, 1);
                    int var9 = class244.field3803.method1632(14538, 1);
                    if (var9 == 1) {
                        class326.field5010[class120.field1861++] = var4;
                    }
                } else if (var7 == 2) {
                    class345.field5495[class66.field995++] = var4;
                    var5.field1385 = class360.field5718;
                    if (class244.field3803.method1632(14538, 1) == 1) {
                        int var11 = class244.field3803.method1632(14538, 3);
                        var5.method818(var11, (byte) 80, 2);
                        int var12 = class244.field3803.method1632(arg0 ^ 0xFFFFFD52, 3);
                        var5.method818(var12, (byte) 79, 2);
                    } else {
                        int var10 = class244.field3803.method1632(14538, 3);
                        var5.method818(var10, (byte) -62, 0);
                    }
                    int var13 = class244.field3803.method1632(14538, 1);
                    if (var13 == 1) {
                        class326.field5010[class120.field1861++] = var4;
                    }
                } else if (var7 == 3) {
                    class318.field4903[class130.field2176++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 123)
    public static void method718(boolean arg0) {
        field1137 = (int[][][]) null;
        field1130 = null;
        field1139 = null;
        if (arg0) {
            field1138 = false;
        }
        field1134 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILec;)Z", line = 149)
    public static final boolean method719(int arg0, class181 arg1) {
        if (arg0 != 8) {
            field1138 = true;
        }
        field1132++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2858) {
            return false;
        } else if (!arg1.method1403(true)) {
            return false;
        } else if (class50.field783.method370((byte) -120, (long) arg1.field2865) == null) {
            return class301.field4683.method370((byte) -120, (long) arg1.field2857) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 186)
    public static final String method720(int arg0, boolean arg1) {
        if (arg1) {
            method720(115, true);
        }
        field1133++;
        return class318.field4904[arg0].length() > 0 ? class212.field3328[arg0] + class311.field4822 + class318.field4904[arg0] : class212.field3328[arg0];
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 201)
    public static final void method721(byte arg0) {
        class9.field129.method655(-1);
        if (arg0 == 39) {
            field1127++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBI)I", line = 215)
    public static final int method722(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1128++;
        if (class31.field492) {
            class31.field492 = false;
            arg1 = 1000000;
        }
        class110 var5 = class49.field774[arg2][arg4];
        float var6 = var5.field1684;
        if (arg3 != -124) {
            method722(-45, -53, -32, (byte) 49, 24);
        }
        int var7 = var5.field1694;
        float var8 = ((float) arg0 * 0.1F + 0.7F) * var5.field1685;
        float var9 = var5.field1689;
        int var10 = var5.field1695;
        int var11 = var5.field1690;
        class96 var12 = var5.field1692;
        if (!class343.field5451) {
            var11 = 0;
        }
        float var13 = var5.field1677;
        float var14 = var5.field1678;
        float var15 = var5.field1676;
        if (class310.field4786 != var7 || class126.field2108 != var8 || class227.field3542 != var6 || class206.field3174 != var9 || class282.field4361 != var10 || class268.field4140 != var11 || class298.field4624 != var12 || class177.field2785 != var14 || class202.field3125 != var15 || class115.field1769 != var13) {
            class42.field666 = class105.field1584;
            class197.field3087 = class285.field4428;
            class303.field4723 = class154.field2490;
            class99.field1490 = class20.field325;
            class344.field5465 = class353.field5641;
            class350.field5571 = class224.field3511;
            class85.field1212 = class64.field981;
            class238.field3682 = class146.field2383;
            class285.field4418 = class105.field1580;
            class239.field3721 = class347.field5517;
            if (class342.field5338 == null || class350.field5571 == class342.field5338) {
                class342.field5338 = new class96();
            }
            class126.field2108 = var8;
            class202.field3125 = var15;
            class151.field2463 = 0;
            class268.field4140 = var11;
            class227.field3542 = var6;
            class310.field4786 = var7;
            class115.field1769 = var13;
            class282.field4361 = var10;
            class298.field4624 = var12;
            class177.field2785 = var14;
            class206.field3174 = var9;
        }
        if (class151.field2463 < 65536) {
            class151.field2463 += arg1 * 250;
            if (class151.field2463 >= 65536) {
                class224.field3511 = class298.field4624;
                class353.field5641 = class282.field4361;
                class105.field1580 = class268.field4140;
                class285.field4428 = class202.field3125;
                class105.field1584 = class126.field2108;
                class151.field2463 = 65536;
                class146.field2383 = class177.field2785;
                class154.field2490 = class227.field3542;
                class347.field5517 = class206.field3174;
                class64.field981 = class115.field1769;
                class20.field325 = class310.field4786;
                class350.field5571 = null;
            } else {
                int var16 = 65536 - class151.field2463 >> 8;
                int var17 = class151.field2463 >> 8;
                float var18 = (float) (65536 - class151.field2463) / 65536.0F;
                float var19 = (float) class151.field2463 / 65536.0F;
                class20.field325 = ((class99.field1490 & 0xFF00) * var16 + (class310.field4786 & 0xFF00) * var17 & 0xFF0000) + ((class99.field1490 & 0xFF00FF) * var16 + (class310.field4786 & 0xFF00FF) * var17 & 0xFF00FF00) >> 8;
                class347.field5517 = class239.field3721 * var18 + class206.field3174 * var19;
                class285.field4428 = class202.field3125 * var19 + class197.field3087 * var18;
                class105.field1584 = class42.field666 * var18 + class126.field2108 * var19;
                class64.field981 = class85.field1212 * var18 + class115.field1769 * var19;
                class154.field2490 = class303.field4723 * var18 + class227.field3542 * var19;
                class353.field5641 = ((class344.field5465 & 0xFF00FF) * var16 + (class282.field4361 & 0xFF00FF) * var17 & 0xFF00FF00) + ((class344.field5465 & 0xFF00) * var16 + (class282.field4361 & 0xFF00) * var17 & 0xFF0000) >> 8;
                class105.field1580 = class285.field4418 * var16 + (class268.field4140 * var17) >> 8;
                class146.field2383 = class238.field3682 * var18 + class177.field2785 * var19;
                if (class350.field5571 != class298.field4624) {
                    if (class350.field5571 == null || class298.field4624 == null) {
                        class224.field3511 = null;
                    } else {
                        class224.field3511 = class342.field5338.method843(class350.field5571, class298.field4624, (float) class151.field2463 / 65536.0F);
                    }
                }
            }
        }
        return class353.field5641;
    }
}
