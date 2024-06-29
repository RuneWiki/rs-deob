import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class309 extends class56 {

    @OriginalMember(owner = "client!gga", name = "H", descriptor = "I")
    private int field3833 = 2048;

    @OriginalMember(owner = "client!gga", name = "E", descriptor = "I")
    private int field3830 = 1024;

    @OriginalMember(owner = "client!gga", name = "L", descriptor = "I")
    private int field3837 = 0;

    @OriginalMember(owner = "client!gga", name = "O", descriptor = "I")
    private int field3840 = 1024;

    @OriginalMember(owner = "client!gga", name = "I", descriptor = "I")
    private int field3834 = 1024;

    @OriginalMember(owner = "client!gga", name = "K", descriptor = "I")
    private int field3836 = 819;

    @OriginalMember(owner = "client!gga", name = "P", descriptor = "I")
    private int field3841 = 1024;

    @OriginalMember(owner = "client!gga", name = "R", descriptor = "I")
    private int field3843 = 0;

    @OriginalMember(owner = "client!gga", name = "T", descriptor = "I")
    private int field3845 = 409;

    @OriginalMember(owner = "client!gga", name = "M", descriptor = "Lwv;")
    public static class37 field3838 = new class37();

    @OriginalMember(owner = "client!gga", name = "S", descriptor = "Llja;")
    public static class744 field3844 = new class744(6, 2);

    @OriginalMember(owner = "client!gga", name = "V", descriptor = "Z")
    public static boolean field3847 = false;

    @OriginalMember(owner = "client!gga", name = "D", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!gga", name = "F", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!gga", name = "G", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!gga", name = "J", descriptor = "I")
    private int field3835;

    @OriginalMember(owner = "client!gga", name = "N", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!gga", name = "Q", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!gga", name = "U", descriptor = "Ltu;")
    public static class369 field3846;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZILjava/util/Random;II[[I)V")
    private final void method1827(int arg0, boolean arg1, int arg2, Random arg3, int arg4, int arg5, int[][] arg6) {
        ++field3829;
        int var8 = ~this.field3841 >= -1 ? 4096 : 4096 - class93.method822(arg3, -1, this.field3841);
        int var9 = this.field3840 * this.field3835 >> 12;
        if (arg1) {
            this.field3837 = -48;
        }
        int var10 = this.field3835 - (~var9 < -1 ? class93.method822(arg3, -1, var9) : 0);
        if (~class642.field8759 >= ~arg2) {
            arg2 -= class642.field8759;
        }
        if (var10 <= 0) {
            if (arg2 + arg4 > class642.field8759) {
                int var11 = -arg2 + class642.field8759;
                for (int var12 = 0; ~var12 > ~arg5; ++var12) {
                    int[] var13 = arg6[arg0 - -var12];
                    class211.method1333(var13, arg2, var11, var8);
                    class211.method1333(var13, 0, -var11 + arg4, var8);
                }
            } else {
                for (int var14 = 0; ~var14 > ~arg5; ++var14) {
                    class211.method1333(arg6[arg0 + var14], arg2, arg4, var8);
                }
            }
        } else if (arg5 > 0 && arg4 > 0) {
            int var15 = arg4 / 2;
            int var16 = arg5 / 2;
            int var17 = ~var15 > ~var10 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg2 + var17;
            int var20 = arg4 - var17 * 2;
            for (int var21 = 0; ~arg5 < ~var21; ++var21) {
                int[] var22 = arg6[var21 - -arg0];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field3843 != 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class296.method1733(class446.field5990, arg2 + var24)] = var22[class296.method1733(arg2 + arg4 + -var24 - 1, class446.field5990)] = var25 >= var23 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class296.method1733(arg2 + var26, class446.field5990)] = var22[class296.method1733(arg2 - (var26 + 1) + arg4, class446.field5990)] = var23 * var28 >> 12;
                        }
                    }
                    if (class642.field8759 >= var19 - -var20) {
                        class211.method1333(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class642.field8759;
                        class211.method1333(var22, var19, var27, var23);
                        class211.method1333(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg5 + -1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field3843 != 0) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class296.method1733(class446.field5990, arg2 + var31)] = var22[class296.method1733(-var31 + arg4 + arg2 + -1, class446.field5990)] = var30 <= var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class296.method1733(class446.field5990, arg2 + var33)] = var22[class296.method1733(class446.field5990, -var33 - 1 + arg2 + arg4)] = var30 * var35 >> 12;
                            }
                        }
                        if (~(var19 + var20) < ~class642.field8759) {
                            int var34 = -var19 + class642.field8759;
                            class211.method1333(var22, var19, var34, var30);
                            class211.method1333(var22, 0, -var34 + var20, var30);
                        } else {
                            class211.method1333(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class296.method1733(class446.field5990, arg2 + var36)] = var22[class296.method1733(arg2 - -arg4 + (-var36 - 1), class446.field5990)] = var8 * var36 / var17;
                        }
                        if (var19 - -var20 > class642.field8759) {
                            int var37 = -var19 + class642.field8759;
                            class211.method1333(var22, var19, var37, var8);
                            class211.method1333(var22, 0, var20 - var37, var8);
                        } else {
                            class211.method1333(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        int var2 = 122 % ((arg0 - 37) / 62);
        ++field3839;
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)V")
    public static void method1828(int arg0) {
        field3838 = null;
        field3846 = null;
        field3844 = null;
        if (arg0 != 0) {
            field3838 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(IIB)Z")
    public static final boolean method1829(int arg0, int arg1, byte arg2) {
        ++field3832;
        if (arg2 != -12) {
            method1828(56);
        }
        return class93.method826(arg1, arg0, (byte) 114) | ~(2048 & arg0) != -1 || class388.method2276(arg0, -5845, arg1);
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "()V")
    public class309() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field3842;
        if (arg0 <= -44) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 != 6) {
                                        if (arg1 != 7) {
                                            if (arg1 == 8) {
                                                this.field3841 = arg2.method2390((byte) -128);
                                            }
                                        } else {
                                            this.field3840 = arg2.method2390((byte) -113);
                                        }
                                    } else {
                                        this.field3843 = arg2.method2396((byte) 43);
                                    }
                                } else {
                                    this.field3830 = arg2.method2390((byte) 32);
                                }
                            } else {
                                this.field3836 = arg2.method2390((byte) -117);
                            }
                        } else {
                            this.field3845 = arg2.method2390((byte) 114);
                        }
                    } else {
                        this.field3833 = arg2.method2390((byte) 118);
                    }
                } else {
                    this.field3834 = arg2.method2390((byte) 120);
                }
            } else {
                this.field3837 = arg2.method2396((byte) 70);
            }
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field3831;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            return null;
        } else if (super.field752.field2441) {
            int[][] var4 = super.field752.method1304((byte) 100);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class642.field8759 * this.field3834 >> 12;
            int var15 = class642.field8759 * this.field3833 >> 12;
            int var16 = class784.field10832 * this.field3845 >> 12;
            int var17 = class784.field10832 * this.field3836 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field3835 = class642.field8759 / 8 * this.field3830 >> 12;
                int var18 = class642.field8759 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3837);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class93.method822(var21, arg0 + -1, -var14 + var15);
                        int var23 = class93.method822(var21, -1, var17 - var16) + var16;
                        int var24 = var8 - -var22;
                        if (~var24 < ~class642.field8759) {
                            var24 = class642.field8759;
                            var22 = class642.field8759 - var8;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class642.field8759;
                            }
                            if (var29 > class642.field8759) {
                                var29 -= class642.field8759;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && var29 <= var30[1]) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class642.field8759;
                                        }
                                        if (var31 > class642.field8759) {
                                            var31 -= class642.field8759;
                                        }
                                        for (int var32 = 1; var28 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var29 > var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class642.field8759;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                                this.method1827(var35, false, var38 - -var7, var21, -var38 + var39, -var35 + var25, var4);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var28;
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (~class784.field10832 > ~(var23 + var25)) {
                            var23 = class784.field10832 - var25;
                        } else {
                            var10 = false;
                        }
                        if (~class642.field8759 == ~var24) {
                            this.method1827(var25, false, var6 + var8, var21, var22, var23, var4);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var7 = var6;
                            var13 = 0;
                            var6 = class93.method822(var21, -1, class642.field8759);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class642.field8759 + var5;
                            }
                            var9 = 0;
                            if (class642.field8759 < var43) {
                                var43 -= class642.field8759;
                            }
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (var43 >= var44[0] && ~var44[1] <= ~var43) {
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[1] = var24;
                            var45[0] = var8;
                            var45[2] = var23 + var25;
                            this.method1827(var25, false, var6 + var8, var21, var22, var23, var4);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
