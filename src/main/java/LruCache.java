import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field278 = 930;

    @OriginalMember(owner = "s", name = "e", descriptor = "Lt;")
    private HashTable field281 = new HashTable((byte) 1, 1024);

    @OriginalMember(owner = "s", name = "f", descriptor = "Lpb;")
    private DoublyLinkList field282 = new DoublyLinkList(0);

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field279 = arg1;
        this.field280 = arg1;
        if (arg0 != -24094) {
            this.field277 = !this.field277;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Ldb;")
    public DoublyLinkable method99(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field281.method102(arg0);
        if (var3 != null) {
            this.field282.method225(var3);
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JILdb;)V")
    public void method100(long arg0, int arg1, DoublyLinkable arg2) {
        int var5 = 94 / arg1;
        if (this.field280 == 0) {
            DoublyLinkable var6 = this.field282.method226();
            var6.method104();
            var6.method116();
        } else {
            this.field280--;
        }
        this.field281.method103(arg2, -99, arg0);
        this.field282.method225(arg2);
        if (Linkable.field289) {
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method101() {
        while (true) {
            DoublyLinkable var1 = this.field282.method226();
            if (var1 == null) {
                this.field280 = this.field279;
                return;
            }
            var1.method104();
            var1.method116();
        }
    }
}
