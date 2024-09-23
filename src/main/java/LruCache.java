import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class LruCache {

    @OriginalMember(owner = "t", name = "a", descriptor = "B")
    private byte field359 = 3;

    @OriginalMember(owner = "t", name = "b", descriptor = "Z")
    private boolean field360 = true;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field361 = -83;

    @OriginalMember(owner = "t", name = "f", descriptor = "Lx;")
    private DoublyLinkable field364 = new DoublyLinkable();

    @OriginalMember(owner = "t", name = "i", descriptor = "Lu;")
    private HashTable field367 = new HashTable(1024, -176);

    @OriginalMember(owner = "t", name = "j", descriptor = "Lqb;")
    private DoublyLinkList field368 = new DoublyLinkList(0);

    @OriginalMember(owner = "t", name = "g", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "t", name = "h", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "t", name = "e", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(BI)V")
    public LruCache(byte arg0, int arg1) {
        if (this.field359 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field365 = arg1;
        this.field366 = arg1;
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

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lx;ZJ)V")
    public void method116(DoublyLinkable arg0, boolean arg1, long arg2) {
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
        this.field367.method119(arg2, (byte) 0, arg0);
        this.field368.method263(arg0);
        if (arg1) {
            this.field361 = 448;
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
