import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class124 extends class134 {

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Ljava/lang/String;")
    public String field2099;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field2095 = -1;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "S")
    public static short field2094 = 1;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2098 = "flash2:";

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Laj;")
    public static class151 field2096;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "Lvf;")
    public static class156 field2097;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    public static void method935(int arg0) {
        field2097 = null;
        field2096 = null;
        if (arg0 != 1) {
            field2097 = null;
        }
        field2098 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILdl;I)V")
    public static final void method936(int arg0, class123 arg1, int arg2) {
        if (arg0 > -30) {
            field2097 = null;
        }
        field2093++;
        class253 var3 = (class253) class259.field4355.method987(-118, (long) arg2);
        if (var3 == null) {
            return;
        }
        if (var3.field4289 != null) {
            class278.field4627.method113(var3.field4289);
            var3.field4289 = null;
        }
        var3.method993(32);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class124() {
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class124(String arg0, int arg1) {
        this.field2099 = arg0;
    }
}
