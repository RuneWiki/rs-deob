import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class195 extends class300 {

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    private int field3077 = 4;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    private int field3083 = 1638;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    private int field3079 = 4;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "[B")
    private byte[] field3082 = new byte[512];

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    private int field3075 = 0;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    private int field3081 = 4;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "Z")
    private boolean field3090 = true;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field3080 = -2;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "[I")
    public static int[] field3091 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "[Z")
    public static boolean[] field3092 = new boolean[100];

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "Lmj;")
    public static class218 field3078;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lfe;")
    public static class231 field3085;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "[S")
    private short[] field3087;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "[S")
    private short[] field3089;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)V")
    private final void method1361(byte arg0) {
        int var2 = 75 % ((-77 - arg0) / 32);
        if (~this.field3083 >= -1) {
            if (this.field3089 != null && ~this.field3089.length == ~this.field3077) {
                this.field3087 = new short[this.field3077];
                for (int var3 = 0; ~var3 > ~this.field3077; ++var3) {
                    this.field3087[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        } else {
            this.field3087 = new short[this.field3077];
            this.field3089 = new short[this.field3077];
            for (int var4 = 0; ~this.field3077 < ~var4; ++var4) {
                this.field3089[var4] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3083 / 4096.0F), (double) var4)));
                this.field3087[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
        ++field3084;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field3095;
        if (arg1 != -957953300) {
            this.field3079 = -69;
        }
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            this.method1366(var3, arg1 + 957953301, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)V")
    public static void method1362(byte arg0) {
        field3091 = null;
        field3078 = null;
        field3092 = null;
        if (arg0 <= 8) {
            method1362((byte) -119);
        }
        field3085 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Loa;IIIIIIIZ)V")
    public static final void method1363(class273 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class220.field3458;
        int var11;
        int var12 = var11 = (arg7 << 7) - class140.field2008;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class8.field114[arg1][arg6][arg7] - class148.field2203;
        int var18 = class8.field114[arg1][arg6 + 1][arg7] - class148.field2203;
        int var19 = class8.field114[arg1][arg6 + 1][arg7 + 1] - class148.field2203;
        int var20 = class8.field114[arg1][arg6][arg7 + 1] - class148.field2203;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class221.field3459;
                        int var46 = (var24 << 9) / var25 + class221.field3463;
                        int var47 = (var27 << 9) / var31 + class221.field3459;
                        int var48 = (var30 << 9) / var31 + class221.field3463;
                        int var49 = (var33 << 9) / var37 + class221.field3459;
                        int var50 = (var36 << 9) / var37 + class221.field3463;
                        int var51 = (var39 << 9) / var43 + class221.field3459;
                        int var52 = (var42 << 9) / var43 + class221.field3463;
                        class221.field3472 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class198.field3142 && class59.method381(class221.field3459 + class19.field264, class221.field3463 + class188.field2944, var50, var52, var48, var49, var51, var47)) {
                                class234.field3777 = arg6;
                                class24.field302 = arg7;
                            }
                            if (!arg8) {
                                class221.field3475 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class221.field3461 || var51 > class221.field3461 || var47 > class221.field3461) {
                                    class221.field3475 = true;
                                }
                                if (arg0.field4438 == -1) {
                                    if (arg0.field4440 != 12345678) {
                                        class221.method1563(var50, var52, var48, var49, var51, var47, arg0.field4440, arg0.field4442, arg0.field4436);
                                    }
                                } else if (class234.field3773) {
                                    if (arg0.field4441) {
                                        class221.method1568(var50, var52, var48, var49, var51, var47, arg0.field4440, arg0.field4442, arg0.field4436, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4438);
                                    } else {
                                        class221.method1568(var50, var52, var48, var49, var51, var47, arg0.field4440, arg0.field4442, arg0.field4436, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4438);
                                    }
                                } else {
                                    int var53 = class221.field3464.method577((byte) 127, arg0.field4438);
                                    class221.method1563(var50, var52, var48, var49, var51, var47, class96.method657(var53, arg0.field4440), class96.method657(var53, arg0.field4442), class96.method657(var53, arg0.field4436));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class198.field3142 && class59.method381(class221.field3459 + class19.field264, class221.field3463 + class188.field2944, var46, var48, var52, var45, var47, var51)) {
                                class234.field3777 = arg6;
                                class24.field302 = arg7;
                            }
                            if (!arg8) {
                                class221.field3475 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class221.field3461 || var47 > class221.field3461 || var51 > class221.field3461) {
                                    class221.field3475 = true;
                                }
                                if (arg0.field4438 == -1) {
                                    if (arg0.field4448 != 12345678) {
                                        class221.method1563(var46, var48, var52, var45, var47, var51, arg0.field4448, arg0.field4436, arg0.field4442);
                                        return;
                                    }
                                } else {
                                    if (class234.field3773) {
                                        class221.method1568(var46, var48, var52, var45, var47, var51, arg0.field4448, arg0.field4436, arg0.field4442, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4438);
                                        return;
                                    }
                                    int var54 = class221.field3464.method577((byte) 127, arg0.field4438);
                                    class221.method1563(var46, var48, var52, var45, var47, var51, class96.method657(var54, arg0.field4448), class96.method657(var54, arg0.field4436), class96.method657(var54, arg0.field4442));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field3076;
        this.field3082 = class293.method1986(this.field3075, 46);
        this.method1361((byte) -115);
        for (int var2 = this.field3077 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field3089[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field3077;
        }
        if (arg0 <= 126) {
            method1364(115, -12, 15, 3);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)V")
    public static final void method1364(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            ++class112.field1625;
            class150.field2218.method445(1, 7);
            class150.field2218.method1183(5, 984049208);
        }
        if (~arg1 == -2) {
            class150.field2218.method445(105, 7);
            ++class104.field1518;
            class150.field2218.method1183(19, 984049208);
        }
        ++field3088;
        class150.field2218.method1161(class309.field4977[82] ? 1 : 0, 128);
        class150.field2218.method1207(true, class113.field1653 + arg3);
        if (arg2 != 19) {
            method1364(21, 92, -29, -79);
        }
        class150.field2218.method1180(-17437, class5.field77 + arg0);
        class121.field1741 = arg0;
        class31.field380 = arg3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field3081 = arg0.method1218(-64);
                                }
                            } else {
                                this.field3079 = arg0.method1218(-29);
                            }
                        } else {
                            this.field3075 = arg0.method1218(-70);
                        }
                    } else {
                        this.field3079 = this.field3081 = arg0.method1218(65);
                    }
                } else {
                    this.field3083 = arg0.method1193(-1);
                    if (~this.field3083 > -1) {
                        this.field3089 = new short[this.field3077];
                        for (int var5 = 0; var5 < this.field3077; ++var5) {
                            this.field3089[var5] = (short) arg0.method1193(-1);
                        }
                    }
                }
            } else {
                this.field3077 = arg0.method1218(86);
            }
        } else {
            this.field3090 = arg0.method1218(-115) == 1;
        }
        ++field3094;
        if (arg1 > -43) {
            this.method144(116);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIBIIII)I")
    private final int method1365(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3086;
        int var8 = arg1 + -4096;
        int var9 = arg5 >> 12;
        int var10 = arg5 & 4095;
        int var11 = class152.field2269[var10];
        int var12 = var9 + 1;
        if (~arg4 >= ~var12) {
            var12 = 0;
        }
        int var13 = var10 + -4096;
        int var14 = var9 & 255;
        int var15 = 2 % ((arg2 - 28) / 56);
        int var16 = var12 & 255;
        int var17 = 3 & this.field3082[var14 - -arg3];
        int var18;
        if (var17 > 1) {
            var18 = var17 != 2 ? -arg1 + -var10 : -arg1 + var10;
        } else {
            var18 = var17 == 0 ? var10 - -arg1 : -var10 + arg1;
        }
        int var19 = this.field3082[arg3 + var16] & 3;
        int var20;
        if (var19 <= 1) {
            var20 = ~var19 != -1 ? -var13 + arg1 : arg1 + var13;
        } else {
            var20 = ~var19 == -3 ? var13 - arg1 : -arg1 + -var13;
        }
        int var21 = ((var20 - var18) * var11 >> 12) + var18;
        int var22 = this.field3082[var14 - -arg6] & 3;
        int var23;
        if (var22 > 1) {
            var23 = var22 != 2 ? -var8 + -var10 : -var8 + var10;
        } else {
            var23 = ~var22 == -1 ? var8 + var10 : -var10 + var8;
        }
        int var24 = 3 & this.field3082[var16 - -arg6];
        int var25;
        if (~var24 < -2) {
            var25 = ~var24 == -3 ? -var8 + var13 : -var8 + -var13;
        } else {
            var25 = var24 == 0 ? var8 + var13 : -var13 + var8;
        }
        int var26 = ((-var23 + var25) * var11 >> 12) + var23;
        return var21 - -((var26 - var21) * arg0 >> 12);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([III)V")
    private final void method1366(int[] arg0, int arg1, int arg2) {
        int var4 = class235.field3797[arg2] * this.field3081;
        ++field3093;
        if (this.field3077 != arg1) {
            short var5 = this.field3089[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field3087[0] << 12;
                int var7 = this.field3079 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = var8 >> 12;
                int var10 = this.field3081 * var6 >> 12;
                int var11 = var9 + 1;
                int var12 = this.field3082[255 & var9] & 255;
                if (var11 >= var10) {
                    var11 = 0;
                }
                int var13 = var8 & 4095;
                int var14 = 255 & this.field3082[255 & var11];
                int var15 = class152.field2269[var13];
                for (int var16 = 0; class180.field2826 > var16; ++var16) {
                    int var36 = class5.field73[var16] * this.field3079;
                    int var37 = this.method1365(var15, var13, (byte) 101, var12, var7, var6 * var36 >> 12, var14);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field3077; ++var17) {
                short var18 = this.field3089[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field3087[var17] << 12;
                    int var20 = this.field3081 * var19 >> 12;
                    int var21 = this.field3079 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = this.field3082[255 & var23] & 255;
                    int var25 = var23 + 1;
                    int var26 = var22 & 4095;
                    int var27 = class152.field2269[var26];
                    if (~var20 >= ~var25) {
                        var25 = 0;
                    }
                    int var28 = 255 & this.field3082[var25 & 255];
                    if (this.field3090 && this.field3077 + -1 == var17) {
                        for (int var29 = 0; var29 < class180.field2826; ++var29) {
                            int var30 = class5.field73[var29] * this.field3079;
                            int var31 = this.method1365(var27, var26, (byte) 97, var24, var21, var19 * var30 >> 12, var28);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~class180.field2826 < ~var33; ++var33) {
                            int var34 = class5.field73[var33] * this.field3079;
                            int var35 = this.method1365(var27, var26, (byte) 125, var24, var21, var19 * var34 >> 12, var28);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field3089[0];
            int var39 = this.field3087[0] << 12;
            int var40 = this.field3081 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = var41 >> 12;
            int var43 = this.field3079 * var39 >> 12;
            int var44 = var42 + 1;
            if (var40 <= var44) {
                var44 = 0;
            }
            int var45 = var41 & 4095;
            int var46 = this.field3082[var42 & 255] & 255;
            int var47 = this.field3082[255 & var44] & 255;
            int var48 = class152.field2269[var45];
            if (this.field3090) {
                for (int var49 = 0; class180.field2826 > var49; ++var49) {
                    int var50 = class5.field73[var49] * this.field3079;
                    int var51 = this.method1365(var48, var45, (byte) -105, var46, var43, var39 * var50 >> 12, var47);
                    int var52 = var38 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; ~var53 > ~class180.field2826; ++var53) {
                    int var54 = class5.field73[var53] * this.field3079;
                    int var55 = this.method1365(var48, var45, (byte) -92, var46, var43, var39 * var54 >> 12, var47);
                    arg0[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)Lrk;")
    public static final class165 method1367(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = var3.field1649;
            var3.field1649 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, true);
    }
}
