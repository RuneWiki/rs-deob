import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class281 extends class64 {

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Lid;")
    public static class149 field4990 = class60.method382("::fps ", (byte) 110);

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "Lid;")
    public static class149 field4994 = class60.method382("(U (X", (byte) 21);

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field4997 = 2;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "Lid;")
    public static class149 field4998 = class60.method382("<img=0>", (byte) 16);

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Lgk;")
    public static class157 field4995 = new class157();

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "B")
    public byte field4991;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lid;")
    public class149 field4993;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Lid;")
    public class149 field4996;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)V")
    public static final void method1931(int arg0, boolean arg1) {
        field4992++;
        class216 var2 = class139.method972(arg0, !arg1, 4);
        if (!arg1) {
            field4990 = null;
        }
        var2.method1457(0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method1932(int arg0) {
        field4995 = null;
        field4994 = null;
        field4998 = null;
        field4990 = null;
        if (arg0 != 2) {
            method1932(36);
        }
    }
}
