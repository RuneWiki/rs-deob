import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field352 = false;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field353 = 790;

    @OriginalMember(owner = "s", name = "e", descriptor = "Lw;")
    private DoublyLinkable field356 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "i", descriptor = "Lpb;")
    private DoublyLinkList field360 = new DoublyLinkList(0);

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "s", name = "h", descriptor = "Lt;")
    private HashTable field359;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(ZI)V")
    public LruCache(boolean arg0, int arg1) {
        this.field357 = arg1;
        this.field358 = arg1;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field359 = new HashTable(3, 1024);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field359.method104(arg0);
        if (var3 == null) {
            this.field354++;
        } else {
            this.field360.method253(var3);
            this.field355++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ZJLw;)V")
    public void method102(boolean arg0, long arg1, DoublyLinkable arg2) {
        if (this.field358 == 0) {
            DoublyLinkable var5 = this.field360.method254();
            var5.method106();
            var5.method107();
            if (this.field356 == var5) {
                DoublyLinkable var6 = this.field360.method254();
                var6.method106();
                var6.method107();
            }
        } else {
            this.field358--;
        }
        this.field359.method105(arg1, 7, arg2);
        this.field360.method253(arg2);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field360.method254();
            if (var1 == null) {
                this.field358 = this.field357;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
