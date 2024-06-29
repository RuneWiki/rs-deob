import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class120 extends class105 {

    @OriginalMember(owner = "client!d", name = "U", descriptor = "[B")
    private byte[] field2117 = new byte[512];

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    private int field2109 = 4;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    private int field2119 = 1638;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
    private int field2132 = 0;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "Z")
    private boolean field2133 = true;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    private int field2120 = 4;

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "I")
    private int field2134 = 4;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Lvf;")
    public static class265 field2112 = class87.method582(-46, "Chargement des sprites )2 ");

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "Z")
    public static boolean field2123 = false;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Lvf;")
    public static class265 field2128 = class87.method582(-46, "http:)4)4");

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "Lgb;")
    public static class143 field2125;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "[S")
    private short[] field2113;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "[S")
    private short[] field2124;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "[[[B")
    public static byte[][][] field2130;

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class120() {
        super(0, true);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field2122;
        int[] var3 = super.field1862.method458(arg1, false);
        if (arg0 != 8055) {
            method807(-76, 75L);
        }
        if (super.field1862.field1236) {
            this.method803(true, var3, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            this.field2109 = 33;
        }
        ++field2116;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2120 = arg2.method920((byte) 36);
            } else {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field2134 = this.field2109 = arg2.method920((byte) 31);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.field2132 = arg2.method920((byte) 57);
                        return;
                    }
                    if (~arg0 == -6) {
                        this.field2134 = arg2.method920((byte) 98);
                        return;
                    }
                    if (arg0 == 6) {
                        this.field2109 = arg2.method920((byte) 34);
                        return;
                    }
                } else {
                    this.field2119 = arg2.method894(-113);
                    if (~this.field2119 > -1) {
                        this.field2124 = new short[this.field2120];
                        for (int var5 = 0; this.field2120 > var5; ++var5) {
                            this.field2124[var5] = (short) arg2.method894(-101);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2133 = ~arg2.method920((byte) 118) == -2;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)V")
    public static void method802(boolean arg0) {
        field2130 = null;
        if (!arg0) {
            method802(false);
        }
        field2112 = null;
        field2125 = null;
        field2128 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        this.field2117 = class57.method432((byte) -115, this.field2132);
        if (!arg0) {
            this.method806((byte) -126);
            ++field2115;
            for (int var2 = this.field2120 - 1; var2 >= 1; --var2) {
                short var3 = this.field2124[var2];
                if (~var3 < -9 || ~var3 > 7) {
                    return;
                }
                --this.field2120;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z[II)V")
    private final void method803(boolean arg0, int[] arg1, int arg2) {
        ++field2121;
        int var4 = class219.field3951[arg2] * this.field2109;
        if (!arg0) {
            method807(-102, -76L);
        }
        if (~this.field2120 != -2) {
            short var5 = this.field2124[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field2113[0] << 12;
                int var7 = this.field2134 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                int var11 = this.field2117[var9 & 255] & 255;
                int var12 = var8 & 4095;
                int var13 = this.field2109 * var6 >> 12;
                int var14 = class153.field2843[var12];
                if (var10 >= var13) {
                    var10 = 0;
                }
                int var15 = this.field2117[var10 & 255] & 255;
                for (int var16 = 0; ~var16 > ~class94.field1668; ++var16) {
                    int var36 = class277.field4894[var16] * this.field2134;
                    int var37 = this.method804(var15, arg0, var12, var11, var14, var6 * var36 >> 12, var7);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field2120; ++var17) {
                short var18 = this.field2124[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field2113[var17] << 12;
                    int var20 = this.field2109 * var19 >> 12;
                    int var21 = this.field2134 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var22 & 4095;
                    int var25 = var23 + 1;
                    int var26 = this.field2117[var23 & 255] & 255;
                    int var27 = class153.field2843[var24];
                    if (var25 >= var20) {
                        var25 = 0;
                    }
                    int var28 = this.field2117[255 & var25] & 255;
                    if (this.field2133 && ~(this.field2120 + -1) == ~var17) {
                        for (int var29 = 0; ~var29 > ~class94.field1668; ++var29) {
                            int var30 = class277.field4894[var29] * this.field2134;
                            int var31 = this.method804(var28, true, var24, var26, var27, var19 * var30 >> 12, var21);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class94.field1668; ++var33) {
                            int var34 = class277.field4894[var33] * this.field2134;
                            int var35 = this.method804(var28, true, var24, var26, var27, var19 * var34 >> 12, var21);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field2124[0];
            int var39 = this.field2113[0] << 12;
            int var40 = this.field2134 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = this.field2109 * var39 >> 12;
            int var43 = var41 >> 12;
            int var44 = var41 & 4095;
            int var45 = this.field2117[255 & var43] & 255;
            int var46 = class153.field2843[var44];
            int var47 = var43 - -1;
            if (var47 >= var42) {
                var47 = 0;
            }
            int var48 = this.field2117[255 & var47] & 255;
            if (this.field2133) {
                for (int var49 = 0; ~class94.field1668 < ~var49; ++var49) {
                    int var50 = class277.field4894[var49] * this.field2134;
                    int var51 = this.method804(var48, true, var44, var45, var46, var39 * var50 >> 12, var40);
                    int var52 = var38 * var51 >> 12;
                    arg1[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class94.field1668; ++var53) {
                    int var54 = class277.field4894[var53] * this.field2134;
                    int var55 = this.method804(var48, true, var44, var45, var46, var39 * var54 >> 12, var40);
                    arg1[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIIII)I")
    private final int method804(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2111;
        if (!arg1) {
            return -46;
        } else {
            int var8 = arg2 + -4096;
            int var9 = arg5 >> 12;
            int var10 = arg5 & 4095;
            int var11 = var10 + -4096;
            int var12 = class153.field2843[var10];
            int var13 = var9 + 1;
            if (var13 >= arg6) {
                var13 = 0;
            }
            int var14 = var13 & 255;
            int var15 = var9 & 255;
            int var16 = this.field2117[var15 - -arg3] & 3;
            int var17;
            if (var16 > 1) {
                var17 = ~var16 == -3 ? -arg2 + var10 : -var10 - arg2;
            } else {
                var17 = ~var16 != -1 ? -var10 + arg2 : arg2 + var10;
            }
            int var18 = 3 & this.field2117[arg3 + var14];
            int var19;
            if (var18 > 1) {
                var19 = var18 == 2 ? -arg2 + var11 : -arg2 + -var11;
            } else {
                var19 = ~var18 == -1 ? var11 - -arg2 : -var11 + arg2;
            }
            int var20 = ((-var17 + var19) * var12 >> 12) + var17;
            int var21 = this.field2117[arg0 + var15] & 3;
            int var22;
            if (~var21 >= -2) {
                var22 = ~var21 != -1 ? -var10 + var8 : var10 - -var8;
            } else {
                var22 = ~var21 != -3 ? -var8 + -var10 : -var8 + var10;
            }
            int var23 = 3 & this.field2117[var14 - -arg0];
            int var24;
            if (var23 > 1) {
                var24 = var23 != 2 ? -var8 + -var11 : -var8 + var11;
            } else {
                var24 = var23 == 0 ? var11 - -var8 : var8 - var11;
            }
            int var25 = ((-var22 + var24) * var12 >> 12) + var22;
            return ((-var20 + var25) * arg4 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Z")
    public static final boolean method805(int arg0, int arg1) {
        ++field2127;
        if (arg1 != -766449268) {
            method805(50, 19);
        }
        return (1 & arg0 >> 22) != 0;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    private final void method806(byte arg0) {
        if (~this.field2119 >= -1) {
            if (this.field2124 != null && this.field2124.length == this.field2120) {
                this.field2113 = new short[this.field2120];
                for (int var2 = 0; var2 < this.field2120; ++var2) {
                    this.field2113[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field2124 = new short[this.field2120];
            this.field2113 = new short[this.field2120];
            for (int var3 = 0; ~var3 > ~this.field2120; ++var3) {
                this.field2124[var3] = (short) ((int) (Math.pow((double) ((float) this.field2119 / 4096.0F), (double) var3) * 4096.0D));
                this.field2113[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        int var4 = -19 % ((arg0 - -61) / 53);
        ++field2118;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IJ)Lvf;")
    public static final class265 method807(int arg0, long arg1) {
        if (arg0 != -778089108) {
            return null;
        } else {
            ++field2131;
            return class228.method1544(arg1, false, 10, (byte) -26);
        }
    }
}
