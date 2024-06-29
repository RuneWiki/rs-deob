import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CCYSOVSO")
public class class6 extends class68 {

    @OriginalMember(owner = "client!CCYSOVSO", name = "l", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!CCYSOVSO", name = "m", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!CCYSOVSO", name = "a", descriptor = "(B)LKUGNQTGL;")
    public final class28 method40(byte arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        class34 var3 = class34.method390(this.field56);
        return var3.method381(this.field57);
    }
}
