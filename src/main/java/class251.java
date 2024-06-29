import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class251 extends class467 {

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "Z")
    public static boolean field3480 = false;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "F")
    public static float field3478;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "Lns;")
    public static class438 field3477;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
    public static void method1641(int arg0) {
        field3477 = null;
        if (arg0 != -13542) {
            method1642(89, 69, -28);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V")
    public static final void method1642(int arg0, int arg1, int arg2) {
        field3475++;
        class377 var3 = class99.method672(arg2, false, arg1);
        var3.method2340((byte) 126);
        var3.field5763 = arg0;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(II)V")
    public class251(int arg0, int arg1) {
        this.field3474 = arg1;
        this.field3476 = arg0;
    }
}
