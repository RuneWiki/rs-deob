import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class92 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
    public static int[] field1517 = new int[128];

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field1520 = 0;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[Ldf;")
    public static class51[] field1524 = new class51[100];

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[I")
    public static int[] field1530 = new int[32];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lqb;")
    public static class54 field1519;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[[[B")
    public static byte[][][] field1522;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method694(int arg0) {
        field1517 = null;
        field1519 = null;
        field1524 = null;
        if (arg0 <= 31) {
            field1519 = null;
        }
        field1522 = null;
        field1530 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lu;B)V")
    public static final void method695(class111 arg0, byte arg1) {
        if (arg1 <= -90) {
            class210.field3489 = arg0.method810(class179.field2956, -1);
            field1523++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIII)V")
    public static final void method696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class28.field408 <= arg4 && arg5 <= class115.field1954 && arg1 >= class36.field542 && class175.field2867 >= arg3) {
            class107.method765((byte) 70, arg4, arg0, arg1, arg3, arg5);
        } else {
            class217.method1490(arg4, -130, arg5, arg1, arg0, arg3);
        }
        if (arg2 < 15) {
            method696(-63, -17, 74, 7, 53, 19);
        }
        field1518++;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIIIII)V")
    public static final void method697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -7286) {
            field1522 = null;
        }
        class36.field559[0].method1110(arg3, arg0);
        int var6 = (arg1 - 32) * arg1 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        field1528++;
        class36.field559[1].method1110(arg3, arg0 + arg1 - 16);
        int var7 = (arg1 - var6 - 32) * arg2 / (arg5 - arg1);
        class59.method393(arg3, arg0 + 16, 16, arg1 - 32, class162.field2654);
        class59.method393(arg3, arg0 + var7 + 16, 16, var6, class24.field370);
        class59.method376(arg3, var7 + arg0 + 16, var6, class162.field2649);
        class59.method376(arg3 + 1, arg0 + 16 + var7, var6, class162.field2649);
        class59.method386(arg3, arg0 + var7 + 16, 16, class162.field2649);
        class59.method386(arg3, arg0 + var7 + 17, 16, class162.field2649);
        class59.method376(arg3 + 15, arg0 + 16 + var7, var6, class34.field506);
        class59.method376(arg3 + 14, var7 + 17 + arg0, var6 - 1, class34.field506);
        class59.method386(arg3, arg0 + var7 + var6 + 15, 16, class34.field506);
        class59.method386(arg3 + 1, arg0 + var7 + var6 + 14, 15, class34.field506);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method698(byte arg0) {
        field1529++;
        if (class48.field759 == -1 || class188.field3143 == -1) {
            return;
        }
        float[] var1 = new float[3];
        int var2 = ((class3.field15 - class167.field2725) * class257.field4497 >> 16) + class167.field2725;
        int var3 = class193.field3236 * 2;
        class257.field4497 += var2;
        if (class257.field4497 < 65535) {
            class160.field2621 = false;
            class192.field3213 = false;
        } else {
            if (class160.field2621) {
                class192.field3213 = false;
            } else {
                class192.field3213 = true;
            }
            class160.field2621 = true;
            class257.field4497 = 65535;
        }
        float var4 = (float) class257.field4497 / 65535.0F;
        if (arg0 < 117) {
            method699(-124, 64, 91, -24, true, 69, false);
        }
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class177.field2899[class48.field759][var3 + 1][var5] * 3;
            int var22 = class177.field2899[class48.field759][var3][var5] * 3;
            int var23 = (-class177.field2899[class48.field759][var3 + 3][var5] - (-class177.field2899[class48.field759][var3 + 2][var5] - class177.field2899[class48.field759][var3 + 2][var5])) * 3;
            int var24 = class177.field2899[class48.field759][var3][var5];
            int var25 = var23 + var22 - (var21 * 2);
            int var26 = var21 - var22;
            int var27 = class177.field2899[class48.field759][var3 + 2][var5] + var21 - var24 - var23;
            var1[var5] = (((float) var27 * var4 + (float) var25) * var4 + (float) var26) * var4 + (float) var24;
        }
        if (class11.field160 == 0 && class241.field4179 == 0) {
            class11.field160 = ((int) var1[0] >> 10) * 8 - 48;
            class241.field4179 = (((int) var1[2] >> 10) - 6) * 8;
        }
        class144.field2408 = (int) var1[2] - (class241.field4179 * 128);
        class120.field2001 = (int) var1[1] * -1;
        float[] var6 = new float[3];
        class209.field3488 = (int) var1[0] - (class11.field160 * 128);
        int var7 = class172.field2824 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class177.field2899[class188.field3143][var7 + 1][var8] * 3;
            int var15 = class177.field2899[class188.field3143][var7][var8] * 3;
            int var16 = (class177.field2899[class188.field3143][var7 + 2][var8] - (class177.field2899[class188.field3143][var7 + 3][var8] - class177.field2899[class188.field3143][var7 + 2][var8])) * 3;
            int var17 = class177.field2899[class188.field3143][var7][var8];
            int var18 = var14 - var15;
            int var19 = var15 + var16 - var14 * 2;
            int var20 = class177.field2899[class188.field3143][var7 + 2][var8] + var14 - var17 - var16;
            var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var18) * var4 + (float) var17;
        }
        float var9 = var6[0] - var1[0];
        float var10 = (var6[1] - var1[1]) * -1.0F;
        float var11 = var6[2] - var1[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class75.field1190 = (float) Math.atan2((double) var10, var12);
        class143.field2395 = -((float) Math.atan2((double) var9, (double) var11));
        class128.field2143 = (int) ((double) class143.field2395 * 325.949D) & 0x7FF;
        class107.field1763 = (int) ((double) class75.field1190 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIZIZ)V")
    public static final void method699(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field1527++;
        if (class147.field2470 == arg3 && class70.field1129 == arg5 && class245.field4253 == arg0 || class34.method170(-34)) {
            return;
        }
        class245.field4253 = arg0;
        class70.field1129 = arg5;
        class147.field2470 = arg3;
        if (class34.method170(115)) {
            class245.field4253 = 0;
        }
        if (arg4) {
            class100.method734(true, 28);
        } else {
            class100.method734(true, 25);
        }
        class164.method1155(class156.field2569, true, 6);
        int var7 = class11.field160;
        class11.field160 = (arg3 - 6) * 8;
        int var8 = class241.field4179;
        class241.field4179 = arg5 * 8 - 48;
        class14.field217 = class225.method1549(class70.field1129 * 8, class147.field2470 * 8, true);
        int var9 = class241.field4179 - var8;
        int var10 = class11.field160 - var7;
        int var11 = class241.field4179;
        int var12 = class11.field160;
        if (arg4) {
            class218.field3788 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class83 var32 = class34.field512[var16];
                if (var32 != null) {
                    var32.field4319 -= var10 * 128;
                    var32.field4348 -= var9 * 128;
                    if (var32.field4319 >= 0 && var32.field4319 <= 13184 && var32.field4348 >= 0 && var32.field4348 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field4343[var33] -= var10;
                            var32.field4336[var33] -= var9;
                        }
                        class193.field3242[class218.field3788++] = var16;
                    } else {
                        class34.field512[var16].field1392 = null;
                        class34.field512[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class83 var14 = class34.field512[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field4343[var15] -= var10;
                        var14.field4336[var15] -= var9;
                    }
                    var14.field4348 -= var9 * 128;
                    var14.field4319 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class103 var30 = class66.field1055[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field4343[var31] -= var10;
                    var30.field4336[var31] -= var9;
                }
                var30.field4319 -= var10 * 128;
                var30.field4348 -= var9 * 128;
            }
        }
        byte var18 = 0;
        class257.field4496 = arg0;
        class44.field706.method1683(arg2, 2, arg1, arg6);
        byte var19 = 1;
        byte var20 = 0;
        byte var21 = 104;
        if (var10 < 0) {
            var18 = 103;
            var19 = -1;
            var21 = -1;
        }
        byte var22 = 104;
        byte var23 = 1;
        if (var9 < 0) {
            var20 = 103;
            var23 = -1;
            var22 = -1;
        }
        for (int var24 = var18; var24 != var21; var24 += var19) {
            for (int var26 = var20; var26 != var22; var26 += var23) {
                int var27 = var24 + var10;
                int var28 = var9 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class90.field1493[var29][var24][var26] = class90.field1493[var29][var27][var28];
                    } else {
                        class90.field1493[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class36 var25 = (class36) class66.field1085.method1720(true); var25 != null; var25 = (class36) class66.field1085.method1712((byte) 112)) {
            var25.field552 -= var9;
            var25.field543 -= var10;
            if (var25.field543 < 0 || var25.field552 < 0 || var25.field543 >= 104 || var25.field552 >= 104) {
                var25.method764((byte) -69);
            }
        }
        class207.field3457 = -1;
        if (class96.field1581 != 0) {
            class96.field1581 -= var10;
            class248.field4373 -= var9;
        }
        class218.field3792 = 0;
        if (arg4) {
            class66.field1073 -= var9;
            class247.field4316 -= var10;
            class242.field4202 -= var9;
            class141.field2368 -= var10;
        } else {
            class201.field3361 = 1;
        }
        class27.field391.method1708(2);
        class263.field4595.method1708(2);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    public static final int method700(int arg0, int arg1) {
        field1521++;
        double var2 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = (double) ((arg0 & 0xFFB60B) >> 16) / 256.0D;
        double var8 = var6;
        double var10 = var6;
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var2 > var6) {
            var10 = var2;
        }
        if (var6 > var2) {
            var8 = var2;
        }
        if (arg1 < 107) {
            return -112;
        }
        if (var4 > var10) {
            var10 = var4;
        }
        if (var8 > var4) {
            var8 = var4;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var6 == var10) {
                var14 = (var2 - var4) / (var10 - var8);
            } else if (var2 == var10) {
                var14 = (var4 - var6) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var14 = (var6 - var2) / (var10 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var14 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var12 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var20 >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }
}
