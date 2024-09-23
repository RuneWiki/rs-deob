import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class LruCache {

    @OriginalMember(owner = "t", name = "c", descriptor = "Lx;")
    private DoublyLinkable field357 = new DoublyLinkable();

    @OriginalMember(owner = "t", name = "f", descriptor = "Lu;")
    private HashTable field360 = new HashTable((byte) 81, 1024);

    @OriginalMember(owner = "t", name = "g", descriptor = "Lqb;")
    private DoublyLinkList field361 = new DoublyLinkList((byte) 5);

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "t", name = "e", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        this.field358 = arg1;
        this.field359 = arg1;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lx;")
    public DoublyLinkable method113(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field360.method116(arg0);
        if (var3 == null) {
            this.field355++;
        } else {
            this.field361.method255(var3);
            this.field356++;
        }
        return var3;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lx;JI)V")
    public void method114(DoublyLinkable arg0, long arg1, int arg2) {
        if (arg2 != 7) {
            return;
        }
        if (this.field359 == 0) {
            DoublyLinkable var5 = this.field361.method256();
            var5.method118();
            var5.method119();
            if (this.field357 == var5) {
                DoublyLinkable var6 = this.field361.method256();
                var6.method118();
                var6.method119();
            }
        } else {
            this.field359--;
        }
        this.field360.method117(-928, arg0, arg1);
        this.field361.method255(arg0);
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "()V")
    public void method115() {
        while (true) {
            DoublyLinkable var1 = this.field361.method256();
            if (var1 == null) {
                this.field359 = this.field358;
                return;
            }
            var1.method118();
            var1.method119();
        }
    }
}
