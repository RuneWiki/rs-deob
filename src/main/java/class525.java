import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class525 extends class136 {

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "[Z")
    public static boolean[] field7706 = new boolean[100];

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "Z")
    public static boolean field7709 = false;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field7707;
        if (arg0 != 4) {
            field7714 = -33;
        }
        if (arg1 == 0) {
            super.field1966 = ~arg2.method577(arg0 + 251) == -2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
    public static void method3112(byte arg0) {
        if (arg0 != -32) {
            field7714 = -122;
        }
        field7706 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class525() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    public static final void method3113(int arg0) {
        if (class375.method2306(true)) {
            if (class474.field6989 == null) {
                class479.method2891(-115);
            }
            class228.field3319 = true;
            class380.field5618 = 0;
            try {
                class175.field2486 = class164.field2319.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        if (arg0 >= -59) {
            method3113(-10);
        }
        ++field7712;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)I")
    public static final int method3114(byte arg0, int arg1, int arg2) {
        ++field7710;
        int var3 = arg1 * 57 + arg2;
        if (arg0 < 117) {
            field7714 = 7;
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 - -1376312589 & Integer.MAX_VALUE;
        return (134186290 & var5) >> 19;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        ++field7713;
        int[][] var3 = super.field1952.method3127((byte) -124, arg1);
        if (arg0 <= 33) {
            method3113(111);
        }
        if (super.field1952.field7770) {
            int[][] var4 = this.method1036(3, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class467.field6889 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILta;)V")
    public static final void method3115(int arg0, class142 arg1) {
        class131.field1899[arg0] = arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        int var3 = 106 % ((67 - arg0) / 50);
        ++field7705;
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1, 0, 0);
            for (int var6 = 0; ~var6 > ~class467.field6889; ++var6) {
                var4[var6] = 4096 - var5[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(BI)V")
    public static final void method3116(byte arg0, int arg1) {
        ++field7711;
        if (~class509.field7518 != ~arg1) {
            class397.field5828 = class457.field6713 = class340.field4725[arg1];
            class185.method1300(17569);
            class310.field4420 = new int[4][class397.field5828 >> 3][class457.field6713 >> 3];
            class323.field4549 = new int[class397.field5828][class457.field6713];
            class199.field2917 = new int[class397.field5828][class457.field6713];
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class455.field6684[var2] = class280.method1797((byte) -118, class457.field6713, class397.field5828);
            }
            class232.field3411 = new byte[4][class397.field5828][class457.field6713];
            class296.method1868(0, class457.field6713, class397.field5828, 4);
            class530.method3130(class457.field6713 >> 3, class225.field3300, class397.field5828 >> 3, 125);
            int var3 = 121 % ((arg0 - -14) / 51);
            class509.field7518 = arg1;
        }
    }
}
