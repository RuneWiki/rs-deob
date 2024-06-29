import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 extends class125 {

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[I")
    private int[] field2875;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "[Lvd;")
    public class150[] field2887;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "[B")
    public byte[] field2883;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "[S")
    public short[] field2895;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[B")
    public byte[] field2881;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "[B")
    public byte[] field2897;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[Lre;")
    public class123[] field2882;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lod;")
    private static class101 field2880 = class46.method335(-90, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lod;")
    public static class101 field2878 = class46.method335(-117, "<img=1>");

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "[Lpf;")
    public static class110[] field2890 = new class110[4];

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Lod;")
    private static class101 field2884 = class46.method335(83, "Loading)3)3)3");

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "Lrc;")
    public static class121 field2886 = null;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "Lod;")
    public static class101 field2894 = field2880;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "[I")
    public static int[] field2885 = new int[1000];

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Lod;")
    public static class101 field2891 = field2884;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "[Lrd;")
    public static class122[] field2899 = new class122[1000];

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    public static void method978(int arg0) {
        field2890 = null;
        field2880 = null;
        field2885 = null;
        field2899 = null;
        if (arg0 != 6215) {
            field2891 = null;
        }
        field2891 = null;
        field2884 = null;
        field2894 = null;
        field2878 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([BB[ILpa;)Z")
    public final boolean method979(byte[] arg0, byte arg1, int[] arg2, class105 arg3) {
        field2893++;
        boolean var5 = true;
        int var6 = 0;
        class123 var7 = null;
        int var8 = 0;
        int var9 = -84 % ((21 - arg1) / 62);
        while (var8 < 128) {
            if (arg0 == null || arg0[var8] != 0) {
                int var10 = this.field2875[var8];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg3.method756((byte) -110, arg2, var10 >> 2);
                        } else {
                            var7 = arg3.method751(-52, var10 >> 2, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2882[var8] = var7;
                        this.field2875[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
    public final void method980(int arg0) {
        this.field2875 = null;
        if (arg0 == 4) {
            field2898++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BJ)V")
    public static final void method981(byte arg0, long arg1) {
        field2889++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg0 != -86) {
            field2886 = null;
        }
        if (arg1 % 10L == 0L) {
            class80.method538(arg1 - 1L, false);
            class80.method538(1L, false);
        } else {
            class80.method538(arg1, false);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Z")
    public static final boolean method982(byte arg0, int arg1) {
        if (arg0 == -83) {
            field2888++;
            return (arg1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public static final void method983(int arg0, int arg1) {
        field2876++;
        int[] var2 = class130.field2956.field2692;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class86.field1905[arg0][var21][var5] & 0x18) == 0) {
                    class33.field857.method586(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class86.field1905[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class33.field857.method586(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class130.field2956.method929();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        if (arg1 != -104) {
            method981((byte) 113, -7L);
        }
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class86.field1905[arg0][var19][var8] & 0x18) == 0) {
                    class41.method309(var19, var8, var6, arg0, var7, (byte) -89);
                }
                if (arg0 < 3 && (class86.field1905[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class41.method309(var19, var8, var6, arg0 + 1, var7, (byte) -89);
                }
            }
        }
        class112.field2405 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class33.field857.method572(class95.field2040, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class94.method652(var12, arg1 ^ 0xFFFFFF98).field605;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class57.field1331[class95.field2040].field1118;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        field2899[class112.field2405] = class153.field3495[var13];
                        class6.field92[class112.field2405] = var14;
                        class85.field1854[class112.field2405] = var15;
                        class112.field2405++;
                    }
                }
            }
        }
        class106.field2294.method647(arg1 + 190);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)I")
    public static final int method984(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            field2899 = null;
        }
        int var5 = 65536 - class124.field2717[arg4 * 1024 / arg3] >> 1;
        field2896++;
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
    public class127(byte[] arg0) {
        this.field2875 = new int[128];
        this.field2887 = new class150[128];
        this.field2883 = new byte[128];
        this.field2895 = new short[128];
        this.field2881 = new byte[128];
        this.field2897 = new byte[128];
        this.field2882 = new class123[128];
        class138 var2 = new class138(arg0);
        int var3;
        for (var3 = 0; var2.field3213[var2.field3175 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1079((byte) 0);
        }
        var2.field3175++;
        int var6 = var2.field3175;
        var3++;
        var2.field3175 += var3;
        int var7;
        for (var7 = 0; var2.field3213[var2.field3175 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1079((byte) 0);
        }
        var2.field3175++;
        var7++;
        int var10 = 0;
        int var11 = var2.field3175;
        var2.field3175 += var7;
        while (var2.field3213[var2.field3175 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method1079((byte) 0);
        }
        var2.field3175++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method1055(118);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var10;
        }
        class150[] var19 = new class150[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class150 var103 = var19[var20] = new class150();
            int var104 = var2.method1055(122);
            if (var104 > 0) {
                var103.field3430 = new byte[var104 * 2];
            }
            int var105 = var2.method1055(124);
            if (var105 > 0) {
                var103.field3426 = new byte[var105 * 2 + 2];
                var103.field3426[1] = 64;
            }
        }
        int var21 = var2.method1055(127);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = 0;
        int var24 = var2.method1055(120);
        while (var2.field3213[var2.field3175 + var23] != 0) {
            var23++;
        }
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        byte[] var26 = new byte[var23];
        for (int var27 = 0; var27 < var23; var27++) {
            var26[var27] = var2.method1079((byte) 0);
        }
        var23++;
        int var28 = 0;
        var2.field3175++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1055(126);
            this.field2895[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1055(118);
            this.field2895[var31] = (short) (this.field2895[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var34 < var26.length) {
                    var32 = var26[var34++];
                } else {
                    var32 = -1;
                }
                var33 = var2.method1091((byte) -45);
            }
            var32--;
            this.field2895[var35] = (short) (this.field2895[var35] + class41.method307(32768, var33 - 1 << 14));
            this.field2875[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2875[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field3213[var6++] - 1;
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                this.field2883[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2875[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field3213[var11++] + 16 << 2;
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field2897[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class150 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2875[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                this.field2887[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length > var50) {
                    var48 = var26[var50++];
                } else {
                    var48 = -1;
                }
                if (this.field2875[var51] > 0) {
                    var49 = var2.method1055(122) + 1;
                }
            }
            this.field2881[var51] = (byte) var49;
            var48--;
        }
        this.field2892 = var2.method1055(119) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class150 var100 = var19[var52];
            if (var100.field3430 != null) {
                for (int var101 = 1; var101 < var100.field3430.length; var101 += 2) {
                    var100.field3430[var101] = var2.method1079((byte) 0);
                }
            }
            if (var100.field3426 != null) {
                for (int var102 = 3; var102 < var100.field3426.length - 2; var102 += 2) {
                    var100.field3426[var102] = var2.method1079((byte) 0);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1079((byte) 0);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method1079((byte) 0);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class150 var97 = var19[var55];
            if (var97.field3426 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3426.length; var99 += 2) {
                    var98 = var98 + var2.method1055(112) + 1;
                    var97.field3426[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class150 var94 = var19[var56];
            if (var94.field3430 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3430.length; var96 += 2) {
                    var95 = var2.method1055(111) + var95 + 1;
                    var94.field3430[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1055(109);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 -= -var2.method1055(115) - 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2881[var61] = (byte) (this.field2881[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class154.method1193(var67, var65 - var59, 28253);
                    var67 += var66 - var60;
                    this.field2881[var68] = (byte) (this.field2881[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2881[var63] = (byte) (this.field2881[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var2.method1055(110);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var2.method1055(111) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2897[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2897[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) * var73 + (var79 - var72) / 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class154.method1193(var81, var79 - var72, 28253);
                    var81 += var80 - var73;
                    int var84 = (this.field2897[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2897[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field2897[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2897[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3424 = var2.method1055(110);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class150 var93 = var19[var87];
            if (var93.field3430 != null) {
                var93.field3429 = var2.method1055(110);
            }
            if (var93.field3426 != null) {
                var93.field3427 = var2.method1055(110);
            }
            if (var93.field3424 > 0) {
                var93.field3431 = var2.method1055(116);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3421 = var2.method1055(115);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class150 var92 = var19[var89];
            if (var92.field3421 > 0) {
                var92.field3433 = var2.method1055(114);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class150 var91 = var19[var90];
            if (var91.field3433 > 0) {
                var91.field3422 = var2.method1055(127);
            }
        }
    }
}
