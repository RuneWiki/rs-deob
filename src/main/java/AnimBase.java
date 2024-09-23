import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "f", name = "b", descriptor = "[I")
    public int[] field148;

    @OriginalMember(owner = "f", name = "c", descriptor = "[[I")
    public int[][] field149;

    @OriginalMember(owner = "f", name = "<init>", descriptor = "(ILlb;)V")
    public AnimBase(int arg0, Packet arg1) {
        this.field147 = arg1.method229();
        this.field148 = new int[this.field147];
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        this.field149 = new int[this.field147][];
        for (int var3 = 0; var3 < this.field147; var3++) {
            this.field148[var3] = arg1.method229();
        }
        for (int var4 = 0; var4 < this.field147; var4++) {
            int var5 = arg1.method229();
            this.field149[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field149[var4][var6] = arg1.method229();
            }
        }
    }
}
