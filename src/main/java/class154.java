import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class154 extends class273 {

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    private int field2891 = 4;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "[B")
    private byte[] field2896 = new byte[512];

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    private int field2898 = 4;

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "I")
    private int field2905 = 1638;

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "Z")
    private boolean field2909 = true;

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "I")
    private int field2912 = 4;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "I")
    private int field2910 = 0;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "[I")
    public static int[] field2901 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "Ljd;")
    public static class86 field2899 = class122.method868("Lade Wordpack )2 ", true);

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "Ljd;")
    private static class86 field2903 = class122.method868("level:", true);

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "Ljd;")
    public static class86 field2911 = class122.method868("gelb:", true);

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "Ljd;")
    public static class86 field2895 = field2903;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "[S")
    private short[] field2900;

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "[S")
    private short[] field2907;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI[I)V")
    private final void method1121(byte arg0, int arg1, int[] arg2) {
        ++field2894;
        int var4 = class143.field2711[arg1] * this.field2912;
        int var5 = 29 / ((12 - arg0) / 39);
        if (this.field2898 != 1) {
            short var6 = this.field2900[0];
            if (~var6 < -9 || var6 < -8) {
                int var7 = this.field2907[0] << 12;
                int var8 = var4 * var7 >> 12;
                int var9 = var8 >> 12;
                int var10 = this.field2891 * var7 >> 12;
                int var11 = this.field2912 * var7 >> 12;
                int var12 = var8 & 4095;
                int var13 = class42.field947[var12];
                int var14 = var9 + 1;
                int var15 = this.field2896[255 & var9] & 255;
                if (var14 >= var11) {
                    var14 = 0;
                }
                int var16 = this.field2896[var14 & 255] & 255;
                for (int var17 = 0; ~var17 > ~class176.field3200; ++var17) {
                    int var37 = class114.field2184[var17] * this.field2891;
                    int var38 = this.method1125(var15, var13, var16, -51, var12, var7 * var37 >> 12, var10);
                    arg2[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; var18 < this.field2898; ++var18) {
                short var19 = this.field2900[var18];
                if (~var19 < -9 || var19 < -8) {
                    int var20 = this.field2907[var18] << 12;
                    int var21 = this.field2912 * var20 >> 12;
                    int var22 = this.field2891 * var20 >> 12;
                    int var23 = var4 * var20 >> 12;
                    int var24 = var23 >> 12;
                    int var25 = var23 & 4095;
                    int var26 = class42.field947[var25];
                    int var27 = var24 - -1;
                    if (var21 <= var27) {
                        var27 = 0;
                    }
                    int var28 = 255 & this.field2896[255 & var24];
                    int var29 = this.field2896[var27 & 255] & 255;
                    if (this.field2909 && ~(this.field2898 + -1) == ~var18) {
                        for (int var30 = 0; class176.field3200 > var30; ++var30) {
                            int var31 = class114.field2184[var30] * this.field2891;
                            int var32 = this.method1125(var28, var26, var29, -119, var25, var20 * var31 >> 12, var22);
                            int var33 = (var19 * var32 >> 12) + arg2[var30];
                            arg2[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; ~var34 > ~class176.field3200; ++var34) {
                            int var35 = class114.field2184[var34] * this.field2891;
                            int var36 = this.method1125(var28, var26, var29, -66, var25, var20 * var35 >> 12, var22);
                            arg2[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            int var39 = this.field2907[0] << 12;
            int var40 = this.field2891 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = var41 >> 12;
            int var43 = var42 + 1;
            int var44 = var41 & 4095;
            short var45 = this.field2900[0];
            int var46 = class42.field947[var44];
            int var47 = this.field2912 * var39 >> 12;
            if (var47 <= var43) {
                var43 = 0;
            }
            int var48 = 255 & this.field2896[var42 & 255];
            int var49 = 255 & this.field2896[255 & var43];
            if (this.field2909) {
                for (int var50 = 0; var50 < class176.field3200; ++var50) {
                    int var51 = class114.field2184[var50] * this.field2891;
                    int var52 = this.method1125(var48, var46, var49, -106, var44, var39 * var51 >> 12, var40);
                    int var53 = var45 * var52 >> 12;
                    arg2[var50] = (var53 >> 1) + 2048;
                }
            } else {
                for (int var54 = 0; ~var54 > ~class176.field3200; ++var54) {
                    int var55 = class114.field2184[var54] * this.field2891;
                    int var56 = this.method1125(var48, var46, var49, -80, var44, var39 * var55 >> 12, var40);
                    arg2[var54] = var45 * var56 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
    public static void method1122(int arg0) {
        field2895 = null;
        field2899 = null;
        if (arg0 != -1) {
            method1122(4);
        }
        field2901 = null;
        field2903 = null;
        field2911 = null;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        this.field2896 = class107.method765((byte) -110, this.field2910);
        ++field2897;
        if (arg0 != 4095) {
            this.field2910 = -73;
        }
        this.method1123(arg0 + -4096);
        for (int var2 = this.field2898 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2900[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field2898;
        }
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    private final void method1123(int arg0) {
        if (arg0 > ~this.field2905) {
            this.field2907 = new short[this.field2898];
            this.field2900 = new short[this.field2898];
            for (int var2 = 0; ~var2 > ~this.field2898; ++var2) {
                this.field2900[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2905 / 4096.0F), (double) var2)));
                this.field2907[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2900 != null && this.field2900.length == this.field2898) {
            this.field2907 = new short[this.field2898];
            for (int var3 = 0; ~var3 > ~this.field2898; ++var3) {
                this.field2907[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field2893;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILbj;)V")
    public static final void method1124(int arg0, class151 arg1) {
        class161.field3013 = arg1;
        if (arg0 == 0) {
            ++field2913;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field2908;
        if (arg2 > -16) {
            this.method34(-26, (class200) null, -96);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2898 = arg1.method1408((byte) -122);
            } else {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field2891 = this.field2912 = arg1.method1408((byte) -41);
                        return;
                    }
                    if (arg0 == 4) {
                        this.field2910 = arg1.method1408((byte) -90);
                        return;
                    }
                    if (~arg0 == -6) {
                        this.field2891 = arg1.method1408((byte) -82);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field2912 = arg1.method1408((byte) -56);
                        return;
                    }
                } else {
                    this.field2905 = arg1.method1421((byte) 124);
                    if (this.field2905 < 0) {
                        this.field2900 = new short[this.field2898];
                        for (int var5 = 0; ~var5 > ~this.field2898; ++var5) {
                            this.field2900[var5] = (short) arg1.method1421((byte) 97);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2909 = arg1.method1408((byte) -118) == 1;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)I")
    private final int method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2904;
        int var8 = arg4 + -4096;
        int var9 = arg5 >> 12;
        int var10 = arg5 & 4095;
        int var11 = class42.field947[var10];
        int var12 = var9 + 1;
        int var13 = var9 & 255;
        if (~arg6 >= ~var12) {
            var12 = 0;
        }
        int var14 = var10 + -4096;
        int var15 = var12 & 255;
        int var16 = 3 & this.field2896[arg0 + var13];
        int var17;
        if (~var16 >= -2) {
            var17 = var16 == 0 ? var10 - -arg4 : -var10 + arg4;
        } else {
            var17 = ~var16 != -3 ? -arg4 + -var10 : -arg4 + var10;
        }
        int var18 = this.field2896[arg0 + var15] & 3;
        int var19;
        if (var18 > 1) {
            var19 = ~var18 != -3 ? -arg4 + -var14 : -arg4 + var14;
        } else {
            var19 = ~var18 != -1 ? -var14 + arg4 : arg4 + var14;
        }
        if (arg3 >= -33) {
            return 99;
        } else {
            int var20 = ((-var17 + var19) * var11 >> 12) + var17;
            int var21 = 3 & this.field2896[arg2 + var13];
            int var22;
            if (var21 <= 1) {
                var22 = ~var21 != -1 ? -var10 + var8 : var8 + var10;
            } else {
                var22 = var21 == 2 ? -var8 + var10 : -var8 + -var10;
            }
            int var23 = this.field2896[arg2 + var15] & 3;
            int var24;
            if (~var23 < -2) {
                var24 = ~var23 == -3 ? -var8 + var14 : -var8 + -var14;
            } else {
                var24 = var23 != 0 ? -var14 + var8 : var14 - -var8;
            }
            int var25 = var22 - -((-var22 + var24) * var11 >> 12);
            return ((-var20 + var25) * arg1 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field2902;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            this.method1121((byte) -94, arg1, var3);
        }
        if (arg0 != -7420) {
            method1124(-42, (class151) null);
        }
        return var3;
    }
}
