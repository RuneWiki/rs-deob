import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class443 {

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "Lpia;")
    public static class94 field6426 = new class94(6, 2);

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 5)
    public static void method2751(byte arg0) {
        if (arg0 >= -125) {
            field6425 = 2;
        }
        field6426 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 23)
    public static final void method2752(int arg0, boolean arg1, String arg2) {
        if (arg1) {
            method2751((byte) 38);
        }
        field6424++;
        class47 var3 = class258.method1546(3, arg0, (byte) 121);
        var3.method271((byte) 125);
        var3.field513 = arg2;
    }
}
