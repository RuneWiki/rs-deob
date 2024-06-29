import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 extends class12 {

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Lad;")
    public static class5 field328 = class88.method674("sideicons", -128);

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "Lad;")
    public static class5 field334 = class88.method674("rot:", -108);

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field333 = -1;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "[I")
    public static int[] field339 = new int[100];

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "Lad;")
    private static class5 field335 = class88.method674("Enter name of friend to delete from list", 37);

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Lad;")
    public static class5 field338 = field335;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "Lad;")
    private static class5 field342 = class88.method674("Press (Wchange your password(W on front page)3", -80);

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "Z")
    public static boolean field341 = false;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Lad;")
    public static class5 field332 = field342;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Luc;")
    public static class123 field337;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "Lee;")
    public static class30 field327;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Lad;")
    public class5 field336;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V", line = 48)
    public static final void method104(boolean arg0) {
        if (class98.field2375 != null) {
            class98.field2375.method433();
            class98.field2375 = null;
        }
        field340++;
        if (arg0) {
            field337 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 71)
    public static void method105(int arg0) {
        if (arg0 != -1) {
            field339 = null;
        }
        field334 = null;
        field335 = null;
        field342 = null;
        field332 = null;
        field337 = null;
        field328 = null;
        field327 = null;
        field338 = null;
        field339 = null;
    }
}
