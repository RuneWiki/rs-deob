import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class28 {

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Ljd;")
    private static class92 field622 = class202.method1325((byte) 90, "flash3:");

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Ljd;")
    public static class92 field629 = field622;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Ljd;")
    public static class92 field616 = field622;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Ljd;")
    private static class92 field627 = class202.method1325((byte) 90, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Ljd;")
    public static class92 field628 = field627;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "[I")
    public static int[] field631 = new int[128];

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "B")
    public static byte field626;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "J")
    public long field632;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Ltg;")
    public class186 field633;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method174(int arg0) {
        field619++;
        class105.method718((byte) 26, false);
        class66.field1336 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class195.field3806.length; var2++) {
            if (class208.field3992[var2] != -1 && class195.field3806[var2] == null) {
                class195.field3806[var2] = class182.field3462.method899((byte) 87, class208.field3992[var2], 0);
                if (class195.field3806[var2] == null) {
                    var1 = false;
                    class66.field1336++;
                }
            }
            if (class104.field2140[var2] != -1 && class175.field3384[var2] == null) {
                class175.field3384[var2] = class182.field3462.method894(class113.field2275[var2], 0, 1, class104.field2140[var2]);
                if (class175.field3384[var2] == null) {
                    var1 = false;
                    class66.field1336++;
                }
            }
        }
        if (!var1) {
            class51.field1085 = 1;
            return;
        }
        class29.field638 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class195.field3806.length; var4++) {
            byte[] var56 = class175.field3384[var4];
            if (var56 != null) {
                int var57 = (class92.field1850[var4] >> 8) * 64 - class115.field2343;
                int var58 = (class92.field1850[var4] & 0xFF) * 64 - class210.field4077;
                if (class100.field2057) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class214.method1398(var57, var58, true, var56);
            }
        }
        if (!var3) {
            class51.field1085 = 2;
            return;
        }
        if (class51.field1085 != 0) {
            class15.method93((byte) -90, true, class77.method529(-3, new class92[] { class143.field2846, class39.field886 }));
        }
        class6.method42((byte) -23);
        class97.method676(false);
        class6.method42((byte) -83);
        class100.method695();
        class6.method42((byte) -45);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class32.field729[var5].method799(1);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class59.field1239[var6][var54][var55] = 0;
                }
            }
        }
        class6.method42((byte) -119);
        class102.method701(100);
        int var7 = class195.field3806.length;
        class143.method945(-126);
        class105.method718((byte) 101, true);
        if (!class100.field2057) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class92.field1850[var8] >> 8) * 64 - class115.field2343;
                int var18 = (class92.field1850[var8] & 0xFF) * 64 - class210.field4077;
                byte[] var19 = class195.field3806[var8];
                if (var19 != null) {
                    class6.method42((byte) -40);
                    class209.method1360(var18, class67.field1352 * 8 - 48, class32.field729, (byte) -60, var19, (class61.field1260 - 6) * 8, var17);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class92.field1850[var9] >> 8) * 64 - class115.field2343;
                int var15 = (class92.field1850[var9] & 0xFF) * 64 - class210.field4077;
                byte[] var16 = class195.field3806[var9];
                if (var16 == null && class61.field1260 < 800) {
                    class6.method42((byte) -102);
                    class115.method780(var15, var14, 64, 121, 64);
                }
            }
            class105.method718((byte) 80, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class175.field3384[var10];
                if (var11 != null) {
                    int var12 = (class92.field1850[var10] & 0xFF) * 64 - class210.field4077;
                    int var13 = (class92.field1850[var10] >> 8) * 64 - class115.field2343;
                    class6.method42((byte) -119);
                    class43.method268(var11, var12, 55, var13, class32.field729);
                }
            }
        }
        if (arg0 < 71) {
            method176(false);
        }
        if (class100.field2057) {
            for (int var20 = 0; var20 < 4; var20++) {
                class6.method42((byte) -69);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class10.field360[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class92.field1850.length; var43++) {
                                if (class92.field1850[var43] == var42 && class195.field3806[var43] != null) {
                                    class213.method1382(class32.field729, var34 * 8, class195.field3806[var43], var38, var35 * 8, (var41 & 0x7) * 8, var20, -104, var39, (var40 & 0x7) * 8);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class207.method1349((byte) -123, var20, var35 * 8, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class10.field360[0][var21][var32];
                    if (var33 == -1) {
                        class115.method780(var32 * 8, var21 * 8, 8, 121, 8);
                    }
                }
            }
            class105.method718((byte) 117, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class6.method42((byte) -128);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class10.field360[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + (var28 / 8);
                            for (int var31 = 0; var31 < class92.field1850.length; var31++) {
                                if (class92.field1850[var31] == var30 && class175.field3384[var31] != null) {
                                    class157.method1013(93, var27, (var29 & 0x7) * 8, (var28 & 0x7) * 8, class32.field729, var22, var26, class175.field3384[var31], var23 * 8, var24 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class105.method718((byte) 32, true);
        class97.method676(false);
        class6.method42((byte) -61);
        class102.method703((byte) -3, class32.field729);
        class105.method718((byte) 91, true);
        int var44 = class42.field938;
        if (var44 > class81.field1639) {
            var44 = class81.field1639;
        }
        if (var44 < class81.field1639 - 1) {
            int var45 = class81.field1639 - 1;
        }
        if (class115.field2339) {
            class210.method1366(class42.field938);
        } else {
            class210.method1366(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class165.method1073(var53, var46, false);
            }
        }
        class6.method42((byte) -77);
        class97.method673(-2);
        class97.method676(false);
        if (class187.field3539 != null) {
            class99.field2000.method405(40, 7);
            class99.field2000.method446(1057001181, -26751);
            class135.field2697++;
        }
        if (!class100.field2057) {
            int var47 = (class67.field1352 - 6) / 8;
            int var48 = (class67.field1352 + 6) / 8;
            int var49 = (class61.field1260 - 6) / 8;
            int var50 = (class61.field1260 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var51 > var48 || var49 > var52 || var52 > var50) {
                        class182.field3462.method879(class77.method529(-3, new class92[] { class172.field3346, class142.method938(var51, false), class100.field2055, class142.method938(var52, false) }), 20);
                        class182.field3462.method879(class77.method529(-3, new class92[] { class179.field3435, class142.method938(var51, false), class100.field2055, class142.method938(var52, false) }), 126);
                    }
                }
            }
        }
        class213.method1385((byte) 83, 30);
        class6.method42((byte) -60);
        class182.method1190(6599);
        class99.field2000.method405(235, 7);
        class6.method43((byte) 93);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)Lef;")
    public static final class47 method175(int arg0, boolean arg1) {
        field621++;
        class47 var2 = (class47) class66.field1348.method930(-125, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class47 var3 = class73.method514(arg0, class100.field2066, -1828872888, arg1, class123.field2492);
        if (var3 != null) {
            class66.field1348.method927(24744, var3, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static final void method176(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (class187 var1 = (class187) class135.field2699.method103(57); var1 != null; var1 = (class187) class135.field2699.method100(-49)) {
            if (var1.field3540 != null) {
                var1.method1208(-97);
            }
        }
        field630++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lnh;Lnh;Lnh;I)V")
    public static final void method177(class133 arg0, class133 arg1, class133 arg2, int arg3) {
        class100.field2066 = arg0;
        field624++;
        if (arg3 != 0) {
            field628 = null;
        }
        class123.field2492 = arg2;
        class152.field3022 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Ljd;")
    public static final class92 method178(int arg0, int arg1) {
        field625++;
        return arg1 == 0 ? class77.method529(-3, new class92[] { class142.method938(arg0 >> 24 & 0xFF, false), class197.field3854, class142.method938(arg0 >> 16 & 0xFF, false), class197.field3854, class142.method938(arg0 >> 8 & 0xFF, false), class197.field3854, class142.method938(arg0 & 0xFF, false) }) : null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static final void method179(int arg0) {
        for (class105 var1 = (class105) class118.field2394.method215((byte) -128); var1 != null; var1 = (class105) class118.field2394.method209(false)) {
            int var2 = var1.field2155;
            if (class188.method1210(arg0 - 18040, var2)) {
                boolean var3 = true;
                class1[] var4 = class60.field1256[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field94;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4079;
                    class1 var7 = class175.method1155(var6, (byte) -110);
                    if (var7 != null) {
                        class3.method21(arg0 + 26702, var7);
                    }
                }
            }
        }
        if (arg0 != 0) {
            method177(null, null, null, 91);
        }
        field615++;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public static void method180(int arg0) {
        field629 = null;
        field628 = null;
        field616 = null;
        field622 = null;
        if (arg0 == -19308) {
            field631 = null;
            field627 = null;
        }
    }
}
