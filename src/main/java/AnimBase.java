import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KVCQPLIW")
public class AnimBase {

    @OriginalMember(owner = "KVCQPLIW", name = "a", descriptor = "I")
    private int _flowObfuscator1 = -588;

    @OriginalMember(owner = "KVCQPLIW", name = "b", descriptor = "I")
    public int length;

    @OriginalMember(owner = "KVCQPLIW", name = "c", descriptor = "[I")
    public int[] types;

    @OriginalMember(owner = "KVCQPLIW", name = "d", descriptor = "[[I")
    public int[][] labels;

    @OriginalMember(owner = "KVCQPLIW", name = "<init>", descriptor = "(ILMBMGIXGO;)V")
    public AnimBase(int arg0, Packet arg1) {
        this.length = arg1.g1();
        this.types = new int[this.length];
        this.labels = new int[this.length][];
        if (arg0 != 0) {
            this._flowObfuscator1 = 203;
        }
        for (int var3 = 0; var3 < this.length; var3++) {
            this.types[var3] = arg1.g1();
        }
        for (int var4 = 0; var4 < this.length; var4++) {
            int var5 = arg1.g1();
            this.labels[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.labels[var4][var6] = arg1.g1();
            }
        }
    }
}
