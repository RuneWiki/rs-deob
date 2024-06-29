import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class415 {

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "Z")
    public boolean field5901;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "[Lcr;")
    public static class163[] field5892 = new class163[4];

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5895 = "";

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public static int field5896 = 0;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "Lwf;")
    public class483 field5897;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "Lwf;")
    public class483 field5898;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Z")
    public boolean field5900;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)Lsp;")
    public static final class686 method2469(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        return var3 == null || var3.field4084 == null ? null : var3.field4084;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public final void method2470(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field5899++;
        if (this.field5897 != null) {
            this.field5897.method231((byte) -105);
        }
        this.field5900 = false;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)Z")
    public final boolean method2471(int arg0) {
        if (arg0 < 86) {
            field5892 = null;
        }
        field5894++;
        return this.field5900 && !this.field5901;
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
    public static void method2472(int arg0) {
        if (arg0 > 120) {
            field5892 = null;
            field5895 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Z)V")
    public class415(boolean arg0) {
        this.field5901 = arg0;
    }
}
