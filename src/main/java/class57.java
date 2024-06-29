import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class57 implements class117 {

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "Z")
    public static boolean field670 = false;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field672 = 0;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Ljn;")
    public static class134 field669 = new class134(24, 8);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "[[S")
    public static short[][] field668;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Lof;")
    public final class475 method473(int arg0) {
        if (arg0 != 6) {
            method474(-29);
        }
        field667++;
        return class777.field10690;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public static void method474(int arg0) {
        field669 = null;
        field668 = null;
        if (arg0 < 82) {
            method475(true, null);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V")
    public class57(int arg0) {
        this.field671 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method475(boolean arg0, String arg1) {
        field673++;
        if (arg1 == null) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            for (int var2 = 0; var2 < class302.field4404; var2++) {
                if (arg1.equalsIgnoreCase(class538.field7433[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class133.field1698[var2])) {
                    return true;
                }
            }
            return false;
        }
    }
}
