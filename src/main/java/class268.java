import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class268 extends class32 {

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lne;")
    public static class137 field4648 = new class137(30);

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field4650 = 0;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "[[Z")
    public static boolean[][] field4649;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V")
    public static final void method1758(int arg0, int arg1) {
        field4651++;
        class184 var2 = class147.method1044(arg0, (byte) 120, arg1);
        var2.method1230(1000);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIZI)V")
    public static final void method1759(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class149.field2597.field1392 = 0;
        field4652++;
        if (!arg3) {
            method1760(-70);
        }
        class149.field2597.method575((byte) 124, 137);
        class149.field2597.method575((byte) 125, arg2);
        class149.field2597.method575((byte) 126, arg4);
        class149.field2597.method600(arg1, (byte) 109);
        class149.field2597.method600(arg0, (byte) 52);
        class175.field3030 = -3;
        class79.field1300 = 1;
        class52.field872 = 0;
        class179.field3082 = 0;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static void method1760(int arg0) {
        if (arg0 != 0) {
            field4650 = -107;
        }
        field4649 = null;
        field4648 = null;
    }
}
