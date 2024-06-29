import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class312 {

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "Lse;")
    public class169 field3985 = new class169();

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field3986 = 0;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field3984 = 0;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Lap;")
    public static class335 field3992 = new class335("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "Lse;")
    private class169 field3989;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)I")
    public final int method1828(byte arg0) {
        field3990++;
        int var2 = 0;
        class169 var3 = this.field3985.field2165;
        while (this.field3985 != var3) {
            var3 = var3.field2165;
            var2++;
        }
        if (arg0 <= 79) {
            this.method1828((byte) -110);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public final void method1829(int arg0) {
        if (arg0 != 19386) {
            return;
        }
        while (true) {
            class169 var2 = this.field3985.field2165;
            if (this.field3985 == var2) {
                field3988++;
                this.field3989 = null;
                return;
            }
            var2.method1083(false);
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Lse;")
    public final class169 method1830(int arg0) {
        if (arg0 >= -48) {
            method1831(22, 72);
        }
        field3983++;
        class169 var2 = this.field3989;
        if (this.field3985 == var2) {
            this.field3989 = null;
            return null;
        } else {
            this.field3989 = var2.field2165;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Z")
    public static final boolean method1831(int arg0, int arg1) {
        if (arg0 < 22) {
            method1831(116, -9);
        }
        field3982++;
        return arg1 == 0 || arg1 == 1;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)Lse;")
    public final class169 method1832(int arg0) {
        field3987++;
        class169 var2 = this.field3985.field2165;
        if (this.field3985 == var2) {
            this.field3989 = null;
            return null;
        } else if (arg0 == -2) {
            this.field3989 = var2.field2165;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class312() {
        this.field3985.field2169 = this.field3985;
        this.field3985.field2165 = this.field3985;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public static void method1833(boolean arg0) {
        field3992 = null;
        if (arg0) {
            field3986 = -5;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lse;B)V")
    public final void method1834(class169 arg0, byte arg1) {
        if (arg1 != 116) {
            return;
        }
        if (arg0.field2169 != null) {
            arg0.method1083(false);
        }
        field3991++;
        arg0.field2165 = this.field3985;
        arg0.field2169 = this.field3985.field2169;
        arg0.field2169.field2165 = arg0;
        arg0.field2165.field2169 = arg0;
    }
}
