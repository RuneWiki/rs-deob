import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field357 = true;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "t", name = "c", descriptor = "[Lu;")
    private Linkable[] field359;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(BI)V")
    public HashTable(byte arg0, int arg1) {
        this.field358 = arg1;
        if (arg0 != 10) {
            throw new NullPointerException();
        }
        this.field359 = new Linkable[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var4 = this.field359[var3] = new Linkable();
            var4.field362 = var4;
            var4.field363 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field359[(int) (arg0 & (long) (this.field358 - 1))];
        for (Linkable var4 = var3.field362; var4 != var3; var4 = var4.field362) {
            if (var4.field361 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(Lu;JI)V")
    public void method105(Linkable arg0, long arg1, int arg2) {
        if (arg0.field363 != null) {
            arg0.method106();
        }
        Linkable var5 = this.field359[(int) (arg1 & (long) (this.field358 - 1))];
        arg0.field363 = var5.field363;
        if (arg2 != 32735) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg0.field362 = var5;
        arg0.field363.field362 = arg0;
        arg0.field362.field363 = arg0;
        arg0.field361 = arg1;
    }
}
