import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
    public static int[] field236 = new int[32];

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lja;")
    private static class62 field241;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lja;")
    public static class62 field239;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lgd;")
    public static class46 field243;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lhb;")
    public static class50 field242;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field240;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[Lic;")
    public static class58[] field235;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method75(byte arg0) {
        class38.field879.method805(8);
        field237++;
        int var1 = class38.field879.method811(7, 8);
        int var2 = -30 % ((arg0 + 67) / 35);
        if (var1 < class83.field2001) {
            for (int var3 = var1; var3 < class83.field2001; var3++) {
                class42.field989[class134.field3088++] = class36.field871[var3];
            }
        }
        if (class83.field2001 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class83.field2001 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class36.field871[var4];
            class130 var6 = class136.field3127[var5];
            int var7 = class38.field879.method811(7, 1);
            if (var7 == 0) {
                class36.field871[class83.field2001++] = var5;
                var6.field180 = class86.field2060;
            } else {
                int var8 = class38.field879.method811(7, 2);
                if (var8 == 0) {
                    class36.field871[class83.field2001++] = var5;
                    var6.field180 = class86.field2060;
                    class38.field894[class34.field814++] = var5;
                } else if (var8 == 1) {
                    class36.field871[class83.field2001++] = var5;
                    var6.field180 = class86.field2060;
                    int var9 = class38.field879.method811(7, 3);
                    var6.method60(false, (byte) -83, var9);
                    int var10 = class38.field879.method811(7, 1);
                    if (var10 == 1) {
                        class38.field894[class34.field814++] = var5;
                    }
                } else if (var8 == 2) {
                    class36.field871[class83.field2001++] = var5;
                    var6.field180 = class86.field2060;
                    int var11 = class38.field879.method811(7, 3);
                    var6.method60(true, (byte) -70, var11);
                    int var12 = class38.field879.method811(7, 3);
                    var6.method60(true, (byte) -97, var12);
                    int var13 = class38.field879.method811(7, 1);
                    if (var13 == 1) {
                        class38.field894[class34.field814++] = var5;
                    }
                } else if (var8 == 3) {
                    class42.field989[class134.field3088++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public static final void method76(int arg0, int arg1) {
        field234++;
        if (class39.field912 == null || arg1 < 0 || arg1 >= class39.field912.length || class39.field912[arg1] == null) {
            return;
        }
        class79.field1918++;
        if (arg0 <= 87) {
            method78(20);
        }
        class136.field3140.method810(-2, 255);
        class136.field3140.method1008(class39.field912[arg1].field3493, (byte) 38);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
    public static final void method77(byte arg0, int arg1) {
        class151.field3544 += arg1 * 128;
        if (class151.field3544 > class75.field1867.length) {
            class151.field3544 -= class75.field1867.length;
            int var2 = (int) (Math.random() * 12.0D);
            class143.method1133(0, class132.field3027[var2]);
        }
        short var3 = 256;
        int var4 = arg1 * 128;
        if (arg0 <= 81) {
            return;
        }
        int var5 = 0;
        int var6 = (var3 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class134.field3092[var4 + var5] - class75.field1867[class75.field1867.length - 1 & class151.field3544 + var5] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class134.field3092[var5++] = var27;
        }
        for (int var8 = var3 - arg1; var8 < var3; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class134.field3092[var24 + var25] = 255;
                } else {
                    class134.field3092[var25 + var24] = 0;
                }
            }
        }
        if (class7.field216 > 0) {
            class7.field216 -= arg1 * 4;
        }
        if (class40.field929 > 0) {
            class40.field929 -= arg1 * 4;
        }
        if (class7.field216 == 0 && class40.field929 == 0) {
            int var9 = (int) (Math.random() * (double) (2000 / arg1));
            if (var9 == 1) {
                class40.field929 = 1024;
            }
            if (var9 == 0) {
                class7.field216 = 1024;
            }
        }
        field238++;
        for (int var10 = 0; var10 < var3 - arg1; var10++) {
            class98.field2297[var10] = class98.field2297[arg1 + var10];
        }
        for (int var11 = var3 - arg1; var11 < var3; var11++) {
            class98.field2297[var11] = (int) (Math.sin((double) class15.field349 / 14.0D) * 16.0D + Math.sin((double) class15.field349 / 15.0D) * 14.0D + Math.sin((double) class15.field349 / 16.0D) * 12.0D);
            class15.field349++;
        }
        class126.field2846 += arg1;
        int var12 = ((class86.field2060 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class126.field2846 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class134.field3092[var22 + (var23 << 7)] = 192;
        }
        class126.field2846 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class134.field3092[var12 + var21 + var20];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class134.field3092[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class151.field3550[var21 + var20] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var3 > var17 + var12) {
                    var16 += class151.field3550[var12 * 128 + var18 + var15];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class151.field3550[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class134.field3092[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method78(int arg0) {
        field242 = null;
        field241 = null;
        if (arg0 != 3510) {
            return;
        }
        field243 = null;
        field239 = null;
        field235 = null;
        field240 = null;
        field236 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field236[var1] = var0 - 1;
            var0 += var0;
        }
        field241 = class30.method243(43, "Continue");
        field239 = field241;
    }
}
