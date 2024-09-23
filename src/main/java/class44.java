import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PMWLDMKW")
public class class44 extends class6 {

    @OriginalMember(owner = "PMWLDMKW", name = "l", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "PMWLDMKW", name = "m", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "PMWLDMKW", name = "a", descriptor = "(B)LGEUHTGZJ;")
    public final class17 method221(byte arg0) {
        if (arg0 != -43) {
            throw new NullPointerException();
        }
        class15 var2 = class15.method278(this.field1250);
        return var2.method267(this.field1251);
    }
}
