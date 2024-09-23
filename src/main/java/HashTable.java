import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field290 = 171;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field291 = 22945;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "t", name = "d", descriptor = "[Lu;")
    private Linkable[] field293;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(BI)V")
    public HashTable(byte arg0, int arg1) {
        this.field292 = arg1;
        if (arg0 != 84) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field293 = new Linkable[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            Linkable var5 = this.field293[var4] = new Linkable();
            var5.field296 = var5;
            var5.field297 = var5;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field293[(int) (arg0 & (long) (this.field292 - 1))];
        for (Linkable var4 = var3.field296; var4 != var3; var4 = var4.field296) {
            if (var4.field295 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(JILu;)V")
    public void method105(long arg0, int arg1, Linkable arg2) {
        if (arg1 >= 0) {
            return;
        }
        if (arg2.field297 != null) {
            arg2.method106();
        }
        Linkable var5 = this.field293[(int) (arg0 & (long) (this.field292 - 1))];
        arg2.field297 = var5.field297;
        arg2.field296 = var5;
        arg2.field297.field296 = arg2;
        arg2.field296.field297 = arg2;
        arg2.field295 = arg0;
    }
}
