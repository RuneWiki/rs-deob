import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "f", name = "b", descriptor = "[I")
    public int[] field144;

    @OriginalMember(owner = "f", name = "c", descriptor = "[[I")
    public int[][] field145;

    @OriginalMember(owner = "f", name = "<init>", descriptor = "(Llb;I)V")
    public AnimBase(Packet arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.field143 = arg0.method229();
        this.field144 = new int[this.field143];
        this.field145 = new int[this.field143][];
        for (int var3 = 0; var3 < this.field143; var3++) {
            this.field144[var3] = arg0.method229();
        }
        for (int var4 = 0; var4 < this.field143; var4++) {
            int var5 = arg0.method229();
            this.field145[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field145[var4][var6] = arg0.method229();
            }
        }
    }
}
