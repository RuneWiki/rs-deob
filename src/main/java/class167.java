import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class167 extends class243 {

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
    private int field2085 = 0;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    private int field2084 = 0;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
    private int field2089 = 0;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "[I")
    public static int[] field2083 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dfa", name = "U", descriptor = "Lqc;")
    public static class743 field2096 = new class743();

    @OriginalMember(owner = "client!dfa", name = "W", descriptor = "I")
    public static int field2098 = -1;

    @OriginalMember(owner = "client!dfa", name = "V", descriptor = "I")
    public static int field2097 = 0;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
    private int field2086;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!dfa", name = "O", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!dfa", name = "P", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!dfa", name = "Q", descriptor = "I")
    private int field2092;

    @OriginalMember(owner = "client!dfa", name = "R", descriptor = "I")
    private int field2093;

    @OriginalMember(owner = "client!dfa", name = "S", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!dfa", name = "T", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(II)[[I", line = 7)
    public final int[][] method2(int arg0, int arg1) {
        ++field2090;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (arg0 > -76) {
            this.field2093 = 5;
        }
        if (super.field3156.field8335) {
            int[][] var4 = this.method1457(arg1, 24431, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class687.field9628; ++var11) {
                this.method976(4096, var5[var11], var7[var11], var6[var11]);
                this.field2082 += this.field2089;
                this.field2093 += this.field2084;
                this.field2092 += this.field2085;
                while (this.field2082 < 0) {
                    this.field2082 += 4096;
                }
                if (~this.field2093 > -1) {
                    this.field2093 = 0;
                }
                while (this.field2082 > 4096) {
                    this.field2082 -= 4096;
                }
                if (~this.field2092 > -1) {
                    this.field2092 = 0;
                }
                if (~this.field2093 < -4097) {
                    this.field2093 = 4096;
                }
                if (~this.field2092 < -4097) {
                    this.field2092 = 4096;
                }
                this.method978(-1824307956, this.field2093, this.field2092, this.field2082);
                var8[var11] = this.field2086;
                var9[var11] = this.field2095;
                var10[var11] = this.field2094;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIII)V", line = 80)
    private final void method976(int arg0, int arg1, int arg2, int arg3) {
        ++field2088;
        int var5 = ~arg1 < ~arg3 ? arg1 : arg3;
        if (arg0 == 4096) {
            int var6 = ~var5 <= ~arg2 ? var5 : arg2;
            int var7 = ~arg1 <= ~arg3 ? arg3 : arg1;
            int var8 = arg2 >= var7 ? var7 : arg2;
            int var9 = -var8 + var6;
            this.field2092 = (var8 - -var6) / 2;
            if (~this.field2092 < -1 && this.field2092 < 4096) {
                this.field2093 = (var9 << 12) / (~this.field2092 >= -2049 ? this.field2092 * 2 : -(this.field2092 * 2) + 8192);
            } else {
                this.field2093 = 0;
            }
            if (~var9 >= -1) {
                this.field2082 = 0;
            } else {
                int var10 = (var6 - arg1 << 12) / var9;
                int var11 = (-arg3 + var6 << 12) / var9;
                int var12 = (var6 - arg2 << 12) / var9;
                if (arg1 == var6) {
                    this.field2082 = ~arg3 == ~var8 ? var12 + 20480 : -var11 + 4096;
                } else if (arg3 != var6) {
                    this.field2082 = arg1 != var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field2082 = arg2 != var8 ? 12288 - var12 : var10 + 4096;
                }
                this.field2082 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)V", line = 136)
    public static void method977(int arg0) {
        field2083 = null;
        field2096 = null;
        if (arg0 != 2048) {
            method977(17);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILji;B)V", line = 148)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field2085 = (arg1.method3390((byte) -19) << 12) / 100;
                }
            } else {
                this.field2084 = (arg1.method3390((byte) -19) << 12) / 100;
            }
        } else {
            this.field2089 = arg1.method3413(false);
        }
        if (arg2 > -92) {
            this.method2(-105, 125);
        }
        ++field2087;
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(IIII)V", line = 192)
    private final void method978(int arg0, int arg1, int arg2, int arg3) {
        ++field2081;
        int var5 = arg2 <= 2048 ? (4096 - -arg1) * arg2 >> 12 : arg2 - (arg1 * arg2 >> 12) + arg1;
        if (arg0 != -1824307956) {
            this.field2082 = -107;
        }
        if (var5 > 0) {
            int var6 = arg3 * 6;
            int var7 = arg2 - var5 + arg2;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 == -1) {
                this.field2086 = var5;
                this.field2095 = var14;
                this.field2094 = var7;
                return;
            }
            if (var9 == 1) {
                this.field2086 = var15;
                this.field2094 = var7;
                this.field2095 = var5;
                return;
            }
            if (var9 == 2) {
                this.field2094 = var14;
                this.field2095 = var5;
                this.field2086 = var7;
                return;
            }
            if (~var9 == -4) {
                this.field2094 = var5;
                this.field2095 = var15;
                this.field2086 = var7;
                return;
            }
            if (var9 == 4) {
                this.field2095 = var7;
                this.field2086 = var14;
                this.field2094 = var5;
                return;
            }
            if (~var9 == -6) {
                this.field2095 = var7;
                this.field2094 = var15;
                this.field2086 = var5;
                return;
            }
        } else {
            this.field2086 = this.field2095 = this.field2094 = arg2;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V", line = 341)
    public class167() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 309)
    public static final String[] method979(int arg0, String[] arg1) {
        ++field2091;
        String[] var2 = new String[5];
        if (arg0 != -845) {
            return null;
        } else {
            for (int var3 = 0; var3 < 5; ++var3) {
                var2[var3] = var3 + ": ";
                if (arg1 != null && arg1[var3] != null) {
                    var2[var3] = var2[var3] + arg1[var3];
                }
            }
            return var2;
        }
    }
}
