import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XEMMPKIX")
public class class60 {

    @OriginalMember(owner = "XEMMPKIX", name = "a", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "XEMMPKIX", name = "b", descriptor = "[I")
    public int[] field1535;

    @OriginalMember(owner = "XEMMPKIX", name = "c", descriptor = "[[I")
    public int[][] field1536;

    @OriginalMember(owner = "XEMMPKIX", name = "<init>", descriptor = "(LPGNBHFUF;I)V")
    public class60(class42 arg0, int arg1) {
        this.field1534 = arg0.method420();
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        this.field1535 = new int[this.field1534];
        this.field1536 = new int[this.field1534][];
        for (int var3 = 0; var3 < this.field1534; var3++) {
            this.field1535[var3] = arg0.method420();
        }
        for (int var4 = 0; var4 < this.field1534; var4++) {
            int var5 = arg0.method420();
            this.field1536[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1536[var4][var6] = arg0.method420();
            }
        }
    }
}
