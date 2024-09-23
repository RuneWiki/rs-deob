import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimBase {

    @OriginalMember(owner = "g", name = "a", descriptor = "Z")
    private boolean field158 = true;

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "g", name = "c", descriptor = "[I")
    public int[] field160;

    @OriginalMember(owner = "g", name = "d", descriptor = "[[I")
    public int[][] field161;

    @OriginalMember(owner = "g", name = "<init>", descriptor = "(ZLmb;)V")
    public AnimBase(boolean arg0, Packet arg1) {
        this.field159 = arg1.method238();
        if (arg0) {
            this.field158 = !this.field158;
        }
        this.field160 = new int[this.field159];
        this.field161 = new int[this.field159][];
        for (int var3 = 0; var3 < this.field159; var3++) {
            this.field160[var3] = arg1.method238();
        }
        for (int var4 = 0; var4 < this.field159; var4++) {
            int var5 = arg1.method238();
            this.field161[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field161[var4][var6] = arg1.method238();
            }
        }
    }
}
