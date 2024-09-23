import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field281 = 733;

    @OriginalMember(owner = "s", name = "b", descriptor = "Z")
    private boolean field282 = true;

    @OriginalMember(owner = "s", name = "e", descriptor = "Lt;")
    private HashTable field285 = new HashTable(1024, 0);

    @OriginalMember(owner = "s", name = "f", descriptor = "Lpb;")
    private DoublyLinkList field286 = new DoublyLinkList(false);

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field283 = arg0;
        if (arg1 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field284 = arg0;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Ldb;")
    public DoublyLinkable method102(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field285.method105(arg0);
        if (var3 != null) {
            this.field286.method233(var3);
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(ILdb;J)V")
    public void method103(int arg0, DoublyLinkable arg1, long arg2) {
        if (this.field284 == 0) {
            DoublyLinkable var5 = this.field286.method234();
            var5.method107();
            var5.method119();
        } else {
            this.field284--;
        }
        this.field285.method106(arg1, arg2, false);
        if (arg0 != 3) {
            this.field282 = !this.field282;
        }
        this.field286.method233(arg1);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method104() {
        while (true) {
            DoublyLinkable var1 = this.field286.method234();
            if (var1 == null) {
                this.field284 = this.field283;
                return;
            }
            var1.method107();
            var1.method119();
        }
    }
}
