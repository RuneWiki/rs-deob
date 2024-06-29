import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class HashTable {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    private int field288 = 4277;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
    private boolean field289 = false;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[Lu;")
    private Linkable[] field291;

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field290 = arg1;
        this.field291 = new Linkable[arg1];
        if (arg0 < 9 || arg0 > 9) {
            this.field289 = !this.field289;
        }
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var4 = this.field291[var3] = new Linkable();
            var4.field293 = var4;
            var4.field294 = var4;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lu;")
    public Linkable method106(long arg0) {
        Linkable var3 = this.field291[(int) (arg0 & (long) (this.field290 - 1))];
        for (Linkable var4 = var3.field293; var4 != var3; var4 = var4.field293) {
            if (var4.field292 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(JILu;)V")
    public void method107(long arg0, int arg1, Linkable arg2) {
        if (arg2.field294 != null) {
            arg2.method108();
        }
        Linkable var5 = this.field291[(int) (arg0 & (long) (this.field290 - 1))];
        arg2.field294 = var5.field294;
        if (arg1 < 0) {
            arg2.field293 = var5;
            arg2.field294.field293 = arg2;
            arg2.field293.field294 = arg2;
            arg2.field292 = arg0;
        }
    }
}
