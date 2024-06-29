import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class261 extends class166 {

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field4653 = 0;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "[Z")
    public static boolean[] field4656 = new boolean[112];

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "[Z")
    public static boolean[] field4654 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "Lhj;")
    public static class69 field4660 = class181.method1318("Spielwelt erstellt)3", (byte) -116);

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
    public static final void method1793(byte arg0) {
        ++field4655;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~(class177.field3218 + -1) < ~var2; ++var2) {
                if (class208.field3782[var2] < 1000 && class208.field3782[var2 + 1] > 1000) {
                    class69 var3 = class216.field3917[var2];
                    class216.field3917[var2] = class216.field3917[var2 - -1];
                    var1 = false;
                    class216.field3917[var2 + 1] = var3;
                    class69 var4 = class26.field374[var2];
                    class26.field374[var2] = class26.field374[var2 + 1];
                    class26.field374[var2 + 1] = var4;
                    int var5 = class38.field526[var2];
                    class38.field526[var2] = class38.field526[var2 + 1];
                    class38.field526[var2 + 1] = var5;
                    int var6 = class66.field1277[var2];
                    class66.field1277[var2] = class66.field1277[var2 + 1];
                    class66.field1277[var2 + 1] = var6;
                    short var7 = class208.field3782[var2];
                    class208.field3782[var2] = class208.field3782[var2 + 1];
                    class208.field3782[var2 + 1] = var7;
                    long var8 = class113.field2177[var2];
                    class113.field2177[var2] = class113.field2177[var2 + 1];
                    class113.field2177[var2 + 1] = var8;
                }
            }
        }
        if (arg0 >= -122) {
            method1794((byte) -114);
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V")
    public static void method1794(byte arg0) {
        field4656 = null;
        if (arg0 != 91) {
            method1794((byte) 121);
        }
        field4654 = null;
        field4660 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class261() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method20(-76, -80);
        }
        ++field4658;
        int[][] var3 = super.field3064.method320(arg1, (byte) -119);
        if (super.field3064.field979) {
            int[][] var4 = this.method1229(arg1, 23580, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class253.field4565; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4659;
        if (arg1 != 8388607) {
            return null;
        } else {
            int[] var3 = super.field3071.method1252(arg0, true);
            if (super.field3071.field3142) {
                int[] var4 = this.method1231(122, arg0, 0);
                for (int var5 = 0; ~var5 > ~class253.field4565; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILtk;)Lhj;")
    public static final class69 method1795(int arg0, class50 arg1) {
        ++field4657;
        if (arg0 != -15933) {
            return null;
        } else if (~class65.method423(client.method1141(arg1), -21748) == -1) {
            return null;
        } else if (arg1.field856 != null && ~arg1.field856.method442(-68).method441((byte) 73) != -1) {
            return arg1.field856;
        } else {
            return class88.field1684 ? class26.field373 : null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 != 96) {
            field4656 = null;
        }
        if (~arg2 == -1) {
            super.field3074 = arg1.method937(false) == 1;
        }
        ++field4661;
    }
}
