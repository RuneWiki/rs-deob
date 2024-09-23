import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private int field150 = 117;

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field152;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field153;

    @OriginalMember(owner = "f", name = "<init>", descriptor = "(Llb;I)V")
    public AnimBase(Packet arg0, int arg1) {
        if (arg1 <= 0) {
            this.field150 = 28;
        }
        this.field151 = arg0.method229();
        this.field152 = new int[this.field151];
        this.field153 = new int[this.field151][];
        for (int var3 = 0; var3 < this.field151; var3++) {
            this.field152[var3] = arg0.method229();
        }
        for (int var4 = 0; var4 < this.field151; var4++) {
            int var5 = arg0.method229();
            this.field153[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field153[var4][var6] = arg0.method229();
            }
        }
    }
}
