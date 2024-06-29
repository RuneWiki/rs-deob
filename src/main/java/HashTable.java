import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class HashTable {

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Ld;")
    public Linkable field98 = new Linkable();

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "()V")
    public HashTable() {
        this.field98.field41 = this.field98;
        this.field98.field42 = this.field98;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "()Ld;")
    public Linkable method63() {
        boolean var1 = DoublyLinkable.field44;
        Linkable var2 = this.field98.field41;
        if (this.field98 == var2) {
            return null;
        } else {
            var2.method23();
            if (var1) {
            }
            return var2;
        }
    }
}
