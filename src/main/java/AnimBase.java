import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimBase {

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "g", name = "c", descriptor = "[I")
    public int[] field153;

    @OriginalMember(owner = "g", name = "d", descriptor = "[[I")
    public int[][] field154;

    @OriginalMember(owner = "g", name = "a", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "g", name = "<init>", descriptor = "(ILmb;)V")
    public AnimBase(int arg0, Packet arg1) {
        this.field152 = arg1.method231();
        this.field153 = new int[this.field152];
        this.field154 = new int[this.field152][];
        if (this.field151 != arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field152; var3++) {
            this.field153[var3] = arg1.method231();
        }
        for (int var4 = 0; var4 < this.field152; var4++) {
            int var5 = arg1.method231();
            this.field154[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field154[var4][var6] = arg1.method231();
            }
        }
    }
}
