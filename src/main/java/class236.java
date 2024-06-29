import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class236 {

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "Z")
    public static boolean field3415 = false;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Lwf;")
    public static class117 field3411 = new class117(260);

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "Lha;")
    public static class53 field3412;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 13)
    public static final void method1511(int arg0, String arg1, int arg2) {
        field3413++;
        if (arg2 != 6343) {
            field3415 = false;
        }
        class221 var3 = class65.method413(2, arg0, (byte) 98);
        var3.method1426((byte) -118);
        var3.field3218 = arg1;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V", line = 28)
    public static void method1512(boolean arg0) {
        if (!arg0) {
            field3411 = null;
            field3412 = null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZJ)V", line = 39)
    public static final void method1513(boolean arg0, long arg1) {
        if (!arg0) {
            return;
        }
        field3414++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class213.method1405(0, arg1 - 1L);
            class213.method1405(0, 1L);
        } else {
            class213.method1405(0, arg1);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "()V", line = 62)
    public static final void method1514() {
        class72.method579(1, class348.field4772);
    }
}
