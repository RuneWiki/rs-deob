import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class122 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
    public static boolean field1689 = false;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
    public static int[] field1688;

    static {
        new class418(64);
        field1692 = 0;
        field1693 = 0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Les;", line = 11)
    public static final class291 method778(Throwable arg0, String arg1) {
        field1690++;
        class291 var2;
        if (arg0 instanceof class291) {
            var2 = (class291) arg0;
            var2.field4164 = var2.field4164 + ' ' + arg1;
        } else {
            var2 = new class291(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 35)
    public static void method779(int arg0) {
        field1688 = null;
        if (arg0 >= -65) {
            method778((Throwable) null, (String) null);
        }
    }
}
