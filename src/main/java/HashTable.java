import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field362 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "t", name = "c", descriptor = "[Lu;")
    private Linkable[] field364;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field363 = arg0;
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.field364 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field364[var3] = new Linkable();
            var4.field366 = var4;
            var4.field367 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field364[(int) (arg0 & (long) (this.field363 - 1))];
        for (Linkable var4 = var3.field366; var4 != var3; var4 = var4.field366) {
            if (var4.field365 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(ZJLu;)V")
    public void method105(boolean arg0, long arg1, Linkable arg2) {
        if (arg2.field367 != null) {
            arg2.method106();
        }
        Linkable var5 = this.field364[(int) (arg1 & (long) (this.field363 - 1))];
        arg2.field367 = var5.field367;
        arg2.field366 = var5;
        arg2.field367.field366 = arg2;
        if (arg0) {
            arg2.field366.field367 = arg2;
            arg2.field365 = arg1;
        }
    }
}
