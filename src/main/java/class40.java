import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OSKYDPYJ")
public class class40 {

    @OriginalMember(owner = "OSKYDPYJ", name = "a", descriptor = "Z")
    private boolean field1213 = false;

    @OriginalMember(owner = "OSKYDPYJ", name = "b", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "OSKYDPYJ", name = "c", descriptor = "[I")
    public int[] field1215;

    @OriginalMember(owner = "OSKYDPYJ", name = "d", descriptor = "[[I")
    public int[][] field1216;

    @OriginalMember(owner = "OSKYDPYJ", name = "<init>", descriptor = "(LKHOMSBHW;B)V")
    public class40(class30 arg0, byte arg1) {
        this.field1214 = arg0.method349();
        this.field1215 = new int[this.field1214];
        this.field1216 = new int[this.field1214][];
        if (arg1 != -22) {
            this.field1213 = !this.field1213;
        }
        for (int var3 = 0; var3 < this.field1214; var3++) {
            this.field1215[var3] = arg0.method349();
        }
        for (int var4 = 0; var4 < this.field1214; var4++) {
            int var5 = arg0.method349();
            this.field1216[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1216[var4][var6] = arg0.method349();
            }
        }
    }
}
