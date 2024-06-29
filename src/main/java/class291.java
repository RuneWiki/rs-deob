import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class291 extends class30 {

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field4642 = -2;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "[I")
    public static int[] field4651 = new int[128];

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "[B")
    public static byte[] field4649;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIII)I")
    public static final int method1955(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field4644;
        if (class275.field4396 == null) {
            return 0;
        } else {
            if (arg2) {
                field4651 = null;
            }
            if (~arg4 > -4) {
                int var6 = arg5 >> 7;
                int var7 = arg3 >> 7;
                if (~arg1 > -1 || arg0 < 0 || arg1 > class80.field1003 + -1 || arg0 > class380.field5751 + -1) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || ~var6 < ~(class80.field1003 + -1) || class380.field5751 - 1 < var7) {
                    return 0;
                }
                boolean var8 = ~(class31.field382[1][arg5 >> 7][arg3 >> 7] & 2) != -1;
                if ((127 & arg5) == 0) {
                    boolean var9 = ~(class31.field382[1][var6 - 1][arg3 >> 7] & 2) != -1;
                    boolean var10 = ~(2 & class31.field382[1][var6][arg3 >> 7]) != -1;
                    if (!var10 != !var9) {
                        var8 = (class31.field382[1][arg1][arg0] & 2) != 0;
                    }
                }
                if ((127 & arg3) == 0) {
                    boolean var11 = ~(class31.field382[1][arg5 >> 7][var7 + -1] & 2) != -1;
                    boolean var12 = (2 & class31.field382[1][arg5 >> 7][var7]) != 0;
                    if (var11 != var12) {
                        var8 = (class31.field382[1][arg1][arg0] & 2) != 0;
                    }
                }
                if (var8) {
                    ++arg4;
                }
            }
            return class275.field4396[arg4].method771(arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class291() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)V")
    public static final void method1956(byte arg0) {
        ++field4648;
        if (arg0 > 77) {
            if (class211.method1483((byte) -42)) {
                if (class314.field4939 == null) {
                    class331.method2197(-841);
                }
                class7.field91 = new int[100];
                class35.field430 = new int[100];
                class217.field3550 = 0;
                class385.field5812 = true;
                class385.field5817 = new boolean[100];
                class377.field5697 = new int[100];
                for (int var1 = 0; var1 < 100; ++var1) {
                    class377.field5697[var1] = (int) ((double) class369.field5615 * Math.random());
                    class35.field430[var1] = (int) (Math.random() * 350.0D);
                    class7.field91[var1] = (int) (Math.random() * 102.0D);
                    class385.field5817[var1] = Math.random() < 0.5D;
                }
                try {
                    class375.field5665 = class97.field1359.getToolkit().getSystemClipboard();
                } catch (Exception var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
    public static void method1957(boolean arg0) {
        field4649 = null;
        if (!arg0) {
            field4651 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field4652;
        if (arg1 == 6456) {
            if (arg2 == 0) {
                super.field376 = arg0.method1322(false) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field4643;
        int[] var3 = super.field371.method2367((byte) 120, arg0);
        if (arg1 < 49) {
            return null;
        } else {
            if (super.field371.field5586) {
                int[] var4 = this.method210((byte) 61, 0, arg0);
                for (int var5 = 0; ~var5 > ~class369.field5610; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        if (arg0 != -93) {
            field4646 = -110;
        }
        ++field4647;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int[][] var4 = this.method206(arg1, 2, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class369.field5610 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIIII)V")
    public static final void method1958(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4645;
        if (!arg0) {
            method1955(109, 74, true, 104, 52, 126);
        }
        class11.field139.field3044 = 0;
        class11.field139.method1312(20, -91);
        class11.field139.method1312(arg4, -107);
        class11.field139.method1312(arg2, -83);
        class11.field139.method1283(8, arg1);
        class11.field139.method1283(8, arg3);
        class367.field5567 = 0;
        class190.field3103 = -3;
        class31.field389 = 1;
        class402.field6004 = 0;
    }
}
