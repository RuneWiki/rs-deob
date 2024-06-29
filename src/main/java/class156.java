import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class156 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Lag;")
    public static class640 field1837;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method957(int arg0) {
        if (arg0 != -15061) {
            method958(-67);
        }
        field1837 = null;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Lsba;")
    public static final class205 method958(int arg0) {
        field1838++;
        try {
            return arg0 == 2158 ? (class205) Class.forName("bca").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }
}
