import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class290 {

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "[I")
    private int[] field3599 = new int[64];

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    private int field3600 = 0;

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "[[Lmm;")
    private class26[][] field3612 = new class26[64][768];

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "[[Lmm;")
    private class26[][] field3598 = new class26[1600][64];

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "[I")
    private int[] field3615 = new int[1600];

    @OriginalMember(owner = "client!tfa", name = "s", descriptor = "[I")
    private int[] field3616 = new int[8191];

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "Lmq;")
    private class81 field3604;

    @OriginalMember(owner = "client!tfa", name = "v", descriptor = "Lnba;")
    private class401 field3619;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "Lnba;")
    private class401 field3609;

    @OriginalMember(owner = "client!tfa", name = "t", descriptor = "Lhh;")
    private class666 field3617;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lwp;")
    public static class453 field3605 = new class453(44, 7);

    @OriginalMember(owner = "client!tfa", name = "u", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!tfa", name = "w", descriptor = "Lfca;")
    public static class139 field3620;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
    public static void method1625(int arg0) {
        if (arg0 > -92) {
            method1625(93);
        }
        field3605 = null;
        field3620 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BLen;)V")
    private final void method1626(byte arg0, class478 arg1) {
        field3613++;
        class700.field9905 = arg1.field6331;
        arg1.method2569(8);
        arg1.method2574(false, (byte) 50);
        arg1.method2594(false, (byte) -25);
        if (arg0 >= -6) {
            this.field3598 = null;
        }
        arg1.method2551((byte) 93);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IBI)I")
    public static final int method1627(int arg0, byte arg1, int arg2) {
        field3614++;
        if (arg0 == 1 || arg0 == 3) {
            return class528.field7138[arg2 & 0x3];
        } else if (arg1 <= 21) {
            return 104;
        } else {
            return class537.field7216[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILen;)V")
    private final void method1628(int arg0, int arg1, class478 arg2) {
        class700.field9905 = arg2.field6331;
        field3611++;
        arg2.method2580((float) arg1, (byte) -53);
        arg2.method2572(128);
        arg2.method2574(false, (byte) -126);
        if (arg0 != 0) {
            this.method1633(null, 102, (byte) -50);
        }
        arg2.method2594(false, (byte) -25);
        arg2.method2551((byte) 77);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILen;)V")
    private final void method1629(int arg0, class478 arg1) {
        field3606++;
        if (arg0 < 7) {
            return;
        }
        arg1.method2594(true, (byte) -25);
        arg1.method2574(true, (byte) -126);
        if (class700.field9905 != arg1.field6331) {
            arg1.method1054(class700.field9905);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BII)Z")
    public static final boolean method1630(byte arg0, int arg1, int arg2) {
        if (arg0 != 87) {
            field3620 = null;
        }
        field3602++;
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(BLen;)V")
    public final void method1631(byte arg0, class478 arg1) {
        if (arg0 == 77) {
            this.field3619.method324(-79, 24, 786336);
            field3607++;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILen;Lir;)V")
    public final void method1632(int arg0, int arg1, class478 arg2, class27 arg3) {
        field3601++;
        if (arg2.field6234 == null) {
            return;
        }
        if (arg0 >= 0) {
            this.method1628(0, arg0, arg2);
        } else {
            this.method1626((byte) -51, arg2);
        }
        float var5 = arg2.field6234.field9798;
        float var6 = arg2.field6234.field9822;
        float var7 = arg2.field6234.field9799;
        float var8 = arg2.field6234.field9795;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class181 var12 = arg3.field399.field1895;
            for (class181 var13 = var12.field2322; var13 != var12; var13 = var13.field2322) {
                class26 var14 = (class26) var13;
                int var15 = (int) ((float) (var14.field388 >> 12) * var7 + (float) (var14.field393 >> 12) * var5 + (float) (var14.field390 >> 12) * var6 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field3616[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class517.method2798(-24420, var16) + 1 - class74.field1003;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = arg1;
            class181 var19 = var12.field2322;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field3600 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field3615[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field3599[var24] = 0;
                }
                while (var12 != var19) {
                    class26 var25 = (class26) var19;
                    if (var22) {
                        var20 = var25.field398;
                        var21 = var25.field384;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field398 != var20 || var25.field384 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field3616[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field3615[var26] >= 64) {
                            label102: {
                                if (this.field3615[var26] == 64) {
                                    if (this.field3600 == 64) {
                                        break label102;
                                    }
                                    this.field3615[var26] += this.field3600++ + 1;
                                }
                                this.field3612[this.field3615[var26] - 64 - 1][this.field3599[this.field3615[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field3598[var26][this.field3615[var26]++] = var25;
                        }
                    }
                    var19 = var19.field2322;
                }
                arg2.method2526(0, var20 < 0 ? -1 : var20, false, false);
                if (var21 && class700.field9905 != arg2.field6331) {
                    arg2.method1054(class700.field9905);
                } else if (arg2.field6331 != 1.0F) {
                    arg2.method1054(1.0F);
                }
                this.method1633(arg2, var16, (byte) 106);
            }
        } catch (Exception var27) {
        }
        this.method1629(98, arg2);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Len;IB)V")
    private final void method1633(class478 arg0, int arg1, byte arg2) {
        field3610++;
        int var4 = 82 / ((arg2 - 45) / 47);
        int var5 = 0;
        class691 var6 = arg0.method2579(3);
        float var7 = var6.field9803;
        float var8 = var6.field9781;
        float var9 = var6.field9823;
        float var10 = var6.field9819;
        float var11 = var6.field9810;
        float var12 = var6.field9796;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var9 + var12;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var12;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        float var21 = var12 - var9;
        Buffer var22 = this.field3619.method325(true, 32726);
        if (var22 == null) {
            return;
        }
        Stream var23 = arg0.method2573(var22, 127);
        if (Stream.method3420()) {
            for (int var24 = arg1 - 1; var24 >= 0; var24--) {
                int var25 = this.field3615[var24] <= 64 ? this.field3615[var24] : 64;
                if (var25 > 0) {
                    for (int var26 = var25 - 1; var26 >= 0; var26--) {
                        class26 var39 = this.field3598[var24][var26];
                        int var40 = var39.field386;
                        byte var41 = (byte) (var40 >> 16);
                        byte var42 = (byte) (var40 >> 8);
                        byte var43 = (byte) var40;
                        byte var44 = (byte) (var40 >>> 24);
                        float var45 = (float) (var39.field393 >> 12);
                        float var46 = (float) (var39.field390 >> 12);
                        float var47 = (float) (var39.field388 >> 12);
                        int var48 = var39.field385 >> 12;
                        var23.method3418((float) (-var48) * var13 + var45);
                        var23.method3418((float) (-var48) * var14 + var46);
                        var23.method3418((float) (-var48) * var15 + var47);
                        if (arg0.field6326 == 0) {
                            var23.method3429(var41, var42, var43, var44);
                        } else {
                            var23.method3425(var41, var42, var43, var44);
                        }
                        var23.method3418(0.0F);
                        var23.method3418(0.0F);
                        var23.method3418((float) var48 * var16 + var45);
                        var23.method3418((float) var48 * var17 + var46);
                        var23.method3418((float) var48 * var18 + var47);
                        if (arg0.field6326 == 0) {
                            var23.method3429(var41, var42, var43, var44);
                        } else {
                            var23.method3425(var41, var42, var43, var44);
                        }
                        var23.method3418(1.0F);
                        var23.method3418(0.0F);
                        var23.method3418((float) var48 * var13 + var45);
                        var23.method3418((float) var48 * var14 + var46);
                        var23.method3418((float) var48 * var15 + var47);
                        if (arg0.field6326 == 0) {
                            var23.method3429(var41, var42, var43, var44);
                        } else {
                            var23.method3425(var41, var42, var43, var44);
                        }
                        var23.method3418(1.0F);
                        var23.method3418(1.0F);
                        var23.method3418((float) var48 * var19 + var45);
                        var23.method3418((float) var48 * var20 + var46);
                        var23.method3418((float) var48 * var21 + var47);
                        if (arg0.field6326 == 0) {
                            var23.method3429(var41, var42, var43, var44);
                        } else {
                            var23.method3425(var41, var42, var43, var44);
                        }
                        var23.method3418(0.0F);
                        var5++;
                        var23.method3418(1.0F);
                    }
                    if (this.field3615[var24] > 64) {
                        int var27 = this.field3615[var24] - 65;
                        for (int var28 = this.field3599[var27] - 1; var28 >= 0; var28--) {
                            class26 var29 = this.field3612[var27][var28];
                            int var30 = var29.field386;
                            byte var31 = (byte) (var30 >> 16);
                            byte var32 = (byte) (var30 >> 8);
                            byte var33 = (byte) var30;
                            byte var34 = (byte) (var30 >>> 24);
                            float var35 = (float) (var29.field393 >> 12);
                            float var36 = (float) (var29.field390 >> 12);
                            float var37 = (float) (var29.field388 >> 12);
                            int var38 = var29.field385 >> 12;
                            var23.method3418((float) (-var38) * var13 + var35);
                            var23.method3418((float) (-var38) * var14 + var36);
                            var23.method3418((float) (-var38) * var15 + var37);
                            if (arg0.field6326 == 0) {
                                var23.method3429(var31, var32, var33, var34);
                            } else {
                                var23.method3425(var31, var32, var33, var34);
                            }
                            var23.method3418(0.0F);
                            var23.method3418(0.0F);
                            var23.method3418((float) var38 * var16 + var35);
                            var23.method3418((float) var38 * var17 + var36);
                            var23.method3418((float) var38 * var18 + var37);
                            if (arg0.field6326 == 0) {
                                var23.method3429(var31, var32, var33, var34);
                            } else {
                                var23.method3425(var31, var32, var33, var34);
                            }
                            var23.method3418(1.0F);
                            var23.method3418(0.0F);
                            var23.method3418((float) var38 * var13 + var35);
                            var23.method3418((float) var38 * var14 + var36);
                            var23.method3418((float) var38 * var15 + var37);
                            if (arg0.field6326 == 0) {
                                var23.method3429(var31, var32, var33, var34);
                            } else {
                                var23.method3425(var31, var32, var33, var34);
                            }
                            var23.method3418(1.0F);
                            var23.method3418(1.0F);
                            var23.method3418((float) var38 * var19 + var35);
                            var23.method3418((float) var38 * var20 + var36);
                            var23.method3418((float) var38 * var21 + var37);
                            if (arg0.field6326 == 0) {
                                var23.method3429(var31, var32, var33, var34);
                            } else {
                                var23.method3425(var31, var32, var33, var34);
                            }
                            var23.method3418(0.0F);
                            var23.method3418(1.0F);
                            var5++;
                        }
                    }
                }
            }
        } else {
            for (int var49 = arg1 - 1; var49 >= 0; var49--) {
                int var50 = this.field3615[var49] > 64 ? 64 : this.field3615[var49];
                if (var50 > 0) {
                    for (int var51 = var50 - 1; var51 >= 0; var51--) {
                        class26 var64 = this.field3598[var49][var51];
                        int var65 = var64.field386;
                        byte var66 = (byte) (var65 >> 16);
                        byte var67 = (byte) (var65 >> 8);
                        byte var68 = (byte) var65;
                        byte var69 = (byte) (var65 >>> 24);
                        float var70 = (float) (var64.field393 >> 12);
                        float var71 = (float) (var64.field390 >> 12);
                        float var72 = (float) (var64.field388 >> 12);
                        int var73 = var64.field385 >> 12;
                        var23.method3427((float) (-var73) * var13 + var70);
                        var23.method3427((float) (-var73) * var14 + var71);
                        var23.method3427((float) (-var73) * var15 + var72);
                        if (arg0.field6326 == 0) {
                            var23.method3429(var66, var67, var68, var69);
                        } else {
                            var23.method3425(var66, var67, var68, var69);
                        }
                        var23.method3427(0.0F);
                        var23.method3427(0.0F);
                        var23.method3427((float) var73 * var16 + var70);
                        var23.method3427((float) var73 * var17 + var71);
                        var23.method3427((float) var73 * var18 + var72);
                        if (arg0.field6326 == 0) {
                            var23.method3429(var66, var67, var68, var69);
                        } else {
                            var23.method3425(var66, var67, var68, var69);
                        }
                        var23.method3427(1.0F);
                        var23.method3427(0.0F);
                        var23.method3427((float) var73 * var13 + var70);
                        var23.method3427((float) var73 * var14 + var71);
                        var23.method3427((float) var73 * var15 + var72);
                        if (arg0.field6326 == 0) {
                            var23.method3429(var66, var67, var68, var69);
                        } else {
                            var23.method3425(var66, var67, var68, var69);
                        }
                        var23.method3427(1.0F);
                        var23.method3427(1.0F);
                        var23.method3427((float) var73 * var19 + var70);
                        var23.method3427((float) var73 * var20 + var71);
                        var23.method3427((float) var73 * var21 + var72);
                        if (arg0.field6326 == 0) {
                            var23.method3429(var66, var67, var68, var69);
                        } else {
                            var23.method3425(var66, var67, var68, var69);
                        }
                        var23.method3427(0.0F);
                        var23.method3427(1.0F);
                        var5++;
                    }
                    if (this.field3615[var49] > 64) {
                        int var52 = this.field3615[var49] - 65;
                        for (int var53 = this.field3599[var52] - 1; var53 >= 0; var53--) {
                            class26 var54 = this.field3612[var52][var53];
                            int var55 = var54.field386;
                            byte var56 = (byte) (var55 >> 16);
                            byte var57 = (byte) (var55 >> 8);
                            byte var58 = (byte) var55;
                            byte var59 = (byte) (var55 >>> 24);
                            float var60 = (float) (var54.field393 >> 12);
                            float var61 = (float) (var54.field390 >> 12);
                            float var62 = (float) (var54.field388 >> 12);
                            int var63 = var54.field385 >> 12;
                            var23.method3427((float) (-var63) * var13 + var60);
                            var23.method3427((float) (-var63) * var14 + var61);
                            var23.method3427((float) (-var63) * var15 + var62);
                            if (arg0.field6326 == 0) {
                                var23.method3429(var56, var57, var58, var59);
                            } else {
                                var23.method3425(var56, var57, var58, var59);
                            }
                            var23.method3427(0.0F);
                            var23.method3427(0.0F);
                            var23.method3427((float) var63 * var16 + var60);
                            var23.method3427((float) var63 * var17 + var61);
                            var23.method3427((float) var63 * var18 + var62);
                            if (arg0.field6326 == 0) {
                                var23.method3429(var56, var57, var58, var59);
                            } else {
                                var23.method3425(var56, var57, var58, var59);
                            }
                            var23.method3427(1.0F);
                            var23.method3427(0.0F);
                            var23.method3427((float) var63 * var13 + var60);
                            var23.method3427((float) var63 * var14 + var61);
                            var23.method3427((float) var63 * var15 + var62);
                            if (arg0.field6326 == 0) {
                                var23.method3429(var56, var57, var58, var59);
                            } else {
                                var23.method3425(var56, var57, var58, var59);
                            }
                            var23.method3427(1.0F);
                            var23.method3427(1.0F);
                            var23.method3427((float) var63 * var19 + var60);
                            var23.method3427((float) var63 * var20 + var61);
                            var23.method3427((float) var63 * var21 + var62);
                            if (arg0.field6326 == 0) {
                                var23.method3429(var56, var57, var58, var59);
                            } else {
                                var23.method3425(var56, var57, var58, var59);
                            }
                            var23.method3427(0.0F);
                            var23.method3427(1.0F);
                            var5++;
                        }
                    }
                }
            }
        }
        var23.method3424();
        if (this.field3619.method322(54)) {
            arg0.method1695((byte) -16, this.field3619, 0);
            arg0.method1695((byte) -16, this.field3609, 1);
            arg0.method1709(true, this.field3604);
            arg0.method1700(var5 * 4, class365.field4648, 0, 12896, var5 * 2, 0, this.field3617);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)V")
    public static final void method1634(boolean arg0) {
        field3603++;
        if (class688.field9759 >= 0) {
            long var1 = class571.method3150(127);
            class688.field9759 = (int) ((long) class688.field9759 - (var1 - class330.field4213));
            if (class688.field9759 <= 0) {
                class395.field4968 = class629.field8758.field5329;
                class384.field4843 = class629.field8758.field5319;
                class184.field2339 = class629.field8758.field5326;
                class172.field2249 = class629.field8758.field5330;
                class556.field7728 = class629.field8758.field5331;
                class688.field9759 = -1;
                class406.field5079 = class629.field8758.field5324;
                class361.field4595 = class629.field8758.field5327;
                class349.field4464 = class629.field8758.field5316;
                class462.field5894 = class629.field8758.field5315;
                class30.field431 = class629.field8758.field5328;
            } else {
                int var3 = (class688.field9759 << 8) / class393.field4951;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class184.field2339 = ((class17.field268 & 0xFF00FF) * var3 + ((class629.field8758.field5326 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class17.field268 & 0xFF00) * var3 + (class629.field8758.field5326 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                float var6 = 1.0F - var5;
                class384.field4843 = ((class518.field7074 & 0xFF00FF) * var3 + ((class629.field8758.field5319 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class518.field7074 & 0xFF00) * var3 + ((class629.field8758.field5319 & 0xFF00) * var4) & 0xFF0000) >>> 8;
                class30.field431 = (class629.field8758.field5328 - class56.field800) * var6 + class56.field800;
                class361.field4595 = (class629.field8758.field5327 - class431.field5396) * var6 + class431.field5396;
                class556.field7728 = (class629.field8758.field5331 - class318.field4071) * var6 + class318.field4071;
                class172.field2249 = class480.field6378 * var3 + (class629.field8758.field5330 * var4) >> 8;
                class349.field4464 = (class629.field8758.field5316 - class483.field6415) * var6 + class483.field6415;
                class406.field5079 = (class629.field8758.field5324 - class175.field2269) * var6 + class175.field2269;
                class462.field5894 = (class629.field8758.field5315 - class378.field4790) * var6 + class378.field4790;
                if (class83.field1173 != class629.field8758.field5329) {
                    class395.field4968 = class337.field4338.method1064(class83.field1173, class629.field8758.field5329, var6, class395.field4968);
                }
            }
            class330.field4213 = var1;
        }
        if (!arg0) {
            method1625(67);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(Z)V")
    public final void method1635(boolean arg0) {
        this.field3619.method323(-21271);
        if (arg0) {
            field3608++;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Len;)V")
    public class290(class478 arg0) {
        this.field3604 = arg0.method1730(new class563[] { new class563(new class638[] { class638.field8940, class638.field8947, class638.field8949 }), new class563(class638.field8946) }, true);
        this.field3619 = arg0.method1716(false, true);
        this.field3609 = arg0.method1716(false, false);
        this.field3609.method324(-77, 12, 393168);
        this.field3617 = arg0.method1680(false, 16);
        this.field3617.method619(27209, 49146);
        Buffer var2 = this.field3617.method1486((byte) -88, true);
        if (var2 != null) {
            Stream var3 = arg0.method2573(var2, 119);
            if (Stream.method3420()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3422(var7);
                    var3.method3422(var7 + 1);
                    var3.method3422(var7 + 2);
                    var3.method3422(var7 + 2);
                    var3.method3422(var7 + 3);
                    var3.method3422(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3430(var5);
                    var3.method3430(var5 + 1);
                    var3.method3430(var5 + 2);
                    var3.method3430(var5 + 2);
                    var3.method3430(var5 + 3);
                    var3.method3430(var5);
                }
            }
            var3.method3424();
            this.field3617.method1485((byte) 118);
        }
        Buffer var8 = this.field3609.method325(true, 32726);
        if (var8 != null) {
            Stream var9 = arg0.method2573(var8, 96);
            if (Stream.method3420()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3418(0.0F);
                    var9.method3418(-1.0F);
                    var9.method3418(0.0F);
                    var9.method3418(0.0F);
                    var9.method3418(-1.0F);
                    var9.method3418(0.0F);
                    var9.method3418(0.0F);
                    var9.method3418(-1.0F);
                    var9.method3418(0.0F);
                    var9.method3418(0.0F);
                    var9.method3418(-1.0F);
                    var9.method3418(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3427(0.0F);
                    var9.method3427(-1.0F);
                    var9.method3427(0.0F);
                    var9.method3427(0.0F);
                    var9.method3427(-1.0F);
                    var9.method3427(0.0F);
                    var9.method3427(0.0F);
                    var9.method3427(-1.0F);
                    var9.method3427(0.0F);
                    var9.method3427(0.0F);
                    var9.method3427(-1.0F);
                    var9.method3427(0.0F);
                }
            }
            var9.method3424();
            this.field3609.method322(84);
        }
    }

    static {
        new class372("", 76);
    }
}
