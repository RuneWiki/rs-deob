import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class LruCache {

    @OriginalMember(owner = "t", name = "c", descriptor = "Lx;")
    private DoublyLinkable field360 = new DoublyLinkable();

    @OriginalMember(owner = "t", name = "f", descriptor = "Lu;")
    private HashTable field363 = new HashTable(3, 1024);

    @OriginalMember(owner = "t", name = "g", descriptor = "Lqb;")
    private DoublyLinkList field364 = new DoublyLinkList(526);

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "t", name = "e", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        this.field361 = arg0;
        this.field362 = arg0;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lx;")
    public DoublyLinkable method114(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field363.method117(arg0);
        if (var3 == null) {
            this.field358++;
        } else {
            this.field364.method262(var3);
            this.field359++;
        }
        return var3;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lx;JI)V")
    public void method115(DoublyLinkable arg0, long arg1, int arg2) {
        if (this.field362 == 0) {
            DoublyLinkable var5 = this.field364.method263();
            var5.method119();
            var5.method120();
            if (this.field360 == var5) {
                DoublyLinkable var6 = this.field364.method263();
                var6.method119();
                var6.method120();
            }
        } else {
            this.field362--;
        }
        this.field363.method118(5, arg1, arg0);
        if (arg2 == 39399) {
            this.field364.method262(arg0);
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "()V")
    public void method116() {
        while (true) {
            DoublyLinkable var1 = this.field364.method263();
            if (var1 == null) {
                this.field362 = this.field361;
                return;
            }
            var1.method119();
            var1.method120();
        }
    }
}
