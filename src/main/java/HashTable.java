import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field296 = 44;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "t", name = "d", descriptor = "[Lu;")
    private Linkable[] field298;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field297 = arg1;
        this.field298 = new Linkable[arg1];
        if (arg0 < 3 || arg0 > 3) {
            this.field295 = !this.field295;
        }
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var4 = this.field298[var3] = new Linkable();
            var4.field300 = var4;
            var4.field301 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method106(long arg0) {
        Linkable var3 = this.field298[(int) (arg0 & (long) (this.field297 - 1))];
        for (Linkable var4 = var3.field300; var4 != var3; var4 = var4.field300) {
            if (var4.field299 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(BJLu;)V")
    public void method107(byte arg0, long arg1, Linkable arg2) {
        if (arg2.field301 != null) {
            arg2.method108();
        }
        Linkable var5 = this.field298[(int) (arg1 & (long) (this.field297 - 1))];
        arg2.field301 = var5.field301;
        arg2.field300 = var5;
        if (arg0 == 6) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        arg2.field301.field300 = arg2;
        arg2.field300.field301 = arg2;
        arg2.field299 = arg1;
    }
}
