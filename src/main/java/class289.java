import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class289 {

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[S")
    public static short[] field4315 = new short[] { 44, 47, 11, 59, 50, 13, 8, 60 };

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lci;")
    public static class421 field4317 = null;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field4316 = 104;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lab;")
    public static class256 field4318;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 4)
    public static void method1823(int arg0) {
        if (arg0 != 104) {
            method1823(-42);
        }
        field4317 = null;
        field4318 = null;
        field4315 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBI)V", line = 24)
    public static final void method1824(int arg0, int arg1, byte arg2, int arg3) {
        if (arg3 == 0) {
            class244.method1332((byte) -83, class480.field6791);
            class424.field6125++;
        }
        field4319++;
        if (arg3 == 1) {
            class56.field710++;
            class244.method1332((byte) 124, class129.field1597);
        }
        class230.field3185.method889(true, arg0 + class93.field1163);
        class230.field3185.method889(true, class349.field5023 + arg1);
        class230.field3185.method936(class308.field4529.method1689((byte) -118, 82) ? 1 : 0, 0);
        class4.field52 = arg1;
        class317.field4623 = false;
        class158.field1886 = arg0;
        class101.method492((byte) 105);
        int var4 = 93 % ((-arg2 - 35) / 45);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBII)V", line = 62)
    public static final void method1825(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class357.field5123 = arg4;
        class453.field6396 = arg1;
        class75.field912 = arg3;
        class328.field4729 = arg0;
        field4320++;
        int var5 = -121 / ((arg2 + 49) / 42);
    }
}
