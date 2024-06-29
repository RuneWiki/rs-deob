import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class247 {

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    private int field3604 = 65000;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Ljk;")
    private class183 field3609 = null;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Ljk;")
    private class183 field3601 = null;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field3606 = 0;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Z")
    public static boolean field3605 = false;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III[B)Z", line = 4)
    public final boolean method1678(int arg0, int arg1, int arg2, byte[] arg3) {
        field3611++;
        class183 var5 = this.field3601;
        synchronized (this.field3601) {
            if (arg2 < 0 || this.field3604 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1679((byte) -16, true, arg2, arg1, arg3);
            if (!var6) {
                var6 = this.method1679((byte) -16, false, arg2, arg1, arg3);
            }
            int var7 = 59 / ((-arg0 - 68) / 46);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BZII[B)Z", line = 30)
    private final boolean method1679(byte arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field3603++;
        class183 var6 = this.field3601;
        synchronized (this.field3601) {
            try {
                int var8;
                if (arg1) {
                    if (this.field3609.method1286(-93) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field3609.method1290(127, (long) (arg3 * 6));
                    this.field3609.method1300(6, 0, -1, class284.field3962);
                    var8 = (class284.field3962[5] & 0xFF) + ((class284.field3962[3] & 0xFF) << 16) + (class284.field3962[4] & 0xFF << 8);
                    if (var8 <= 0 || (this.field3601.method1286(-128) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3601.method1286(arg0 - 112) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class284.field3962[3] = (byte) (var8 >> 16);
                class284.field3962[0] = (byte) (arg2 >> 16);
                if (arg0 != -16) {
                    method1681(-127, 15);
                }
                class284.field3962[4] = (byte) (var8 >> 8);
                class284.field3962[5] = (byte) var8;
                class284.field3962[2] = (byte) arg2;
                class284.field3962[1] = (byte) (arg2 >> 8);
                this.field3609.method1290(arg0 ^ 0xFFFFFF8F, (long) (arg3 * 6));
                this.field3609.method1287(0, 6, false, class284.field3962);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg2) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field3601.method1290(127, (long) (var8 * 520));
                            try {
                                this.field3601.method1300(8, 0, -1, class284.field3962);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class284.field3962[0] & 0xFF << 8) + (class284.field3962[1] & 0xFF);
                            int var14 = ((class284.field3962[2] & 0xFF) << 8) + (class284.field3962[3] & 0xFF);
                            var12 = (class284.field3962[4] & 0xFF << 16) + (class284.field3962[6] & 0xFF) + ((class284.field3962[5] & 0xFF) << 8);
                            int var15 = class284.field3962[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field3610 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field3601.method1286(-101) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3601.method1286(-103) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class284.field3962[1] = (byte) arg3;
                    class284.field3962[0] = (byte) (arg3 >> 8);
                    class284.field3962[2] = (byte) (var11 >> 8);
                    class284.field3962[3] = (byte) var11;
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class284.field3962[7] = (byte) this.field3610;
                    class284.field3962[4] = (byte) (var12 >> 16);
                    class284.field3962[6] = (byte) var12;
                    class284.field3962[5] = (byte) (var12 >> 8);
                    this.field3601.method1290(127, (long) (var8 * 520));
                    this.field3601.method1287(0, 8, false, class284.field3962);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3601.method1287(var10, var18, false, arg4);
                    var8 = var12;
                    var11++;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[B", line = 148)
    public final byte[] method1680(int arg0, int arg1) {
        field3607++;
        class183 var3 = this.field3601;
        synchronized (this.field3601) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3609.method1286(-117)) {
                    return null;
                }
                this.field3609.method1290(127, (long) (arg0 * 6));
                this.field3609.method1300(6, 0, -1, class284.field3962);
                if (arg1 >= -27) {
                    this.method1679((byte) -50, false, 59, 73, null);
                }
                int var5 = (class284.field3962[2] & 0xFF) + (class284.field3962[1] & 0xFF << 8) + (class284.field3962[0] & 0xFF << 16);
                int var6 = (class284.field3962[3] & 0xFF << 16) + (class284.field3962[5] & 0xFF) + (class284.field3962[4] & 0xFF << 8);
                if (var5 < 0 || var5 > this.field3604) {
                    return null;
                } else if (var6 > 0 && this.field3601.method1286(-101) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3601.method1290(127, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3601.method1300(var13 + 8, 0, -1, class284.field3962);
                        int var14 = (class284.field3962[0] & 0xFF << 8) + (class284.field3962[1] & 0xFF);
                        int var15 = (class284.field3962[2] & 0xFF << 8) + (class284.field3962[3] & 0xFF);
                        int var16 = ((class284.field3962[4] & 0xFF) << 16) + (class284.field3962[5] & 0xFF << 8) + (class284.field3962[6] & 0xFF);
                        int var17 = class284.field3962[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field3610 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field3601.method1286(-115) / 520L)) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class284.field3962[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(ILjk;Ljk;I)V", line = 1063)
    public class247(int arg0, class183 arg1, class183 arg2, int arg3) {
        this.field3609 = arg2;
        this.field3604 = arg3;
        this.field3610 = arg0;
        this.field3601 = arg1;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)V", line = 237)
    public static final void method1681(int arg0, int arg1) {
        field3608++;
        if (class132.field1827 == arg0) {
            return;
        }
        class184.field2546 = class240.field3555 = class429.field6180[arg0];
        class200.method1418(true);
        class21.field196 = new int[class184.field2546][class240.field3555];
        class558.field8115 = new int[class184.field2546][class240.field3555];
        class742.field10347 = new int[4][class184.field2546 >> 3][class240.field3555 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class6.field57[var2] = class449.method2746(class184.field2546, class240.field3555, 6);
        }
        class651.field9345 = new byte[4][class184.field2546][class240.field3555];
        class650.method3745(class240.field3555, class184.field2546, (byte) 54, 4);
        class349.method2228(class211.field3164, (byte) -74, class240.field3555 >> 3, class184.field2546 >> 3);
        class132.field1827 = arg0;
        if (arg1 != 1541132643) {
            method1681(24, -25);
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)[[[B", line = 269)
    public static final byte[][][] method1682(int arg0, int arg1) {
        field3600++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var7 >= var132) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
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
                if ((var19 >> 1) >= var128) {
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
                    if (var127 >= (var22 << 1)) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= (var34 << 1)) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var37 >> 1 >= var122) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= (var40 << 1)) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= var43 >> 1) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= var46 << 1) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= var49 >> 1) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
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
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if ((var58 << 1) >= var115) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= (var61 >> 1)) {
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
                if (var113 <= (var64 << 1)) {
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
                if (var3 / 2 >= var112) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var4 / 2 >= var70) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= (var3 / 2)) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if ((var4 / 2) <= var76) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= (var79 - (var4 / 2))) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= (var82 - (var4 / 2))) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - (var4 / 2) >= var106) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var88 - (var4 / 2) >= var105) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var91 - (var4 / 2))) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[arg1][0] = var90;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= (var94 - (var4 / 2))) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var97 - (var4 / 2))) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - (var4 / 2) <= var101) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!lp", name = "toString", descriptor = "()Ljava/lang/String;", line = 1045)
    public final String toString() {
        field3602++;
        return "Cache:" + this.field3610;
    }
}
