import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class277 extends class425 {

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "[Lnga;")
    public class477[] field4141;

    @OriginalMember(owner = "client!caa", name = "r", descriptor = "[B")
    public byte[] field4147;

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "[B")
    public byte[] field4148;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "[Lee;")
    public class630[] field4143;

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "[I")
    private int[] field4146;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "[S")
    public short[] field4144;

    @OriginalMember(owner = "client!caa", name = "u", descriptor = "[B")
    public byte[] field4150;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!caa", name = "v", descriptor = "Lsb;")
    public static class266 field4151 = new class266(51, 4);

    @OriginalMember(owner = "client!caa", name = "x", descriptor = "Lsh;")
    public static class62 field4153 = new class62();

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!caa", name = "w", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILlk;)V")
    public static final void method1831(int arg0, class545 arg1) {
        if (arg1.field7649 == 5 && arg1.field7702 != -1) {
            class69.method775(arg1, 1, class623.field9017);
        }
        if (arg0 == 0) {
            field4142++;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public final void method1832(int arg0) {
        if (arg0 != 10078) {
            method1833(100, 60);
        }
        this.field4146 = null;
        field4152++;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)I")
    public static final int method1833(int arg0, int arg1) {
        field4145++;
        return arg0 == 0 ? arg1 >>> 8 : -10;
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
    public class277() {
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "([BLtu;I[I)Z")
    public final boolean method1834(byte[] arg0, class321 arg1, int arg2, int[] arg3) {
        field4140++;
        boolean var5 = true;
        int var6 = 0;
        class630 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field4146[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method2064(765854796, arg3, var9 >> 2);
                        } else {
                            var7 = arg1.method2059(arg3, var9 >> 2, (byte) -85);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4143[var8] = var7;
                        this.field4146[var8] = 0;
                    }
                }
            }
        }
        if (arg2 != 0) {
            field4153 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "(I)V")
    public static void method1835(int arg0) {
        field4153 = null;
        if (arg0 > -84) {
            method1833(-92, -122);
        }
        field4151 = null;
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "([B)V")
    public class277(byte[] arg0) {
        this.field4141 = new class477[128];
        this.field4147 = new byte[128];
        this.field4148 = new byte[128];
        this.field4143 = new class630[128];
        this.field4146 = new int[128];
        this.field4144 = new short[128];
        this.field4150 = new byte[128];
        class61 var2 = new class61(arg0);
        int var3;
        for (var3 = 0; var2.field1397[var2.field1393 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method710((byte) 43);
        }
        var3++;
        var2.field1393++;
        int var6 = var2.field1393;
        var2.field1393 += var3;
        int var7;
        for (var7 = 0; var2.field1397[var2.field1393 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method710((byte) 43);
        }
        var7++;
        var2.field1393++;
        int var10 = var2.field1393;
        var2.field1393 += var7;
        int var11;
        for (var11 = 0; var2.field1397[var2.field1393 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method710((byte) 43);
        }
        var11++;
        var2.field1393++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method732(-559537960);
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
        class477[] var19 = new class477[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class477 var103 = var19[var20] = new class477();
            int var104 = var2.method732(-559537960);
            if (var104 > 0) {
                var103.field6858 = new byte[var104 * 2];
            }
            int var105 = var2.method732(-559537960);
            if (var105 > 0) {
                var103.field6863 = new byte[var105 * 2 + 2];
                var103.field6863[1] = 64;
            }
        }
        int var21 = var2.method732(-559537960);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method732(-559537960);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field1397[var2.field1393 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method710((byte) 43);
        }
        var25++;
        var2.field1393++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method732(-559537960);
            this.field4144[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method732(-559537960);
            this.field4144[var31] = (short) (this.field4144[var31] + (var30 << 8));
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
                var34 = var2.method702(false);
            }
            this.field4144[var35] = (short) (this.field4144[var35] + (class481.method2919(2, var34 - 1) << 14));
            var32--;
            this.field4146[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4146[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field1397[var6++] - 1;
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                this.field4147[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4146[var43] != 0) {
                if (var41 == 0) {
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field1397[var10++] + 16 << 2;
                }
                var41--;
                this.field4148[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class477 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4146[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field4141[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length > var49) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field4146[var51] > 0) {
                    var50 = var2.method732(-559537960) + 1;
                }
            }
            this.field4150[var51] = (byte) var50;
            var48--;
        }
        this.field4139 = var2.method732(-559537960) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class477 var100 = var19[var52];
            if (var100.field6858 != null) {
                for (int var101 = 1; var101 < var100.field6858.length; var101 += 2) {
                    var100.field6858[var101] = var2.method710((byte) 43);
                }
            }
            if (var100.field6863 != null) {
                for (int var102 = 3; var102 < var100.field6863.length - 2; var102 += 2) {
                    var100.field6863[var102] = var2.method710((byte) 43);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method710((byte) 43);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method710((byte) 43);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class477 var97 = var19[var55];
            if (var97.field6863 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field6863.length; var99 += 2) {
                    var98 += var2.method732(-559537960) + 1;
                    var97.field6863[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class477 var94 = var19[var56];
            if (var94.field6858 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field6858.length; var96 += 2) {
                    var95 = var95 + var2.method732(-559537960) + 1;
                    var94.field6858[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method732(-559537960);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method732(-559537960) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4150[var61] = (byte) (this.field4150[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class656.method3732((byte) 94, var67, var65 - var59);
                    this.field4150[var68] = (byte) (this.field4150[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field4150[var64] = (byte) (this.field4150[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method732(-559537960);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method732(-559537960) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4148[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4148[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class656.method3732((byte) -87, var81, var79 - var72);
                    int var84 = (this.field4148[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4148[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field4148[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4148[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field6855 = var2.method732(-559537960);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class477 var93 = var19[var87];
            if (var93.field6858 != null) {
                var93.field6854 = var2.method732(-559537960);
            }
            if (var93.field6863 != null) {
                var93.field6859 = var2.method732(-559537960);
            }
            if (var93.field6855 > 0) {
                var93.field6852 = var2.method732(-559537960);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field6862 = var2.method732(-559537960);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class477 var92 = var19[var89];
            if (var92.field6862 > 0) {
                var92.field6861 = var2.method732(-559537960);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class477 var91 = var19[var90];
            if (var91.field6861 > 0) {
                var91.field6853 = var2.method732(-559537960);
            }
        }
    }
}
