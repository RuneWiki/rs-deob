import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WPDTVMXY")
public class class68 {

    @OriginalMember(owner = "WPDTVMXY", name = "a", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "WPDTVMXY", name = "b", descriptor = "[I")
    public int[] field1632;

    @OriginalMember(owner = "WPDTVMXY", name = "c", descriptor = "[[I")
    public int[][] field1633;

    @OriginalMember(owner = "WPDTVMXY", name = "<init>", descriptor = "(LPKHWFJLM;Z)V")
    public class68(class43 arg0, boolean arg1) {
        this.field1631 = arg0.method330();
        this.field1632 = new int[this.field1631];
        this.field1633 = new int[this.field1631][];
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field1631; var4++) {
            this.field1632[var4] = arg0.method330();
        }
        for (int var5 = 0; var5 < this.field1631; var5++) {
            int var6 = arg0.method330();
            this.field1633[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1633[var5][var7] = arg0.method330();
            }
        }
    }
}
