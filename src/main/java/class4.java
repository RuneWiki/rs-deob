import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class4 extends class144 {

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    private int field48 = -1;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Lef;")
    public static class241 field47 = new class241(128);

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "[I")
    public int[] field51;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "[I")
    public static int[] field57;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "[S")
    public static short[] field62;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field48 = arg1.method1380(true);
        }
        if (arg2 != 20630) {
            this.field51 = null;
        }
        ++field46;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
    public static void method19(int arg0) {
        field57 = null;
        if (arg0 != 5024) {
            method25(11, false);
        }
        field47 = null;
        field62 = null;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)I")
    public final int method20(int arg0) {
        int var2 = -52 % ((arg0 - -65) / 57);
        ++field54;
        return this.field48;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIB)I")
    public static final int method21(int arg0, int arg1, int arg2, byte arg3) {
        ++field50;
        if (class290.field4536 == null) {
            return 0;
        } else {
            int var4 = arg0 >> 7;
            int var5 = arg2 >> 7;
            if (~var5 <= -1 && var4 >= 0 && ~var5 >= -104 && var4 <= 103) {
                if (arg3 != 26) {
                    field57 = null;
                }
                int var6 = arg1;
                int var7 = arg2 & 127;
                if (arg1 < 3 && (2 & class241.field3507[1][var5][var4]) == 2) {
                    var6 = arg1 + 1;
                }
                int var8 = arg0 & 127;
                int var9 = (-var7 + 128) * class290.field4536[var6][var5][var4 + 1] - -(class290.field4536[var6][var5 + 1][var4 - -1] * var7) >> 7;
                int var10 = (-var7 + 128) * class290.field4536[var6][var5][var4] - -(class290.field4536[var6][var5 + 1][var4] * var7) >> 7;
                return (128 - var8) * var10 + var8 * var9 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)[[I")
    public int[][] method8(byte arg0, int arg1) {
        if (arg0 != 5) {
            this.field49 = 64;
        }
        ++field44;
        int[][] var3 = super.field2053.method1542(120, arg1);
        if (super.field2053.field3408 && this.method24(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field45 * (~class257.field3727 != ~this.field49 ? this.field49 * arg1 / class257.field3727 : arg1);
            if (~class104.field1411 == ~this.field45) {
                for (int var8 = 0; ~class104.field1411 < ~var8; ++var8) {
                    int var9 = this.field51[var7++];
                    var6[var8] = class5.method26(var9, 255) << 4;
                    var5[var8] = class5.method26(4080, var9 >> 4);
                    var4[var8] = class5.method26(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~class104.field1411 < ~var10; ++var10) {
                    int var11 = this.field45 * var10 / class104.field1411;
                    int var12 = this.field51[var7 - -var11];
                    var6[var10] = class5.method26(var12, 255) << 4;
                    var5[var10] = class5.method26(var12, 65280) >> 4;
                    var4[var10] = class5.method26(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "h", descriptor = "(I)V")
    public static final void method22(int arg0) {
        if (arg0 > 95) {
            while (true) {
                class219 var1;
                class290 var3;
                do {
                    var1 = (class219) class133.field1933.method1526(16383);
                    if (var1 == null) {
                        ++field59;
                        return;
                    }
                    if (~var1.field3092 <= -1) {
                        int var2 = var1.field3092 + -1;
                        var3 = class20.field244[var2];
                    } else {
                        int var4 = -var1.field3092 + -1;
                        if (class33.field385 != var4) {
                            var3 = class253.field3656[var4];
                        } else {
                            var3 = class177.field2507;
                        }
                    }
                } while (var3 == null);
                class273 var5 = class164.method1081(0, var1.field3111);
                int var6;
                int var7;
                if (~var1.field3109 != -2 && ~var1.field3109 != -4) {
                    var6 = var5.field4023;
                    var7 = var5.field4008;
                } else {
                    var7 = var5.field4023;
                    var6 = var5.field4008;
                }
                int var8 = (var6 >> 1) + var1.field3113;
                int var9 = (var6 + 1 >> 1) + var1.field3113;
                int var10 = (var7 - -1 >> 1) + var1.field3103;
                int var11 = var1.field3103 - -(var7 >> 1);
                int[][] var12 = class290.field4536[class199.field2833];
                int var13 = var12[var10][var9] + var12[var11][var9] + var12[var10][var8] + var12[var11][var8] >> 2;
                int var14 = class6.field85[var1.field3097];
                class131 var15 = null;
                if (~var14 == -1) {
                    class118 var16 = class72.method449(class199.field2833, var1.field3103, var1.field3113);
                    if (var16 != null) {
                        var15 = var16.field1672;
                    }
                } else if (~var14 != -2) {
                    if (var14 == 2) {
                        class243 var17 = class292.method1954(class199.field2833, var1.field3103, var1.field3113);
                        if (var17 != null) {
                            var15 = var17.field3526;
                        }
                    } else if (~var14 == -4) {
                        class50 var18 = class70.method423(class199.field2833, var1.field3103, var1.field3113);
                        if (var18 != null) {
                            var15 = var18.field568;
                        }
                    }
                } else {
                    class163 var19 = class26.method158(class199.field2833, var1.field3103, var1.field3113);
                    if (var19 != null) {
                        var15 = var19.field2335;
                    }
                }
                if (var15 != null) {
                    class30.method184(0, -1, class199.field2833, var1.field3103, var14, var1.field3106 + 1, (byte) -111, var1.field3113, 0, var1.field3094 + 1);
                    var3.field4519 = var1.field3113 * 128 + var6 * 64;
                    var3.field4587 = var15;
                    var3.field4598 = var13;
                    int var20 = var1.field3105;
                    var3.field4511 = var1.field3103 * 128 + var7 * 64;
                    int var21 = var1.field3102;
                    var3.field4549 = class198.field2819 + var1.field3106;
                    int var22 = var1.field3100;
                    var3.field4551 = class198.field2819 + var1.field3094;
                    int var23 = var1.field3095;
                    if (~var23 < ~var21) {
                        int var24 = var23;
                        var23 = var21;
                        var21 = var24;
                    }
                    if (var22 < var20) {
                        int var25 = var20;
                        var20 = var22;
                        var22 = var25;
                    }
                    var3.field4569 = var1.field3113 + var20;
                    var3.field4589 = var1.field3113 + var22;
                    var3.field4552 = var1.field3103 + var21;
                    var3.field4532 = var1.field3103 + var23;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public final void method23(int arg0) {
        ++field55;
        super.method23(arg0);
        this.field51 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        if (!arg0) {
            method19(-105);
        }
        ++field52;
        if (this.field51 != null) {
            return true;
        } else if (~this.field48 <= -1) {
            class187 var2 = class93.field1249 >= 0 ? class61.method380(0, this.field48, class238.field3434, class93.field1249) : class251.method1614(-20047, class238.field3434, this.field48);
            var2.method1228();
            this.field45 = var2.field1882;
            this.field51 = var2.field2691;
            this.field49 = var2.field1879;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V")
    public static final void method25(int arg0, boolean arg1) {
        if (~arg0 != -38) {
            if (arg0 == 50) {
                class273.field4042 = 4.0F;
            } else if (~arg0 == -76) {
                class273.field4042 = 6.0F;
            } else if (arg0 == 100) {
                class273.field4042 = 8.0F;
            } else if (arg0 == 200) {
                class273.field4042 = 16.0F;
            }
        } else {
            class273.field4042 = 3.0F;
        }
        class294.field4647 = -1;
        ++field53;
        class294.field4647 = -1;
        if (!arg1) {
            field47 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class4() {
        super(0, false);
    }
}
