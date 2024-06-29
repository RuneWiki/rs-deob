import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class504 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
    private int[] field7005 = new int[64];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    private int field7004 = 0;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[[Ljc;")
    private class441[][] field7010 = new class441[1600][64];

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[I")
    private int[] field7009 = new int[8191];

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[[Ljc;")
    private class441[][] field7020 = new class441[64][768];

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[I")
    private int[] field7014 = new int[1600];

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lnp;")
    private class491 field7015;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Ltc;")
    private class353 field7016;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Ltc;")
    private class353 field7008;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Luq;")
    private class163 field7013;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lmu;")
    public static class303 field7019 = new class303(79, 3);

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field7021 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lwga;II)V", line = 10)
    private final void method2960(class745 arg0, int arg1, int arg2) {
        field7007++;
        class241.field3528 = arg0.field10207;
        int var4 = 75 % ((2 - arg1) / 34);
        arg0.method4108((float) arg2, -86);
        arg0.method4102((byte) 92);
        arg0.method4106(false, 36);
        arg0.method4156(-32, false);
        arg0.method4153(5);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lwga;)V", line = 662)
    public class504(class745 arg0) {
        this.field7015 = arg0.method2243(0, new class273[] { new class273(new class11[] { class11.field149, class11.field152, class11.field154 }), new class273(class11.field151) });
        this.field7016 = arg0.method2300(true, 16711680);
        this.field7008 = arg0.method2300(false, 16711680);
        this.field7008.method879(393168, (byte) 124, 12);
        this.field7013 = arg0.method2290(-28633, false);
        this.field7013.method1240(15959, 49146);
        Buffer var2 = this.field7013.method1241(true, false);
        if (var2 != null) {
            Stream var3 = arg0.method4122(var2, 9179);
            if (Stream.method3789()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3790(var7);
                    var3.method3790(var7 + 1);
                    var3.method3790(var7 + 2);
                    var3.method3790(var7 + 2);
                    var3.method3790(var7 + 3);
                    var3.method3790(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3779(var5);
                    var3.method3779(var5 + 1);
                    var3.method3779(var5 + 2);
                    var3.method3779(var5 + 2);
                    var3.method3779(var5 + 3);
                    var3.method3779(var5);
                }
            }
            var3.method3784();
            this.field7013.method1239(-23);
        }
        Buffer var8 = this.field7008.method880(true, 26775);
        if (var8 != null) {
            Stream var9 = arg0.method4122(var8, 9179);
            if (Stream.method3789()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3780(0.0F);
                    var9.method3780(-1.0F);
                    var9.method3780(0.0F);
                    var9.method3780(0.0F);
                    var9.method3780(-1.0F);
                    var9.method3780(0.0F);
                    var9.method3780(0.0F);
                    var9.method3780(-1.0F);
                    var9.method3780(0.0F);
                    var9.method3780(0.0F);
                    var9.method3780(-1.0F);
                    var9.method3780(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3792(0.0F);
                    var9.method3792(-1.0F);
                    var9.method3792(0.0F);
                    var9.method3792(0.0F);
                    var9.method3792(-1.0F);
                    var9.method3792(0.0F);
                    var9.method3792(0.0F);
                    var9.method3792(-1.0F);
                    var9.method3792(0.0F);
                    var9.method3792(0.0F);
                    var9.method3792(-1.0F);
                    var9.method3792(0.0F);
                }
            }
            var9.method3784();
            this.field7008.method882(6331);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILwga;)V", line = 31)
    private final void method2961(int arg0, class745 arg1) {
        field7006++;
        arg1.method4156(arg0 - 26358, true);
        arg1.method4106(true, 54);
        if (arg0 != 26326) {
            this.field7009 = null;
        }
        if (class241.field3528 != arg1.field10207) {
            arg1.method228(class241.field3528);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLwga;)V", line = 52)
    public final void method2962(byte arg0, class745 arg1) {
        this.field7016.method879(786336, (byte) 123, 24);
        int var3 = -125 / ((arg0 - 65) / 49);
        field7003++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lwga;Lmda;II)V", line = 62)
    public final void method2963(class745 arg0, class266 arg1, int arg2, int arg3) {
        field7011++;
        if (arg0.field10194 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method2960(arg0, -121, arg2);
        } else {
            this.method2965((byte) -33, arg0);
        }
        float var5 = arg0.field10194.field1476;
        float var6 = arg0.field10194.field1431;
        float var7 = arg0.field10194.field1456;
        float var8 = arg0.field10194.field1464;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = arg3;
            class409 var12 = arg1.field3774.field7287;
            for (class409 var13 = var12.field5961; var13 != var12; var13 = var13.field5961) {
                class441 var14 = (class441) var13;
                int var15 = (int) ((float) (var14.field6269 >> 12) * var7 + (float) (var14.field6276 >> 12) * var6 + (float) (var14.field6271 >> 12) * var5 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field7009[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class149.method1172(var16, arg3 + 119) + 1 - class166.field2605;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            class409 var18 = var12.field5961;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field7004 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field7014[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field7005[var24] = 0;
                }
                while (var12 != var18) {
                    class441 var25 = (class441) var18;
                    if (var22) {
                        var21 = var25.field6274;
                        var20 = var25.field6272;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field6272 != var20 || var21 != var25.field6274)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field7009[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field7014[var26] < 64) {
                            this.field7010[var26][this.field7014[var26]++] = var25;
                        } else {
                            label107: {
                                if (this.field7014[var26] == 64) {
                                    if (this.field7004 == 64) {
                                        break label107;
                                    }
                                    this.field7014[var26] += this.field7004++ + 1;
                                }
                                class441[] var28 = this.field7020[this.field7014[var26] - 65];
                                int var10002 = this.field7014[var26] - 65;
                                int var10004 = this.field7005[this.field7014[var26] - 65];
                                this.field7005[var10002] = this.field7005[this.field7014[var26] - 65] + 1;
                                var28[var10004] = var25;
                            }
                        }
                    }
                    var18 = var18.field5961;
                }
                arg0.method4073(false, false, var20 >= 0 ? var20 : -1, (byte) 117);
                if (var21 && class241.field3528 != arg0.field10207) {
                    arg0.method228(class241.field3528);
                } else if (arg0.field10207 != 1.0F) {
                    arg0.method228(1.0F);
                }
                this.method2964(false, arg0, var16);
            }
        } catch (Exception var27) {
        }
        this.method2961(arg3 ^ 0x66D6, arg0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLwga;I)V", line = 223)
    private final void method2964(boolean arg0, class745 arg1, int arg2) {
        field7018++;
        if (arg0) {
            this.method2960(null, 21, -85);
        }
        int var4 = 0;
        class81 var5 = arg1.method4157(-22036);
        float var6 = var5.field1451;
        float var7 = var5.field1440;
        float var8 = var5.field1444;
        float var9 = var5.field1448;
        float var10 = var5.field1462;
        float var11 = var5.field1472;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field7016.method880(true, 26775);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method4122(var21, 9179);
        if (Stream.method3789()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field7014[var48] > 64 ? 64 : this.field7014[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class441 var63 = this.field7010[var48][var50];
                        int var64 = var63.field6270;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field6271 >> 12);
                        float var70 = (float) (var63.field6276 >> 12);
                        float var71 = (float) (var63.field6269 >> 12);
                        int var72 = var63.field6273 >> 12;
                        var22.method3780((float) (-var72) * var12 + var69);
                        var22.method3780((float) (-var72) * var13 + var70);
                        var22.method3780((float) (-var72) * var14 + var71);
                        if (arg1.field10292 == 0) {
                            var22.method3786(var65, var66, var67, var68);
                        } else {
                            var22.method3781(var65, var66, var67, var68);
                        }
                        var22.method3780(0.0F);
                        var22.method3780(0.0F);
                        var22.method3780((float) var72 * var15 + var69);
                        var22.method3780((float) var72 * var16 + var70);
                        var22.method3780((float) var72 * var17 + var71);
                        if (arg1.field10292 == 0) {
                            var22.method3786(var65, var66, var67, var68);
                        } else {
                            var22.method3781(var65, var66, var67, var68);
                        }
                        var22.method3780(1.0F);
                        var22.method3780(0.0F);
                        var22.method3780((float) var72 * var12 + var69);
                        var22.method3780((float) var72 * var13 + var70);
                        var22.method3780((float) var72 * var14 + var71);
                        if (arg1.field10292 == 0) {
                            var22.method3786(var65, var66, var67, var68);
                        } else {
                            var22.method3781(var65, var66, var67, var68);
                        }
                        var22.method3780(1.0F);
                        var22.method3780(1.0F);
                        var22.method3780((float) var72 * var18 + var69);
                        var22.method3780((float) var72 * var19 + var70);
                        var22.method3780((float) var72 * var20 + var71);
                        if (arg1.field10292 == 0) {
                            var22.method3786(var65, var66, var67, var68);
                        } else {
                            var22.method3781(var65, var66, var67, var68);
                        }
                        var22.method3780(0.0F);
                        var4++;
                        var22.method3780(1.0F);
                    }
                    if (this.field7014[var48] > 64) {
                        int var51 = this.field7014[var48] - 65;
                        for (int var52 = this.field7005[var51] - 1; var52 >= 0; var52--) {
                            class441 var53 = this.field7020[var51][var52];
                            int var54 = var53.field6270;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field6271 >> 12);
                            float var60 = (float) (var53.field6276 >> 12);
                            float var61 = (float) (var53.field6269 >> 12);
                            int var62 = var53.field6273 >> 12;
                            var22.method3780((float) (-var62) * var12 + var59);
                            var22.method3780((float) (-var62) * var13 + var60);
                            var22.method3780((float) (-var62) * var14 + var61);
                            if (arg1.field10292 == 0) {
                                var22.method3786(var55, var56, var57, var58);
                            } else {
                                var22.method3781(var55, var56, var57, var58);
                            }
                            var22.method3780(0.0F);
                            var22.method3780(0.0F);
                            var22.method3780((float) var62 * var15 + var59);
                            var22.method3780((float) var62 * var16 + var60);
                            var22.method3780((float) var62 * var17 + var61);
                            if (arg1.field10292 == 0) {
                                var22.method3786(var55, var56, var57, var58);
                            } else {
                                var22.method3781(var55, var56, var57, var58);
                            }
                            var22.method3780(1.0F);
                            var22.method3780(0.0F);
                            var22.method3780((float) var62 * var12 + var59);
                            var22.method3780((float) var62 * var13 + var60);
                            var22.method3780((float) var62 * var14 + var61);
                            if (arg1.field10292 == 0) {
                                var22.method3786(var55, var56, var57, var58);
                            } else {
                                var22.method3781(var55, var56, var57, var58);
                            }
                            var22.method3780(1.0F);
                            var22.method3780(1.0F);
                            var22.method3780((float) var62 * var18 + var59);
                            var22.method3780((float) var62 * var19 + var60);
                            var22.method3780((float) var62 * var20 + var61);
                            if (arg1.field10292 == 0) {
                                var22.method3786(var55, var56, var57, var58);
                            } else {
                                var22.method3781(var55, var56, var57, var58);
                            }
                            var22.method3780(0.0F);
                            var4++;
                            var22.method3780(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field7014[var23] > 64 ? 64 : this.field7014[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class441 var38 = this.field7010[var23][var25];
                        int var39 = var38.field6270;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field6271 >> 12);
                        float var45 = (float) (var38.field6276 >> 12);
                        float var46 = (float) (var38.field6269 >> 12);
                        int var47 = var38.field6273 >> 12;
                        var22.method3792((float) (-var47) * var12 + var44);
                        var22.method3792((float) (-var47) * var13 + var45);
                        var22.method3792((float) (-var47) * var14 + var46);
                        if (arg1.field10292 == 0) {
                            var22.method3786(var40, var41, var42, var43);
                        } else {
                            var22.method3781(var40, var41, var42, var43);
                        }
                        var22.method3792(0.0F);
                        var22.method3792(0.0F);
                        var22.method3792((float) var47 * var15 + var44);
                        var22.method3792((float) var47 * var16 + var45);
                        var22.method3792((float) var47 * var17 + var46);
                        if (arg1.field10292 == 0) {
                            var22.method3786(var40, var41, var42, var43);
                        } else {
                            var22.method3781(var40, var41, var42, var43);
                        }
                        var22.method3792(1.0F);
                        var22.method3792(0.0F);
                        var22.method3792((float) var47 * var12 + var44);
                        var22.method3792((float) var47 * var13 + var45);
                        var22.method3792((float) var47 * var14 + var46);
                        if (arg1.field10292 == 0) {
                            var22.method3786(var40, var41, var42, var43);
                        } else {
                            var22.method3781(var40, var41, var42, var43);
                        }
                        var22.method3792(1.0F);
                        var22.method3792(1.0F);
                        var22.method3792((float) var47 * var18 + var44);
                        var22.method3792((float) var47 * var19 + var45);
                        var22.method3792((float) var47 * var20 + var46);
                        if (arg1.field10292 == 0) {
                            var22.method3786(var40, var41, var42, var43);
                        } else {
                            var22.method3781(var40, var41, var42, var43);
                        }
                        var22.method3792(0.0F);
                        var4++;
                        var22.method3792(1.0F);
                    }
                    if (this.field7014[var23] > 64) {
                        int var26 = this.field7014[var23] - 64 - 1;
                        for (int var27 = this.field7005[var26] - 1; var27 >= 0; var27--) {
                            class441 var28 = this.field7020[var26][var27];
                            int var29 = var28.field6270;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field6271 >> 12);
                            float var35 = (float) (var28.field6276 >> 12);
                            float var36 = (float) (var28.field6269 >> 12);
                            int var37 = var28.field6273 >> 12;
                            var22.method3792((float) (-var37) * var12 + var34);
                            var22.method3792((float) (-var37) * var13 + var35);
                            var22.method3792((float) (-var37) * var14 + var36);
                            if (arg1.field10292 == 0) {
                                var22.method3786(var30, var31, var32, var33);
                            } else {
                                var22.method3781(var30, var31, var32, var33);
                            }
                            var22.method3792(0.0F);
                            var22.method3792(0.0F);
                            var22.method3792((float) var37 * var15 + var34);
                            var22.method3792((float) var37 * var16 + var35);
                            var22.method3792((float) var37 * var17 + var36);
                            if (arg1.field10292 == 0) {
                                var22.method3786(var30, var31, var32, var33);
                            } else {
                                var22.method3781(var30, var31, var32, var33);
                            }
                            var22.method3792(1.0F);
                            var22.method3792(0.0F);
                            var22.method3792((float) var37 * var12 + var34);
                            var22.method3792((float) var37 * var13 + var35);
                            var22.method3792((float) var37 * var14 + var36);
                            if (arg1.field10292 == 0) {
                                var22.method3786(var30, var31, var32, var33);
                            } else {
                                var22.method3781(var30, var31, var32, var33);
                            }
                            var22.method3792(1.0F);
                            var22.method3792(1.0F);
                            var22.method3792((float) var37 * var18 + var34);
                            var22.method3792((float) var37 * var19 + var35);
                            var22.method3792((float) var37 * var20 + var36);
                            if (arg1.field10292 == 0) {
                                var22.method3786(var30, var31, var32, var33);
                            } else {
                                var22.method3781(var30, var31, var32, var33);
                            }
                            var22.method3792(0.0F);
                            var22.method3792(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3784();
        if (this.field7016.method882(6331)) {
            arg1.method2263(66, this.field7016, 0);
            arg1.method2263(68, this.field7008, 1);
            arg1.method2289(0, this.field7015);
            arg1.method2276(class34.field855, var4 * 2, this.field7013, 0, 0, var4 * 4, 118);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(BLwga;)V", line = 609)
    private final void method2965(byte arg0, class745 arg1) {
        if (arg0 != -33) {
            this.field7020 = null;
        }
        field7017++;
        class241.field3528 = arg1.field10207;
        arg1.method4081(8);
        arg1.method4106(false, arg0 + 89);
        arg1.method4156(-32, false);
        arg1.method4153(5);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 629)
    public static void method2966(int arg0) {
        field7019 = null;
        if (arg0 < 66) {
            method2966(127);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 641)
    public final void method2967(int arg0) {
        if (arg0 > -118) {
            field7019 = null;
        }
        field7012++;
        this.field7016.method878(23315);
    }
}
