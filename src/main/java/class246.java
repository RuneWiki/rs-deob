import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class246 extends class508 {

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public volatile int field3152 = -1;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Ljava/lang/String;")
    public volatile String field3148;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field3153;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "Lum;")
    public static class82 field3151;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "Lqd;")
    public static class277 field3154;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V")
    public static void method1536(byte arg0) {
        field3151 = null;
        field3154 = null;
        if (arg0 != -80) {
            field3154 = null;
        }
        field3153 = null;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class246(String arg0) {
        this.field3148 = arg0;
    }

    static {
        new class169("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field3149 = -1;
        field3150 = 0;
        field3153 = new String[100];
        field3151 = new class82("LIVE", 0);
    }
}
