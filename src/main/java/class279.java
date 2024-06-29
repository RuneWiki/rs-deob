import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class279 extends class666 {

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "Ltq;")
    public static class572 field3524 = new class572(16);

    @OriginalMember(owner = "client!wt", name = "K", descriptor = "Lkfa;")
    public static class549 field3528 = new class549(39, 2);

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "Lrd;")
    public static class305 field3530;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public static void method1590(byte arg0) {
        field3530 = null;
        field3524 = null;
        field3528 = null;
        if (arg0 >= -114) {
            field3530 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field3526;
        int[][] var3 = super.field9471.method3639(59, arg0);
        if (super.field9471.field9180) {
            int[][] var4 = this.method3737(arg0, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class501.field7222 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        if (arg1 != 98) {
            method1590((byte) 46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
    public class279() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (~arg0 == -1) {
            super.field9465 = ~arg1.method2541(72) == -2;
        }
        if (!arg2) {
            this.method1251(-63, (byte) -90);
        }
        ++field3527;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "([BIII)[B")
    public static final byte[] method1591(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -82) {
            return null;
        } else {
            ++field3522;
            byte[] var4 = new byte[arg3];
            class652.method3679(arg0, arg1, var4, 0, arg3);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field3525;
        int[] var3 = super.field9466.method1811(arg1, 115);
        if (arg0 > -21) {
            this.method121(88, (class452) null, false);
        }
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(0, -126, arg1);
            for (int var5 = 0; ~class501.field7222 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;")
    public static final String method1592(int arg0, String[] arg1, int arg2, byte arg3) {
        ++field3523;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg0; var5 > var7; ++var7) {
                String var12 = arg1[var7];
                if (var12 != null) {
                    var6 += var12.length();
                } else {
                    var6 += 4;
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; ++var9) {
                String var11 = arg1[var9];
                if (var11 != null) {
                    var8.append(var11);
                } else {
                    var8.append("null");
                }
            }
            int var10 = -81 / ((-46 - arg3) / 60);
            return var8.toString();
        }
    }
}
