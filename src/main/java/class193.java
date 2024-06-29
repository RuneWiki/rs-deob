import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class193 extends class117 {

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    private int field3125 = 1638;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    private int field3124 = 4;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    private int field3127 = 4;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "[B")
    private byte[] field3134 = new byte[512];

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Z")
    private boolean field3137 = true;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    private int field3142 = 4;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    private int field3139 = 0;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "Z")
    public static boolean field3138 = false;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "F")
    public static float field3141 = 0.0F;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "Loa;")
    public static class101 field3128 = new class101(16);

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Lhl;")
    public static class145 field3136;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Ldk;")
    public static class251 field3145;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "[S")
    private short[] field3133;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "[S")
    private short[] field3144;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "[[I")
    public static int[][] field3135;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field3130;
        if (arg0 != 2) {
            this.method1362(-16);
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 126);
        if (super.field1883.field1313) {
            this.method1360(arg1, (byte) 121, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB[I)V")
    private final void method1360(int arg0, byte arg1, int[] arg2) {
        ++field3132;
        int var4 = class173.field2835[arg0] * this.field3142;
        int var5 = -55 / ((80 - arg1) / 40);
        if (~this.field3127 == -2) {
            short var6 = this.field3144[0];
            int var7 = this.field3133[0] << 12;
            int var8 = this.field3142 * var7 >> 12;
            int var9 = var4 * var7 >> 12;
            int var10 = this.field3124 * var7 >> 12;
            int var11 = var9 >> 12;
            int var12 = var9 & 4095;
            int var13 = var11 - -1;
            int var14 = this.field3134[255 & var11] & 255;
            if (~var8 >= ~var13) {
                var13 = 0;
            }
            int var15 = class181.field2953[var12];
            int var16 = this.field3134[255 & var13] & 255;
            if (!this.field3137) {
                for (int var17 = 0; ~var17 > ~class168.field2737; ++var17) {
                    int var18 = class243.field3869[var17] * this.field3124;
                    int var19 = this.method1363(var10, var15, var12, var14, var16, var7 * var18 >> 12, 255);
                    arg2[var17] = var6 * var19 >> 12;
                }
            } else {
                for (int var20 = 0; var20 < class168.field2737; ++var20) {
                    int var21 = class243.field3869[var20] * this.field3124;
                    int var22 = this.method1363(var10, var15, var12, var14, var16, var7 * var21 >> 12, 255);
                    int var23 = var6 * var22 >> 12;
                    arg2[var20] = (var23 >> 1) + 2048;
                }
            }
        } else {
            short var24 = this.field3144[0];
            if (~var24 < -9 || var24 < -8) {
                int var25 = this.field3133[0] << 12;
                int var26 = var4 * var25 >> 12;
                int var27 = var26 >> 12;
                int var28 = this.field3142 * var25 >> 12;
                int var29 = var27 + 1;
                int var30 = this.field3124 * var25 >> 12;
                int var31 = var26 & 4095;
                int var32 = this.field3134[var27 & 255] & 255;
                int var33 = class181.field2953[var31];
                if (~var29 <= ~var28) {
                    var29 = 0;
                }
                int var34 = this.field3134[var29 & 255] & 255;
                for (int var35 = 0; class168.field2737 > var35; ++var35) {
                    int var55 = class243.field3869[var35] * this.field3124;
                    int var56 = this.method1363(var30, var33, var31, var32, var34, var25 * var55 >> 12, 255);
                    arg2[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; this.field3127 > var36; ++var36) {
                short var37 = this.field3144[var36];
                if (var37 > 8 || ~var37 > 7) {
                    int var38 = this.field3133[var36] << 12;
                    int var39 = this.field3124 * var38 >> 12;
                    int var40 = var4 * var38 >> 12;
                    int var41 = this.field3142 * var38 >> 12;
                    int var42 = var40 >> 12;
                    int var43 = var40 & 4095;
                    int var44 = var42 + 1;
                    int var45 = class181.field2953[var43];
                    if (~var44 <= ~var41) {
                        var44 = 0;
                    }
                    int var46 = this.field3134[var44 & 255] & 255;
                    int var47 = this.field3134[255 & var42] & 255;
                    if (this.field3137 && this.field3127 - 1 == var36) {
                        for (int var48 = 0; class168.field2737 > var48; ++var48) {
                            int var49 = class243.field3869[var48] * this.field3124;
                            int var50 = this.method1363(var39, var45, var43, var47, var46, var38 * var49 >> 12, 255);
                            int var51 = arg2[var48] - -(var37 * var50 >> 12);
                            arg2[var48] = (var51 >> 1) + 2048;
                        }
                    } else {
                        for (int var52 = 0; ~class168.field2737 < ~var52; ++var52) {
                            int var53 = class243.field3869[var52] * this.field3124;
                            int var54 = this.method1363(var39, var45, var43, var47, var46, var38 * var53 >> 12, 255);
                            arg2[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field3131;
        if (arg1 != 255) {
            this.method1360(-40, (byte) -70, (int[]) null);
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field3127 = arg0.method1133((byte) 53);
            } else {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field3124 = this.field3142 = arg0.method1133((byte) 53);
                        return;
                    }
                    if (arg2 == 4) {
                        this.field3139 = arg0.method1133((byte) 53);
                        return;
                    }
                    if (arg2 == 5) {
                        this.field3124 = arg0.method1133((byte) 53);
                        return;
                    }
                    if (~arg2 == -7) {
                        this.field3142 = arg0.method1133((byte) 53);
                        return;
                    }
                } else {
                    this.field3125 = arg0.method1146(2);
                    if (~this.field3125 > -1) {
                        this.field3144 = new short[this.field3127];
                        for (int var5 = 0; ~this.field3127 < ~var5; ++var5) {
                            this.field3144[var5] = (short) arg0.method1146(2);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field3137 = ~arg0.method1133((byte) 53) == -2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.field3134 = class174.method1274(this.field3139, arg0 + 254);
        ++field3126;
        this.method1362(80);
        for (int var2 = this.field3127 - arg0; var2 >= 1; --var2) {
            short var3 = this.field3144[var2];
            if (var3 > 8) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field3127;
        }
    }

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "(I)V")
    public static void method1361(int arg0) {
        field3128 = null;
        field3145 = null;
        if (arg0 != 1519) {
            field3141 = -1.3699564F;
        }
        field3136 = null;
        field3135 = null;
    }

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "(I)V")
    private final void method1362(int arg0) {
        ++field3146;
        if (arg0 < 24) {
            field3135 = null;
        }
        if (~this.field3125 < -1) {
            this.field3144 = new short[this.field3127];
            this.field3133 = new short[this.field3127];
            for (int var2 = 0; this.field3127 > var2; ++var2) {
                this.field3144[var2] = (short) ((int) (Math.pow((double) ((float) this.field3125 / 4096.0F), (double) var2) * 4096.0D));
                this.field3133[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3144 != null && this.field3144.length == this.field3127) {
            this.field3133 = new short[this.field3127];
            for (int var3 = 0; this.field3127 > var3; ++var3) {
                this.field3133[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)I")
    private final int method1363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3143;
        int var8 = arg2 - 4096;
        int var9 = arg5 >> 12;
        int var10 = arg5 & 4095;
        int var11 = var9 + 1;
        if (arg0 <= var11) {
            var11 = 0;
        }
        int var12 = var9 & 255;
        int var13 = var10 + -4096;
        int var14 = var11 & arg6;
        int var15 = class181.field2953[var10];
        int var16 = 3 & this.field3134[arg3 + var12];
        int var17;
        if (~var16 >= -2) {
            var17 = var16 == 0 ? arg2 + var10 : -var10 + arg2;
        } else {
            var17 = ~var16 == -3 ? -arg2 + var10 : -arg2 + -var10;
        }
        int var18 = 3 & this.field3134[var14 - -arg3];
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg2 + var13 : -var13 + arg2;
        } else {
            var19 = var18 != 2 ? -arg2 + -var13 : -arg2 + var13;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = 3 & this.field3134[arg4 + var12];
        int var22;
        if (~var21 >= -2) {
            var22 = var21 != 0 ? -var10 + var8 : var8 + var10;
        } else {
            var22 = var21 != 2 ? -var8 + -var10 : -var8 + var10;
        }
        int var23 = 3 & this.field3134[arg4 + var14];
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? -var8 + var13 : -var8 + -var13;
        } else {
            var24 = ~var23 != -1 ? var8 - var13 : var8 + var13;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg1 >> 12) + var20;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)Lig;")
    public static final class144 method1364(int arg0, int arg1) {
        ++field3140;
        class144 var2 = (class144) class211.field3332.method1261(0, (long) arg0);
        if (arg1 > -65) {
            field3145 = null;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class1.field16.method1680(arg0, 1, -78);
            class144 var4 = new class144();
            if (var3 != null) {
                var4.method1009(-1, new class162(var3), arg0);
            }
            class211.field3332.method1264(-1, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }
}
