import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class58 extends class115 {

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    private int field800 = 4096;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    private int field807 = 0;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "[[I")
    public static int[][] field804 = new int[104][104];

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lcf;")
    public static class42 field806 = new class42(0, 0);

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "Ljava/awt/Frame;")
    public static Frame field803;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZLnh;)Lqe;")
    public static final class168 method401(int arg0, boolean arg1, class112 arg2) {
        ++field801;
        try {
            class168 var3 = new class168();
            var3.field2870 = arg2.method747((byte) -125);
            if (arg0 < var3.field2870) {
                var3.field2870 = arg0;
            }
            if (!arg1) {
                method403(111, -108, -114);
            }
            var3.field2904 = new byte[var3.field2870];
            arg2.field1821 += class254.field4398.method1643(var3.field2904, true, 0, arg2.field1780, arg2.field1821, var3.field2870);
            return var3;
        } catch (Exception var4) {
            return class236.field4028;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)V")
    public static final void method402(int arg0, int arg1) {
        class117.field1912 += arg1 * 128;
        short var2 = 256;
        ++field802;
        if (~class117.field1912 < ~class245.field4255.length) {
            class117.field1912 -= class245.field4255.length;
            int var3 = (int) (12.0D * Math.random());
            class14.method52(class177.field3118[var3], 124);
        }
        int var4 = arg1 * 128;
        int var5 = 0;
        int var6 = (-arg1 + var2) * 128;
        for (int var7 = 0; var7 < var6; ++var7) {
            int var26 = class197.field3415[var4 + var5] + -(class245.field4255[class117.field1912 + var5 & class245.field4255.length + -1] * arg1 / 6);
            if (~var26 > -1) {
                var26 = 0;
            }
            class197.field3415[var5++] = var26;
        }
        for (int var8 = -arg1 + var2; ~var8 > ~var2; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (Math.random() * 100.0D);
                if (~var25 > -51 && ~var24 < -11 && var24 < 118) {
                    class197.field3415[var23 + var24] = 255;
                } else {
                    class197.field3415[var23 + var24] = 0;
                }
            }
        }
        if (arg0 >= -76) {
            field806 = null;
        }
        for (int var9 = 0; ~var9 > ~(var2 - arg1); ++var9) {
            class142.field2497[var9] = class142.field2497[arg1 + var9];
        }
        for (int var10 = -arg1 + var2; ~var10 > ~var2; ++var10) {
            class142.field2497[var10] = (int) (Math.sin((double) class159.field2746 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class159.field2746 / 15.0D) + Math.sin((double) class159.field2746 / 16.0D) * 12.0D);
            ++class159.field2746;
        }
        class59.field809 += arg1;
        int var11 = ((1 & class133.field2326) + arg1) / 2;
        if (~var11 < -1) {
            for (int var12 = 0; var12 < class59.field809; ++var12) {
                int var21 = 2 + (int) (124.0D * Math.random());
                int var22 = 128 + (int) (Math.random() * 128.0D);
                class197.field3415[(var22 << 7) + var21] = 192;
            }
            class59.field809 = 0;
            for (int var13 = 0; var13 < var2; ++var13) {
                int var18 = var13 * 128;
                int var19 = 0;
                for (int var20 = -var11; var20 < 128; ++var20) {
                    if (~(var11 + var20) > -129) {
                        var19 += class197.field3415[var20 - -var18 + var11];
                    }
                    if (~(-var11 + -1 + var20) <= -1) {
                        var19 -= class197.field3415[-var11 - (1 - var20 - var18)];
                    }
                    if (~var20 <= -1) {
                        class212.field3667[var18 + var20] = var19 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var2 > var16; ++var16) {
                    int var17 = var16 * 128;
                    if (var11 + var16 < var2) {
                        var15 += class212.field3667[var11 * 128 + var14 + var17];
                    }
                    if (~(var16 + -1 + -var11) <= -1) {
                        var15 -= class212.field3667[var14 - -var17 + -((var11 + 1) * 128)];
                    }
                    if (var16 >= 0) {
                        class197.field3415[var14 + var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(III)Z")
    public static final boolean method403(int arg0, int arg1, int arg2) {
        if (arg2 > -80) {
            field794 = -21;
        }
        ++field797;
        return (1 & arg0 >> arg1 + 1) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 == 107) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    this.field800 = arg1.method731(false);
                }
            } else {
                this.field807 = arg1.method731(false);
            }
            ++field798;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZI)Lmj;")
    public static final class129 method404(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method405(-72);
        }
        class129 var3 = class257.method1713(arg2, 127);
        ++field795;
        if (~arg0 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field2263 != null && var3.field2263.length > arg0 ? var3.field2263[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class58() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V")
    public static void method405(int arg0) {
        if (arg0 == 0) {
            field804 = null;
            field803 = null;
            field806 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field805;
        if (arg1 <= 37) {
            field803 = null;
        }
        int[] var3 = super.field1872.method182((byte) -112, arg0);
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 0, arg0);
            for (int var5 = 0; class130.field2297 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field807 >= ~var6 && ~this.field800 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
