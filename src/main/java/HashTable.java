import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class HashTable {

    @OriginalMember(owner = "t", name = "a", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "t", name = "b", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "t", name = "c", descriptor = "[Lu;")
    private Linkable[] field356;

    @OriginalMember(owner = "t", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field355 = arg0;
        this.field356 = new Linkable[arg0];
        while (arg1 >= 0) {
            this.field354 = !this.field354;
        }
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field356[var3] = new Linkable();
            var4.field360 = var4;
            var4.field361 = var4;
        }
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(J)Lu;")
    public Linkable method104(long arg0) {
        Linkable var3 = this.field356[(int) (arg0 & (long) (this.field355 - 1))];
        for (Linkable var4 = var3.field360; var4 != var3; var4 = var4.field360) {
            if (var4.field359 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "t", name = "a", descriptor = "(JILu;)V")
    public void method105(long arg0, int arg1, Linkable arg2) {
        if (arg2.field361 != null) {
            arg2.method106();
        }
        Linkable var5 = this.field356[(int) (arg0 & (long) (this.field355 - 1))];
        arg2.field361 = var5.field361;
        arg2.field360 = var5;
        arg2.field361.field360 = arg2;
        if (arg1 == 2) {
            arg2.field360.field361 = arg2;
            arg2.field359 = arg0;
        }
    }
}
