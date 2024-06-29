import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class154 extends class260 {

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    private int field2785 = 0;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    private int field2791 = 1365;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    private int field2790 = 0;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    private int field2789 = 20;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "[I")
    public static int[] field2783 = new int[2];

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "[I")
    public static int[] field2787 = new int[2500];

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "Loh;")
    public static class263 field2786 = class253.method1681(-121, "<col=ff3000>");

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "Lal;")
    public static class223 field2792 = new class223(5000);

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "Loh;")
    public static class263 field2796 = class253.method1681(-117, "");

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            method1016(53);
        }
        ++field2784;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            for (int var4 = 0; class49.field1052 > var4; ++var4) {
                int var5 = (class70.field1409[var4] << 12) / this.field2791 + this.field2790;
                int var6 = (class275.field4825[arg0] << 12) / this.field2791 + this.field2785;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                for (int var13 = var5 * var5 >> 12; var11 + var13 < 16384 && ~this.field2789 < ~var12; var13 = var9 * var9 >> 12) {
                    ++var12;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var11 + var7 + var13;
                    var11 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field2789 + -1) < ~var12 ? (var12 << 12) / this.field2789 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1013(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2795;
        field2792.field3497 = 0;
        if (arg4) {
            field2792.method1288((byte) -123, 149);
            field2792.method1288((byte) -28, arg3);
            field2792.method1288((byte) -81, arg1);
            field2792.method1276(arg0, -57);
            field2792.method1276(arg2, -119);
            class162.field2949 = 1;
            class178.field3274 = 0;
            class248.field4330 = 0;
            class236.field4120 = -3;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field2794;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field2785 = arg2.method1294((byte) 3);
                    }
                } else {
                    this.field2790 = arg2.method1294((byte) 3);
                }
            } else {
                this.field2789 = arg2.method1294((byte) 3);
            }
        } else {
            this.field2791 = arg2.method1294((byte) 3);
        }
        if (arg1 != 5701) {
            field2786 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class154() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V")
    public static void method1014(int arg0) {
        field2787 = null;
        field2796 = null;
        field2792 = null;
        field2783 = null;
        field2786 = null;
        if (arg0 != -2915) {
            field2787 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)Z")
    public static final boolean method1015(byte arg0, int arg1) {
        ++field2793;
        if (arg0 > -80) {
            method1014(23);
        }
        return ~(arg1 & -arg1) == ~arg1;
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V")
    public static final void method1016(int arg0) {
        class117 var1 = class236.field4122;
        synchronized (class236.field4122) {
            ++class244.field4300;
            class29.field728 = class185.field3347;
            if (class95.field1868 >= 0) {
                while (~class95.field1868 != ~class73.field1518) {
                    int var3 = class114.field2136[class73.field1518];
                    class73.field1518 = class73.field1518 - -1 & 127;
                    if (~var3 > -1) {
                        class248.field4342[~var3] = false;
                    } else {
                        class248.field4342[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; ~var2 > -113; ++var2) {
                    class248.field4342[var2] = false;
                }
                class95.field1868 = class73.field1518;
            }
            if (arg0 != 2) {
                method1013(-84, 43, -105, 48, false);
            }
            class185.field3347 = class194.field3453;
        }
        ++field2797;
    }
}
