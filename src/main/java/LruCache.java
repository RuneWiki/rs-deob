import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field343 = false;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field344 = -32;

    @OriginalMember(owner = "s", name = "e", descriptor = "Lw;")
    private DoublyLinkable field347 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "i", descriptor = "Lpb;")
    private DoublyLinkList field351 = new DoublyLinkList((byte) 5);

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "s", name = "h", descriptor = "Lt;")
    private HashTable field350;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(IB)V")
    public LruCache(int arg0, byte arg1) {
        this.field348 = arg0;
        this.field349 = arg0;
        this.field350 = new HashTable(1024, this.field344);
        if (arg1 != 1) {
            this.field343 = !this.field343;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field350.method104(arg0);
        if (var3 == null) {
            this.field345++;
        } else {
            this.field351.method253(var3);
            this.field346++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lw;IJ)V")
    public void method102(DoublyLinkable arg0, int arg1, long arg2) {
        if (this.field349 == 0) {
            DoublyLinkable var5 = this.field351.method254();
            var5.method106();
            var5.method107();
            if (this.field347 == var5) {
                DoublyLinkable var6 = this.field351.method254();
                var6.method106();
                var6.method107();
            }
        } else {
            this.field349--;
        }
        this.field350.method105(38, arg0, arg2);
        this.field351.method253(arg0);
        if (arg1 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field351.method254();
            if (var1 == null) {
                this.field349 = this.field348;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
