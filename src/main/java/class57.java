import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!URJIIMJU")
public class class57 {

    @OriginalMember(owner = "client!URJIIMJU", name = "a", descriptor = "Z")
    private boolean field1501 = true;

    @OriginalMember(owner = "client!URJIIMJU", name = "b", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!URJIIMJU", name = "c", descriptor = "[I")
    public int[] field1503;

    @OriginalMember(owner = "client!URJIIMJU", name = "d", descriptor = "[[I")
    public int[][] field1504;

    @OriginalMember(owner = "client!URJIIMJU", name = "<init>", descriptor = "(LWNCFPLWV;I)V")
    public class57(class63 arg0, int arg1) {
        this.field1502 = arg0.method502();
        this.field1503 = new int[this.field1502];
        if (arg1 != -32222) {
            this.field1501 = !this.field1501;
        }
        this.field1504 = new int[this.field1502][];
        for (int var3 = 0; var3 < this.field1502; var3++) {
            this.field1503[var3] = arg0.method502();
        }
        for (int var4 = 0; var4 < this.field1502; var4++) {
            int var5 = arg0.method502();
            this.field1504[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1504[var4][var6] = arg0.method502();
            }
        }
    }
}
