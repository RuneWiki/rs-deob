import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimBase {

    @OriginalMember(owner = "g", name = "a", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "g", name = "b", descriptor = "[I")
    public int[] field154;

    @OriginalMember(owner = "g", name = "c", descriptor = "[[I")
    public int[][] field155;

    @OriginalMember(owner = "g", name = "<init>", descriptor = "(Lmb;Z)V")
    public AnimBase(Packet arg0, boolean arg1) {
        this.field153 = arg0.method239();
        this.field154 = new int[this.field153];
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field155 = new int[this.field153][];
        for (int var4 = 0; var4 < this.field153; var4++) {
            this.field154[var4] = arg0.method239();
        }
        for (int var5 = 0; var5 < this.field153; var5++) {
            int var6 = arg0.method239();
            this.field155[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field155[var5][var7] = arg0.method239();
            }
        }
    }
}
