import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field344 = true;

    @OriginalMember(owner = "s", name = "b", descriptor = "Z")
    private boolean field345 = false;

    @OriginalMember(owner = "s", name = "e", descriptor = "Lw;")
    private DoublyLinkable field348 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "i", descriptor = "Lpb;")
    private DoublyLinkList field352 = new DoublyLinkList(9);

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "s", name = "h", descriptor = "Lt;")
    private HashTable field351;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(BI)V")
    public LruCache(byte arg0, int arg1) {
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            this.field344 = !this.field344;
        }
        this.field349 = arg1;
        this.field350 = arg1;
        this.field351 = new HashTable(1024, (byte) 124);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field351.method104(arg0);
        if (var3 == null) {
            this.field346++;
        } else {
            this.field352.method251(var3);
            this.field347++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JBLw;)V")
    public void method102(long arg0, byte arg1, DoublyLinkable arg2) {
        if (arg1 != 76) {
            return;
        }
        if (this.field350 == 0) {
            DoublyLinkable var5 = this.field352.method252();
            var5.method106();
            var5.method107();
            if (this.field348 == var5) {
                DoublyLinkable var6 = this.field352.method252();
                var6.method106();
                var6.method107();
            }
        } else {
            this.field350--;
        }
        this.field351.method105(false, arg2, arg0);
        this.field352.method251(arg2);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field352.method252();
            if (var1 == null) {
                this.field350 = this.field349;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
