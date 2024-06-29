import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class153 extends class76 {

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field2887;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "Ljd;")
    public static class86 field2882 = class122.method868("Benutzen", true);

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "Ljd;")
    public static class86 field2888 = class122.method868("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", true);

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    public static int field2890 = -2;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "Lbj;")
    public static class151 field2886;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method392(int arg0) {
        if (arg0 != 0) {
            field2882 = null;
        }
        field2884++;
        return this.field2887;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Ljd;")
    public static final class86 method1118(int arg0, int arg1) {
        field2885++;
        return arg1 < arg0 ? class4.method26(false, arg1) : class79.field1544;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lbj;I)I")
    public static final int method1119(class151 arg0, int arg1) {
        field2889++;
        int var2 = 0;
        int var3 = -107 % ((arg1 + 6) / 62);
        if (arg0.method1096(-88, class43.field967)) {
            var2++;
        }
        if (arg0.method1096(-98, class45.field1015)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
    public static void method1120(boolean arg0) {
        if (arg0) {
            field2886 = null;
        }
        field2886 = null;
        field2888 = null;
        field2882 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class153(Object arg0) {
        this.field2887 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Z")
    public final boolean method391(boolean arg0) {
        if (!arg0) {
            method1120(false);
        }
        field2881++;
        return false;
    }
}
