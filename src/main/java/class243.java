import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class243 extends class117 {

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    private int field3851 = 0;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    private int field3859 = 12288;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    private int field3853 = 8192;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    private int field3860 = 2048;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    private int field3865 = 4096;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    private int field3868 = 0;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    private int field3867 = 2048;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field3864 = -1;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "Ljava/util/Random;")
    public static Random field3858 = new Random();

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "Lqd;")
    public static class173 field3871 = new class173(260);

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "[I")
    public static int[] field3869;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "[I")
    public static int[] field3870;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "[[[Llm;")
    public static class151[][][] field3862;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1626(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var8 = arg3 + -334;
        if (!arg5) {
            field3858 = null;
        }
        ++field3854;
        if (~var8 <= -1) {
            if (var8 > 100) {
                var8 = 100;
            }
        } else {
            var8 = 0;
        }
        int var9 = (class33.field508 - class111.field1753) * var8 / 100 + class111.field1753;
        int var10 = 2048 - arg0 & 2047;
        int var11 = arg2 * var9 >> 8;
        int var12 = 0;
        int var13 = 2047 & -arg7 + 2048;
        int var14 = 0;
        int var15 = var11;
        if (var10 != 0) {
            int var16 = class302.field4824[var10];
            int var17 = class302.field4823[var10];
            var14 = -var11 * var17 >> 16;
            var15 = var11 * var16 >> 16;
        }
        if (~var13 != -1) {
            int var18 = class302.field4823[var13];
            var12 = var15 * var18 >> 16;
            int var19 = class302.field4824[var13];
            var15 = var15 * var19 >> 16;
        }
        class264.field4245 = arg0;
        class148.field2314 = arg4 - var12;
        class71.field1207 = arg7;
        class46.field776 = -var14 + arg6;
        class104.field1666 = -var15 + arg1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field3857;
        if (arg0 != 2) {
            method1626(41, 46, 33, -90, 24, false, 118, 124);
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 86);
        if (super.field1883.field1313) {
            int var4 = class173.field2835[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class168.field2737; ++var5) {
                int var6 = field3869[var5] + -2048;
                int var7 = this.field3860 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 - -4096;
                int var9 = this.field3868 + var4;
                int var10 = var9 < -2048 ? var9 + 4096 : var9;
                int var11 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var12 = this.field3851 + var6;
                int var13 = var12 >= -2048 ? var12 : var12 + 4096;
                int var14 = ~var13 >= -2049 ? var13 : var13 + -4096;
                int var15 = var4 - -this.field3867;
                int var16 = ~var15 <= 2047 ? var15 : var15 + 4096;
                int var17 = ~var10 < -2049 ? var10 + -4096 : var10;
                int var18 = ~var16 < -2049 ? var16 + -4096 : var16;
                var3[var5] = !this.method1631(1693471020, var11, var17) && !this.method1628(var14, var18, -114) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static void method1627(byte arg0) {
        field3858 = null;
        int var1 = 77 % (-arg0 / 49);
        field3871 = null;
        field3869 = null;
        field3862 = null;
        field3870 = null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class243() {
        super(0, true);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(III)Z")
    private final boolean method1628(int arg0, int arg1, int arg2) {
        if (arg2 >= -111) {
            this.field3867 = -70;
        }
        int var4 = (arg1 - -arg0) * this.field3859 >> 12;
        int var5 = class2.field32[(1046959 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3859;
        int var7 = (var6 << 12) / this.field3853;
        int var8 = this.field3865 * var7 >> 12;
        ++field3861;
        return var8 > arg1 - arg0 && ~(-var8) > ~(-arg0 + arg1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field3853 = arg0.method1142(arg1 ^ -19175);
                                }
                            } else {
                                this.field3865 = arg0.method1142(arg1 ^ -19175);
                            }
                        } else {
                            this.field3859 = arg0.method1142(-18970);
                        }
                    } else {
                        this.field3867 = arg0.method1142(-18970);
                    }
                } else {
                    this.field3851 = arg0.method1142(-18970);
                }
            } else {
                this.field3868 = arg0.method1142(-18970);
            }
        } else {
            this.field3860 = arg0.method1142(arg1 ^ -19175);
        }
        if (arg1 == 255) {
            ++field3863;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ldk;ILdk;)V")
    public static final void method1629(class251 arg0, int arg1, class251 arg2) {
        ++field3852;
        class60.field988 = arg0;
        class258.field4169 = arg2;
        class60.field988.method1678((byte) 110, 34);
        int var3 = (int) (Math.random() * 21.0D) + -10;
        int var4 = -10 + (int) (Math.random() * 21.0D);
        int var5 = -20 + (int) (Math.random() * 41.0D);
        if (arg1 > 99) {
            int var6 = -10 + (int) (21.0D * Math.random());
            class274.field4403 = var6 - -var5;
            class212.field3513 = var4 + var5;
            class60.field978 = var3 - -var5;
        }
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        class11.method53(-16416);
        if (arg0 == 1) {
            ++field3855;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ldk;I)V")
    public static final void method1630(class251 arg0, int arg1) {
        class105.field1667 = arg0;
        ++field3856;
        if (arg1 != 2318) {
            method1626(54, -10, -37, -97, -48, false, -64, 65);
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(III)Z")
    private final boolean method1631(int arg0, int arg1, int arg2) {
        int var4 = (-arg1 + arg2) * this.field3859 >> 12;
        ++field3866;
        if (arg0 != 1693471020) {
            return false;
        } else {
            int var5 = class2.field32[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field3859;
            int var7 = (var6 << 12) / this.field3853;
            int var8 = this.field3865 * var7 >> 12;
            return ~(arg1 + arg2) > ~var8 && ~(-var8) > ~(arg1 - -arg2);
        }
    }
}
