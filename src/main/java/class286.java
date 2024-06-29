import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class286 {

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BII)V", line = 3)
    public static final void method1846(byte arg0, int arg1, int arg2) {
        class233.field3459++;
        field4103++;
        if (arg0 != 47) {
            method1848(118);
        }
        class291.method1861((byte) -104, class470.field6926);
        class356.field5471.method1468(arg1, -128);
        class356.field5471.method1429((byte) -105, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)I", line = 20)
    public static int method1847(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1848(int arg0) {
        class201 var1 = (class201) class190.field2802.method1873((byte) -125);
        if (arg0 != 12586) {
            field4102 = 105;
        }
        while (var1 != null) {
            var1.method1370();
            var1 = (class201) class190.field2802.method1880(-61);
        }
        field4104++;
    }
}
