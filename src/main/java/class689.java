import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class689 extends class134 {

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Ljava/lang/String;")
    public String field9722;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field9718 = -1;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field9719 = 0;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Z")
    public static boolean field9720 = false;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Ltp;", line = 4)
    public static final class532 method3895(byte arg0, int arg1, int arg2) {
        field9721++;
        if (arg0 <= 120) {
            return null;
        }
        class532 var3 = class269.method1608((byte) -72, arg1);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field7632 == null || arg2 >= var3.field7632.length) {
            return null;
        } else {
            return var3.field7632[arg2];
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 39)
    public class689() {
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 41)
    public class689(String arg0, int arg1) {
        this.field9722 = arg0;
    }
}
