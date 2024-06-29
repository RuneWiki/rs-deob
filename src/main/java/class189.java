import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class189 {

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lad;")
    private class11 field2480 = new class11(64);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Ldn;")
    private class201 field2476;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Z")
    public static boolean field2477 = false;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Loi;")
    public static class169 field2481 = new class169("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field2483 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 5)
    public static void method1241(byte arg0) {
        if (arg0 >= 54) {
            field2481 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 16)
    public final void method1242(int arg0, int arg1) {
        if (arg0 != -19090) {
            return;
        }
        field2482++;
        class11 var3 = this.field2480;
        synchronized (this.field2480) {
            this.field2480.method80(-48, arg1);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Lda;", line = 38)
    public final class348 method1243(int arg0, int arg1) {
        field2473++;
        class11 var3 = this.field2480;
        class348 var4;
        synchronized (this.field2480) {
            var4 = (class348) this.field2480.method78((long) arg1, (byte) -92);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2476.method1313((byte) -114, 35, arg1);
        if (arg0 != -5922) {
            this.method1245(true);
        }
        class348 var6 = new class348();
        if (var5 != null) {
            var6.method2047(new class88(var5), (byte) -38);
        }
        var6.method2045(true);
        class11 var7 = this.field2480;
        synchronized (this.field2480) {
            this.field2480.method88((long) arg1, 73, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 74)
    public final void method1244(int arg0) {
        if (arg0 != 64) {
            this.method1244(124);
        }
        field2475++;
        class11 var2 = this.field2480;
        synchronized (this.field2480) {
            this.field2480.method84(-111);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 90)
    public final void method1245(boolean arg0) {
        field2479++;
        if (arg0) {
            this.method1243(-53, -72);
        }
        class11 var2 = this.field2480;
        synchronized (this.field2480) {
            this.field2480.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)[Lpi;", line = 108)
    public static final class340[] method1246(int arg0) {
        field2474++;
        return arg0 <= 24 ? null : new class340[] { class389.field5110, class188.field2456, class13.field223, class191.field2486, class93.field1300, class379.field4916, class443.field6160, class342.field4360, class422.field5659, class187.field2439, class515.field7570, class470.field6872, class251.field3195, class232.field3000, class182.field2386, class158.field2079, class481.field7007, class518.field7673, class54.field731, class46.field669, class321.field4134, class492.field7178, class523.field7749, class382.field4988, class346.field4406, class327.field4210, class419.field5573, class195.field2534, class223.field2872, class318.field4094, class510.field7478, class405.field5432, class201.field2624, class142.field1878, class335.field4287, class24.field430, class8.field75, class166.field2144, class359.field4642, class118.field1645, class334.field4284, class431.field5945, class334.field4282, class47.field677, class131.field1780, class217.field2779, class119.field1663, class319.field4111, class402.field5383, class119.field1655, class298.field3865, class206.field2686, class142.field1883, class6.field50, class58.field776, class113.field1552, class374.field4861, class23.field423, class139.field1853, class53.field725, class143.field1887, class259.field3267, class192.field2494, class508.field7462, class290.field3716, class260.field3303, class339.field4331, class222.field2869, class105.field1434, class478.field6974, class159.field2090, class197.field2543, class283.field3618, class268.field3392, class51.field697, class438.field6012, class144.field1913, class296.field3845, class315.field4062, class227.field2924, class250.field3192, class321.field4138, class411.field5485, class342.field4358, class73.field921, class489.field7130, class244.field3132, class439.field6115, class210.field2708, class521.field7733, class314.field4041, class354.field4547, class133.field1813, class395.field5213, class23.field422, class355.field4564, class440.field6133, class476.field6952, class518.field7675, class55.field748, class451.field6283, class27.field466, class459.field6420, class278.field3557, class472.field6895, class287.field3672, class243.field3128, class261.field3313, class268.field3396, class175.field2246 };
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 125)
    public class189(class65 arg0, int arg1, class201 arg2) {
        this.field2476 = arg2;
        if (this.field2476 != null) {
            this.field2476.method1302(-79, 35);
        }
    }
}
