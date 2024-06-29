import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class374 extends class666 {

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    private int field4858 = 0;

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
    private int field4863 = 4096;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!fr", name = "J", descriptor = "[J")
    public static long[] field4861;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field4859;
        if (!arg2) {
            method2057((byte) 121);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field9465 = arg1.method2541(92) == 1;
                }
            } else {
                this.field4863 = arg1.method2574(-1758460248);
            }
        } else {
            this.field4858 = arg1.method2574(-1758460248);
        }
    }

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "(I)[Lqv;")
    public static final class406[] method2056(int arg0) {
        ++field4860;
        return arg0 != -43 ? null : new class406[] { class288.field3700, class212.field2567, class516.field7386, class628.field8907, class469.field6548, class577.field8238, class186.field2266, class595.field8451, class383.field5128 };
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
    public static final void method2057(byte arg0) {
        ++field4857;
        if (class73.field771 != class137.field1564) {
            try {
                class432.method2311(4975, "tbrefresh", class239.field3025);
                if (arg0 > -50) {
                    method2057((byte) -42);
                }
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V")
    public static void method2058(boolean arg0) {
        field4861 = null;
        if (!arg0) {
            field4861 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field4862;
        int[] var3 = super.field9466.method1811(arg1, 105);
        if (arg0 >= -21) {
            method2056(-105);
        }
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(0, -126, arg1);
            for (int var5 = 0; class501.field7222 > var5; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field4858) {
                    var3[var5] = this.field4858;
                } else if (~this.field4863 > ~var6) {
                    var3[var5] = this.field4863;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class374() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field4856;
        if (arg1 != 98) {
            this.field4858 = -19;
        }
        int[][] var3 = super.field9471.method3639(97, arg0);
        if (super.field9471.field9180) {
            int[][] var4 = this.method3737(arg0, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class501.field7222; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field4858) {
                    var8[var11] = this.field4858;
                } else if (~this.field4863 <= ~var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field4863;
                }
                if (~this.field4858 < ~var13) {
                    var9[var11] = this.field4858;
                } else if (~var13 < ~this.field4863) {
                    var9[var11] = this.field4863;
                } else {
                    var9[var11] = var13;
                }
                if (var14 < this.field4858) {
                    var10[var11] = this.field4858;
                } else if (~var14 < ~this.field4863) {
                    var10[var11] = this.field4863;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }
}
