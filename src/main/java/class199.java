import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class199 extends class87 {

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    private int field2921 = 0;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "Z")
    private boolean field2925 = true;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    private int field2927 = 4;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "[B")
    private byte[] field2932 = new byte[512];

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    private int field2938 = 1638;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    private int field2941 = 4;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    private int field2926 = 4;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "Lul;")
    public static class238 field2924 = new class238();

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field2940 = 0;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    public static int field2930 = 0;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "Luc;")
    public static class13 field2937;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "[Lwh;")
    public static class57[] field2934;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "[S")
    private short[] field2929;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "[S")
    private short[] field2935;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([IBI)V")
    private final void method1401(int[] arg0, byte arg1, int arg2) {
        ++field2919;
        int var4 = class140.field2272[arg2] * this.field2926;
        if (arg1 >= 54) {
            if (this.field2927 != 1) {
                short var5 = this.field2935[0];
                if (var5 > 8 || ~var5 > 7) {
                    int var6 = this.field2929[0] << 12;
                    int var7 = this.field2926 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = var8 >> 12;
                    int var10 = var8 & 4095;
                    int var11 = this.field2941 * var6 >> 12;
                    int var12 = 255 & this.field2932[255 & var9];
                    int var13 = var9 + 1;
                    int var14 = class277.field4477[var10];
                    if (~var7 >= ~var13) {
                        var13 = 0;
                    }
                    int var15 = 255 & this.field2932[var13 & 255];
                    for (int var16 = 0; ~var16 > ~class206.field3032; ++var16) {
                        int var36 = class138.field2254[var16] * this.field2941;
                        int var37 = this.method1406(var14, var12, var10, var6 * var36 >> 12, true, var15, var11);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field2927; ++var17) {
                    short var18 = this.field2935[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field2929[var17] << 12;
                        int var20 = this.field2926 * var19 >> 12;
                        int var21 = this.field2941 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var22 & 4095;
                        int var26 = this.field2932[var23 & 255] & 255;
                        int var27 = class277.field4477[var25];
                        if (var20 <= var24) {
                            var24 = 0;
                        }
                        int var28 = this.field2932[var24 & 255] & 255;
                        if (this.field2925 && this.field2927 + -1 == var17) {
                            for (int var29 = 0; ~var29 > ~class206.field3032; ++var29) {
                                int var30 = class138.field2254[var29] * this.field2941;
                                int var31 = this.method1406(var27, var26, var25, var19 * var30 >> 12, true, var28, var21);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; class206.field3032 > var33; ++var33) {
                                int var34 = class138.field2254[var33] * this.field2941;
                                int var35 = this.method1406(var27, var26, var25, var19 * var34 >> 12, true, var28, var21);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field2929[0] << 12;
                short var39 = this.field2935[0];
                int var40 = this.field2941 * var38 >> 12;
                int var41 = this.field2926 * var38 >> 12;
                int var42 = var4 * var38 >> 12;
                int var43 = var42 >> 12;
                int var44 = 255 & this.field2932[var43 & 255];
                int var45 = var42 & 4095;
                int var46 = var43 - -1;
                if (~var41 >= ~var46) {
                    var46 = 0;
                }
                int var47 = this.field2932[255 & var46] & 255;
                int var48 = class277.field4477[var45];
                if (this.field2925) {
                    for (int var49 = 0; ~class206.field3032 < ~var49; ++var49) {
                        int var50 = class138.field2254[var49] * this.field2941;
                        int var51 = this.method1406(var48, var44, var45, var38 * var50 >> 12, true, var47, var40);
                        int var52 = var39 * var51 >> 12;
                        arg0[var49] = 2048 - -(var52 >> 1);
                    }
                } else {
                    for (int var53 = 0; var53 < class206.field3032; ++var53) {
                        int var54 = class138.field2254[var53] * this.field2941;
                        int var55 = this.method1406(var48, var44, var45, var38 * var54 >> 12, true, var47, var40);
                        arg0[var53] = var39 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        ++field2923;
        this.field2932 = class136.method1025(this.field2921, false);
        this.method1404(false);
        if (arg0 != 0) {
            field2940 = 39;
        }
        for (int var2 = this.field2927 + -1; var2 >= 1; --var2) {
            short var3 = this.field2935[var2];
            if (var3 > 8) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field2927;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)V")
    public static final void method1402(int arg0, int arg1) {
        class43.field566.method1416(arg1, 0);
        ++field2920;
        if (arg0 != -5072) {
            method1403(16);
        }
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
    public static final void method1403(int arg0) {
        for (class301 var1 = (class301) class17.field178.method8(-96); var1 != null; var1 = (class301) class17.field178.method12((byte) 69)) {
            if (var1.field4864) {
                var1.method2053((byte) 126);
            }
        }
        class301 var2 = (class301) class219.field3193.method8(-123);
        if (arg0 != 13477) {
            field2934 = null;
        }
        while (var2 != null) {
            if (var2.field4864) {
                var2.method2053((byte) -52);
            }
            var2 = (class301) class219.field3193.method12((byte) 69);
        }
        ++field2922;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        if (arg1) {
            field2934 = null;
        }
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            this.method1401(var3, (byte) 80, arg0);
        }
        ++field2931;
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    private final void method1404(boolean arg0) {
        ++field2939;
        if (~this.field2938 >= -1) {
            if (this.field2935 != null && ~this.field2935.length == ~this.field2927) {
                this.field2929 = new short[this.field2927];
                for (int var2 = 0; var2 < this.field2927; ++var2) {
                    this.field2929[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field2935 = new short[this.field2927];
            this.field2929 = new short[this.field2927];
            for (int var3 = 0; ~var3 > ~this.field2927; ++var3) {
                this.field2935[var3] = (short) ((int) (Math.pow((double) ((float) this.field2938 / 4096.0F), (double) var3) * 4096.0D));
                this.field2929[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0) {
            this.method1401((int[]) null, (byte) -7, 35);
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class199() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2926 = arg0.method366(-16505);
                                }
                            } else {
                                this.field2941 = arg0.method366(arg2 ^ -9302);
                            }
                        } else {
                            this.field2921 = arg0.method366(-16505);
                        }
                    } else {
                        this.field2941 = this.field2926 = arg0.method366(arg2 ^ -9302);
                    }
                } else {
                    this.field2938 = arg0.method337(102);
                    if (this.field2938 < 0) {
                        this.field2935 = new short[this.field2927];
                        for (int var5 = 0; var5 < this.field2927; ++var5) {
                            this.field2935[var5] = (short) arg0.method337(120);
                        }
                    }
                }
            } else {
                this.field2927 = arg0.method366(arg2 ^ -9302);
            }
        } else {
            this.field2925 = arg0.method366(arg2 + -42150) == 1;
        }
        if (arg2 != 25645) {
            this.field2941 = -117;
        }
        ++field2928;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public static void method1405(byte arg0) {
        field2937 = null;
        field2924 = null;
        field2934 = null;
        int var1 = 85 / ((arg0 - 44) / 36);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIZII)I")
    private final int method1406(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field2933;
        int var8 = arg2 + -4096;
        int var9 = arg3 >> 12;
        int var10 = arg3 & 4095;
        int var11 = var10 - 4096;
        int var12 = var9 + 1;
        if (!arg4) {
            method1405((byte) 87);
        }
        int var13 = var9 & 255;
        if (~var12 <= ~arg6) {
            var12 = 0;
        }
        int var14 = class277.field4477[var10];
        int var15 = this.field2932[arg1 + var13] & 3;
        int var16 = var12 & 255;
        int var17;
        if (~var15 >= -2) {
            var17 = ~var15 != -1 ? arg2 - var10 : arg2 + var10;
        } else {
            var17 = var15 != 2 ? -arg2 + -var10 : -arg2 + var10;
        }
        int var18 = 3 & this.field2932[arg1 + var16];
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 == -3 ? -arg2 + var11 : -var11 - arg2;
        } else {
            var19 = var18 != 0 ? -var11 + arg2 : arg2 + var11;
        }
        int var20 = ((-var17 + var19) * var14 >> 12) + var17;
        int var21 = this.field2932[arg5 + var13] & 3;
        int var22;
        if (~var21 < -2) {
            var22 = ~var21 != -3 ? -var8 + -var10 : var10 - var8;
        } else {
            var22 = ~var21 != -1 ? -var10 + var8 : var8 + var10;
        }
        int var23 = 3 & this.field2932[arg5 + var16];
        int var24;
        if (~var23 >= -2) {
            var24 = var23 != 0 ? -var11 + var8 : var11 - -var8;
        } else {
            var24 = ~var23 == -3 ? -var8 + var11 : -var11 - var8;
        }
        int var25 = ((-var22 + var24) * var14 >> 12) + var22;
        return ((var25 - var20) * arg0 >> 12) + var20;
    }
}
