import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class123 extends class64 {

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "I")
    private int field2270 = 0;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "Lsg;")
    public static class169 field2259 = class165.method1060("RuneScape wurde aktualisiert(Q", 1536);

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "[Lsg;")
    public static class169[] field2266 = new class169[100];

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "I")
    public static int field2267 = -1;

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "Lsg;")
    public static class169 field2265 = class165.method1060("<col=ff0000>", 1536);

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "[I")
    public static int[] field2262 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "[I")
    public static int[] field2271 = new int[500];

    @OriginalMember(owner = "client!nf", name = "rb", descriptor = "Lsg;")
    public static class169 field2273 = class165.method1060("Sichtbare Karte vorbereitet)3", 1536);

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lsg;")
    private static class169 field2257 = class165.method1060("RuneScape is loading )2 please wait)3)3)3", 1536);

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lsg;")
    public static class169 field2263 = field2257;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!nf", name = "qb", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!nf", name = "sb", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!nf", name = "tb", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!nf", name = "ub", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "[I")
    private int[] field2260;

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "[I")
    private int[] field2269;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "[Lbg;")
    public static class18[] field2268;

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "[[I")
    private int[][] field2264;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method759(byte arg0) {
        field2259 = null;
        field2266 = null;
        field2262 = null;
        field2265 = null;
        field2271 = null;
        field2268 = null;
        field2257 = null;
        field2263 = null;
        field2273 = null;
        if (arg0 != -15) {
            field2265 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        if (this.field2264 == null) {
            this.field2264 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2258;
        if (~this.field2264.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2270 == -3) {
                this.method761((byte) -1);
            }
            class145.method956((byte) -10);
            if (arg0) {
                this.method17(false);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2270 = arg1.method819((byte) 22);
            this.field2264 = new int[arg1.method819((byte) 22)][2];
            for (int var4 = 0; ~this.field2264.length < ~var4; ++var4) {
                this.field2264[var4][0] = arg1.method785(true);
                this.field2264[var4][1] = arg1.method785(true);
            }
        }
        int var5 = 11 % ((arg0 - -60) / 36);
        ++field2274;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field2276;
        int[] var3 = super.field1192.method19((byte) 127, arg0);
        if (super.field1192.field75) {
            int[] var4 = this.method394(arg1 + 20312, 0, arg0);
            int var5 = this.field2270;
            if (~var5 != -3) {
                if (var5 == 1) {
                    for (int var6 = 0; ~class147.field2715 < ~var6; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; var8 < this.field2264.length + -1 && this.field2264[var8][0] <= var7; ++var8) {
                        }
                        int[] var9 = this.field2264[var8 - 1];
                        int[] var10 = this.field2264[var8];
                        int var11 = (-var9[0] + var7 << 12) / (var10[0] + -var9[0]);
                        int var12 = 4096 - class125.field2292[(var11 & 8167) >> 5] >> 1;
                        int var13 = -var12 + 4096;
                        var3[var6] = var9[1] * var13 + var10[1] * var12 >> 12;
                    }
                } else {
                    for (int var14 = 0; var14 < class147.field2715; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; var16 < this.field2264.length + -1 && ~this.field2264[var16][0] >= ~var15; ++var16) {
                        }
                        int[] var17 = this.field2264[var16 + -1];
                        int[] var18 = this.field2264[var16];
                        int var19 = (-var17[0] + var15 << 12) / (var18[0] - var17[0]);
                        int var20 = 4096 - var19;
                        var3[var14] = var17[1] * var20 + var18[1] * var19 >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~class147.field2715 < ~var21; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; ~(this.field2264.length - 1) < ~var23 && var22 >= this.field2264[var23][0]; ++var23) {
                    }
                    int[] var24 = this.field2264[var23 + -1];
                    int[] var25 = this.field2264[var23];
                    int var26 = this.method760((byte) 110, var23 + -2)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var29 = this.method760((byte) 40, var23 + 1)[1];
                    int var30 = -var28 + var29 + var27 - var26;
                    int var32 = (var22 - var24[0] << 12) / (var25[0] + -var24[0]);
                    int var33 = var32 * var32 >> 12;
                    int var34 = -var30 + var26 + -var27;
                    int var35 = (var30 * var32 >> 12) * var33 >> 12;
                    int var36 = var28 - var26;
                    int var37 = var32 * var36 >> 12;
                    int var38 = var33 * var34 >> 12;
                    var3[var21] = var27 + var38 + var35 + var37;
                }
            }
        }
        if (arg1 != 19) {
            this.method761((byte) 77);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(BI)[I")
    private final int[] method760(byte arg0, int arg1) {
        ++field2272;
        if (arg0 < 17) {
            return null;
        } else if (~arg1 > -1) {
            return this.field2269;
        } else {
            return this.field2264.length <= arg1 ? this.field2260 : this.field2264[arg1];
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    private final void method761(byte arg0) {
        ++field2275;
        int var2 = -102 % ((60 - arg0) / 39);
        int[] var3 = this.field2264[0];
        int[] var4 = this.field2264[1];
        int[] var5 = this.field2264[this.field2264.length + -2];
        int[] var6 = this.field2264[this.field2264.length - 1];
        this.field2260 = new int[] { var5[0] + -var6[0] + var5[0], var5[1] + -var6[1] + var5[1] };
        this.field2269 = new int[] { var3[0] - var4[0] + var3[0], var3[1] + -var4[1] + var3[1] };
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IJ)Lsg;")
    public static final class169 method762(int arg0, long arg1) {
        ++field2261;
        if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                byte[] var6 = new byte[var3];
                while (~arg1 != -1L) {
                    long var8 = arg1;
                    arg1 /= 37L;
                    --var3;
                    var6[var3] = class2.field50[(int) (-(arg1 * 37L) + var8)];
                }
                class169 var7 = new class169();
                if (arg0 < 75) {
                    return null;
                } else {
                    var7.field3248 = var6;
                    var7.field3253 = var6.length;
                    return var7;
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class123() {
        super(1, true);
    }
}
