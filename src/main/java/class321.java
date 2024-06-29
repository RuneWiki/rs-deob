import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class321 {

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "[[Lqca;")
    private class126[][] field4548 = new class126[64][768];

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "[I")
    private int[] field4556 = new int[8191];

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "[[Lqca;")
    private class126[][] field4558 = new class126[1600][64];

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
    private int field4557 = 0;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
    private int[] field4549 = new int[1600];

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "[I")
    private int[] field4562 = new int[64];

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "Leda;")
    private class110 field4550;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "Lkm;")
    private class373 field4561;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "Lkm;")
    private class373 field4547;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "Lra;")
    private class118 field4555;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILee;)V", line = 4)
    private final void method2075(int arg0, class703 arg1) {
        arg1.method3849((byte) 54, true);
        field4553++;
        if (arg0 > -120) {
            this.field4562 = null;
        }
        arg1.method3885(true, (byte) -81);
        if (class545.field7532 != arg1.field9579) {
            arg1.method468(class545.field7532);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILee;I)V", line = 21)
    private final void method2076(int arg0, class703 arg1, int arg2) {
        field4559++;
        int var4 = 0;
        class532 var5 = arg1.method3841(arg2 ^ 0xFFFFE40F);
        float var6 = var5.field7384;
        float var7 = var5.field7350;
        float var8 = var5.field7341;
        float var9 = var5.field7371;
        float var10 = var5.field7357;
        float var11 = var5.field7376;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field4561.method2338(true, false);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method3889(arg2 ^ arg2, var21);
        if (Stream.method3798()) {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field4549[var23] <= 64 ? this.field4549[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class126 var38 = this.field4558[var23][var25];
                        int var39 = var38.field1727;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field1725 >> 12);
                        float var45 = (float) (var38.field1729 >> 12);
                        float var46 = (float) (var38.field1730 >> 12);
                        int var47 = var38.field1726 >> 12;
                        var22.method3800((float) (-var47) * var12 + var44);
                        var22.method3800((float) (-var47) * var13 + var45);
                        var22.method3800((float) (-var47) * var14 + var46);
                        if (arg1.field9591 == 0) {
                            var22.method3806(var40, var41, var42, var43);
                        } else {
                            var22.method3803(var40, var41, var42, var43);
                        }
                        var22.method3800(0.0F);
                        var22.method3800(0.0F);
                        var22.method3800((float) var47 * var15 + var44);
                        var22.method3800((float) var47 * var16 + var45);
                        var22.method3800((float) var47 * var17 + var46);
                        if (arg1.field9591 == 0) {
                            var22.method3806(var40, var41, var42, var43);
                        } else {
                            var22.method3803(var40, var41, var42, var43);
                        }
                        var22.method3800(1.0F);
                        var22.method3800(0.0F);
                        var22.method3800((float) var47 * var12 + var44);
                        var22.method3800((float) var47 * var13 + var45);
                        var22.method3800((float) var47 * var14 + var46);
                        if (arg1.field9591 == 0) {
                            var22.method3806(var40, var41, var42, var43);
                        } else {
                            var22.method3803(var40, var41, var42, var43);
                        }
                        var22.method3800(1.0F);
                        var22.method3800(1.0F);
                        var22.method3800((float) var47 * var18 + var44);
                        var22.method3800((float) var47 * var19 + var45);
                        var22.method3800((float) var47 * var20 + var46);
                        if (arg1.field9591 == 0) {
                            var22.method3806(var40, var41, var42, var43);
                        } else {
                            var22.method3803(var40, var41, var42, var43);
                        }
                        var22.method3800(0.0F);
                        var4++;
                        var22.method3800(1.0F);
                    }
                    if (this.field4549[var23] > 64) {
                        int var26 = this.field4549[var23] - 64 - 1;
                        for (int var27 = this.field4562[var26] - 1; var27 >= 0; var27--) {
                            class126 var28 = this.field4548[var26][var27];
                            int var29 = var28.field1727;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field1725 >> 12);
                            float var35 = (float) (var28.field1729 >> 12);
                            float var36 = (float) (var28.field1730 >> 12);
                            int var37 = var28.field1726 >> 12;
                            var22.method3800((float) (-var37) * var12 + var34);
                            var22.method3800((float) (-var37) * var13 + var35);
                            var22.method3800((float) (-var37) * var14 + var36);
                            if (arg1.field9591 == 0) {
                                var22.method3806(var30, var31, var32, var33);
                            } else {
                                var22.method3803(var30, var31, var32, var33);
                            }
                            var22.method3800(0.0F);
                            var22.method3800(0.0F);
                            var22.method3800((float) var37 * var15 + var34);
                            var22.method3800((float) var37 * var16 + var35);
                            var22.method3800((float) var37 * var17 + var36);
                            if (arg1.field9591 == 0) {
                                var22.method3806(var30, var31, var32, var33);
                            } else {
                                var22.method3803(var30, var31, var32, var33);
                            }
                            var22.method3800(1.0F);
                            var22.method3800(0.0F);
                            var22.method3800((float) var37 * var12 + var34);
                            var22.method3800((float) var37 * var13 + var35);
                            var22.method3800((float) var37 * var14 + var36);
                            if (arg1.field9591 == 0) {
                                var22.method3806(var30, var31, var32, var33);
                            } else {
                                var22.method3803(var30, var31, var32, var33);
                            }
                            var22.method3800(1.0F);
                            var22.method3800(1.0F);
                            var22.method3800((float) var37 * var18 + var34);
                            var22.method3800((float) var37 * var19 + var35);
                            var22.method3800((float) var37 * var20 + var36);
                            if (arg1.field9591 == 0) {
                                var22.method3806(var30, var31, var32, var33);
                            } else {
                                var22.method3803(var30, var31, var32, var33);
                            }
                            var22.method3800(0.0F);
                            var4++;
                            var22.method3800(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field4549[var48] <= 64 ? this.field4549[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class126 var63 = this.field4558[var48][var50];
                        int var64 = var63.field1727;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field1725 >> 12);
                        float var70 = (float) (var63.field1729 >> 12);
                        float var71 = (float) (var63.field1730 >> 12);
                        int var72 = var63.field1726 >> 12;
                        var22.method3809((float) (-var72) * var12 + var69);
                        var22.method3809((float) (-var72) * var13 + var70);
                        var22.method3809((float) (-var72) * var14 + var71);
                        if (arg1.field9591 == 0) {
                            var22.method3806(var65, var66, var67, var68);
                        } else {
                            var22.method3803(var65, var66, var67, var68);
                        }
                        var22.method3809(0.0F);
                        var22.method3809(0.0F);
                        var22.method3809((float) var72 * var15 + var69);
                        var22.method3809((float) var72 * var16 + var70);
                        var22.method3809((float) var72 * var17 + var71);
                        if (arg1.field9591 == 0) {
                            var22.method3806(var65, var66, var67, var68);
                        } else {
                            var22.method3803(var65, var66, var67, var68);
                        }
                        var22.method3809(1.0F);
                        var22.method3809(0.0F);
                        var22.method3809((float) var72 * var12 + var69);
                        var22.method3809((float) var72 * var13 + var70);
                        var22.method3809((float) var72 * var14 + var71);
                        if (arg1.field9591 == 0) {
                            var22.method3806(var65, var66, var67, var68);
                        } else {
                            var22.method3803(var65, var66, var67, var68);
                        }
                        var22.method3809(1.0F);
                        var22.method3809(1.0F);
                        var22.method3809((float) var72 * var18 + var69);
                        var22.method3809((float) var72 * var19 + var70);
                        var22.method3809((float) var72 * var20 + var71);
                        if (arg1.field9591 == 0) {
                            var22.method3806(var65, var66, var67, var68);
                        } else {
                            var22.method3803(var65, var66, var67, var68);
                        }
                        var22.method3809(0.0F);
                        var4++;
                        var22.method3809(1.0F);
                    }
                    if (this.field4549[var48] > 64) {
                        int var51 = this.field4549[var48] - 1 - 64;
                        for (int var52 = this.field4562[var51] - 1; var52 >= 0; var52--) {
                            class126 var53 = this.field4548[var51][var52];
                            int var54 = var53.field1727;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field1725 >> 12);
                            float var60 = (float) (var53.field1729 >> 12);
                            float var61 = (float) (var53.field1730 >> 12);
                            int var62 = var53.field1726 >> 12;
                            var22.method3809((float) (-var62) * var12 + var59);
                            var22.method3809((float) (-var62) * var13 + var60);
                            var22.method3809((float) (-var62) * var14 + var61);
                            if (arg1.field9591 == 0) {
                                var22.method3806(var55, var56, var57, var58);
                            } else {
                                var22.method3803(var55, var56, var57, var58);
                            }
                            var22.method3809(0.0F);
                            var22.method3809(0.0F);
                            var22.method3809((float) var62 * var15 + var59);
                            var22.method3809((float) var62 * var16 + var60);
                            var22.method3809((float) var62 * var17 + var61);
                            if (arg1.field9591 == 0) {
                                var22.method3806(var55, var56, var57, var58);
                            } else {
                                var22.method3803(var55, var56, var57, var58);
                            }
                            var22.method3809(1.0F);
                            var22.method3809(0.0F);
                            var22.method3809((float) var62 * var12 + var59);
                            var22.method3809((float) var62 * var13 + var60);
                            var22.method3809((float) var62 * var14 + var61);
                            if (arg1.field9591 == 0) {
                                var22.method3806(var55, var56, var57, var58);
                            } else {
                                var22.method3803(var55, var56, var57, var58);
                            }
                            var22.method3809(1.0F);
                            var22.method3809(1.0F);
                            var22.method3809((float) var62 * var18 + var59);
                            var22.method3809((float) var62 * var19 + var60);
                            var22.method3809((float) var62 * var20 + var61);
                            if (arg1.field9591 == 0) {
                                var22.method3806(var55, var56, var57, var58);
                            } else {
                                var22.method3803(var55, var56, var57, var58);
                            }
                            var22.method3809(0.0F);
                            var4++;
                            var22.method3809(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3797();
        if (this.field4561.method2337(6544)) {
            arg1.method2818(false, this.field4561, 0);
            arg1.method2818(false, this.field4547, 1);
            arg1.method2816((byte) 86, this.field4550);
            arg1.method2820(var4 * 2, 0, -13847, var4 * 4, class356.field5191, 0, this.field4555);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)[I", line = 411)
    public static final int[] method2077(boolean arg0) {
        if (arg0) {
            field4546++;
            return new int[] { class728.field9886, class290.field4141, class125.field1720 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lee;BI)V", line = 422)
    private final void method2078(class703 arg0, byte arg1, int arg2) {
        if (arg1 != 74) {
            this.field4558 = null;
        }
        class545.field7532 = arg0.field9579;
        field4554++;
        arg0.method3843(arg1 ^ 0x2F, (float) arg2);
        arg0.method3904(6444);
        arg0.method3885(false, (byte) -81);
        arg0.method3849((byte) 54, false);
        arg0.method3880(8);
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lee;)V", line = 664)
    public class321(class703 arg0) {
        this.field4550 = arg0.method2791(new class92[] { new class92(new class382[] { class382.field5542, class382.field5550, class382.field5552 }), new class92(class382.field5546) }, false);
        this.field4561 = arg0.method2795(0, true);
        this.field4547 = arg0.method2795(0, false);
        this.field4547.method2339(393168, -32754, 12);
        this.field4555 = arg0.method2813(false, (byte) -120);
        this.field4555.method850(-8165, 49146);
        Buffer var2 = this.field4555.method847(-116, true);
        if (var2 != null) {
            Stream var3 = arg0.method3889(0, var2);
            if (Stream.method3798()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3795(var7);
                    var3.method3795(var7 + 1);
                    var3.method3795(var7 + 2);
                    var3.method3795(var7 + 2);
                    var3.method3795(var7 + 3);
                    var3.method3795(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3804(var5);
                    var3.method3804(var5 + 1);
                    var3.method3804(var5 + 2);
                    var3.method3804(var5 + 2);
                    var3.method3804(var5 + 3);
                    var3.method3804(var5);
                }
            }
            var3.method3797();
            this.field4555.method849(18579);
        }
        Buffer var8 = this.field4547.method2338(true, false);
        if (var8 != null) {
            Stream var9 = arg0.method3889(0, var8);
            if (Stream.method3798()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3800(0.0F);
                    var9.method3800(-1.0F);
                    var9.method3800(0.0F);
                    var9.method3800(0.0F);
                    var9.method3800(-1.0F);
                    var9.method3800(0.0F);
                    var9.method3800(0.0F);
                    var9.method3800(-1.0F);
                    var9.method3800(0.0F);
                    var9.method3800(0.0F);
                    var9.method3800(-1.0F);
                    var9.method3800(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3809(0.0F);
                    var9.method3809(-1.0F);
                    var9.method3809(0.0F);
                    var9.method3809(0.0F);
                    var9.method3809(-1.0F);
                    var9.method3809(0.0F);
                    var9.method3809(0.0F);
                    var9.method3809(-1.0F);
                    var9.method3809(0.0F);
                    var9.method3809(0.0F);
                    var9.method3809(-1.0F);
                    var9.method3809(0.0F);
                }
            }
            var9.method3797();
            this.field4547.method2337(6544);
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(ILee;)V", line = 447)
    private final void method2079(int arg0, class703 arg1) {
        field4560++;
        class545.field7532 = arg1.field9579;
        arg1.method3844(2);
        arg1.method3885(false, (byte) -81);
        arg1.method3849((byte) 54, false);
        if (arg0 == -1) {
            arg1.method3880(arg0 ^ 0xFFFFFFF7);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILee;ILtv;)V", line = 462)
    public final void method2080(int arg0, class703 arg1, int arg2, class586 arg3) {
        field4563++;
        if (arg1.field9502 == null) {
            return;
        }
        if (arg0 < 0) {
            this.method2079(-1, arg1);
        } else {
            this.method2078(arg1, (byte) 74, arg0);
        }
        if (arg2 != 6360) {
            return;
        }
        float var5 = arg1.field9502.field7368;
        float var6 = arg1.field9502.field7355;
        float var7 = arg1.field9502.field7374;
        float var8 = arg1.field9502.field7358;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class455 var12 = arg3.field7972.field4051;
            for (class455 var13 = var12.field6516; var13 != var12; var13 = var13.field6516) {
                class126 var14 = (class126) var13;
                int var15 = (int) ((float) (var14.field1730 >> 12) * var7 + (float) (var14.field1729 >> 12) * var6 + (float) (var14.field1725 >> 12) * var5 + var8);
                this.field4556[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = class436.method2617(var16, 4) + 1 - class311.field4404;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            int var18 = 0;
            class455 var19 = var12.field6516;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field4557 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4549[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4562[var24] = 0;
                }
                while (var12 != var19) {
                    class126 var25 = (class126) var19;
                    if (var22) {
                        var20 = var25.field1733;
                        var22 = false;
                        var21 = var25.field1728;
                    }
                    if (var18 > 0 && (var25.field1733 != var20 || var25.field1728 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4556[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4549[var26] >= 64) {
                            label103: {
                                if (this.field4549[var26] == 64) {
                                    if (this.field4557 == 64) {
                                        break label103;
                                    }
                                    this.field4549[var26] += this.field4557++ + 1;
                                }
                                this.field4548[this.field4549[var26] - 64 - 1][this.field4562[this.field4549[var26] - 1 - 64]++] = var25;
                            }
                        } else {
                            this.field4558[var26][this.field4549[var26]++] = var25;
                        }
                    }
                    var19 = var19.field6516;
                }
                arg1.method3863(false, var20 < 0 ? -1 : var20, 27016, false);
                if (var21 && class545.field7532 != arg1.field9579) {
                    arg1.method468(class545.field7532);
                } else if (arg1.field9579 != 1.0F) {
                    arg1.method468(1.0F);
                }
                this.method2076(var16, arg1, arg2 - 6360);
            }
        } catch (Exception var27) {
        }
        this.method2075(-125, arg1);
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(ILee;)V", line = 624)
    public final void method2081(int arg0, class703 arg1) {
        this.field4561.method2339(786336, -32754, 24);
        field4551++;
        if (arg0 != 64) {
            this.method2078(null, (byte) -73, 45);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V", line = 651)
    public final void method2082(byte arg0) {
        field4552++;
        if (arg0 >= -125) {
            this.method2081(-67, null);
        }
        this.field4561.method851(-21765);
    }
}
