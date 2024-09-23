import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field294 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "t", name = "c", descriptor = "[Lu;")
    private Linkable[] field296;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field295 = arg0;
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field296 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field296[var3] = new Linkable();
            var4.field299 = var4;
            var4.field300 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method105(long arg0) {
        Linkable var3 = this.field296[(int) (arg0 & (long) (this.field295 - 1))];
        for (Linkable var4 = var3.field299; var4 != var3; var4 = var4.field299) {
            if (var4.field298 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(JLu;I)V")
    public void method106(long arg0, Linkable arg1, int arg2) {
        if (arg1.field300 != null) {
            arg1.method107();
        }
        Linkable var5 = this.field296[(int) (arg0 & (long) (this.field295 - 1))];
        arg1.field300 = var5.field300;
        arg1.field299 = var5;
        arg1.field300.field299 = arg1;
        arg1.field299.field300 = arg1;
        if (arg2 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg1.field298 = arg0;
    }
}
