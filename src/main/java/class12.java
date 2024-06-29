import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EHKAWURP")
public class class12 {

    @OriginalMember(owner = "client!EHKAWURP", name = "a", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!EHKAWURP", name = "b", descriptor = "[I")
    public int[] field636;

    @OriginalMember(owner = "client!EHKAWURP", name = "c", descriptor = "[[I")
    public int[][] field637;

    @OriginalMember(owner = "client!EHKAWURP", name = "<init>", descriptor = "(LMNKDCXXG;Z)V")
    public class12(class37 arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        this.field635 = arg0.method386();
        this.field636 = new int[this.field635];
        this.field637 = new int[this.field635][];
        for (int var3 = 0; var3 < this.field635; var3++) {
            this.field636[var3] = arg0.method386();
        }
        for (int var4 = 0; var4 < this.field635; var4++) {
            int var5 = arg0.method386();
            this.field637[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field637[var4][var6] = arg0.method386();
            }
        }
    }
}
