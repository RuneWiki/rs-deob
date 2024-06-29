import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RHIQJAPF")
public class class50 {

    @OriginalMember(owner = "client!RHIQJAPF", name = "a", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!RHIQJAPF", name = "b", descriptor = "[I")
    public int[] field1437;

    @OriginalMember(owner = "client!RHIQJAPF", name = "c", descriptor = "[[I")
    public int[][] field1438;

    @OriginalMember(owner = "client!RHIQJAPF", name = "<init>", descriptor = "(LMVHXDWGI;I)V")
    public class50(class38 arg0, int arg1) {
        this.field1436 = arg0.method357();
        int var3 = 76 / arg1;
        this.field1437 = new int[this.field1436];
        this.field1438 = new int[this.field1436][];
        for (int var4 = 0; var4 < this.field1436; var4++) {
            this.field1437[var4] = arg0.method357();
        }
        for (int var5 = 0; var5 < this.field1436; var5++) {
            int var6 = arg0.method357();
            this.field1438[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1438[var5][var7] = arg0.method357();
            }
        }
    }
}
