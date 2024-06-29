import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class70 extends class112 {

    @OriginalMember(owner = "client!om", name = "L", descriptor = "Lwm;")
    public static class152 field1013 = class157.method1048("k", 98);

    @OriginalMember(owner = "client!om", name = "O", descriptor = "Z")
    public static boolean field1016 = false;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "Lwm;")
    private static class152 field1021 = class157.method1048("Discard", 127);

    @OriginalMember(owner = "client!om", name = "U", descriptor = "Lwm;")
    public static class152 field1022 = class157.method1048("Forced tweening disabled)3", 114);

    @OriginalMember(owner = "client!om", name = "P", descriptor = "Lwm;")
    public static class152 field1017 = field1021;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Lne;")
    public static class235 field1012 = new class235(20);

    @OriginalMember(owner = "client!om", name = "W", descriptor = "Lwm;")
    public static class152 field1024 = class157.method1048("K", 109);

    @OriginalMember(owner = "client!om", name = "X", descriptor = "Lwm;")
    public static class152 field1025 = class157.method1048("", 125);

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "[[[B")
    public static byte[][][] field1026 = new byte[4][104][104];

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "Lwm;")
    public static class152 field1028 = class157.method1048("name_icons", 122);

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "Lah;")
    public static class205 field1015;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "Lah;")
    public static class205 field1027;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V", line = 5)
    public static void method443(int arg0) {
        field1025 = null;
        field1012 = null;
        if (arg0 <= 17) {
            method444((byte) -96, -106, -4, 0, false, -8);
        }
        field1021 = null;
        field1022 = null;
        field1017 = null;
        field1024 = null;
        field1028 = null;
        field1027 = null;
        field1015 = null;
        field1013 = null;
        field1026 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILhi;)V", line = 26)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 == 31164) {
            if (arg1 == 0) {
                this.field1591 = arg2.method2011(-46) == 1;
            }
            field1014++;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)[[I", line = 44)
    public final int[][] method55(int arg0, boolean arg1) {
        field1020++;
        int[][] var3 = this.field1594.method656((byte) -6, arg0);
        if (arg1) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field1594.field1402) {
            int[] var4 = this.method751(arg0, (byte) 112, 2);
            int[][] var5 = this.method750(0, (byte) -17, arg0);
            int[][] var6 = this.method750(1, (byte) -17, arg0);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var5[1];
            int[] var11 = var5[2];
            int[] var12 = var5[0];
            int[] var13 = var6[2];
            int[] var14 = var6[1];
            int[] var15 = var6[0];
            for (int var16 = 0; var16 < class58.field889; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var9[var16] = var12[var16];
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                } else if (var17 == 0) {
                    var9[var16] = var15[var16];
                    var7[var16] = var14[var16];
                    var8[var16] = var13[var16];
                } else {
                    int var18 = 4096 - var17;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    var7[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + (var13[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)[I", line = 133)
    public final int[] method53(byte arg0, int arg1) {
        field1018++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 62);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1, (byte) 124, 0);
            int[] var5 = this.method751(arg1, (byte) 108, 1);
            int[] var6 = this.method751(arg1, (byte) 97, 2);
            for (int var7 = 0; var7 < class58.field889; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return arg0 == -3 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 196)
    public class70() {
        super(3, false);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BIIIZI)V", line = 212)
    public static final void method444(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1023++;
        class252.field4338++;
        class317.method2217(arg0 ^ 0x14);
        if (arg4) {
            class282.method1915(false, 0, false, false);
        } else {
            class50.method346(15791, 0);
            class282.method1915(true, 0, false, false);
            if (class121.field1712 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class282.method1915(false, var7, false, false);
                    class282.method1915(false, var7, false, true);
                    class50.method346(15791, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class50.method346(arg0 + 15771, var6);
                    class282.method1915(false, var6, false, false);
                    class282.method1915(false, var6, false, true);
                }
            }
        }
        if (!arg4) {
            class233.method1600((byte) 127);
        }
        class222.method1539(arg0 ^ 0x16);
        if (class217.field3516) {
            class59.method389(true, arg3, (byte) -38, arg2, arg1, arg5);
            arg5 = class254.field4393;
            arg3 = class277.field4750;
            arg2 = class308.field5291;
            arg1 = class226.field3667;
        }
        if (class28.field485 == 1) {
            int var8 = class193.field3060;
            if (var8 < class5.field84 / 256) {
                var8 = class5.field84 / 256;
            }
            int var9 = class272.field4645 + class229.field3737 & 0x7FF;
            if (class179.field2858[4] && (class215.field3495[4] + 128) > var8) {
                var8 = class215.field3495[4] + 128;
            }
            class282.method1910(arg2, var9, var8 * 3 + 600, class266.field4484, var8, class154.method1031(60, class85.field1176.field4162, class23.field400, class85.field1176.field4231) - 50, class176.field2839, (byte) 104);
        }
        int var10 = class224.field3639;
        int var11 = class80.field1129;
        int var12 = class223.field3634;
        int var13 = class94.field1346;
        int var14 = class27.field470;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class179.field2858[var15]) {
                int var16 = (int) (Math.random() * (double) (class212.field3434[var15] * 2 + 1) + Math.sin((double) class40.field644[var15] / 100.0D * (double) class97.field1389[var15]) * (double) class215.field3495[var15] - (double) class212.field3434[var15]);
                if (var15 == 3) {
                    class94.field1346 = class94.field1346 + var16 & 0x7FF;
                }
                if (var15 == 0) {
                    class224.field3639 += var16;
                }
                if (var15 == 2) {
                    class80.field1129 += var16;
                }
                if (var15 == 4) {
                    class223.field3634 += var16;
                    if (class223.field3634 < 128) {
                        class223.field3634 = 128;
                    }
                    if (class223.field3634 > 383) {
                        class223.field3634 = 383;
                    }
                }
                if (var15 == 1) {
                    class27.field470 += var16;
                }
            }
        }
        class198.method1319(1);
        if (class217.field3516) {
            class13.method76(arg1, arg3, arg1 + arg5, arg2 + arg3);
            float var17 = (float) class94.field1346 * 0.17578125F;
            float var18 = (float) class223.field3634 * 0.17578125F;
            if (class28.field485 == 3) {
                var17 = class324.field5657 * 360.0F / 6.2831855F;
                var18 = class323.field5646 * 360.0F / 6.2831855F;
            }
            class217.method1480(arg1, arg3, arg5, arg2, arg1 + (arg5 / 2), arg2 / 2 + arg3, var18, var17, class114.field1619, class114.field1619);
        } else {
            class96.method634(arg1, arg3, arg1 + arg5, arg2 + arg3);
            class181.method1187();
        }
        if (arg0 != 20) {
            return;
        }
        if (field1016 || class247.field4134 < arg1 || class247.field4134 >= arg1 + arg5 || class195.field3134 < arg3 || arg2 + arg3 <= class195.field3134) {
            class303.field5213 = 0;
            class213.field3485 = false;
        } else {
            class303.field5213 = 0;
            class213.field3485 = true;
            int var19 = class104.field1496;
            int var20 = class265.field4469;
            int var21 = class77.field1092;
            class120.field1691 = (var21 - var20) * (class195.field3134 - arg3) / arg2 + var20;
            int var22 = class100.field1464;
            class91.field1273 = (class247.field4134 - arg1) * (var22 - var19) / arg5 + var19;
        }
        class234.method1609(-128);
        byte var23 = class312.method2173((byte) 93) == 2 ? (byte) class252.field4338 : 1;
        if (class217.field3516) {
            boolean var24 = false;
            class217.method1483();
            class217.method1460(true);
            class217.method1473(true);
            int var25;
            if (class232.field3814 == 10) {
                var25 = class111.method741(122, class80.field1129 >> 10, class224.field3639 >> 10, class87.field1228, class277.field4740);
            } else {
                var25 = class111.method741(87, class85.field1176.field4245[0] >> 3, class85.field1176.field4188[0] >> 3, class87.field1228, class277.field4740);
            }
            class24.method210(class142.field2187, !class15.field209);
            class217.method1471(var25);
            class289.method1948(class80.field1129, class223.field3634, class94.field1346, class224.field3639, class27.field470, 98);
            class217.field3521 = class142.field2187;
            class176.method1175(class224.field3639, class27.field470, class80.field1129, class223.field3634, class94.field1346, class122.field1720, class295.field5042, class23.field405, class307.field5275, class127.field1919, class224.field3642, class23.field400 + 1, var23, class85.field1176.field4162 >> 7, class85.field1176.field4231 >> 7);
            class243.field4027 = true;
            class24.method199();
            class289.method1948(0, 0, 0, 0, 0, 100);
            class234.method1609(arg0 ^ 0xFFFFFF94);
            class316.method2207();
            class254.method1768(arg2, class114.field1619, arg5, class114.field1619, arg1, arg0 ^ 0xFFFFECAF, arg3);
            client.method1761(class114.field1619, -74, arg5, arg2, class114.field1619, arg3, arg1);
        } else {
            class96.method635(arg1, arg3, arg5, arg2, 0);
            class176.method1175(class224.field3639, class27.field470, class80.field1129, class223.field3634, class94.field1346, class122.field1720, class295.field5042, class23.field405, class307.field5275, class127.field1919, class224.field3642, class23.field400 + 1, var23, class85.field1176.field4162 >> 7, class85.field1176.field4231 >> 7);
            class234.method1609(-128);
            class316.method2207();
            class254.method1768(arg2, 256, arg5, 256, arg1, arg0 ^ 0xFFFFECAF, arg3);
            client.method1761(256, arg0 - 100, arg5, arg2, 256, arg3, arg1);
        }
        ((class272) class181.field2878).method1872(class277.field4740, (byte) -122);
        class231.method1584(arg5, 127, arg1, arg3, arg2);
        class27.field470 = var14;
        class80.field1129 = var11;
        class223.field3634 = var12;
        class94.field1346 = var13;
        class224.field3639 = var10;
        if (class63.field949 && class130.field1979.method1270(0) == 0) {
            class63.field949 = false;
        }
        if (class63.field949) {
            if (class217.field3516) {
                class13.method78(arg1, arg3, arg5, arg2, 0);
            } else {
                class96.method635(arg1, arg3, arg5, arg2, 0);
            }
            class6.method32(class154.field2457, false, 66);
        }
        if (!arg4 && !class63.field949 && !field1016 && class247.field4134 >= arg1 && class247.field4134 < (arg1 + arg5) && class195.field3134 >= arg3 && class195.field3134 < arg2 + arg3) {
            class239.method1639((byte) -40, arg3, class247.field4134, class195.field3134, arg1, arg2, arg5);
        }
    }
}
