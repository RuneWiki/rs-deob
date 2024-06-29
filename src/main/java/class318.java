import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class318 extends class11 {

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    public int field4356 = 0;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
    public int field4360 = 1638;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
    public int field4362 = 4;

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
    public int field4365 = 4;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public int field4355 = 4;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "[B")
    private byte[] field4351 = new byte[512];

    @OriginalMember(owner = "client!wr", name = "Y", descriptor = "Z")
    public boolean field4368 = true;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "Ldi;")
    public static class83 field4358 = new class83(2, -1);

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "[I")
    public static int[] field4363 = new int[14];

    @OriginalMember(owner = "client!wr", name = "X", descriptor = "Z")
    public static boolean field4367 = false;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "[I")
    public static int[] field4364 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wr", name = "ab", descriptor = "Lwj;")
    public static class270 field4370 = new class270(66, 0);

    @OriginalMember(owner = "client!wr", name = "bb", descriptor = "Lnj;")
    public static class162 field4371 = new class162(4);

    @OriginalMember(owner = "client!wr", name = "db", descriptor = "Z")
    public static boolean field4373 = false;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!wr", name = "Z", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "[S")
    private short[] field4352;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "[S")
    private short[] field4354;

    @OriginalMember(owner = "client!wr", name = "cb", descriptor = "[[B")
    public static byte[][] field4372;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB[I)V", line = 5)
    public final void method1855(int arg0, byte arg1, int[] arg2) {
        ++field4353;
        int var4 = class328.field4484[arg0] * this.field4362;
        if (arg1 <= 65) {
            this.method43((class391) null, 54, -90);
        }
        if (~this.field4365 == -2) {
            int var5 = this.field4352[0] << 12;
            short var6 = this.field4354[0];
            int var7 = this.field4362 * var5 >> 12;
            int var8 = this.field4355 * var5 >> 12;
            int var9 = var4 * var5 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = var9 & 4095;
            if (var7 <= var11) {
                var11 = 0;
            }
            int var13 = class235.field3331[var12];
            int var14 = 255 & this.field4351[255 & var10];
            int var15 = this.field4351[255 & var11] & 255;
            if (this.field4368) {
                for (int var16 = 0; class90.field1316 > var16; ++var16) {
                    int var17 = class448.field6606[var16] * this.field4355;
                    int var18 = this.method1858(var12, var13, var15, var5 * var17 >> 12, var14, var8, true);
                    int var19 = var6 * var18 >> 12;
                    arg2[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; class90.field1316 > var20; ++var20) {
                    int var21 = class448.field6606[var20] * this.field4355;
                    int var22 = this.method1858(var12, var13, var15, var5 * var21 >> 12, var14, var8, true);
                    arg2[var20] = var6 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field4354[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field4352[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field4362 * var24 >> 12;
                int var27 = this.field4355 * var24 >> 12;
                int var28 = var25 >> 12;
                int var29 = var28 + 1;
                int var30 = var25 & 4095;
                if (var29 >= var26) {
                    var29 = 0;
                }
                int var31 = class235.field3331[var30];
                int var32 = 255 & this.field4351[var29 & 255];
                int var33 = this.field4351[var28 & 255] & 255;
                for (int var34 = 0; ~class90.field1316 < ~var34; ++var34) {
                    int var54 = class448.field6606[var34] * this.field4355;
                    int var55 = this.method1858(var30, var31, var32, var24 * var54 >> 12, var33, var27, true);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; this.field4365 > var35; ++var35) {
                short var36 = this.field4354[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field4352[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field4355 * var37 >> 12;
                    int var40 = this.field4362 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    if (var40 <= var42) {
                        var42 = 0;
                    }
                    int var43 = var38 & 4095;
                    int var44 = class235.field3331[var43];
                    int var45 = this.field4351[255 & var42] & 255;
                    int var46 = this.field4351[var41 & 255] & 255;
                    if (this.field4368 && this.field4365 + -1 == var35) {
                        for (int var47 = 0; ~class90.field1316 < ~var47; ++var47) {
                            int var48 = class448.field6606[var47] * this.field4355;
                            int var49 = this.method1858(var43, var44, var45, var37 * var48 >> 12, var46, var39, true);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; class90.field1316 > var51; ++var51) {
                            int var52 = class448.field6606[var51] * this.field4355;
                            int var53 = this.method1858(var43, var44, var45, var37 * var52 >> 12, var46, var39, true);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(II)[I", line = 165)
    public final int[] method44(int arg0, int arg1) {
        ++field4359;
        if (arg0 > -42) {
            this.method44(95, 8);
        }
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            this.method1855(arg1, (byte) 115, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V", line = 381)
    public class318() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lsi;II)V", line = 194)
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field4362 = arg0.method2348(-2);
                                }
                            } else {
                                this.field4355 = arg0.method2348(-2);
                            }
                        } else {
                            this.field4356 = arg0.method2348(-2);
                        }
                    } else {
                        this.field4355 = this.field4362 = arg0.method2348(-2);
                    }
                } else {
                    this.field4360 = arg0.method2311((byte) 125);
                    if (this.field4360 < 0) {
                        this.field4354 = new short[this.field4365];
                        for (int var5 = 0; var5 < this.field4365; ++var5) {
                            this.field4354[var5] = (short) arg0.method2311((byte) -101);
                        }
                    }
                }
            } else {
                this.field4365 = arg0.method2348(-2);
            }
        } else {
            this.field4368 = arg0.method2348(-2) == 1;
        }
        ++field4357;
        if (arg1 >= -40) {
            this.method1857(12);
        }
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V", line = 285)
    public static void method1856(int arg0) {
        field4371 = null;
        field4370 = null;
        field4372 = null;
        field4363 = null;
        field4358 = null;
        if (arg0 != 255) {
            field4371 = null;
        }
        field4364 = null;
    }

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)V", line = 301)
    private final void method1857(int arg0) {
        if (arg0 != 25723) {
            field4373 = true;
        }
        if (this.field4360 > 0) {
            this.field4352 = new short[this.field4365];
            this.field4354 = new short[this.field4365];
            for (int var2 = 0; var2 < this.field4365; ++var2) {
                this.field4354[var2] = (short) ((int) (Math.pow((double) ((float) this.field4360 / 4096.0F), (double) var2) * 4096.0D));
                this.field4352[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4354 != null && ~this.field4354.length == ~this.field4365) {
            this.field4352 = new short[this.field4365];
            for (int var3 = 0; var3 < this.field4365; ++var3) {
                this.field4352[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field4366;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)V", line = 342)
    public final void method42(boolean arg0) {
        ++field4361;
        this.field4351 = class231.method1425(this.field4356, 75);
        if (!arg0) {
            this.field4354 = null;
        }
        this.method1857(25723);
        for (int var2 = this.field4365 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field4354[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field4365;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIZ)I", line = 404)
    private final int method1858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field4369;
        if (!arg6) {
            this.method44(71, -9);
        }
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        int var10 = arg3 & 4095;
        if (~var9 <= ~arg5) {
            var9 = 0;
        }
        int var11 = var8 & 255;
        int var12 = var10 + -4096;
        int var13 = var9 & 255;
        int var14 = arg0 + -4096;
        int var15 = this.field4351[arg4 + var11] & 3;
        int var16 = class235.field3331[var10];
        int var17;
        if (var15 > 1) {
            var17 = var15 != 2 ? -arg0 + -var10 : var10 - arg0;
        } else {
            var17 = var15 == 0 ? arg0 + var10 : -var10 + arg0;
        }
        int var18 = this.field4351[arg4 + var13] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 == -3 ? -arg0 + var12 : -var12 - arg0;
        } else {
            var19 = ~var18 == -1 ? var12 - -arg0 : -var12 + arg0;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        int var21 = this.field4351[var11 - -arg2] & 3;
        int var22;
        if (var21 > 1) {
            var22 = var21 != 2 ? -var10 + -var14 : -var14 + var10;
        } else {
            var22 = var21 == 0 ? var10 - -var14 : var14 - var10;
        }
        int var23 = this.field4351[var13 - -arg2] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 != -3 ? -var12 + -var14 : -var14 + var12;
        } else {
            var24 = var23 == 0 ? var12 + var14 : -var12 + var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((-var20 + var25) * arg1 >> 12) + var20;
    }
}
