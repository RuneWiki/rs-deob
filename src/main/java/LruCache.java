import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field351 = true;

    @OriginalMember(owner = "s", name = "d", descriptor = "Lw;")
    private DoublyLinkable field354 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "h", descriptor = "Lpb;")
    private DoublyLinkList field358 = new DoublyLinkList(-5693);

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "s", name = "g", descriptor = "Lt;")
    private HashTable field357;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(IZ)V")
    public LruCache(int arg0, boolean arg1) {
        this.field355 = arg0;
        this.field356 = arg0;
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field357 = new HashTable(532, 1024);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field357.method104(arg0);
        if (var3 == null) {
            this.field352++;
        } else {
            this.field358.method253(var3);
            this.field353++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JILw;)V")
    public void method102(long arg0, int arg1, DoublyLinkable arg2) {
        if (this.field356 == 0) {
            DoublyLinkable var5 = this.field358.method254();
            var5.method106();
            var5.method107();
            if (this.field354 == var5) {
                DoublyLinkable var6 = this.field358.method254();
                var6.method106();
                var6.method107();
            }
        } else {
            this.field356--;
        }
        this.field357.method105(arg0, arg2, 0);
        this.field358.method253(arg2);
        if (arg1 < 0 && Linkable.field368) {
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field358.method254();
            if (var1 == null) {
                this.field356 = this.field355;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
