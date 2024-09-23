import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VLFCQHDE")
public class class64 {

    @OriginalMember(owner = "VLFCQHDE", name = "a", descriptor = "Z")
    private boolean field1647 = true;

    @OriginalMember(owner = "VLFCQHDE", name = "b", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "VLFCQHDE", name = "c", descriptor = "[I")
    public int[] field1649;

    @OriginalMember(owner = "VLFCQHDE", name = "d", descriptor = "[[I")
    public int[][] field1650;

    @OriginalMember(owner = "VLFCQHDE", name = "<init>", descriptor = "(ZLMUKVLYLC;)V")
    public class64(boolean arg0, class33 arg1) {
        this.field1648 = arg1.method292();
        if (arg0) {
            this.field1647 = !this.field1647;
        }
        this.field1649 = new int[this.field1648];
        this.field1650 = new int[this.field1648][];
        for (int var3 = 0; var3 < this.field1648; var3++) {
            this.field1649[var3] = arg1.method292();
        }
        for (int var4 = 0; var4 < this.field1648; var4++) {
            int var5 = arg1.method292();
            this.field1650[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1650[var4][var6] = arg1.method292();
            }
        }
    }
}
