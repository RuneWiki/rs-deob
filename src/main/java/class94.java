import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class94 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1405 = -1;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 5)
    public static final void method639(Object[] arg0, long[] arg1, int arg2) {
        field1406++;
        class414.method2649(arg1.length - 1, arg2, arg0, (byte) 95, arg1);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 16)
    public static final void method640(int arg0) {
        class8.method57(111, class41.field617);
        field1408++;
        int var1 = 58 % ((arg0 + 32) / 55);
        class2.method11(class41.field617, true);
        if (class353.field4938 != null) {
            class353.field4938.method1569(42, class41.field617);
        }
        class331.field4489.method2797(31);
        class41.field617.setBackground(Color.black);
        class413.field5995 = -1;
        class447.method2785(class41.field617, -1);
        class344.method2207(99, class41.field617);
        if (class353.field4938 != null) {
            class353.field4938.method1570(class41.field617, -20);
        }
    }
}
