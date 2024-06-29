import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class12 extends class381 {

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "[S")
    public short[] field282;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "[I")
    private int[] field283;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "[B")
    public byte[] field284;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "[Ldb;")
    public class91[] field294;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "[Lwm;")
    public class396[] field288;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "[B")
    public byte[] field289;

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "[B")
    public byte[] field292;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "Lvg;")
    public static class622 field295 = new class622(18, 2);

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field297 = 0;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)Z")
    public static final boolean method78(int arg0) {
        field286++;
        try {
            if (class177.field2475 == 2) {
                if (class48.field766 == null) {
                    class48.field766 = class34.method204(class634.field9148, class166.field2325, class303.field4504);
                    if (class48.field766 == null) {
                        return false;
                    }
                }
                if (class39.field584 == null) {
                    class39.field584 = new class176(class380.field5733, class245.field3247);
                }
                class617 var1 = class416.field6148;
                if (class258.field3346 != null) {
                    var1 = class258.field3346;
                }
                if (var1.method3527(22050, class48.field766, class175.field2460, (byte) 43, class39.field584)) {
                    class416.field6148 = var1;
                    class416.field6148.method3539(1482335596);
                    if (class658.field9403 <= 0) {
                        class177.field2475 = 0;
                        class416.field6148.method3545(class20.field381, (byte) 125);
                        for (int var2 = 0; var2 < class58.field952.length; var2++) {
                            class416.field6148.method3534(16, class58.field952[var2], var2);
                            class58.field952[var2] = 255;
                        }
                    } else {
                        class177.field2475 = 3;
                        class416.field6148.method3545(class20.field381 >= class658.field9403 ? class658.field9403 : class20.field381, (byte) 92);
                        for (int var3 = 0; var3 < class58.field952.length; var3++) {
                            class416.field6148.method3534(16, class58.field952[var3], var3);
                            class58.field952[var3] = 255;
                        }
                    }
                    if (class258.field3346 == null) {
                        if (class250.field3286 <= 0L) {
                            class416.field6148.method3555(class512.field7217, class48.field766, 0);
                        } else {
                            class416.field6148.method3540(class512.field7217, true, (byte) -124, class48.field766, class250.field3286);
                        }
                    }
                    if (class44.field658 != null) {
                        class44.field658.method153((byte) 76, class416.field6148);
                    }
                    class634.field9148 = null;
                    class250.field3286 = 0L;
                    class48.field766 = null;
                    class258.field3346 = null;
                    class39.field584 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class416.field6148.method3543((byte) -37);
            class39.field584 = null;
            class258.field3346 = null;
            class634.field9148 = null;
            class48.field766 = null;
            class177.field2475 = 0;
        }
        return arg0 < 75 ? false : false;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)V")
    public final void method79(boolean arg0) {
        if (!arg0) {
            field281++;
            this.field283 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IC)I")
    public static final int method80(int arg0, char arg1) {
        field285++;
        if (arg0 == -1) {
            return arg1 >= '\u0000' && class138.field2014.length > arg1 ? class138.field2014[arg1] : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V")
    public static void method81(int arg0) {
        field295 = null;
        int var1 = 38 / ((arg0 + 46) / 57);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IB)I")
    public static final int method82(int arg0, byte arg1) {
        field293++;
        return arg1 > -111 ? -42 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
    public static final void method83(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class394.field5969[var1] = true;
        }
        if (arg0 <= -48) {
            field296++;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "([BLne;I[I)Z")
    public final boolean method84(byte[] arg0, class176 arg1, int arg2, int[] arg3) {
        field291++;
        boolean var5 = true;
        int var6 = 0;
        class396 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field283[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1205(0, arg3, var9 >> 2);
                        } else {
                            var7 = arg1.method1204(var9 >> 2, 930269740, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field288[var8] = var7;
                        this.field283[var8] = 0;
                    }
                }
            }
        }
        if (arg2 != -2419) {
            this.field294 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
    public class12() {
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "([B)V")
    public class12(byte[] arg0) {
        this.field282 = new short[128];
        this.field283 = new int[128];
        this.field284 = new byte[128];
        this.field294 = new class91[128];
        this.field288 = new class396[128];
        this.field289 = new byte[128];
        this.field292 = new byte[128];
        class540 var2 = new class540(arg0);
        int var3;
        for (var3 = 0; var2.field7952[var2.field7956 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3128(32767);
        }
        var2.field7956++;
        var3++;
        int var6 = var2.field7956;
        var2.field7956 += var3;
        int var7;
        for (var7 = 0; var2.field7952[var2.field7956 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3128(32767);
        }
        var2.field7956++;
        var7++;
        int var10 = var2.field7956;
        var2.field7956 += var7;
        int var11;
        for (var11 = 0; var2.field7952[var2.field7956 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3128(32767);
        }
        var2.field7956++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method3115(29871);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class91[] var19 = new class91[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class91 var103 = var19[var20] = new class91();
            int var104 = var2.method3115(29871);
            if (var104 > 0) {
                var103.field1386 = new byte[var104 * 2];
            }
            int var105 = var2.method3115(29871);
            if (var105 > 0) {
                var103.field1385 = new byte[var105 * 2 + 2];
                var103.field1385[1] = 64;
            }
        }
        int var21 = var2.method3115(29871);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method3115(29871);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field7952[var2.field7956 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method3128(32767);
        }
        var25++;
        var2.field7956++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method3115(29871);
            this.field282[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method3115(29871);
            this.field282[var31] = (short) (this.field282[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method3114(16711680);
            }
            this.field282[var35] = (short) (this.field282[var35] + (class425.method2563(var34 - 1, 2) << 14));
            this.field283[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field283[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field7952[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field284[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field283[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field7952[var10++] + 16 << 2;
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                }
                this.field289[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class91 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field283[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field294[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 >= var26.length) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field283[var51] > 0) {
                    var50 = var2.method3115(29871) + 1;
                }
            }
            this.field292[var51] = (byte) var50;
            var48--;
        }
        this.field290 = var2.method3115(29871) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class91 var100 = var19[var52];
            if (var100.field1386 != null) {
                for (int var101 = 1; var101 < var100.field1386.length; var101 += 2) {
                    var100.field1386[var101] = var2.method3128(32767);
                }
            }
            if (var100.field1385 != null) {
                for (int var102 = 3; var102 < (var100.field1385.length - 2); var102 += 2) {
                    var100.field1385[var102] = var2.method3128(32767);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method3128(32767);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method3128(32767);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class91 var97 = var19[var55];
            if (var97.field1385 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1385.length; var99 += 2) {
                    var98 = var98 + var2.method3115(29871) + 1;
                    var97.field1385[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class91 var94 = var19[var56];
            if (var94.field1386 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1386.length; var96 += 2) {
                    var95 = var2.method3115(29871) + var95 + 1;
                    var94.field1386[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method3115(29871);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var2.method3115(29871) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field292[var61] = (byte) (this.field292[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class104.method740(var65 - var59, true, var67);
                    var67 += var66 - var60;
                    this.field292[var68] = (byte) (this.field292[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field292[var63] = (byte) (this.field292[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method3115(29871);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method3115(29871) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field289[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field289[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class104.method740(var79 - var72, true, var81);
                    int var84 = (this.field289[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field289[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field289[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field289[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field1388 = var2.method3115(29871);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class91 var93 = var19[var87];
            if (var93.field1386 != null) {
                var93.field1387 = var2.method3115(29871);
            }
            if (var93.field1385 != null) {
                var93.field1382 = var2.method3115(29871);
            }
            if (var93.field1388 > 0) {
                var93.field1397 = var2.method3115(29871);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field1396 = var2.method3115(29871);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class91 var92 = var19[var89];
            if (var92.field1396 > 0) {
                var92.field1389 = var2.method3115(29871);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class91 var91 = var19[var90];
            if (var91.field1389 > 0) {
                var91.field1393 = var2.method3115(29871);
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)V")
    public static final void method85(byte arg0) {
        if (arg0 < 37) {
            return;
        }
        if (class569.field8287 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class69.field1078.length; var2++) {
                if (class69.field1078[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class569.field8287 == var1) {
                        class362.field5322 = class69.field1078[var2].substring(class69.field1078[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class362.field5322 = "";
        }
        field287++;
    }
}
