import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class61 extends class440 {

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "Z")
    public boolean field1149 = true;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public int field1153 = 4;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public int field1151 = 4;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public int field1152 = 4;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public int field1154 = 0;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public int field1157 = 1638;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "[B")
    private byte[] field1160 = new byte[512];

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Lkj;")
    public static class525 field1155 = new class525();

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "Ltr;")
    public static class263 field1163;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "Lpo;")
    public static class518 field1165;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[S")
    private short[] field1158;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "[S")
    private short[] field1162;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field1164;
        int var3 = 0 / ((arg0 - -56) / 41);
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            this.method642(-10242, var4, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final void method230(int arg0) {
        this.field1160 = class605.method3403(arg0 ^ -248, this.field1154);
        ++field1150;
        this.method645(77);
        int var2 = this.field1153 + -1;
        if (arg0 != -9) {
            this.field1154 = -128;
        }
        while (var2 >= 1) {
            short var3 = this.field1158[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field1153;
            --var2;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[II)V")
    public final void method642(int arg0, int[] arg1, int arg2) {
        ++field1159;
        if (arg0 == -10242) {
            int var4 = class418.field6099[arg2] * this.field1152;
            if (this.field1153 == 1) {
                short var5 = this.field1158[0];
                int var6 = this.field1162[0] << 12;
                int var7 = this.field1151 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field1152 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 - -1;
                if (~var11 <= ~var9) {
                    var11 = 0;
                }
                int var12 = var8 & 4095;
                int var13 = 255 & this.field1160[255 & var10];
                int var14 = 255 & this.field1160[var11 & 255];
                int var15 = class339.field4993[var12];
                if (this.field1149) {
                    for (int var16 = 0; class549.field7715 > var16; ++var16) {
                        int var17 = class499.field7073[var16] * this.field1151;
                        int var18 = this.method644(var12, var7, var6 * var17 >> 12, (byte) -94, var15, var13, var14);
                        int var19 = var5 * var18 >> 12;
                        arg1[var16] = (var19 >> 1) + 2048;
                    }
                } else {
                    for (int var20 = 0; ~class549.field7715 < ~var20; ++var20) {
                        int var21 = class499.field7073[var20] * this.field1151;
                        int var22 = this.method644(var12, var7, var6 * var21 >> 12, (byte) -81, var15, var13, var14);
                        arg1[var20] = var5 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field1158[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field1162[0] << 12;
                    int var25 = this.field1151 * var24 >> 12;
                    int var26 = var4 * var24 >> 12;
                    int var27 = this.field1152 * var24 >> 12;
                    int var28 = var26 >> 12;
                    int var29 = var28 + 1;
                    if (var29 >= var27) {
                        var29 = 0;
                    }
                    int var30 = var26 & 4095;
                    int var31 = this.field1160[255 & var29] & 255;
                    int var32 = class339.field4993[var30];
                    int var33 = 255 & this.field1160[255 & var28];
                    for (int var34 = 0; class549.field7715 > var34; ++var34) {
                        int var54 = class499.field7073[var34] * this.field1151;
                        int var55 = this.method644(var30, var25, var24 * var54 >> 12, (byte) -41, var32, var33, var31);
                        arg1[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; ~this.field1153 < ~var35; ++var35) {
                    short var36 = this.field1158[var35];
                    if (~var36 < -9 || ~var36 > 7) {
                        int var37 = this.field1162[var35] << 12;
                        int var38 = this.field1151 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = this.field1152 * var37 >> 12;
                        int var41 = var39 >> 12;
                        int var42 = var41 + 1;
                        int var43 = var39 & 4095;
                        if (var42 >= var40) {
                            var42 = 0;
                        }
                        int var44 = this.field1160[var42 & 255] & 255;
                        int var45 = this.field1160[255 & var41] & 255;
                        int var46 = class339.field4993[var43];
                        if (this.field1149 && ~(this.field1153 + -1) == ~var35) {
                            for (int var47 = 0; var47 < class549.field7715; ++var47) {
                                int var48 = class499.field7073[var47] * this.field1151;
                                int var49 = this.method644(var43, var38, var37 * var48 >> 12, (byte) -116, var46, var45, var44);
                                int var50 = (var36 * var49 >> 12) + arg1[var47];
                                arg1[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; class549.field7715 > var51; ++var51) {
                                int var52 = class499.field7073[var51] * this.field1151;
                                int var53 = this.method644(var43, var38, var37 * var52 >> 12, (byte) -121, var46, var45, var44);
                                arg1[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V")
    public static void method643(int arg0) {
        field1163 = null;
        field1155 = null;
        field1165 = null;
        if (arg0 >= -101) {
            field1163 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBIII)I")
    private final int method644(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field1148;
        if (arg3 > -39) {
            return -80;
        } else {
            int var8 = arg2 >> 12;
            int var9 = var8 + 1;
            int var10 = arg2 & 4095;
            if (arg1 <= var9) {
                var9 = 0;
            }
            int var11 = var8 & 255;
            int var12 = var10 + -4096;
            int var13 = var9 & 255;
            int var14 = arg0 + -4096;
            int var15 = 3 & this.field1160[arg5 + var11];
            int var16 = class339.field4993[var10];
            int var17;
            if (~var15 < -2) {
                var17 = ~var15 != -3 ? -arg0 + -var10 : var10 - arg0;
            } else {
                var17 = ~var15 == -1 ? arg0 + var10 : -var10 + arg0;
            }
            int var18 = this.field1160[arg5 + var13] & 3;
            int var19;
            if (~var18 >= -2) {
                var19 = var18 == 0 ? arg0 + var12 : arg0 - var12;
            } else {
                var19 = ~var18 != -3 ? -arg0 + -var12 : -arg0 + var12;
            }
            int var20 = ((var19 - var17) * var16 >> 12) + var17;
            int var21 = 3 & this.field1160[arg6 + var11];
            int var22;
            if (var21 > 1) {
                var22 = var21 == 2 ? -var14 + var10 : -var10 - var14;
            } else {
                var22 = var21 == 0 ? var10 + var14 : -var10 + var14;
            }
            int var23 = 3 & this.field1160[arg6 + var13];
            int var24;
            if (~var23 >= -2) {
                var24 = ~var23 == -1 ? var12 - -var14 : -var12 + var14;
            } else {
                var24 = ~var23 == -3 ? -var14 + var12 : -var12 + -var14;
            }
            int var25 = var22 - -((-var22 + var24) * var16 >> 12);
            return ((var25 - var20) * arg4 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
    private final void method645(int arg0) {
        if (~this.field1157 >= -1) {
            if (this.field1158 != null && this.field1158.length == this.field1153) {
                this.field1162 = new short[this.field1153];
                for (int var2 = 0; ~var2 > ~this.field1153; ++var2) {
                    this.field1162[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field1158 = new short[this.field1153];
            this.field1162 = new short[this.field1153];
            for (int var3 = 0; this.field1153 > var3; ++var3) {
                this.field1158[var3] = (short) ((int) (Math.pow((double) ((float) this.field1157 / 4096.0F), (double) var3) * 4096.0D));
                this.field1162[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field1156;
        if (arg0 <= 31) {
            this.method644(119, -24, 22, (byte) 71, 25, 18, 54);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 != 5) {
            this.method234(7, (class695) null, -22);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1152 = arg1.method3826(false);
                                }
                            } else {
                                this.field1151 = arg1.method3826(false);
                            }
                        } else {
                            this.field1154 = arg1.method3826(false);
                        }
                    } else {
                        this.field1151 = this.field1152 = arg1.method3826(false);
                    }
                } else {
                    this.field1157 = arg1.method3814(false);
                    if (~this.field1157 > -1) {
                        this.field1158 = new short[this.field1153];
                        for (int var5 = 0; ~var5 > ~this.field1153; ++var5) {
                            this.field1158[var5] = (short) arg1.method3814(false);
                        }
                    }
                }
            } else {
                this.field1153 = arg1.method3826(false);
            }
        } else {
            this.field1149 = ~arg1.method3826(false) == -2;
        }
        ++field1161;
    }
}
