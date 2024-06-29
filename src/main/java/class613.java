import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class613 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Lvj;")
    public static class373 field8884 = new class373(77, 2);

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Z")
    public static boolean field8886 = true;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field8888 = 0;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "F")
    public static float field8885;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 7)
    public static void method3522(int arg0) {
        field8884 = null;
        if (arg0 != 7) {
            field8886 = true;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V", line = 17)
    public static final void method3523(int arg0, byte arg1) {
        field8887++;
        int var2 = -98 / ((arg1 - 47) / 37);
        class557 var3 = class93.method564(7, -14073, arg0);
        var3.method3264(-1037624096);
    }
}
