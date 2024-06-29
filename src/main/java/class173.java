import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class173 extends class105 {

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    private int field3348 = 3216;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "[I")
    private int[] field3343 = new int[3];

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    private int field3358 = 3216;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    private int field3354 = 4096;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "[J")
    public static long[] field3341 = new long[500];

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "Leh;")
    private static class47 field3347 = class195.method1282((byte) -4, "shake:");

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Leh;")
    public static class47 field3345 = field3347;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "Leh;")
    public static class47 field3353 = field3347;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public static int field3352 = 3353893;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "[I")
    public static int[] field3355;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "[[[Lqh;")
    public static class152[][][] field3351;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public static void method1164(int arg0) {
        field3345 = null;
        field3355 = null;
        field3353 = null;
        field3351 = null;
        field3341 = null;
        field3347 = null;
        if (arg0 != 4096) {
            field3345 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field3356;
        if (arg2 == -256) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        this.field3358 = arg1.method569(26496);
                    }
                } else {
                    this.field3348 = arg1.method569(arg2 + 26752);
                }
            } else {
                this.field3354 = arg1.method569(arg2 + 26752);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class173() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        if (arg0 != -1) {
            this.method13(-92);
        }
        this.method1165(arg0 + 3);
        ++field3346;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 <= 78) {
            this.method1165(-97);
        }
        ++field3357;
        int[] var3 = super.field2192.method336(-50, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0 + -1 & class122.field2468);
            int[] var5 = this.method851(0, true, arg0);
            int[] var6 = this.method851(0, true, class122.field2468 & arg0 + 1);
            for (int var7 = 0; ~class149.field2928 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3354;
                int var9 = (var5[var7 - -1 & class121.field2453] + -var5[class121.field2453 & var7 - 1]) * this.field3354;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var12 + 4096 + var13) / 4096)));
                int var15;
                int var16;
                int var17;
                if (var14 == 0) {
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                } else {
                    var16 = 16777216 / var14;
                    var15 = var8 / var14;
                    var17 = var9 / var14;
                }
                int var18 = this.field3343[0] * var17 >> 12;
                int var19 = this.field3343[2] * var16 >> 12;
                int var20 = this.field3343[1] * var15 >> 12;
                var3[var7] = var19 + var20 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
    private final void method1165(int arg0) {
        ++field3349;
        double var2 = Math.cos((double) (this.field3358 / 4096));
        this.field3343[0] = (int) (var2 * Math.sin((double) (this.field3348 / 4096)) * 4096.0D);
        this.field3343[1] = (int) (var2 * Math.cos((double) (this.field3348 / 4096)) * 4096.0D);
        this.field3343[2] = (int) (4096.0D * Math.sin((double) (this.field3358 / 4096)));
        int var4 = this.field3343[1] * this.field3343[1] >> 12;
        int var5 = this.field3343[0] * this.field3343[0] >> 12;
        int var6 = this.field3343[arg0] * this.field3343[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field3343[1] = (this.field3343[1] << 12) / var7;
            this.field3343[2] = (this.field3343[2] << 12) / var7;
            this.field3343[0] = (this.field3343[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JI)Leh;")
    public static final class47 method1166(long arg0, int arg1) {
        ++field3342;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                if (arg1 != 1) {
                    return null;
                } else {
                    byte[] var6 = new byte[var3];
                    while (~arg0 != -1L) {
                        long var8 = arg0;
                        arg0 /= 37L;
                        --var3;
                        var6[var3] = class149.field2927[(int) (-(arg0 * 37L) + var8)];
                    }
                    class47 var7 = new class47();
                    var7.field960 = var6;
                    var7.field940 = var6.length;
                    return var7;
                }
            }
        } else {
            return null;
        }
    }
}
