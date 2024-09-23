import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field346 = true;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field347 = 10514;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field348 = 18835;

    @OriginalMember(owner = "s", name = "f", descriptor = "Lw;")
    private DoublyLinkable field351 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "j", descriptor = "Lpb;")
    private DoublyLinkList field355 = new DoublyLinkList(true);

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "s", name = "h", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "s", name = "i", descriptor = "Lt;")
    private HashTable field354;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field352 = arg1;
        this.field353 = arg1;
        if (arg0 >= 0) {
            this.field348 = 438;
        }
        this.field354 = new HashTable(-143, 1024);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field354.method104(arg0);
        if (var3 == null) {
            this.field349++;
        } else {
            this.field355.method253(var3);
            this.field350++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JLw;I)V")
    public void method102(long arg0, DoublyLinkable arg1, int arg2) {
        if (this.field347 != arg2) {
            this.field346 = !this.field346;
        }
        if (this.field353 == 0) {
            DoublyLinkable var5 = this.field355.method254();
            var5.method106();
            var5.method107();
            if (this.field351 == var5) {
                DoublyLinkable var6 = this.field355.method254();
                var6.method106();
                var6.method107();
            }
        } else {
            this.field353--;
        }
        this.field354.method105(arg1, 944, arg0);
        this.field355.method253(arg1);
        if (Linkable.field363) {
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field355.method254();
            if (var1 == null) {
                this.field353 = this.field352;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
