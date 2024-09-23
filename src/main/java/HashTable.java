import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field355 = 7;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field356 = 7228;

    @OriginalMember(owner = "t", name = "c", descriptor = "B")
    private byte field357 = 0;

    @OriginalMember(owner = "t", name = "d", descriptor = "Z")
    private boolean field358 = false;

    @OriginalMember(owner = "t", name = "e", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "t", name = "f", descriptor = "[Lu;")
    private Linkable[] field360;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field359 = arg0;
        if (this.field356 != arg1) {
            this.field355 = 236;
        }
        this.field360 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field360[var3] = new Linkable();
            var4.field363 = var4;
            var4.field364 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field360[(int) (arg0 & (long) (this.field359 - 1))];
        for (Linkable var4 = var3.field363; var4 != var3; var4 = var4.field363) {
            if (var4.field362 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(ZJLu;)V")
    public void method105(boolean arg0, long arg1, Linkable arg2) {
        if (!arg0) {
            return;
        }
        if (arg2.field364 != null) {
            arg2.method106();
        }
        Linkable var5 = this.field360[(int) (arg1 & (long) (this.field359 - 1))];
        arg2.field364 = var5.field364;
        arg2.field363 = var5;
        arg2.field364.field363 = arg2;
        arg2.field363.field364 = arg2;
        arg2.field362 = arg1;
    }
}
