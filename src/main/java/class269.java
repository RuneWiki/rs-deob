import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class269 extends class175 {

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    private int field4685 = 0;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
    private int field4689 = 2048;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    private int field4688 = 10;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field4682 = 3;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "Z")
    public static boolean field4679 = false;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "Loa;")
    public static class262 field4684 = new class262();

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "Luc;")
    public static class11 field4691 = new class11(64);

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "Lmb;")
    public static class96 field4694 = class243.method1708("name_icons", (byte) 102);

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "Z")
    public static boolean field4695 = false;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "[I")
    public static int[] field4692 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "I")
    public static int field4693 = -1;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "[I")
    private int[] field4677;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "[I")
    private int[] field4680;

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "[[I")
    public static int[][] field4696;

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class269() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field4687;
        int[] var3 = super.field3044.method904((byte) -84, arg1);
        int var4 = -108 % ((arg0 - 62) / 54);
        if (super.field3044.field2150) {
            int var5 = class23.field395[arg1];
            if (~this.field4685 != -1) {
                for (int var6 = 0; class1.field11 > var6; ++var6) {
                    int var7 = 0;
                    short var8 = 0;
                    int var9 = class244.field4240[var6];
                    int var10 = this.field4685;
                    if (~var10 != -2) {
                        if (var10 != 2) {
                            if (var10 == 3) {
                                var7 = 2048 - -(var9 - var5 >> 1);
                            }
                        } else {
                            var7 = (var9 - (-var5 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var7 = var9;
                    }
                    for (int var11 = 0; this.field4688 > var11; ++var11) {
                        if (~var7 <= ~this.field4680[var11] && ~this.field4680[var11 - -1] < ~var7) {
                            if (~this.field4677[var11] < ~var7) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var6] = var8;
                }
            } else {
                short var12 = 0;
                for (int var13 = 0; this.field4688 > var13; ++var13) {
                    if (this.field4680[var13] <= var5 && this.field4680[var13 + 1] > var5) {
                        if (var5 < this.field4677[var13]) {
                            var12 = 4096;
                        }
                        break;
                    }
                }
                class102.method771(var3, 0, class1.field11, var12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V")
    public static void method1843(byte arg0) {
        field4694 = null;
        field4691 = null;
        field4692 = null;
        field4684 = null;
        if (arg0 <= 123) {
            field4684 = null;
        }
        field4696 = null;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        this.method1844(-27229);
        if (arg0 != 2) {
            field4695 = true;
        }
        ++field4683;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
    private final void method1844(int arg0) {
        this.field4680 = new int[this.field4688 + 1];
        this.field4677 = new int[this.field4688 + 1];
        ++field4686;
        int var2 = 0;
        if (arg0 == -27229) {
            int var3 = 4096 / this.field4688;
            int var4 = this.field4689 * var3 >> 12;
            for (int var5 = 0; ~this.field4688 < ~var5; ++var5) {
                this.field4680[var5] = var2;
                this.field4677[var5] = var2 + var4;
                var2 += var3;
            }
            this.field4680[this.field4688] = 4096;
            this.field4677[this.field4688] = this.field4677[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)Laf;")
    public static final class159 method1845(int arg0, byte arg1) {
        ++field4681;
        class159 var2 = (class159) class167.field2946.method84(86, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class31.field499.method23(class62.method441(arg0, 255), arg1 + 42, class256.method1785(arg0, -15591));
            class159 var4 = new class159();
            var4.field2812 = arg0;
            if (var3 != null) {
                var4.method1158(new class239(var3), 0);
            }
            var4.method1150(0);
            if (~var4.field2811 != 0) {
                var4.method1151(method1845(var4.field2772, (byte) 61), (byte) 91, method1845(var4.field2811, (byte) 61));
            }
            if (~var4.field2813 != 0) {
                var4.method1161(method1845(var4.field2794, (byte) 61), method1845(var4.field2813, (byte) 61), arg1 ^ 61);
            }
            if (!class116.field2168 && var4.field2795) {
                var4.field2778 = false;
                var4.field2755 = null;
                var4.field2817 = 0;
                var4.field2779 = class26.field443;
                var4.field2788 = null;
            }
            class167.field2946.method88(var4, 16518, (long) arg0);
            return arg1 != 61 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field4678;
        int var4 = -71 / ((-22 - arg0) / 58);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4685 = arg2.method1651(4139);
                }
            } else {
                this.field4689 = arg2.method1663((byte) 96);
            }
        } else {
            this.field4688 = arg2.method1651(4139);
        }
    }
}
