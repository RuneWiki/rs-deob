import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field293 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field294 = 12;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field295 = 4;

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "t", name = "e", descriptor = "[Lu;")
    private Linkable[] field297;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field296 = arg1;
        this.field297 = new Linkable[arg1];
        int var3 = 9 / arg0;
        for (int var4 = 0; var4 < arg1; var4++) {
            Linkable var5 = this.field297[var4] = new Linkable();
            var5.field299 = var5;
            var5.field300 = var5;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method105(long arg0) {
        Linkable var3 = this.field297[(int) (arg0 & (long) (this.field296 - 1))];
        for (Linkable var4 = var3.field299; var4 != var3; var4 = var4.field299) {
            if (var4.field298 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(IJLu;)V")
    public void method106(int arg0, long arg1, Linkable arg2) {
        if (arg2.field300 != null) {
            arg2.method107();
        }
        Linkable var5 = this.field297[(int) (arg1 & (long) (this.field296 - 1))];
        arg2.field300 = var5.field300;
        arg2.field299 = var5;
        if (arg0 < 7 || arg0 > 7) {
            this.field293 = !this.field293;
        }
        arg2.field300.field299 = arg2;
        arg2.field299.field300 = arg2;
        arg2.field298 = arg1;
    }
}
