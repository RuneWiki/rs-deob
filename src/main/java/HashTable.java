import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class HashTable {

    @OriginalMember(owner = "s", name = "a", descriptor = "I")
    private int field270 = -36905;

    @OriginalMember(owner = "s", name = "b", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "s", name = "c", descriptor = "[Lt;")
    private Linkable[] field272;

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(ZI)V")
    public HashTable(boolean arg0, int arg1) {
        this.field271 = arg1;
        this.field272 = new Linkable[arg1];
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1; var4++) {
            Linkable var5 = this.field272[var4] = new Linkable();
            var5.field274 = var5;
            var5.field275 = var5;
        }
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(J)Lt;")
    public Linkable method87(long arg0) {
        Linkable var3 = this.field272[(int) (arg0 & (long) (this.field271 - 1))];
        for (Linkable var4 = var3.field274; var4 != var3; var4 = var4.field274) {
            if (var4.field273 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(JLt;I)V")
    public void method88(long arg0, Linkable arg1, int arg2) {
        if (arg1.field275 != null) {
            arg1.method89();
        }
        Linkable var5 = this.field272[(int) (arg0 & (long) (this.field271 - 1))];
        arg1.field275 = var5.field275;
        arg1.field274 = var5;
        int var6 = 95 / arg2;
        arg1.field275.field274 = arg1;
        arg1.field274.field275 = arg1;
        arg1.field273 = arg0;
    }
}
