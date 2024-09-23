import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class LruCache {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field362 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "Z")
    private boolean field363 = false;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field364 = -5797;

    @OriginalMember(owner = "t", name = "g", descriptor = "Lx;")
    private DoublyLinkable field368 = new DoublyLinkable();

    @OriginalMember(owner = "t", name = "j", descriptor = "Lu;")
    private HashTable field371 = new HashTable(1024, 0);

    @OriginalMember(owner = "t", name = "k", descriptor = "Lqb;")
    private DoublyLinkList field372 = new DoublyLinkList(field365);

    @OriginalMember(owner = "t", name = "h", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "t", name = "i", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private static int field365 = 855;

    @OriginalMember(owner = "t", name = "e", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "t", name = "f", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(IB)V")
    public LruCache(int arg0, byte arg1) {
        if (arg1 == 3) {
            boolean var3 = false;
        } else {
            field365 = 110;
        }
        this.field369 = arg0;
        this.field370 = arg0;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lx;")
    public DoublyLinkable method114(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field371.method117(arg0);
        if (var3 == null) {
            this.field366++;
        } else {
            this.field372.method262(var3);
            this.field367++;
        }
        return var3;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(ZLx;J)V")
    public void method115(boolean arg0, DoublyLinkable arg1, long arg2) {
        if (this.field370 == 0) {
            DoublyLinkable var5 = this.field372.method263();
            var5.method119();
            var5.method120();
            if (this.field368 == var5) {
                DoublyLinkable var6 = this.field372.method263();
                var6.method119();
                var6.method120();
            }
        } else {
            this.field370--;
        }
        this.field371.method118(arg1, this.field364, arg2);
        this.field372.method262(arg1);
        if (arg0) {
            this.field362 = !this.field362;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "()V")
    public void method116() {
        while (true) {
            DoublyLinkable var1 = this.field372.method263();
            if (var1 == null) {
                this.field370 = this.field369;
                return;
            }
            var1.method119();
            var1.method120();
        }
    }
}
