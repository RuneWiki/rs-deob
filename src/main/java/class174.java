import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class174 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Lir;")
    public static class185 field2367;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2366;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static void method1159(int arg0) {
        field2366 = null;
        field2367 = null;
        if (arg0 < 28) {
            field2366 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lw;")
    public static final class170 method1160(int arg0, int arg1) {
        field2365++;
        if (arg0 != -28930) {
            method1160(110, 120);
        }
        class170 var2 = (class170) class229.field3152.method378((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class276.field4052.method1235(36, false, arg1);
        class170 var4 = new class170();
        var4.field2300 = arg1;
        if (var3 != null) {
            var4.method1133((byte) -117, new class341(var3));
        }
        var4.method1137((byte) -98);
        class229.field3152.method367((long) arg1, var4, true);
        return var4;
    }
}
