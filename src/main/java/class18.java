import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GCTCRUHH")
public class class18 {

    @OriginalMember(owner = "client!GCTCRUHH", name = "a", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!GCTCRUHH", name = "b", descriptor = "[I")
    public int[] field846;

    @OriginalMember(owner = "client!GCTCRUHH", name = "c", descriptor = "[[I")
    public int[][] field847;

    @OriginalMember(owner = "client!GCTCRUHH", name = "<init>", descriptor = "(ILBFQIDHPO;)V")
    public class18(int arg0, class3 arg1) {
        if (arg0 != -10875) {
            throw new NullPointerException();
        }
        this.field845 = arg1.method54();
        this.field846 = new int[this.field845];
        this.field847 = new int[this.field845][];
        for (int var3 = 0; var3 < this.field845; var3++) {
            this.field846[var3] = arg1.method54();
        }
        for (int var4 = 0; var4 < this.field845; var4++) {
            int var5 = arg1.method54();
            this.field847[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field847[var4][var6] = arg1.method54();
            }
        }
    }
}
