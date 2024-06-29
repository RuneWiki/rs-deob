import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class50 {

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public int field746 = class153.method1087(64);

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Ljava/lang/String;")
    public String field754;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Ljava/lang/String;")
    public String field744;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/lang/String;")
    public String field753;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Ljava/lang/String;")
    public String field745;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Liu;")
    public static class517 field749 = new class517(102, 6);

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;BLjava/lang/String;ILjava/lang/String;)V")
    public final void method437(String arg0, int arg1, int arg2, String arg3, byte arg4, String arg5, int arg6, String arg7) {
        field752++;
        this.field746 = class153.method1087(64);
        this.field750 = arg6;
        this.field745 = arg3;
        this.field747 = arg1;
        this.field754 = arg7;
        this.field753 = arg5;
        if (arg4 > -38) {
            method438(true);
        }
        this.field744 = arg0;
        this.field748 = arg2;
        this.field751 = class310.field4553;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method438(boolean arg0) {
        field749 = null;
        if (!arg0) {
            field749 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class50(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6) {
        this.field747 = arg1;
        this.field751 = class310.field4553;
        this.field750 = arg5;
        this.field754 = arg6;
        this.field748 = arg0;
        this.field744 = arg3;
        this.field753 = arg4;
        this.field745 = arg2;
    }
}
