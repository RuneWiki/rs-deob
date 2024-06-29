import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class1 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lgg;")
    public static class63 field6 = class116.method911(43, "Hierhin gehen");

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2 = -1;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lgg;")
    private static class63 field7 = class116.method911(43, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lgg;")
    public static class63 field1 = field7;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public abstract void method1(byte arg0);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static final void method2(byte arg0) {
        field5++;
        class21 var1 = (class21) class37.field879.method1033(0);
        if (arg0 <= 104) {
            return;
        }
        while (var1 != null) {
            if (class112.field2528 != var1.field490 || var1.field499) {
                var1.method1172(-58);
            } else if (class173.field3571 >= var1.field508) {
                var1.method222(class131.field2852, (byte) -107);
                if (var1.field499) {
                    var1.method1172(-62);
                } else {
                    class134.method975(var1.field490, var1.field502, var1.field497, var1.field500, 60, var1, 0, -1L, false);
                }
            }
            var1 = (class21) class37.field879.method1035(0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static void method3(boolean arg0) {
        field6 = null;
        field7 = null;
        if (arg0) {
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)I")
    public abstract int method4(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method5(int arg0) {
        if (arg0 != -1) {
            field1 = null;
        }
        class23.field535.method282((byte) -44);
        field3++;
    }
}
