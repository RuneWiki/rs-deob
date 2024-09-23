import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field344 = false;

    @OriginalMember(owner = "s", name = "d", descriptor = "Lw;")
    private DoublyLinkable field347 = new DoublyLinkable();

    @OriginalMember(owner = "s", name = "h", descriptor = "Lpb;")
    private DoublyLinkList field351 = new DoublyLinkList(false);

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "s", name = "f", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "s", name = "g", descriptor = "Lt;")
    private HashTable field350;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(ZI)V")
    public LruCache(boolean arg0, int arg1) {
        this.field348 = arg1;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field349 = arg1;
        this.field350 = new HashTable(1024, 26228);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lw;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field350.method104(arg0);
        if (var3 == null) {
            this.field345++;
        } else {
            this.field351.method249(var3);
            this.field346++;
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ILw;J)V")
    public void method102(int arg0, DoublyLinkable arg1, long arg2) {
        if (this.field349 == 0) {
            DoublyLinkable var5 = this.field351.method250();
            var5.method106();
            var5.method107();
            if (this.field347 == var5) {
                DoublyLinkable var6 = this.field351.method250();
                var6.method106();
                var6.method107();
            }
        } else {
            this.field349--;
        }
        this.field350.method105(arg1, arg2, 4);
        int var7 = 69 / arg0;
        this.field351.method249(arg1);
        if (Linkable.field360) {
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field351.method250();
            if (var1 == null) {
                this.field349 = this.field348;
                return;
            }
            var1.method106();
            var1.method107();
        }
    }
}
