import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AZLXGPCM")
public class class6 {

    @OriginalMember(owner = "AZLXGPCM", name = "a", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "AZLXGPCM", name = "b", descriptor = "[I")
    public int[] field126;

    @OriginalMember(owner = "AZLXGPCM", name = "c", descriptor = "[[I")
    public int[][] field127;

    @OriginalMember(owner = "AZLXGPCM", name = "<init>", descriptor = "(ILYOXDZEVD;)V")
    public class6(int arg0, class68 arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field125 = arg1.method549();
        this.field126 = new int[this.field125];
        this.field127 = new int[this.field125][];
        for (int var3 = 0; var3 < this.field125; var3++) {
            this.field126[var3] = arg1.method549();
        }
        for (int var4 = 0; var4 < this.field125; var4++) {
            int var5 = arg1.method549();
            this.field127[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field127[var4][var6] = arg1.method549();
            }
        }
    }
}
