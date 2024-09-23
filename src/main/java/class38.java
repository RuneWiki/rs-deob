import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PCSJGLYB")
public class class38 {

    @OriginalMember(owner = "PCSJGLYB", name = "a", descriptor = "I")
    private int field983 = 30484;

    @OriginalMember(owner = "PCSJGLYB", name = "b", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "PCSJGLYB", name = "c", descriptor = "[I")
    public int[] field985;

    @OriginalMember(owner = "PCSJGLYB", name = "d", descriptor = "[[I")
    public int[][] field986;

    @OriginalMember(owner = "PCSJGLYB", name = "<init>", descriptor = "(LMQZHAILV;I)V")
    public class38(class33 arg0, int arg1) {
        this.field984 = arg0.method325();
        this.field985 = new int[this.field984];
        this.field986 = new int[this.field984][];
        if (arg1 != -14987) {
            this.field983 = -493;
        }
        for (int var3 = 0; var3 < this.field984; var3++) {
            this.field985[var3] = arg0.method325();
        }
        for (int var4 = 0; var4 < this.field984; var4++) {
            int var5 = arg0.method325();
            this.field986[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field986[var4][var6] = arg0.method325();
            }
        }
    }
}
