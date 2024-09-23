import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field288 = 4277;

    @OriginalMember(owner = "t", name = "b", descriptor = "Z")
    private boolean field289 = false;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "t", name = "d", descriptor = "[Lu;")
    private Linkable[] field291;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field290 = arg1;
        this.field291 = new Linkable[arg1];
        if (arg0 < 9 || arg0 > 9) {
            this.field289 = !this.field289;
        }
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var4 = this.field291[var3] = new Linkable();
            var4.next = var4;
            var4.prev = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method106(long arg0) {
        Linkable var3 = this.field291[(int) (arg0 & (long) (this.field290 - 1))];
        for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
            if (var4.key == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(JILu;)V")
    public void method107(long arg0, int arg1, Linkable arg2) {
        if (arg2.prev != null) {
            arg2.unlink();
        }
        Linkable var5 = this.field291[(int) (arg0 & (long) (this.field290 - 1))];
        arg2.prev = var5.prev;
        if (arg1 < 0) {
            arg2.next = var5;
            arg2.prev.next = arg2;
            arg2.next.prev = arg2;
            arg2.key = arg0;
        }
    }
}
