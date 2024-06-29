import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class165 extends class51 {

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    private int field3409 = 4096;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
    private int field3415 = 4096;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
    private int field3417 = 4096;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lea;")
    public static class38 field3404 = class9.method46((byte) 116, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Z")
    public static boolean field3406 = false;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "Lpg;")
    public static class141 field3411 = new class141();

    @OriginalMember(owner = "client!sd", name = "ob", descriptor = "Lea;")
    public static class38 field3419 = class9.method46((byte) 107, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lea;")
    private static class38 field3422 = class9.method46((byte) 121, "Choose Option");

    @OriginalMember(owner = "client!sd", name = "qb", descriptor = "Lea;")
    private static class38 field3421 = class9.method46((byte) 118, "Prepared visibility map");

    @OriginalMember(owner = "client!sd", name = "tb", descriptor = "I")
    public static int field3424 = 0;

    @OriginalMember(owner = "client!sd", name = "sb", descriptor = "Lea;")
    public static class38 field3423 = field3422;

    @OriginalMember(owner = "client!sd", name = "pb", descriptor = "Lea;")
    public static class38 field3420 = field3421;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "Lk;")
    public static class89 field3414;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "[I")
    public static int[] field3412;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "[I")
    public static int[] field3418;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)I")
    public static final int method1176(byte arg0, int arg1, int arg2) {
        if (arg0 <= 109) {
            field3423 = null;
        }
        ++field3413;
        if (~arg2 > ~arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (~arg1 != -1) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3416;
        if (arg0 < 111) {
            return null;
        } else {
            int[][] var3 = super.field1292.method720(false, arg1);
            if (super.field1292.field2032) {
                int[][] var4 = this.method377(0, arg1, (byte) -81);
                int[] var5 = var4[0];
                int[] var6 = var3[0];
                int[] var7 = var3[2];
                int[] var8 = var3[1];
                int[] var9 = var4[1];
                int[] var10 = var4[2];
                for (int var11 = 0; ~var11 > ~class86.field2008; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var10[var11];
                    int var14 = var9[var11];
                    if (var12 == var13 && var13 == var14) {
                        var6[var11] = this.field3409 * var12 >> 12;
                        var8[var11] = this.field3415 * var13 >> 12;
                        var7[var11] = this.field3417 * var14 >> 12;
                    } else {
                        var6[var11] = this.field3409;
                        var8[var11] = this.field3415;
                        var7[var11] = this.field3417;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class165() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V")
    public static final void method1177(int arg0) {
        ++field3410;
        if (class29.field581 == null || class33.field673 == null) {
            class33.field673 = new int[256];
            class29.field581 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class29.field581[var1] = (int) (Math.sin(var3) * 4096.0D);
                class33.field673[var1] = (int) (4096.0D * Math.cos(var3));
            }
        }
        int var2 = -13 % ((arg0 - 23) / 59);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lc;IB)V")
    public static final void method1178(class19 arg0, int arg1, byte arg2) {
        ++field3407;
        class83.method707(arg1, arg0.field406, arg0.field382, (byte) -125);
        if (arg2 < 49) {
            field3418 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIB)I")
    public static final int method1179(int arg0, int arg1, byte arg2) {
        if (arg2 <= 112) {
            return 121;
        } else {
            ++field3405;
            int var3 = arg0 * 57 + arg1;
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (133912408 & var5) >> 19;
        }
    }

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "(I)V")
    public static void method1180(int arg0) {
        field3423 = null;
        field3418 = null;
        if (arg0 < 86) {
            field3411 = null;
        }
        field3404 = null;
        field3414 = null;
        field3419 = null;
        field3421 = null;
        field3420 = null;
        field3422 = null;
        field3412 = null;
        field3411 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field3408;
        if (arg2) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field3417 = arg0.method511(-121);
                    }
                } else {
                    this.field3415 = arg0.method511(86);
                }
            } else {
                this.field3409 = arg0.method511(2);
            }
        }
    }
}
