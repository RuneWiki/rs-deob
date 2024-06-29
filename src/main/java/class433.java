import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class433 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lqt;")
    public static class459 field6207;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[[B")
    public static byte[][] field6206;

    static {
        new class44("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field6207 = new class459(10, 8);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Ljava/lang/String;", line = 3)
    public static final String method2563(int arg0, int arg1) {
        if (arg1 <= 61) {
            field6207 = null;
        }
        field6205++;
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF53) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Lvv;", line = 30)
    public static final class219 method2564(boolean arg0) {
        field6208++;
        if (!arg0) {
            method2563(-122, -3);
        }
        return class289.field4287 < class111.field1639.length ? class111.field1639[class289.field4287++] : null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 47)
    public static void method2565(int arg0) {
        if (arg0 != 0) {
            field6206 = null;
        }
        field6206 = null;
        field6207 = null;
    }
}
