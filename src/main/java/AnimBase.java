import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VPIFXIOD")
public class AnimBase {

    @OriginalMember(owner = "client!VPIFXIOD", name = "a", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!VPIFXIOD", name = "b", descriptor = "[I")
    public int[] field1501;

    @OriginalMember(owner = "client!VPIFXIOD", name = "c", descriptor = "[[I")
    public int[][] field1502;

    @OriginalMember(owner = "client!VPIFXIOD", name = "<init>", descriptor = "(LMFMVIYHT;I)V")
    public AnimBase(Packet arg0, int arg1) {
        this.field1500 = arg0.g1();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1501 = new int[this.field1500];
        this.field1502 = new int[this.field1500][];
        for (int var3 = 0; var3 < this.field1500; var3++) {
            this.field1501[var3] = arg0.g1();
        }
        for (int var4 = 0; var4 < this.field1500; var4++) {
            int var5 = arg0.g1();
            this.field1502[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1502[var4][var6] = arg0.g1();
            }
        }
    }
}
