import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class176 extends class129 {

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "Z")
    public volatile boolean field2893 = true;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Z")
    public static boolean field2889 = false;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "[I")
    public static int[] field2884 = new int[100];

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2894 = "K";

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2897 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Z")
    public boolean field2885;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Z")
    public boolean field2887;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "[[Z")
    public static boolean[][] field2892;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)[B")
    public abstract byte[] method36(byte arg0);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static final void method1169(boolean arg0) {
        class67.field1115.method58(0);
        class91.field1609.method58(0);
        if (arg0) {
            field2892 = null;
        }
        class201.field3302.method58(0);
        field2890++;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)I")
    public abstract int method37(int arg0);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
    public static final int method1170(int arg0, int arg1) {
        field2899++;
        return arg1 <= 40 ? -101 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lvh;B)V")
    public static final void method1171(class108 arg0, byte arg1) {
        field2896++;
        class156.field2614 = class166.method1115(class1.field14, arg0, false);
        class246.field4037 = new int[256];
        int var2 = -57 / ((68 - arg1) / 44);
        for (int var3 = 0; var3 < 3; var3++) {
            float var5 = (float) ((class184.field2989[var3] & 0xFF0000) >> 16);
            int var6 = (class184.field2989[var3 + 1] & 0xFF0000) >> 16;
            float var7 = ((float) var6 - var5) / 64.0F;
            float var8 = (float) (class184.field2989[var3] >> 8 & 0xFF);
            int var9 = (class184.field2989[var3 + 1] & 0xFF00) >> 8;
            float var10 = ((float) var9 - var8) / 64.0F;
            int var11 = class184.field2989[var3 + 1] & 0xFF;
            float var12 = (float) (class184.field2989[var3] & 0xFF);
            float var13 = ((float) var11 - var12) / 64.0F;
            for (int var14 = 0; var14 < 64; var14++) {
                class246.field4037[var3 * 64 + var14] = class112.method789((int) var12, class112.method789((int) var5 << 16, (int) var8 << 8));
                var5 += var7;
                var12 += var13;
                var8 += var10;
            }
        }
        for (int var4 = 192; var4 < 255; var4++) {
            class246.field4037[var4] = class184.field2989[3];
        }
        class106.field1902 = new int[32768];
        class163.field2696 = new int[32768];
        class134.method933((class148) null, 18243);
        class190.field3078 = new int[32768];
        class125.field2203 = new int[32768];
        class119.field2113 = new class197(128, 254);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static void method1172(int arg0) {
        if (arg0 != -9342) {
            field2897 = null;
        }
        field2894 = null;
        field2892 = null;
        field2897 = null;
        field2884 = null;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
    public static final void method1173(byte arg0) {
        if (class131.field2292.toLowerCase().indexOf("microsoft") == -1) {
            class6.field68[45] = 26;
            class6.field68[92] = 74;
            class6.field68[46] = 72;
            class6.field68[93] = 43;
            class6.field68[47] = 73;
            class6.field68[61] = 27;
            if (class131.field2301 == null) {
                class6.field68[192] = 58;
                class6.field68[222] = 59;
            } else {
                class6.field68[192] = 28;
                class6.field68[520] = 59;
                class6.field68[222] = 58;
            }
            class6.field68[59] = 57;
            class6.field68[44] = 71;
            class6.field68[91] = 42;
        } else {
            class6.field68[188] = 71;
            class6.field68[223] = 28;
            class6.field68[190] = 72;
            class6.field68[186] = 57;
            class6.field68[219] = 42;
            class6.field68[221] = 43;
            class6.field68[187] = 27;
            class6.field68[192] = 58;
            class6.field68[189] = 26;
            class6.field68[191] = 73;
            class6.field68[222] = 59;
            class6.field68[220] = 74;
        }
        field2891++;
        if (arg0 <= 97) {
            method1174(-5);
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    public static final void method1174(int arg0) {
        field2888++;
        while (true) {
            class27 var1;
            class81 var3;
            do {
                var1 = (class27) class66.field1104.method368(-1);
                if (var1 == null) {
                    if (arg0 != 1764) {
                        field2884 = null;
                        return;
                    }
                    return;
                }
                if (var1.field402 < 0) {
                    int var2 = -var1.field402 - 1;
                    if (class37.field545 == var2) {
                        var3 = class273.field4378;
                    } else {
                        var3 = class105.field1874[var2];
                    }
                } else {
                    int var4 = var1.field402 - 1;
                    var3 = class42.field625[var4];
                }
            } while (var3 == null);
            class206 var5 = class10.method64(64, var1.field399);
            int var6;
            int var7;
            if (var1.field401 == 1 || var1.field401 == 3) {
                var6 = var5.field3404;
                var7 = var5.field3377;
            } else {
                var6 = var5.field3377;
                var7 = var5.field3404;
            }
            int var8 = (var6 + 1 >> 1) + var1.field405;
            int var9 = (var7 >> 1) + var1.field400;
            int var10 = (var6 >> 1) + var1.field405;
            int[][] var11 = class95.field1642[field2886];
            int var12 = class145.field2483[var1.field406];
            int var13 = var1.field400 + (var7 + 1 >> 1);
            int var14 = var11[var8][var13] + var11[var10][var9] + var11[var8][var9] + var11[var10][var13] >> 2;
            class184 var15 = null;
            if (var12 == 0) {
                class212 var19 = class15.method88(field2886, var1.field405, var1.field400);
                if (var19 != null) {
                    var15 = var19.field3572;
                }
            } else if (var12 == 1) {
                class223 var18 = class156.method1072(field2886, var1.field405, var1.field400);
                if (var18 != null) {
                    var15 = var18.field3764;
                }
            } else if (var12 == 2) {
                class173 var16 = class98.method617(field2886, var1.field405, var1.field400);
                if (var16 != null) {
                    var15 = var16.field2842;
                }
            } else if (var12 == 3) {
                class11 var17 = class192.method1252(field2886, var1.field405, var1.field400);
                if (var17 != null) {
                    var15 = var17.field158;
                }
            }
            if (var15 != null) {
                class239.method1575(var1.field407 + 1, var1.field409 + 1, field2886, 0, 2047, var1.field400, var12, var1.field405, 0, -1);
                var3.field1467 = var1.field405 * 128 + var6 * 64;
                var3.field1442 = var15;
                var3.field1436 = class266.field4301 + var1.field409;
                var3.field1410 = class266.field4301 + var1.field407;
                var3.field1415 = var1.field400 * 128 + (var7 * 64);
                var3.field1398 = var14;
                int var20 = var1.field403;
                int var21 = var1.field412;
                int var22 = var1.field410;
                int var23 = var1.field417;
                if (var20 > var23) {
                    int var24 = var20;
                    var20 = var23;
                    var23 = var24;
                }
                var3.field1417 = var1.field405 + var23;
                var3.field1394 = var1.field405 + var20;
                if (var22 < var21) {
                    int var25 = var21;
                    var21 = var22;
                    var22 = var25;
                }
                var3.field1455 = var1.field400 + var22;
                var3.field1416 = var1.field400 + var21;
            }
        }
    }
}
