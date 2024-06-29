import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 extends class67 {

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Led;")
    public static class43 field457 = class191.method1219("Diese Betatest)2Welt ist nur f-Ur eingeladene", false);

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "Led;")
    public static class43 field461 = class191.method1219("Ung-Ultige Session)2ID)3", false);

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
    public static void method122(boolean arg0) {
        field457 = null;
        if (!arg0) {
            field461 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
    public class24(int arg0, int arg1) {
        this.field459 = arg0;
        this.field460 = arg1;
    }
}
