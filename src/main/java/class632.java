import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class632 {

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public int field8834;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public int field8835;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public int field8836;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field8837 = 0;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lwn;")
    public static class573 field8833;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 5)
    public static final String method3623(int arg0, boolean arg1) {
        if (!arg1) {
            method3623(-86, false);
        }
        field8838++;
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 16)
    public static void method3624(int arg0) {
        if (arg0 <= 21) {
            method3623(-48, true);
        }
        field8833 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLkf;)V", line = 26)
    public static final void method3625(byte arg0, class359 arg1) {
        field8832++;
        if (arg0 > -104) {
            method3623(5, true);
        }
        for (class571 var2 = (class571) class536.field7419.method1041(1048832); var2 != null; var2 = (class571) class536.field7419.method1033(-1)) {
            if (var2.field8034 == arg1) {
                if (var2.field8026 != null) {
                    class44.field468.method2512(var2.field8026);
                    var2.field8026 = null;
                }
                var2.method527(-11229);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(III)V", line = 68)
    public class632(int arg0, int arg1, int arg2) {
        this.field8834 = arg2;
        this.field8835 = arg0;
        this.field8836 = arg1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB)V")
    public abstract void method1993(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)V")
    public abstract void method1992(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBI)V")
    public abstract void method1994(int arg0, byte arg1, int arg2);
}
