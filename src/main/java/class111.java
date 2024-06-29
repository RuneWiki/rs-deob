import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class111 extends class230 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lnb;I)Lnb;")
    public final class225 method843(class225 arg0, int arg1) {
        if (arg1 >= -127) {
            this.method843(null, -31);
        }
        return new class357(arg0.field3179, arg0.method1395((byte) -124), arg0.field3180);
    }
}
