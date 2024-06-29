import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class138 extends class27 {

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    private int field2667 = 4096;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    private int field2664 = 0;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    private int field2670 = 2048;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
    private int field2675 = 2048;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    private int field2672 = 0;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    private int field2681 = 12288;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
    private int field2676 = 8192;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "Lkb;")
    public static class93 field2659 = class76.method390("oder benutzen Sie eine andere Welt)3", 0);

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Lkb;")
    public static class93 field2662 = class76.method390("und haben es deaktiviert)3 Klicken Sie auf der", 0);

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "Lkb;")
    private static class93 field2669 = class76.method390("M", 0);

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
    public static int field2679 = 0;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "Lkb;")
    public static class93 field2680 = field2669;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "Lkb;")
    public static class93 field2660 = field2669;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "Lkb;")
    public static class93 field2678 = class76.method390("Diese Welt ist voll)3", 0);

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "Ljc;")
    public static class85 field2673;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "[I")
    public static int[] field2668;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)Z")
    private final boolean method864(int arg0, int arg1, byte arg2) {
        ++field2663;
        int var4 = (arg0 - -arg1) * this.field2681 >> 12;
        if (arg2 <= 48) {
            return false;
        } else {
            int var5 = class27.field440[(var4 * 255 & 1045912) >> 12];
            int var6 = (var5 << 12) / this.field2681;
            int var7 = (var6 << 12) / this.field2676;
            int var8 = this.field2667 * var7 >> 12;
            return ~var8 < ~(-arg1 + arg0) && -arg1 + arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIZ)Z")
    private final boolean method865(int arg0, int arg1, boolean arg2) {
        ++field2677;
        int var4 = (-arg1 + arg0) * this.field2681 >> 12;
        int var5 = class27.field440[var4 * 255 >> 12 & 255];
        if (arg2) {
            return false;
        } else {
            int var6 = (var5 << 12) / this.field2681;
            int var7 = (var6 << 12) / this.field2676;
            int var8 = this.field2667 * var7 >> 12;
            return ~(arg1 - -arg0) > ~var8 && arg0 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 > 106) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field2676 = arg2.method1071(28101);
                                    }
                                } else {
                                    this.field2667 = arg2.method1071(28101);
                                }
                            } else {
                                this.field2681 = arg2.method1071(28101);
                            }
                        } else {
                            this.field2670 = arg2.method1071(28101);
                        }
                    } else {
                        this.field2672 = arg2.method1071(28101);
                    }
                } else {
                    this.field2664 = arg2.method1071(28101);
                }
            } else {
                this.field2675 = arg2.method1071(28101);
            }
            ++field2666;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public static void method866(int arg0) {
        field2673 = null;
        field2662 = null;
        field2668 = null;
        if (arg0 < 90) {
            field2662 = null;
        }
        field2660 = null;
        field2659 = null;
        field2669 = null;
        field2678 = null;
        field2680 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field2671;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = class142.field2781[arg0] - 2048;
            for (int var5 = 0; ~var5 > ~class159.field3209; ++var5) {
                int var6 = class97.field1808[var5] + -2048;
                int var7 = this.field2675 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = this.field2664 + var4;
                int var10 = var9 >= -2048 ? var9 : var9 + 4096;
                int var11 = ~var10 >= -2049 ? var10 : var10 + -4096;
                int var12 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var13 = this.field2672 + var6;
                int var14 = this.field2670 + var4;
                int var15 = ~var14 <= 2047 ? var14 : var14 + 4096;
                int var16 = var15 <= 2048 ? var15 : var15 + -4096;
                int var17 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method865(var11, var12, arg1) && !this.method864(var16, var18, (byte) 84) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class138() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        if (arg0 <= 77) {
            this.field2681 = -62;
        }
        class6.method35(true);
        ++field2661;
    }
}
