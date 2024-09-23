import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "I")
    private int field352 = 28523;

    @OriginalMember(owner = "t", name = "b", descriptor = "Z")
    private boolean field353 = true;

    @OriginalMember(owner = "t", name = "c", descriptor = "Z")
    private boolean field354 = true;

    @OriginalMember(owner = "t", name = "d", descriptor = "Z")
    private boolean field355 = false;

    @OriginalMember(owner = "t", name = "e", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "t", name = "f", descriptor = "[Lu;")
    private Linkable[] field357;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field356 = arg0;
        this.field357 = new Linkable[arg0];
        if (arg1 >= 0) {
            this.field352 = 373;
        }
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field357[var3] = new Linkable();
            var4.field360 = var4;
            var4.field361 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field357[(int) (arg0 & (long) (this.field356 - 1))];
        for (Linkable var4 = var3.field360; var4 != var3; var4 = var4.field360) {
            if (var4.field359 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(ILu;J)V")
    public void method105(int arg0, Linkable arg1, long arg2) {
        if (arg1.field361 != null) {
            arg1.method106();
        }
        Linkable var5 = this.field357[(int) (arg2 & (long) (this.field356 - 1))];
        arg1.field361 = var5.field361;
        arg1.field360 = var5;
        arg1.field361.field360 = arg1;
        int var6 = 17 / arg0;
        arg1.field360.field361 = arg1;
        arg1.field359 = arg2;
    }
}
