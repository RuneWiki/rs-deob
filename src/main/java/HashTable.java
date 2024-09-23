import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class HashTable {

    @OriginalMember(owner = "u", name = "b", descriptor = "Z")
    private boolean field368 = true;

    @OriginalMember(owner = "u", name = "c", descriptor = "Z")
    private boolean field369 = false;

    @OriginalMember(owner = "u", name = "d", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "u", name = "e", descriptor = "[Lv;")
    private Linkable[] field371;

    @OriginalMember(owner = "u", name = "a", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "u", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field370 = arg0;
        this.field371 = new Linkable[arg0];
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field371[var3] = new Linkable();
            var4.field373 = var4;
            var4.field374 = var4;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(J)Lv;")
    public Linkable method118(long arg0) {
        Linkable var3 = this.field371[(int) (arg0 & (long) (this.field370 - 1))];
        for (Linkable var4 = var3.field373; var4 != var3; var4 = var4.field373) {
            if (var4.field372 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(Lv;IJ)V")
    public void method119(Linkable arg0, int arg1, long arg2) {
        if (arg1 < 2 || arg1 > 2) {
            this.field367 = 209;
        }
        if (arg0.field374 != null) {
            arg0.method120();
        }
        Linkable var5 = this.field371[(int) (arg2 & (long) (this.field370 - 1))];
        arg0.field374 = var5.field374;
        arg0.field373 = var5;
        arg0.field374.field373 = arg0;
        arg0.field373.field374 = arg0;
        arg0.field372 = arg2;
    }
}
