import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class168 extends class466 {

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public int field2421 = 4;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public int field2420 = 4;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public int field2426 = 1638;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "[B")
    private byte[] field2429 = new byte[512];

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public int field2422 = 0;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    public int field2435 = 4;

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "Z")
    public boolean field2437 = true;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "Z")
    public static boolean field2427;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "[[I")
    public static int[][] field2436;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "[S")
    private short[] field2423;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "[S")
    private short[] field2428;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIII)I")
    private final int method1072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2419;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg6 & 4095;
        if (arg4 <= var9) {
            var9 = 0;
        }
        int var12 = var11 - 4096;
        int var13 = var9 & 255;
        if (arg3 != 128) {
            return -104;
        } else {
            int var14 = arg2 + -4096;
            int var15 = this.field2429[var10 - -arg5] & 3;
            int var16 = class219.field3133[var11];
            int var17;
            if (var15 > 1) {
                var17 = var15 != 2 ? -var11 - arg2 : -arg2 + var11;
            } else {
                var17 = ~var15 == -1 ? var11 - -arg2 : arg2 - var11;
            }
            int var18 = this.field2429[arg5 + var13] & 3;
            int var19;
            if (~var18 >= -2) {
                var19 = ~var18 != -1 ? -var12 + arg2 : arg2 + var12;
            } else {
                var19 = ~var18 == -3 ? -arg2 + var12 : -var12 - arg2;
            }
            int var20 = this.field2429[arg0 + var10] & 3;
            int var21 = ((var19 - var17) * var16 >> 12) + var17;
            int var22;
            if (~var20 < -2) {
                var22 = var20 == 2 ? -var14 + var11 : -var11 + -var14;
            } else {
                var22 = var20 != 0 ? -var11 + var14 : var11 + var14;
            }
            int var23 = this.field2429[var13 - -arg0] & 3;
            int var24;
            if (var23 <= 1) {
                var24 = var23 != 0 ? var14 - var12 : var12 + var14;
            } else {
                var24 = ~var23 == -3 ? var12 - var14 : -var12 + -var14;
            }
            int var25 = ((-var22 + var24) * var16 >> 12) + var22;
            return var21 - -((-var21 + var25) * arg1 >> 12);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field2420 = arg0.method110((byte) 89);
                                }
                            } else {
                                this.field2421 = arg0.method110((byte) 66);
                            }
                        } else {
                            this.field2422 = arg0.method110((byte) 88);
                        }
                    } else {
                        this.field2421 = this.field2420 = arg0.method110((byte) 51);
                    }
                } else {
                    this.field2426 = arg0.method111(-126);
                    if (this.field2426 < 0) {
                        this.field2423 = new short[this.field2435];
                        for (int var5 = 0; this.field2435 > var5; ++var5) {
                            this.field2423[var5] = (short) arg0.method111(-126);
                        }
                    }
                }
            } else {
                this.field2435 = arg0.method110((byte) 37);
            }
        } else {
            this.field2437 = arg0.method110((byte) 35) == 1;
        }
        if (arg1 != -5062) {
            this.method1076(88, 28, (int[]) null);
        }
        ++field2433;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
    private final void method1073(boolean arg0) {
        if (arg0) {
            this.method1076(41, 38, (int[]) null);
        }
        ++field2424;
        if (~this.field2426 >= -1) {
            if (this.field2423 != null && ~this.field2423.length == ~this.field2435) {
                this.field2428 = new short[this.field2435];
                for (int var2 = 0; this.field2435 > var2; ++var2) {
                    this.field2428[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field2423 = new short[this.field2435];
            this.field2428 = new short[this.field2435];
            for (int var3 = 0; var3 < this.field2435; ++var3) {
                this.field2423[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2426 / 4096.0F), (double) var3)));
                this.field2428[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1074(String arg0, int arg1) {
        ++field2432;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; ~var4 > ~var2; ++var4) {
            var3 = (var3 << 5) + (-var3 - -arg0.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field2434;
        int[] var3 = super.field6557.method565(arg0, arg1 + -24728);
        if (arg1 != 0) {
            this.field2426 = 117;
        }
        if (super.field6557.field1163) {
            this.method1076(123, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != -806066388) {
            this.method1073(true);
        }
        ++field2425;
        this.field2429 = class575.method3274(511, this.field2422);
        this.method1073(false);
        for (int var2 = this.field2435 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2423[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field2435;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)V")
    public static void method1075(boolean arg0) {
        field2436 = null;
        if (!arg0) {
            method1074((String) null, 115);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II[I)V")
    public final void method1076(int arg0, int arg1, int[] arg2) {
        ++field2431;
        int var4 = class63.field1085[arg1] * this.field2420;
        if (arg0 <= 83) {
            this.field2421 = -100;
        }
        if (this.field2435 == 1) {
            short var5 = this.field2423[0];
            int var6 = this.field2428[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field2420 * var6 >> 12;
            int var9 = this.field2421 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            int var12 = var7 & 4095;
            if (~var11 <= ~var8) {
                var11 = 0;
            }
            int var13 = this.field2429[var11 & 255] & 255;
            int var14 = this.field2429[255 & var10] & 255;
            int var15 = class219.field3133[var12];
            if (!this.field2437) {
                for (int var16 = 0; var16 < class312.field4207; ++var16) {
                    int var17 = class431.field6129[var16] * this.field2421;
                    int var18 = this.method1072(var13, var15, var12, 128, var9, var14, var6 * var17 >> 12);
                    arg2[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; var19 < class312.field4207; ++var19) {
                    int var20 = class431.field6129[var19] * this.field2421;
                    int var21 = this.method1072(var13, var15, var12, 128, var9, var14, var6 * var20 >> 12);
                    int var22 = var5 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field2423[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field2428[0] << 12;
                int var25 = this.field2421 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = this.field2420 * var24 >> 12;
                int var28 = var26 >> 12;
                int var29 = var28 - -1;
                int var30 = var26 & 4095;
                if (~var27 >= ~var29) {
                    var29 = 0;
                }
                int var31 = this.field2429[255 & var28] & 255;
                int var32 = 255 & this.field2429[var29 & 255];
                int var33 = class219.field3133[var30];
                for (int var34 = 0; ~var34 > ~class312.field4207; ++var34) {
                    int var54 = class431.field6129[var34] * this.field2421;
                    int var55 = this.method1072(var32, var33, var30, 128, var25, var31, var24 * var54 >> 12);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field2435 < ~var35; ++var35) {
                short var36 = this.field2423[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field2428[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field2421 * var37 >> 12;
                    int var40 = this.field2420 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    if (var40 <= var42) {
                        var42 = 0;
                    }
                    int var43 = var38 & 4095;
                    int var44 = class219.field3133[var43];
                    int var45 = 255 & this.field2429[var42 & 255];
                    int var46 = this.field2429[var41 & 255] & 255;
                    if (this.field2437 && this.field2435 + -1 == var35) {
                        for (int var47 = 0; ~class312.field4207 < ~var47; ++var47) {
                            int var48 = class431.field6129[var47] * this.field2421;
                            int var49 = this.method1072(var45, var44, var43, 128, var39, var46, var37 * var48 >> 12);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; var51 < class312.field4207; ++var51) {
                            int var52 = class431.field6129[var51] * this.field2421;
                            int var53 = this.method1072(var45, var44, var43, 128, var39, var46, var37 * var52 >> 12);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILbe;I)V")
    public static final void method1077(int arg0, class33 arg1, int arg2) {
        ++field2430;
        int var3 = -1;
        int var4 = 0;
        if (arg0 == 6621) {
            if (~class405.field5763 <= ~arg1.field538) {
                if (~arg1.field546 <= ~class405.field5763) {
                    class557.method3164(2, arg1);
                } else {
                    class348.method2095(false, (byte) -100, arg1);
                    var4 = class152.field2303;
                    var3 = class155.field2315;
                }
            } else {
                class112.method780(arg0 + -6557, arg1);
            }
            if (~arg1.field6037 > -129 || ~arg1.field6029 > -129 || class32.field513 * 128 + -128 <= arg1.field6037 || arg1.field6029 >= (class611.field8786 + -1) * 128) {
                arg1.field538 = 0;
                var4 = 0;
                var3 = -1;
                arg1.field556 = -1;
                arg1.field535 = -1;
                arg1.field546 = 0;
                arg1.field523 = -1;
                arg1.field6037 = arg1.field616[0] * 128 - -(64 * arg1.method337(0));
                arg1.field6029 = arg1.field618[0] * 128 + 64 * arg1.method337(0);
                arg1.method333(arg0 + -6556);
            }
            if (class645.field9372 == arg1 && (arg1.field6037 < 1536 || arg1.field6029 < 1536 || (class32.field513 + -12) * 128 <= arg1.field6037 || arg1.field6029 >= class611.field8786 * 128 + -1536)) {
                var3 = -1;
                arg1.field556 = -1;
                arg1.field546 = 0;
                arg1.field538 = 0;
                arg1.field535 = -1;
                var4 = 0;
                arg1.field523 = -1;
                arg1.field6037 = arg1.field616[0] * 128 + 64 * arg1.method337(0);
                arg1.field6029 = arg1.field618[0] * 128 - -(64 * arg1.method337(0));
                arg1.method333(arg0 + -6556);
            }
            int var5 = class572.method3261(false, arg1);
            class141.method933(arg1, var5, var3, var4, (byte) 110);
            class182.method1142(true, arg1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class168() {
        super(0, true);
    }

    static {
        new class104("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field2427 = false;
        field2436 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
    }
}
