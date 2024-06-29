import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class352 extends class115 {

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "[B")
    public byte[] field5426;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[Lhl;")
    public class234[] field5416;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[S")
    public short[] field5427;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[B")
    public byte[] field5419;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[B")
    public byte[] field5414;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[I")
    private int[] field5418;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "[Llv;")
    public class528[] field5420;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field5413 = 0;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field5425 = 0;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "[I")
    public static int[] field5424;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public static void method2129(boolean arg0) {
        field5424 = null;
        if (!arg0) {
            field5425 = -102;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
    public final void method2130(byte arg0) {
        this.field5418 = null;
        if (arg0 != -82) {
            this.field5414 = null;
        }
        field5421++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[B[ILfg;)Z")
    public final boolean method2131(byte arg0, byte[] arg1, int[] arg2, class128 arg3) {
        field5422++;
        boolean var5 = true;
        int var6 = 0;
        if (arg0 != 2) {
            return true;
        }
        class528 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field5418[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method941(arg2, -101, var9 >> 2);
                        } else {
                            var7 = arg3.method943(-17413, var9 >> 2, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5420[var8] = var7;
                        this.field5418[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method2132(int arg0, int arg1, int arg2) {
        field5423++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else {
            int var4 = -46 % ((14 - arg2) / 43);
            if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2133(int arg0, String arg1) {
        field5415++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        if (arg0 > -60) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class352() {
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([B)V")
    public class352(byte[] arg0) {
        this.field5426 = new byte[128];
        this.field5416 = new class234[128];
        this.field5427 = new short[128];
        this.field5419 = new byte[128];
        this.field5414 = new byte[128];
        this.field5418 = new int[128];
        this.field5420 = new class528[128];
        class468 var2 = new class468(arg0);
        int var3;
        for (var3 = 0; var2.field6868[var2.field6830 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2714((byte) -105);
        }
        var3++;
        var2.field6830++;
        int var6 = var2.field6830;
        var2.field6830 += var3;
        int var7;
        for (var7 = 0; var2.field6868[var2.field6830 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2714((byte) -100);
        }
        var7++;
        var2.field6830++;
        int var10 = var2.field6830;
        var2.field6830 += var7;
        int var11;
        for (var11 = 0; var2.field6868[var2.field6830 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2714((byte) -93);
        }
        var2.field6830++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2765(92);
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
        class234[] var19 = new class234[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class234 var103 = var19[var20] = new class234();
            int var104 = var2.method2765(120);
            if (var104 > 0) {
                var103.field3282 = new byte[var104 * 2];
            }
            int var105 = var2.method2765(54);
            if (var105 > 0) {
                var103.field3283 = new byte[var105 * 2 + 2];
                var103.field3283[1] = 64;
            }
        }
        int var21 = var2.method2765(49);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method2765(54);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field6868[var2.field6830 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2714((byte) -85);
        }
        var2.field6830++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2765(121);
            this.field5427[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2765(107);
            this.field5427[var31] = (short) (this.field5427[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method2747(false);
            }
            this.field5427[var35] = (short) (this.field5427[var35] + class140.method1023(var34 - 1 << 14, 32768));
            this.field5418[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field5418[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field6868[var6++] - 1;
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                var37--;
                this.field5419[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field5418[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field6868[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                this.field5426[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class234 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field5418[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field5416[var47] = var46;
                var45--;
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
                if (this.field5418[var51] > 0) {
                    var50 = var2.method2765(116) + 1;
                }
            }
            this.field5414[var51] = (byte) var50;
            var48--;
        }
        this.field5417 = var2.method2765(62) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class234 var100 = var19[var52];
            if (var100.field3282 != null) {
                for (int var101 = 1; var101 < var100.field3282.length; var101 += 2) {
                    var100.field3282[var101] = var2.method2714((byte) -65);
                }
            }
            if (var100.field3283 != null) {
                for (int var102 = 3; var102 < var100.field3283.length - 2; var102 += 2) {
                    var100.field3283[var102] = var2.method2714((byte) -43);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2714((byte) -102);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2714((byte) -100);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class234 var97 = var19[var55];
            if (var97.field3283 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3283.length; var99 += 2) {
                    var98 = var2.method2765(55) + var98 + 1;
                    var97.field3283[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class234 var94 = var19[var56];
            if (var94.field3282 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3282.length; var96 += 2) {
                    var95 += var2.method2765(118) + 1;
                    var94.field3282[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2765(57);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var2.method2765(86) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field5414[var61] = (byte) (this.field5414[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class386.method2313(var67, var65 - var59, (byte) 49);
                    var67 += var66 - var60;
                    this.field5414[var68] = (byte) (this.field5414[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field5414[var63] = (byte) (this.field5414[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method2765(103);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method2765(66) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field5426[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field5426[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class386.method2313(var81, var79 - var72, (byte) 49);
                    int var84 = (this.field5426[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field5426[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var75 += 2;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field5426[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field5426[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3286 = var2.method2765(68);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class234 var93 = var19[var87];
            if (var93.field3282 != null) {
                var93.field3288 = var2.method2765(67);
            }
            if (var93.field3283 != null) {
                var93.field3292 = var2.method2765(116);
            }
            if (var93.field3286 > 0) {
                var93.field3284 = var2.method2765(73);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3287 = var2.method2765(88);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class234 var92 = var19[var89];
            if (var92.field3287 > 0) {
                var92.field3290 = var2.method2765(94);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class234 var91 = var19[var90];
            if (var91.field3290 > 0) {
                var91.field3285 = var2.method2765(66);
            }
        }
    }
}
