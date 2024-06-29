import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 extends class129 {

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "[B")
    public byte[] field1022;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
    public static int[] field1024 = new int[32];

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "[Lmc;")
    public static class75[] field1036;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "[[[I")
    public static int[][][] field1034;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "Lnc;")
    public static class81 field1033;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "[I")
    public static int[] field1031;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "[[I")
    public static int[][] field1020;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1024[var1] = var0 - 1;
            var0 += var0;
        }
        field1036 = new class75[500];
        field1032 = -1;
        field1034 = new int[4][13][13];
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 14)
    public static void method324(int arg0) {
        field1020 = null;
        field1034 = null;
        field1033 = null;
        field1024 = null;
        if (arg0 != 768) {
            field1024 = null;
        }
        field1036 = null;
        field1031 = null;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V", line = 34)
    public static final void method325(int arg0) {
        field1028++;
        if (class65.field1713 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class65.field1713 > 768) {
                    class131.field3176[var3] = class21.method151(class119.field2933[var3], 1024 - class65.field1713, 16711935, class32.field722[var3]);
                } else if (class65.field1713 > 256) {
                    class131.field3176[var3] = class32.field722[var3];
                } else {
                    class131.field3176[var3] = class21.method151(class32.field722[var3], 256 - class65.field1713, 16711935, class119.field2933[var3]);
                }
            }
        } else if (client.field381 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (client.field381 > 768) {
                    class131.field3176[var1] = class21.method151(class119.field2933[var1], 1024 - client.field381, 16711935, class23.field437[var1]);
                } else if (client.field381 <= 256) {
                    class131.field3176[var1] = class21.method151(class23.field437[var1], 256 - client.field381, 16711935, class119.field2933[var1]);
                } else {
                    class131.field3176[var1] = class23.field437[var1];
                }
            }
        } else {
            for (int var2 = 0; var2 < 256; var2++) {
                class131.field3176[var2] = class119.field2933[var2];
            }
        }
        for (int var4 = 0; var4 < 33920; var4++) {
            class41.field999.field2265[var4] = class70.field1789.field32[var4];
        }
        int var5 = arg0;
        short var6 = 256;
        int var7 = 1152;
        for (int var8 = 1; var8 < var6 - 1; var8++) {
            int var22 = (var6 - var8) * class98.field2471[var8] / var6;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var5 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class100.field2586[var5++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class131.field3176[var25];
                    int var29 = class41.field999.field2265[var7];
                    class41.field999.field2265[var7++] = class56.method456(var25 * class56.method456(65280, var28) + class56.method456(var29, 65280) * var27, 16711680) + class56.method456(-16711936, var27 * class56.method456(16711935, var29) + var25 * class56.method456(16711935, var28)) >> 8;
                }
            }
            var7 += var23;
        }
        for (int var9 = 0; var9 < 33920; var9++) {
            class131.field3189.field2265[var9] = class101.field2615.field32[var9];
        }
        int var10 = 1176;
        int var11 = 0;
        for (int var12 = 1; var12 < var6 - 1; var12++) {
            int var13 = (var6 - var12) * class98.field2471[var12] / var6;
            int var14 = 103 - var13;
            int var15 = var10 + var13;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = class100.field2586[var11++];
                if (var17 == 0) {
                    var15++;
                } else {
                    int var19 = 256 - var17;
                    int var20 = class131.field3176[var17];
                    int var21 = class131.field3189.field2265[var15];
                    class131.field3189.field2265[var15++] = class56.method456(16711680, var17 * class56.method456(var20, 65280) + class56.method456(65280, var21) * var19) + class56.method456(-16711936, var17 * class56.method456(16711935, var20) + var19 * class56.method456(var21, 16711935)) >> 8;
                }
            }
            var10 = var15 + 128 - var14 - var13;
            var11 += 128 - var14;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lbc;", line = 202)
    public static final class10 method326(int arg0, int arg1) {
        field1027++;
        class10 var2 = (class10) class21.field411.method559((long) arg0, -126);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field3.method436(arg0, arg1 ^ 0x5, 10);
        class10 var4 = new class10();
        var4.field160 = arg0;
        if (var3 != null) {
            var4.method66(new class61(var3), (byte) 28);
        }
        var4.method60(-1);
        if (~var4.field179 != arg1) {
            var4.method72(method326(var4.field179, arg1), (byte) 95, method326(var4.field188, 0));
        }
        if (!class44.field1037 && var4.field196) {
            var4.field199 = null;
            var4.field169 = null;
            var4.field209 = 0;
            var4.field204 = class10.field222;
        }
        class21.field411.method558((long) arg0, var4, arg1 + 304);
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(BI)Lsd;", line = 239)
    public static final class111 method327(byte arg0, int arg1) {
        class111 var2 = (class111) class57.field1441.method559((long) arg1, 25);
        field1023++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class126.field3078.method436(arg1, 5, 14);
        class111 var4 = new class111();
        if (var3 != null) {
            var4.method905(false, new class61(var3));
        }
        class57.field1441.method558((long) arg1, var4, 304);
        int var5 = -13 / ((arg0 + 73) / 35);
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbe;IILp;)V", line = 265)
    public static final void method328(class12 arg0, int arg1, int arg2, class90 arg3) {
        field1021++;
        byte[] var4 = null;
        class32 var5 = class88.field2169;
        synchronized (class88.field2169) {
            for (class65 var6 = (class65) class88.field2169.method248(32); var6 != null; var6 = (class65) class88.field2169.method252(arg2 ^ 0x3C)) {
                if ((long) arg1 == var6.field1765 && var6.field1706 == arg0 && var6.field1711 == 0) {
                    var4 = var6.field1709;
                    break;
                }
            }
        }
        if (arg2 != 0) {
            return;
        }
        if (var4 == null) {
            byte[] var7 = arg0.method83(0, arg1);
            arg3.method750(var7, arg2 + 2, arg1, true, arg0);
        } else {
            arg3.method750(var4, 2, arg1, true, arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Laa;", line = 307)
    public static final class2 method329(int arg0, int arg1, int arg2, int arg3) {
        field1026++;
        if (arg1 == 0) {
            class2 var4 = (class2) class34.field816.method559((long) arg2, -1);
            if (var4 != null && var4.field35 != arg0 && var4.field35 != -1) {
                var4.method589(true);
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        class10 var5 = method326(arg2, 0);
        if (var5.field182 == null) {
            arg0 = -1;
        }
        if (arg0 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (var5.field157[var7] <= arg0 && var5.field157[var7] != 0) {
                    var6 = var5.field182[var7];
                }
            }
            if (var6 != -1) {
                var5 = method326(var6, 0);
            }
        }
        class93 var8 = var5.method65(true, 1, false);
        if (var8 == null) {
            return null;
        }
        class2 var9 = null;
        if (var5.field179 != -1) {
            var9 = method329(10, -1, var5.field188, -125);
            if (var9 == null) {
                return null;
            }
        }
        int var10 = class66.field1721;
        int[] var11 = class66.field1722;
        int var12 = class66.field1720;
        int var13 = class66.field1717;
        int var14 = class66.field1718;
        int var15 = class66.field1719;
        int var16 = class66.field1716;
        int[] var17 = class49.method369();
        int var18 = class49.field1195;
        int var19 = class49.field1190;
        class2 var20 = new class2(32, 32);
        class66.method581(var20.field32, 32, 32);
        class55.field1360 = class49.method379(class55.field1360);
        class66.method569(0, 0, 32, 32, 0);
        class49.field1184 = false;
        int var21 = var5.field168;
        if (arg1 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg1 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = class49.field1194[var5.field185] * var21 >> 16;
        int var23 = class49.field1196[var5.field185] * var21 >> 16;
        var8.method798();
        var8.method785(0, var5.field201, var5.field190, var5.field185, var5.field210, var8.field1690 / 2 + var23 + var5.field174, var5.field174 + var22);
        if (arg3 >= -119) {
            method327((byte) 8, 110);
        }
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var20.field32[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var20.field32[var31 * 32 + var24 - 1] > 1) {
                        var20.field32[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var20.field32[var24 + (var31 - 1) * 32] > 1) {
                        var20.field32[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var20.field32[var24 + var31 * 32 + 1] > 1) {
                        var20.field32[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var20.field32[(var31 + 1) * 32 + var24] > 1) {
                        var20.field32[var24 + var31 * 32] = 1;
                    }
                }
            }
        }
        if (arg1 > 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var30 = 31; var30 >= 0; var30--) {
                    if (var20.field32[var27 + var30 * 32] == 0) {
                        if (var27 > 0 && var20.field32[var30 * 32 + var27 - 1] == 1) {
                            var20.field32[var30 * 32 + var27] = arg1;
                        } else if (var30 > 0 && var20.field32[var30 * 32 + var27 - 32] == 1) {
                            var20.field32[var27 + var30 * 32] = arg1;
                        } else if (var27 < 31 && var20.field32[var30 * 32 + var27 + 1] == 1) {
                            var20.field32[var30 * 32 + var27] = arg1;
                        } else if (var30 < 31 && var20.field32[(var30 + 1) * 32 + var27] == 1) {
                            var20.field32[var30 * 32 + var27] = arg1;
                        }
                    }
                }
            }
        } else if (arg1 == 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var20.field32[var26 * 32 + var25] == 0 && var25 > 0 && var26 > 0 && var20.field32[(var26 - 1) * 32 + var25 - 1] > 0) {
                        var20.field32[var25 + var26 * 32] = 3153952;
                    }
                }
            }
        }
        if (var5.field179 != -1) {
            int var28 = var9.field35;
            var9.field35 = 32;
            int var29 = var9.field36;
            var9.field36 = 32;
            var9.method14(0, 0);
            var9.field35 = var28;
            var9.field36 = var29;
        }
        if (arg1 == 0) {
            class34.field816.method558((long) arg2, var20, 304);
        }
        class66.method581(var11, var10, var12);
        class66.method570(var16, var13, var15, var14);
        class49.method379(var17);
        class49.field1195 = var18;
        class49.field1190 = var19;
        class49.method374();
        class49.field1184 = true;
        if (var5.field186) {
            var20.field36 = 33;
        } else {
            var20.field36 = 32;
        }
        var20.field35 = arg0;
        return var20;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V", line = 565)
    public class43(byte[] arg0) {
        this.field1022 = arg0;
    }
}
