import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class61 extends class666 {

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Lnaa;")
    public static class65 field628 = new class65(14, 1);

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Lnaa;")
    public static class65 field631 = new class65(15, 4);

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Lnaa;")
    public static class65 field632 = new class65(16, -2);

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "Lnaa;")
    public static class65 field633 = new class65(17, 0);

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Lnaa;")
    public static class65 field634 = new class65(18, -2);

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "Lnaa;")
    public static class65 field635 = new class65(19, -2);

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Lnaa;")
    public static class65 field636 = new class65(20, 6);

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lnaa;")
    public static class65 field637 = new class65(21, 9);

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Lnaa;")
    public static class65 field638 = new class65(22, -2);

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "Lnaa;")
    public static class65 field639 = new class65(23, 4);

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "Lnaa;")
    public static class65 field640 = new class65(24, -1);

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "Lnaa;")
    public static class65 field641 = new class65(25, -2);

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "Lnaa;")
    public static class65 field642 = new class65(26, 0);

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "Lnaa;")
    public static class65 field643 = new class65(27, 0);

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "[Lnaa;")
    private static class65[] field644 = new class65[32];

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "[I")
    public static int[] field645;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Lqq;")
    public static class434 field630;

    static {
        class65[] var0 = class561.method3158(7575);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field644[var0[var1].field689] = var0[var1];
        }
        field645 = new int[13];
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 4)
    public class61() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)V", line = 12)
    public static final void method406(int arg0) {
        if (class89.field958 < 1024.0F) {
            class89.field958 = 1024.0F;
        }
        ++field629;
        if (class89.field958 > 3072.0F) {
            class89.field958 = 3072.0F;
        }
        while (class90.field1041 >= 16384.0F) {
            class90.field1041 -= 16384.0F;
        }
        while (class90.field1041 < 0.0F) {
            class90.field1041 += 16384.0F;
        }
        int var1 = class534.field7634 >> 9;
        int var2 = class656.field9368 >> 9;
        int var3 = class363.method1995(class353.field4625, class656.field9368, -1327568407, class534.field7634);
        if (arg0 == 16384) {
            int var4 = 0;
            if (var1 > 3 && ~var2 < -4 && ~(class399.field5338 + -4) < ~var1 && class349.field4567 - 4 > var2) {
                for (int var5 = var1 - 4; var1 + 4 >= var5; ++var5) {
                    for (int var6 = var2 + -4; var2 - -4 >= var6; ++var6) {
                        int var7 = class353.field4625;
                        if (~var7 > -4 && class166.method996(var5, arg0 ^ 14021, var6)) {
                            ++var7;
                        }
                        int var8 = 0;
                        if (class110.field1273.field6360 != null && class110.field1273.field6360[var7] != null) {
                            var8 = (255 & class110.field1273.field6360[var7][var5][var6]) * 8;
                        }
                        int var9 = -class628.field8912[var7].method253(var5, var6) - (-var8 - var3);
                        if (~var4 > ~var9) {
                            var4 = var9;
                        }
                    }
                }
            }
            int var10 = (var4 >> 2) * 1536;
            if (~var10 < -786433) {
                var10 = 786432;
            }
            if (var10 < 262144) {
                var10 = 262144;
            }
            if (class631.field8957 < var10) {
                class631.field8957 += (-class631.field8957 + var10) / 24;
            } else if (var10 < class631.field8957) {
                class631.field8957 += (-class631.field8957 + var10) / 80;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I", line = 101)
    public final int[] method122(int arg0, int arg1) {
        if (arg0 > -21) {
            return null;
        } else {
            ++field627;
            int[] var3 = super.field9466.method1811(arg1, 10);
            if (super.field9466.field4172) {
                int[][] var4 = this.method3737(arg1, 0, 3);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class501.field7222 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 139)
    public static void method407(byte arg0) {
        field642 = null;
        field633 = null;
        if (arg0 != 113) {
            method407((byte) -72);
        }
        field631 = null;
        field628 = null;
        field632 = null;
        field634 = null;
        field645 = null;
        field639 = null;
        field630 = null;
        field643 = null;
        field644 = null;
        field636 = null;
        field638 = null;
        field640 = null;
        field635 = null;
        field641 = null;
        field637 = null;
    }
}
