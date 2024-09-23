import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JRQJNVRC")
public class class36 {

    @OriginalMember(owner = "JRQJNVRC", name = "a", descriptor = "I")
    private int field1201 = 1;

    @OriginalMember(owner = "JRQJNVRC", name = "b", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "JRQJNVRC", name = "c", descriptor = "[I")
    public int[] field1203;

    @OriginalMember(owner = "JRQJNVRC", name = "d", descriptor = "[[I")
    public int[][] field1204;

    @OriginalMember(owner = "JRQJNVRC", name = "<init>", descriptor = "(LINLHDAGO;I)V")
    public class36(class29 arg0, int arg1) {
        this.field1202 = arg0.method308();
        this.field1203 = new int[this.field1202];
        this.field1204 = new int[this.field1202][];
        for (int var3 = 0; var3 < this.field1202; var3++) {
            this.field1203[var3] = arg0.method308();
        }
        for (int var4 = 0; var4 < this.field1202; var4++) {
            int var5 = arg0.method308();
            this.field1204[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1204[var4][var6] = arg0.method308();
            }
        }
        if (arg1 != 0) {
            this.field1201 = -205;
        }
    }
}
