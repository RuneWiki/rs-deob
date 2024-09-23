import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class LruCache {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field348 = 2;

    @OriginalMember(owner = "t", name = "b", descriptor = "Z")
    private boolean field349 = true;

    @OriginalMember(owner = "t", name = "e", descriptor = "Lx;")
    private DoublyLinkable field352 = new DoublyLinkable();

    @OriginalMember(owner = "t", name = "h", descriptor = "Lu;")
    private HashTable field355 = new HashTable(1024, 8);

    @OriginalMember(owner = "t", name = "i", descriptor = "Lqb;")
    private DoublyLinkList field356 = new DoublyLinkList(309);

    @OriginalMember(owner = "t", name = "f", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "t", name = "g", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(ZI)V")
    public LruCache(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field353 = arg1;
        this.field354 = arg1;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lx;")
    public DoublyLinkable method113(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field355.method116(arg0);
        if (var3 == null) {
            this.field350++;
        } else {
            this.field356.method255(var3);
            this.field351++;
        }
        return var3;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(JZLx;)V")
    public void method114(long arg0, boolean arg1, DoublyLinkable arg2) {
        if (this.field354 == 0) {
            DoublyLinkable var5 = this.field356.method256();
            var5.method118();
            var5.method119();
            if (this.field352 == var5) {
                DoublyLinkable var6 = this.field356.method256();
                var6.method118();
                var6.method119();
            }
        } else {
            this.field354--;
        }
        this.field355.method117(-12119, arg0, arg2);
        if (!arg1) {
            this.field349 = !this.field349;
        }
        this.field356.method255(arg2);
        if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "()V")
    public void method115() {
        while (true) {
            DoublyLinkable var1 = this.field356.method256();
            if (var1 == null) {
                this.field354 = this.field353;
                return;
            }
            var1.method118();
            var1.method119();
        }
    }
}
