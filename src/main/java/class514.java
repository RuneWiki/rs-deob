import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class514 implements class338 {

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Ljo;")
    private class303 field7350;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "Lsv;")
    private class602 field7354;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "[Lro;")
    public static class2[] field7355 = new class2[14];

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "Lxa;")
    private class458 field7356;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V")
    public static final void method2942(int arg0) {
        class239.field3025.method3022(0);
        field7349++;
        class334.field4314.field6215 = 0;
        if (arg0 <= 84) {
            return;
        }
        class273.field3455 = null;
        class419.field5570 = null;
        class145.field1631 = null;
        class588.field8361 = 0;
        class680.field9630.field6215 = 0;
        class112.field1306 = 0;
        class250.method1441((byte) 87);
        class387.field5170 = null;
        class210.field2549 = 0;
        class525.field7506 = 0;
        class491.field7115 = 0;
        class37.field414 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZI)V")
    public final void method725(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = class466.field6460 < class399.field5336 ? class399.field5336 : class466.field6460;
            int var4 = class416.field5524 > class137.field1567 ? class416.field5524 : class137.field1567;
            this.field7356.method2611(0, 0, var3, var4);
        }
        field7351++;
        if (arg1 != -2536) {
            method2942(-75);
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        if (arg0 != -18257) {
            this.field7354 = null;
        }
        field7353++;
        return this.field7350.method1711(this.field7354.field8539, 1);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (arg0 == -29265) {
            this.field7356 = class505.method2907((byte) -121, this.field7350.method1722(this.field7354.field8539, 0));
            field7352++;
            this.method725(true, arg0 + 26729);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    public static void method2943(byte arg0) {
        if (arg0 >= -60) {
            field7355 = null;
        }
        field7355 = null;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljo;Lsv;)V")
    public class514(class303 arg0, class602 arg1) {
        this.field7350 = arg0;
        this.field7354 = arg1;
    }
}
