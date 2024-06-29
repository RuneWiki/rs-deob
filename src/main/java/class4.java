import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BOFPAALI")
public class class4 extends class12 {

    @OriginalMember(owner = "client!BOFPAALI", name = "n", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!BOFPAALI", name = "o", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!BOFPAALI", name = "a", descriptor = "(I)LIEHKDFMR;")
    public final class18 method24(int arg0) {
        class54 var2 = class54.method447(this.field117);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var2.method456(this.field116);
    }
}
