import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NOAOCJCI")
public class class39 extends class44 {

    @OriginalMember(owner = "client!NOAOCJCI", name = "l", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!NOAOCJCI", name = "m", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!NOAOCJCI", name = "a", descriptor = "(I)LVHYCWIPJ;")
    public final class53 method217(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        class2 var2 = class2.method4(this.field1070);
        return var2.method1(this.field1069);
    }
}
