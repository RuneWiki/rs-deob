import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XZSJUDQY")
public class class71 {

    @OriginalMember(owner = "client!XZSJUDQY", name = "a", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!XZSJUDQY", name = "b", descriptor = "[I")
    public int[] field1739;

    @OriginalMember(owner = "client!XZSJUDQY", name = "c", descriptor = "[[I")
    public int[][] field1740;

    @OriginalMember(owner = "client!XZSJUDQY", name = "<init>", descriptor = "(LWBEWPIXO;I)V")
    public class71(class58 arg0, int arg1) {
        this.field1738 = arg0.method515();
        this.field1739 = new int[this.field1738];
        this.field1740 = new int[this.field1738][];
        for (int var3 = 0; var3 < this.field1738; var3++) {
            this.field1739[var3] = arg0.method515();
        }
        for (int var4 = 0; var4 < this.field1738; var4++) {
            int var5 = arg0.method515();
            this.field1740[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1740[var4][var6] = arg0.method515();
            }
        }
        if (arg1 != 0) {
            throw new NullPointerException();
        }
    }
}
