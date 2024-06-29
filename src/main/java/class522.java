import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class522 {

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "Ljava/lang/String;")
    public String field7401;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "Ljava/lang/String;")
    public String field7404;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Ljava/lang/String;")
    public String field7396;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "[Lee;")
    public static class675[] field7398 = new class675[2048];

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "[I")
    public static int[] field7397 = new int[1000];

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "Lg;")
    public static class153 field7399 = new class153(3, 2);

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field7400 = 0;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "Ldp;")
    public static class3 field7402;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)Z")
    public static final boolean method3059(byte arg0, int arg1) {
        if (arg0 >= -45) {
            field7397 = null;
        }
        field7403++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V")
    public static void method3060(boolean arg0) {
        field7397 = null;
        field7398 = null;
        field7399 = null;
        field7402 = null;
        if (!arg0) {
            method3059((byte) -65, -126);
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class522(String arg0, String arg1, String arg2) {
        this.field7401 = arg0;
        this.field7404 = arg1;
        this.field7396 = arg2;
    }
}
