import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VUGJZKVT")
public class class56 extends class20 {

    @OriginalMember(owner = "client!VUGJZKVT", name = "m", descriptor = "B")
    private byte field1564 = 2;

    @OriginalMember(owner = "client!VUGJZKVT", name = "o", descriptor = "Z")
    private boolean field1566 = false;

    @OriginalMember(owner = "client!VUGJZKVT", name = "n", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!VUGJZKVT", name = "p", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!VUGJZKVT", name = "a", descriptor = "(B)LFLXAIVEA;")
    public final class16 method190(byte arg0) {
        if (this.field1564 == arg0) {
            boolean var2 = false;
        } else {
            this.field1566 = !this.field1566;
        }
        class48 var3 = class48.method453(this.field1565);
        return var3.method455(this.field1567);
    }
}
