import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class330 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    public static boolean field4978 = false;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4979 = -2;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Ljava/lang/String;")
    public String field4981;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method2160(int arg0) {
        field4977++;
        if (class134.field2010 == -1) {
            return;
        }
        int var1 = class377.field5570.method1475((byte) -124);
        int var2 = class377.field5570.method1484(arg0 - 43925);
        class345 var3 = (class345) class277.field4347.method295((byte) -39);
        if (arg0 != 21278) {
            field4978 = false;
        }
        if (var3 != null) {
            var1 = var3.method1905(true);
            var2 = var3.method1903(arg0 ^ 0x5315);
        }
        class291.method1947(var2, class169.field2570, class360.field5313, class134.field2010, arg0 ^ 0xFFFFACE1, 0, 0, 0, var1, 0);
        if (class398.field5876 != null) {
            class523.method3117(var2, var1, (byte) -121);
        }
    }
}
