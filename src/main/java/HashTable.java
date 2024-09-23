import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field359 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field360 = 160;

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "t", name = "e", descriptor = "[Lu;")
    private Linkable[] field363;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field362 = arg1;
        this.field363 = new Linkable[arg1];
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var4 = this.field363[var3] = new Linkable();
            var4.field366 = var4;
            var4.field367 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field363[(int) (arg0 & (long) (this.field362 - 1))];
        for (Linkable var4 = var3.field366; var4 != var3; var4 = var4.field366) {
            if (var4.field365 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(JLu;I)V")
    public void method105(long arg0, Linkable arg1, int arg2) {
        if (arg1.field367 != null) {
            arg1.method106();
        }
        Linkable var5 = this.field363[(int) (arg0 & (long) (this.field362 - 1))];
        if (arg2 < this.field361 || arg2 > this.field361) {
            return;
        }
        arg1.field367 = var5.field367;
        arg1.field366 = var5;
        arg1.field367.field366 = arg1;
        arg1.field366.field367 = arg1;
        arg1.field365 = arg0;
    }
}
