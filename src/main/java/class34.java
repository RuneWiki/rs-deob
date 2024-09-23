import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JGSTQLRC")
public class class34 extends class4 {

    @OriginalMember(owner = "JGSTQLRC", name = "l", descriptor = "Z")
    private boolean field1010 = true;

    @OriginalMember(owner = "JGSTQLRC", name = "m", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "JGSTQLRC", name = "n", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "JGSTQLRC", name = "a", descriptor = "(I)LIGXVZOHI;")
    public final class32 method25(int arg0) {
        if (arg0 != 47492) {
            this.field1010 = !this.field1010;
        }
        class65 var2 = class65.method560(this.field1012);
        return var2.method557(this.field1011);
    }
}
