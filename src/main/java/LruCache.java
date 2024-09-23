import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("r")
public class LruCache {

    @OriginalMember(owner = "r", name = "a", descriptor = "Z")
    private boolean field265 = true;

    @OriginalMember(owner = "r", name = "d", descriptor = "Ls;")
    private HashTable field268 = new HashTable(false, 1024);

    @OriginalMember(owner = "r", name = "e", descriptor = "Lob;")
    private DoublyLinkList field269 = new DoublyLinkList((byte) 3);

    @OriginalMember(owner = "r", name = "b", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "r", name = "c", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "r", name = "<init>", descriptor = "(II)V")
    public LruCache(int arg0, int arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field266 = arg1;
        this.field267 = arg1;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(J)Lcb;")
    public DoublyLinkable method84(long arg0) {
        DoublyLinkable var3 = (DoublyLinkable) this.field268.method87(arg0);
        if (var3 != null) {
            this.field269.method208(var3);
        }
        return var3;
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "(Lcb;JB)V")
    public void method85(DoublyLinkable arg0, long arg1, byte arg2) {
        if (this.field267 == 0) {
            DoublyLinkable var5 = this.field269.method209();
            var5.method89();
            var5.method102();
        } else {
            this.field267--;
        }
        this.field268.method88(arg1, arg0, 276);
        if (arg2 == 2) {
            boolean var6 = false;
        } else {
            this.field265 = !this.field265;
        }
        this.field269.method208(arg0);
    }

    @OriginalMember(owner = "r", name = "a", descriptor = "()V")
    public void method86() {
        while (true) {
            DoublyLinkable var1 = this.field269.method209();
            if (var1 == null) {
                this.field267 = this.field266;
                return;
            }
            var1.method89();
            var1.method102();
        }
    }
}
