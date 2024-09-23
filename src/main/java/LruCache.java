import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field352 = -652;

    @OriginalMember(owner = "s", name = "b", descriptor = "Z")
    private boolean field353 = true;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field354 = -1399;

    @OriginalMember(owner = "s", name = "f", descriptor = "Lw;")
    private DoublyLinkable field357 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "j", descriptor = "Lpb;")
    private DoublyLinkList field361 = new DoublyLinkList(49694);

    @OriginalMember(owner = "s", name = "g", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "s", name = "h", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "s", name = "i", descriptor = "Lt;")
    private HashTable field360;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(IZ)V")
    public LruCache(int arg0, boolean arg1) {
        this.field358 = arg0;
        this.field359 = arg0;
        this.field360 = new HashTable(1024, -266);
        if (arg1) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field360.method104(arg0);
        if (var3 == null) {
            this.field355++;
        } else {
            this.field361.method253(var3);
            this.field356++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lw;JZ)V")
    public void method102(DoublyLinkable arg0, long arg1, boolean arg2) {
        if (this.field359 == 0) {
            DoublyLinkable var5 = this.field361.method254();
            var5.method106();
            var5.method107();
            if (this.field357 == var5) {
                DoublyLinkable var6 = this.field361.method254();
                var6.method106();
                var6.method107();
            }
        } else {
            this.field359--;
        }
        this.field360.method105(true, arg1, arg0);
        if (arg2) {
            this.field361.method253(arg0);
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field361.method254();
            if (var1 == null) {
                this.field359 = this.field358;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
