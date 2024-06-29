import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class331 extends class161 {

    @OriginalMember(owner = "client!po", name = "C", descriptor = "[Lkr;")
    public class445[] field5192;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "[B")
    public byte[] field5178;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "[S")
    public short[] field5183;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "[I")
    private int[] field5176;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "[B")
    public byte[] field5175;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "[B")
    public byte[] field5185;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "[Llp;")
    public class220[] field5186;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public int field5189;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "[Lg;")
    public static class86[] field5180 = new class86[4];

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field5179 = 0;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "[I")
    public static int[] field5187 = new int[50];

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Lmo;")
    public static class447 field5181;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Leq;[B[II)Z", line = 5)
    public final boolean method2193(class115 arg0, byte[] arg1, int[] arg2, int arg3) {
        if (arg3 != 128) {
            method2196(31, -107);
        }
        field5190++;
        boolean var5 = true;
        int var6 = 0;
        class445 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field5176[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method840(var9 >> 2, arg2, (byte) 66);
                        } else {
                            var7 = arg0.method845(arg2, 0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5192[var8] = var7;
                        this.field5176[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V", line = 63)
    public final void method2194(int arg0) {
        field5182++;
        this.field5176 = null;
        if (arg0 != -32198) {
            this.field5192 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V", line = 74)
    public static final void method2195(int arg0) {
        field5184++;
        class234.field3912.method335((byte) 127);
        if (arg0 != 21367) {
            field5187 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V", line = 92)
    public static final void method2196(int arg0, int arg1) {
        field5177++;
        if (arg1 < arg0 || arg1 > 2) {
            arg1 = 0;
        }
        class86.field1104 = arg1;
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V", line = 104)
    public static final void method2197(int arg0) {
        field5188++;
        class314.field4939 = new String[500];
        class129.field2041 = class31.field383.field5107 + class31.field383.field5108 + 2;
        class413.field6107 = class413.field6111.field5107 + class413.field6111.field5108 + 2;
        if (arg0 == -841) {
            for (int var1 = 0; var1 < class314.field4939.length; var1++) {
                class314.field4939[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)V", line = 124)
    public static void method2198(byte arg0) {
        field5181 = null;
        field5180 = null;
        int var1 = -89 / ((arg0 - 29) / 46);
        field5187 = null;
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(I)V", line = 138)
    public static final void method2199(int arg0) {
        class158.field2514.method2223(8);
        field5191++;
        int var1 = class158.field2514.method2225(61, 8);
        if (var1 < class397.field5940) {
            for (int var2 = var1; var2 < class397.field5940; var2++) {
                class134.field2112[class11.field155++] = class423.field6253[var2];
            }
        }
        if (var1 > class397.field5940) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0 != 12529) {
            method2198((byte) -93);
        }
        class397.field5940 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class423.field6253[var3];
            class50 var5 = class39.field499[var4];
            int var6 = class158.field2514.method2225(-112, 1);
            if (var6 == 0) {
                class423.field6253[class397.field5940++] = var4;
                var5.field1839 = class183.field2987;
            } else {
                int var7 = class158.field2514.method2225(arg0 - 12600, 2);
                if (var7 == 0) {
                    class423.field6253[class397.field5940++] = var4;
                    var5.field1839 = class183.field2987;
                    class208.field3349[class21.field274++] = var4;
                } else if (var7 == 1) {
                    class423.field6253[class397.field5940++] = var4;
                    var5.field1839 = class183.field2987;
                    int var8 = class158.field2514.method2225(arg0 - 12584, 3);
                    var5.method909(var8, 1, 38);
                    int var9 = class158.field2514.method2225(85, 1);
                    if (var9 == 1) {
                        class208.field3349[class21.field274++] = var4;
                    }
                } else if (var7 == 2) {
                    class423.field6253[class397.field5940++] = var4;
                    var5.field1839 = class183.field2987;
                    if (class158.field2514.method2225(107, 1) == 1) {
                        int var10 = class158.field2514.method2225(-127, 3);
                        var5.method909(var10, 2, 62);
                        int var11 = class158.field2514.method2225(67, 3);
                        var5.method909(var11, 2, 53);
                    } else {
                        int var12 = class158.field2514.method2225(77, 3);
                        var5.method909(var12, 0, 30);
                    }
                    int var13 = class158.field2514.method2225(arg0 - 12442, 1);
                    if (var13 == 1) {
                        class208.field3349[class21.field274++] = var4;
                    }
                } else if (var7 == 3) {
                    class134.field2112[class11.field155++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 274)
    public class331() {
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "([B)V", line = 276)
    public class331(byte[] arg0) {
        this.field5192 = new class445[128];
        this.field5178 = new byte[128];
        this.field5183 = new short[128];
        this.field5176 = new int[128];
        this.field5175 = new byte[128];
        this.field5185 = new byte[128];
        this.field5186 = new class220[128];
        class186 var2 = new class186(arg0);
        int var3;
        for (var3 = 0; var2.field3066[var2.field3044 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1327((byte) -99);
        }
        var2.field3044++;
        var3++;
        int var6 = var2.field3044;
        var2.field3044 += var3;
        int var7;
        for (var7 = 0; var2.field3066[var2.field3044 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1327((byte) -122);
        }
        var2.field3044++;
        var7++;
        int var10 = var2.field3044;
        var2.field3044 += var7;
        int var11;
        for (var11 = 0; var2.field3066[var2.field3044 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1327((byte) -96);
        }
        var11++;
        var2.field3044++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1322(false);
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
        class220[] var19 = new class220[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class220 var103 = var19[var20] = new class220();
            int var104 = var2.method1322(false);
            if (var104 > 0) {
                var103.field3629 = new byte[var104 * 2];
            }
            int var105 = var2.method1322(false);
            if (var105 > 0) {
                var103.field3631 = new byte[var105 * 2 + 2];
                var103.field3631[1] = 64;
            }
        }
        int var21 = var2.method1322(false);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1322(false);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field3066[var2.field3044 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1327((byte) -99);
        }
        var2.field3044++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1322(false);
            this.field5183[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1322(false);
            this.field5183[var31] = (short) (this.field5183[var31] + (var30 << 8));
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
                var34 = var2.method1271(117);
            }
            this.field5183[var35] = (short) (this.field5183[var35] + (class37.method242(var34 - 1, 2) << 14));
            var32--;
            this.field5176[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field5176[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field3066[var6++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                var37--;
                this.field5178[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field5176[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field3066[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field5175[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class220 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field5176[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field5186[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 < var26.length) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field5176[var51] > 0) {
                    var50 = var2.method1322(false) + 1;
                }
            }
            this.field5185[var51] = (byte) var50;
            var48--;
        }
        this.field5189 = var2.method1322(false) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class220 var100 = var19[var52];
            if (var100.field3629 != null) {
                for (int var101 = 1; var101 < var100.field3629.length; var101 += 2) {
                    var100.field3629[var101] = var2.method1327((byte) -118);
                }
            }
            if (var100.field3631 != null) {
                for (int var102 = 3; var102 < (var100.field3631.length - 2); var102 += 2) {
                    var100.field3631[var102] = var2.method1327((byte) -92);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1327((byte) -89);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1327((byte) -90);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class220 var97 = var19[var55];
            if (var97.field3631 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3631.length; var99 += 2) {
                    var98 -= -var2.method1322(false) - 1;
                    var97.field3631[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class220 var94 = var19[var56];
            if (var94.field3629 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3629.length; var96 += 2) {
                    var95 = var95 + var2.method1322(false) + 1;
                    var94.field3629[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1322(false);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method1322(false) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field5185[var61] = (byte) (this.field5185[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class214.method1523((byte) -32, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field5185[var68] = (byte) (this.field5185[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field5185[var63] = (byte) (this.field5185[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1322(false);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = (var70 + var2.method1322(false)) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field5175[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field5175[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class214.method1523((byte) -48, var79 - var72, var81);
                    int var84 = (this.field5175[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field5175[var82] = (byte) var84;
                }
                var72 = var79;
                var75 += 2;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field5175[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field5175[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3630 = var2.method1322(false);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class220 var93 = var19[var87];
            if (var93.field3629 != null) {
                var93.field3635 = var2.method1322(false);
            }
            if (var93.field3631 != null) {
                var93.field3628 = var2.method1322(false);
            }
            if (var93.field3630 > 0) {
                var93.field3637 = var2.method1322(false);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3639 = var2.method1322(false);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class220 var92 = var19[var89];
            if (var92.field3639 > 0) {
                var92.field3632 = var2.method1322(false);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class220 var91 = var19[var90];
            if (var91.field3632 > 0) {
                var91.field3633 = var2.method1322(false);
            }
        }
    }
}
