import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class446 extends class439 {

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)J")
    public final long method2053(int arg0) {
        if (arg0 != 1) {
            this.method2053(76);
        }
        return class554.method3190(arg0 ^ 0xFFFFFF8E) * 1000000L;
    }
}
