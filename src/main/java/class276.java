import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class276 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lph;")
    public static class319[] field4208 = new class319[6];

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Loa;")
    public static class149 field4209 = new class149(16);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public static final void method1710(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field167 != null) {
            var3.field167 = null;
        }
        if (var3.field163 != null) {
            var3.field163 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method1711(int arg0) {
        field4209 = null;
        if (arg0 > -63) {
            method1711(84);
        }
        field4208 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
    public static int method1712(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
