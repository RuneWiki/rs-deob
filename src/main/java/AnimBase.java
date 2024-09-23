import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "a", descriptor = "Z")
    private boolean field150 = true;

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field152;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field153;

    @OriginalMember(owner = "f", name = "<init>", descriptor = "(Lmb;B)V")
    public AnimBase(Packet arg0, byte arg1) {
        this.field151 = arg0.method228();
        this.field152 = new int[this.field151];
        this.field153 = new int[this.field151][];
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            this.field150 = !this.field150;
        }
        for (int var4 = 0; var4 < this.field151; var4++) {
            this.field152[var4] = arg0.method228();
        }
        for (int var5 = 0; var5 < this.field151; var5++) {
            int var6 = arg0.method228();
            this.field153[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field153[var5][var7] = arg0.method228();
            }
        }
    }
}
