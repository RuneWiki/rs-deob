import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class133 {

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[F")
    private float[] field1867 = new float[16];

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Ldl;")
    private class57 field1870 = new class57(786336);

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    private int field1871 = class565.method3125(-257, 1600);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[[Lcq;")
    private class429[][] field1876 = new class429[64][768];

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
    private int[] field1877 = new int[1600];

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    private int field1880 = 0;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "[I")
    private int[] field1878 = new int[64];

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "[[Lcq;")
    private class429[][] field1881 = new class429[1600][64];

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "[I")
    private int[] field1879 = new int[8191];

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lkh;")
    public static class15 field1868 = new class15();

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lpn;")
    private class682 field1874;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lkca;")
    private class74 field1872;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lkca;")
    private class74 field1873;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lkca;")
    private class74 field1875;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILhfa;Len;)V", line = 5)
    public final void method948(int arg0, class281 arg1, class289 arg2) {
        field1862++;
        if (arg2.field4303 == null) {
            return;
        }
        this.method954(arg2, 127);
        if (arg0 <= 12) {
            this.method953((byte) -119, null);
        }
        float var4 = arg2.field4303.field7126;
        float var5 = arg2.field4303.field7152;
        float var6 = arg2.field4303.field7155;
        float var7 = arg2.field4303.field7141;
        try {
            if (arg1.field3930) {
                int var26 = arg1.field3926 - arg1.field3928;
                int var27;
                if (var26 + 2 <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class565.method3125(-257, var26) + (1 - this.field1871);
                    var26 = (var26 >> var27) + 2;
                }
                class226 var28 = arg1.field3924.field5393;
                class226 var29 = var28.field3254;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field1880 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field1877[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field1878[var34] = 0;
                    }
                    while (var28 != var29) {
                        class429 var35 = (class429) var29;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field6029;
                            var30 = var35.field6024;
                        } else if (var35.field6024 != var30 || var31 != var35.field6029) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field6031 >> 12) * var6 + (float) (var35.field6025 >> 12) * var4 + (float) (var35.field6021 >> 12) * var5 + var7) - arg1.field3928 >> var27;
                        if (var36 < 1600) {
                            if (this.field1877[var36] >= 64) {
                                label149: {
                                    if (this.field1877[var36] == 64) {
                                        if (this.field1880 == 64) {
                                            break label149;
                                        }
                                        this.field1877[var36] += this.field1880++ + 1;
                                    }
                                    this.field1876[this.field1877[var36] - 1 - 64][this.field1878[this.field1877[var36] - 1 - 64]++] = var35;
                                }
                            } else {
                                this.field1881[var36][this.field1877[var36]++] = var35;
                            }
                        }
                        var29 = var29.field3254;
                    }
                    if (var30 >= 0) {
                        arg2.method1789((byte) -51, var30);
                    } else {
                        arg2.method1789((byte) -51, -1);
                    }
                    if (var31 && class146.field2176 != arg2.field4320) {
                        arg2.method465(class146.field2176);
                    } else if (arg2.field4320 != 1.0F) {
                        arg2.method465(1.0F);
                    }
                    this.method949(var26, arg2, -1349117748);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class226 var11 = arg1.field3924.field5393;
                for (class226 var12 = var11.field3254; var12 != var11; var12 = var12.field3254) {
                    class429 var13 = (class429) var12;
                    int var14 = (int) ((float) (var13.field6031 >> 12) * var6 + (float) (var13.field6025 >> 12) * var4 + (float) (var13.field6021 >> 12) * var5 + var7);
                    this.field1879[var8++] = var14;
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    if (var14 < var9) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if (var15 + 2 <= 1600) {
                    var16 = 0;
                    var15 += 2;
                } else {
                    var16 = class565.method3125(-257, var15) + 1 - this.field1871;
                    var15 = (var15 >> var16) + 2;
                }
                class226 var17 = var11.field3254;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field1880 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field1877[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field1878[var23] = 0;
                    }
                    while (var11 != var17) {
                        class429 var24 = (class429) var17;
                        if (var21) {
                            var21 = false;
                            var20 = var24.field6029;
                            var19 = var24.field6024;
                        }
                        if (var18 > 0 && (var24.field6024 != var19 || var20 != var24.field6029)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field1879[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field1877[var25] >= 64) {
                                label194: {
                                    if (this.field1877[var25] == 64) {
                                        if (this.field1880 == 64) {
                                            break label194;
                                        }
                                        this.field1877[var25] += this.field1880++ + 1;
                                    }
                                    this.field1876[this.field1877[var25] - 65][this.field1878[this.field1877[var25] - 64 - 1]++] = var24;
                                }
                            } else {
                                this.field1881[var25][this.field1877[var25]++] = var24;
                            }
                        }
                        var17 = var17.field3254;
                    }
                    if (var19 < 0) {
                        arg2.method1789((byte) -51, -1);
                    } else {
                        arg2.method1789((byte) -51, var19);
                    }
                    if (var20 && class146.field2176 != arg2.field4320) {
                        arg2.method465(class146.field2176);
                    } else if (arg2.field4320 != 1.0F) {
                        arg2.method465(1.0F);
                    }
                    this.method949(var15, arg2, -1349117748);
                }
            }
        } catch (Exception var37) {
        }
        this.method953((byte) -87, arg2);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILen;I)V", line = 286)
    private final void method949(int arg0, class289 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field1867, 0);
        field1863++;
        float var4 = this.field1867[0];
        float var5 = this.field1867[4];
        float var6 = this.field1867[8];
        float var7 = this.field1867[1];
        float var8 = this.field1867[5];
        if (arg2 != -1349117748) {
            return;
        }
        float var9 = this.field1867[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field1870.field1301 = 0;
        if (arg1.field4362) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field1877[var44] <= 64 ? this.field1877[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class429 var59 = this.field1881[var44][var46];
                        int var60 = var59.field6023;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6025 >> 12);
                        float var66 = (float) (var59.field6021 >> 12);
                        float var67 = (float) (var59.field6031 >> 12);
                        int var68 = var59.field6028 >> 12;
                        this.field1870.method503((byte) 30, 0.0F);
                        this.field1870.method503((byte) 30, 0.0F);
                        this.field1870.method503((byte) 30, (float) (-var68) * var10 + var65);
                        this.field1870.method503((byte) 30, (float) (-var68) * var11 + var66);
                        this.field1870.method503((byte) 30, (float) (-var68) * var12 + var67);
                        this.field1870.method746((byte) -104, var61);
                        this.field1870.method746((byte) -104, var62);
                        this.field1870.method746((byte) -110, var63);
                        this.field1870.method746((byte) -124, var64);
                        this.field1870.method503((byte) 30, 1.0F);
                        this.field1870.method503((byte) 30, 0.0F);
                        this.field1870.method503((byte) 30, (float) var68 * var13 + var65);
                        this.field1870.method503((byte) 30, (float) var68 * var14 + var66);
                        this.field1870.method503((byte) 30, (float) var68 * var15 + var67);
                        this.field1870.method746((byte) -111, var61);
                        this.field1870.method746((byte) -100, var62);
                        this.field1870.method746((byte) -122, var63);
                        this.field1870.method746((byte) -98, var64);
                        this.field1870.method503((byte) 30, 1.0F);
                        this.field1870.method503((byte) 30, 1.0F);
                        this.field1870.method503((byte) 30, (float) var68 * var10 + var65);
                        this.field1870.method503((byte) 30, (float) var68 * var11 + var66);
                        this.field1870.method503((byte) 30, (float) var68 * var12 + var67);
                        this.field1870.method746((byte) -97, var61);
                        this.field1870.method746((byte) -100, var62);
                        this.field1870.method746((byte) -117, var63);
                        this.field1870.method746((byte) -100, var64);
                        this.field1870.method503((byte) 30, 0.0F);
                        this.field1870.method503((byte) 30, 1.0F);
                        this.field1870.method503((byte) 30, (float) var68 * var16 + var65);
                        this.field1870.method503((byte) 30, (float) var68 * var17 + var66);
                        this.field1870.method503((byte) 30, (float) var68 * var18 + var67);
                        this.field1870.method746((byte) -88, var61);
                        this.field1870.method746((byte) -93, var62);
                        this.field1870.method746((byte) -123, var63);
                        this.field1870.method746((byte) -104, var64);
                    }
                    if (this.field1877[var44] > 64) {
                        int var47 = this.field1877[var44] - 64 - 1;
                        for (int var48 = this.field1878[var47] - 1; var48 >= 0; var48--) {
                            class429 var49 = this.field1876[var47][var48];
                            int var50 = var49.field6023;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6025 >> 12);
                            float var56 = (float) (var49.field6021 >> 12);
                            float var57 = (float) (var49.field6031 >> 12);
                            int var58 = var49.field6028 >> 12;
                            this.field1870.method503((byte) 30, 0.0F);
                            this.field1870.method503((byte) 30, 0.0F);
                            this.field1870.method503((byte) 30, (float) (-var58) * var10 + var55);
                            this.field1870.method503((byte) 30, (float) (-var58) * var11 + var56);
                            this.field1870.method503((byte) 30, (float) (-var58) * var12 + var57);
                            this.field1870.method746((byte) -112, var51);
                            this.field1870.method746((byte) -98, var52);
                            this.field1870.method746((byte) -117, var53);
                            this.field1870.method746((byte) -126, var54);
                            this.field1870.method503((byte) 30, 1.0F);
                            this.field1870.method503((byte) 30, 0.0F);
                            this.field1870.method503((byte) 30, (float) var58 * var13 + var55);
                            this.field1870.method503((byte) 30, (float) var58 * var14 + var56);
                            this.field1870.method503((byte) 30, (float) var58 * var15 + var57);
                            this.field1870.method746((byte) -124, var51);
                            this.field1870.method746((byte) -104, var52);
                            this.field1870.method746((byte) -86, var53);
                            this.field1870.method746((byte) -115, var54);
                            this.field1870.method503((byte) 30, 1.0F);
                            this.field1870.method503((byte) 30, 1.0F);
                            this.field1870.method503((byte) 30, (float) var58 * var10 + var55);
                            this.field1870.method503((byte) 30, (float) var58 * var11 + var56);
                            this.field1870.method503((byte) 30, (float) var58 * var12 + var57);
                            this.field1870.method746((byte) -104, var51);
                            this.field1870.method746((byte) -94, var52);
                            this.field1870.method746((byte) -111, var53);
                            this.field1870.method746((byte) -113, var54);
                            this.field1870.method503((byte) 30, 0.0F);
                            this.field1870.method503((byte) 30, 1.0F);
                            this.field1870.method503((byte) 30, (float) var58 * var16 + var55);
                            this.field1870.method503((byte) 30, (float) var58 * var17 + var56);
                            this.field1870.method503((byte) 30, (float) var58 * var18 + var57);
                            this.field1870.method746((byte) -112, var51);
                            this.field1870.method746((byte) -126, var52);
                            this.field1870.method746((byte) -89, var53);
                            this.field1870.method746((byte) -110, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field1877[var19] > 64 ? 64 : this.field1877[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class429 var34 = this.field1881[var19][var21];
                        int var35 = var34.field6023;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6025 >> 12);
                        float var41 = (float) (var34.field6021 >> 12);
                        float var42 = (float) (var34.field6031 >> 12);
                        int var43 = var34.field6028 >> 12;
                        this.field1870.method501(0.0F, arg2 + 1349117860);
                        this.field1870.method501(0.0F, 115);
                        this.field1870.method501((float) (-var43) * var10 + var40, 126);
                        this.field1870.method501((float) (-var43) * var11 + var41, 114);
                        this.field1870.method501((float) (-var43) * var12 + var42, 126);
                        this.field1870.method746((byte) -103, var36);
                        this.field1870.method746((byte) -89, var37);
                        this.field1870.method746((byte) -100, var38);
                        this.field1870.method746((byte) -116, var39);
                        this.field1870.method501(1.0F, arg2 + 1349117870);
                        this.field1870.method501(0.0F, 113);
                        this.field1870.method501((float) var43 * var13 + var40, 118);
                        this.field1870.method501((float) var43 * var14 + var41, arg2 + 1349117867);
                        this.field1870.method501((float) var43 * var15 + var42, 123);
                        this.field1870.method746((byte) -102, var36);
                        this.field1870.method746((byte) -120, var37);
                        this.field1870.method746((byte) -110, var38);
                        this.field1870.method746((byte) -99, var39);
                        this.field1870.method501(1.0F, 121);
                        this.field1870.method501(1.0F, arg2 ^ 0xAF9618B6);
                        this.field1870.method501((float) var43 * var10 + var40, 119);
                        this.field1870.method501((float) var43 * var11 + var41, arg2 ^ 0xAF9618A3);
                        this.field1870.method501((float) var43 * var12 + var42, 116);
                        this.field1870.method746((byte) -123, var36);
                        this.field1870.method746((byte) -115, var37);
                        this.field1870.method746((byte) -94, var38);
                        this.field1870.method746((byte) -88, var39);
                        this.field1870.method501(0.0F, 123);
                        this.field1870.method501(1.0F, 120);
                        this.field1870.method501((float) var43 * var16 + var40, 114);
                        this.field1870.method501((float) var43 * var17 + var41, 113);
                        this.field1870.method501((float) var43 * var18 + var42, 124);
                        this.field1870.method746((byte) -116, var36);
                        this.field1870.method746((byte) -102, var37);
                        this.field1870.method746((byte) -88, var38);
                        this.field1870.method746((byte) -128, var39);
                    }
                    if (this.field1877[var19] > 64) {
                        int var22 = this.field1877[var19] - 64 - 1;
                        for (int var23 = this.field1878[var22] - 1; var23 >= 0; var23--) {
                            class429 var24 = this.field1876[var22][var23];
                            int var25 = var24.field6023;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6025 >> 12);
                            float var31 = (float) (var24.field6021 >> 12);
                            float var32 = (float) (var24.field6031 >> 12);
                            int var33 = var24.field6028 >> 12;
                            this.field1870.method501(0.0F, arg2 + 1349117875);
                            this.field1870.method501(0.0F, 112);
                            this.field1870.method501((float) (-var33) * var10 + var30, 111);
                            this.field1870.method501((float) (-var33) * var11 + var31, 126);
                            this.field1870.method501((float) (-var33) * var12 + var32, arg2 ^ 0xAF9618B3);
                            this.field1870.method746((byte) -119, var26);
                            this.field1870.method746((byte) -100, var27);
                            this.field1870.method746((byte) -97, var28);
                            this.field1870.method746((byte) -109, var29);
                            this.field1870.method501(1.0F, 126);
                            this.field1870.method501(0.0F, arg2 + 1349117873);
                            this.field1870.method501((float) var33 * var13 + var30, 118);
                            this.field1870.method501((float) var33 * var14 + var31, 119);
                            this.field1870.method501((float) var33 * var15 + var32, 118);
                            this.field1870.method746((byte) -115, var26);
                            this.field1870.method746((byte) -99, var27);
                            this.field1870.method746((byte) -108, var28);
                            this.field1870.method746((byte) -113, var29);
                            this.field1870.method501(1.0F, 121);
                            this.field1870.method501(1.0F, 122);
                            this.field1870.method501((float) var33 * var10 + var30, 118);
                            this.field1870.method501((float) var33 * var11 + var31, 121);
                            this.field1870.method501((float) var33 * var12 + var32, 121);
                            this.field1870.method746((byte) -95, var26);
                            this.field1870.method746((byte) -116, var27);
                            this.field1870.method746((byte) -123, var28);
                            this.field1870.method746((byte) -114, var29);
                            this.field1870.method501(0.0F, 126);
                            this.field1870.method501(1.0F, arg2 + 1349117859);
                            this.field1870.method501((float) var33 * var16 + var30, 127);
                            this.field1870.method501((float) var33 * var17 + var31, 111);
                            this.field1870.method501((float) var33 * var18 + var32, 127);
                            this.field1870.method746((byte) -103, var26);
                            this.field1870.method746((byte) -122, var27);
                            this.field1870.method746((byte) -110, var28);
                            this.field1870.method746((byte) -112, var29);
                        }
                    }
                }
            }
        }
        if (this.field1870.field1301 != 0) {
            this.field1874.method2001(arg2 ^ 0x5069E70D, 24, this.field1870.field1316, this.field1870.field1301);
            arg1.method1744(this.field1875, (byte) -99, this.field1873, this.field1872, null);
            arg1.method1759(0, 7, arg2 + 1349117748, this.field1870.field1301 / 24);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 641)
    public static final void method950(byte arg0, String arg1) {
        field1864++;
        if (!class457.field6455) {
            return;
        }
        boolean var2 = false;
        int var3 = class64.field851;
        int[] var4 = class53.field759;
        for (int var5 = 0; var5 < var3; var5++) {
            class286 var6 = class495.field6821[var4[var5]];
            if (var6 != null && class253.field3576 != var6 && var6.field3975 != null && var6.field3975.equalsIgnoreCase(arg1)) {
                class568.field7649++;
                class1.method5(1, class175.field2615);
                class288.field4014.method731(-2045573048, class366.field5205);
                class288.field4014.method701(8388607, class677.field9549);
                class288.field4014.method731(-2045573048, var4[var5]);
                class288.field4014.method744(-36, 0);
                class288.field4014.method731(-2045573048, class117.field1560);
                class524.method2903(var6.method1722((byte) -120), var6.method1722((byte) -126), true, -2, var6.field6483[0], 0, 0, 0, var6.field6477[0]);
                var2 = true;
                break;
            }
        }
        if (arg0 <= 51) {
            return;
        }
        if (!var2) {
            class235.method1482(4, 24658, class9.field155.method42(class666.field9377, 19572) + arg1);
        }
        if (class457.field6455) {
            class651.method3622(-1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 695)
    public static void method951(int arg0) {
        field1868 = null;
        if (arg0 < 116) {
            method951(-75);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Len;I)V", line = 706)
    public final void method952(class289 arg0, int arg1) {
        field1869++;
        this.field1874 = arg0.method1786(null, true, 24, (byte) -104, 196584);
        this.field1873 = new class74(this.field1874, 5126, 2, 0);
        this.field1875 = new class74(this.field1874, 5126, 3, 8);
        this.field1872 = new class74(this.field1874, arg1, 4, 20);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLen;)V", line = 717)
    private final void method953(byte arg0, class289 arg1) {
        arg1.method1805(true, (byte) 58);
        if (arg0 > -62) {
            this.method953((byte) 33, null);
        }
        field1865++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class146.field2176 != arg1.field4320) {
            arg1.method465(class146.field2176);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Len;I)V", line = 735)
    private final void method954(class289 arg0, int arg1) {
        class146.field2176 = arg0.field4320;
        field1866++;
        arg0.method1800(false);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1805(false, (byte) 58);
        int var3 = 101 % ((87 - arg1) / 35);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
