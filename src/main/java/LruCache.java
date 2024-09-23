import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field346 = 7;

    @OriginalMember(owner = "s", name = "d", descriptor = "Lw;")
    private DoublyLinkable field349 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "h", descriptor = "Lpb;")
    private DoublyLinkList field353 = new DoublyLinkList(-39453);

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "s", name = "g", descriptor = "Lt;")
    private HashTable field352;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(BI)V")
    public LruCache(byte arg0, int arg1) {
        this.field350 = arg1;
        this.field351 = arg1;
        this.field352 = new HashTable(1024, -882);
        if (arg0 != 113) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field352.method104(arg0);
        if (var3 == null) {
            this.field347++;
        } else {
            this.field353.method253(var3);
            this.field348++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JZLw;)V")
    public void method102(long arg0, boolean arg1, DoublyLinkable arg2) {
        if (this.field351 == 0) {
            DoublyLinkable var5 = this.field353.method254();
            var5.method106();
            var5.method107();
            if (this.field349 == var5) {
                DoublyLinkable var6 = this.field353.method254();
                var6.method106();
                var6.method107();
            }
        } else {
            this.field351--;
        }
        this.field352.method105(arg0, 2, arg2);
        this.field353.method253(arg2);
        if (!arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field353.method254();
            if (var1 == null) {
                this.field351 = this.field350;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
