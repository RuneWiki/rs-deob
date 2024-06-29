import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class451 extends class350 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLp;)Lp;")
    public final class119 method2288(byte arg0, class119 arg1) {
        if (arg0 != 1) {
            this.method2288((byte) -17, (class119) null);
        }
        return new class206(arg1.field1637, arg1.method863((byte) -115));
    }
}
