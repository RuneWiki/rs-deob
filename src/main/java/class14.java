import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GCSWWDCL")
public class class14 {

    @OriginalMember(owner = "client!GCSWWDCL", name = "a", descriptor = "I")
    private int field656 = 664;

    @OriginalMember(owner = "client!GCSWWDCL", name = "b", descriptor = "B")
    private byte field657 = -26;

    @OriginalMember(owner = "client!GCSWWDCL", name = "c", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!GCSWWDCL", name = "d", descriptor = "[I")
    public int[] field659;

    @OriginalMember(owner = "client!GCSWWDCL", name = "e", descriptor = "[[I")
    public int[][] field660;

    @OriginalMember(owner = "client!GCSWWDCL", name = "<init>", descriptor = "(BLFTMSICIZ;)V")
    public class14(byte arg0, class13 arg1) {
        this.field658 = arg1.method213();
        this.field659 = new int[this.field658];
        this.field660 = new int[this.field658][];
        for (int var3 = 0; var3 < this.field658; var3++) {
            this.field659[var3] = arg1.method213();
        }
        for (int var4 = 0; var4 < this.field658; var4++) {
            int var5 = arg1.method213();
            this.field660[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field660[var4][var6] = arg1.method213();
            }
        }
        if (this.field657 != arg0) {
            this.field656 = -271;
        }
    }
}
