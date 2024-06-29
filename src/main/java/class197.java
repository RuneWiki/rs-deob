import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class197 {

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "Lmf;")
    public static class382 field2805 = new class382(4);

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V", line = 3)
    public static void method1323(int arg0) {
        field2805 = null;
        if (arg0 != 32583) {
            field2805 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V", line = 13)
    public static final void method1324(int arg0) {
        if (arg0 != -191) {
            field2805 = null;
        }
        field2803++;
        if (class553.field7840) {
            return;
        }
        class700.field9892 = true;
        class553.field7840 = true;
        if (class287.field4270.field3685) {
            class630.field8811 = ((int) class630.field8811 + 191 & 0xFFFFFF80);
        } else {
            class706.field9931 += (24.0F - class706.field9931) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZI)V", line = 39)
    public static final void method1325(boolean arg0, int arg1) {
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field2806++;
        class546.field7679 = arg1;
        class64.field1214 = new class29[class60.field1140[class546.field7679] + 1];
        class98.field1546 = 0;
        class505.field7143 = 0;
        if (!arg0) {
            field2804 = 68;
        }
    }
}
