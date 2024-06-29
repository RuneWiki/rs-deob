import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RLKSHOQT")
public class class51 extends class15 {

    @OriginalMember(owner = "client!RLKSHOQT", name = "m", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!RLKSHOQT", name = "n", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!RLKSHOQT", name = "a", descriptor = "(I)LFCIDIKVY;")
    public final class19 method187(int arg0) {
        class1 var2 = class1.method7(this.field1508);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2.method1(this.field1507);
    }
}
