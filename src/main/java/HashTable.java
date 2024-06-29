import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class HashTable {

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "Lc;")
    public Linkable field90 = new Linkable();

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "()V")
    public HashTable() {
        this.field90.field33 = this.field90;
        this.field90.field34 = this.field90;
    }
}
