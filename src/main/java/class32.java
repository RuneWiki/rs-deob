import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class32 extends class40 {

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    public int field392 = 4;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public int field400 = 0;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
    public int field402 = 4;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public int field394 = 1638;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "Z")
    public boolean field396 = true;

    @OriginalMember(owner = "client!dm", name = "eb", descriptor = "[B")
    private byte[] field408 = new byte[512];

    @OriginalMember(owner = "client!dm", name = "gb", descriptor = "I")
    public int field410 = 4;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "Lcl;")
    public static class145 field395 = new class145();

    @OriginalMember(owner = "client!dm", name = "hb", descriptor = "[I")
    public static int[] field411 = new int[50];

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!dm", name = "bb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!dm", name = "cb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!dm", name = "db", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!dm", name = "fb", descriptor = "Lug;")
    public static class335 field409;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dm", name = "ib", descriptor = "Ljava/lang/Class;")
    public static Class field412;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "[S")
    private short[] field393;

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "[S")
    private short[] field404;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "[[[B")
    public static byte[][][] field398;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field405;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field410 = arg2.method837(true);
                                }
                            } else {
                                this.field402 = arg2.method837(true);
                            }
                        } else {
                            this.field400 = arg2.method837(true);
                        }
                    } else {
                        this.field402 = this.field410 = arg2.method837(true);
                    }
                } else {
                    this.field394 = arg2.method844(698527688);
                    if (~this.field394 > -1) {
                        this.field393 = new short[this.field392];
                        for (int var5 = 0; this.field392 > var5; ++var5) {
                            this.field393[var5] = (short) arg2.method844(698527688);
                        }
                    }
                }
            } else {
                this.field392 = arg2.method837(true);
            }
        } else {
            this.field396 = ~arg2.method837(true) == -2;
        }
        if (arg1 <= 79) {
            method176((class102) null, (byte) -44);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB[I)V")
    public final void method174(int arg0, byte arg1, int[] arg2) {
        ++field389;
        int var4 = class86.field1123[arg0] * this.field410;
        if (~this.field392 == -2) {
            int var5 = this.field404[0] << 12;
            short var6 = this.field393[0];
            int var7 = var4 * var5 >> 12;
            int var8 = this.field402 * var5 >> 12;
            int var9 = this.field410 * var5 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var9) {
                var11 = 0;
            }
            int var12 = var7 & 4095;
            int var13 = class252.field3742[var12];
            int var14 = this.field408[255 & var11] & 255;
            int var15 = 255 & this.field408[255 & var10];
            if (!this.field396) {
                for (int var16 = 0; class410.field5886 > var16; ++var16) {
                    int var17 = class9.field124[var16] * this.field402;
                    int var18 = this.method178(4095, var14, var5 * var17 >> 12, var12, var15, var13, var8);
                    arg2[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; var19 < class410.field5886; ++var19) {
                    int var20 = class9.field124[var19] * this.field402;
                    int var21 = this.method178(4095, var14, var5 * var20 >> 12, var12, var15, var13, var8);
                    int var22 = var6 * var21 >> 12;
                    arg2[var19] = 2048 - -(var22 >> 1);
                }
            }
        } else {
            short var23 = this.field393[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field404[0] << 12;
                int var25 = this.field402 * var24 >> 12;
                int var26 = this.field410 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 - -1;
                if (var26 <= var29) {
                    var29 = 0;
                }
                int var30 = var27 & 4095;
                int var31 = this.field408[var29 & 255] & 255;
                int var32 = 255 & this.field408[var28 & 255];
                int var33 = class252.field3742[var30];
                for (int var34 = 0; ~var34 > ~class410.field5886; ++var34) {
                    int var54 = class9.field124[var34] * this.field402;
                    int var55 = this.method178(4095, var31, var24 * var54 >> 12, var30, var32, var33, var25);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field392 < ~var35; ++var35) {
                short var36 = this.field393[var35];
                if (~var36 < -9 || ~var36 > 7) {
                    int var37 = this.field404[var35] << 12;
                    int var38 = this.field410 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field402 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    if (~var38 >= ~var42) {
                        var42 = 0;
                    }
                    int var43 = var39 & 4095;
                    int var44 = 255 & this.field408[255 & var41];
                    int var45 = this.field408[var42 & 255] & 255;
                    int var46 = class252.field3742[var43];
                    if (this.field396 && this.field392 + -1 == var35) {
                        for (int var47 = 0; ~class410.field5886 < ~var47; ++var47) {
                            int var48 = class9.field124[var47] * this.field402;
                            int var49 = this.method178(arg1 + 3979, var45, var37 * var48 >> 12, var43, var44, var46, var40);
                            int var50 = arg2[var47] - -(var36 * var49 >> 12);
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class410.field5886; ++var51) {
                            int var52 = class9.field124[var51] * this.field402;
                            int var53 = this.method178(4095, var45, var37 * var52 >> 12, var43, var44, var46, var40);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 != 116) {
            this.method175((byte) 80);
        }
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(B)V")
    public final void method39(byte arg0) {
        ++field406;
        this.field408 = class239.method1630((byte) -12, this.field400);
        this.method175((byte) -121);
        for (int var2 = this.field392 + -1; var2 >= 1; --var2) {
            short var3 = this.field393[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field392;
        }
        if (arg0 != -23) {
            this.method174(23, (byte) -76, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "(B)V")
    private final void method175(byte arg0) {
        int var2 = 68 / ((41 - arg0) / 51);
        if (this.field394 <= 0) {
            if (this.field393 != null && this.field393.length == this.field392) {
                this.field404 = new short[this.field392];
                for (int var3 = 0; ~var3 > ~this.field392; ++var3) {
                    this.field404[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        } else {
            this.field393 = new short[this.field392];
            this.field404 = new short[this.field392];
            for (int var4 = 0; this.field392 > var4; ++var4) {
                this.field393[var4] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field394 / 4096.0F), (double) var4)));
                this.field404[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
        ++field399;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lop;B)V")
    public static final void method176(class102 arg0, byte arg1) {
        if (arg1 == 110) {
            ++field401;
            if (class385.field5449 != null) {
                class143 var2 = null;
                if (~arg0.field1287 == -1) {
                    var2 = (class143) class431.method2683(arg0.field1284, arg0.field1289, arg0.field1285);
                }
                if (~arg0.field1287 == -2) {
                    var2 = (class143) class145.method1084(arg0.field1284, arg0.field1289, arg0.field1285);
                }
                if (~arg0.field1287 == -3) {
                    var2 = (class143) class233.method1613(arg0.field1284, arg0.field1289, arg0.field1285, field412 != null ? field412 : (field412 = method181("mb")));
                }
                if (~arg0.field1287 == -4) {
                    var2 = (class143) class353.method2309(arg0.field1284, arg0.field1289, arg0.field1285);
                }
                if (var2 == null) {
                    arg0.field1294 = 0;
                    arg0.field1298 = -1;
                    arg0.field1288 = 0;
                } else {
                    arg0.field1298 = var2.method599(arg1 + -10560);
                    arg0.field1288 = var2.method602((byte) -101);
                    arg0.field1294 = var2.method603((byte) -62);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)I")
    public static final int method177(int arg0, int arg1, int arg2) {
        if (arg2 != 26055) {
            field395 = null;
        }
        ++field407;
        int var3 = 1;
        while (~arg1 < -2) {
            if ((1 & arg1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 1;
            arg0 *= arg0;
        }
        if (~arg1 == -2) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIII)I")
    private final int method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field403;
        int var8 = arg2 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg6) {
            var9 = 0;
        }
        int var10 = arg2 & arg0;
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = arg3 + -4096;
        int var14 = var10 + -4096;
        int var15 = 3 & this.field408[var11 - -arg4];
        int var16 = class252.field3742[var10];
        int var17;
        if (~var15 < -2) {
            var17 = var15 != 2 ? -var10 - arg3 : -arg3 + var10;
        } else {
            var17 = ~var15 != -1 ? -var10 + arg3 : var10 - -arg3;
        }
        int var18 = 3 & this.field408[arg4 + var12];
        int var19;
        if (var18 > 1) {
            var19 = ~var18 == -3 ? -arg3 + var14 : -var14 - arg3;
        } else {
            var19 = ~var18 == -1 ? var14 - -arg3 : -var14 + arg3;
        }
        int var20 = var17 - -((var19 - var17) * var16 >> 12);
        int var21 = this.field408[var11 - -arg1] & 3;
        int var22;
        if (~var21 >= -2) {
            var22 = var21 == 0 ? var10 + var13 : -var10 + var13;
        } else {
            var22 = var21 != 2 ? -var10 + -var13 : -var13 + var10;
        }
        int var23 = this.field408[arg1 + var12] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 == -3 ? var14 - var13 : -var14 - var13;
        } else {
            var24 = ~var23 != -1 ? -var14 + var13 : var13 + var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return var20 - -((-var20 + var25) * arg5 >> 12);
    }

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "(B)V")
    public static final void method179(byte arg0) {
        if (class411.method2605((byte) 113)) {
            if (class1.field4 == null) {
                class445.method2770(arg0 ^ 30463);
            }
            class408.field5786 = true;
            class226.field3372 = new boolean[100];
            class409.field5817 = new int[100];
            class5.field84 = 0;
            class126.field1744 = new int[100];
            class204.field2881 = new int[100];
            for (int var1 = 0; ~var1 > -101; ++var1) {
                class409.field5817[var1] = (int) (Math.random() * (double) class24.field307);
                class204.field2881[var1] = (int) (350.0D * Math.random());
                class126.field1744[var1] = (int) (Math.random() * 102.0D);
                class226.field3372[var1] = Math.random() < 0.5D;
            }
            try {
                class402.field5642 = class296.field4282.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        if (arg0 != 80) {
            field409 = null;
        }
        ++field390;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field391;
        if (arg0 >= -20) {
            return null;
        } else {
            int[] var3 = super.field551.method185(65280, arg1);
            if (super.field551.field441) {
                this.method174(arg1, (byte) 116, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public static void method180(int arg0) {
        field398 = null;
        field395 = null;
        field409 = null;
        field411 = null;
        if (arg0 != -403932980) {
            field395 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method181(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
