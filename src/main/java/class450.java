import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class450 {

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "[I")
    private int[] field6289;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "[I")
    private int[] field6293;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field6300 = 2;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "Leh;")
    public static class246 field6292 = new class246(67, 6);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    private int field6290;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    private int field6295;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    private int field6297;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    private int field6305;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "Lnd;")
    public static class388 field6304;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 9)
    private final void method2630(byte arg0) {
        field6303++;
        this.field6297 += ++this.field6295;
        int var2 = -110 / ((-arg0 - 46) / 58);
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = this.field6293[var3];
            if ((var3 & 0x2) == 0) {
                if ((var3 & 0x1) == 0) {
                    this.field6290 ^= this.field6290 << 13;
                } else {
                    this.field6290 ^= this.field6290 >>> 6;
                }
            } else if ((var3 & 0x1) == 0) {
                this.field6290 ^= this.field6290 << 2;
            } else {
                this.field6290 ^= this.field6290 >>> 16;
            }
            this.field6290 += this.field6293[var3 + 128 & 0xFF];
            int var5;
            this.field6293[var3] = var5 = this.field6297 + this.field6293[class239.method1507(var4 >> 2, 255)] + this.field6290;
            this.field6289[var3] = this.field6297 = this.field6293[class239.method1507(1020, var5 >> 8) >> 2] + var4;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)I", line = 53)
    public final int method2631(int arg0) {
        if (this.field6305 == 0) {
            this.method2630((byte) 80);
            this.field6305 = 256;
        }
        if (arg0 != 232576748) {
            this.field6290 = 74;
        }
        field6298++;
        return this.field6289[this.field6305 - 1];
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([IB[ILir;[I)V", line = 74)
    public static final void method2632(int[] arg0, byte arg1, int[] arg2, class22 arg3, int[] arg4) {
        if (arg1 <= 1) {
            method2635((byte) -106, -91, 85);
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg3.field3295.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field3295[var9] = null;
                    } else {
                        class449 var10 = class62.field784.method2566(var6, -19);
                        int var11 = var10.field6286;
                        class265 var12 = arg3.field3295[var9];
                        if (var12 != null) {
                            if (var12.field3881 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field3295[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3886 = 1;
                                    var12.field3883 = 0;
                                    var12.field3889 = 0;
                                    var12.field3885 = 0;
                                    var12.field3880 = var8;
                                    class190.method1213(0, arg3.field1896, (byte) 104, var10, arg3.field1904, class246.field3587 == arg3, arg3.field1899);
                                } else if (var11 == 2) {
                                    var12.field3885 = 0;
                                }
                            } else if (var10.field6274 >= class62.field784.method2566(var12.field3881, -19).field6274) {
                                var12 = arg3.field3295[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class265 var13 = arg3.field3295[var9] = new class265();
                            var13.field3886 = 1;
                            var13.field3889 = 0;
                            var13.field3885 = 0;
                            var13.field3880 = var8;
                            var13.field3881 = var6;
                            var13.field3883 = 0;
                            class190.method1213(0, arg3.field1896, (byte) -109, var10, arg3.field1904, class246.field3587 == arg3, arg3.field1899);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field6288++;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Lmk;", line = 171)
    public static final class40 method2633(int arg0, int arg1, int arg2) {
        field6294++;
        class40 var3 = new class40();
        var3.field442 = arg2 + 1 + 5;
        var3.field436 = -1;
        var3.field431 = arg1 + 1 + 5;
        var3.field447 = -1;
        var3.field443 = new int[var3.field431][var3.field442];
        if (arg0 == -24283) {
            var3.method231(-4);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V", line = 195)
    public static final void method2634(int arg0, int arg1) {
        class513.field7573 = arg1;
        int var2 = 39 % ((21 - arg0) / 36);
        field6296++;
        class335.field4854.method1096((byte) -44);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BII)V", line = 206)
    public static final void method2635(byte arg0, int arg1, int arg2) {
        if (class530.field7763 != arg2) {
            class492.field6966 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class492.field6966[var3] = (var3 << 12) / arg2;
            }
            class530.field7763 = arg2;
            class43.field499 = arg2 - 1;
            class350.field5035 = arg2 * 32;
        }
        field6302++;
        if (arg0 != 117 || class178.field2556 == arg1) {
            return;
        }
        if (class530.field7763 == arg1) {
            class40.field427 = class492.field6966;
        } else {
            class40.field427 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class40.field427[var4] = (var4 << 12) / arg1;
            }
        }
        class178.field2556 = arg1;
        class38.field417 = arg1 - 1;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V", line = 253)
    public static void method2636(byte arg0) {
        field6304 = null;
        field6292 = null;
        if (arg0 != 94) {
            method2634(74, -45);
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)I", line = 264)
    public final int method2637(int arg0) {
        if (arg0 > -40) {
            return 26;
        }
        if (this.field6305 == 0) {
            this.method2630((byte) 105);
            this.field6305 = 256;
        }
        field6301++;
        return this.field6289[--this.field6305];
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 285)
    public static final void method2638(int arg0, String arg1, int arg2) {
        field6291++;
        int var3 = class144.field1908;
        int[] var4 = class521.field7674;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class22 var7 = class378.field5355[var4[var6]];
            if (var7 != null && class246.field3587 != var7 && var7.field256 != null && var7.field256.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg0 == 1) {
                    class61.method498(class488.field6821, 1);
                    class131.field1724++;
                    class30.field357.method2336(var4[var6], -114);
                    class30.field357.method2375(0, 3457);
                } else if (arg0 == 4) {
                    class61.method498(class534.field7826, 1);
                    class400.field5630++;
                    class30.field357.method2321(0, -87);
                    class30.field357.method2336(var4[var6], -120);
                } else if (arg0 == 5) {
                    class522.field7684++;
                    class61.method498(class194.field2758, 1);
                    class30.field357.method2336(var4[var6], -123);
                    class30.field357.method2321(0, -72);
                } else if (arg0 == 6) {
                    class117.field1618++;
                    class61.method498(class347.field5019, 1);
                    class30.field357.method2340(98, 0);
                    class30.field357.method2372(var4[var6], -127);
                } else if (arg0 == 7) {
                    class61.method498(class508.field7514, 1);
                    class22.field285++;
                    class30.field357.method2321(0, -79);
                    class30.field357.method2331(32196, var4[var6]);
                }
                break;
            }
        }
        if (arg2 >= -57) {
            field6304 = null;
        }
        if (!var5) {
            class486.method2802(class395.field5612.method3116(class149.field1979, (byte) 122) + arg1, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V", line = 367)
    private final void method2639(int arg0) {
        field6299++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field6289[var11 + 4] + var5;
            int var38 = this.field6289[var11 + 2] + var7;
            int var39 = this.field6289[var11 + 3] + var6;
            int var40 = this.field6289[var11 + 1] + var8;
            int var41 = this.field6289[var11 + 7] + var2;
            int var42 = this.field6289[var11] + var9;
            int var43 = this.field6289[var11 + 5] + var4;
            int var44 = this.field6289[var11 + 6] + var3;
            int var45 = var42 ^ var40 << 11;
            int var46 = var39 + var45;
            int var47 = var38 + var40;
            int var48 = var47 ^ var38 >>> 2;
            int var49 = var38 + var46;
            int var50 = var37 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var43 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var44;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var41;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field6293[var11] = var9;
            this.field6293[var11 + 1] = var8;
            this.field6293[var11 + 2] = var7;
            this.field6293[var11 + 3] = var6;
            this.field6293[var11 + 4] = var5;
            this.field6293[var11 + 5] = var4;
            this.field6293[var11 + 6] = var3;
            this.field6293[var11 + 7] = var2;
        }
        if (arg0 > -79) {
            return;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field6293[var12] + var9;
            int var14 = this.field6293[var12 + 1] + var8;
            int var15 = this.field6293[var12 + 4] + var5;
            int var16 = this.field6293[var12 + 7] + var2;
            int var17 = this.field6293[var12 + 2] + var7;
            int var18 = this.field6293[var12 + 3] + var6;
            int var19 = this.field6293[var12 + 6] + var3;
            int var20 = this.field6293[var12 + 5] + var4;
            int var21 = var13 ^ var14 << 11;
            int var22 = var14 + var17;
            int var23 = var18 + var21;
            int var24 = var22 ^ var17 >>> 2;
            int var25 = var17 + var23;
            int var26 = var15 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var20 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var19;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var16;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field6293[var12] = var9;
            this.field6293[var12 + 1] = var8;
            this.field6293[var12 + 2] = var7;
            this.field6293[var12 + 3] = var6;
            this.field6293[var12 + 4] = var5;
            this.field6293[var12 + 5] = var4;
            this.field6293[var12 + 6] = var3;
            this.field6293[var12 + 7] = var2;
        }
        this.method2630((byte) -120);
        this.field6305 = 256;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 519)
    private class450() {
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([I)V", line = 521)
    public class450(int[] arg0) {
        this.field6289 = new int[256];
        this.field6293 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field6289[var2] = arg0[var2];
        }
        this.method2639(-124);
    }
}
