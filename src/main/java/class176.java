import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class class176 {

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field2396 = 0;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field2400 = -1;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field2399 = 0;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field2403 = 104;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2402;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lbj;IILbj;ZIZ)I", line = 15)
    public static final int method1196(class130 arg0, int arg1, int arg2, class130 arg3, boolean arg4, int arg5, boolean arg6) {
        field2401++;
        int var7 = class225.method1505(255, arg3, arg2, arg6, arg0);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else if (arg5 < 82) {
            return 46;
        } else {
            int var8 = class225.method1505(255, arg3, arg1, arg4, arg0);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lon;I)V", line = 50)
    public static final void method1197(class184 arg0, int arg1) {
        field2398++;
        if (arg1 != 2913) {
            return;
        }
        class184 var2 = class351.method2241(arg0, -710324528);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class330.field4671;
            var4 = class105.field1259;
        } else {
            var3 = var2.field2618;
            var4 = var2.field2516;
        }
        class92.method508(var3, arg0, var4, false, (byte) -128);
        class55.method319(false, arg0, var3, var4);
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V", line = 78)
    public static void method1198(int arg0) {
        if (arg0 == -19188) {
            field2402 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)C")
    public abstract char method162(int arg0);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)I")
    public abstract int method167(byte arg0);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)J")
    public abstract long method163(byte arg0);

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)Z")
    public abstract boolean method164(int arg0);

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)I")
    public abstract int method161(int arg0);
}
