import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class220 {

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    private int field3 = 4096;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    private int field7 = 4096;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    private int field11 = 4096;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "[[S")
    public static short[][] field1 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "[I")
    public static int[] field6 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "[Z")
    public static boolean[] field5 = new boolean[112];

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "Los;")
    public static class378 field8;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "Lclient;")
    public static client field9;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field10;
        if (arg1 != 0) {
            method3(-37);
        }
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int[][] var4 = this.method1369(0, (byte) 116, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class344.field5043 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3 * var12 >> 12;
                    var9[var11] = this.field11 * var13 >> 12;
                    var10[var11] = this.field7 * var14 >> 12;
                } else {
                    var8[var11] = this.field3;
                    var9[var11] = this.field11;
                    var10[var11] = this.field7;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class1() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 != -49) {
            this.method2(-27, (byte) -91, (class265) null);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field7 = arg2.method1685(8104);
                }
            } else {
                this.field11 = arg2.method1685(arg1 ^ -8089);
            }
        } else {
            this.field3 = arg2.method1685(8104);
        }
        ++field12;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
    public static void method3(int arg0) {
        field8 = null;
        field5 = null;
        field1 = null;
        field9 = null;
        if (arg0 != 28835) {
            field8 = null;
        }
        field6 = null;
    }
}
