import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class225 {

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "[I")
    public static int[] field3027 = new int[2];

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field3030 = 0;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lml;")
    public static class266 field3029;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Lla;")
    public static class316 field3028;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljk;ZII)V", line = 3)
    public static final void method1446(class450 arg0, boolean arg1, int arg2, int arg3) {
        class102.field1391 = arg3;
        if (!arg1) {
            class527.field7741 = arg2;
            field3026++;
            class176.field2277 = arg0;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V", line = 21)
    public static void method1447(byte arg0) {
        if (arg0 == 66) {
            field3029 = null;
            field3028 = null;
            field3027 = null;
        }
    }
}
