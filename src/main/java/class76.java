import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class76 extends class436 {

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "[B")
    private byte[] field1174 = new byte[512];

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public int field1181 = 1638;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public int field1182 = 4;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public int field1175 = 4;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public int field1176 = 4;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "Z")
    public boolean field1188 = true;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    public int field1190 = 0;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Lre;")
    public static class357 field1178 = new class357();

    @OriginalMember(owner = "client!wk", name = "ab", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!wk", name = "Z", descriptor = "J")
    public static long field1193 = 0L;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "Lje;")
    public static class229 field1192 = new class229();

    @OriginalMember(owner = "client!wk", name = "bb", descriptor = "Z")
    public static boolean field1195 = false;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "[I")
    public static int[] field1179;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "[S")
    private short[] field1177;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "[S")
    private short[] field1185;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V", line = 3)
    public final void method44(int arg0) {
        if (arg0 != -14) {
            field1194 = 71;
        }
        ++field1187;
        this.field1174 = class20.method125(this.field1190, -67);
        this.method544(arg0 + -73);
        for (int var2 = this.field1175 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field1185[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field1175;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I", line = 36)
    public final int[] method14(int arg0, int arg1) {
        ++field1186;
        if (arg1 != 18338) {
            this.field1185 = null;
        }
        int[] var3 = super.field6258.method2688((byte) -93, arg0);
        if (super.field6258.field6138) {
            this.method540(var3, (byte) 2, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([IBI)V", line = 59)
    public final void method540(int[] arg0, byte arg1, int arg2) {
        ++field1180;
        int var4 = class32.field499[arg2] * this.field1176;
        int var5 = -19 % ((arg1 - -53) / 55);
        if (this.field1175 == 1) {
            int var6 = this.field1177[0] << 12;
            short var7 = this.field1185[0];
            int var8 = var4 * var6 >> 12;
            int var9 = this.field1176 * var6 >> 12;
            int var10 = this.field1182 * var6 >> 12;
            int var11 = var8 >> 12;
            int var12 = var11 + 1;
            if (~var12 <= ~var9) {
                var12 = 0;
            }
            int var13 = var8 & 4095;
            int var14 = 255 & this.field1174[var11 & 255];
            int var15 = class143.field2069[var13];
            int var16 = 255 & this.field1174[255 & var12];
            if (!this.field1188) {
                for (int var17 = 0; class43.field653 > var17; ++var17) {
                    int var18 = class249.field3455[var17] * this.field1182;
                    int var19 = this.method543(var10, var6 * var18 >> 12, var13, var16, var14, -17490580, var15);
                    arg0[var17] = var7 * var19 >> 12;
                }
            } else {
                for (int var20 = 0; ~class43.field653 < ~var20; ++var20) {
                    int var21 = class249.field3455[var20] * this.field1182;
                    int var22 = this.method543(var10, var6 * var21 >> 12, var13, var16, var14, -17490580, var15);
                    int var23 = var7 * var22 >> 12;
                    arg0[var20] = (var23 >> 1) + 2048;
                }
            }
        } else {
            short var24 = this.field1185[0];
            if (~var24 < -9 || ~var24 > 7) {
                int var25 = this.field1177[0] << 12;
                int var26 = this.field1182 * var25 >> 12;
                int var27 = var4 * var25 >> 12;
                int var28 = this.field1176 * var25 >> 12;
                int var29 = var27 >> 12;
                int var30 = var29 + 1;
                if (var28 <= var30) {
                    var30 = 0;
                }
                int var31 = var27 & 4095;
                int var32 = class143.field2069[var31];
                int var33 = this.field1174[var29 & 255] & 255;
                int var34 = 255 & this.field1174[255 & var30];
                for (int var35 = 0; ~var35 > ~class43.field653; ++var35) {
                    int var55 = class249.field3455[var35] * this.field1182;
                    int var56 = this.method543(var26, var25 * var55 >> 12, var31, var34, var33, -17490580, var32);
                    arg0[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; var36 < this.field1175; ++var36) {
                short var37 = this.field1185[var36];
                if (var37 > 8 || var37 < -8) {
                    int var38 = this.field1177[var36] << 12;
                    int var39 = this.field1176 * var38 >> 12;
                    int var40 = var4 * var38 >> 12;
                    int var41 = this.field1182 * var38 >> 12;
                    int var42 = var40 >> 12;
                    int var43 = var42 + 1;
                    int var44 = var40 & 4095;
                    if (var39 <= var43) {
                        var43 = 0;
                    }
                    int var45 = 255 & this.field1174[var43 & 255];
                    int var46 = 255 & this.field1174[var42 & 255];
                    int var47 = class143.field2069[var44];
                    if (this.field1188 && ~(this.field1175 + -1) == ~var36) {
                        for (int var48 = 0; var48 < class43.field653; ++var48) {
                            int var49 = class249.field3455[var48] * this.field1182;
                            int var50 = this.method543(var41, var38 * var49 >> 12, var44, var45, var46, -17490580, var47);
                            int var51 = (var37 * var50 >> 12) + arg0[var48];
                            arg0[var48] = 2048 - -(var51 >> 1);
                        }
                    } else {
                        for (int var52 = 0; var52 < class43.field653; ++var52) {
                            int var53 = class249.field3455[var52] * this.field1182;
                            int var54 = this.method543(var41, var38 * var53 >> 12, var44, var45, var46, -17490580, var47);
                            arg0[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(B)V", line = 218)
    public static void method541(byte arg0) {
        if (arg0 != -34) {
            method541((byte) -27);
        }
        field1192 = null;
        field1178 = null;
        field1179 = null;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 255)
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIBI)Z", line = 259)
    public static final boolean method542(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1189;
        int var5 = 55 / ((-68 - arg3) / 48);
        if ((2 & class221.field2910[0][arg1][arg4]) != 0) {
            return true;
        } else if ((class221.field2910[arg2][arg1][arg4] & 16) != 0) {
            return false;
        } else {
            return ~arg0 == ~class171.method1160(arg2, arg1, arg4, -75);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILeb;)V", line = 282)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field1176 = arg2.method2429(arg0 ^ 34);
                                }
                            } else {
                                this.field1182 = arg2.method2429(0);
                            }
                        } else {
                            this.field1190 = arg2.method2429(arg0 + -34);
                        }
                    } else {
                        this.field1182 = this.field1176 = arg2.method2429(0);
                    }
                } else {
                    this.field1181 = arg2.method2378(-1);
                    if (~this.field1181 > -1) {
                        this.field1185 = new short[this.field1175];
                        for (int var5 = 0; ~this.field1175 < ~var5; ++var5) {
                            this.field1185[var5] = (short) arg2.method2378(-1);
                        }
                    }
                }
            } else {
                this.field1175 = arg2.method2429(0);
            }
        } else {
            this.field1188 = arg2.method2429(0) == 1;
        }
        if (arg0 == 34) {
            ++field1184;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)I", line = 377)
    private final int method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1183;
        int var8 = arg1 >> 12;
        int var9 = var8 - -1;
        int var10 = arg1 & 4095;
        if (arg5 != -17490580) {
            this.field1174 = null;
        }
        if (~var9 <= ~arg0) {
            var9 = 0;
        }
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = var10 - 4096;
        int var14 = arg2 + -4096;
        int var15 = class143.field2069[var10];
        int var16 = 3 & this.field1174[arg4 + var11];
        int var17;
        if (var16 <= 1) {
            var17 = ~var16 != -1 ? -var10 + arg2 : arg2 + var10;
        } else {
            var17 = var16 != 2 ? -arg2 + -var10 : var10 - arg2;
        }
        int var18 = 3 & this.field1174[arg4 + var12];
        int var19;
        if (var18 > 1) {
            var19 = var18 != 2 ? -arg2 + -var13 : -arg2 + var13;
        } else {
            var19 = ~var18 != -1 ? arg2 - var13 : var13 - -arg2;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = this.field1174[arg3 + var11] & 3;
        int var22;
        if (~var21 < -2) {
            var22 = var21 != 2 ? -var10 + -var14 : -var14 + var10;
        } else {
            var22 = var21 != 0 ? -var10 + var14 : var10 + var14;
        }
        int var23 = 3 & this.field1174[arg3 + var12];
        int var24;
        if (var23 > 1) {
            var24 = ~var23 != -3 ? -var13 + -var14 : -var14 + var13;
        } else {
            var24 = var23 != 0 ? -var13 + var14 : var13 - -var14;
        }
        int var25 = ((var24 - var22) * var15 >> 12) + var22;
        return var20 - -((-var20 + var25) * arg6 >> 12);
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V", line = 465)
    private final void method544(int arg0) {
        int var2 = 14 % ((arg0 - 61) / 46);
        ++field1191;
        if (~this.field1181 >= -1) {
            if (this.field1185 != null && ~this.field1185.length == ~this.field1175) {
                this.field1177 = new short[this.field1175];
                for (int var3 = 0; var3 < this.field1175; ++var3) {
                    this.field1177[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
                return;
            }
        } else {
            this.field1177 = new short[this.field1175];
            this.field1185 = new short[this.field1175];
            for (int var4 = 0; ~this.field1175 < ~var4; ++var4) {
                this.field1185[var4] = (short) ((int) (Math.pow((double) ((float) this.field1181 / 4096.0F), (double) var4) * 4096.0D));
                this.field1177[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
    }
}
