import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class482 {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public int field7050;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "J")
    public long field7049;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Ljava/lang/String;")
    public String field7047;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public int field7048;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Ljava/lang/String;")
    public String field7051;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Lkfa;")
    public static class549 field7052 = new class549(15, 8);

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Llu;")
    public static class651 field7053 = new class651();

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Lpr;")
    public static class407 field7054 = new class407(50, 1);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static void method2808(byte arg0) {
        field7054 = null;
        field7053 = null;
        int var1 = -84 / ((-arg0 - 24) / 55);
        field7052 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2809(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class482(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field7050 = arg0;
        this.field7049 = arg4;
        this.field7047 = arg1;
        this.field7048 = arg2;
        this.field7051 = arg3;
    }
}
