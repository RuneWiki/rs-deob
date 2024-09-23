import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field352 = 26961;

    @OriginalMember(owner = "t", name = "b", descriptor = "Z")
    private boolean field353 = true;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "t", name = "d", descriptor = "[Lu;")
    private Linkable[] field355;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field354 = arg0;
        this.field355 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var5 = this.field355[var3] = new Linkable();
            var5.field358 = var5;
            var5.field359 = var5;
        }
        if (arg1 != 26228) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field355[(int) (arg0 & (long) (this.field354 - 1))];
        for (Linkable var4 = var3.field358; var4 != var3; var4 = var4.field358) {
            if (var4.field357 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lu;JI)V")
    public void method105(Linkable arg0, long arg1, int arg2) {
        if (arg0.field359 != null) {
            arg0.method106();
        }
        Linkable var5 = this.field355[(int) (arg1 & (long) (this.field354 - 1))];
        arg0.field359 = var5.field359;
        arg0.field358 = var5;
        if (arg2 >= 4 && arg2 <= 4) {
            arg0.field359.field358 = arg0;
            arg0.field358.field359 = arg0;
            arg0.field357 = arg1;
        }
    }
}
