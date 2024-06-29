import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UTHWSBEX")
public class class61 extends class58 {

    @OriginalMember(owner = "client!UTHWSBEX", name = "n", descriptor = "I")
    private int field1495 = 964;

    @OriginalMember(owner = "client!UTHWSBEX", name = "m", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!UTHWSBEX", name = "o", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!UTHWSBEX", name = "a", descriptor = "(I)LOJGAHFXC;")
    public final class41 method1(int arg0) {
        class31 var2 = class31.method376(this.field1496);
        if (arg0 <= 0) {
            this.field1495 = 484;
        }
        return var2.method370(this.field1494);
    }
}
