import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class199 extends class89 {

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    private int field3391 = 1024;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    private int field3400 = 2048;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "I")
    private int field3405 = 1024;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    private int field3402 = 0;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    private int field3403 = 819;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
    private int field3411 = 1024;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    private int field3399 = 1024;

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
    private int field3409 = 409;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    private int field3410 = 0;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "[I")
    public static int[] field3390 = new int[2000];

    @OriginalMember(owner = "client!te", name = "U", descriptor = "Lda;")
    public static class275 field3394 = null;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "Lda;")
    public static class275 field3393 = class255.method1672(112, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!te", name = "W", descriptor = "Lda;")
    public static class275 field3396 = class255.method1672(95, "k");

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "Lda;")
    public static class275 field3414 = class255.method1672(110, ")4l=");

    @OriginalMember(owner = "client!te", name = "X", descriptor = "F")
    public static float field3397;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    private int field3408;

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZ[[ILjava/util/Random;II)V")
    private final void method1302(int arg0, int arg1, boolean arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        ++field3407;
        if (arg2) {
            int var8 = this.field3391 <= 0 ? 4096 : -class116.method845((byte) -121, arg4, this.field3391) + 4096;
            int var9 = this.field3408 * this.field3405 >> 12;
            int var10 = this.field3408 + -(~var9 < -1 ? class116.method845((byte) -61, arg4, var9) : 0);
            if (arg1 >= class65.field1070) {
                arg1 -= class65.field1070;
            }
            if (~var10 >= -1) {
                if (~(arg1 + arg6) < ~class65.field1070) {
                    int var11 = -arg1 + class65.field1070;
                    for (int var12 = 0; ~var12 > ~arg0; ++var12) {
                        int[] var13 = arg3[arg5 + var12];
                        class154.method1090(var13, arg1, var11, var8);
                        class154.method1090(var13, 0, -var11 + arg6, var8);
                    }
                } else {
                    for (int var14 = 0; ~arg0 < ~var14; ++var14) {
                        class154.method1090(arg3[arg5 + var14], arg1, arg6, var8);
                    }
                }
            } else if (arg0 > 0 && ~arg6 < -1) {
                int var15 = arg6 / 2;
                int var16 = ~var15 > ~var10 ? var15 : var10;
                int var17 = arg0 / 2;
                int var18 = arg1 + var16;
                int var19 = ~var17 <= ~var10 ? var10 : var17;
                int var20 = -(var16 * 2) + arg6;
                for (int var21 = 0; ~arg0 < ~var21; ++var21) {
                    int[] var22 = arg3[var21 - -arg5];
                    if (var21 < var19) {
                        int var23 = var8 * var21 / var19;
                        if (this.field3402 != 0) {
                            for (int var24 = 0; ~var16 < ~var24; ++var24) {
                                int var25 = var8 * var24 / var16;
                                var22[class19.method98(arg1 + var24, class1.field11)] = var22[class19.method98(-var24 + -1 + arg1 + arg6, class1.field11)] = var25 >= var23 ? var23 : var25;
                            }
                        } else {
                            for (int var26 = 0; var26 < var16; ++var26) {
                                int var28 = var8 * var26 / var16;
                                var22[class19.method98(class1.field11, arg1 + var26)] = var22[class19.method98(class1.field11, arg1 + arg6 + -var26 + -1)] = var23 * var28 >> 12;
                            }
                        }
                        if (~(var18 + var20) >= ~class65.field1070) {
                            class154.method1090(var22, var18, var20, var23);
                        } else {
                            int var27 = -var18 + class65.field1070;
                            class154.method1090(var22, var18, var27, var23);
                            class154.method1090(var22, 0, -var27 + var20, var23);
                        }
                    } else {
                        int var29 = arg0 + -1 - var21;
                        if (~var19 < ~var29) {
                            int var30 = var8 * var29 / var19;
                            if (~this.field3402 == -1) {
                                for (int var31 = 0; ~var31 > ~var16; ++var31) {
                                    int var32 = var8 * var31 / var16;
                                    var22[class19.method98(arg1 + var31, class1.field11)] = var22[class19.method98(-var31 + arg1 + arg6 + -1, class1.field11)] = var30 * var32 >> 12;
                                }
                            } else {
                                for (int var33 = 0; var16 > var33; ++var33) {
                                    int var35 = var8 * var33 / var16;
                                    var22[class19.method98(arg1 - -var33, class1.field11)] = var22[class19.method98(arg1 - (-arg6 + var33 + 1), class1.field11)] = ~var30 >= ~var35 ? var30 : var35;
                                }
                            }
                            if (class65.field1070 >= var18 + var20) {
                                class154.method1090(var22, var18, var20, var30);
                            } else {
                                int var34 = -var18 + class65.field1070;
                                class154.method1090(var22, var18, var34, var30);
                                class154.method1090(var22, 0, var20 - var34, var30);
                            }
                        } else {
                            for (int var36 = 0; var16 > var36; ++var36) {
                                var22[class19.method98(arg1 - -var36, class1.field11)] = var22[class19.method98(arg1 + arg6 + -var36 + -1, class1.field11)] = var8 * var36 / var16;
                            }
                            if (~(var18 + var20) >= ~class65.field1070) {
                                class154.method1090(var22, var18, var20, var8);
                            } else {
                                int var37 = class65.field1070 - var18;
                                class154.method1090(var22, var18, var37, var8);
                                class154.method1090(var22, 0, var20 - var37, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field3413;
        if (arg1) {
            method1306((byte) -51, (class229[]) null, -11);
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -50);
        if (super.field1503.field664) {
            int[][] var4 = super.field1503.method226((byte) -59);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            boolean var13 = true;
            int var14 = class65.field1070 * this.field3399 >> 12;
            int var15 = class65.field1070 * this.field3400 >> 12;
            int var16 = class16.field242 * this.field3409 >> 12;
            int var17 = class16.field242 * this.field3403 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field3408 = class65.field1070 / 8 * this.field3411 >> 12;
                int var18 = 1 - -(class65.field1070 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3410);
                while (true) {
                    while (true) {
                        int var22 = class116.method845((byte) -102, var21, -var14 + var15) + var14;
                        int var23 = class116.method845((byte) -112, var21, var17 - var16) + var16;
                        int var24 = var8 + var22;
                        if (var24 > class65.field1070) {
                            var22 = -var8 + class65.field1070;
                            var24 = class65.field1070;
                        }
                        int var27;
                        if (var13) {
                            var27 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            var27 = var26[2];
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class65.field1070;
                            }
                            if (var28 > class65.field1070) {
                                var28 -= class65.field1070;
                            }
                            int var29 = 0;
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var30[0] <= var28 && var30[1] >= var28) {
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class65.field1070;
                                        }
                                        if (~class65.field1070 > ~var31) {
                                            var31 -= class65.field1070;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var29; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var11];
                                            var27 = Math.max(var27, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var29; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var11];
                                            int var35 = var34[2];
                                            if (var27 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var28) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class65.field1070;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method1302(-var35 + var27, var38 - -var7, true, var4, var21, var35, var39 - var38);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (var11 <= var25) {
                                    var25 = 0;
                                }
                                ++var29;
                            }
                        }
                        if (var27 - -var23 > class16.field242) {
                            var23 = -var27 + class16.field242;
                        } else {
                            var10 = false;
                        }
                        if (class65.field1070 != var24) {
                            int[] var41 = var19[var12++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var23 + var27;
                            this.method1302(var23, var6 + var8, true, var4, var21, var27, var22);
                            var8 = var24;
                        } else {
                            this.method1302(var23, var8 - -var6, true, var4, var21, var27, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            var9 = 0;
                            var7 = var6;
                            int[] var42 = var19[var12++];
                            var13 = false;
                            var11 = var12;
                            var42[2] = var23 + var27;
                            var42[0] = var8;
                            var8 = 0;
                            int[][] var43 = var20;
                            var42[1] = var24;
                            var20 = var19;
                            var6 = class116.method845((byte) -128, var21, class65.field1070);
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class65.field1070 + var5;
                            }
                            var12 = 0;
                            if (var44 > class65.field1070) {
                                var44 -= class65.field1070;
                            }
                            var19 = var43;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && var45[1] >= var44) {
                                    break;
                                }
                                int var10000 = ~var11;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 != 1) {
            this.method234(126);
        }
        ++field3398;
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V")
    public static final void method1303(int arg0) {
        class104.method745(5, (byte) 70);
        class54.method348(1, 5);
        class156.method1107(0, 5);
        ++field3392;
        class19.method97(104, arg0);
        class265.method1749(5, (byte) -127);
        class48.method305(5, 0);
        client.method641(0, 5);
        class31.method185(5, (byte) -74);
        class178.method1195(5, 76);
        class53.method330((byte) 115, 5);
        class23.method146((byte) -14, 5);
        class37.method218(50, (byte) 127);
        class195.method1271(5, arg0 + 3);
        class103.method735(5, 1);
        class122.field2193.method988(5, -119);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIZII)V")
    public static final void method1304(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            method1306((byte) 62, (class229[]) null, -27);
        }
        if (~class141.field2493 <= ~arg5 && ~class149.field2603 >= ~arg2) {
            boolean var6;
            if (~arg1 <= ~class246.field4355) {
                if (class96.field1632 >= arg1) {
                    var6 = true;
                } else {
                    arg1 = class96.field1632;
                    var6 = false;
                }
            } else {
                var6 = false;
                arg1 = class246.field4355;
            }
            boolean var7;
            if (arg4 >= class246.field4355) {
                if (~class96.field1632 <= ~arg4) {
                    var7 = true;
                } else {
                    var7 = false;
                    arg4 = class96.field1632;
                }
            } else {
                arg4 = class246.field4355;
                var7 = false;
            }
            if (class149.field2603 > arg5) {
                arg5 = class149.field2603;
            } else {
                class36.method216(class19.field280[arg5++], arg1, arg0, -124, arg4);
            }
            if (arg2 <= class141.field2493) {
                class36.method216(class19.field280[arg2--], arg1, arg0, -127, arg4);
            } else {
                arg2 = class141.field2493;
            }
            if (var6 && var7) {
                for (int var8 = arg5; ~var8 >= ~arg2; ++var8) {
                    int[] var9 = class19.field280[var8];
                    var9[arg1] = var9[arg4] = arg0;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg5; var10 <= arg2; ++var10) {
                        class19.field280[var10][arg4] = arg0;
                    }
                }
            } else {
                for (int var11 = arg5; arg2 >= var11; ++var11) {
                    class19.field280[var11][arg1] = arg0;
                }
            }
        }
        ++field3412;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class199() {
        super(0, true);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 != -20503) {
            method1304(-93, 76, -26, false, -79, -85);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field3391 = arg1.method608(93);
                                        }
                                    } else {
                                        this.field3405 = arg1.method608(47);
                                    }
                                } else {
                                    this.field3402 = arg1.method564((byte) 107);
                                }
                            } else {
                                this.field3411 = arg1.method608(25);
                            }
                        } else {
                            this.field3403 = arg1.method608(68);
                        }
                    } else {
                        this.field3409 = arg1.method608(42);
                    }
                } else {
                    this.field3400 = arg1.method608(19);
                }
            } else {
                this.field3399 = arg1.method608(arg0 ^ -20546);
            }
        } else {
            this.field3410 = arg1.method564((byte) 73);
        }
        ++field3404;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public static void method1305(byte arg0) {
        if (arg0 >= -73) {
            method1305((byte) 67);
        }
        field3414 = null;
        field3396 = null;
        field3390 = null;
        field3394 = null;
        field3393 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B[Lfd;I)V")
    public static final void method1306(byte arg0, class229[] arg1, int arg2) {
        ++field3401;
        for (int var3 = 0; var3 < arg1.length; ++var3) {
            class229 var4 = arg1[var3];
            if (var4 != null && var4.field3992 == arg2 && (!var4.field3884 || !client.method642(var4))) {
                if (var4.field3858 == 0) {
                    if (!var4.field3884 && client.method642(var4) && class184.field3159 != var4) {
                        continue;
                    }
                    method1306((byte) -88, arg1, var4.field3879);
                    if (var4.field3942 != null) {
                        method1306((byte) -88, var4.field3942, var4.field3879);
                    }
                    class112 var5 = (class112) class267.field4633.method1871(arg0 + 88, (long) var4.field3879);
                    if (var5 != null) {
                        class145.method1034((byte) -121, var5.field1977);
                    }
                }
                if (var4.field3858 == 6) {
                    if (var4.field3867 != -1 || var4.field3972 != -1) {
                        boolean var6 = class11.method47((byte) 66, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3972;
                        } else {
                            var7 = var4.field3867;
                        }
                        if (~var7 != 0) {
                            class215 var8 = class201.method1321(128, var7);
                            if (var8 != null) {
                                var4.field3912 += class105.field1829;
                                while (var4.field3912 > var8.field3667[var4.field3863]) {
                                    var4.field3912 -= var8.field3667[var4.field3863];
                                    ++var4.field3863;
                                    if (~var8.field3688.length >= ~var4.field3863) {
                                        var4.field3863 -= var8.field3664;
                                        if (~var4.field3863 > -1 || var8.field3688.length <= var4.field3863) {
                                            var4.field3863 = 0;
                                        }
                                    }
                                    class40.method231(var4, arg0 + 88);
                                }
                            }
                        }
                    }
                    if (~var4.field3927 != -1 && !var4.field3884) {
                        int var9 = var4.field3927 >> 16;
                        int var10 = var4.field3927 << 16 >> 16;
                        int var11 = class105.field1829 * var9;
                        var4.field3940 = var4.field3940 + var11 & 2047;
                        int var12 = class105.field1829 * var10;
                        var4.field3932 = var4.field3932 + var12 & 2047;
                        class40.method231(var4, 0);
                    }
                }
            }
        }
        if (arg0 != -88) {
            field3397 = 0.76318604F;
        }
    }
}
