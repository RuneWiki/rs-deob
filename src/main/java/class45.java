import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QXUWKDGL")
public class class45 extends class3 {

    @OriginalMember(owner = "client!QXUWKDGL", name = "m", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!QXUWKDGL", name = "n", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!QXUWKDGL", name = "a", descriptor = "(Z)LGCSAWSJV;")
    public final class16 method8(boolean arg0) {
        class34 var2 = class34.method346(this.field1229);
        if (arg0) {
            throw new NullPointerException();
        }
        return var2.method350(this.field1230);
    }
}
