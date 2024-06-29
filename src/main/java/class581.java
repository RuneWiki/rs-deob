import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class581 extends class328 {

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public int field8286 = 4;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "[B")
    private byte[] field8289 = new byte[512];

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public int field8288 = 1638;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Z")
    public boolean field8297 = true;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public int field8291 = 4;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public int field8300 = 4;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public int field8299 = 0;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field8287 = -1;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "[S")
    public static short[] field8285 = new short[256];

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Lpp;")
    public static class464 field8283 = new class464(34, 8);

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field8302;

    // $FF: synthetic field
    @OriginalMember(owner = "client!re", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field8303;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "[S")
    private short[] field8293;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "[S")
    private short[] field8294;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public static final void method3326(int arg0) {
        ++field8296;
        if (~class40.field554 == -3) {
            class555.field7861 = 96;
        } else {
            try {
                Method var1 = (field8303 != null ? field8303 : (field8303 = method3332("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class555.field7861 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        }
        int var4 = 60 / ((arg0 - 61) / 37);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[IB)V")
    public final void method3327(int arg0, int[] arg1, byte arg2) {
        ++field8298;
        int var4 = class638.field9258[arg0] * this.field8291;
        if (arg2 <= 35) {
            this.method2(23);
        }
        if (this.field8286 == 1) {
            int var5 = this.field8294[0] << 12;
            short var6 = this.field8293[0];
            int var7 = this.field8300 * var5 >> 12;
            int var8 = var4 * var5 >> 12;
            int var9 = this.field8291 * var5 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 + 1;
            int var12 = var8 & 4095;
            if (var11 >= var9) {
                var11 = 0;
            }
            int var13 = 255 & this.field8289[var11 & 255];
            int var14 = class186.field2693[var12];
            int var15 = this.field8289[var10 & 255] & 255;
            if (!this.field8297) {
                for (int var16 = 0; class449.field6539 > var16; ++var16) {
                    int var17 = class206.field2924[var16] * this.field8300;
                    int var18 = this.method3330(-4096, var5 * var17 >> 12, var7, var12, var13, var14, var15);
                    arg1[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class449.field6539 > var19; ++var19) {
                    int var20 = class206.field2924[var19] * this.field8300;
                    int var21 = this.method3330(-4096, var5 * var20 >> 12, var7, var12, var13, var14, var15);
                    int var22 = var6 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field8293[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field8294[0] << 12;
                int var25 = this.field8300 * var24 >> 12;
                int var26 = this.field8291 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = var27 & 4095;
                if (~var29 <= ~var26) {
                    var29 = 0;
                }
                int var31 = this.field8289[255 & var29] & 255;
                int var32 = 255 & this.field8289[255 & var28];
                int var33 = class186.field2693[var30];
                for (int var34 = 0; ~class449.field6539 < ~var34; ++var34) {
                    int var54 = class206.field2924[var34] * this.field8300;
                    int var55 = this.method3330(-4096, var24 * var54 >> 12, var25, var30, var31, var33, var32);
                    arg1[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field8286; ++var35) {
                short var36 = this.field8293[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field8294[var35] << 12;
                    int var38 = this.field8291 * var37 >> 12;
                    int var39 = this.field8300 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var40 & 4095;
                    if (var42 >= var38) {
                        var42 = 0;
                    }
                    int var44 = this.field8289[var42 & 255] & 255;
                    int var45 = 255 & this.field8289[255 & var41];
                    int var46 = class186.field2693[var43];
                    if (this.field8297 && this.field8286 - 1 == var35) {
                        for (int var47 = 0; ~class449.field6539 < ~var47; ++var47) {
                            int var48 = class206.field2924[var47] * this.field8300;
                            int var49 = this.method3330(-4096, var37 * var48 >> 12, var39, var43, var44, var46, var45);
                            int var50 = (var36 * var49 >> 12) + arg1[var47];
                            arg1[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class449.field6539; ++var51) {
                            int var52 = class206.field2924[var51] * this.field8300;
                            int var53 = this.method3330(-4096, var37 * var52 >> 12, var39, var43, var44, var46, var45);
                            arg1[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field8284;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = -59 / ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            this.method3327(arg0, var3, (byte) 43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class581() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public static void method3328(byte arg0) {
        field8283 = null;
        field8285 = null;
        if (arg0 != -102) {
            field8285 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public static final void method3329(byte arg0) {
        ++field8302;
        int var1 = -43 % ((arg0 - 8) / 56);
        class146.field2244.method2406(121);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field8290;
        this.field8289 = class175.method1202(255, this.field8299);
        this.method3331((byte) -92);
        if (arg0 <= -97) {
            for (int var2 = this.field8286 + -1; ~var2 <= -2; --var2) {
                short var3 = this.field8293[var2];
                if (~var3 < -9) {
                    return;
                }
                if (var3 < -8) {
                    return;
                }
                --this.field8286;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)I")
    private final int method3330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8292;
        int var8 = arg1 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (~var9 <= ~arg2) {
            var9 = 0;
        }
        int var11 = arg1 & 4095;
        int var12 = arg0 + arg3;
        int var13 = var9 & 255;
        int var14 = var11 - 4096;
        int var15 = class186.field2693[var11];
        int var16 = this.field8289[arg6 + var10] & 3;
        int var17;
        if (var16 <= 1) {
            var17 = ~var16 == -1 ? arg3 + var11 : -var11 + arg3;
        } else {
            var17 = ~var16 == -3 ? -arg3 + var11 : -arg3 + -var11;
        }
        int var18 = 3 & this.field8289[arg6 + var13];
        int var19;
        if (~var18 < -2) {
            var19 = var18 != 2 ? -arg3 + -var14 : var14 - arg3;
        } else {
            var19 = ~var18 == -1 ? arg3 + var14 : -var14 + arg3;
        }
        int var20 = var17 - -((var19 - var17) * var15 >> 12);
        int var21 = this.field8289[arg4 + var10] & 3;
        int var22;
        if (~var21 >= -2) {
            var22 = ~var21 == -1 ? var11 - -var12 : -var11 + var12;
        } else {
            var22 = var21 == 2 ? -var12 + var11 : -var11 - var12;
        }
        int var23 = this.field8289[arg4 + var13] & 3;
        int var24;
        if (~var23 >= -2) {
            var24 = var23 == 0 ? var12 + var14 : -var14 + var12;
        } else {
            var24 = var23 != 2 ? -var12 + -var14 : -var12 + var14;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg5 >> 12) + var20;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V")
    private final void method3331(byte arg0) {
        ++field8295;
        if (~this.field8288 >= -1) {
            if (this.field8293 != null && ~this.field8293.length == ~this.field8286) {
                this.field8294 = new short[this.field8286];
                for (int var2 = 0; var2 < this.field8286; ++var2) {
                    this.field8294[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field8293 = new short[this.field8286];
            this.field8294 = new short[this.field8286];
            for (int var3 = 0; ~var3 > ~this.field8286; ++var3) {
                this.field8293[var3] = (short) ((int) (Math.pow((double) ((float) this.field8288 / 4096.0F), (double) var3) * 4096.0D));
                this.field8294[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 > -39) {
            this.field8299 = 88;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field8301;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field8291 = arg2.method1738(255);
                                }
                            } else {
                                this.field8300 = arg2.method1738(255);
                            }
                        } else {
                            this.field8299 = arg2.method1738(255);
                        }
                    } else {
                        this.field8300 = this.field8291 = arg2.method1738(255);
                    }
                } else {
                    this.field8288 = arg2.method1730(13436);
                    if (~this.field8288 > -1) {
                        this.field8293 = new short[this.field8286];
                        for (int var5 = 0; this.field8286 > var5; ++var5) {
                            this.field8293[var5] = (short) arg2.method1730(13436);
                        }
                    }
                }
            } else {
                this.field8286 = arg2.method1738(255);
            }
        } else {
            this.field8297 = arg2.method1738(255) == 1;
        }
        if (arg0 < 75) {
            this.field8293 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3332(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
