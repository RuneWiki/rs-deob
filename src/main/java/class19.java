import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lec;")
    public static class32 field361 = class73.method594("_", true);

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lec;")
    public static class32 field362 = class73.method594("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", true);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lec;")
    private static class32 field358 = class73.method594("Please check your message)2centre for details)3", true);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lec;")
    public static class32 field359 = field358;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lea;")
    public static class30 field363;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method133(int arg0) {
        field362 = null;
        if (arg0 >= 100) {
            field363 = null;
            field358 = null;
            field361 = null;
            field359 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lea;Lea;ZLnf;B)V")
    public static final void method134(class30 arg0, class30 arg1, boolean arg2, class96 arg3, byte arg4) {
        class41.field963 = arg1;
        class33.field693 = arg0;
        if (arg4 < 57) {
            method133(-21);
        }
        class11.field193 = arg2;
        class41.field963.method200((byte) 53, 10);
        field360++;
        class54.field1279 = arg3;
    }
}
