import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class427 extends class227 {

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public int field6202 = 0;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "Z")
    public boolean field6206 = true;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public int field6205 = 1638;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public int field6203 = 4;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "[B")
    private byte[] field6209 = new byte[512];

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public int field6214 = 4;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public int field6215 = 4;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Lho;")
    public static class103 field6208 = new class103(20, 3);

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "[S")
    private short[] field6210;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "[S")
    private short[] field6218;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 3)
    public class427() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V", line = 23)
    public final void method877(int arg0) {
        this.field6209 = class33.method185(this.field6202, (byte) -1);
        ++field6211;
        this.method2628(arg0 + arg0);
        for (int var2 = this.field6214 + -1; var2 >= 1; --var2) {
            short var3 = this.field6218[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field6214;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIII)I", line = 53)
    private final int method2627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6207;
        int var8 = arg1 >> 12;
        int var9 = var8 + 1;
        if (arg4 <= var9) {
            var9 = 0;
        }
        int var10 = arg1 & 4095;
        int var11 = var8 & 255;
        int var12 = arg0 + -4096;
        int var13 = var9 & 255;
        int var14 = var10 + -4096;
        int var15 = this.field6209[arg6 + var11] & 3;
        int var16 = class109.field1467[var10];
        int var17;
        if (~var15 >= -2) {
            var17 = var15 == 0 ? arg0 + var10 : -var10 + arg0;
        } else {
            var17 = var15 != 2 ? -var10 - arg0 : -arg0 + var10;
        }
        int var18 = this.field6209[arg6 + var13] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = var18 != 0 ? -var14 + arg0 : arg0 + var14;
        } else {
            var19 = ~var18 != -3 ? -arg0 + -var14 : -arg0 + var14;
        }
        int var20 = this.field6209[arg2 + var11] & 3;
        int var21 = -92 / ((67 - arg3) / 44);
        int var22 = var17 - -((-var17 + var19) * var16 >> 12);
        int var23;
        if (~var20 >= -2) {
            var23 = var20 == 0 ? var10 + var12 : -var10 + var12;
        } else {
            var23 = var20 == 2 ? -var12 + var10 : -var10 + -var12;
        }
        int var24 = this.field6209[arg2 + var13] & 3;
        int var25;
        if (var24 > 1) {
            var25 = ~var24 != -3 ? -var12 + -var14 : -var12 + var14;
        } else {
            var25 = var24 != 0 ? -var14 + var12 : var12 + var14;
        }
        int var26 = ((-var23 + var25) * var16 >> 12) + var23;
        return ((var26 - var22) * arg5 >> 12) + var22;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lug;II)V", line = 127)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg1 != 487215116) {
            this.field6206 = true;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field6203 = arg0.method2388((byte) -119);
                                }
                            } else {
                                this.field6215 = arg0.method2388((byte) -123);
                            }
                        } else {
                            this.field6202 = arg0.method2388((byte) -125);
                        }
                    } else {
                        this.field6215 = this.field6203 = arg0.method2388((byte) -128);
                    }
                } else {
                    this.field6205 = arg0.method2433((byte) 115);
                    if (~this.field6205 > -1) {
                        this.field6218 = new short[this.field6214];
                        for (int var5 = 0; ~var5 > ~this.field6214; ++var5) {
                            this.field6218[var5] = (short) arg0.method2433((byte) 115);
                        }
                    }
                }
            } else {
                this.field6214 = arg0.method2388((byte) -126);
            }
        } else {
            this.field6206 = arg0.method2388((byte) -122) == 1;
        }
        ++field6217;
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)V", line = 220)
    private final void method2628(int arg0) {
        ++field6204;
        if (arg0 != 2) {
            this.method2627(12, 106, 118, -108, 106, -64, -123);
        }
        if (this.field6205 <= 0) {
            if (this.field6218 != null && ~this.field6218.length == ~this.field6214) {
                this.field6210 = new short[this.field6214];
                for (int var2 = 0; this.field6214 > var2; ++var2) {
                    this.field6210[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field6218 = new short[this.field6214];
            this.field6210 = new short[this.field6214];
            for (int var3 = 0; this.field6214 > var3; ++var3) {
                this.field6218[var3] = (short) ((int) (Math.pow((double) ((float) this.field6205 / 4096.0F), (double) var3) * 4096.0D));
                this.field6210[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I", line = 259)
    public final int[] method62(int arg0, int arg1) {
        ++field6216;
        int[] var3 = super.field3068.method1970(arg1, (byte) 33);
        if (super.field3068.field4480) {
            this.method2629(var3, (byte) 121, arg1);
        }
        if (arg0 != 15811) {
            this.field6210 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([IBI)V", line = 281)
    public final void method2629(int[] arg0, byte arg1, int arg2) {
        ++field6212;
        int var4 = class190.field2457[arg2] * this.field6203;
        int var5 = 74 / ((79 - arg1) / 33);
        if (~this.field6214 != -2) {
            short var6 = this.field6218[0];
            if (~var6 < -9 || var6 < -8) {
                int var7 = this.field6210[0] << 12;
                int var8 = var4 * var7 >> 12;
                int var9 = this.field6203 * var7 >> 12;
                int var10 = this.field6215 * var7 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 + 1;
                if (var9 <= var12) {
                    var12 = 0;
                }
                int var13 = var8 & 4095;
                int var14 = this.field6209[var12 & 255] & 255;
                int var15 = class109.field1467[var13];
                int var16 = 255 & this.field6209[255 & var11];
                for (int var17 = 0; class446.field6486 > var17; ++var17) {
                    int var37 = class4.field37[var17] * this.field6215;
                    int var38 = this.method2627(var13, var7 * var37 >> 12, var14, 10, var10, var15, var16);
                    arg0[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; ~var18 > ~this.field6214; ++var18) {
                short var19 = this.field6218[var18];
                if (var19 > 8 || ~var19 > 7) {
                    int var20 = this.field6210[var18] << 12;
                    int var21 = this.field6203 * var20 >> 12;
                    int var22 = this.field6215 * var20 >> 12;
                    int var23 = var4 * var20 >> 12;
                    int var24 = var23 >> 12;
                    int var25 = var24 + 1;
                    int var26 = var23 & 4095;
                    if (var21 <= var25) {
                        var25 = 0;
                    }
                    int var27 = 255 & this.field6209[255 & var25];
                    int var28 = class109.field1467[var26];
                    int var29 = this.field6209[255 & var24] & 255;
                    if (this.field6206 && this.field6214 - 1 == var18) {
                        for (int var30 = 0; var30 < class446.field6486; ++var30) {
                            int var31 = class4.field37[var30] * this.field6215;
                            int var32 = this.method2627(var26, var20 * var31 >> 12, var27, 119, var22, var28, var29);
                            int var33 = arg0[var30] - -(var19 * var32 >> 12);
                            arg0[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; class446.field6486 > var34; ++var34) {
                            int var35 = class4.field37[var34] * this.field6215;
                            int var36 = this.method2627(var26, var20 * var35 >> 12, var27, 17, var22, var28, var29);
                            arg0[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            int var39 = this.field6210[0] << 12;
            short var40 = this.field6218[0];
            int var41 = this.field6203 * var39 >> 12;
            int var42 = this.field6215 * var39 >> 12;
            int var43 = var4 * var39 >> 12;
            int var44 = var43 >> 12;
            int var45 = var44 + 1;
            int var46 = var43 & 4095;
            if (var41 <= var45) {
                var45 = 0;
            }
            int var47 = this.field6209[255 & var44] & 255;
            int var48 = this.field6209[var45 & 255] & 255;
            int var49 = class109.field1467[var46];
            if (this.field6206) {
                for (int var50 = 0; ~class446.field6486 < ~var50; ++var50) {
                    int var51 = class4.field37[var50] * this.field6215;
                    int var52 = this.method2627(var46, var39 * var51 >> 12, var48, 112, var42, var49, var47);
                    int var53 = var40 * var52 >> 12;
                    arg0[var50] = (var53 >> 1) + 2048;
                }
            } else {
                for (int var54 = 0; ~class446.field6486 < ~var54; ++var54) {
                    int var55 = class4.field37[var54] * this.field6215;
                    int var56 = this.method2627(var46, var39 * var55 >> 12, var48, 114, var42, var49, var47);
                    arg0[var54] = var40 * var56 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIIIIII)V", line = 441)
    public static final void method2630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6213;
        int var7 = class406.method2491(class169.field2184, false, class386.field5620, arg5);
        int var8 = class406.method2491(class169.field2184, false, class386.field5620, arg1);
        int var9 = class406.method2491(class307.field4111, false, class91.field1086, arg6);
        int var10 = class406.method2491(class307.field4111, false, class91.field1086, arg3);
        int var11 = class406.method2491(class169.field2184, false, class386.field5620, arg0 + arg5);
        int var12 = class406.method2491(class169.field2184, false, class386.field5620, -arg0 + arg1);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class476.method2907(var10, 120, arg2, class5.field54[var13], var9);
        }
        int var14 = 101 / ((-45 - arg4) / 52);
        for (int var15 = var8; var12 < var15; --var15) {
            class476.method2907(var10, 85, arg2, class5.field54[var15], var9);
        }
        int var16 = class406.method2491(class307.field4111, false, class91.field1086, arg0 + arg6);
        int var17 = class406.method2491(class307.field4111, false, class91.field1086, arg3 - arg0);
        for (int var18 = var11; var12 >= var18; ++var18) {
            int[] var19 = class5.field54[var18];
            class476.method2907(var16, 88, arg2, var19, var9);
            class476.method2907(var10, 61, arg2, var19, var17);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 510)
    public static void method2631(byte arg0) {
        field6208 = null;
        int var1 = -70 % ((60 - arg0) / 62);
    }
}
