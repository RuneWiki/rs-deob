import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class496 {

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[[Lnb;")
    private class95[][] field7134 = new class95[64][768];

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "[I")
    private int[] field7125 = new int[64];

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "[[Lnb;")
    private class95[][] field7130 = new class95[1600][64];

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "[I")
    private int[] field7140 = new int[8191];

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "[I")
    private int[] field7146 = new int[1600];

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    private int field7145 = 0;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Leu;")
    private class448 field7127;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Lfg;")
    private class436 field7131;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lfg;")
    private class436 field7132;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "Lrr;")
    private class33 field7137;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "Llc;")
    public static class435 field7141 = new class435(9, -1);

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "Z")
    public static boolean field7143 = false;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "Lgr;")
    public static class530 field7142 = new class530(44, 3);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLch;)V", line = 5)
    private final void method3011(boolean arg0, class38 arg1) {
        field7128++;
        class19.field187 = arg1.field551;
        if (!arg0) {
            this.method3019(null, (byte) 71, -15);
        }
        arg1.method248(22301);
        arg1.method394((byte) 77, false);
        arg1.method308(0, false);
        arg1.method289(false);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method3012(int arg0, int arg1, int arg2) {
        if (arg1 == -8192) {
            field7133++;
            return class499.method3032(arg1 + 8244, arg2, arg0) | (arg2 & 0x70000) != 0 || class297.method1855(arg2, arg0, -128);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 37)
    public final void method3013(int arg0) {
        this.field7131.method175(-103);
        field7144++;
        if (arg0 > -107) {
            method3021(-77);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILch;I)V", line = 49)
    private final void method3014(int arg0, class38 arg1, int arg2) {
        field7136++;
        if (arg2 != 4) {
            return;
        }
        class19.field187 = arg1.field551;
        arg1.method312((byte) 30, (float) arg0);
        arg1.method243(arg2 + 97);
        arg1.method394((byte) -81, false);
        arg1.method308(0, false);
        arg1.method289(false);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILeea;Lch;)V", line = 65)
    public final void method3015(int arg0, int arg1, class458 arg2, class38 arg3) {
        field7126++;
        if (arg3.field533 == null) {
            return;
        }
        if (arg1 < 0) {
            this.method3011(true, arg3);
        } else {
            this.method3014(arg1, arg3, 4);
        }
        float var5 = arg3.field533.field5939;
        float var6 = arg3.field533.field5968;
        float var7 = arg3.field533.field5961;
        float var8 = arg3.field533.field5945;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class310 var12 = arg2.field6514.field6354;
            for (class310 var13 = var12.field4188; var13 != var12; var13 = var13.field4188) {
                class95 var14 = (class95) var13;
                int var15 = (int) ((float) (var14.field1378 >> 12) * var7 + (float) (var14.field1377 >> 12) * var5 + (float) (var14.field1374 >> 12) * var6 + var8);
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field7140[var9++] = var15;
            }
            if (arg0 != -32747) {
                this.method3019(null, (byte) -75, 71);
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = class690.method3903(4, var16) + 1 - class519.field7476;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            int var18 = 0;
            class310 var19 = var12.field4188;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field7145 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field7146[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field7125[var24] = 0;
                }
                while (var12 != var19) {
                    class95 var25 = (class95) var19;
                    if (var22) {
                        var20 = var25.field1376;
                        var22 = false;
                        var21 = var25.field1379;
                    }
                    if (var18 > 0 && (var25.field1376 != var20 || var25.field1379 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field7140[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field7146[var26] < 64) {
                            this.field7130[var26][this.field7146[var26]++] = var25;
                        } else {
                            label105: {
                                if (this.field7146[var26] == 64) {
                                    if (this.field7145 == 64) {
                                        break label105;
                                    }
                                    this.field7146[var26] += this.field7145++ + 1;
                                }
                                this.field7134[this.field7146[var26] - 64 - 1][this.field7125[this.field7146[var26] - 1 - 64]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field4188;
                }
                arg3.method223(false, false, false, var20 >= 0 ? var20 : -1);
                if (var21 && class19.field187 != arg3.field551) {
                    arg3.method271(class19.field187);
                } else if (arg3.field551 != 1.0F) {
                    arg3.method271(1.0F);
                }
                this.method3019(arg3, (byte) -37, var16);
            }
        } catch (Exception var27) {
        }
        this.method3018(arg3, (byte) 75);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 226)
    public static final void method3016(boolean arg0) {
        if (arg0) {
            class565.field8185 = class643.field9177;
            class95.field1372 = class25.field221;
        } else {
            class565.field8185 = class386.field5587;
            class95.field1372 = class491.field7079;
        }
        class433.field6202 = class565.field8185.length;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 241)
    public static void method3017(int arg0) {
        field7141 = null;
        if (arg0 == -12142) {
            field7142 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lch;B)V", line = 252)
    private final void method3018(class38 arg0, byte arg1) {
        arg0.method308(arg1 - 75, true);
        field7129++;
        arg0.method394((byte) -118, true);
        if (arg1 == 75 && class19.field187 != arg0.field551) {
            arg0.method271(class19.field187);
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lch;)V", line = 723)
    public class496(class38 arg0) {
        this.field7127 = arg0.method334(21011, new class109[] { new class109(new class697[] { class697.field9848, class697.field9850, class697.field9852 }), new class109(class697.field9849) });
        this.field7131 = arg0.method327(true, false);
        this.field7132 = arg0.method327(false, false);
        this.field7132.method1101(-32376, 12, 393168);
        this.field7137 = arg0.method366((byte) 113, false);
        this.field7137.method174(49146, (byte) 39);
        Buffer var2 = this.field7137.method177(true, (byte) -114);
        if (var2 != null) {
            Stream var3 = arg0.method325((byte) -120, var2);
            if (Stream.method2551()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2561(var7);
                    var3.method2561(var7 + 1);
                    var3.method2561(var7 + 2);
                    var3.method2561(var7 + 2);
                    var3.method2561(var7 + 3);
                    var3.method2561(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2560(var5);
                    var3.method2560(var5 + 1);
                    var3.method2560(var5 + 2);
                    var3.method2560(var5 + 2);
                    var3.method2560(var5 + 3);
                    var3.method2560(var5);
                }
            }
            var3.method2554();
            this.field7137.method178((byte) -105);
        }
        Buffer var8 = this.field7132.method1103((byte) 73, true);
        if (var8 != null) {
            Stream var9 = arg0.method325((byte) -120, var8);
            if (Stream.method2551()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2557(0.0F);
                    var9.method2557(-1.0F);
                    var9.method2557(0.0F);
                    var9.method2557(0.0F);
                    var9.method2557(-1.0F);
                    var9.method2557(0.0F);
                    var9.method2557(0.0F);
                    var9.method2557(-1.0F);
                    var9.method2557(0.0F);
                    var9.method2557(0.0F);
                    var9.method2557(-1.0F);
                    var9.method2557(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2564(0.0F);
                    var9.method2564(-1.0F);
                    var9.method2564(0.0F);
                    var9.method2564(0.0F);
                    var9.method2564(-1.0F);
                    var9.method2564(0.0F);
                    var9.method2564(0.0F);
                    var9.method2564(-1.0F);
                    var9.method2564(0.0F);
                    var9.method2564(0.0F);
                    var9.method2564(-1.0F);
                    var9.method2564(0.0F);
                }
            }
            var9.method2554();
            this.field7132.method1099((byte) -115);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lch;BI)V", line = 279)
    private final void method3019(class38 arg0, byte arg1, int arg2) {
        field7139++;
        int var4 = 0;
        class417 var5 = arg0.method244(1);
        float var6 = var5.field5948;
        float var7 = var5.field5923;
        if (arg1 != -37) {
            this.field7127 = null;
        }
        float var8 = var5.field5927;
        float var9 = var5.field5946;
        float var10 = var5.field5940;
        float var11 = var5.field5938;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field7131.method1103((byte) 73, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method325((byte) -120, var21);
        if (Stream.method2551()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field7146[var48] > 64 ? 64 : this.field7146[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class95 var63 = this.field7130[var48][var50];
                        int var64 = var63.field1375;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field1377 >> 12);
                        float var70 = (float) (var63.field1374 >> 12);
                        float var71 = (float) (var63.field1378 >> 12);
                        int var72 = var63.field1381 >> 12;
                        var22.method2557((float) (-var72) * var12 + var69);
                        var22.method2557((float) (-var72) * var13 + var70);
                        var22.method2557((float) (-var72) * var14 + var71);
                        if (arg0.field605 == 0) {
                            var22.method2558(var65, var66, var67, var68);
                        } else {
                            var22.method2562(var65, var66, var67, var68);
                        }
                        var22.method2557(0.0F);
                        var22.method2557(0.0F);
                        var22.method2557((float) var72 * var15 + var69);
                        var22.method2557((float) var72 * var16 + var70);
                        var22.method2557((float) var72 * var17 + var71);
                        if (arg0.field605 == 0) {
                            var22.method2558(var65, var66, var67, var68);
                        } else {
                            var22.method2562(var65, var66, var67, var68);
                        }
                        var22.method2557(1.0F);
                        var22.method2557(0.0F);
                        var22.method2557((float) var72 * var12 + var69);
                        var22.method2557((float) var72 * var13 + var70);
                        var22.method2557((float) var72 * var14 + var71);
                        if (arg0.field605 == 0) {
                            var22.method2558(var65, var66, var67, var68);
                        } else {
                            var22.method2562(var65, var66, var67, var68);
                        }
                        var22.method2557(1.0F);
                        var22.method2557(1.0F);
                        var22.method2557((float) var72 * var18 + var69);
                        var22.method2557((float) var72 * var19 + var70);
                        var22.method2557((float) var72 * var20 + var71);
                        if (arg0.field605 == 0) {
                            var22.method2558(var65, var66, var67, var68);
                        } else {
                            var22.method2562(var65, var66, var67, var68);
                        }
                        var22.method2557(0.0F);
                        var22.method2557(1.0F);
                        var4++;
                    }
                    if (this.field7146[var48] > 64) {
                        int var51 = this.field7146[var48] - 65;
                        for (int var52 = this.field7125[var51] - 1; var52 >= 0; var52--) {
                            class95 var53 = this.field7134[var51][var52];
                            int var54 = var53.field1375;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field1377 >> 12);
                            float var60 = (float) (var53.field1374 >> 12);
                            float var61 = (float) (var53.field1378 >> 12);
                            int var62 = var53.field1381 >> 12;
                            var22.method2557((float) (-var62) * var12 + var59);
                            var22.method2557((float) (-var62) * var13 + var60);
                            var22.method2557((float) (-var62) * var14 + var61);
                            if (arg0.field605 == 0) {
                                var22.method2558(var55, var56, var57, var58);
                            } else {
                                var22.method2562(var55, var56, var57, var58);
                            }
                            var22.method2557(0.0F);
                            var22.method2557(0.0F);
                            var22.method2557((float) var62 * var15 + var59);
                            var22.method2557((float) var62 * var16 + var60);
                            var22.method2557((float) var62 * var17 + var61);
                            if (arg0.field605 == 0) {
                                var22.method2558(var55, var56, var57, var58);
                            } else {
                                var22.method2562(var55, var56, var57, var58);
                            }
                            var22.method2557(1.0F);
                            var22.method2557(0.0F);
                            var22.method2557((float) var62 * var12 + var59);
                            var22.method2557((float) var62 * var13 + var60);
                            var22.method2557((float) var62 * var14 + var61);
                            if (arg0.field605 == 0) {
                                var22.method2558(var55, var56, var57, var58);
                            } else {
                                var22.method2562(var55, var56, var57, var58);
                            }
                            var22.method2557(1.0F);
                            var22.method2557(1.0F);
                            var22.method2557((float) var62 * var18 + var59);
                            var22.method2557((float) var62 * var19 + var60);
                            var22.method2557((float) var62 * var20 + var61);
                            if (arg0.field605 == 0) {
                                var22.method2558(var55, var56, var57, var58);
                            } else {
                                var22.method2562(var55, var56, var57, var58);
                            }
                            var22.method2557(0.0F);
                            var4++;
                            var22.method2557(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field7146[var23] > 64 ? 64 : this.field7146[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class95 var38 = this.field7130[var23][var25];
                        int var39 = var38.field1375;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field1377 >> 12);
                        float var45 = (float) (var38.field1374 >> 12);
                        float var46 = (float) (var38.field1378 >> 12);
                        int var47 = var38.field1381 >> 12;
                        var22.method2564((float) (-var47) * var12 + var44);
                        var22.method2564((float) (-var47) * var13 + var45);
                        var22.method2564((float) (-var47) * var14 + var46);
                        if (arg0.field605 == 0) {
                            var22.method2558(var40, var41, var42, var43);
                        } else {
                            var22.method2562(var40, var41, var42, var43);
                        }
                        var22.method2564(0.0F);
                        var22.method2564(0.0F);
                        var22.method2564((float) var47 * var15 + var44);
                        var22.method2564((float) var47 * var16 + var45);
                        var22.method2564((float) var47 * var17 + var46);
                        if (arg0.field605 == 0) {
                            var22.method2558(var40, var41, var42, var43);
                        } else {
                            var22.method2562(var40, var41, var42, var43);
                        }
                        var22.method2564(1.0F);
                        var22.method2564(0.0F);
                        var22.method2564((float) var47 * var12 + var44);
                        var22.method2564((float) var47 * var13 + var45);
                        var22.method2564((float) var47 * var14 + var46);
                        if (arg0.field605 == 0) {
                            var22.method2558(var40, var41, var42, var43);
                        } else {
                            var22.method2562(var40, var41, var42, var43);
                        }
                        var22.method2564(1.0F);
                        var22.method2564(1.0F);
                        var22.method2564((float) var47 * var18 + var44);
                        var22.method2564((float) var47 * var19 + var45);
                        var22.method2564((float) var47 * var20 + var46);
                        if (arg0.field605 == 0) {
                            var22.method2558(var40, var41, var42, var43);
                        } else {
                            var22.method2562(var40, var41, var42, var43);
                        }
                        var22.method2564(0.0F);
                        var4++;
                        var22.method2564(1.0F);
                    }
                    if (this.field7146[var23] > 64) {
                        int var26 = this.field7146[var23] - 1 - 64;
                        for (int var27 = this.field7125[var26] - 1; var27 >= 0; var27--) {
                            class95 var28 = this.field7134[var26][var27];
                            int var29 = var28.field1375;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field1377 >> 12);
                            float var35 = (float) (var28.field1374 >> 12);
                            float var36 = (float) (var28.field1378 >> 12);
                            int var37 = var28.field1381 >> 12;
                            var22.method2564((float) (-var37) * var12 + var34);
                            var22.method2564((float) (-var37) * var13 + var35);
                            var22.method2564((float) (-var37) * var14 + var36);
                            if (arg0.field605 == 0) {
                                var22.method2558(var30, var31, var32, var33);
                            } else {
                                var22.method2562(var30, var31, var32, var33);
                            }
                            var22.method2564(0.0F);
                            var22.method2564(0.0F);
                            var22.method2564((float) var37 * var15 + var34);
                            var22.method2564((float) var37 * var16 + var35);
                            var22.method2564((float) var37 * var17 + var36);
                            if (arg0.field605 == 0) {
                                var22.method2558(var30, var31, var32, var33);
                            } else {
                                var22.method2562(var30, var31, var32, var33);
                            }
                            var22.method2564(1.0F);
                            var22.method2564(0.0F);
                            var22.method2564((float) var37 * var12 + var34);
                            var22.method2564((float) var37 * var13 + var35);
                            var22.method2564((float) var37 * var14 + var36);
                            if (arg0.field605 == 0) {
                                var22.method2558(var30, var31, var32, var33);
                            } else {
                                var22.method2562(var30, var31, var32, var33);
                            }
                            var22.method2564(1.0F);
                            var22.method2564(1.0F);
                            var22.method2564((float) var37 * var18 + var34);
                            var22.method2564((float) var37 * var19 + var35);
                            var22.method2564((float) var37 * var20 + var36);
                            if (arg0.field605 == 0) {
                                var22.method2558(var30, var31, var32, var33);
                            } else {
                                var22.method2562(var30, var31, var32, var33);
                            }
                            var22.method2564(0.0F);
                            var22.method2564(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method2554();
        if (this.field7131.method1099((byte) -121)) {
            arg0.method405(this.field7131, 0, (byte) 11);
            arg0.method405(this.field7132, 1, (byte) 11);
            arg0.method265(this.field7127, (byte) -93);
            arg0.method354(class262.field3771, 0, 124, var4 * 4, this.field7137, var4 * 2, 0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILch;)V", line = 675)
    public final void method3020(int arg0, class38 arg1) {
        field7135++;
        if (arg0 != -1984952404) {
            this.method3019(null, (byte) 33, 2);
        }
        this.field7131.method1101(-32376, 24, 786336);
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V", line = 691)
    public static final void method3021(int arg0) {
        class48.field793++;
        if (arg0 > -32) {
            method3017(-19);
        }
        field7138++;
        class88 var1 = class448.method2741((byte) 127, class157.field2253, class583.field8319);
        var1.field1260.method2881(class184.method1305(1), (byte) 117);
        var1.field1260.method2862(class68.field1042, -1166933656);
        var1.field1260.method2862(class565.field8187, -1166933656);
        var1.field1260.method2881(class243.field3580.field8017.method2498(false), (byte) 110);
        class523.method3183(var1, (byte) 31);
    }
}
