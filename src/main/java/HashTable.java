import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class HashTable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field357 = false;

    @OriginalMember(owner = "u", name = "b", descriptor = "I")
    private int field358 = 7;

    @OriginalMember(owner = "u", name = "c", descriptor = "Z")
    private boolean field359 = true;

    @OriginalMember(owner = "u", name = "d", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "u", name = "e", descriptor = "[Lv;")
    private Linkable[] field361;

    @OriginalMember(owner = "u", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field360 = arg0;
        this.field361 = new Linkable[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            Linkable var4 = this.field361[var3] = new Linkable();
            var4.field363 = var4;
            var4.field364 = var4;
        }
        if (arg1 != 8) {
            this.field358 = 285;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(J)Lv;")
    public Linkable method116(long arg0) {
        Linkable var3 = this.field361[(int) (arg0 & (long) (this.field360 - 1))];
        for (Linkable var4 = var3.field363; var4 != var3; var4 = var4.field363) {
            if (var4.field362 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(IJLv;)V")
    public void method117(int arg0, long arg1, Linkable arg2) {
        if (arg2.field364 != null) {
            arg2.method118();
        }
        Linkable var5 = this.field361[(int) (arg1 & (long) (this.field360 - 1))];
        arg2.field364 = var5.field364;
        arg2.field363 = var5;
        arg2.field364.field363 = arg2;
        arg2.field363.field364 = arg2;
        if (arg0 == -12119) {
            arg2.field362 = arg1;
        }
    }
}
