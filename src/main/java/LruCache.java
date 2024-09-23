import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class LruCache {

    @OriginalMember(owner = "t", name = "c", descriptor = "Lx;")
    private DoublyLinkable field380 = new DoublyLinkable();

    @OriginalMember(owner = "t", name = "f", descriptor = "Lu;")
    private HashTable field383 = new HashTable(1024, 299);

    @OriginalMember(owner = "t", name = "g", descriptor = "Lqb;")
    private DoublyLinkList field384 = new DoublyLinkList(false);

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "t", name = "e", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        this.field381 = arg1;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field382 = arg1;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lx;")
    public DoublyLinkable method115(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field383.method118(arg0);
        if (var3 == null) {
            this.field378++;
        } else {
            this.field384.method263(var3);
            this.field379++;
        }
        return var3;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(ZJLx;)V")
    public void method116(boolean arg0, long arg1, DoublyLinkable arg2) {
        if (this.field382 == 0) {
            DoublyLinkable var5 = this.field384.method264();
            var5.method120();
            var5.method121();
            if (this.field380 == var5) {
                DoublyLinkable var6 = this.field384.method264();
                var6.method120();
                var6.method121();
            }
        } else {
            this.field382--;
        }
        this.field383.method119(46, arg1, arg2);
        if (!arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field384.method263(arg2);
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "()V")
    public void method117() {
        while (true) {
            DoublyLinkable var1 = this.field384.method264();
            if (var1 == null) {
                this.field382 = this.field381;
                return;
            }
            var1.method120();
            var1.method121();
        }
    }
}
