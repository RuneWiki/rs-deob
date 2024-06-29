import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class287 extends class86 {

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "[B")
    public byte[] field4100;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "[Lpa;")
    public class238[] field4101;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "[Lhh;")
    public class80[] field4099;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "[B")
    public byte[] field4097;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "[I")
    private int[] field4098;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "[S")
    public short[] field4102;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "[B")
    public byte[] field4094;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "Lgn;")
    public static class475 field4092 = new class475(12, 8);

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
    public static int field4103 = 0;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(B)V", line = 6)
    public static void method1735(byte arg0) {
        if (arg0 == -80) {
            field4092 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "([ILii;I[B)Z", line = 20)
    public final boolean method1736(int[] arg0, class371 arg1, int arg2, byte[] arg3) {
        field4096++;
        boolean var5 = true;
        int var6 = 0;
        class80 var7 = null;
        int var8 = 0;
        if (arg2 != -18223) {
            this.field4095 = -12;
        }
        while (var8 < 128) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field4098[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method2256(arg0, var9 >> 2, false);
                        } else {
                            var7 = arg1.method2261(arg0, var9 >> 2, 11058);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4099[var8] = var7;
                        this.field4098[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)V", line = 79)
    public final void method1737(boolean arg0) {
        this.field4098 = null;
        if (arg0) {
            method1735((byte) -67);
        }
        field4093++;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V", line = 104)
    public class287() {
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "([B)V", line = 110)
    public class287(byte[] arg0) {
        this.field4100 = new byte[128];
        this.field4101 = new class238[128];
        this.field4099 = new class80[128];
        this.field4097 = new byte[128];
        this.field4098 = new int[128];
        this.field4102 = new short[128];
        this.field4094 = new byte[128];
        class156 var2 = new class156(arg0);
        int var3;
        for (var3 = 0; var2.field2041[var2.field2018 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method946(51);
        }
        var3++;
        var2.field2018++;
        int var6 = var2.field2018;
        var2.field2018 += var3;
        int var7;
        for (var7 = 0; var2.field2041[var2.field2018 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method946(64);
        }
        var7++;
        var2.field2018++;
        int var10 = var2.field2018;
        var2.field2018 += var7;
        int var11;
        for (var11 = 0; var2.field2041[var2.field2018 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method946(104);
        }
        var11++;
        var2.field2018++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method941((byte) 125);
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
        class238[] var19 = new class238[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class238 var103 = var19[var20] = new class238();
            int var104 = var2.method941((byte) 124);
            if (var104 > 0) {
                var103.field3333 = new byte[var104 * 2];
            }
            int var105 = var2.method941((byte) 126);
            if (var105 > 0) {
                var103.field3331 = new byte[var105 * 2 + 2];
                var103.field3331[1] = 64;
            }
        }
        int var21 = var2.method941((byte) 126);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method941((byte) 125);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field2041[var2.field2018 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method946(58);
        }
        var2.field2018++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method941((byte) 123);
            this.field4102[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method941((byte) 124);
            this.field4102[var31] = (short) (this.field4102[var31] + (var30 << 8));
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
                var34 = var2.method968(-1);
            }
            this.field4102[var35] = (short) (this.field4102[var35] + (class500.method3013(2, var34 - 1) << 14));
            this.field4098[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4098[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field2041[var6++] - 1;
                }
                var36--;
                this.field4100[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4098[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field2041[var10++] + 16 << 2;
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                }
                this.field4094[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class238 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4098[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field4101[var47] = var46;
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
                if (this.field4098[var51] > 0) {
                    var50 = var2.method941((byte) 126) + 1;
                }
            }
            this.field4097[var51] = (byte) var50;
            var48--;
        }
        this.field4095 = var2.method941((byte) 123) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class238 var100 = var19[var52];
            if (var100.field3333 != null) {
                for (int var101 = 1; var101 < var100.field3333.length; var101 += 2) {
                    var100.field3333[var101] = var2.method946(116);
                }
            }
            if (var100.field3331 != null) {
                for (int var102 = 3; var102 < (var100.field3331.length - 2); var102 += 2) {
                    var100.field3331[var102] = var2.method946(92);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method946(80);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method946(62);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class238 var97 = var19[var55];
            if (var97.field3331 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3331.length; var99 += 2) {
                    var98 += var2.method941((byte) 123) + 1;
                    var97.field3331[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class238 var94 = var19[var56];
            if (var94.field3333 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3333.length; var96 += 2) {
                    var95 = var95 + var2.method941((byte) 123) + 1;
                    var94.field3333[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method941((byte) 124);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method941((byte) 127) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4097[var61] = (byte) (this.field4097[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class86.method543(var65 - var59, var67, 2);
                    this.field4097[var68] = (byte) (this.field4097[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field4097[var63] = (byte) (this.field4097[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method941((byte) 126);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method941((byte) 124) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4094[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4094[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class86.method543(var79 - var72, var81, 2);
                    int var84 = (this.field4094[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4094[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field4094[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4094[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3335 = var2.method941((byte) 127);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class238 var93 = var19[var87];
            if (var93.field3333 != null) {
                var93.field3324 = var2.method941((byte) 125);
            }
            if (var93.field3331 != null) {
                var93.field3323 = var2.method941((byte) 123);
            }
            if (var93.field3335 > 0) {
                var93.field3328 = var2.method941((byte) 127);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3332 = var2.method941((byte) 125);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class238 var92 = var19[var89];
            if (var92.field3332 > 0) {
                var92.field3322 = var2.method941((byte) 125);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class238 var91 = var19[var90];
            if (var91.field3322 > 0) {
                var91.field3330 = var2.method941((byte) 123);
            }
        }
    }
}
