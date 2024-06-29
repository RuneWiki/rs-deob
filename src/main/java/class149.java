import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class149 extends class86 {

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "Z")
    public static boolean field2169 = false;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "Lpu;")
    public static class522 field2168;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)V")
    public static void method1059(int arg0) {
        field2168 = null;
        if (arg0 != -20203) {
            method1059(-124);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILda;ZI)Lnu;")
    public static final class548 method1060(int arg0, int arg1, class55 arg2, boolean arg3, int arg4) {
        field2170++;
        if (arg3) {
            field2168 = null;
        }
        return arg2 == null ? null : new class548(arg1, arg4, arg0, arg2.method507(), arg2.method512(), arg2.method544(), arg2.method488(), arg2.method534(), arg2.method531(), arg2.method524());
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)Lkg;")
    public static final class244 method1061(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        return var3 == null ? null : var3.field658;
    }
}
