import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field146;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field147;

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "f", name = "<init>", descriptor = "(ZLlb;)V")
    public AnimBase(boolean arg0, Packet arg1) {
        this.field145 = arg1.method225();
        this.field146 = new int[this.field145];
        this.field147 = new int[this.field145][];
        for (int var3 = 0; var3 < this.field145; var3++) {
            this.field146[var3] = arg1.method225();
        }
        for (int var4 = 0; var4 < this.field145; var4++) {
            int var5 = arg1.method225();
            this.field147[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field147[var4][var6] = arg1.method225();
            }
        }
        if (!arg0) {
            this.field144 = 367;
        }
    }
}
