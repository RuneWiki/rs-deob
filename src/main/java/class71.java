import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XVBRPTSM")
public class class71 {

    @OriginalMember(owner = "XVBRPTSM", name = "a", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "XVBRPTSM", name = "b", descriptor = "[I")
    public int[] field1711;

    @OriginalMember(owner = "XVBRPTSM", name = "c", descriptor = "[[I")
    public int[][] field1712;

    @OriginalMember(owner = "XVBRPTSM", name = "<init>", descriptor = "(ILCKBTFRZM;)V")
    public class71(int arg0, class5 arg1) {
        this.field1710 = arg1.method44();
        while (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field1711 = new int[this.field1710];
        this.field1712 = new int[this.field1710][];
        for (int var3 = 0; var3 < this.field1710; var3++) {
            this.field1711[var3] = arg1.method44();
        }
        for (int var4 = 0; var4 < this.field1710; var4++) {
            int var5 = arg1.method44();
            this.field1712[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1712[var4][var6] = arg1.method44();
            }
        }
    }
}
