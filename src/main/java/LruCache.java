import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field345 = 7228;

    @OriginalMember(owner = "s", name = "b", descriptor = "Z")
    private boolean field346 = false;

    @OriginalMember(owner = "s", name = "c", descriptor = "Z")
    private boolean field347 = false;

    @OriginalMember(owner = "s", name = "f", descriptor = "Lw;")
    private DoublyLinkable field350 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "j", descriptor = "Lpb;")
    private DoublyLinkList field354 = new DoublyLinkList((byte) 8);

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "s", name = "h", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "s", name = "i", descriptor = "Lt;")
    private HashTable field353;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field351 = arg0;
        this.field352 = arg0;
        if (arg1 != 0) {
            this.field347 = !this.field347;
        }
        this.field353 = new HashTable(1024, this.field345);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field353.method104(arg0);
        if (var3 == null) {
            this.field348++;
        } else {
            this.field354.method248(var3);
            this.field349++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IJLw;)V")
    public void method102(int arg0, long arg1, DoublyLinkable arg2) {
        int var5 = 72 / arg0;
        if (this.field352 == 0) {
            DoublyLinkable var6 = this.field354.method249();
            var6.method106();
            var6.method107();
            if (this.field350 == var6) {
                DoublyLinkable var7 = this.field354.method249();
                var7.method106();
                var7.method107();
            }
        } else {
            this.field352--;
        }
        this.field353.method105(true, arg1, arg2);
        this.field354.method248(arg2);
        if (Linkable.field365) {
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field354.method249();
            if (var1 == null) {
                this.field352 = this.field351;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
