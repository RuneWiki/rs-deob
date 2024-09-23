import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("USEDATIW")
public class class53 {

    @OriginalMember(owner = "USEDATIW", name = "a", descriptor = "Z")
    private boolean field1475 = true;

    @OriginalMember(owner = "USEDATIW", name = "b", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "USEDATIW", name = "c", descriptor = "[I")
    public int[] field1477;

    @OriginalMember(owner = "USEDATIW", name = "d", descriptor = "[[I")
    public int[][] field1478;

    @OriginalMember(owner = "USEDATIW", name = "<init>", descriptor = "(ZLNHEPCMLW;)V")
    public class53(boolean arg0, class35 arg1) {
        this.field1476 = arg1.method349();
        this.field1477 = new int[this.field1476];
        this.field1478 = new int[this.field1476][];
        for (int var3 = 0; var3 < this.field1476; var3++) {
            this.field1477[var3] = arg1.method349();
        }
        for (int var4 = 0; var4 < this.field1476; var4++) {
            int var5 = arg1.method349();
            this.field1478[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1478[var4][var6] = arg1.method349();
            }
        }
        if (arg0) {
            this.field1475 = !this.field1475;
        }
    }
}
