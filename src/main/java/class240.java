import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class240 extends OutputStream {

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Lof;")
    public static class568 field3449 = new class568(10, 6);

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "J")
    public static long field3453 = 0L;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "Lsu;")
    public static class192 field3451 = new class192();

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3454 = null;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!mda", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3450++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)[Lfc;")
    public static final class235[] method1507(boolean arg0) {
        if (!arg0) {
            method1507(true);
        }
        field3448++;
        return new class235[] { class475.field6640, class281.field3923, class206.field3048, class272.field3837, class74.field1025, class201.field2959, class380.field5353, class460.field6508, class29.field358, class355.field5092, class586.field8190, class495.field6820, class568.field7650, class663.field9355, class257.field3657, class642.field9130, class230.field3280, class177.field2631, class184.field2711, class52.field747, class230.field3282, class81.field1137, class512.field7004, class577.field7758, class30.field366, class253.field3565, class143.field2133, class92.field1214, class537.field7297, class78.field1069, class460.field6513, class556.field7516, class185.field2730, class412.field5823, class414.field5854, class626.field8736, class269.field3818, class213.field3107, class272.field3834, class375.field5308, class65.field861, class438.field6176, class667.field9379, class637.field9047, class410.field5802, class23.field318, class634.field8918, class238.field3421, class267.field3791, class615.field8522, class498.field6845, class534.field7265, class455.field6350, class83.field1156, class585.field8170, class154.field2323, class235.field3397, class237.field3413, class525.field7186, class340.field4943, class362.field5148, class475.field6638, class165.field2509, class307.field4518, class91.field1212, class506.field6929, class388.field5454, class302.field4468, class223.field3214, class631.field8805, class168.field2536, class667.field9392, class686.field9643, class427.field6009, class14.field218, class622.field8662, class97.field1321, class457.field6442, class553.field7503, class418.field5888, class318.field4721, class371.field5286, class220.field3194, class274.field3865, class583.field8125, class476.field6653, class312.field4626, class599.field8309, class531.field7239, class623.field8693, class345.field4982, class71.field976, class77.field1060, class18.field276, class126.field1753, class106.field1419, class583.field8120, class66.field870, class647.field9183, class509.field6970, class136.field1922, class113.field1535, class125.field1746, class663.field9357, class125.field1735, class119.field1571, class608.field8455, class643.field9139, class599.field8299, class400.field5554, class500.field6864, class662.field9341, class235.field3388, class650.field9204, class159.field2382, class88.field1193, class435.field6145 };
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(Z)V")
    public static void method1508(boolean arg0) {
        field3449 = null;
        field3454 = null;
        field3451 = null;
        if (arg0) {
            method1507(true);
        }
    }
}
