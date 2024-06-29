import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class337 extends class56 {

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public int field4162 = 4;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "Z")
    public boolean field4167 = true;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public int field4159 = 4;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public int field4170 = 1638;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public int field4172 = 0;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public int field4173 = 4;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "[B")
    private byte[] field4177 = new byte[512];

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "F")
    public static float field4165 = 1.0F;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "J")
    public static long field4175;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "[S")
    private short[] field4160;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "[S")
    private short[] field4163;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    private final void method1993(int arg0) {
        ++field4171;
        if (arg0 == 4095) {
            if (this.field4170 > 0) {
                this.field4160 = new short[this.field4162];
                this.field4163 = new short[this.field4162];
                for (int var2 = 0; this.field4162 > var2; ++var2) {
                    this.field4163[var2] = (short) ((int) (Math.pow((double) ((float) this.field4170 / 4096.0F), (double) var2) * 4096.0D));
                    this.field4160[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field4163 != null && this.field4163.length == this.field4162) {
                this.field4160 = new short[this.field4162];
                for (int var3 = 0; this.field4162 > var3; ++var3) {
                    this.field4160[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field4173 = arg2.method2396((byte) -90);
                                }
                            } else {
                                this.field4159 = arg2.method2396((byte) -85);
                            }
                        } else {
                            this.field4172 = arg2.method2396((byte) 40);
                        }
                    } else {
                        this.field4159 = this.field4173 = arg2.method2396((byte) 116);
                    }
                } else {
                    this.field4170 = arg2.method2365(true);
                    if (this.field4170 < 0) {
                        this.field4163 = new short[this.field4162];
                        for (int var5 = 0; ~var5 > ~this.field4162; ++var5) {
                            this.field4163[var5] = (short) arg2.method2365(true);
                        }
                    }
                }
            } else {
                this.field4162 = arg2.method2396((byte) -113);
            }
        } else {
            this.field4167 = arg2.method2396((byte) -96) == 1;
        }
        if (arg0 < -44) {
            ++field4176;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        ++field4166;
        this.field4177 = class33.method306(11276, this.field4172);
        this.method1993(4095);
        int var2 = -46 % ((arg0 - 37) / 62);
        for (int var3 = this.field4162 + -1; var3 >= 1; --var3) {
            short var4 = this.field4163[var3];
            if (~var4 < -9) {
                return;
            }
            if (~var4 > 7) {
                return;
            }
            --this.field4162;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIBIII)I")
    private final int method1994(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field4164;
        if (arg3 != -51) {
            return 12;
        } else {
            int var8 = arg1 >> 12;
            int var9 = var8 - -1;
            int var10 = var8 & 255;
            int var11 = arg1 & 4095;
            if (arg6 <= var9) {
                var9 = 0;
            }
            int var12 = var11 - 4096;
            int var13 = var9 & 255;
            int var14 = arg5 + -4096;
            int var15 = class326.field4038[var11];
            int var16 = 3 & this.field4177[arg0 + var10];
            int var17;
            if (~var16 >= -2) {
                var17 = ~var16 != -1 ? -var11 + arg5 : arg5 + var11;
            } else {
                var17 = ~var16 != -3 ? -var11 - arg5 : -arg5 + var11;
            }
            int var18 = this.field4177[var13 - -arg0] & 3;
            int var19;
            if (var18 > 1) {
                var19 = var18 != 2 ? -arg5 + -var12 : -arg5 + var12;
            } else {
                var19 = var18 == 0 ? arg5 + var12 : -var12 + arg5;
            }
            int var20 = ((-var17 + var19) * var15 >> 12) + var17;
            int var21 = 3 & this.field4177[arg2 + var10];
            int var22;
            if (var21 <= 1) {
                var22 = var21 != 0 ? -var11 + var14 : var11 + var14;
            } else {
                var22 = ~var21 == -3 ? -var14 + var11 : -var11 + -var14;
            }
            int var23 = 3 & this.field4177[arg2 + var13];
            int var24;
            if (~var23 < -2) {
                var24 = var23 != 2 ? -var12 + -var14 : -var14 + var12;
            } else {
                var24 = ~var23 != -1 ? -var12 + var14 : var12 + var14;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return ((-var20 + var25) * arg4 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1995(String arg0, int arg1, int arg2) {
        ++field4174;
        class714 var3 = class350.method2072((long) arg1, arg2, (byte) 119);
        var3.method4043(arg2 ^ 6383);
        var3.field10019 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class337() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB[I)V")
    public final void method1996(int arg0, byte arg1, int[] arg2) {
        ++field4168;
        int var4 = class349.field4354[arg0] * this.field4173;
        if (arg1 < 103) {
            this.method493((byte) 28);
        }
        if (this.field4162 != 1) {
            short var5 = this.field4163[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field4160[0] << 12;
                int var7 = this.field4159 * var6 >> 12;
                int var8 = this.field4173 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                int var12 = var9 & 4095;
                if (var8 <= var11) {
                    var11 = 0;
                }
                int var13 = this.field4177[255 & var10] & 255;
                int var14 = class326.field4038[var12];
                int var15 = 255 & this.field4177[var11 & 255];
                for (int var16 = 0; class642.field8759 > var16; ++var16) {
                    int var36 = class648.field8837[var16] * this.field4159;
                    int var37 = this.method1994(var13, var6 * var36 >> 12, var15, (byte) -51, var14, var12, var7);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field4162; ++var17) {
                short var18 = this.field4163[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field4160[var17] << 12;
                    int var20 = this.field4173 * var19 >> 12;
                    int var21 = this.field4159 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var23 + 1;
                    if (~var20 >= ~var24) {
                        var24 = 0;
                    }
                    int var25 = var22 & 4095;
                    int var26 = class326.field4038[var25];
                    int var27 = this.field4177[255 & var24] & 255;
                    int var28 = 255 & this.field4177[255 & var23];
                    if (this.field4167 && ~(this.field4162 - 1) == ~var17) {
                        for (int var29 = 0; ~class642.field8759 < ~var29; ++var29) {
                            int var30 = class648.field8837[var29] * this.field4159;
                            int var31 = this.method1994(var28, var19 * var30 >> 12, var27, (byte) -51, var26, var25, var21);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; var33 < class642.field8759; ++var33) {
                            int var34 = class648.field8837[var33] * this.field4159;
                            int var35 = this.method1994(var28, var19 * var34 >> 12, var27, (byte) -51, var26, var25, var21);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field4160[0] << 12;
            short var39 = this.field4163[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field4159 * var38 >> 12;
            int var42 = this.field4173 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 - -1;
            int var45 = var40 & 4095;
            if (var42 <= var44) {
                var44 = 0;
            }
            int var46 = class326.field4038[var45];
            int var47 = this.field4177[var44 & 255] & 255;
            int var48 = 255 & this.field4177[var43 & 255];
            if (!this.field4167) {
                for (int var49 = 0; var49 < class642.field8759; ++var49) {
                    int var50 = class648.field8837[var49] * this.field4159;
                    int var51 = this.method1994(var48, var38 * var50 >> 12, var47, (byte) -51, var46, var45, var41);
                    arg2[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; var52 < class642.field8759; ++var52) {
                    int var53 = class648.field8837[var52] * this.field4159;
                    int var54 = this.method1994(var48, var38 * var53 >> 12, var47, (byte) -51, var46, var45, var41);
                    int var55 = var39 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field4161;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            this.field4170 = -116;
        }
        if (super.field752.field2441) {
            this.method1996(arg1, (byte) 112, var3);
        }
        return var3;
    }
}
