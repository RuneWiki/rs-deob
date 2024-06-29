import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class43 extends class260 {

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    private int field943 = 0;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    private int field927 = 0;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    private int field936 = 0;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "Loh;")
    private static class263 field948 = class253.method1681(-120, "Drop");

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "Loh;")
    public static class263 field934 = field948;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "Loh;")
    private static class263 field950 = class253.method1681(-128, " more options");

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "Loh;")
    public static class263 field929 = field950;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    private int field935;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    private int field945;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "Lnk;")
    public static class125 field937;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "Ldi;")
    public static class172 field933;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V")
    public static void method261(byte arg0) {
        if (arg0 == 79) {
            field937 = null;
            field934 = null;
            field950 = null;
            field929 = null;
            field933 = null;
            field948 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field939;
        int var8 = -arg5 + arg4;
        if (arg3 >= 45) {
            int var9 = arg1 + arg5;
            int var10 = arg6 - -arg5;
            for (int var11 = arg1; var9 > var11; ++var11) {
                class191.method1255(arg6, arg7, arg0, 69, class38.field870[var11]);
            }
            int var12 = arg0 - arg5;
            for (int var13 = arg4; var13 > var8; --var13) {
                class191.method1255(arg6, arg7, arg0, 106, class38.field870[var13]);
            }
            for (int var14 = var9; ~var14 >= ~var8; ++var14) {
                int[] var15 = class38.field870[var14];
                class191.method1255(arg6, arg7, var10, 100, var15);
                class191.method1255(var10, arg2, var12, 126, var15);
                class191.method1255(var12, arg7, arg0, 77, var15);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIBI)V")
    private final void method263(int arg0, int arg1, byte arg2, int arg3) {
        ++field941;
        int var5 = -59 / ((arg2 - -48) / 44);
        int var6 = arg1 >= arg0 ? arg1 : arg0;
        int var7 = var6 >= arg3 ? var6 : arg3;
        int var8 = arg0 >= arg1 ? arg1 : arg0;
        int var9 = var8 <= arg3 ? var8 : arg3;
        int var10 = -var9 + var7;
        this.field932 = (var7 + var9) / 2;
        if (this.field932 > 0 && this.field932 < 4096) {
            this.field935 = (var10 << 12) / (~this.field932 < -2049 ? 8192 - this.field932 * 2 : this.field932 * 2);
        } else {
            this.field935 = 0;
        }
        if (~var10 < -1) {
            int var11 = (var7 - arg0 << 12) / var10;
            int var12 = (-arg1 + var7 << 12) / var10;
            int var13 = (-arg3 + var7 << 12) / var10;
            if (~arg0 != ~var7) {
                if (~arg1 == ~var7) {
                    this.field945 = ~arg3 != ~var9 ? -var13 + 12288 : 4096 - -var11;
                } else {
                    this.field945 = arg0 == var9 ? var12 + 12288 : -var11 + 20480;
                }
            } else {
                this.field945 = arg1 == var9 ? var13 + 20480 : -var12 + 4096;
            }
            this.field945 /= 6;
        } else {
            this.field945 = 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
    private final void method264(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 39) {
            field929 = null;
        }
        int var5 = ~arg1 >= -2049 ? (arg2 + 4096) * arg1 >> 12 : -(arg1 * arg2 >> 12) + arg1 - -arg2;
        if (~var5 >= -1) {
            this.field938 = this.field949 = this.field942 = arg1;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field942 = var15;
                                    this.field949 = var7;
                                    this.field938 = var5;
                                }
                            } else {
                                this.field938 = var14;
                                this.field942 = var5;
                                this.field949 = var7;
                            }
                        } else {
                            this.field942 = var5;
                            this.field938 = var7;
                            this.field949 = var15;
                        }
                    } else {
                        this.field942 = var14;
                        this.field949 = var5;
                        this.field938 = var7;
                    }
                } else {
                    this.field938 = var15;
                    this.field942 = var7;
                    this.field949 = var5;
                }
            } else {
                this.field942 = var7;
                this.field949 = var14;
                this.field938 = var5;
            }
        }
        ++field947;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lue;III)[Loe;")
    public static final class140[] method265(class86 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field937 = null;
        }
        ++field930;
        return !class254.method1687(arg1, (byte) 54, arg0, arg3) ? null : class50.method322((byte) 28);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class43() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field936 = (arg2.method1281((byte) 125) << 12) / 100;
                }
            } else {
                this.field943 = (arg2.method1281((byte) 122) << 12) / 100;
            }
        } else {
            this.field927 = arg2.method1298((byte) -120);
        }
        ++field931;
        if (arg1 != 5701) {
            field937 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        int[][] var3 = super.field4509.method1667(arg0, arg1 + -5);
        if (arg1 != 5) {
            field950 = null;
        }
        if (super.field4509.field4346) {
            int[][] var4 = this.method1712((byte) 106, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class49.field1052 < ~var11; ++var11) {
                this.method263(var5[var11], var6[var11], (byte) -127, var8[var11]);
                this.field945 += this.field927;
                this.field935 += this.field943;
                if (~this.field935 > -1) {
                    this.field935 = 0;
                }
                if (this.field935 > 4096) {
                    this.field935 = 4096;
                }
                this.field932 += this.field936;
                while (~this.field945 > -1) {
                    this.field945 += 4096;
                }
                if (~this.field932 > -1) {
                    this.field932 = 0;
                }
                while (this.field945 > 4096) {
                    this.field945 -= 4096;
                }
                if (this.field932 > 4096) {
                    this.field932 = 4096;
                }
                this.method264(this.field945, this.field932, this.field935, 93);
                var7[var11] = this.field938;
                var9[var11] = this.field949;
                var10[var11] = this.field942;
            }
        }
        ++field946;
        return var3;
    }
}
