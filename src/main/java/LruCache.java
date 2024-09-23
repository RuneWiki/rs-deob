import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "d", descriptor = "Lt;")
    private HashTable field288 = new HashTable((byte) 84, 1024);

    @OriginalMember(owner = "s", name = "e", descriptor = "Lpb;")
    private DoublyLinkList field289 = new DoublyLinkList(463);

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field286 = arg1;
        this.field287 = arg1;
        if (arg0 != 17295) {
            this.field285 = 90;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Ldb;")
    public DoublyLinkable method101(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field288.method104(arg0);
        if (var3 != null) {
            this.field289.method232(var3);
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JLdb;B)V")
    public void method102(long arg0, DoublyLinkable arg1, byte arg2) {
        if (arg2 != 3) {
            return;
        }
        boolean var5 = false;
        if (this.field287 == 0) {
            DoublyLinkable var6 = this.field289.method233();
            var6.method106();
            var6.method118();
        } else {
            this.field287--;
        }
        this.field288.method105(arg0, -856, arg1);
        this.field289.method232(arg1);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method103() {
        while (true) {
            DoublyLinkable var1 = this.field289.method233();
            if (var1 == null) {
                this.field287 = this.field286;
                return;
            }
            var1.method106();
            var1.method118();
        }
    }
}
