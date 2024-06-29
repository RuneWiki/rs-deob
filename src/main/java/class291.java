import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class291 {

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "J")
    public long field4931 = 0L;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field4932 = 0;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lbe;")
    public static class283 field4936 = class153.method941(5, "sl_flags");

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Z")
    public static boolean field4939 = false;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lbe;")
    public static class283 field4940 = class153.method941(-11, ": ");

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Ltf;")
    public static class242 field4930 = new class242(64);

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Lbe;")
    public static class283 field4946 = class153.method941(-104, ")2");

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public int field4934;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public int field4937;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field4942;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lek;")
    public static class172 field4928;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lgf;")
    public class7 field4941;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Lgf;")
    public class7 field4943;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[I")
    public static int[] field4945;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILfe;)Lrh;", line = 11)
    public static final class128 method1983(int arg0, class229 arg1) {
        field4933++;
        class128 var2 = new class128(arg1.method1549(true), arg1.method1549(true), arg1.method1496(true), arg1.method1496(true), arg1.method1528(true), arg1.method1535((byte) 97) == 1);
        int var3 = arg1.method1535((byte) 87);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field2138.method1809(new class234(arg1.method1496(true), arg1.method1496(true), arg1.method1496(true), arg1.method1496(true)), (byte) -127);
        }
        var2.method797(arg0 + 29575);
        return arg0 == -29576 ? var2 : (class128) null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 60)
    public static void method1984(int arg0) {
        field4928 = null;
        field4940 = null;
        field4945 = null;
        field4946 = null;
        field4930 = null;
        field4936 = null;
        if (arg0 != 1) {
            field4939 = false;
        }
    }
}
