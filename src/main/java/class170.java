import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class170 extends class264 {

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    private int field2989 = 0;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "[S")
    private short[] field2998 = new short[257];

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "Lcf;")
    public static class93 field2984 = class147.method1066("<)4col>", -48);

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
    public static int[] field2985 = new int[100];

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static volatile int field2986 = 0;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Lcf;")
    public static class93 field2992 = class147.method1066("::pcachesize", -48);

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Z")
    public static boolean field3000 = true;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lcf;")
    public static class93 field2999 = class147.method1066("<col=ffb000>", -48);

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "[I")
    private int[] field2990;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "[I")
    private int[] field3001;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "[[I")
    private int[][] field2995;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public static void method1221(int arg0) {
        if (arg0 != 0) {
            field2985 = null;
        }
        field2984 = null;
        field2992 = null;
        field2999 = null;
        field2985 = null;
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V")
    private final void method1222(int arg0) {
        int var2 = this.field2989;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field2995.length - 1) && var4 >= this.field2995[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field2995[var5];
                    int[] var7 = this.field2995[var5 + -1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                    int var9 = 4096 - class124.field2200[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var7[1] * var10 - -(var6[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2998[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field2995.length + -1 && ~this.field2995[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field2995[var14 + -1];
                    int[] var16 = this.field2995[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2998[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field2995.length - 1 && this.field2995[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field2995[var22 + -1];
                int[] var24 = this.field2995[var22];
                int var25 = this.method1223(var22 + -2, -916528124)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1223(var22 + 1, -916528124)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - -var26 + -var25 + -var27;
                int var32 = -var25 + var27;
                int var34 = var25 - var26 - var31;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var34 >> 12;
                int var37 = var29 * var32 >> 12;
                int var38 = var35 + var37 + var36 - -var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field2998[var20] = (short) var38;
            }
        }
        if (arg0 != 13489) {
            field2992 = null;
        }
        ++field2987;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)[I")
    private final int[] method1223(int arg0, int arg1) {
        if (arg1 != -916528124) {
            field2986 = -95;
        }
        ++field2996;
        if (~arg0 > -1) {
            return this.field2990;
        } else {
            return arg0 >= this.field2995.length ? this.field3001 : this.field2995[arg0];
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (this.field2995 == null) {
            this.field2995 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2997;
        if (this.field2995.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2989 == 2) {
                this.method1225(17827);
            }
            if (arg0 != -3) {
                field3002 = -81;
            }
            class55.method310(arg0 ^ -4099);
            this.method1222(13489);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field2988;
        if (~arg1 == -1) {
            this.field2989 = arg2.method1907(16832);
            this.field2995 = new int[arg2.method1907(16832)][2];
            for (int var4 = 0; var4 < this.field2995.length; ++var4) {
                this.field2995[var4][0] = arg2.method1891(-117);
                this.field2995[var4][1] = arg2.method1891(-115);
            }
        }
        if (arg0 <= 11) {
            this.method20(14, -44, (class280) null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class170() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z")
    public static final boolean method1224(byte arg0, int arg1) {
        if (arg0 != -87) {
            return false;
        } else {
            ++field2993;
            if (~arg1 <= -98 && arg1 <= 122) {
                return true;
            } else if (~arg1 <= -66 && arg1 <= 90) {
                return true;
            } else {
                return ~arg1 <= -49 && ~arg1 >= -58;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 >= -83) {
            method1226(-95, -14, -14, 31);
        }
        ++field3003;
        int[] var3 = super.field4716.method532((byte) 111, arg0);
        if (super.field4716.field1424) {
            int[] var4 = this.method1767(0, arg0, 21654);
            for (int var5 = 0; ~class176.field3060 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2998[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)V")
    private final void method1225(int arg0) {
        ++field2994;
        int[] var2 = this.field2995[1];
        int[] var3 = this.field2995[0];
        int[] var4 = this.field2995[this.field2995.length + -1];
        int[] var5 = this.field2995[this.field2995.length + -2];
        this.field2990 = new int[] { var3[0] - (var2[0] + -var3[0]), var3[1] - var2[1] - -var3[1] };
        this.field3001 = new int[] { var5[0] + -var4[0] + var5[0], var5[1] - var4[1] - -var5[1] };
        if (arg0 != 17827) {
            this.method1223(35, 102);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)I")
    public static final int method1226(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 243) {
            if (arg1 <= 217) {
                if (arg1 > 192) {
                    arg0 >>= 2;
                } else if (arg1 > 179) {
                    arg0 >>= 1;
                }
            } else {
                arg0 >>= 3;
            }
        } else {
            arg0 >>= 4;
        }
        ++field2991;
        if (arg2 != 25347) {
            field3000 = true;
        }
        return (arg0 >> 5 << 7) + (arg3 >> 2 << 10) + (arg1 >> 1);
    }
}
