import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class129 {

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public int field2411 = 0;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public int field2421 = 0;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2409 = 0;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lsg;")
    private static class169 field2408 = class165.method1060(" ", 1536);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lsg;")
    public static class169 field2405 = field2408;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lwc;")
    public static class201 field2403 = new class201(0, 0);

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Lsg;")
    public static class169 field2420 = class165.method1060("Benutzen", 1536);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lqf;")
    public static class150 field2419;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lac;")
    public class4 field2412;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lac;")
    public class4 field2416;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lgd;")
    public static class59 field2407;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public static final void method835(boolean arg0) {
        field2418++;
        short var1 = 256;
        if (class180.field3514 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class180.field3514 > 768) {
                    client.field585[var4] = class204.method1326(class152.field2931[var4], class181.field3521[var4], 104, 1024 - class180.field3514);
                } else if (class180.field3514 <= 256) {
                    client.field585[var4] = class204.method1326(class181.field3521[var4], class152.field2931[var4], 125, 256 - class180.field3514);
                } else {
                    client.field585[var4] = class152.field2931[var4];
                }
            }
        } else if (class156.field2988 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class156.field2988 > 768) {
                    client.field585[var2] = class204.method1326(class1.field1[var2], class181.field3521[var2], 103, 1024 - class156.field2988);
                } else if (class156.field2988 <= 256) {
                    client.field585[var2] = class204.method1326(class181.field3521[var2], class1.field1[var2], -99, 256 - class156.field2988);
                } else {
                    client.field585[var2] = class1.field1[var2];
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                client.field585[var3] = class181.field3521[var3];
            }
        }
        int var5 = 0;
        if (!arg0) {
            field2408 = null;
        }
        int var6 = class160.field3056.field409 * 9;
        int var7 = 0;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var21 = (var1 - var8) * class193.field3811[var8] / var1 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class17.field347[var5++];
                int var25 = class160.field3056.field408[var6++];
                if (var24 == 0) {
                    class54.field990.field408[var7++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = client.field585[var24];
                    class54.field990.field408[var7++] = class150.method984(class150.method984(var25, 16711935) * var27 + class150.method984(16711935, var28) * var24, -16711936) + class150.method984(16711680, class150.method984(65280, var28) * var24 + var27 * class150.method984(65280, var25)) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class54.field990.field408[var7++] = class160.field3056.field408[var6++];
            }
            var6 += class160.field3056.field409 - 128;
        }
        class54.field990.method111(0, 9);
        int var9 = 0;
        int var10 = class160.field3056.field409 * 9 + 128;
        int var11 = 0;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class193.field3811[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var9++;
                var10--;
                class141.field2620.field408[var10001] = class160.field3056.field408[var10];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class17.field347[var11++];
                var10--;
                int var17 = class160.field3056.field408[var10];
                if (var16 == 0) {
                    class141.field2620.field408[var9++] = var17;
                } else {
                    int var19 = 256 - var16;
                    int var20 = client.field585[var16];
                    class141.field2620.field408[var9++] = class150.method984(var19 * class150.method984(65280, var17) + class150.method984(65280, var20) * var16, 16711680) + class150.method984(class150.method984(var17, 16711935) * var19 + var16 * class150.method984(16711935, var20), -16711936) >> 8;
                }
            }
            var10 += class160.field3056.field409 + 128;
            var11 += var13;
        }
        class141.field2620.method111(637, 9);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Lsg;")
    public static final class169 method836(int arg0, int arg1, int arg2) {
        field2417++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class123.field2265;
        } else if (var3 < -6) {
            return class177.field3460;
        } else if (~var3 > arg0) {
            return class56.field1032;
        } else if (var3 < 0) {
            return class35.field700;
        } else if (var3 > 9) {
            return class115.field2125;
        } else if (var3 > 6) {
            return class175.field3399;
        } else if (var3 > 3) {
            return class203.field3973;
        } else if (var3 > 0) {
            return class131.field2439;
        } else {
            return class116.field2145;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method837(byte arg0) {
        field2403 = null;
        field2419 = null;
        if (arg0 != 108) {
            field2407 = null;
        }
        field2408 = null;
        field2420 = null;
        field2405 = null;
        field2407 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BIIII)V")
    public static final void method838(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -107) {
            return;
        }
        if (class2.field47 == 1) {
            class95.field1787[class107.field1964 / 100].method123(class65.field1205 - 8, class121.field2229 - 8);
        }
        if (class2.field47 == 2) {
            class95.field1787[class107.field1964 / 100 + 4].method123(class65.field1205 - 8, class121.field2229 - 8);
        }
        class203.method1320(-3119);
        field2415++;
        if (!class8.field225) {
            return;
        }
        int var5 = arg3 + 512 - 5;
        int var6 = arg2 + 20;
        class96.field1823.method727(class165.method1058(0, new class169[] { class144.field2679, class2.method18((byte) -62, class158.field3018) }), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        int var7 = 16776960;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        if (var9 > 32768 && class105.field1925) {
            var7 = 16711680;
        }
        if (var9 > 65536 && !class105.field1925) {
            var7 = 16711680;
        }
        class96.field1823.method727(class165.method1058(0, new class169[] { class202.field3944, class2.method18((byte) -62, var9), class82.field1514 }), var5, var10, var7, -1);
        var6 = var10 + 15;
    }
}
