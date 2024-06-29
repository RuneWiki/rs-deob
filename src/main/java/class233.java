import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class233 extends class170 {

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    private int field4284 = 4;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "[B")
    private byte[] field4289 = new byte[512];

    @OriginalMember(owner = "client!gj", name = "ob", descriptor = "I")
    private int field4298 = 0;

    @OriginalMember(owner = "client!gj", name = "lb", descriptor = "Z")
    private boolean field4295 = true;

    @OriginalMember(owner = "client!gj", name = "nb", descriptor = "I")
    private int field4297 = 4;

    @OriginalMember(owner = "client!gj", name = "pb", descriptor = "I")
    private int field4299 = 4;

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "I")
    private int field4292 = 1638;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "Z")
    public static boolean field4280 = false;

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "Z")
    public static boolean field4291 = true;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "Lqk;")
    public static class207 field4288 = class24.method212(255, "p12_full");

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
    public static int field4282 = 0;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!gj", name = "jb", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!gj", name = "kb", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!gj", name = "rb", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!gj", name = "sb", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "[I")
    public static int[] field4286;

    @OriginalMember(owner = "client!gj", name = "mb", descriptor = "[S")
    private short[] field4296;

    @OriginalMember(owner = "client!gj", name = "qb", descriptor = "[S")
    private short[] field4300;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)I")
    private final int method1665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4287;
        int var8 = arg2 + -4096;
        int var9 = arg3 >> 12;
        int var10 = arg3 & 4095;
        int var11 = var10 + -4096;
        int var12 = var9 + 1;
        if (arg5 != -13530) {
            field4288 = null;
        }
        if (~arg1 >= ~var12) {
            var12 = 0;
        }
        int var13 = class2.field29[var10];
        int var14 = var12 & 255;
        int var15 = var9 & 255;
        int var16 = this.field4289[var15 - -arg6] & 3;
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? -arg2 + var10 : -var10 - arg2;
        } else {
            var17 = var16 == 0 ? arg2 + var10 : -var10 + arg2;
        }
        int var18 = 3 & this.field4289[arg6 + var14];
        int var19;
        if (var18 > 1) {
            var19 = ~var18 == -3 ? -arg2 + var11 : -arg2 + -var11;
        } else {
            var19 = ~var18 == -1 ? arg2 + var11 : -var11 + arg2;
        }
        int var20 = ((-var17 + var19) * var13 >> 12) + var17;
        int var21 = this.field4289[arg4 + var15] & 3;
        int var22;
        if (var21 > 1) {
            var22 = ~var21 != -3 ? -var8 + -var10 : -var8 + var10;
        } else {
            var22 = ~var21 == -1 ? var8 + var10 : -var10 + var8;
        }
        int var23 = this.field4289[arg4 + var14] & 3;
        int var24;
        if (var23 > 1) {
            var24 = ~var23 == -3 ? var11 - var8 : -var8 + -var11;
        } else {
            var24 = var23 == 0 ? var8 + var11 : -var11 + var8;
        }
        int var25 = ((-var22 + var24) * var13 >> 12) + var22;
        return ((-var20 + var25) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        ++field4301;
        this.field4289 = class199.method1377(this.field4298, (byte) -22);
        if (arg0 <= 14) {
            this.field4299 = -69;
        }
        this.method1668(-82);
        for (int var2 = this.field4299 + -1; var2 >= 1; --var2) {
            short var3 = this.field4296[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field4299;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[IB)V")
    private final void method1666(int arg0, int[] arg1, byte arg2) {
        ++field4302;
        int var4 = class282.field4964[arg0] * this.field4284;
        if (arg2 <= 122) {
            field4280 = true;
        }
        if (~this.field4299 == -2) {
            short var5 = this.field4296[0];
            int var6 = this.field4300[0] << 12;
            int var7 = this.field4297 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = var8 >> 12;
            int var10 = this.field4284 * var6 >> 12;
            int var11 = var9 - -1;
            if (~var10 >= ~var11) {
                var11 = 0;
            }
            int var12 = 255 & this.field4289[var11 & 255];
            int var13 = 255 & this.field4289[var9 & 255];
            int var14 = var8 & 4095;
            int var15 = class2.field29[var14];
            if (this.field4295) {
                for (int var16 = 0; class88.field1595 > var16; ++var16) {
                    int var17 = class68.field1211[var16] * this.field4297;
                    int var18 = this.method1665(var15, var7, var14, var6 * var17 >> 12, var12, -13530, var13);
                    int var19 = var5 * var18 >> 12;
                    arg1[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; ~var20 > ~class88.field1595; ++var20) {
                    int var21 = class68.field1211[var20] * this.field4297;
                    int var22 = this.method1665(var15, var7, var14, var6 * var21 >> 12, var12, -13530, var13);
                    arg1[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field4296[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field4300[0] << 12;
                int var25 = this.field4297 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = var26 >> 12;
                int var28 = var26 & 4095;
                int var29 = var27 + 1;
                int var30 = this.field4284 * var24 >> 12;
                int var31 = 255 & this.field4289[var27 & 255];
                int var32 = class2.field29[var28];
                if (var30 <= var29) {
                    var29 = 0;
                }
                int var33 = 255 & this.field4289[255 & var29];
                for (int var34 = 0; ~class88.field1595 < ~var34; ++var34) {
                    int var54 = class68.field1211[var34] * this.field4297;
                    int var55 = this.method1665(var32, var25, var28, var24 * var54 >> 12, var33, -13530, var31);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field4299 < ~var35; ++var35) {
                short var36 = this.field4296[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field4300[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field4297 * var37 >> 12;
                    int var40 = this.field4284 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var38 & 4095;
                    int var43 = class2.field29[var42];
                    int var44 = var41 + 1;
                    if (~var44 <= ~var40) {
                        var44 = 0;
                    }
                    int var45 = this.field4289[var44 & 255] & 255;
                    int var46 = this.field4289[var41 & 255] & 255;
                    if (this.field4295 && ~(this.field4299 - 1) == ~var35) {
                        for (int var47 = 0; ~class88.field1595 < ~var47; ++var47) {
                            int var48 = class68.field1211[var47] * this.field4297;
                            int var49 = this.method1665(var43, var39, var42, var37 * var48 >> 12, var45, -13530, var46);
                            int var50 = (var36 * var49 >> 12) + arg1[var47];
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class88.field1595; ++var51) {
                            int var52 = class68.field1211[var51] * this.field4297;
                            int var53 = this.method1665(var43, var39, var42, var37 * var52 >> 12, var45, -13530, var46);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            return null;
        } else {
            ++field4293;
            int[] var3 = super.field3001.method1538(arg0 + 148, arg1);
            if (super.field3001.field3835) {
                this.method1666(arg1, var3, (byte) 126);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lmd;")
    public static final class220 method1667(int arg0, int arg1) {
        ++field4283;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 65535;
        if (class227.field4162[var2] == null || class227.field4162[var2][var3] == null) {
            boolean var4 = class98.method697(var2, 4401);
            if (!var4) {
                return null;
            }
        }
        if (arg1 <= 12) {
            method1669((byte) -38);
        }
        return class227.field4162[var2][var3];
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field4290;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field4284 = arg0.method1045((byte) -44);
                                }
                            } else {
                                this.field4297 = arg0.method1045((byte) 89);
                            }
                        } else {
                            this.field4298 = arg0.method1045((byte) -45);
                        }
                    } else {
                        this.field4297 = this.field4284 = arg0.method1045((byte) 96);
                    }
                } else {
                    this.field4292 = arg0.method1075(65536);
                    if (~this.field4292 > -1) {
                        this.field4296 = new short[this.field4299];
                        for (int var5 = 0; this.field4299 > var5; ++var5) {
                            this.field4296[var5] = (short) arg0.method1075(65536);
                        }
                    }
                }
            } else {
                this.field4299 = arg0.method1045((byte) 109);
            }
        } else {
            this.field4295 = ~arg0.method1045((byte) -45) == -2;
        }
        if (arg1 != 5877) {
            field4286 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V")
    private final void method1668(int arg0) {
        ++field4285;
        if (arg0 >= -75) {
            method1667(-27, -50);
        }
        if (this.field4292 <= 0) {
            if (this.field4296 != null && this.field4296.length == this.field4299) {
                this.field4300 = new short[this.field4299];
                for (int var2 = 0; var2 < this.field4299; ++var2) {
                    this.field4300[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field4300 = new short[this.field4299];
            this.field4296 = new short[this.field4299];
            for (int var3 = 0; var3 < this.field4299; ++var3) {
                this.field4296[var3] = (short) ((int) (Math.pow((double) ((float) this.field4292 / 4096.0F), (double) var3) * 4096.0D));
                this.field4300[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class233() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V")
    public static void method1669(byte arg0) {
        field4286 = null;
        field4288 = null;
        int var1 = -32 / ((43 - arg0) / 55);
    }
}
