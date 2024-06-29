import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class357 {

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public int field4744;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Lrg;")
    public static class596 field4732 = new class596(5, -1);

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Lem;")
    public static class206 field4740 = new class206(4, -1);

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4745 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public int field4741;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Llp;")
    public class357 field4733;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Lq;")
    public class392 field4734;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Lkl;")
    public static class70 field4739;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)Llp;")
    public final class357 method2045(int arg0, boolean arg1) {
        if (arg1) {
            method2046(true);
        }
        field4731++;
        return new class357(this.field4742, arg0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
    public static void method2046(boolean arg0) {
        field4740 = null;
        if (arg0) {
            field4732 = null;
            field4745 = null;
            field4739 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Lkba;")
    public final class91 method2047(int arg0) {
        if (arg0 == -1) {
            field4735++;
            return class402.method2344(this.field4742, (byte) 57);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z")
    public static final boolean method2048(byte arg0) {
        if (arg0 > -117) {
            return true;
        }
        field4738++;
        class251 var1 = (class251) class341.field4566.method1436(28964);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field3426; var2++) {
            if (var1.field3420[var2] != null && var1.field3420[var2].field948 == 0) {
                return false;
            }
            if (var1.field3429[var2] != null && var1.field3429[var2].field948 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(II)V")
    public class357(int arg0, int arg1) {
        this.field4742 = arg0;
        this.field4744 = arg1;
    }
}
