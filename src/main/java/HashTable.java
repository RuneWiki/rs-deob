import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field353 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "t", name = "c", descriptor = "I")
    private int field355 = 8;

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "t", name = "e", descriptor = "[Lu;")
    private Linkable[] field357;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(IB)V")
    public HashTable(int arg0, byte arg1) {
        this.field356 = arg0;
        this.field357 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var5 = this.field357[var3] = new Linkable();
            var5.field359 = var5;
            var5.field360 = var5;
        }
        if (arg1 != 124) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field357[(int) (arg0 & (long) (this.field356 - 1))];
        for (Linkable var4 = var3.field359; var4 != var3; var4 = var4.field359) {
            if (var4.field358 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(ZLu;J)V")
    public void method105(boolean arg0, Linkable arg1, long arg2) {
        if (arg1.field360 != null) {
            arg1.method106();
        }
        Linkable var5 = this.field357[(int) (arg2 & (long) (this.field356 - 1))];
        arg1.field360 = var5.field360;
        if (arg0) {
            this.field353 = !this.field353;
        }
        arg1.field359 = var5;
        arg1.field360.field359 = arg1;
        arg1.field359.field360 = arg1;
        arg1.field358 = arg2;
    }
}
