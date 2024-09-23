import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field287 = false;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field288 = -241;

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field289 = 9;

    @OriginalMember(owner = "s", name = "f", descriptor = "Lt;")
    private HashTable field292 = new HashTable(1024, 0);

    @OriginalMember(owner = "s", name = "g", descriptor = "Lpb;")
    private DoublyLinkList field293 = new DoublyLinkList(547);

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "s", name = "e", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field290 = arg1;
        this.field291 = arg1;
        if (arg0 != 2) {
            this.field289 = 110;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Ldb;")
    public DoublyLinkable method102(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field292.method105(arg0);
        if (var3 != null) {
            this.field293.method233(var3);
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Ldb;JI)V")
    public void method103(DoublyLinkable arg0, long arg1, int arg2) {
        if (this.field291 == 0) {
            DoublyLinkable var5 = this.field293.method234();
            var5.method107();
            var5.method119();
        } else {
            this.field291--;
        }
        this.field292.method106(arg1, arg0, this.field288);
        this.field293.method233(arg0);
        if (arg2 != -21658) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method104() {
        while (true) {
            DoublyLinkable var1 = this.field293.method234();
            if (var1 == null) {
                this.field291 = this.field290;
                return;
            }
            var1.method107();
            var1.method119();
        }
    }
}
