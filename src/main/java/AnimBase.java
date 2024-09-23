import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "f", name = "b", descriptor = "[I")
    public int[] field146;

    @OriginalMember(owner = "f", name = "c", descriptor = "[[I")
    public int[][] field147;

    @OriginalMember(owner = "f", name = "<init>", descriptor = "(ILlb;)V")
    public AnimBase(int arg0, Packet arg1) {
        this.field145 = arg1.method224();
        this.field146 = new int[this.field145];
        if (arg0 != 10470) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field147 = new int[this.field145][];
        for (int var4 = 0; var4 < this.field145; var4++) {
            this.field146[var4] = arg1.method224();
        }
        for (int var5 = 0; var5 < this.field145; var5++) {
            int var6 = arg1.method224();
            this.field147[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field147[var5][var7] = arg1.method224();
            }
        }
    }
}
