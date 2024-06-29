import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Entity extends Linkable {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    private int field278 = 90;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Ldb;")
    public Model method90(int arg0) {
        if (arg0 != 0) {
            this.field278 = -78;
        }
        return null;
    }
}
