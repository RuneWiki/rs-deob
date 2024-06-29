import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class133 {

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public int field1931 = 1;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "C")
    public char field1928;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V", line = 3)
    public static final void method946(int arg0, boolean arg1, int arg2) {
        field1930++;
        class642.field9203 = arg0;
        class673.field9460 = arg2;
        class127.method910(class389.field5824.field1527, -124, class389.field5824.field1522);
        if (arg1) {
            class504.method2873(false, "", "", (byte) 111);
        } else {
            class600.method3411((byte) 126);
            class504.method2873(false, class205.field2788, class204.field2784, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)[Lvg;", line = 22)
    public static final class622[] method947(int arg0) {
        field1927++;
        return arg0 == 0 ? new class622[] { class606.field8761, class625.field9046, class454.field6556, class279.field3690, class327.field4735, class481.field6876, class61.field969, class444.field6450, class509.field7193, class654.field9366, class595.field8614, class410.field6102, class160.field2274, class351.field5209, class202.field2744, class496.field7026, class496.field7029, class338.field4913, class12.field295, class158.field2239, class504.field7141, class9.field262, class224.field2969, class288.field4177, class96.field1470, class533.field7837, class231.field3062, class473.field6799, class701.field9963, class240.field3158, class175.field2457, class441.field6403, class398.field6006, class448.field6494, class248.field3273, class341.field5056, class261.field3397, class635.field9154, class65.field1031, class581.field8460, class424.field6212, class53.field818, class357.field5274, class603.field8701, class112.field1675, class347.field5151, class329.field4764, class244.field3235, class230.field3049, class479.field6859, class308.field4546, class517.field7265, class295.field4355, class475.field6811, class73.field1149, class374.field5528, class522.field7327, class20.field379, class264.field3444, class492.field6995, class575.field8351, class218.field2905, class300.field4398, class178.field2478, class45.field686, class420.field6184, class160.field2279, class587.field8513, class582.field8463, class591.field8589, class9.field264, class305.field4523, class379.field5698, class238.field3131, class23.field435, class539.field7908, class132.field1914, class342.field5063, class44.field661, class149.field2110, class98.field1498, class198.field2709, class280.field3698, class236.field3098, class526.field7477, class291.field4282, class544.field8035, class473.field6797, class314.field4597, class533.field7840, class369.field5474, class221.field2930, class621.field8987, class408.field6078, class436.field6374, class509.field7180, class18.field358, class445.field6459, class471.field6768, class556.field8167, class295.field4345, class524.field7447, class581.field8453, class19.field365, class28.field489, class131.field1899, class30.field508, class587.field8517, class231.field3063, class623.field9016, class273.field3563, class232.field3073, class47.field733, class401.field6035, class282.field3770, class544.field8039, class74.field1164, class238.field3134 } : null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILgk;)V", line = 39)
    public final void method948(int arg0, class540 arg1) {
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                field1929++;
                if (arg0 != 24824) {
                    this.field1931 = -126;
                    return;
                }
                return;
            }
            this.method949(arg1, var3, 0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lgk;II)V", line = 61)
    private final void method949(class540 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1928 = class36.method214(arg0.method3128(32767), arg2 - 129);
        } else if (arg1 == 2) {
            this.field1931 = 0;
        }
        if (arg2 != 0) {
            this.field1931 = 68;
        }
        field1926++;
    }
}
