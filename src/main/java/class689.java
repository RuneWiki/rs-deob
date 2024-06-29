import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class689 extends class700 {

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field9653 = -1;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Z")
    public static volatile boolean field9654 = false;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
    public static final void method3895(int arg0, int arg1) {
        field9656++;
        class252 var2 = class150.method916(arg1, arg0 - 139, arg0);
        var2.method1497(0);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
    public static final void method3896(int arg0, int arg1, int arg2) {
        boolean var3 = class77.field947[0][arg1][arg2] != null && class77.field947[0][arg1][arg2].field8734 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class77.field947[var4][arg1][arg2] == null) {
                class624 var5 = class77.field947[var4][arg1][arg2] = new class624(var4);
                if (var3) {
                    var5.field8726++;
                }
            }
        }
    }
}
