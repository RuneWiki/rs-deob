import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class219 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lid;")
    public static class149 field3858 = class60.method382("Kampfstufe: ", (byte) 28);

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lid;")
    public static class149 field3863 = class60.method382("showVideoAd", (byte) 66);

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lid;")
    public static class149 field3868 = class60.method382("Textures charg-Bes", (byte) 109);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public int field3866;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B[B)V")
    public static final void method1479(byte arg0, byte[] arg1) {
        field3867++;
        class74 var2 = new class74(arg1);
        var2.field1340 = arg1.length - 2;
        class84.field1528 = var2.method485(-2386);
        class106.field1834 = new boolean[class84.field1528];
        class18.field259 = new int[class84.field1528];
        class283.field5005 = new int[class84.field1528];
        class69.field1199 = new byte[class84.field1528][];
        class73.field1276 = new byte[class84.field1528][];
        class55.field991 = new int[class84.field1528];
        class147.field2651 = new int[class84.field1528];
        var2.field1340 = arg1.length - (class84.field1528 * 8) - 7;
        class251.field4406 = var2.method485(-2386);
        class286.field5082 = var2.method485(-2386);
        int var3 = (var2.method489((byte) 92) & 0xFF) + 1;
        for (int var4 = 0; var4 < class84.field1528; var4++) {
            class147.field2651[var4] = var2.method485(-2386);
        }
        for (int var5 = 0; var5 < class84.field1528; var5++) {
            class18.field259[var5] = var2.method485(-2386);
        }
        for (int var6 = 0; var6 < class84.field1528; var6++) {
            class283.field5005[var6] = var2.method485(-2386);
        }
        for (int var7 = 0; var7 < class84.field1528; var7++) {
            class55.field991[var7] = var2.method485(-2386);
        }
        var2.field1340 = arg1.length + 3 - (class84.field1528 * 8) - (var3 * 3) - 7;
        class108.field1865 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class108.field1865[var8] = var2.method525(65280);
            if (class108.field1865[var8] == 0) {
                class108.field1865[var8] = 1;
            }
        }
        var2.field1340 = 0;
        for (int var9 = 0; var9 < class84.field1528; var9++) {
            int var10 = class283.field5005[var9];
            int var11 = class55.field991[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class73.field1276[var9] = var13;
            byte[] var14 = new byte[var12];
            class69.field1199[var9] = var14;
            int var15 = var2.method489((byte) -41);
            boolean var16 = false;
            if ((var15 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method514((byte) 1);
                }
                if ((var15 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method514((byte) 1);
                        var16 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var15 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var10 <= var21) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var21 + (var10 * var22)] = var2.method514((byte) 1);
                                var16 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var13[var10 * var24 + var20] = var2.method514((byte) 1);
                    }
                    var20++;
                }
            }
            class106.field1834[var9] = var16;
        }
        if (arg0 < 25) {
            field3868 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class168 var7 = new class168();
        var7.field3113 = arg1 / 128;
        var7.field3108 = arg2 / 128;
        var7.field3127 = arg3 / 128;
        var7.field3114 = arg4 / 128;
        var7.field3104 = arg0;
        var7.field3103 = arg1;
        var7.field3107 = arg2;
        var7.field3109 = arg3;
        var7.field3115 = arg4;
        var7.field3101 = arg5;
        var7.field3121 = arg6;
        class206.field3693[class196.field3533++] = var7;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lgd;I)V")
    public final void method1481(class74 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method489((byte) -32);
            if (var3 == 0) {
                if (arg1 != 16609) {
                    method1480(102, -96, 125, 4, 109, -67, 68);
                }
                field3869++;
                return;
            }
            this.method1485(arg0, (byte) 107, var3);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Lgd;I)V")
    public static final void method1482(class74 arg0, int arg1) {
        field3862++;
        int var2 = class166.field3086 >> 2 << 10;
        int var3 = class40.field620 >> 1;
        byte[][] var4 = new byte[class62.field1121][class287.field5086];
        while (arg0.field1340 < arg0.field1321.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method489((byte) 112) == 1) {
                var33 = true;
                var35 = arg0.method489((byte) 102);
                var34 = arg0.method489((byte) -97);
            }
            int var36 = arg0.method489((byte) 126);
            int var37 = arg0.method489((byte) -8);
            int var38 = class91.field1615 + class287.field5086 - (var37 * 64) - 1;
            int var39 = var36 * 64 - class80.field1480;
            if (var39 >= 0 && (var38 - 63) >= 0 && class62.field1121 > (var39 + 63) && class287.field5086 > var38) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= var35 * 8 && (var35 * 8 + 8) > var40 && var42 >= var34 * 8 && var42 < var34 * 8 + 8) {
                            var41[var38 - var42] = arg0.method514((byte) 1);
                        }
                    }
                }
            } else if (var33) {
                arg0.field1340 += 64;
            } else {
                arg0.field1340 += 4096;
            }
        }
        int var5 = class62.field1121;
        int var6 = class287.field5086;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        if (arg1 != 63) {
            field3868 = null;
        }
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class8 var29 = class195.method1329((byte) 39, var28 - 1);
                        var7[var13] += var29.field92;
                        var9[var13] += var29.field91;
                        var8[var13] += var29.field102;
                        var10[var13] += var29.field100;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class8 var32 = class195.method1329((byte) 39, var31 - 1);
                        var7[var13] -= var32.field92;
                        var9[var13] -= var32.field91;
                        var8[var13] -= var32.field102;
                        var10[var13] -= var32.field100;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class69.field1218[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var21 < var6) {
                        var16 += var9[var21];
                        var15 += var7[var21];
                        var17 += var8[var21];
                        var18 += var10[var21];
                        var19 += var11[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var15 -= var7[var22];
                        var17 -= var8[var22];
                        var19 -= var11[var22];
                        var18 -= var10[var22];
                        var16 -= var9[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class258.method1776(var15 * 256 / var18, var17 / var19, -31863, var16 / var19);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) - (-(var24 & 0x380) - var25);
                            var23[(class136.method953(var20, 63) << 6) + class136.method953(63, var12)] = class235.field4126[class97.method707(false, 96, var26)];
                        } else if (var23 != null) {
                            var23[class136.method953(63, var12) + class136.method953(4032, var20 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method1483(int arg0) {
        field3863 = null;
        if (arg0 >= -117) {
            method1483(28);
        }
        field3868 = null;
        field3858 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V")
    public static final void method1484(byte arg0, int arg1) {
        field3861++;
        if (arg1 == -1 && !class71.field1241) {
            class206.method1406((byte) 117);
        } else if (arg1 != -1 && (class133.field2425 != arg1 || !class113.method792(0)) && class44.field667 != 0 && !class71.field1241) {
            class240.method1654(class44.field667, 2, class230.field4010, false, 12672, arg1, 0);
        }
        if (arg0 > -67) {
            field3863 = null;
        }
        class133.field2425 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lgd;BI)V")
    private final void method1485(class74 arg0, byte arg1, int arg2) {
        if (arg1 != 107) {
            this.field3866 = -122;
        }
        field3857++;
        if (arg2 == 1) {
            this.field3866 = arg0.method485(-2386);
            this.field3860 = arg0.method489((byte) 109);
            this.field3865 = arg0.method489((byte) -9);
        }
    }
}
