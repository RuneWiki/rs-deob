import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private int field145 = 1;

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field147;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field148;

    @OriginalMember(owner = "f", name = "<init>", descriptor = "(Llb;I)V")
    public AnimBase(Packet arg0, int arg1) {
        this.field146 = arg0.method229();
        this.field147 = new int[this.field146];
        this.field148 = new int[this.field146][];
        for (int var3 = 0; var3 < this.field146; var3++) {
            this.field147[var3] = arg0.method229();
        }
        for (int var4 = 0; var4 < this.field146; var4++) {
            int var5 = arg0.method229();
            this.field148[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field148[var4][var6] = arg0.method229();
            }
        }
        if (arg1 >= 0) {
            this.field145 = -254;
        }
    }
}
