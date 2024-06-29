import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class218 extends class30 {

    @OriginalMember(owner = "client!go", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3574 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Z")
    public static boolean field3575 = true;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 3)
    public static void method1560(int arg0) {
        if (arg0 <= -76) {
            field3574 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILla;)V", line = 16)
    public static final void method1561(int arg0, class422 arg1) {
        field3573++;
        class141.field2214 = arg1.method2629("hitmarks", 10912);
        class688.field9781 = arg1.method2629("hitbar_default", 10912);
        class562.field7962 = arg1.method2629("timerbar_default", 10912);
        class378.field5679 = arg1.method2629("headicons_pk", 10912);
        class544.field7768 = arg1.method2629("headicons_prayer", 10912);
        class685.field9685 = arg1.method2629("hint_headicons", 10912);
        class14.field152 = arg1.method2629("hint_mapmarkers", 10912);
        if (arg0 > -78) {
            return;
        }
        class37.field367 = arg1.method2629("mapflag", 10912);
        class617.field8702 = arg1.method2629("cross", 10912);
        class369.field5618 = arg1.method2629("mapdots", 10912);
        class701.field9909 = arg1.method2629("scrollbar", 10912);
        class631.field8866 = arg1.method2629("name_icons", 10912);
        class99.field1469 = arg1.method2629("floorshadows", 10912);
        class551.field7858 = arg1.method2629("compass", 10912);
        class451.field6565 = arg1.method2629("otherlevel", 10912);
        class325.field4805 = arg1.method2629("hint_mapedge", 10912);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)Z", line = 44)
    public static final boolean method1562(byte arg0, int arg1) {
        field3572++;
        for (class208 var2 = (class208) class344.field5093.method3463((byte) -50); var2 != null; var2 = (class208) class344.field5093.method3469((byte) 107)) {
            if (class4.method16((byte) -100, var2.field3488) && (long) arg1 == var2.field3473) {
                return true;
            }
        }
        int var3 = -102 / ((-arg0 - 60) / 63);
        return false;
    }
}
