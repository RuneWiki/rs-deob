import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MOLQXLMB")
public class class46 {

    @OriginalMember(owner = "MOLQXLMB", name = "a", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "MOLQXLMB", name = "b", descriptor = "[I")
    public int[] field1205;

    @OriginalMember(owner = "MOLQXLMB", name = "c", descriptor = "[[I")
    public int[][] field1206;

    @OriginalMember(owner = "MOLQXLMB", name = "<init>", descriptor = "(LXGRGMPUQ;Z)V")
    public class46(class69 arg0, boolean arg1) {
        this.field1204 = arg0.method465();
        this.field1205 = new int[this.field1204];
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1206 = new int[this.field1204][];
        for (int var4 = 0; var4 < this.field1204; var4++) {
            this.field1205[var4] = arg0.method465();
        }
        for (int var5 = 0; var5 < this.field1204; var5++) {
            int var6 = arg0.method465();
            this.field1206[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1206[var5][var7] = arg0.method465();
            }
        }
    }
}
