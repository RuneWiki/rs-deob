import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class193 extends class236 {

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    private int field3488;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "[I")
    public int[] field3491;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "[[I")
    public int[][] field3486;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "[Z")
    public boolean[] field3492;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field3485 = 0;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[[I")
    public static int[][] field3482 = new int[104][104];

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "[Ln;")
    public static class237[] field3494 = new class237[50];

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field3496 = -1;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "[Lgj;")
    public static class192[] field3484;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method1395(byte arg0) {
        if (arg0 != 43) {
            method1396(69, -124);
        }
        field3482 = null;
        field3494 = null;
        field3484 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)Leh;")
    public static final class138 method1396(int arg0, int arg1) {
        field3495++;
        class138 var2 = (class138) class134.field2621.method1644((byte) -41, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -30590) {
            field3484 = null;
        }
        byte[] var3 = class1.field16.method1115(class241.method1701(47, arg1), (byte) -82, class96.method781(-4, arg1));
        class138 var4 = new class138();
        if (var3 != null) {
            var4.method1044(new class8(var3), arg0 ^ 0x777A);
        }
        var4.method1036(false);
        class134.field2621.method1646((long) arg1, var4, -109);
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lcb;BLcb;)V")
    public static final void method1397(class236 arg0, byte arg1, class236 arg2) {
        if (arg0.field4218 != null) {
            arg0.method1681(false);
        }
        arg0.field4211 = arg2;
        arg0.field4218 = arg2.field4218;
        field3490++;
        arg0.field4218.field4211 = arg0;
        if (arg1 != 125) {
            method1395((byte) 14);
        }
        arg0.field4211.field4218 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
    public static final void method1398(boolean arg0, int arg1) {
        class71.field1604 = arg0;
        if (class71.field1604) {
            int var2 = class59.field1289.method77((byte) 109);
            class59.field1289.method1269((byte) -70);
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class59.field1289.method1270(-64, 1);
                        if (var24 == 1) {
                            class230.field4096[var3][var22][var23] = class59.field1289.method1270(-93, 26);
                        } else {
                            class230.field4096[var3][var22][var23] = -1;
                        }
                    }
                }
            }
            class59.field1289.method1271((byte) 119);
            int var4 = (class163.field3041 - class59.field1289.field146) / 16;
            class132.field2597 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class132.field2597[var5][var21] = class59.field1289.method99(false);
                }
            }
            int var6 = class59.field1289.method65((byte) 111);
            int var7 = class59.field1289.method92(124);
            int var8 = class59.field1289.method81(arg1 - 1239235334);
            int var9 = class59.field1289.method92(112);
            class159.field2992 = new byte[var4][];
            class44.field1041 = null;
            class71.field1590 = null;
            class208.field3746 = new int[var4];
            class215.field3938 = new int[var4];
            client.field3799 = new int[var4];
            class263.field4651 = new int[var4];
            class93.field1873 = new int[var4];
            class23.field431 = new byte[var4][];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class230.field4096[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = (var14 & 0xFFF08C) >> 14;
                            int var16 = (var14 & 0x3FFC) >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class208.field3746[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class208.field3746[var10] = var17;
                                int var19 = (var17 & 0xFF8A) >> 8;
                                int var20 = var17 & 0xFF;
                                client.field3799[var10] = class178.field3298.method1096((byte) -102, class160.method1188(new class30[] { class235.field4191, class73.method675(-54, var19), class47.field1082, class73.method675(106, var20) }, 0));
                                class215.field3938[var10] = class178.field3298.method1096((byte) -102, class160.method1188(new class30[] { class129.field2540, class73.method675(class186.method1344(arg1, 2), var19), class47.field1082, class73.method675(121, var20) }, 0));
                                class263.field4651[var10] = class178.field3298.method1096((byte) -102, class160.method1188(new class30[] { class177.field3280, class73.method675(-82, var19), class47.field1082, class73.method675(111, var20) }, 0));
                                class93.field1873[var10] = class178.field3298.method1096((byte) -102, class160.method1188(new class30[] { class215.field3932, class73.method675(arg1 - 49, var19), class47.field1082, class73.method675(arg1 - 65, var20) }, 0));
                                var10++;
                            }
                        }
                    }
                }
            }
            class266.method1825(var6, var2, false, var8, var7, 0, var9);
        } else {
            int var25 = (class163.field3041 - class59.field1289.field146) / 16;
            class132.field2597 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class132.field2597[var26][var37] = class59.field1289.method99(false);
                }
            }
            int var27 = class59.field1289.method65((byte) 111);
            int var28 = class59.field1289.method54(35);
            int var29 = class59.field1289.method65((byte) 117);
            int var30 = class59.field1289.method81(-1239235384);
            int var31 = class59.field1289.method79(true);
            class93.field1873 = new int[var25];
            class215.field3938 = new int[var25];
            class71.field1590 = null;
            class208.field3746 = new int[var25];
            class44.field1041 = null;
            class159.field2992 = new byte[var25][];
            class263.field4651 = new int[var25];
            boolean var32 = false;
            client.field3799 = new int[var25];
            class23.field431 = new byte[var25][];
            if (((var31 / 8) == 48 || (var31 / 8) == 49) && var30 / 8 == 48) {
                var32 = true;
            }
            if ((var31 / 8) == 48 && var30 / 8 == 148) {
                var32 = true;
            }
            int var33 = 0;
            for (int var34 = (var31 - 6) / 8; var34 <= ((var31 + 6) / 8); var34++) {
                for (int var35 = (var30 - 6) / 8; var35 <= ((var30 + 6) / 8); var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var32 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class208.field3746[var33] = var36;
                        client.field3799[var33] = -1;
                        class215.field3938[var33] = -1;
                        class263.field4651[var33] = -1;
                        class93.field1873[var33] = -1;
                    } else {
                        class208.field3746[var33] = var36;
                        client.field3799[var33] = class178.field3298.method1096((byte) -102, class160.method1188(new class30[] { class235.field4191, class73.method675(arg1 - 25, var34), class47.field1082, class73.method675(9, var35) }, 0));
                        class215.field3938[var33] = class178.field3298.method1096((byte) -102, class160.method1188(new class30[] { class129.field2540, class73.method675(-102, var34), class47.field1082, class73.method675(class186.method1344(arg1, -83), var35) }, 0));
                        class263.field4651[var33] = class178.field3298.method1096((byte) -102, class160.method1188(new class30[] { class177.field3280, class73.method675(class186.method1344(arg1, -91), var34), class47.field1082, class73.method675(101, var35) }, 0));
                        class93.field1873[var33] = class178.field3298.method1096((byte) -102, class160.method1188(new class30[] { class215.field3932, class73.method675(arg1 - 10, var34), class47.field1082, class73.method675(126, var35) }, 0));
                    }
                    var33++;
                }
            }
            class266.method1825(var31, var28, false, var29, var27, 0, var30);
        }
        if (arg1 == -50) {
            field3487++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)I")
    public static final int method1399(int arg0, int arg1) {
        field3483++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != -50) {
                method1400((byte) 49);
            }
            return class37.method354((byte) 18, arg0);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I[B)V")
    public class193(int arg0, byte[] arg1) {
        this.field3493 = arg0;
        class8 var3 = new class8(arg1);
        this.field3488 = var3.method63((byte) 53);
        this.field3491 = new int[this.field3488];
        this.field3486 = new int[this.field3488][];
        this.field3492 = new boolean[this.field3488];
        for (int var4 = 0; var4 < this.field3488; var4++) {
            this.field3491[var4] = var3.method63((byte) 107);
        }
        for (int var5 = 0; var5 < this.field3488; var5++) {
            this.field3492[var5] = var3.method63((byte) 113) == 1;
        }
        for (int var6 = 0; var6 < this.field3488; var6++) {
            this.field3486[var6] = new int[var3.method63((byte) 92)];
        }
        for (int var7 = 0; var7 < this.field3488; var7++) {
            for (int var8 = 0; var8 < this.field3486[var7].length; var8++) {
                this.field3486[var7][var8] = var3.method63((byte) 91);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
    public static final void method1400(byte arg0) {
        for (int var1 = 0; var1 < class233.field4153; var1++) {
            int var10002 = class272.field4765[var1]--;
            if (class272.field4765[var1] >= -10) {
                class237 var3 = field3494[var1];
                if (var3 == null) {
                    var3 = class237.method1687(class5.field71, class277.field4826[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class272.field4765[var1] += var3.method1688();
                    field3494[var1] = var3;
                }
                if (class272.field4765[var1] < 0) {
                    int var10;
                    if (class22.field419[var1] == 0) {
                        var10 = class169.field3184;
                    } else {
                        int var4 = (class22.field419[var1] & 0xFF) * 128;
                        int var5 = (class22.field419[var1] & 0xFF2728) >> 16;
                        int var6 = var5 * 128 + 64 - class247.field4394.field1360;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class22.field419[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class247.field4394.field1336;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var9 > var4) {
                            class272.field4765[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class169.field3185 / var4;
                    }
                    if (var10 > 0) {
                        class258 var11 = var3.method1686().method1792(class124.field2427);
                        class38 var12 = class38.method381(var11, 100, var10);
                        var12.method392(class25.field483[var1] - 1);
                        class127.field2469.method177(var12);
                    }
                    class272.field4765[var1] = -100;
                }
            } else {
                class233.field4153--;
                for (int var2 = var1; var2 < class233.field4153; var2++) {
                    class277.field4826[var2] = class277.field4826[var2 + 1];
                    field3494[var2] = field3494[var2 + 1];
                    class25.field483[var2] = class25.field483[var2 + 1];
                    class272.field4765[var2] = class272.field4765[var2 + 1];
                    class22.field419[var2] = class22.field419[var2 + 1];
                }
                var1--;
            }
        }
        if (class11.field223 && !class252.method1759((byte) 102)) {
            if (class246.field4382 != 0 && class102.field2072 != -1) {
                class221.method1595(class139.field2713, class102.field2072, 0, class246.field4382, false, (byte) -110);
            }
            class11.field223 = false;
        } else if (class246.field4382 != 0 && class102.field2072 != -1 && !class252.method1759((byte) 102)) {
            class67.field1472++;
            class196.field3553.method1267(254, -9);
            class196.field3553.method57(class102.field2072, 62);
            class102.field2072 = -1;
        }
        field3489++;
        if (arg0 < 13) {
            method1400((byte) 59);
        }
    }
}
