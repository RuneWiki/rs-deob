import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WHXBCNTD")
public class class63 {

    @OriginalMember(owner = "client!WHXBCNTD", name = "a", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!WHXBCNTD", name = "b", descriptor = "[I")
    public int[] field1567;

    @OriginalMember(owner = "client!WHXBCNTD", name = "c", descriptor = "[[I")
    public int[][] field1568;

    @OriginalMember(owner = "client!WHXBCNTD", name = "<init>", descriptor = "(LCMGGUSPR;I)V")
    public class63(class10 arg0, int arg1) {
        this.field1566 = arg0.method194();
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.field1567 = new int[this.field1566];
        this.field1568 = new int[this.field1566][];
        for (int var3 = 0; var3 < this.field1566; var3++) {
            this.field1567[var3] = arg0.method194();
        }
        for (int var4 = 0; var4 < this.field1566; var4++) {
            int var5 = arg0.method194();
            this.field1568[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1568[var4][var6] = arg0.method194();
            }
        }
    }
}
