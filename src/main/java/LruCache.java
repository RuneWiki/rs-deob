import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class LruCache {

    @OriginalMember(owner = "s", name = "a", descriptor = "Z")
    private boolean field282 = false;

    @OriginalMember(owner = "s", name = "e", descriptor = "Lt;")
    private HashTable field286 = new HashTable(9, 1024);

    @OriginalMember(owner = "s", name = "f", descriptor = "Lpb;")
    private DoublyLinkList field287 = new DoublyLinkList(field283);

    @OriginalMember(owner = "s", name = "c", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "s", name = "d", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private static int field283 = 5;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(BI)V")
    public LruCache(byte arg0, int arg1) {
        this.field284 = arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field285 = arg1;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Ldb;")
    public DoublyLinkable method103(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field286.method106(arg0);
        if (var3 != null) {
            this.field287.method240(var3);
        }
        return var3;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(IJLdb;)V")
    public void method104(int arg0, long arg1, DoublyLinkable arg2) {
        if (this.field285 == 0) {
            DoublyLinkable var5 = this.field287.method241();
            var5.unlink();
            var5.unlink2();
        } else {
            this.field285--;
        }
        this.field286.method107(arg1, -566, arg2);
        if (arg0 < 6 || arg0 > 6) {
            this.field282 = !this.field282;
        }
        this.field287.method240(arg2);
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public void method105() {
        while (true) {
            DoublyLinkable var1 = this.field287.method241();
            if (var1 == null) {
                this.field285 = this.field284;
                return;
            }
            var1.unlink();
            var1.unlink2();
        }
    }
}
