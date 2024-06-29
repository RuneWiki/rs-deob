import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class275 {

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "[[Lej;")
    private class744[][] field3475 = new class744[64][768];

    @OriginalMember(owner = "client!fha", name = "k", descriptor = "I")
    private int field3482 = 0;

    @OriginalMember(owner = "client!fha", name = "n", descriptor = "[[Lej;")
    private class744[][] field3485 = new class744[1600][64];

    @OriginalMember(owner = "client!fha", name = "j", descriptor = "[I")
    private int[] field3481 = new int[8191];

    @OriginalMember(owner = "client!fha", name = "q", descriptor = "[I")
    private int[] field3488 = new int[64];

    @OriginalMember(owner = "client!fha", name = "p", descriptor = "[I")
    private int[] field3487 = new int[1600];

    @OriginalMember(owner = "client!fha", name = "t", descriptor = "Lmia;")
    private class657 field3491;

    @OriginalMember(owner = "client!fha", name = "r", descriptor = "Lu;")
    private class60 field3489;

    @OriginalMember(owner = "client!fha", name = "s", descriptor = "Lu;")
    private class60 field3490;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "Lru;")
    private class246 field3473;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!fha", name = "e", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!fha", name = "f", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!fha", name = "g", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!fha", name = "h", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!fha", name = "i", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!fha", name = "l", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!fha", name = "m", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!fha", name = "o", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lbm;I)V")
    private final void method1645(class684 arg0, int arg1) {
        field3472++;
        arg0.method3765(true, arg1 ^ 0x32E1);
        if (arg1 != -13055) {
            this.field3490 = null;
        }
        arg0.method3716(true, arg1 + 12932);
        if (class144.field1712 != arg0.field9651) {
            arg0.method139(class144.field1712);
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lbm;II)V")
    private final void method1646(class684 arg0, int arg1, int arg2) {
        class144.field1712 = arg0.field9651;
        field3483++;
        arg0.method3724((float) arg1, 106);
        if (arg2 <= 48) {
            this.field3473 = null;
        }
        arg0.method3721(16);
        arg0.method3716(false, -46);
        arg0.method3765(false, -32);
        arg0.method3726((byte) 86);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(BLbm;)V")
    public final void method1647(byte arg0, class684 arg1) {
        if (arg0 != 57) {
            this.method1648(null, null, 91, 17);
        }
        field3476++;
        this.field3489.method472(24, 786336, -2898);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lbm;Lcd;II)V")
    public final void method1648(class684 arg0, class603 arg1, int arg2, int arg3) {
        field3486++;
        if (arg0.field9549 == null) {
            return;
        }
        if (arg3 >= 0) {
            this.method1646(arg0, arg3, arg2 + 123);
        } else {
            this.method1650(arg0, -1636);
        }
        float var5 = arg0.field9549.field6665;
        float var6 = arg0.field9549.field6681;
        float var7 = arg0.field9549.field6663;
        float var8 = arg0.field9549.field6695;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class297 var12 = arg1.field8363.field4479;
            for (class297 var13 = var12.field3857; var13 != var12; var13 = var13.field3857) {
                class744 var14 = (class744) var13;
                int var15 = (int) ((float) (var14.field10387 >> 12) * var7 + (float) (var14.field10388 >> 12) * var6 + (float) (var14.field10383 >> 12) * var5 + var8);
                this.field3481[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((arg2 + var16) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class233.method1468(var16, (byte) -37) + 1 - class399.field5525;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class297 var19 = var12.field3857;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field3482 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field3487[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field3488[var24] = 0;
                }
                while (var12 != var19) {
                    class744 var25 = (class744) var19;
                    if (var22) {
                        var21 = var25.field10384;
                        var20 = var25.field10385;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field10385 != var20 || var25.field10384 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field3481[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field3487[var26] >= 64) {
                            label102: {
                                if (this.field3487[var26] == 64) {
                                    if (this.field3482 == 64) {
                                        break label102;
                                    }
                                    this.field3487[var26] += this.field3482++ + 1;
                                }
                                this.field3475[this.field3487[var26] - 64 - 1][this.field3488[this.field3487[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field3485[var26][this.field3487[var26]++] = var25;
                        }
                    }
                    var19 = var19.field3857;
                }
                arg0.method3725(false, 47, var20 < 0 ? -1 : var20, false);
                if (var21 && class144.field1712 != arg0.field9651) {
                    arg0.method139(class144.field1712);
                } else if (arg0.field9651 != 1.0F) {
                    arg0.method139(1.0F);
                }
                this.method1652(arg0, 111, var16);
            }
        } catch (Exception var27) {
        }
        this.method1645(arg0, -13055);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lmb;[Lpk;)V")
    public static final void method1649(class410 arg0, class621[] arg1) {
        if (class659.field9052) {
            int var2 = arg0.method933(16, arg1);
            class618.field8660.method146(var2, arg1);
        }
        if (class517.field7282 == class109.field1341) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class451) {
                var5 = ((class451) arg0).field6321;
                var6 = ((class451) arg0).field6328;
            } else {
                var5 = arg0.field5790 >> class455.field6383;
                var6 = arg0.field5784 >> class455.field6383;
            }
            class618.field8660.method78(class716.field10106[0].method2382((byte) 19, arg0.field5784, arg0.field5790), class653.method3525(var5, var6), class165.method1017(var5, var6), class367.method2256(var5, var6));
        }
        class607 var7 = arg0.method509(class618.field8660, -8964);
        if (var7 == null) {
            return;
        }
        if (arg0.field5780) {
            class678[] var8 = var7.field8425;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class678 var10 = var8[var9];
                if (var10.field9208) {
                    class365.method2249(true, var10.field9206 + var10.field9204, var10.field9203 - var10.field9206, var10.field9206 + var10.field9205, var10.field9207 - var10.field9206);
                }
            }
        }
        if (var7.field8418) {
            var7.field8417 = arg0;
            if (class6.field68) {
                class616 var11 = class469.field6740;
                synchronized (class469.field6740) {
                    class469.field6740.method3380(var7, 0);
                    return;
                }
            }
            class469.field6740.method3380(var7, 0);
            return;
        }
        class87.method610(var7, 0);
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(Lbm;I)V")
    private final void method1650(class684 arg0, int arg1) {
        if (arg1 != -1636) {
            return;
        }
        class144.field1712 = arg0.field9651;
        field3478++;
        arg0.method3736((byte) 125);
        arg0.method3716(false, arg1 + 1567);
        arg0.method3765(false, -32);
        arg0.method3726((byte) 101);
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILrq;)Lof;")
    public static final class456 method1651(int arg0, class451 arg1) {
        field3479++;
        if (arg0 != -1) {
            return null;
        }
        class456 var2;
        if (class236.field3055 == null) {
            var2 = new class456();
        } else {
            var2 = class236.field3055;
            class236.field3055 = class236.field3055.field6389;
            var2.field6389 = null;
            class213.field2711--;
        }
        var2.field6384 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(Lbm;II)V")
    private final void method1652(class684 arg0, int arg1, int arg2) {
        field3477++;
        int var4 = 0;
        class462 var5 = arg0.method3756((byte) 107);
        float var6 = var5.field6662;
        float var7 = var5.field6684;
        float var8 = var5.field6648;
        float var9 = var5.field6696;
        float var10 = var5.field6655;
        float var11 = var5.field6687;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        if (arg1 < 75) {
            this.method1650(null, 60);
        }
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field3489.method471((byte) 28, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method3772(var21, 4);
        if (Stream.method2226()) {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field3487[var23] <= 64 ? this.field3487[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class744 var38 = this.field3485[var23][var25];
                        int var39 = var38.field10380;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field10383 >> 12);
                        float var45 = (float) (var38.field10388 >> 12);
                        float var46 = (float) (var38.field10387 >> 12);
                        int var47 = var38.field10379 >> 12;
                        var22.method2229((float) (-var47) * var12 + var44);
                        var22.method2229((float) (-var47) * var13 + var45);
                        var22.method2229((float) (-var47) * var14 + var46);
                        if (arg0.field9608 == 0) {
                            var22.method2230(var40, var41, var42, var43);
                        } else {
                            var22.method2235(var40, var41, var42, var43);
                        }
                        var22.method2229(0.0F);
                        var22.method2229(0.0F);
                        var22.method2229((float) var47 * var15 + var44);
                        var22.method2229((float) var47 * var16 + var45);
                        var22.method2229((float) var47 * var17 + var46);
                        if (arg0.field9608 == 0) {
                            var22.method2230(var40, var41, var42, var43);
                        } else {
                            var22.method2235(var40, var41, var42, var43);
                        }
                        var22.method2229(1.0F);
                        var22.method2229(0.0F);
                        var22.method2229((float) var47 * var12 + var44);
                        var22.method2229((float) var47 * var13 + var45);
                        var22.method2229((float) var47 * var14 + var46);
                        if (arg0.field9608 == 0) {
                            var22.method2230(var40, var41, var42, var43);
                        } else {
                            var22.method2235(var40, var41, var42, var43);
                        }
                        var22.method2229(1.0F);
                        var22.method2229(1.0F);
                        var22.method2229((float) var47 * var18 + var44);
                        var22.method2229((float) var47 * var19 + var45);
                        var22.method2229((float) var47 * var20 + var46);
                        if (arg0.field9608 == 0) {
                            var22.method2230(var40, var41, var42, var43);
                        } else {
                            var22.method2235(var40, var41, var42, var43);
                        }
                        var22.method2229(0.0F);
                        var4++;
                        var22.method2229(1.0F);
                    }
                    if (this.field3487[var23] > 64) {
                        int var26 = this.field3487[var23] - 1 - 64;
                        for (int var27 = this.field3488[var26] - 1; var27 >= 0; var27--) {
                            class744 var28 = this.field3475[var26][var27];
                            int var29 = var28.field10380;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field10383 >> 12);
                            float var35 = (float) (var28.field10388 >> 12);
                            float var36 = (float) (var28.field10387 >> 12);
                            int var37 = var28.field10379 >> 12;
                            var22.method2229((float) (-var37) * var12 + var34);
                            var22.method2229((float) (-var37) * var13 + var35);
                            var22.method2229((float) (-var37) * var14 + var36);
                            if (arg0.field9608 == 0) {
                                var22.method2230(var30, var31, var32, var33);
                            } else {
                                var22.method2235(var30, var31, var32, var33);
                            }
                            var22.method2229(0.0F);
                            var22.method2229(0.0F);
                            var22.method2229((float) var37 * var15 + var34);
                            var22.method2229((float) var37 * var16 + var35);
                            var22.method2229((float) var37 * var17 + var36);
                            if (arg0.field9608 == 0) {
                                var22.method2230(var30, var31, var32, var33);
                            } else {
                                var22.method2235(var30, var31, var32, var33);
                            }
                            var22.method2229(1.0F);
                            var22.method2229(0.0F);
                            var22.method2229((float) var37 * var12 + var34);
                            var22.method2229((float) var37 * var13 + var35);
                            var22.method2229((float) var37 * var14 + var36);
                            if (arg0.field9608 == 0) {
                                var22.method2230(var30, var31, var32, var33);
                            } else {
                                var22.method2235(var30, var31, var32, var33);
                            }
                            var22.method2229(1.0F);
                            var22.method2229(1.0F);
                            var22.method2229((float) var37 * var18 + var34);
                            var22.method2229((float) var37 * var19 + var35);
                            var22.method2229((float) var37 * var20 + var36);
                            if (arg0.field9608 == 0) {
                                var22.method2230(var30, var31, var32, var33);
                            } else {
                                var22.method2235(var30, var31, var32, var33);
                            }
                            var22.method2229(0.0F);
                            var22.method2229(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field3487[var48] <= 64 ? this.field3487[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class744 var63 = this.field3485[var48][var50];
                        int var64 = var63.field10380;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field10383 >> 12);
                        float var70 = (float) (var63.field10388 >> 12);
                        float var71 = (float) (var63.field10387 >> 12);
                        int var72 = var63.field10379 >> 12;
                        var22.method2237((float) (-var72) * var12 + var69);
                        var22.method2237((float) (-var72) * var13 + var70);
                        var22.method2237((float) (-var72) * var14 + var71);
                        if (arg0.field9608 == 0) {
                            var22.method2230(var65, var66, var67, var68);
                        } else {
                            var22.method2235(var65, var66, var67, var68);
                        }
                        var22.method2237(0.0F);
                        var22.method2237(0.0F);
                        var22.method2237((float) var72 * var15 + var69);
                        var22.method2237((float) var72 * var16 + var70);
                        var22.method2237((float) var72 * var17 + var71);
                        if (arg0.field9608 == 0) {
                            var22.method2230(var65, var66, var67, var68);
                        } else {
                            var22.method2235(var65, var66, var67, var68);
                        }
                        var22.method2237(1.0F);
                        var22.method2237(0.0F);
                        var22.method2237((float) var72 * var12 + var69);
                        var22.method2237((float) var72 * var13 + var70);
                        var22.method2237((float) var72 * var14 + var71);
                        if (arg0.field9608 == 0) {
                            var22.method2230(var65, var66, var67, var68);
                        } else {
                            var22.method2235(var65, var66, var67, var68);
                        }
                        var22.method2237(1.0F);
                        var22.method2237(1.0F);
                        var22.method2237((float) var72 * var18 + var69);
                        var22.method2237((float) var72 * var19 + var70);
                        var22.method2237((float) var72 * var20 + var71);
                        if (arg0.field9608 == 0) {
                            var22.method2230(var65, var66, var67, var68);
                        } else {
                            var22.method2235(var65, var66, var67, var68);
                        }
                        var22.method2237(0.0F);
                        var4++;
                        var22.method2237(1.0F);
                    }
                    if (this.field3487[var48] > 64) {
                        int var51 = this.field3487[var48] - 64 - 1;
                        for (int var52 = this.field3488[var51] - 1; var52 >= 0; var52--) {
                            class744 var53 = this.field3475[var51][var52];
                            int var54 = var53.field10380;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field10383 >> 12);
                            float var60 = (float) (var53.field10388 >> 12);
                            float var61 = (float) (var53.field10387 >> 12);
                            int var62 = var53.field10379 >> 12;
                            var22.method2237((float) (-var62) * var12 + var59);
                            var22.method2237((float) (-var62) * var13 + var60);
                            var22.method2237((float) (-var62) * var14 + var61);
                            if (arg0.field9608 == 0) {
                                var22.method2230(var55, var56, var57, var58);
                            } else {
                                var22.method2235(var55, var56, var57, var58);
                            }
                            var22.method2237(0.0F);
                            var22.method2237(0.0F);
                            var22.method2237((float) var62 * var15 + var59);
                            var22.method2237((float) var62 * var16 + var60);
                            var22.method2237((float) var62 * var17 + var61);
                            if (arg0.field9608 == 0) {
                                var22.method2230(var55, var56, var57, var58);
                            } else {
                                var22.method2235(var55, var56, var57, var58);
                            }
                            var22.method2237(1.0F);
                            var22.method2237(0.0F);
                            var22.method2237((float) var62 * var12 + var59);
                            var22.method2237((float) var62 * var13 + var60);
                            var22.method2237((float) var62 * var14 + var61);
                            if (arg0.field9608 == 0) {
                                var22.method2230(var55, var56, var57, var58);
                            } else {
                                var22.method2235(var55, var56, var57, var58);
                            }
                            var22.method2237(1.0F);
                            var22.method2237(1.0F);
                            var22.method2237((float) var62 * var18 + var59);
                            var22.method2237((float) var62 * var19 + var60);
                            var22.method2237((float) var62 * var20 + var61);
                            if (arg0.field9608 == 0) {
                                var22.method2230(var55, var56, var57, var58);
                            } else {
                                var22.method2235(var55, var56, var57, var58);
                            }
                            var22.method2237(0.0F);
                            var4++;
                            var22.method2237(1.0F);
                        }
                    }
                }
            }
        }
        var22.method2223();
        if (this.field3489.method475((byte) -61)) {
            arg0.method1407(this.field3489, (byte) -103, 0);
            arg0.method1407(this.field3490, (byte) 38, 1);
            arg0.method1436(14522, this.field3491);
            arg0.method1415(0, class260.field3301, (byte) -112, 0, var4 * 2, this.field3473, var4 * 4);
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
    public final void method1653(int arg0) {
        field3474++;
        this.field3489.method474(-86);
        if (arg0 != 2) {
            this.method1652(null, 59, 123);
        }
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lbm;)V")
    public class275(class684 arg0) {
        this.field3491 = arg0.method1434(true, new class734[] { new class734(new class453[] { class453.field6343, class453.field6351, class453.field6353 }), new class734(class453.field6349) });
        this.field3489 = arg0.method1423(123, true);
        this.field3490 = arg0.method1423(102, false);
        this.field3490.method472(12, 393168, -2898);
        this.field3473 = arg0.method1412(false, true);
        this.field3473.method818(49146, (byte) -24);
        Buffer var2 = this.field3473.method1518((byte) 98, true);
        if (var2 != null) {
            Stream var3 = arg0.method3772(var2, 4);
            if (Stream.method2226()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2233(var7);
                    var3.method2233(var7 + 1);
                    var3.method2233(var7 + 2);
                    var3.method2233(var7 + 2);
                    var3.method2233(var7 + 3);
                    var3.method2233(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2224(var5);
                    var3.method2224(var5 + 1);
                    var3.method2224(var5 + 2);
                    var3.method2224(var5 + 2);
                    var3.method2224(var5 + 3);
                    var3.method2224(var5);
                }
            }
            var3.method2223();
            this.field3473.method1517((byte) 126);
        }
        Buffer var8 = this.field3490.method471((byte) 28, true);
        if (var8 != null) {
            Stream var9 = arg0.method3772(var8, 4);
            if (Stream.method2226()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2229(0.0F);
                    var9.method2229(-1.0F);
                    var9.method2229(0.0F);
                    var9.method2229(0.0F);
                    var9.method2229(-1.0F);
                    var9.method2229(0.0F);
                    var9.method2229(0.0F);
                    var9.method2229(-1.0F);
                    var9.method2229(0.0F);
                    var9.method2229(0.0F);
                    var9.method2229(-1.0F);
                    var9.method2229(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2237(0.0F);
                    var9.method2237(-1.0F);
                    var9.method2237(0.0F);
                    var9.method2237(0.0F);
                    var9.method2237(-1.0F);
                    var9.method2237(0.0F);
                    var9.method2237(0.0F);
                    var9.method2237(-1.0F);
                    var9.method2237(0.0F);
                    var9.method2237(0.0F);
                    var9.method2237(-1.0F);
                    var9.method2237(0.0F);
                }
            }
            var9.method2223();
            this.field3490.method475((byte) -120);
        }
    }
}
