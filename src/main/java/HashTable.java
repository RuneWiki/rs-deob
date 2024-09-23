import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field353 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field354 = -884;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "t", name = "d", descriptor = "[Lu;")
    private Linkable[] field356;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(BI)V")
    public HashTable(byte arg0, int arg1) {
        this.field355 = arg1;
        this.field356 = new Linkable[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            Linkable var4 = this.field356[var3] = new Linkable();
            var4.field358 = var4;
            var4.field359 = var4;
        }
        if (arg0 != -114) {
            this.field353 = !this.field353;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field356[(int) (arg0 & (long) (this.field355 - 1))];
        for (Linkable var4 = var3.field358; var4 != var3; var4 = var4.field358) {
            if (var4.field357 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(JLu;B)V")
    public void method105(long arg0, Linkable arg1, byte arg2) {
        if (arg1.field359 != null) {
            arg1.method106();
        }
        Linkable var5 = this.field356[(int) (arg0 & (long) (this.field355 - 1))];
        arg1.field359 = var5.field359;
        if (arg2 != 34) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        arg1.field358 = var5;
        arg1.field359.field358 = arg1;
        arg1.field358.field359 = arg1;
        arg1.field357 = arg0;
    }
}
