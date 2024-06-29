import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XMCAJXJH")
public class class67 extends class21 {

    @OriginalMember(owner = "client!XMCAJXJH", name = "m", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!XMCAJXJH", name = "n", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!XMCAJXJH", name = "a", descriptor = "(I)LHEQROJXW;")
    public final class27 method1(int arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        class32 var2 = class32.method380(this.field1625);
        return var2.method381(this.field1626);
    }
}
