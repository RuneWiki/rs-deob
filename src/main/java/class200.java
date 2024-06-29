import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class200 extends class185 {

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lmm;")
    public class459 field2628;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "Z")
    public static boolean field2629 = false;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "[Z")
    public static boolean[] field2630 = new boolean[100];

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Z)[Lcb;")
    public static final class318[] method1267(boolean arg0) {
        if (!arg0) {
            field2630 = null;
        }
        field2627++;
        return new class318[] { class47.field646, class664.field9415, class425.field5917, class603.field8228, class464.field6340, class7.field61, class256.field3535, class421.field5866, class16.field138, class198.field2620, class248.field3339, class612.field8326, class609.field8306, class537.field7376, class79.field998, class501.field6764, class579.field8001, class547.field7485, class679.field9653, class365.field5244, class304.field4095, class626.field8519, class308.field4135, class235.field3060, class483.field6540, class413.field5787, class326.field4748, class244.field3284, class690.field9741, class649.field9194, class208.field2731, class666.field9470, class2.field11, class194.field2516, class218.field2824, class430.field5982, class396.field5663, class476.field6426, class121.field1559, class597.field8168, class643.field9107, class612.field8351, class629.field8549, class24.field234, class22.field207, class273.field3701, class370.field5320, class544.field7456, class141.field1798, class222.field2872, class306.field4104, class516.field7079, class323.field4729, class129.field1638, client.field3008, class459.field6245, class255.field3519, class506.field6839, class131.field1674, class581.field8014, class588.field8080, class293.field3915, class612.field8346, class338.field4950, class373.field5383, class628.field8538, class548.field7495, class430.field5978, class676.field9592, class87.field1075, class278.field3763, class581.field8008, class494.field6682, class155.field1919, class489.field6599, class140.field1790, class261.field3602, class294.field3935, class413.field5800, class111.field1336, class339.field4961, class679.field9644, class355.field5171, class227.field2976, class379.field5438, class454.field6198, class251.field3386, class186.field2283, class679.field9648, class88.field1094, class48.field653, class529.field7324, class669.field9512, class35.field342, class441.field6069, class322.field4724, client.field3006, class86.field1070, class314.field4519, class252.field3469, class78.field976, class187.field2290, class349.field5101, class533.field7352, class22.field217, class29.field281, class545.field7474, class438.field6054, class312.field4365, class252.field3439, class659.field9287, class132.field1678, class666.field9472, class91.field1117, class15.field125, class462.field6302, class312.field4368 };
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
    public static void method1268(byte arg0) {
        if (arg0 <= 33) {
            field2629 = true;
        }
        field2630 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lpea;II[B)V")
    public class200(class641 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2628 = class319.method2070(6406, arg1, false, 6406, arg2, arg0, -2709, arg3);
        this.field2628.method2299(-109, false, false);
    }
}
