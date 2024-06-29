import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class238 {

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "J")
    public static long field3050;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lgi;")
    public static class480 field3045;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "[Lke;")
    public static class425[] field3048;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Lkn;")
    public static final class522 method1430(int arg0, int arg1, int arg2) {
        class490 var3 = class125.field1664[arg0][arg1][arg2];
        return var3 == null || var3.field7131 == null ? null : var3.field7131;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Z")
    public static final boolean method1431(int arg0) {
        field3049++;
        if (class295.field3780) {
            try {
                class114.method825("showVideoAd", 13324, class219.field2794.field6891);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 0) {
            field3045 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static void method1432(int arg0) {
        field3048 = null;
        field3045 = null;
        if (arg0 != -4790) {
            field3045 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public static final void method1433(byte arg0) {
        field3046++;
        if (arg0 != 60) {
            method1430(-7, -115, -48);
        }
        if (class5.field47 == null) {
            return;
        }
        if (class5.field47.field1628 == 1) {
            class5.field47 = null;
            return;
        }
        if (class5.field47.field1628 == 2) {
            class75.method649(class135.field1746, class362.field4670, -14861, 2);
            class5.field47 = null;
            return;
        }
    }

    static {
        new class335("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field3047 = 0;
        field3050 = 0L;
    }
}
