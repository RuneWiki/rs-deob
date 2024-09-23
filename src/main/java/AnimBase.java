import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field150;

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "f", name = "<init>", descriptor = "(Llb;Z)V")
    public AnimBase(Packet arg0, boolean arg1) {
        this.field148 = arg0.method229();
        this.field149 = new int[this.field148];
        this.field150 = new int[this.field148][];
        if (arg1) {
            this.field147 = 32;
        }
        for (int var3 = 0; var3 < this.field148; var3++) {
            this.field149[var3] = arg0.method229();
        }
        for (int var4 = 0; var4 < this.field148; var4++) {
            int var5 = arg0.method229();
            this.field150[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field150[var4][var6] = arg0.method229();
            }
        }
    }
}
