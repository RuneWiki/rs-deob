import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QICGPMWF")
public class class43 {

    @OriginalMember(owner = "client!QICGPMWF", name = "a", descriptor = "I")
    private int field1294 = 8;

    @OriginalMember(owner = "client!QICGPMWF", name = "b", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!QICGPMWF", name = "c", descriptor = "[I")
    public int[] field1296;

    @OriginalMember(owner = "client!QICGPMWF", name = "d", descriptor = "[[I")
    public int[][] field1297;

    @OriginalMember(owner = "client!QICGPMWF", name = "<init>", descriptor = "(LTQYMAXSO;I)V")
    public class43(class53 arg0, int arg1) {
        this.field1295 = arg0.method468();
        if (arg1 < this.field1294 || arg1 > this.field1294) {
            throw new NullPointerException();
        }
        this.field1296 = new int[this.field1295];
        this.field1297 = new int[this.field1295][];
        for (int var3 = 0; var3 < this.field1295; var3++) {
            this.field1296[var3] = arg0.method468();
        }
        for (int var4 = 0; var4 < this.field1295; var4++) {
            int var5 = arg0.method468();
            this.field1297[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1297[var4][var6] = arg0.method468();
            }
        }
    }
}
