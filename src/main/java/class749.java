import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class749 {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public int field10221;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field10220 = 0;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field10222;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Z")
    public static boolean field10224;

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V", line = 9)
    public class749(int arg0) {
        this.field10221 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZI)Ljava/lang/String;", line = 17)
    public static final String method4066(int arg0, int arg1, boolean arg2, int arg3) {
        field10222++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg2 && arg0 >= 0) {
            int var4 = 2;
            for (int var5 = arg0 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg1 > -40) {
                field10220 = -81;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg3;
                int var9 = var8 - (arg0 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)[Luw;", line = 75)
    public static final class208[] method4067(int arg0) {
        if (arg0 != 15973) {
            method4066(52, -7, true, 119);
        }
        field10225++;
        return new class208[] { class486.field6261, class400.field5294, class461.field6002, class194.field2701, class452.field5899, class535.field6751, class600.field7631, class155.field1981, class167.field2216, class601.field7638, class256.field3473, class601.field7652, class648.field8277, class128.field1715, class659.field8610, class661.field8619, class455.field5949, class213.field2924, class380.field4657, class114.field1505, class535.field6748, class256.field3470, class206.field2837, class571.field7224, class512.field6529, class382.field4768, class503.field6446, class138.field1825, class450.field5873, class71.field964, class780.field10649, class436.field5730, class302.field3818, class96.field1301, class104.field1408, class37.field409, class373.field4560, class467.field6054, class451.field5891, class208.field2871, class375.field4584, class282.field3648, class239.field3242, class190.field2634, class187.field2612, class512.field6532, class652.field8345, class259.field3486, class472.field6152, class575.field7306, class636.field8089, class729.field9565, class116.field1540, class667.field8678, class166.field2213, class501.field6434, class559.field7101, class721.field9468, class33.field331, class504.field6454, class244.field3359, class567.field7177, class406.field5384, class379.field4637, class283.field3660, class629.field7986, class43.field484, class292.field3716, class656.field8462, class683.field8811, class133.field1756, class279.field3622, class395.field5192, class350.field4283, class88.field1225, class726.field9527, class308.field3864, class52.field666, class745.field10182, class120.field1608, class168.field2227, class254.field3452, class345.field4224, class387.field4943, class667.field8676, class725.field9519, class291.field3714, class681.field8794, class515.field6568, class473.field6156, class117.field1557, class648.field8275, class253.field3442, class42.field481, class197.field2734, class349.field4268, class648.field8273, class380.field4656, class714.field9402, class289.field3690, class633.field8025, class615.field7802, class203.field2810, class773.field10501, class456.field5977, class56.field729, class525.field6675, class359.field4378, class490.field6302, class713.field9396, class443.field5806, class114.field1511, class691.field8881, class503.field6448, class632.field8018, class450.field5875, class472.field6149, class116.field1536, class562.field7146, class64.field841, class600.field7628, class499.field6394, class780.field10641, class286.field3669, class61.field797, class511.field6522, class453.field5908, class361.field4389, class319.field3975, class327.field4020, class104.field1405, class497.field6372, class751.field10239 };
    }

    @OriginalMember(owner = "client!tn", name = "toString", descriptor = "()Ljava/lang/String;", line = 86)
    public final String toString() {
        field10223++;
        throw new IllegalStateException();
    }
}
