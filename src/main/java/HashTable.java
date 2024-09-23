import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class HashTable {

    @OriginalMember(owner = "u", name = "a", descriptor = "I")
    private int field373 = -732;

    @OriginalMember(owner = "u", name = "b", descriptor = "Z")
    private boolean field374 = false;

    @OriginalMember(owner = "u", name = "c", descriptor = "I")
    private int field375 = -11252;

    @OriginalMember(owner = "u", name = "d", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "u", name = "e", descriptor = "[Lv;")
    private Linkable[] field377;

    @OriginalMember(owner = "u", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field376 = arg0;
        if (arg1 != 0) {
            this.field373 = 332;
        }
        this.field377 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field377[var3] = new Linkable();
            var4.field379 = var4;
            var4.field380 = var4;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(J)Lv;")
    public Linkable method117(long arg0) {
        Linkable var3 = this.field377[(int) (arg0 & (long) (this.field376 - 1))];
        for (Linkable var4 = var3.field379; var4 != var3; var4 = var4.field379) {
            if (var4.field378 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(Lv;IJ)V")
    public void method118(Linkable arg0, int arg1, long arg2) {
        if (arg0.field380 != null) {
            arg0.method119();
        }
        Linkable var5 = this.field377[(int) (arg2 & (long) (this.field376 - 1))];
        arg0.field380 = var5.field380;
        arg0.field379 = var5;
        if (arg1 != -5797) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg0.field380.field379 = arg0;
        arg0.field379.field380 = arg0;
        arg0.field378 = arg2;
    }
}
