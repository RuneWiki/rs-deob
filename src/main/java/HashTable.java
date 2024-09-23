import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field361 = 32;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field362 = 917;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "t", name = "d", descriptor = "[Lu;")
    private Linkable[] field364;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        if (arg1 != 3) {
            throw new NullPointerException();
        }
        this.field363 = arg0;
        this.field364 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field364[var3] = new Linkable();
            var4.field367 = var4;
            var4.field368 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field364[(int) (arg0 & (long) (this.field363 - 1))];
        for (Linkable var4 = var3.field367; var4 != var3; var4 = var4.field367) {
            if (var4.field366 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lu;IJ)V")
    public void method105(Linkable arg0, int arg1, long arg2) {
        if (arg0.field368 != null) {
            arg0.method106();
        }
        Linkable var5 = this.field364[(int) (arg2 & (long) (this.field363 - 1))];
        arg0.field368 = var5.field368;
        arg0.field367 = var5;
        if (arg1 < 8 || arg1 > 8) {
            this.field361 = 19;
        }
        arg0.field368.field367 = arg0;
        arg0.field367.field368 = arg0;
        arg0.field366 = arg2;
    }
}
