import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class LruCache {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field359 = true;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field360 = -589;

    @OriginalMember(owner = "t", name = "c", descriptor = "B")
    private byte field361 = 67;

    @OriginalMember(owner = "t", name = "f", descriptor = "Lx;")
    private DoublyLinkable field364 = new DoublyLinkable();

    @OriginalMember(owner = "t", name = "i", descriptor = "Lu;")
    private HashTable field367 = new HashTable(1024, (byte) 1);

    @OriginalMember(owner = "t", name = "j", descriptor = "Lqb;")
    private DoublyLinkList field368 = new DoublyLinkList(2);

    @OriginalMember(owner = "t", name = "g", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "t", name = "h", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "t", name = "e", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field359 = !this.field359;
        }
        this.field365 = arg0;
        this.field366 = arg0;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lx;")
    public DoublyLinkable method115(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field367.method118(arg0);
        if (var3 == null) {
            this.field362++;
        } else {
            this.field368.method263(var3);
            this.field363++;
        }
        return var3;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lx;JB)V")
    public void method116(DoublyLinkable arg0, long arg1, byte arg2) {
        if (this.field366 == 0) {
            DoublyLinkable var5 = this.field368.method264();
            var5.method120();
            var5.method121();
            if (this.field364 == var5) {
                DoublyLinkable var6 = this.field368.method264();
                var6.method120();
                var6.method121();
            }
        } else {
            this.field366--;
        }
        this.field367.method119(352, arg1, arg0);
        this.field368.method263(arg0);
        if (this.field361 != arg2) {
            this.field360 = -122;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "()V")
    public void method117() {
        while (true) {
            DoublyLinkable var1 = this.field368.method264();
            if (var1 == null) {
                this.field366 = this.field365;
                return;
            }
            var1.method120();
            var1.method121();
        }
    }
}
