import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TJOELOUM")
public class class48 {

    @OriginalMember(owner = "TJOELOUM", name = "a", descriptor = "I")
    private int field1465 = 25735;

    @OriginalMember(owner = "TJOELOUM", name = "b", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "TJOELOUM", name = "c", descriptor = "[I")
    public int[] field1467;

    @OriginalMember(owner = "TJOELOUM", name = "d", descriptor = "[[I")
    public int[][] field1468;

    @OriginalMember(owner = "TJOELOUM", name = "<init>", descriptor = "(LGHHPHSRU;I)V")
    public class48(class14 arg0, int arg1) {
        this.field1466 = arg0.method202();
        if (arg1 <= 0) {
            this.field1465 = -81;
        }
        this.field1467 = new int[this.field1466];
        this.field1468 = new int[this.field1466][];
        for (int var3 = 0; var3 < this.field1466; var3++) {
            this.field1467[var3] = arg0.method202();
        }
        for (int var4 = 0; var4 < this.field1466; var4++) {
            int var5 = arg0.method202();
            this.field1468[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1468[var4][var6] = arg0.method202();
            }
        }
    }
}
