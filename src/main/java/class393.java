import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class393 {

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Z")
    public static boolean field5869 = false;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field5870 = 0;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Luq;II)Ljava/lang/String;")
    public static final String method2472(class114 arg0, int arg1, int arg2) {
        field5868++;
        if (!client.method1387(arg0).method2413((byte) -107, arg1) && arg0.field1678 == null) {
            return null;
        }
        if (arg2 != -18462) {
            field5869 = true;
        }
        if (arg0.field1647 == null || arg0.field1647.length <= arg1 || arg0.field1647[arg1] == null || arg0.field1647[arg1].trim().length() == 0) {
            return class64.field780 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field1647[arg1];
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Lsr;")
    public static final class168 method2473(int arg0, int arg1, int arg2) {
        class138 var3 = client.field3311[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2106;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIB)V")
    public static final void method2474(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5871++;
        if (arg4 < 86) {
            method2474(-38, -59, -110, -98, (byte) 82);
        }
        class211 var5 = class452.method2749(4, -104, arg0);
        var5.method1463(0);
        var5.field3441 = arg1;
        var5.field3446 = arg3;
        var5.field3440 = arg2;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([BB)[B")
    public static final byte[] method2475(byte[] arg0, byte arg1) {
        field5867++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        if (arg1 < 60) {
            return null;
        } else {
            class414.method2598(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }
}
