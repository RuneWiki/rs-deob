import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QZXSFRVC")
public class class47 {

    @OriginalMember(owner = "client!QZXSFRVC", name = "a", descriptor = "Z")
    private boolean field1327 = true;

    @OriginalMember(owner = "client!QZXSFRVC", name = "b", descriptor = "I")
    private int field1328 = -32392;

    @OriginalMember(owner = "client!QZXSFRVC", name = "c", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!QZXSFRVC", name = "d", descriptor = "[I")
    public int[] field1330;

    @OriginalMember(owner = "client!QZXSFRVC", name = "e", descriptor = "[[I")
    public int[][] field1331;

    @OriginalMember(owner = "client!QZXSFRVC", name = "<init>", descriptor = "(ZLLBBVYYXO;)V")
    public class47(boolean arg0, class32 arg1) {
        this.field1329 = arg1.method369();
        if (!arg0) {
            this.field1328 = 149;
        }
        this.field1330 = new int[this.field1329];
        this.field1331 = new int[this.field1329][];
        for (int var3 = 0; var3 < this.field1329; var3++) {
            this.field1330[var3] = arg1.method369();
        }
        for (int var4 = 0; var4 < this.field1329; var4++) {
            int var5 = arg1.method369();
            this.field1331[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1331[var4][var6] = arg1.method369();
            }
        }
    }
}
