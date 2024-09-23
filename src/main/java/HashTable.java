import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class HashTable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field365 = true;

    @OriginalMember(owner = "u", name = "b", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "u", name = "c", descriptor = "[Lv;")
    private Linkable[] field367;

    @OriginalMember(owner = "u", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        if (arg0 < 3 || arg0 > 3) {
            this.field365 = !this.field365;
        }
        this.field366 = arg1;
        this.field367 = new Linkable[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var4 = this.field367[var3] = new Linkable();
            var4.field370 = var4;
            var4.field371 = var4;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(J)Lv;")
    public Linkable method117(long arg0) {
        Linkable var3 = this.field367[(int) (arg0 & (long) (this.field366 - 1))];
        for (Linkable var4 = var3.field370; var4 != var3; var4 = var4.field370) {
            if (var4.field369 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(IJLv;)V")
    public void method118(int arg0, long arg1, Linkable arg2) {
        if (arg2.field371 != null) {
            arg2.method119();
        }
        Linkable var5 = this.field367[(int) (arg1 & (long) (this.field366 - 1))];
        arg2.field371 = var5.field371;
        arg2.field370 = var5;
        arg2.field371.field370 = arg2;
        if (arg0 < 5 || arg0 > 5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg2.field370.field371 = arg2;
        arg2.field369 = arg1;
    }
}
