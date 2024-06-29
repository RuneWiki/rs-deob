import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class56 {

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
    public static int[] field1009 = new int[250];

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
    public static int[] field1006 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lbd;")
    public static class44 field1005 = new class44("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lnf;")
    public static class414 field1011;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZZ)Ljava/lang/String;")
    public static final String method478(int arg0, boolean arg1, boolean arg2) {
        field1012++;
        if (arg2) {
            return null;
        } else if (arg1 && arg0 >= 0) {
            return class20.method115((byte) 116, arg0, 10, arg1);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method479(int arg0) {
        if (arg0 != -1) {
            field1009 = null;
        }
        field1006 = null;
        field1009 = null;
        field1005 = null;
        field1011 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILqa;)V")
    public static final void method480(int arg0, class167 arg1) {
        field1008++;
        if (class248.field3714) {
            class239.method1579(arg1, true);
        } else {
            class389.method2351(arg1, 16);
        }
        if (arg0 != 15320) {
            field1010 = 50;
        }
    }
}
