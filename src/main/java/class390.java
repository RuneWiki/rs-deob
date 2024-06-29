import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class390 extends class30 {

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "[I")
    public static int[] field5861 = new int[500];

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
    public static int field5867 = 0;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "Lmo;")
    public static class447 field5860;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field5866;
        int[] var3 = super.field371.method2367((byte) -69, arg0);
        if (arg1 < 49) {
            field5860 = null;
        }
        if (super.field371.field5586) {
            int[][] var4 = this.method206(arg0, 2, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class369.field5610 > var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)I")
    public static final int method2461(int arg0, int arg1) {
        ++field5862;
        return arg0 != -9812 ? 75 : arg1 & 255;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLe;)V")
    public static final void method2462(byte arg0, class312 arg1) {
        if (!class61.field786) {
            class379.method2413((byte) -111, arg1);
        } else {
            class84.method519(arg0 + -77, arg1);
        }
        ++field5864;
        if (arg0 != 49) {
            field5867 = -3;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
    public class390() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILne;B)I")
    public static final int method2463(int arg0, class172 arg1, byte arg2) {
        ++field5863;
        if (!client.method1149(arg1).method352(0, arg0) && arg1.field2767 == null) {
            return -1;
        } else {
            int var3 = -25 / ((arg2 - 10) / 60);
            return arg1.field2741 != null && ~arg0 > ~arg1.field2741.length ? arg1.field2741[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)V")
    public static void method2464(int arg0) {
        if (arg0 >= -70) {
            method2463(-33, (class172) null, (byte) -87);
        }
        field5860 = null;
        field5861 = null;
    }
}
