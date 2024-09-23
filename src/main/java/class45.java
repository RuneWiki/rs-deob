import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NSCXCZCZ")
public class class45 {

    @OriginalMember(owner = "NSCXCZCZ", name = "a", descriptor = "I")
    private int field1081 = -32217;

    @OriginalMember(owner = "NSCXCZCZ", name = "b", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "NSCXCZCZ", name = "c", descriptor = "[I")
    public int[] field1083;

    @OriginalMember(owner = "NSCXCZCZ", name = "d", descriptor = "[[I")
    public int[][] field1084;

    @OriginalMember(owner = "NSCXCZCZ", name = "<init>", descriptor = "(ZLJHKSAGUC;)V")
    public class45(boolean arg0, class31 arg1) {
        this.field1082 = arg1.method306();
        if (arg0) {
            this.field1081 = 199;
        }
        this.field1083 = new int[this.field1082];
        this.field1084 = new int[this.field1082][];
        for (int var3 = 0; var3 < this.field1082; var3++) {
            this.field1083[var3] = arg1.method306();
        }
        for (int var4 = 0; var4 < this.field1082; var4++) {
            int var5 = arg1.method306();
            this.field1084[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1084[var4][var6] = arg1.method306();
            }
        }
    }
}
