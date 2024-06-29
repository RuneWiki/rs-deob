import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class587 {

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field8513 = 0;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)Ljava/lang/String;", line = 5)
    public static final String method3403(int arg0) {
        field8512++;
        String var1 = "www";
        if (arg0 < 16) {
            field8513 = -35;
        }
        if (class215.field2737 == class175.field2159) {
            var1 = "www-wtrc";
        } else if (class697.field9874 == class215.field2737) {
            var1 = "www-wtqa";
        } else if (class231.field3012 == class215.field2737) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class190.field2323 != null) {
            var2 = "/p=" + class190.field2323;
        }
        return "http://" + var1 + "." + class588.field8518.field1259 + ".com/l=" + class370.field4980 + "/a=" + class171.field2092 + var2 + "/";
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)V", line = 38)
    public static final void method3404(int arg0, int arg1, int arg2) {
        field8511++;
        class233 var3 = class7.method44(arg2, arg0, -1);
        var3.method1422(0);
        var3.field3114 = arg1;
    }
}
