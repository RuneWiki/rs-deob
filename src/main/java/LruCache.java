import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field289 = true;

    @OriginalMember(owner = "s", name = "b", descriptor = "Z")
    private boolean field290 = false;

    @OriginalMember(owner = "s", name = "e", descriptor = "Lt;")
    private HashTable field293 = new HashTable(3, 1024);

    @OriginalMember(owner = "s", name = "f", descriptor = "Lpb;")
    private DoublyLinkList field294 = new DoublyLinkList(4);

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field291 = arg1;
        this.field292 = arg1;
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Ldb;")
    public DoublyLinkable method103(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field293.method106(arg0);
        if (var3 != null) {
            this.field294.method240(var3);
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Ldb;JZ)V")
    public void method104(DoublyLinkable arg0, long arg1, boolean arg2) {
        if (arg2) {
            this.field289 = !this.field289;
        }
        if (this.field292 == 0) {
            DoublyLinkable var5 = this.field294.method241();
            var5.method108();
            var5.method120();
        } else {
            this.field292--;
        }
        this.field293.method107((byte) 6, arg1, arg0);
        this.field294.method240(arg0);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method105() {
        while (true) {
            DoublyLinkable var1 = this.field294.method241();
            if (var1 == null) {
                this.field292 = this.field291;
                return;
            }
            var1.method108();
            var1.method120();
        }
    }
}
