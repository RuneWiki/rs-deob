import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class96 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[I")
    public static int[] field1357 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lps;")
    public static class394 field1358;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg3 - arg0) >= class87.field1227 && (arg3 + arg0) <= class299.field4382 && (arg1 - arg0) >= class379.field5521 && class125.field1751 >= arg0 + arg1) {
            class17.method116(arg1, arg3, arg4, -119, arg0);
        } else {
            class75.method555(arg0, -1, arg4, arg3, arg1);
        }
        if (arg2 != 16250) {
            method659((byte) 71);
        }
        field1356++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 25)
    public static void method659(byte arg0) {
        field1357 = null;
        if (arg0 >= 106) {
            field1358 = null;
        }
    }
}
