import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class285 extends class200 {

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field5068 = 0;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Lid;")
    public static class149 field5066 = class60.method382("(U0a )2 via: ", (byte) 96);

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "[J")
    public static long[] field5074 = new long[1000];

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (arg2 == 0) {
                super.field3641 = arg0.method489((byte) 82) == 1;
            }
            ++field5065;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        if (arg1 != 55) {
            this.method26(-117, (byte) 84);
        }
        ++field5069;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(0, arg0, false);
            for (int var5 = 0; var5 < class137.field2515; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)I")
    public static final int method1956(int arg0) {
        ++field5075;
        if (arg0 < 15) {
            field5074 = null;
        }
        return class183.field3314;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        int[][] var3 = super.field3632.method965(arg1, 118);
        if (super.field3632.field2550) {
            int[][] var4 = this.method1366(arg1, !arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class137.field2515 < ~var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        if (!arg0) {
            field5074 = null;
        }
        ++field5072;
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static final void method1957(int arg0) {
        ++field5067;
        class35.field505.method1291(arg0 + 19933);
        class210.field3743.method1291(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V")
    public static void method1958(int arg0) {
        field5066 = null;
        if (arg0 < 122) {
            method1958(-123);
        }
        field5074 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class285() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZB)V")
    public static final void method1959(boolean arg0, byte arg1) {
        class147.field2661 = null;
        if (arg0 && class269.field4848 != null) {
            class78.field1455 = class269.field4848.field363;
        } else {
            class78.field1455 = null;
        }
        class68.field1189 = null;
        class269.field4848 = null;
        ++field5073;
        class240.field4192 = null;
        class69.field1218 = null;
        class264.field4704 = null;
        class213.field3777 = null;
        class260.field4581 = 0;
        class86.field1564 = null;
        class228.field3992 = null;
        class118.field2026 = null;
        class10.field139 = null;
        class281.field4995.method1132((byte) 127);
        class65.field1159 = -1;
        class224.field3938 = null;
        class9.field129 = null;
        class82.field1508 = null;
        class168.field3120 = null;
        class129.field2285 = -1;
        class197.field3583 = null;
        class267.field4754 = null;
        class71.field1247 = null;
        class24.field356 = null;
        class287.field5116 = null;
        int var2 = 38 % ((59 - arg1) / 46);
        class151.field2755 = null;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
    public static final void method1960(int arg0, int arg1) {
        ++field5071;
        if (arg1 < 103) {
            field5074 = null;
        }
        if (~class76.field1375 != -1) {
            class71.field1246 = arg0;
        } else {
            class189.field3382.method567(arg0, 122);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lal;I)V")
    public static final void method1961(class230 arg0, int arg1) {
        ++field5070;
        if (arg1 == -26442) {
            class134.field2441 = arg0.method1550((byte) -119, class164.field3064);
        }
    }
}
