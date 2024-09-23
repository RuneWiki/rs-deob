import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KLNBCMBU")
public class class29 {

    @OriginalMember(owner = "KLNBCMBU", name = "a", descriptor = "B")
    private byte field1044 = 2;

    @OriginalMember(owner = "KLNBCMBU", name = "b", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "KLNBCMBU", name = "c", descriptor = "[I")
    public int[] field1046;

    @OriginalMember(owner = "KLNBCMBU", name = "d", descriptor = "[[I")
    public int[][] field1047;

    @OriginalMember(owner = "KLNBCMBU", name = "<init>", descriptor = "(LBJPWOXRJ;B)V")
    public class29(class3 arg0, byte arg1) {
        this.field1045 = arg0.method15();
        if (this.field1044 == arg1) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1046 = new int[this.field1045];
        this.field1047 = new int[this.field1045][];
        for (int var5 = 0; var5 < this.field1045; var5++) {
            this.field1046[var5] = arg0.method15();
        }
        for (int var6 = 0; var6 < this.field1045; var6++) {
            int var7 = arg0.method15();
            this.field1047[var6] = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1047[var6][var8] = arg0.method15();
            }
        }
    }
}
