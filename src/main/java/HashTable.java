import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class HashTable {

    @OriginalMember(owner = "u", name = "a", descriptor = "B")
    private byte field362 = 22;

    @OriginalMember(owner = "u", name = "b", descriptor = "I")
    private int field363 = 404;

    @OriginalMember(owner = "u", name = "c", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "u", name = "d", descriptor = "[Lv;")
    private Linkable[] field365;

    @OriginalMember(owner = "u", name = "<init>", descriptor = "(BI)V")
    public HashTable(byte arg0, int arg1) {
        if (arg0 != 81) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field364 = arg1;
        this.field365 = new Linkable[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            Linkable var5 = this.field365[var4] = new Linkable();
            var5.field367 = var5;
            var5.field368 = var5;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(J)Lv;")
    public Linkable method116(long arg0) {
        Linkable var3 = this.field365[(int) (arg0 & (long) (this.field364 - 1))];
        for (Linkable var4 = var3.field367; var4 != var3; var4 = var4.field367) {
            if (var4.field366 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(ILv;J)V")
    public void method117(int arg0, Linkable arg1, long arg2) {
        if (arg1.field368 != null) {
            arg1.method118();
        }
        Linkable var5 = this.field365[(int) (arg2 & (long) (this.field364 - 1))];
        if (arg0 >= 0) {
            return;
        }
        arg1.field368 = var5.field368;
        arg1.field367 = var5;
        arg1.field368.field367 = arg1;
        arg1.field367.field368 = arg1;
        arg1.field366 = arg2;
    }
}
