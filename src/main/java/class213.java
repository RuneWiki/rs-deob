import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class213 extends class431 {

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[B")
    public byte[] field3471;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[S")
    public short[] field3469;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[Lnt;")
    public class151[] field3472;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[I")
    private int[] field3473;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[B")
    public byte[] field3475;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[Lfv;")
    public class79[] field3470;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "[B")
    public byte[] field3481;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public int field3483;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field3474 = 2;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field3477 = -1;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Lob;")
    public static class521 field3480 = new class521(78, -1);

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lya;Z)V")
    public static final void method1476(class38 arg0, boolean arg1) {
        field3479++;
        int var2 = class521.field7630;
        int var3 = class397.field5941;
        int var4 = class498.field7158;
        int var5 = class267.field4085;
        int var6 = -10660793;
        arg0.method364(var3, 1, var6, var4, var2, var5);
        arg0.method364(var3 + 1, 1, -16777216, var4 - 2, var2 + 1, 16);
        arg0.method276(-16777216, var2 + 1, 1, var4 - 2, var3 + 18, var5 - 19);
        class185.field2805.method2038(var2 + 3, false, -1, var6, var3 + 14, class271.field4152.method1635(class224.field3673, (byte) 120));
        int var7 = class184.field2800.method542(false);
        int var8 = class184.field2800.method543(true);
        int var9 = 0;
        if (!arg1) {
            return;
        }
        for (class295 var10 = (class295) class456.field6644.method1004((byte) -82); var10 != null; var10 = (class295) class456.field6644.method996(1)) {
            int var11 = (class382.field5752 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < (var2 + var4) && var11 - 13 < var8 && (var11 + 3) > var8 && var10.field4490) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class209.method1447(var10.field4498, (byte) -22)) {
                var13 = class390.field5847.method467((byte) -101, (int) var10.field4494).field7772;
            } else if (var10.field4503 != -1) {
                var13 = class390.field5847.method467((byte) -101, var10.field4503).field7772;
            } else if (class469.method2829((byte) -8, var10.field4498)) {
                class116 var14 = class153.field2265[(int) var10.field4494];
                if (var14 != null) {
                    class37 var15 = var14.field1763;
                    if (var15.field499 != null) {
                        var15 = var15.method256(125, class195.field3271);
                    }
                    if (var15 != null) {
                        var13 = var15.field502;
                    }
                }
            } else if (class229.method1623(var10.field4498, 49)) {
                Object var16 = null;
                class69 var17;
                if (var10.field4498 == 1004) {
                    var17 = class510.field7458.method2973(-121, (int) var10.field4494);
                } else {
                    var17 = class510.field7458.method2973(-128, (int) (var10.field4494 >>> 32 & 0x7FFFFFFFL));
                }
                if (var17.field906 != null) {
                    var17 = var17.method604((byte) -15, class195.field3271);
                }
                if (var17 != null) {
                    var13 = var17.field895;
                }
            }
            String var18 = class356.method2234(0, var10);
            if (var13 != null) {
                var18 = var18 + class534.method3165(var13, false);
            }
            class185.field2805.method2037(class305.field4603, class36.field423, var2 + 3, var12, var18, -126, var11, 0);
            if (var10.field4495) {
                client.field3313.method132(class380.field5735.method2174(-33, var18) + var2 + 5, var11 + -12);
            }
            var9++;
        }
        class127.method927(class397.field5941, class267.field4085, class498.field7158, -65534, class521.field7630);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method1477(int arg0) {
        field3480 = null;
        int var1 = -36 % ((arg0 - 45) / 41);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[Ljava/lang/Object;I[J)V")
    public static final void method1478(int arg0, int arg1, Object[] arg2, int arg3, long[] arg4) {
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg3; var11++) {
                if (arg4[var11] < (var7 + ((long) (var10 & var11)))) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var9;
            method1478(arg0, 78, arg2, var6 - 1, arg4);
            method1478(var6 + 1, 78, arg2, arg3, arg4);
        }
        field3465++;
        if (arg1 != 78) {
            field3482 = -44;
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static final void method1479(int arg0) {
        field3468++;
        class90.method742();
        if (arg0 <= 125) {
            field3467 = 115;
        }
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    public final void method1480(int arg0) {
        int var2 = 25 / ((arg0 + 2) / 40);
        this.field3473 = null;
        field3476++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[ILbk;[B)Z")
    public final boolean method1481(int arg0, int[] arg1, class256 arg2, byte[] arg3) {
        field3466++;
        boolean var5 = true;
        int var6 = 0;
        class79 var7 = null;
        if (arg0 != -1) {
            return true;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3473[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1707(var9 >> 2, arg1, (byte) -128);
                        } else {
                            var7 = arg2.method1710(var9 >> 2, arg1, false);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3470[var8] = var7;
                        this.field3473[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class213() {
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V")
    public class213(byte[] arg0) {
        this.field3471 = new byte[128];
        this.field3469 = new short[128];
        this.field3472 = new class151[128];
        this.field3473 = new int[128];
        this.field3475 = new byte[128];
        this.field3470 = new class79[128];
        this.field3481 = new byte[128];
        class217 var2 = new class217(arg0);
        int var3;
        for (var3 = 0; var2.field3572[var2.field3556 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1565(true);
        }
        var2.field3556++;
        var3++;
        int var6 = var2.field3556;
        var2.field3556 += var3;
        int var7;
        for (var7 = 0; var2.field3572[var2.field3556 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1565(true);
        }
        var7++;
        var2.field3556++;
        int var10 = var2.field3556;
        var2.field3556 += var7;
        int var11;
        for (var11 = 0; var2.field3572[var2.field3556 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1565(true);
        }
        var2.field3556++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1515((byte) 126);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class151[] var19 = new class151[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class151 var103 = var19[var20] = new class151();
            int var104 = var2.method1515((byte) 122);
            if (var104 > 0) {
                var103.field2255 = new byte[var104 * 2];
            }
            int var105 = var2.method1515((byte) 127);
            if (var105 > 0) {
                var103.field2251 = new byte[var105 * 2 + 2];
                var103.field2251[1] = 64;
            }
        }
        int var21 = var2.method1515((byte) 126);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1515((byte) 127);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field3572[var2.field3556 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1565(true);
        }
        var25++;
        var2.field3556++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1515((byte) 125);
            this.field3469[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1515((byte) 123);
            this.field3469[var31] = (short) (this.field3469[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method1526((byte) -54);
            }
            this.field3469[var35] = (short) (this.field3469[var35] + (class74.method644(2, var34 - 1) << 14));
            this.field3473[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3473[var39] != 0) {
                if (var36 == 0) {
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field3572[var6++] - 1;
                }
                var36--;
                this.field3481[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3473[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field3572[var10++] + 16 << 2;
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field3471[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class151 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3473[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                var45--;
                this.field3472[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var48) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field3473[var51] > 0) {
                    var50 = var2.method1515((byte) 121) + 1;
                }
            }
            var49--;
            this.field3475[var51] = (byte) var50;
        }
        this.field3483 = var2.method1515((byte) 127) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class151 var100 = var19[var52];
            if (var100.field2255 != null) {
                for (int var101 = 1; var101 < var100.field2255.length; var101 += 2) {
                    var100.field2255[var101] = var2.method1565(true);
                }
            }
            if (var100.field2251 != null) {
                for (int var102 = 3; var102 < (var100.field2251.length - 2); var102 += 2) {
                    var100.field2251[var102] = var2.method1565(true);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1565(true);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1565(true);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class151 var97 = var19[var55];
            if (var97.field2251 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2251.length; var99 += 2) {
                    var98 = var2.method1515((byte) 121) + var98 + 1;
                    var97.field2251[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class151 var94 = var19[var56];
            if (var94.field2255 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2255.length; var96 += 2) {
                    var95 = var95 + var2.method1515((byte) 121) + 1;
                    var94.field2255[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1515((byte) 126);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method1515((byte) 126) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3475[var61] = (byte) (this.field3475[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class416.method2610(-253, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field3475[var68] = (byte) (this.field3475[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field3475[var64] = (byte) (this.field3475[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method1515((byte) 126);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method1515((byte) 125) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3471[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3471[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class416.method2610(-253, var79 - var72, var81);
                    int var84 = (this.field3471[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3471[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field3471[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3471[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2257 = var2.method1515((byte) 126);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class151 var93 = var19[var87];
            if (var93.field2255 != null) {
                var93.field2256 = var2.method1515((byte) 122);
            }
            if (var93.field2251 != null) {
                var93.field2259 = var2.method1515((byte) 123);
            }
            if (var93.field2257 > 0) {
                var93.field2250 = var2.method1515((byte) 123);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2258 = var2.method1515((byte) 125);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class151 var92 = var19[var89];
            if (var92.field2258 > 0) {
                var92.field2252 = var2.method1515((byte) 123);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class151 var91 = var19[var90];
            if (var91.field2252 > 0) {
                var91.field2253 = var2.method1515((byte) 126);
            }
        }
    }
}
