import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class48 extends class154 {

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Loh;")
    public class258 field717;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Loh;")
    public static class258 field718 = class153.method1046("(U0a )2 non)2existant gosub script)2num: ", 95);

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Loh;")
    public static class258 field721 = class153.method1046("::noclip", 99);

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Z")
    public static boolean field722 = false;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field725 = 0;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Loh;")
    public static class258 field719 = class153.method1046(")3", 89);

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "Ls;")
    public static class171 field726 = null;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "[Z")
    public static boolean[] field720;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Lci;", line = 9)
    public static final class286 method389(int arg0, int arg1, int arg2) {
        class286 var3 = (class286) class83.field1406.method986((long) arg0 | (long) arg1 << 32, arg2 - 10738);
        field727++;
        if (arg2 != 10738) {
            return (class286) null;
        }
        if (var3 == null) {
            var3 = new class286(arg1, arg0);
            class83.field1406.method984((byte) -84, var3, var3.field2642);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)V", line = 28)
    public static void method390(boolean arg0) {
        field718 = null;
        field726 = null;
        field719 = null;
        if (!arg0) {
            field720 = null;
            field721 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)I", line = 48)
    public static final int method391(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field724++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else {
            if (arg0 >= -45) {
                field721 = (class258) null;
            }
            return var4 == 2 ? 7 - arg3 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 72)
    public class48() {
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Loh;)V", line = 100)
    public class48(class258 arg0) {
        this.field717 = arg0;
    }
}
