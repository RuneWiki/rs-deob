import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class176 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lij;")
    private static class50 field2948 = class78.method578(123, "Please remove ");

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lij;")
    public static class50 field2947 = class78.method578(122, "null");

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lij;")
    public static class50 field2945 = field2948;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lij;")
    public static class50 field2949 = field2948;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "[I")
    public static int[] field2951 = new int[] { 0, 0, 0, -1, 5, 4, 0, 4, 0, 4, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0, 1, 0, 3, 0, 0, 0, -2, 0, 0, 0, 0, 3, 24, 0, 2, 0, 0, 0, -1, 6, 0, 0, 1, 0, 5, 0, 4, -1, 0, 0, 0, 6, -1, 0, 3, 0, 0, 1, 0, 2, -2, 0, 0, 0, -1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 6, -2, 4, 0, 4, 0, 0, 5, 0, 4, 0, 7, 0, 4, 0, -2, 0, -2, 0, -2, 0, 14, 0, 0, 4, 0, 3, 7, 0, -2, 1, 0, 0, 0, 0, 7, 0, 0, 0, 0, 8, 0, 0, 2, 0, 8, 0, -1, 5, -2, 5, 10, 0, 0, 0, -1, 0, 0, 0, 0, 6, 0, 20, 0, 6, 0, 0, 2, 0, 12, 6, 0, 0, 0, 0, 6, 6, 15, 0, -2, 1, 0, 0, 8, 10, 0, -1, 0, 2, 0, 0, 0, -1, 7, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, -2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 3, 0, 0, -2, 0, 0, 0, 0, 0, 0, 10, -1, 0, 6, 0, 0, -1, 0, 0, 8, 0, 0, 5, -1, 0, 0, 3, 0, 8, 6, 0, 0, 0, 0, 0, 5, 0, 9, 0, 0, 0, 0, 6, 15, -1, 0, 0, 0, 6, 0, 0, 0 };

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2950;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZ)V")
    public static final void method1211(boolean arg0, boolean arg1) {
        if (arg0) {
            method1213(-10);
        }
        field2952++;
        class163.field2783 = arg1;
        if (!class163.field2783) {
            int var25 = class119.field2109.method1441(102);
            int var26 = class119.field2109.method1448((byte) -2);
            int var27 = class119.field2109.method1483(26293);
            int var28 = (class20.field428 - class119.field2109.field3581) / 16;
            class199.field3284 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class199.field3284[var29][var37] = class119.field2109.method1466((byte) -15);
                }
            }
            int var30 = class119.field2109.method1465((byte) -112);
            boolean var31 = false;
            if ((var30 / 8 == 48 || (var30 / 8) == 49) && var25 / 8 == 48) {
                var31 = true;
            }
            if ((var30 / 8) == 48 && (var25 / 8) == 148) {
                var31 = true;
            }
            int var32 = class119.field2109.method1441(66);
            class47.field858 = null;
            class252.field4371 = new int[var28];
            class148.field2548 = new byte[var28][];
            class120.field2113 = new byte[var28][];
            class40.field730 = null;
            class235.field3940 = new int[var28];
            class109.field1968 = new int[var28];
            int var33 = 0;
            for (int var34 = (var30 - 6) / 8; var34 <= ((var30 + 6) / 8); var34++) {
                for (int var35 = (var25 - 6) / 8; var35 <= (var25 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var31 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class252.field4371[var33] = var36;
                        class235.field3940[var33] = -1;
                        class109.field1968[var33] = -1;
                    } else {
                        class252.field4371[var33] = var36;
                        class235.field3940[var33] = class142.field2495.method186(40, class80.method589(new class50[] { class215.field3555, class78.method579(var34, -26225), class188.field3117, class78.method579(var35, -26225) }, 28743));
                        class109.field1968[var33] = class142.field2495.method186(71, class80.method589(new class50[] { class178.field2971, class78.method579(var34, -26225), class188.field3117, class78.method579(var35, -26225) }, 28743));
                    }
                    var33++;
                }
            }
            class245.method1669(var26, var30, false, var27, var25, -6748, var32);
            return;
        }
        int var2 = class119.field2109.method1490((byte) -118);
        int var3 = class119.field2109.method1490((byte) -118);
        int var4 = class119.field2109.method1483(26293);
        int var5 = class119.field2109.method1490((byte) -118);
        int var6 = class119.field2109.method1462(-122);
        class119.field2109.method1596(-105);
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class119.field2109.method1600(2, 1);
                    if (var24 == 1) {
                        class76.field1437[var7][var22][var23] = class119.field2109.method1600(2, 26);
                    } else {
                        class76.field1437[var7][var22][var23] = -1;
                    }
                }
            }
        }
        class119.field2109.method1592((byte) 55);
        int var8 = (class20.field428 - class119.field2109.field3581) / 16;
        class199.field3284 = new int[var8][4];
        for (int var9 = 0; var9 < var8; var9++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class199.field3284[var9][var21] = class119.field2109.method1477((byte) 58);
            }
        }
        class148.field2548 = new byte[var8][];
        class109.field1968 = new int[var8];
        class235.field3940 = new int[var8];
        class47.field858 = null;
        class252.field4371 = new int[var8];
        class40.field730 = null;
        class120.field2113 = new byte[var8][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class76.field1437[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = (var14 & 0x3FFC) >> 3;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class252.field4371[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            int var19 = (var17 & 0xFFA6) >> 8;
                            int var20 = var17 & 0xFF;
                            class252.field4371[var10] = var17;
                            class235.field3940[var10] = class142.field2495.method186(68, class80.method589(new class50[] { class215.field3555, class78.method579(var19, -26225), class188.field3117, class78.method579(var20, -26225) }, 28743));
                            class109.field1968[var10] = class142.field2495.method186(125, class80.method589(new class50[] { class178.field2971, class78.method579(var19, -26225), class188.field3117, class78.method579(var20, -26225) }, 28743));
                            var10++;
                        }
                    }
                }
            }
        }
        class245.method1669(var6, var4, false, var3, var5, -6748, var2);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)J")
    public static final long method1212(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        return var3 == null || var3.field1233 == null ? 0L : var3.field1233.field982;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1213(int arg0) {
        field2950 = null;
        field2947 = null;
        if (arg0 != 0) {
            method1213(-104);
        }
        field2948 = null;
        field2949 = null;
        field2951 = null;
        field2945 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static final void method1214(boolean arg0) {
        field2946++;
        try {
            if (class139.field2411 == 1) {
                int var1 = class161.field2761.method662((byte) -127);
                if (var1 > 0 && class161.field2761.method637(97)) {
                    int var2 = var1 - class194.field3228;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class161.field2761.method639((byte) 76, var2);
                    return;
                }
                class161.field2761.method664(0);
                class161.field2761.method659(65);
                if (class46.field841 == null) {
                    class139.field2411 = 0;
                } else {
                    class139.field2411 = 2;
                }
                class237.field3979 = null;
                class129.field2271 = null;
            }
            if (arg0) {
                method1213(4);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class161.field2761.method664(0);
            class237.field3979 = null;
            class139.field2411 = 0;
            class46.field841 = null;
            class129.field2271 = null;
        }
    }
}
