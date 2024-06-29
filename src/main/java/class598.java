import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class598 extends class389 {

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "[F")
    public static float[] field8499 = new float[4];

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "F")
    public float field8475;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "F")
    public float field8476;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "F")
    public float field8481;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "F")
    public float field8484;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "F")
    public float field8488;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "F")
    public float field8491;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "F")
    public float field8493;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "F")
    public float field8494;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "F")
    public float field8497;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "F")
    public float field8501;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "F")
    public float field8502;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "F")
    public float field8503;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "[I")
    public static int[] field8504;

    @OriginalMember(owner = "client!pb", name = "GA", descriptor = "(III)V")
    public final void method228(int arg0, int arg1, int arg2) {
        this.field8475 = this.field8484 = this.field8491 = this.field8502 = this.field8494 = this.field8501 = 0.0F;
        field8485++;
        this.field8481 = arg2;
        this.field8493 = arg0;
        this.field8497 = this.field8476 = this.field8503 = 1.0F;
        this.field8488 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III[I)V")
    public final void method236(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field8494 + (float) arg0 * this.field8497 + (float) arg1 * this.field8491 + this.field8493);
        arg3[1] = (int) ((float) arg2 * this.field8501 + (float) arg0 * this.field8475 + (float) arg1 * this.field8476 + this.field8488);
        arg3[2] = (int) ((float) arg2 * this.field8503 + (float) arg0 * this.field8484 + (float) arg1 * this.field8502 + this.field8481);
        field8477++;
    }

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "(III[I)V")
    public final void method230(int arg0, int arg1, int arg2, int[] arg3) {
        field8479++;
        arg3[1] = (int) ((float) arg2 * this.field8501 + (float) arg0 * this.field8475 + (float) arg1 * this.field8476);
        arg3[2] = (int) ((float) arg2 * this.field8503 + (float) arg0 * this.field8484 + (float) arg1 * this.field8502);
        arg3[0] = (int) ((float) arg2 * this.field8494 + (float) arg0 * this.field8497 + (float) arg1 * this.field8491);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lq;")
    public final class389 method224() {
        field8500++;
        class598 var1 = new class598();
        var1.field8502 = this.field8502;
        var1.field8481 = this.field8481;
        var1.field8501 = this.field8501;
        var1.field8494 = this.field8494;
        var1.field8503 = this.field8503;
        var1.field8491 = this.field8491;
        var1.field8484 = this.field8484;
        var1.field8497 = this.field8497;
        var1.field8493 = this.field8493;
        var1.field8476 = this.field8476;
        var1.field8475 = this.field8475;
        var1.field8488 = this.field8488;
        return var1;
    }

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "([I)V")
    public final void method234(int[] arg0) {
        field8498++;
        float var2 = (float) arg0[0] - this.field8493;
        float var3 = (float) arg0[1] - this.field8488;
        float var4 = (float) arg0[2] - this.field8481;
        arg0[2] = (int) (this.field8503 * var4 + this.field8501 * var3 + this.field8494 * var2);
        arg0[1] = (int) (this.field8502 * var4 + this.field8491 * var2 + this.field8476 * var3);
        arg0[0] = (int) (this.field8484 * var4 + this.field8497 * var2 + this.field8475 * var3);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)[F")
    public final float[] method3342(byte arg0) {
        class387.field5177[1] = this.field8475;
        field8489++;
        class387.field5177[2] = this.field8484;
        class387.field5177[0] = this.field8497;
        class387.field5177[6] = this.field8502;
        class387.field5177[12] = this.field8493;
        class387.field5177[10] = this.field8503;
        class387.field5177[14] = this.field8481;
        class387.field5177[8] = this.field8494;
        class387.field5177[4] = this.field8491;
        class387.field5177[5] = this.field8476;
        class387.field5177[9] = this.field8501;
        if (arg0 < 91) {
            return null;
        } else {
            class387.field5177[13] = this.field8488;
            return class387.field5177;
        }
    }

    @OriginalMember(owner = "client!pb", name = "la", descriptor = "(Lq;)V")
    public final void method233(class389 arg0) {
        field8490++;
        class598 var2 = (class598) arg0;
        this.field8475 = var2.field8475;
        this.field8491 = var2.field8491;
        this.field8502 = var2.field8502;
        this.field8484 = var2.field8484;
        this.field8481 = var2.field8481;
        this.field8503 = var2.field8503;
        this.field8501 = var2.field8501;
        this.field8476 = var2.field8476;
        this.field8493 = var2.field8493;
        this.field8488 = var2.field8488;
        this.field8494 = var2.field8494;
        this.field8497 = var2.field8497;
    }

    @OriginalMember(owner = "client!pb", name = "XA", descriptor = "(I)V")
    public final void method226(int arg0) {
        this.field8497 = 1.0F;
        field8473++;
        this.field8476 = this.field8503 = class264.field3340[arg0 & 0x3FFF];
        this.field8502 = class264.field3341[arg0 & 0x3FFF];
        this.field8491 = this.field8494 = this.field8493 = this.field8475 = this.field8488 = this.field8484 = this.field8481 = 0.0F;
        this.field8501 = -this.field8502;
    }

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "(I)V")
    public final void method229(int arg0) {
        field8478++;
        float var2 = class264.field3340[arg0 & 0x3FFF];
        float var3 = class264.field3341[arg0 & 0x3FFF];
        float var4 = this.field8475;
        float var5 = this.field8476;
        float var6 = this.field8501;
        float var7 = this.field8488;
        this.field8475 = var2 * var4 - (this.field8484 * var3);
        this.field8484 = this.field8484 * var2 + var3 * var4;
        this.field8476 = var2 * var5 - (this.field8502 * var3);
        this.field8501 = var2 * var6 - (this.field8503 * var3);
        this.field8502 = this.field8502 * var2 + var3 * var5;
        this.field8503 = this.field8503 * var2 + var3 * var6;
        this.field8488 = var2 * var7 - this.field8481 * var3;
        this.field8481 = this.field8481 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!pb", name = "ra", descriptor = "(I)V")
    public final void method231(int arg0) {
        this.field8503 = 1.0F;
        field8492++;
        this.field8497 = this.field8476 = class264.field3340[arg0 & 0x3FFF];
        this.field8475 = class264.field3341[arg0 & 0x3FFF];
        this.field8491 = -this.field8475;
        this.field8494 = this.field8493 = this.field8501 = this.field8488 = this.field8484 = this.field8502 = this.field8481 = 0.0F;
    }

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "()V")
    public final void method232() {
        this.field8497 = this.field8476 = this.field8503 = 1.0F;
        field8495++;
        this.field8475 = this.field8484 = this.field8491 = this.field8502 = this.field8494 = this.field8501 = this.field8493 = this.field8488 = this.field8481 = 0.0F;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lq;B)V")
    public final void method3343(class389 arg0, byte arg1) {
        field8483++;
        class598 var3 = (class598) arg0;
        this.field8491 = var3.field8475;
        this.field8497 = var3.field8497;
        this.field8494 = var3.field8484;
        if (arg1 != -94) {
            this.method3347(-106);
        }
        this.field8476 = var3.field8476;
        this.field8501 = var3.field8502;
        this.field8484 = var3.field8494;
        this.field8475 = var3.field8491;
        this.field8493 = -(this.field8494 * var3.field8481 + this.field8497 * var3.field8493 + this.field8491 * var3.field8488);
        this.field8503 = var3.field8503;
        this.field8502 = var3.field8501;
        this.field8488 = -(this.field8501 * var3.field8481 + this.field8476 * var3.field8488 + this.field8475 * var3.field8493);
        this.field8481 = -(this.field8503 * var3.field8481 + this.field8502 * var3.field8488 + this.field8484 * var3.field8493);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method3344(int arg0) {
        field8499 = null;
        field8504 = null;
        if (arg0 != 18242) {
            method3344(-123);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)[[[B")
    public static final byte[][][] method3345(boolean arg0, int arg1) {
        field8487++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var13) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= var19 >> 1) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var20.length > var21) {
                    if (var22 << 1 <= var127) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= (var25 >> 1)) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 >= var28 << 1) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= var34 << 1) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= (var37 >> 1)) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= var40 << 1) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var43 >> 1) <= var120) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var46 << 1 >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= (var52 << 1)) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var116 >= (var55 >> 1)) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= (var58 << 1)) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var61 >> 1 <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= var64 << 1) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= (var3 / 2)) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= (var4 / 2)) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= (var3 / 2)) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= (var4 / 2)) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var79 - (var4 / 2) >= var108) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - (var4 / 2)) >= var107) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - (var4 / 2) >= var106) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= (var88 - (var4 / 2))) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        if (arg0) {
            method3344(-94);
        }
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var91 - var4 / 2)) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if ((var94 - (var4 / 2)) <= var103) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var97 - var4 / 2 <= var102) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= (var100 - (var4 / 2))) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method3346(String arg0, boolean arg1) {
        field8480++;
        if (class556.field7916.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class556.field7916.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class556.field7916.startsWith("mac")) {
            return "lib" + arg0 + ".jnilib";
        } else {
            if (arg1) {
                method3344(-66);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "pa", descriptor = "(IIIIII)V")
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8486++;
        float var7 = class264.field3340[arg3 & 0x3FFF];
        float var8 = class264.field3341[arg3 & 0x3FFF];
        float var9 = class264.field3340[arg4 & 0x3FFF];
        float var10 = class264.field3341[arg4 & 0x3FFF];
        float var11 = class264.field3340[arg5 & 0x3FFF];
        float var12 = class264.field3341[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field8502 = -var8;
        this.field8484 = var7 * var10;
        this.field8494 = -var10 * var11 + var9 * var14;
        this.field8491 = var7 * var12;
        this.field8503 = var7 * var9;
        this.field8475 = -var9 * var12 + var10 * var13;
        this.field8476 = var7 * var11;
        this.field8501 = var9 * var13 + var10 * var12;
        this.field8497 = var9 * var11 + var10 * var14;
        this.field8481 = (float) (-arg0) * this.field8484 - ((float) arg1 * this.field8502) - (float) arg2 * this.field8503;
        this.field8493 = (float) (-arg0) * this.field8497 - ((float) arg1 * this.field8491) - (float) arg2 * this.field8494;
        this.field8488 = (float) (-arg0) * this.field8475 - (float) arg1 * this.field8476 - (float) arg2 * this.field8501;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public final void method225(int arg0) {
        field8471++;
        this.field8476 = 1.0F;
        this.field8497 = this.field8503 = class264.field3340[arg0 & 0x3FFF];
        this.field8494 = class264.field3341[arg0 & 0x3FFF];
        this.field8491 = this.field8493 = this.field8475 = this.field8501 = this.field8488 = this.field8502 = this.field8481 = 0.0F;
        this.field8484 = -this.field8494;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)[F")
    public final float[] method3347(int arg0) {
        field8482++;
        class387.field5177[4] = this.field8491;
        class387.field5177[5] = this.field8476;
        class387.field5177[13] = 0.0F;
        class387.field5177[12] = 0.0F;
        class387.field5177[8] = this.field8494;
        class387.field5177[2] = this.field8484;
        class387.field5177[9] = this.field8501;
        class387.field5177[14] = arg0;
        class387.field5177[10] = this.field8503;
        class387.field5177[6] = this.field8502;
        class387.field5177[1] = this.field8475;
        class387.field5177[0] = this.field8497;
        return class387.field5177;
    }

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "(III)V")
    public final void method235(int arg0, int arg1, int arg2) {
        field8472++;
        this.field8481 += arg2;
        this.field8488 += arg1;
        this.field8493 += arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIFFFZI)V")
    public final void method3348(int arg0, int arg1, float arg2, float arg3, float arg4, boolean arg5, int arg6) {
        if (arg0 == 0) {
            this.field8503 = 1.0F;
            this.field8475 = this.field8484 = this.field8491 = this.field8502 = this.field8494 = this.field8501 = 0.0F;
            this.field8476 = arg1;
            this.field8497 = arg6;
        } else {
            float var8 = class264.field3340[arg0 & 0x3FFF];
            float var9 = class264.field3341[arg0 & 0x3FFF];
            this.field8503 = 1.0F;
            this.field8497 = (float) arg6 * var8;
            this.field8475 = (float) arg6 * var9;
            this.field8476 = (float) arg1 * var8;
            this.field8484 = this.field8502 = this.field8494 = this.field8501 = 0.0F;
            this.field8491 = (float) arg1 * -var9;
        }
        field8496++;
        this.field8493 = arg3;
        this.field8488 = arg4;
        this.field8481 = arg2;
        if (arg5) {
            this.field8488 = -0.24248552F;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class598() {
        this.method232();
    }

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "(I)V")
    public final void method237(int arg0) {
        field8474++;
        float var2 = class264.field3340[arg0 & 0x3FFF];
        float var3 = class264.field3341[arg0 & 0x3FFF];
        float var4 = this.field8497;
        float var5 = this.field8491;
        float var6 = this.field8494;
        float var7 = this.field8493;
        this.field8497 = this.field8484 * var3 + var2 * var4;
        this.field8484 = this.field8484 * var2 - (var3 * var4);
        this.field8491 = this.field8502 * var3 + var2 * var5;
        this.field8494 = this.field8503 * var3 + var2 * var6;
        this.field8502 = this.field8502 * var2 - var3 * var5;
        this.field8493 = this.field8481 * var3 + var2 * var7;
        this.field8503 = this.field8503 * var2 - var3 * var6;
        this.field8481 = this.field8481 * var2 - (var3 * var7);
    }
}
