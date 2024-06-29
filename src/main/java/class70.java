import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YMEZTXZW")
public class class70 {

    @OriginalMember(owner = "client!YMEZTXZW", name = "a", descriptor = "Z")
    private boolean field1748 = false;

    @OriginalMember(owner = "client!YMEZTXZW", name = "b", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!YMEZTXZW", name = "c", descriptor = "[I")
    public int[] field1750;

    @OriginalMember(owner = "client!YMEZTXZW", name = "d", descriptor = "[[I")
    public int[][] field1751;

    @OriginalMember(owner = "client!YMEZTXZW", name = "<init>", descriptor = "(ILRGCGKKUR;)V")
    public class70(int arg0, class53 arg1) {
        this.field1749 = arg1.method455();
        if (arg0 <= 0) {
            this.field1748 = !this.field1748;
        }
        this.field1750 = new int[this.field1749];
        this.field1751 = new int[this.field1749][];
        for (int var3 = 0; var3 < this.field1749; var3++) {
            this.field1750[var3] = arg1.method455();
        }
        for (int var4 = 0; var4 < this.field1749; var4++) {
            int var5 = arg1.method455();
            this.field1751[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1751[var4][var6] = arg1.method455();
            }
        }
    }
}
