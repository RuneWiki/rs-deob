import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class LruCache {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field358 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field359 = 2;

    @OriginalMember(owner = "t", name = "e", descriptor = "Lx;")
    private DoublyLinkable field362 = new DoublyLinkable();

    @OriginalMember(owner = "t", name = "h", descriptor = "Lu;")
    private HashTable field365 = new HashTable(1024, 0);

    @OriginalMember(owner = "t", name = "i", descriptor = "Lqb;")
    private DoublyLinkList field366 = new DoublyLinkList(true);

    @OriginalMember(owner = "t", name = "f", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "t", name = "g", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field363 = arg1;
        this.field364 = arg1;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lx;")
    public DoublyLinkable method115(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field365.method118(arg0);
        if (var3 == null) {
            this.field360++;
        } else {
            this.field366.method263(var3);
            this.field361++;
        }
        return var3;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(IJLx;)V")
    public void method116(int arg0, long arg1, DoublyLinkable arg2) {
        if (arg0 >= 0) {
            return;
        }
        if (this.field364 == 0) {
            DoublyLinkable var5 = this.field366.method264();
            var5.method120();
            var5.method121();
            if (this.field362 == var5) {
                DoublyLinkable var6 = this.field366.method264();
                var6.method120();
                var6.method121();
            }
        } else {
            this.field364--;
        }
        this.field365.method119(arg2, this.field359, arg1);
        this.field366.method263(arg2);
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "()V")
    public void method117() {
        while (true) {
            DoublyLinkable var1 = this.field366.method264();
            if (var1 == null) {
                this.field364 = this.field363;
                return;
            }
            var1.method120();
            var1.method121();
        }
    }
}
