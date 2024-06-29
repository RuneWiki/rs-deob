import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class328 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[F")
    private float[] field5098 = new float[16];

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lns;")
    private class283 field5106 = new class283(786336);

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    private int field5112 = class542.method3194(-125, 1600);

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "[[Lrg;")
    private class462[][] field5115 = new class462[1600][64];

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "[I")
    private int[] field5117 = new int[64];

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
    private int[] field5116 = new int[8191];

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[I")
    private int[] field5119 = new int[1600];

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "[[Lrg;")
    private class462[][] field5118 = new class462[64][768];

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    private int field5120 = 0;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field5110 = 0;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Lm;")
    private class129 field5108;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lm;")
    private class129 field5109;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Lm;")
    private class129 field5111;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Lms;")
    private class541 field5114;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lfq;BLnq;)V", line = 7)
    public final void method2114(class137 arg0, byte arg1, class325 arg2) {
        field5107++;
        if (arg2.field4935 == null) {
            return;
        }
        this.method2115((byte) 62, arg2);
        float var4 = arg2.field4935.field6354;
        float var5 = arg2.field4935.field6351;
        float var6 = arg2.field4935.field6332;
        float var7 = arg2.field4935.field6329;
        try {
            if (arg0.field1829) {
                int var8 = arg0.field1830 - arg0.field1833;
                int var9;
                if (var8 + 2 > 1600) {
                    var9 = 1 - (this.field5112 - class542.method3194(-64, var8));
                    var8 = (var8 >> var9) + 2;
                } else {
                    var8 += 2;
                    var9 = 0;
                }
                class427 var10 = arg0.field1827.field6063;
                class427 var11 = var10.field6485;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field5120 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field5119[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field5117[var16] = 0;
                    }
                    while (var10 != var11) {
                        class462 var17 = (class462) var11;
                        if (var14) {
                            var12 = var17.field6913;
                            var14 = false;
                            var13 = var17.field6909;
                        } else if (var17.field6913 != var12 || var17.field6909 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field6918 >> 12) * var6 + (float) (var17.field6914 >> 12) * var5 + (float) (var17.field6911 >> 12) * var4 + var7) - arg0.field1833 >> var9;
                        if (var18 < 1600) {
                            if (this.field5119[var18] >= 64) {
                                label147: {
                                    if (this.field5119[var18] == 64) {
                                        if (this.field5120 == 64) {
                                            break label147;
                                        }
                                        this.field5119[var18] += this.field5120++ + 1;
                                    }
                                    this.field5118[this.field5119[var18] - 64 - 1][this.field5117[this.field5119[var18] - 1 - 64]++] = var17;
                                }
                            } else {
                                this.field5115[var18][this.field5119[var18]++] = var17;
                            }
                        }
                        var11 = var11.field6485;
                    }
                    if (var12 >= 0) {
                        arg2.method2075(arg2.field4884.method505((byte) -117, var12), 0);
                        arg2.method2045(34023, arg2.field2235.method157((byte) 125, var12).field1512);
                    } else {
                        arg2.method2075(null, 0);
                    }
                    if (var13 && class316.field4600 != arg2.field4953) {
                        arg2.method829(class316.field4600);
                    } else if (arg2.field4953 != 1.0F) {
                        arg2.method829(1.0F);
                    }
                    this.method2120(arg2, var8, -17559);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class427 var22 = arg0.field1827.field6063;
                for (class427 var23 = var22.field6485; var23 != var22; var23 = var23.field6485) {
                    class462 var24 = (class462) var23;
                    int var25 = (int) ((float) (var24.field6918 >> 12) * var6 + (float) (var24.field6914 >> 12) * var5 + (float) (var24.field6911 >> 12) * var4 + var7);
                    if (var20 > var25) {
                        var20 = var25;
                    }
                    this.field5116[var19++] = var25;
                    if (var25 > var21) {
                        var21 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class542.method3194(120, var26) + 1 - this.field5112;
                    var26 = (var26 >> var27) + 2;
                }
                class427 var28 = var22.field6485;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field5120 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field5119[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field5117[var34] = 0;
                    }
                    while (var22 != var28) {
                        class462 var35 = (class462) var28;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field6913;
                            var31 = var35.field6909;
                        }
                        if (var29 > 0 && (var35.field6913 != var30 || var31 != var35.field6909)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field5116[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field5119[var36] >= 64) {
                                label191: {
                                    if (this.field5119[var36] == 64) {
                                        if (this.field5120 == 64) {
                                            break label191;
                                        }
                                        this.field5119[var36] += this.field5120++ + 1;
                                    }
                                    this.field5118[this.field5119[var36] - 65][this.field5117[this.field5119[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field5115[var36][this.field5119[var36]++] = var35;
                            }
                        }
                        var28 = var28.field6485;
                    }
                    if (var30 < 0) {
                        arg2.method2075(null, 0);
                    } else {
                        arg2.method2075(arg2.field4884.method505((byte) -117, var30), 0);
                        arg2.method2045(34023, arg2.field2235.method157((byte) 119, var30).field1512);
                    }
                    if (var31 && class316.field4600 != arg2.field4953) {
                        arg2.method829(class316.field4600);
                    } else if (arg2.field4953 != 1.0F) {
                        arg2.method829(1.0F);
                    }
                    this.method2120(arg2, var26, -17559);
                }
            }
            if (arg1 > -98) {
                this.method2119(null, -82);
            }
        } catch (Exception var37) {
        }
        this.method2119(arg2, 16385);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLnq;)V", line = 292)
    private final void method2115(byte arg0, class325 arg1) {
        field5103++;
        if (arg0 != 62) {
            this.field5111 = null;
        }
        class316.field4600 = arg1.field4953;
        arg1.method2078((byte) -60);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2083((byte) 84, false);
        arg1.method2015(-2, (byte) -121);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lnq;I)V", line = 318)
    public final void method2116(class325 arg0, int arg1) {
        if (arg1 <= 107) {
            this.method2116(null, -28);
        }
        field5102++;
        this.field5114 = arg0.method2048(null, 196584, -1, true, 24);
        this.field5108 = new class129(this.field5114, 5126, 2, 0);
        this.field5111 = new class129(this.field5114, 5126, 3, 8);
        this.field5109 = new class129(this.field5114, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILwk;IZ)V", line = 332)
    public static final void method2117(int arg0, class96 arg1, int arg2, boolean arg3) {
        field5101++;
        if (arg1.field3871 == arg0 && arg0 != -1) {
            class91 var4 = class201.field2707.method489(97, arg0);
            int var5 = var4.field1340;
            if (var5 == 1) {
                arg1.field3851 = 0;
                arg1.field3842 = 0;
                arg1.field3877 = 1;
                arg1.field3886 = arg2;
                arg1.field3880 = 0;
                class441.method2669(arg3, var4, arg1.field1866, arg1.field3842, arg1.field1867, arg1.field1862, class56.field800 == arg1);
            }
            if (var5 == 2) {
                arg1.field3851 = 0;
            }
        } else if (arg0 == -1 || arg1.field3871 == -1 || class201.field2707.method489(71, arg0).field1332 >= class201.field2707.method489(86, arg1.field3871).field1332) {
            arg1.field3851 = 0;
            arg1.field3880 = 0;
            arg1.field3877 = 1;
            arg1.field3871 = arg0;
            arg1.field3886 = arg2;
            arg1.field3842 = 0;
            arg1.field3910 = arg1.field3918;
            if (arg1.field3871 != -1) {
                class441.method2669(false, class201.field2707.method489(44, arg1.field3871), arg1.field1866, arg1.field3842, arg1.field1867, arg1.field1862, class56.field800 == arg1);
            }
        }
        if (arg3) {
            method2118((byte) -95, 16L);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BJ)V", line = 381)
    public static final void method2118(byte arg0, long arg1) {
        field5113++;
        int var3 = class76.field1109 + class56.field800.field1867;
        int var4 = class434.field6591 + class56.field800.field1862;
        if (class366.field5609 - var3 < -500 || (class366.field5609 - var3) > 500 || (class312.field4571 - var4) < -500 || class312.field4571 - var4 > 500) {
            class366.field5609 = var3;
            class312.field4571 = var4;
        }
        if (arg0 != -60) {
            method2117(-110, null, -44, false);
        }
        if (class366.field5609 != var3) {
            int var5 = var3 - class366.field5609;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class366.field5609 += var6;
        }
        if (class312.field4571 != var4) {
            int var7 = var4 - class312.field4571;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class312.field4571 += var8;
        }
        if (!class203.field2716.field1180) {
            class53.field744 += (float) arg1 * class138.field1845 / 6.0F;
            class536.field7870 += (float) arg1 * class172.field2319 / 6.0F;
        }
        class89.method598((byte) 123);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lnq;I)V", line = 479)
    private final void method2119(class325 arg0, int arg1) {
        field5100++;
        arg0.method2083((byte) -125, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg1);
        if (class316.field4600 != arg0.field4953) {
            arg0.method829(class316.field4600);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lnq;II)V", line = 500)
    private final void method2120(class325 arg0, int arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field5098, 0);
        field5105++;
        float var4 = this.field5098[0];
        float var5 = this.field5098[4];
        float var6 = this.field5098[8];
        float var7 = this.field5098[1];
        if (arg2 != -17559) {
            return;
        }
        float var8 = this.field5098[5];
        float var9 = this.field5098[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field5106.field2185 = 0;
        if (arg0.field4974) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field5119[var44] <= 64 ? this.field5119[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class462 var59 = this.field5115[var44][var46];
                        int var60 = var59.field6917;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6911 >> 12);
                        float var66 = (float) (var59.field6914 >> 12);
                        float var67 = (float) (var59.field6918 >> 12);
                        int var68 = var59.field6910 >> 12;
                        this.field5106.method1821(arg2 ^ 0x646C, 0.0F);
                        this.field5106.method1821(arg2 + 9116, 0.0F);
                        this.field5106.method1821(-8443, (float) (-var68) * var10 + var65);
                        this.field5106.method1821(-8443, (float) (-var68) * var11 + var66);
                        this.field5106.method1821(-8443, (float) (-var68) * var12 + var67);
                        this.field5106.method1072((byte) 102, var61);
                        this.field5106.method1072((byte) 102, var62);
                        this.field5106.method1072((byte) 102, var63);
                        this.field5106.method1072((byte) 102, var64);
                        this.field5106.method1821(-8443, 1.0F);
                        this.field5106.method1821(arg2 ^ 0x646C, 0.0F);
                        this.field5106.method1821(-8443, (float) var68 * var13 + var65);
                        this.field5106.method1821(-8443, (float) var68 * var14 + var66);
                        this.field5106.method1821(-8443, (float) var68 * var15 + var67);
                        this.field5106.method1072((byte) 102, var61);
                        this.field5106.method1072((byte) 102, var62);
                        this.field5106.method1072((byte) 102, var63);
                        this.field5106.method1072((byte) 102, var64);
                        this.field5106.method1821(-8443, 1.0F);
                        this.field5106.method1821(-8443, 1.0F);
                        this.field5106.method1821(-8443, (float) var68 * var10 + var65);
                        this.field5106.method1821(-8443, (float) var68 * var11 + var66);
                        this.field5106.method1821(-8443, (float) var68 * var12 + var67);
                        this.field5106.method1072((byte) 102, var61);
                        this.field5106.method1072((byte) 102, var62);
                        this.field5106.method1072((byte) 102, var63);
                        this.field5106.method1072((byte) 102, var64);
                        this.field5106.method1821(arg2 ^ 0x646C, 0.0F);
                        this.field5106.method1821(-8443, 1.0F);
                        this.field5106.method1821(-8443, (float) var68 * var16 + var65);
                        this.field5106.method1821(-8443, (float) var68 * var17 + var66);
                        this.field5106.method1821(arg2 + 9116, (float) var68 * var18 + var67);
                        this.field5106.method1072((byte) 102, var61);
                        this.field5106.method1072((byte) 102, var62);
                        this.field5106.method1072((byte) 102, var63);
                        this.field5106.method1072((byte) 102, var64);
                    }
                    if (this.field5119[var44] > 64) {
                        int var47 = this.field5119[var44] - 64 - 1;
                        for (int var48 = this.field5117[var47] - 1; var48 >= 0; var48--) {
                            class462 var49 = this.field5118[var47][var48];
                            int var50 = var49.field6917;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6911 >> 12);
                            float var56 = (float) (var49.field6914 >> 12);
                            float var57 = (float) (var49.field6918 >> 12);
                            int var58 = var49.field6910 >> 12;
                            this.field5106.method1821(arg2 ^ 0x646C, 0.0F);
                            this.field5106.method1821(-8443, 0.0F);
                            this.field5106.method1821(-8443, (float) (-var58) * var10 + var55);
                            this.field5106.method1821(-8443, (float) (-var58) * var11 + var56);
                            this.field5106.method1821(arg2 + 9116, (float) (-var58) * var12 + var57);
                            this.field5106.method1072((byte) 102, var51);
                            this.field5106.method1072((byte) 102, var52);
                            this.field5106.method1072((byte) 102, var53);
                            this.field5106.method1072((byte) 102, var54);
                            this.field5106.method1821(-8443, 1.0F);
                            this.field5106.method1821(-8443, 0.0F);
                            this.field5106.method1821(arg2 ^ 0x646C, (float) var58 * var13 + var55);
                            this.field5106.method1821(arg2 + 9116, (float) var58 * var14 + var56);
                            this.field5106.method1821(-8443, (float) var58 * var15 + var57);
                            this.field5106.method1072((byte) 102, var51);
                            this.field5106.method1072((byte) 102, var52);
                            this.field5106.method1072((byte) 102, var53);
                            this.field5106.method1072((byte) 102, var54);
                            this.field5106.method1821(-8443, 1.0F);
                            this.field5106.method1821(-8443, 1.0F);
                            this.field5106.method1821(arg2 + 9116, (float) var58 * var10 + var55);
                            this.field5106.method1821(arg2 ^ 0x646C, (float) var58 * var11 + var56);
                            this.field5106.method1821(-8443, (float) var58 * var12 + var57);
                            this.field5106.method1072((byte) 102, var51);
                            this.field5106.method1072((byte) 102, var52);
                            this.field5106.method1072((byte) 102, var53);
                            this.field5106.method1072((byte) 102, var54);
                            this.field5106.method1821(-8443, 0.0F);
                            this.field5106.method1821(-8443, 1.0F);
                            this.field5106.method1821(-8443, (float) var58 * var16 + var55);
                            this.field5106.method1821(-8443, (float) var58 * var17 + var56);
                            this.field5106.method1821(-8443, (float) var58 * var18 + var57);
                            this.field5106.method1072((byte) 102, var51);
                            this.field5106.method1072((byte) 102, var52);
                            this.field5106.method1072((byte) 102, var53);
                            this.field5106.method1072((byte) 102, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field5119[var19] <= 64 ? this.field5119[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class462 var34 = this.field5115[var19][var21];
                        int var35 = var34.field6917;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6911 >> 12);
                        float var41 = (float) (var34.field6914 >> 12);
                        float var42 = (float) (var34.field6918 >> 12);
                        int var43 = var34.field6910 >> 12;
                        this.field5106.method1823(arg2 + 17591, 0.0F);
                        this.field5106.method1823(32, 0.0F);
                        this.field5106.method1823(32, (float) (-var43) * var10 + var40);
                        this.field5106.method1823(32, (float) (-var43) * var11 + var41);
                        this.field5106.method1823(32, (float) (-var43) * var12 + var42);
                        this.field5106.method1072((byte) 102, var36);
                        this.field5106.method1072((byte) 102, var37);
                        this.field5106.method1072((byte) 102, var38);
                        this.field5106.method1072((byte) 102, var39);
                        this.field5106.method1823(32, 1.0F);
                        this.field5106.method1823(32, 0.0F);
                        this.field5106.method1823(32, (float) var43 * var13 + var40);
                        this.field5106.method1823(arg2 ^ 0xFFFFBB49, (float) var43 * var14 + var41);
                        this.field5106.method1823(32, (float) var43 * var15 + var42);
                        this.field5106.method1072((byte) 102, var36);
                        this.field5106.method1072((byte) 102, var37);
                        this.field5106.method1072((byte) 102, var38);
                        this.field5106.method1072((byte) 102, var39);
                        this.field5106.method1823(32, 1.0F);
                        this.field5106.method1823(32, 1.0F);
                        this.field5106.method1823(32, (float) var43 * var10 + var40);
                        this.field5106.method1823(32, (float) var43 * var11 + var41);
                        this.field5106.method1823(32, (float) var43 * var12 + var42);
                        this.field5106.method1072((byte) 102, var36);
                        this.field5106.method1072((byte) 102, var37);
                        this.field5106.method1072((byte) 102, var38);
                        this.field5106.method1072((byte) 102, var39);
                        this.field5106.method1823(32, 0.0F);
                        this.field5106.method1823(32, 1.0F);
                        this.field5106.method1823(arg2 + 17591, (float) var43 * var16 + var40);
                        this.field5106.method1823(32, (float) var43 * var17 + var41);
                        this.field5106.method1823(32, (float) var43 * var18 + var42);
                        this.field5106.method1072((byte) 102, var36);
                        this.field5106.method1072((byte) 102, var37);
                        this.field5106.method1072((byte) 102, var38);
                        this.field5106.method1072((byte) 102, var39);
                    }
                    if (this.field5119[var19] > 64) {
                        int var22 = this.field5119[var19] - 1 - 64;
                        for (int var23 = this.field5117[var22] - 1; var23 >= 0; var23--) {
                            class462 var24 = this.field5118[var22][var23];
                            int var25 = var24.field6917;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6911 >> 12);
                            float var31 = (float) (var24.field6914 >> 12);
                            float var32 = (float) (var24.field6918 >> 12);
                            int var33 = var24.field6910 >> 12;
                            this.field5106.method1823(32, 0.0F);
                            this.field5106.method1823(32, 0.0F);
                            this.field5106.method1823(32, (float) (-var33) * var10 + var30);
                            this.field5106.method1823(32, (float) (-var33) * var11 + var31);
                            this.field5106.method1823(arg2 + 17591, (float) (-var33) * var12 + var32);
                            this.field5106.method1072((byte) 102, var26);
                            this.field5106.method1072((byte) 102, var27);
                            this.field5106.method1072((byte) 102, var28);
                            this.field5106.method1072((byte) 102, var29);
                            this.field5106.method1823(arg2 + 17591, 1.0F);
                            this.field5106.method1823(32, 0.0F);
                            this.field5106.method1823(32, (float) var33 * var13 + var30);
                            this.field5106.method1823(32, (float) var33 * var14 + var31);
                            this.field5106.method1823(arg2 ^ 0xFFFFBB49, (float) var33 * var15 + var32);
                            this.field5106.method1072((byte) 102, var26);
                            this.field5106.method1072((byte) 102, var27);
                            this.field5106.method1072((byte) 102, var28);
                            this.field5106.method1072((byte) 102, var29);
                            this.field5106.method1823(32, 1.0F);
                            this.field5106.method1823(32, 1.0F);
                            this.field5106.method1823(32, (float) var33 * var10 + var30);
                            this.field5106.method1823(32, (float) var33 * var11 + var31);
                            this.field5106.method1823(arg2 + 17591, (float) var33 * var12 + var32);
                            this.field5106.method1072((byte) 102, var26);
                            this.field5106.method1072((byte) 102, var27);
                            this.field5106.method1072((byte) 102, var28);
                            this.field5106.method1072((byte) 102, var29);
                            this.field5106.method1823(32, 0.0F);
                            this.field5106.method1823(32, 1.0F);
                            this.field5106.method1823(arg2 ^ 0xFFFFBB49, (float) var33 * var16 + var30);
                            this.field5106.method1823(32, (float) var33 * var17 + var31);
                            this.field5106.method1823(32, (float) var33 * var18 + var32);
                            this.field5106.method1072((byte) 102, var26);
                            this.field5106.method1072((byte) 102, var27);
                            this.field5106.method1072((byte) 102, var28);
                            this.field5106.method1072((byte) 102, var29);
                        }
                    }
                }
            }
        }
        if (this.field5106.field2185 != 0) {
            this.field5114.method475(24, -29444, this.field5106.field2185, this.field5106.field2219);
            arg0.method2092(this.field5111, null, this.field5108, this.field5109, 18504);
            arg0.method2021(this.field5106.field2185 / 24, 7, (byte) 114, 0);
        }
    }
}
