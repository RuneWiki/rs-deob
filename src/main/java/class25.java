import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class25 extends RuntimeException {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field622;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljava/lang/String;")
    public String field626;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lae;")
    private static class6 field621 = class64.method474(105, " from your friend list first");

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field627 = 0;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lae;")
    public static class6 field625 = field621;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lp;")
    public static class95 field629 = new class95();

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lae;")
    public static class6 field630 = class64.method474(126, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lae;")
    public static class6 field631 = class64.method474(106, "Einloggen");

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lbd;")
    public static class12 field632 = new class12(260);

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[Z")
    public static boolean[] field637 = new boolean[5];

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
    public static boolean field633 = false;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Lae;")
    private static class6 field635 = class64.method474(105, "Examine");

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lae;")
    public static class6 field636 = field635;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 8)
    public static void method229(byte arg0) {
        field621 = null;
        field635 = null;
        field630 = null;
        field632 = null;
        if (arg0 != 78) {
            field627 = -58;
        }
        field637 = null;
        field631 = null;
        field636 = null;
        field625 = null;
        field629 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 43)
    public static final void method230(boolean arg0) {
        class64.field1388 = null;
        class47.field1068 = null;
        class72.field1653 = null;
        class139.field3369 = null;
        if (arg0) {
            method229((byte) 11);
        }
        field628++;
        class103.field2429 = null;
        class58.field1251 = null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 61)
    public class25(Throwable arg0, String arg1) {
        this.field622 = arg0;
        this.field626 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V", line = 74)
    public static final void method231(byte arg0) {
        field623++;
        class81.field1964 = true;
        class40.method342((byte) -112);
        if (class126.field3086 != -1) {
            boolean var2 = class95.method784(261, 190, 0, class126.field3086, 0, -1, 1);
            if (!var2) {
                class139.field3380 = true;
            }
        } else if (class102.field2412[class68.field1493] != -1) {
            boolean var1 = class95.method784(261, 190, 0, class102.field2412[class68.field1493], 0, -1, 1);
            if (!var1) {
                class139.field3380 = true;
            }
        }
        if (arg0 != 44) {
            return;
        }
        if (class125.field3052 && class67.field1473 == 1) {
            if (class30.field732 == 1) {
                class68.method492(false);
            } else {
                class4.method20(94);
            }
        }
        class75.method600(8);
    }
}
