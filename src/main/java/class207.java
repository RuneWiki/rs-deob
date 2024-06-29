import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class207 extends RuntimeException {

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3753;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Ljava/lang/String;")
    public String field3748;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Z")
    public static boolean field3745 = false;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Loh;")
    private static class263 field3742 = class253.method1681(-124, "Loaded textures");

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Loh;")
    private static class263 field3744 = class253.method1681(-123, "Opened title screen");

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field3754 = 0;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Loh;")
    public static class263 field3746 = field3744;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Loh;")
    public static class263 field3750 = field3742;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lue;")
    public static class86 field3751;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[Lbb;")
    public static class88[] field3749;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1428(int arg0) {
        field3746 = null;
        field3750 = null;
        field3751 = null;
        field3744 = null;
        if (arg0 != -16828) {
            method1428(-102);
        }
        field3749 = null;
        field3742 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class207(Throwable arg0, String arg1) {
        this.field3753 = arg0;
        this.field3748 = arg1;
    }
}
