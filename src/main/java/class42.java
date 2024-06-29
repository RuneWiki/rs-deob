import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class42 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/lang/String;")
    public static String field618 = " ";

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lga;")
    public static class141[] field625 = new class141[32768];

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lvh;")
    public static class108 field619;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Ljava/lang/String;")
    public String field624;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
    public static int[] field620;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ldl;III)V")
    public static final void method274(class46 arg0, int arg1, int arg2, int arg3) {
        field622++;
        if (class6.field76 != null || class248.field4074 || arg0 == null || class125.method854((byte) 126, arg0) == null) {
            return;
        }
        class6.field76 = arg0;
        class187.field3030 = class125.method854((byte) 118, arg0);
        class270.field4344 = false;
        class156.field2616 = arg2;
        class26.field394 = arg1;
        class290.field4622 = arg3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method275(int arg0) {
        field625 = null;
        field618 = null;
        field619 = null;
        field620 = null;
        if (arg0 != 0) {
            field625 = null;
        }
    }
}
