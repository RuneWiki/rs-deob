import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field348 = -276;

    @OriginalMember(owner = "s", name = "b", descriptor = "Z")
    private boolean field349 = false;

    @OriginalMember(owner = "s", name = "e", descriptor = "Lw;")
    private DoublyLinkable field352 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "i", descriptor = "Lpb;")
    private DoublyLinkList field356 = new DoublyLinkList(true);

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "s", name = "h", descriptor = "Lt;")
    private HashTable field355;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(BI)V")
    public LruCache(byte arg0, int arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        this.field353 = arg1;
        this.field354 = arg1;
        this.field355 = new HashTable((byte) 10, 1024);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field355.method104(arg0);
        if (var3 == null) {
            this.field350++;
        } else {
            this.field356.method253(var3);
            this.field351++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JILw;)V")
    public void method102(long arg0, int arg1, DoublyLinkable arg2) {
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field354 == 0) {
            DoublyLinkable var6 = this.field356.method254();
            var6.method106();
            var6.method107();
            if (this.field352 == var6) {
                DoublyLinkable var7 = this.field356.method254();
                var7.method106();
                var7.method107();
            }
        } else {
            this.field354--;
        }
        this.field355.method105(arg2, arg0, 32735);
        this.field356.method253(arg2);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field356.method254();
            if (var1 == null) {
                this.field354 = this.field353;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
