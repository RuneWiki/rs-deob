import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class HashTable {

    @OriginalMember(owner = "u", name = "a", descriptor = "B")
    private byte field369 = -46;

    @OriginalMember(owner = "u", name = "b", descriptor = "Z")
    private boolean field370 = false;

    @OriginalMember(owner = "u", name = "c", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "u", name = "d", descriptor = "[Lv;")
    private Linkable[] field372;

    @OriginalMember(owner = "u", name = "<init>", descriptor = "(IB)V")
    public HashTable(int arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field371 = arg0;
        this.field372 = new Linkable[arg0];
        for (int var5 = 0; var5 < arg0; var5++) {
            Linkable var6 = this.field372[var5] = new Linkable();
            var6.field375 = var6;
            var6.field376 = var6;
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

    @OriginalMember(owner = "u", name = "a", descriptor = "(IJLv;)V")
    public void method119(int arg0, long arg1, Linkable arg2) {
        if (arg2.field376 != null) {
            arg2.method120();
        }
        Linkable var5 = this.field372[(int) (arg1 & (long) (this.field371 - 1))];
        int var6 = 55 / arg0;
        arg2.field376 = var5.field376;
        arg2.field375 = var5;
        arg2.field376.field375 = arg2;
        arg2.field375.field376 = arg2;
        arg2.field374 = arg1;
    }
}
