import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class213 {

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field3119 = 16777215;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIB)V")
    public static final void method1401(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 119) {
            method1402(96);
        }
        field3120++;
        class127 var4 = class760.method4231(arg0, -874792672, 11);
        var4.method1010(arg3 + 495);
        var4.field2092 = arg1;
        var4.field2099 = arg2;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I")
    public static final int method1402(int arg0) {
        field3118++;
        int var1 = -35 % ((arg0 - 80) / 45);
        return class708.field9816;
    }
}
