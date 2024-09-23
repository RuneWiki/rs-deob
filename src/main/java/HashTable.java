import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class HashTable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field385 = true;

    @OriginalMember(owner = "u", name = "b", descriptor = "I")
    private int field386 = -34;

    @OriginalMember(owner = "u", name = "c", descriptor = "I")
    private int field387 = 46;

    @OriginalMember(owner = "u", name = "d", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "u", name = "e", descriptor = "[Lv;")
    private Linkable[] field389;

    @OriginalMember(owner = "u", name = "<init>", descriptor = "(II)V")
    public HashTable(int arg0, int arg1) {
        this.field388 = arg0;
        this.field389 = new Linkable[arg0];
        int var3 = 73 / arg1;
        for (int var4 = 0; var4 < arg0; var4++) {
            Linkable var5 = this.field389[var4] = new Linkable();
            var5.field391 = var5;
            var5.field392 = var5;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(J)Lv;")
    public Linkable method118(long arg0) {
        Linkable var3 = this.field389[(int) (arg0 & (long) (this.field388 - 1))];
        for (Linkable var4 = var3.field391; var4 != var3; var4 = var4.field391) {
            if (var4.field390 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(IJLv;)V")
    public void method119(int arg0, long arg1, Linkable arg2) {
        if (arg2.field392 != null) {
            arg2.method120();
        }
        Linkable var5 = this.field389[(int) (arg1 & (long) (this.field388 - 1))];
        arg2.field392 = var5.field392;
        if (arg0 <= 0) {
            this.field385 = !this.field385;
        }
        arg2.field391 = var5;
        arg2.field392.field391 = arg2;
        arg2.field391.field392 = arg2;
        arg2.field390 = arg1;
    }
}
