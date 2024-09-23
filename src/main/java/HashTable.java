import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "t", name = "b", descriptor = "[Lu;")
    private Linkable[] field288;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field287 = arg0;
        this.field288 = new Linkable[arg0];
        if (arg1 < 0 || arg1 > 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field288[var3] = new Linkable();
            var4.field291 = var4;
            var4.field292 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method105(long arg0) {
        Linkable var3 = this.field288[(int) (arg0 & (long) (this.field287 - 1))];
        for (Linkable var4 = var3.field291; var4 != var3; var4 = var4.field291) {
            if (var4.field290 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lu;JZ)V")
    public void method106(Linkable arg0, long arg1, boolean arg2) {
        if (arg0.field292 != null) {
            arg0.method107();
        }
        Linkable var5 = this.field288[(int) (arg1 & (long) (this.field287 - 1))];
        arg0.field292 = var5.field292;
        if (!arg2) {
            arg0.field291 = var5;
            arg0.field292.field291 = arg0;
            arg0.field291.field292 = arg0;
            arg0.field290 = arg1;
        }
    }
}
