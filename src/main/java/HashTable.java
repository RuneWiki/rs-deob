import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "t", name = "b", descriptor = "[Lu;")
    private Linkable[] field362;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field361 = arg1;
        this.field362 = new Linkable[arg1];
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var4 = this.field362[var3] = new Linkable();
            var4.field365 = var4;
            var4.field366 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field362[(int) (arg0 & (long) (this.field361 - 1))];
        for (Linkable var4 = var3.field365; var4 != var3; var4 = var4.field365) {
            if (var4.field364 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(JILu;)V")
    public void method105(long arg0, int arg1, Linkable arg2) {
        if (arg2.field366 != null) {
            arg2.method106();
        }
        Linkable var5 = this.field362[(int) (arg0 & (long) (this.field361 - 1))];
        if (arg1 != 7) {
            return;
        }
        arg2.field366 = var5.field366;
        arg2.field365 = var5;
        arg2.field366.field365 = arg2;
        arg2.field365.field366 = arg2;
        arg2.field364 = arg0;
    }
}
