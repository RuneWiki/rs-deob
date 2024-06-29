import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class143 extends class227 {

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    private int field1895 = 819;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    private int field1898 = 1024;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
    private int field1899 = 1024;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "I")
    private int field1903 = 1024;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    private int field1900 = 409;

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "I")
    private int field1904 = 0;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
    private int field1897 = 1024;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
    private int field1896 = 2048;

    @OriginalMember(owner = "client!eq", name = "W", descriptor = "I")
    private int field1911 = 0;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "Ljc;")
    public static class305 field1902 = new class305("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "F")
    public static float field1907 = 0.0F;

    @OriginalMember(owner = "client!eq", name = "Q", descriptor = "Lao;")
    public static class191 field1905 = new class191(43, 7);

    @OriginalMember(owner = "client!eq", name = "X", descriptor = "Lel;")
    public static class386 field1912 = new class386();

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    private int field1901;

    @OriginalMember(owner = "client!eq", name = "T", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!eq", name = "U", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!eq", name = "V", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!eq", name = "Y", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!eq", name = "R", descriptor = "[I")
    public static int[] field1906;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field1909;
        int[] var3 = super.field3068.method1970(arg1, (byte) 50);
        if (super.field3068.field4480) {
            int[][] var4 = super.field3068.method1973(arg0 ^ -15768);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class446.field6486 * this.field1898 >> 12;
            int var15 = class446.field6486 * this.field1896 >> 12;
            int var16 = class305.field4055 * this.field1900 >> 12;
            int var17 = class305.field4055 * this.field1895 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field1901 = class446.field6486 / 8 * this.field1897 >> 12;
                int var18 = class446.field6486 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field1911);
                while (true) {
                    while (true) {
                        int var22 = class477.method2908((byte) -118, var21, -var14 + var15) + var14;
                        int var23 = class477.method2908((byte) -118, var21, var17 - var16) + var16;
                        int var24 = var8 + var22;
                        if (~var24 < ~class446.field6486) {
                            var22 = -var8 + class446.field6486;
                            var24 = class446.field6486;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class446.field6486;
                            }
                            if (~var28 < ~class446.field6486) {
                                var28 -= class446.field6486;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (~var28 <= ~var29[0] && var29[1] >= var28) {
                                    var30 = var26[2];
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class446.field6486;
                                        }
                                        if (~var31 < ~class446.field6486) {
                                            var31 -= class446.field6486;
                                        }
                                        for (int var32 = 1; var27 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var30 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 < var28) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class446.field6486;
                                                } else {
                                                    var39 = Math.min(var28, var37);
                                                    var38 = 0;
                                                }
                                                this.method875(var21, var4, true, var35, -var35 + var30, var38 - -var7, -var38 + var39);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var27;
                                ++var25;
                                if (var12 <= var25) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (~class305.field4055 > ~(var23 + var30)) {
                            var23 = -var30 + class305.field4055;
                        } else {
                            var10 = false;
                        }
                        if (~class446.field6486 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var30;
                            var41[0] = var8;
                            var41[1] = var24;
                            this.method875(var21, var4, true, var30, var23, var6 + var8, var22);
                            var8 = var24;
                        } else {
                            this.method875(var21, var4, true, var30, var23, var6 + var8, var22);
                            if (var10) {
                                return arg0 != 15811 ? null : var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[0] = var8;
                            var42[1] = var24;
                            var42[2] = var23 + var30;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class477.method2908((byte) -120, var21, class446.field6486);
                            var8 = 0;
                            var5 = var6 - var7;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class446.field6486 + var5;
                            }
                            if (class446.field6486 < var44) {
                                var44 -= class446.field6486;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return arg0 != 15811 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/util/Random;[[IZIIII)V")
    private final void method875(Random arg0, int[][] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1913;
        int var8 = this.field1903 <= 0 ? 4096 : -class477.method2908((byte) 35, arg0, this.field1903) + 4096;
        int var9 = this.field1901 * this.field1899 >> 12;
        int var10 = this.field1901 + -(~var9 < -1 ? class477.method2908((byte) 55, arg0, var9) : 0);
        if (class446.field6486 <= arg5) {
            arg5 -= class446.field6486;
        }
        if (~var10 >= -1) {
            if (~class446.field6486 > ~(arg5 + arg6)) {
                int var11 = -arg5 + class446.field6486;
                for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                    int[] var13 = arg1[arg3 + var12];
                    class438.method2688(var13, arg5, var11, var8);
                    class438.method2688(var13, 0, arg6 - var11, var8);
                }
            } else {
                for (int var14 = 0; ~arg4 < ~var14; ++var14) {
                    class438.method2688(arg1[arg3 + var14], arg5, arg6, var8);
                }
            }
        } else {
            if (~arg4 >= -1 || arg6 <= 0) {
                return;
            }
            int var15 = arg6 / 2;
            int var16 = arg4 / 2;
            int var17 = ~var10 >= ~var15 ? var10 : var15;
            int var18 = var10 > var16 ? var16 : var10;
            int var19 = arg5 - -var17;
            int var20 = -(var17 * 2) + arg6;
            for (int var21 = 0; ~var21 > ~arg4; ++var21) {
                int[] var22 = arg1[arg3 + var21];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field1904 == -1) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class95.method534(class102.field1388, arg5 + var24)] = var22[class95.method534(arg5 - var24 - 1 + arg6, class102.field1388)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class95.method534(class102.field1388, arg5 + var26)] = var22[class95.method534(-var26 + arg5 + -1 + arg6, class102.field1388)] = var23 > var28 ? var28 : var23;
                        }
                    }
                    if (~(var19 + var20) >= ~class446.field6486) {
                        class438.method2688(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class446.field6486;
                        class438.method2688(var22, var19, var27, var23);
                        class438.method2688(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = -var21 + arg4 + -1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field1904 == 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class95.method534(arg5 - -var31, class102.field1388)] = var22[class95.method534(class102.field1388, arg5 + arg6 + -var31 + -1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class95.method534(class102.field1388, arg5 + var33)] = var22[class95.method534(class102.field1388, -var33 + -1 + arg5 + arg6)] = ~var35 <= ~var30 ? var30 : var35;
                            }
                        }
                        if (class446.field6486 < var19 + var20) {
                            int var34 = -var19 + class446.field6486;
                            class438.method2688(var22, var19, var34, var30);
                            class438.method2688(var22, 0, var20 - var34, var30);
                        } else {
                            class438.method2688(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class95.method534(class102.field1388, arg5 + var36)] = var22[class95.method534(-var36 + arg5 - -arg6 + -1, class102.field1388)] = var8 * var36 / var17;
                        }
                        if (var19 + var20 > class446.field6486) {
                            int var37 = class446.field6486 - var19;
                            class438.method2688(var22, var19, var37, var8);
                            class438.method2688(var22, 0, var20 - var37, var8);
                        } else {
                            class438.method2688(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
        if (!arg2) {
            this.method877(96);
        }
    }

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)V")
    public static void method876(int arg0) {
        field1902 = null;
        field1906 = null;
        field1912 = null;
        if (arg0 == -16318) {
            field1905 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
    public final void method877(int arg0) {
        ++field1908;
        if (arg0 != 1) {
            field1906 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
    public class143() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field1903 = arg0.method2386(-23648);
                                        }
                                    } else {
                                        this.field1899 = arg0.method2386(-23648);
                                    }
                                } else {
                                    this.field1904 = arg0.method2388((byte) -117);
                                }
                            } else {
                                this.field1897 = arg0.method2386(-23648);
                            }
                        } else {
                            this.field1895 = arg0.method2386(-23648);
                        }
                    } else {
                        this.field1900 = arg0.method2386(-23648);
                    }
                } else {
                    this.field1896 = arg0.method2386(-23648);
                }
            } else {
                this.field1898 = arg0.method2386(-23648);
            }
        } else {
            this.field1911 = arg0.method2388((byte) -111);
        }
        if (arg1 != 487215116) {
            this.method875((Random) null, (int[][]) null, false, 0, 0, 14, 109);
        }
        ++field1910;
    }
}
