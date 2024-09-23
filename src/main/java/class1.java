import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BIWBGZXL")
public class class1 {

    @OriginalMember(owner = "BIWBGZXL", name = "a", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "BIWBGZXL", name = "b", descriptor = "[I")
    public int[] field2;

    @OriginalMember(owner = "BIWBGZXL", name = "c", descriptor = "[[I")
    public int[][] field3;

    @OriginalMember(owner = "BIWBGZXL", name = "<init>", descriptor = "(LMLYYHULT;I)V")
    public class1(class30 arg0, int arg1) {
        this.field1 = arg0.method296();
        if (arg1 != -23713) {
            throw new NullPointerException();
        }
        this.field2 = new int[this.field1];
        this.field3 = new int[this.field1][];
        for (int var3 = 0; var3 < this.field1; var3++) {
            this.field2[var3] = arg0.method296();
        }
        for (int var4 = 0; var4 < this.field1; var4++) {
            int var5 = arg0.method296();
            this.field3[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3[var4][var6] = arg0.method296();
            }
        }
    }
}
