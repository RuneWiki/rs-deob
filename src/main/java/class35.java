import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MJPGHGEY")
public class class35 {

    @OriginalMember(owner = "client!MJPGHGEY", name = "a", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!MJPGHGEY", name = "b", descriptor = "[I")
    public int[] field1140;

    @OriginalMember(owner = "client!MJPGHGEY", name = "c", descriptor = "[[I")
    public int[][] field1141;

    @OriginalMember(owner = "client!MJPGHGEY", name = "<init>", descriptor = "(LPQBRPYKE;I)V")
    public class35(class41 arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1139 = arg0.method340();
        this.field1140 = new int[this.field1139];
        this.field1141 = new int[this.field1139][];
        for (int var4 = 0; var4 < this.field1139; var4++) {
            this.field1140[var4] = arg0.method340();
        }
        for (int var5 = 0; var5 < this.field1139; var5++) {
            int var6 = arg0.method340();
            this.field1141[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1141[var5][var7] = arg0.method340();
            }
        }
    }
}
