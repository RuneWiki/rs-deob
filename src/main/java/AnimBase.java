import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimBase {

    @OriginalMember(owner = "g", name = "a", descriptor = "I")
    private int field161 = -39218;

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "g", name = "c", descriptor = "[I")
    public int[] field163;

    @OriginalMember(owner = "g", name = "d", descriptor = "[[I")
    public int[][] field164;

    @OriginalMember(owner = "g", name = "<init>", descriptor = "(Lmb;I)V")
    public AnimBase(Packet arg0, int arg1) {
        this.field162 = arg0.method239();
        this.field163 = new int[this.field162];
        this.field164 = new int[this.field162][];
        if (arg1 != 12574) {
            this.field161 = 455;
        }
        for (int var3 = 0; var3 < this.field162; var3++) {
            this.field163[var3] = arg0.method239();
        }
        for (int var4 = 0; var4 < this.field162; var4++) {
            int var5 = arg0.method239();
            this.field164[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field164[var4][var6] = arg0.method239();
            }
        }
    }
}
