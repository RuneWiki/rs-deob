import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class627 {

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field8927 = 0;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "Ljava/lang/String;")
    public static String field8926;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "Ljava/lang/String;")
    public static String field8928;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)V")
    public static void method3534(boolean arg0) {
        field8926 = null;
        if (!arg0) {
            field8928 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)[Leda;")
    public static final class116[] method3535(byte arg0) {
        field8929++;
        if (arg0 >= -85) {
            method3535((byte) 91);
        }
        return new class116[] { class333.field4639, class568.field8310, class642.field9123, class680.field9684, class458.field6584, class334.field4656, class446.field6454, class642.field9119, class91.field1340, class565.field8270, class440.field6362, class332.field4616, class528.field7799, class103.field1701, class142.field2463, class17.field261, class184.field2921, class136.field2195, class232.field3446, class561.field8179, class433.field6232, class286.field4035, class59.field863, class238.field3508, class537.field7884, class112.field1783, class425.field6077, class373.field5171, class90.field1331, class692.field9815, class421.field6013, class545.field8004, class640.field9069, class503.field7457, class127.field2077, class290.field4072, class340.field4728, class498.field7406, class624.field8887, class75.field1177, class60.field881, class622.field8861, class311.field4316, class409.field5851, class479.field6862, class297.field4198, class618.field8824, class677.field9632, class679.field9673, class486.field6935, class124.field2044, class466.field6727, class682.field9714, class327.field4549, class253.field3665, class265.field3802, class229.field3392, class456.field6549, class103.field1704, class638.field9050, class597.field8632, class103.field1707, class24.field327, class677.field9649, class564.field8230, class49.field636, class675.field9617, class636.field9016, class689.field9782, class583.field8547, class180.field2839, class374.field5186, class545.field8000, class106.field1754, class163.field2664, class211.field3223, class374.field5190, class464.field6651, class511.field7604, class648.field9187, class30.field445, class562.field8202, class385.field5640, class396.field5737, class194.field3040, class255.field3682, class83.field1263, class128.field2094, class561.field8176, class311.field4310, class102.field1667, class259.field3712, class129.field2097, class92.field1353, class42.field572, class253.field3662, class247.field3586, class150.field2531, class500.field7432, class611.field8773, class42.field567, class341.field4734, class493.field7073, class196.field3065, class535.field7863, class467.field6747, class314.field4348, class467.field6736, class18.field264, class457.field6563, class511.field7609, class22.field300, class23.field315, class177.field2815, class669.field9481, class243.field3559, class480.field6867, class667.field9374 };
    }

    @OriginalMember(owner = "client!gca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8924++;
        throw new IllegalStateException();
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field8926 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field8928 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field8930 = 0;
        field8931 = 100;
    }
}
