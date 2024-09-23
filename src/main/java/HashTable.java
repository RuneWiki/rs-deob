import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class HashTable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field369 = false;

    @OriginalMember(owner = "u", name = "b", descriptor = "I")
    private int field370 = -22996;

    @OriginalMember(owner = "u", name = "c", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "u", name = "d", descriptor = "[Lv;")
    private Linkable[] field372;

    @OriginalMember(owner = "u", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field371 = arg0;
        if (arg1 >= 0) {
            this.field370 = -404;
        }
        this.field372 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field372[var3] = new Linkable();
            var4.field375 = var4;
            var4.field376 = var4;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(J)Lv;")
    public Linkable method118(long arg0) {
        Linkable var3 = this.field372[(int) (arg0 & (long) (this.field371 - 1))];
        for (Linkable var4 = var3.field375; var4 != var3; var4 = var4.field375) {
            if (var4.field374 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(JBLv;)V")
    public void method119(long arg0, byte arg1, Linkable arg2) {
        if (arg2.field376 != null) {
            arg2.method120();
        }
        Linkable var5 = this.field372[(int) (arg0 & (long) (this.field371 - 1))];
        arg2.field376 = var5.field376;
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg2.field375 = var5;
        arg2.field376.field375 = arg2;
        arg2.field375.field376 = arg2;
        arg2.field374 = arg0;
    }
}
