import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class697 extends class131 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLrba;)Lrba;")
    public final class113 method836(byte arg0, class113 arg1) {
        if (arg0 != 1) {
            this.method836((byte) -33, null);
        }
        return new class481(arg1.field1395, arg1.method764(arg0 ^ 0x7A), arg1.field1390);
    }
}
