import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field287 = -9908;

    @OriginalMember(owner = "s", name = "f", descriptor = "Lt;")
    private HashTable field291 = new HashTable(field288, 1024);

    @OriginalMember(owner = "s", name = "g", descriptor = "Lpb;")
    private DoublyLinkList field292 = new DoublyLinkList(35274);

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private static int field288 = 12;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(IB)V")
    public LruCache(int arg0, byte arg1) {
        this.field289 = arg0;
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            this.field286 = -314;
        }
        this.field290 = arg0;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Ldb;")
    public DoublyLinkable method102(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field291.method105(arg0);
        if (var3 != null) {
            this.field292.method233(var3);
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JILdb;)V")
    public void method103(long arg0, int arg1, DoublyLinkable arg2) {
        if (this.field290 == 0) {
            DoublyLinkable var5 = this.field292.method234();
            var5.method107();
            var5.method119();
        } else {
            this.field290--;
        }
        this.field291.method106(7, arg0, arg2);
        if (arg1 == 1567) {
            this.field292.method233(arg2);
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method104() {
        while (true) {
            DoublyLinkable var1 = this.field292.method234();
            if (var1 == null) {
                this.field290 = this.field289;
                return;
            }
            var1.method107();
            var1.method119();
        }
    }
}
