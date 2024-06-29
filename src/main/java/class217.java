import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class217 extends class513 {

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "[B")
    public byte[] field2821;

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "[Lep;")
    public class387[] field2824;

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "[B")
    public byte[] field2822;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "[Lhc;")
    public class124[] field2816;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "[B")
    public byte[] field2817;

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "[I")
    private int[] field2825;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "[S")
    public short[] field2815;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public static int field2813 = 1405;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljn;ZI)Lgda;", line = 14)
    public static final class50 method1321(class668 arg0, boolean arg1, int arg2) {
        field2823++;
        byte[] var3 = arg0.method3811(124, arg2);
        if (var3 == null) {
            return null;
        } else {
            if (!arg1) {
                field2813 = 49;
            }
            return new class50(var3);
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([II[BLgd;)Z", line = 34)
    public final boolean method1322(int[] arg0, int arg1, byte[] arg2, class311 arg3) {
        field2819++;
        boolean var5 = true;
        int var6 = 0;
        class387 var7 = null;
        if (arg1 != 8466) {
            this.method1322(null, 80, null, null);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2825[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1831(arg0, (byte) 8, var9 >> 2);
                        } else {
                            var7 = arg3.method1828((byte) 126, var9 >> 2, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2824[var8] = var7;
                        this.field2825[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III[BII)Z", line = 88)
    public static final boolean method1323(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field2820++;
        boolean var6 = true;
        if (arg1 > -41) {
            field2813 = 14;
        }
        class389 var7 = new class389(arg3);
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method2248(26213);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2266((byte) 110);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFC3) >> 6;
                    int var16 = var7.method2229(255) >> 2;
                    int var17 = var15 + arg4;
                    int var18 = var14 + arg2;
                    if (var17 > 0 && var18 > 0 && var17 < arg5 - 1 && arg0 - 1 > var18) {
                        class232 var19 = class37.field703.method807(0, var8);
                        if (var16 != 22 || class221.field2851.field4165 || var19.field3029 != 0 || var19.field3016 == 1 || var19.field3076) {
                            var11 = true;
                            if (!var19.method1410((byte) -11)) {
                                var6 = false;
                                class4.field23++;
                            }
                        }
                    }
                }
                int var12 = var7.method2266((byte) 110);
                if (var12 == 0) {
                    break;
                }
                var7.method2229(255);
            }
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V", line = 169)
    public final void method1324(boolean arg0) {
        field2814++;
        if (arg0) {
            this.field2825 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "()V", line = 184)
    public class217() {
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "([B)V", line = 186)
    public class217(byte[] arg0) {
        this.field2821 = new byte[128];
        this.field2824 = new class387[128];
        this.field2822 = new byte[128];
        this.field2816 = new class124[128];
        this.field2817 = new byte[128];
        this.field2825 = new int[128];
        this.field2815 = new short[128];
        class389 var2 = new class389(arg0);
        int var3;
        for (var3 = 0; var2.field5205[var2.field5195 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2249((byte) -70);
        }
        var2.field5195++;
        var3++;
        int var6 = var2.field5195;
        var2.field5195 += var3;
        int var7;
        for (var7 = 0; var2.field5205[var2.field5195 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2249((byte) -70);
        }
        var2.field5195++;
        var7++;
        int var10 = var2.field5195;
        var2.field5195 += var7;
        int var11;
        for (var11 = 0; var2.field5205[var2.field5195 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2249((byte) -70);
        }
        var2.field5195++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2229(255);
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
        class124[] var19 = new class124[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class124 var103 = var19[var20] = new class124();
            int var104 = var2.method2229(255);
            if (var104 > 0) {
                var103.field1592 = new byte[var104 * 2];
            }
            int var105 = var2.method2229(255);
            if (var105 > 0) {
                var103.field1590 = new byte[var105 * 2 + 2];
                var103.field1590[1] = 64;
            }
        }
        int var21 = var2.method2229(255);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method2229(255);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field5205[var2.field5195 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2249((byte) -70);
        }
        var25++;
        var2.field5195++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2229(255);
            this.field2815[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2229(255);
            this.field2815[var31] = (short) (this.field2815[var31] + (var30 << 8));
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
                var34 = var2.method2245(-31438);
            }
            this.field2815[var35] = (short) (this.field2815[var35] + (class435.method2605(var34 - 1, 2) << 14));
            var32--;
            this.field2825[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2825[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field5205[var6++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field2822[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2825[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field5205[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field2817[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class124 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2825[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                var45--;
                this.field2816[var47] = var46;
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
                if (this.field2825[var51] > 0) {
                    var50 = var2.method2229(255) + 1;
                }
            }
            this.field2821[var51] = (byte) var50;
            var49--;
        }
        this.field2818 = var2.method2229(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class124 var100 = var19[var52];
            if (var100.field1592 != null) {
                for (int var101 = 1; var101 < var100.field1592.length; var101 += 2) {
                    var100.field1592[var101] = var2.method2249((byte) -70);
                }
            }
            if (var100.field1590 != null) {
                for (int var102 = 3; var102 < var100.field1590.length - 2; var102 += 2) {
                    var100.field1590[var102] = var2.method2249((byte) -70);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2249((byte) -70);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2249((byte) -70);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class124 var97 = var19[var55];
            if (var97.field1590 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1590.length; var99 += 2) {
                    var98 = var98 + var2.method2229(255) + 1;
                    var97.field1590[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class124 var94 = var19[var56];
            if (var94.field1592 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1592.length; var96 += 2) {
                    var95 += var2.method2229(255) + 1;
                    var94.field1592[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2229(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method2229(255) + (var57 + 1);
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2821[var61] = (byte) (this.field2821[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class72.method639(true, var67, var65 - var59);
                    this.field2821[var68] = (byte) (this.field2821[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2821[var63] = (byte) (this.field2821[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method2229(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method2229(255) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2817[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2817[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class72.method639(true, var81, var79 - var72);
                    int var84 = (this.field2817[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field2817[var82] = (byte) var84;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field2817[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2817[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1591 = var2.method2229(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class124 var93 = var19[var87];
            if (var93.field1592 != null) {
                var93.field1598 = var2.method2229(255);
            }
            if (var93.field1590 != null) {
                var93.field1599 = var2.method2229(255);
            }
            if (var93.field1591 > 0) {
                var93.field1596 = var2.method2229(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1593 = var2.method2229(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class124 var92 = var19[var89];
            if (var92.field1593 > 0) {
                var92.field1594 = var2.method2229(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class124 var91 = var19[var90];
            if (var91.field1594 > 0) {
                var91.field1600 = var2.method2229(255);
            }
        }
    }
}
