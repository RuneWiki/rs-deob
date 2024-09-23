import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimBase {

    @OriginalMember(owner = "g", name = "a", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "g", name = "b", descriptor = "[I")
    public int[] field160;

    @OriginalMember(owner = "g", name = "c", descriptor = "[[I")
    public int[][] field161;

    @OriginalMember(owner = "g", name = "<init>", descriptor = "(Lmb;Z)V")
    public AnimBase(Packet arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        this.field159 = arg0.method239();
        this.field160 = new int[this.field159];
        this.field161 = new int[this.field159][];
        for (int var3 = 0; var3 < this.field159; var3++) {
            this.field160[var3] = arg0.method239();
        }
        for (int var4 = 0; var4 < this.field159; var4++) {
            int var5 = arg0.method239();
            this.field161[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field161[var4][var6] = arg0.method239();
            }
        }
    }
}
