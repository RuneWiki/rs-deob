import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimBase {

    @OriginalMember(owner = "g", name = "a", descriptor = "Z")
    private boolean field147 = false;

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "g", name = "c", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "g", name = "d", descriptor = "[[I")
    public int[][] field150;

    @OriginalMember(owner = "g", name = "<init>", descriptor = "(BLmb;)V")
    public AnimBase(byte arg0, Packet arg1) {
        this.field148 = arg1.method231();
        if (arg0 != 79) {
            this.field147 = !this.field147;
        }
        this.field149 = new int[this.field148];
        this.field150 = new int[this.field148][];
        for (int var3 = 0; var3 < this.field148; var3++) {
            this.field149[var3] = arg1.method231();
        }
        for (int var4 = 0; var4 < this.field148; var4++) {
            int var5 = arg1.method231();
            this.field150[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field150[var4][var6] = arg1.method231();
            }
        }
    }
}
