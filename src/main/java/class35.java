import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class35 extends class45 {

    @OriginalMember(owner = "client!on", name = "z", descriptor = "[B")
    public byte[] field498;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "[I")
    private int[] field501;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "[B")
    public byte[] field491;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "[B")
    public byte[] field495;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "[Lvl;")
    public class374[] field488;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "[Lig;")
    public class13[] field485;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "[S")
    public short[] field486;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "[I")
    public static int[] field483 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "[I")
    public static int[] field497;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIILge;)V", line = 4)
    public static final void method232(int arg0, int arg1, int arg2, int arg3, class104 arg4) {
        field496++;
        if (arg3 != -25388) {
            field483 = null;
        }
        for (class365 var5 = (class365) class185.field2509.method332(-2130841184); var5 != null; var5 = (class365) class185.field2509.method343((byte) -88)) {
            if (var5.field5274 == arg2 && arg0 * 128 == var5.field5264 && (arg1 * 128) == var5.field5293 && var5.field5281.field1507 == arg4.field1507) {
                if (var5.field5275 != null) {
                    class156.field2122.method2502(var5.field5275);
                    var5.field5275 = null;
                }
                if (var5.field5266 != null) {
                    class156.field2122.method2502(var5.field5266);
                    var5.field5266 = null;
                }
                var5.method322(11);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([BLcp;B[I)Z", line = 46)
    public final boolean method233(byte[] arg0, class397 arg1, byte arg2, int[] arg3) {
        field493++;
        boolean var5 = true;
        int var6 = 0;
        int var7 = -30 % ((-arg2 - 40) / 59);
        class13 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg0 == null || arg0[var9] != 0) {
                int var10 = this.field501[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg1.method2548(arg3, -117, var10 >> 2);
                        } else {
                            var8 = arg1.method2549(var10 >> 2, arg3, (byte) 60);
                        }
                        if (var8 == null) {
                            var5 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field485[var9] = var8;
                        this.field501[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 110)
    public final void method234(int arg0) {
        if (arg0 != 17532) {
            this.field485 = null;
        }
        field490++;
        this.field501 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lwd;Lnj;ZI)V", line = 121)
    public static final void method235(class36 arg0, class228 arg1, boolean arg2, int arg3) {
        if (arg2) {
            method235((class36) null, (class228) null, true, -115);
        }
        field499++;
        class262 var4 = new class262();
        var4.field3805 = arg1.method1348(-110);
        var4.field3796 = arg1.method1344((byte) 79);
        var4.field3800 = new int[var4.field3805];
        var4.field3798 = new int[var4.field3805];
        var4.field3802 = new byte[var4.field3805][][];
        var4.field3801 = new class429[var4.field3805];
        var4.field3807 = new class429[var4.field3805];
        var4.field3808 = new int[var4.field3805];
        for (int var5 = 0; var5 < var4.field3805; var5++) {
            try {
                int var6 = arg1.method1348(-98);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method1329(991328496);
                    String var8 = arg1.method1329(991328496);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method1344((byte) 109);
                    }
                    var4.field3798[var5] = var6;
                    var4.field3800[var5] = var9;
                    var4.field3801[var5] = arg0.method257(9, var8, class12.method81(var7, -5024));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method1329(991328496);
                    String var11 = arg1.method1329(991328496);
                    int var12 = arg1.method1348(-117);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method1329(991328496);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method1344((byte) 94);
                            var15[var16] = new byte[var17];
                            arg1.method1358(0, 128, var15[var16], var17);
                        }
                    }
                    var4.field3798[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class12.method81(var13[var19], -5024);
                    }
                    var4.field3807[var5] = arg0.method259(class12.method81(var10, -5024), (byte) 67, var18, var11);
                    var4.field3802[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3808[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3808[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3808[var5] = -3;
            } catch (Exception var23) {
                var4.field3808[var5] = -4;
            } catch (Throwable var24) {
                var4.field3808[var5] = -5;
            }
        }
        class138.field1902.method330(var4, -2130841184);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZIII)V", line = 246)
    public static final void method236(boolean arg0, int arg1, int arg2, int arg3) {
        field484++;
        int var4 = arg2 << 3;
        int var5 = arg3 << 3;
        int var6 = arg1 << 3;
        class396.field5847 = (float) var6;
        if (class346.field4979 == 2) {
            class404.field6005 = var4;
            class5.field66 = var6;
            class415.field6101 = var5;
        }
        class317.field4647 = (float) var5;
        class407.method2627(3);
        class172.field2303 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjava/lang/String;)V", line = 267)
    public static final void method237(int arg0, String arg1) {
        field492++;
        if (arg1.equals("")) {
            return;
        }
        class185.field2507.method5(-6445, 195);
        class394.field5744++;
        class185.field2507.method1346(class125.method795(124, arg1), 32767);
        class185.field2507.method1380(65280, arg1);
        if (arg0 < 17) {
            method239(-97);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V", line = 289)
    public static final void method238(int arg0, int arg1, int arg2) {
        field494++;
        class263 var3 = class47.method337(14, 0, arg0);
        var3.method1807((byte) -125);
        var3.field3813 = arg2;
        int var4 = 83 / ((arg1 - 49) / 46);
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V", line = 302)
    public static void method239(int arg0) {
        if (arg0 != 0) {
            field497 = null;
        }
        field483 = null;
        field497 = null;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 314)
    public class35() {
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "([B)V", line = 316)
    public class35(byte[] arg0) {
        this.field498 = new byte[128];
        this.field501 = new int[128];
        this.field491 = new byte[128];
        this.field495 = new byte[128];
        this.field488 = new class374[128];
        this.field485 = new class13[128];
        this.field486 = new short[128];
        class228 var2 = new class228(arg0);
        int var3;
        for (var3 = 0; var2.field3040[var2.field3029 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1349(3);
        }
        var3++;
        var2.field3029++;
        int var6 = var2.field3029;
        var2.field3029 += var3;
        int var7;
        for (var7 = 0; var2.field3040[var2.field3029 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1349(3);
        }
        var7++;
        var2.field3029++;
        int var10 = var2.field3029;
        var2.field3029 += var7;
        int var11;
        for (var11 = 0; var2.field3040[var2.field3029 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1349(3);
        }
        var11++;
        var2.field3029++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1348(-116);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class374[] var19 = new class374[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class374 var103 = var19[var20] = new class374();
            int var104 = var2.method1348(-87);
            if (var104 > 0) {
                var103.field5441 = new byte[var104 * 2];
            }
            int var105 = var2.method1348(-124);
            if (var105 > 0) {
                var103.field5434 = new byte[var105 * 2 + 2];
                var103.field5434[1] = 64;
            }
        }
        int var21 = var2.method1348(-127);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method1348(-89);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field3040[var2.field3029 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1349(3);
        }
        var25++;
        var2.field3029++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1348(-125);
            this.field486[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1348(-88);
            this.field486[var31] = (short) (this.field486[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method1334(-8714);
            }
            this.field486[var35] = (short) (this.field486[var35] + (class183.method1117(var34 - 1, 2) << 14));
            this.field501[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field501[var39] != 0) {
                if (var37 == 0) {
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var2.field3040[var6++] - 1;
                }
                this.field498[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field501[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field3040[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                this.field495[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class374 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field501[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                var45--;
                this.field488[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 < var26.length) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field501[var51] > 0) {
                    var50 = var2.method1348(-125) + 1;
                }
            }
            this.field491[var51] = (byte) var50;
            var48--;
        }
        this.field489 = var2.method1348(-120) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class374 var100 = var19[var52];
            if (var100.field5441 != null) {
                for (int var101 = 1; var101 < var100.field5441.length; var101 += 2) {
                    var100.field5441[var101] = var2.method1349(3);
                }
            }
            if (var100.field5434 != null) {
                for (int var102 = 3; var102 < (var100.field5434.length - 2); var102 += 2) {
                    var100.field5434[var102] = var2.method1349(3);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1349(3);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1349(3);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class374 var97 = var19[var55];
            if (var97.field5434 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field5434.length; var99 += 2) {
                    var98 += var2.method1348(-92) + 1;
                    var97.field5434[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class374 var94 = var19[var56];
            if (var94.field5441 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field5441.length; var96 += 2) {
                    var95 = var2.method1348(-93) + (var95 + 1);
                    var94.field5441[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1348(-128);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method1348(-105) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field491[var61] = (byte) (this.field491[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class135.method848(var65 - var59, var67, -13496);
                    this.field491[var68] = (byte) (this.field491[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field491[var63] = (byte) (this.field491[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1348(-88);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method1348(-95) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field495[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field495[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class135.method848(var79 - var72, var81, -13496);
                    int var84 = (this.field495[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field495[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field495[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field495[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field5440 = var2.method1348(-87);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class374 var93 = var19[var87];
            if (var93.field5441 != null) {
                var93.field5445 = var2.method1348(-109);
            }
            if (var93.field5434 != null) {
                var93.field5437 = var2.method1348(-91);
            }
            if (var93.field5440 > 0) {
                var93.field5436 = var2.method1348(-103);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field5438 = var2.method1348(-88);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class374 var92 = var19[var89];
            if (var92.field5438 > 0) {
                var92.field5439 = var2.method1348(-92);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class374 var91 = var19[var90];
            if (var91.field5439 > 0) {
                var91.field5444 = var2.method1348(-106);
            }
        }
    }
}
