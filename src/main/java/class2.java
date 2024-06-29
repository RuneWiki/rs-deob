import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AQXKJVRI")
public class class2 {

    @OriginalMember(owner = "client!AQXKJVRI", name = "a", descriptor = "B")
    private byte field3 = 9;

    @OriginalMember(owner = "client!AQXKJVRI", name = "b", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!AQXKJVRI", name = "c", descriptor = "[I")
    public int[] field5;

    @OriginalMember(owner = "client!AQXKJVRI", name = "d", descriptor = "[[I")
    public int[][] field6;

    @OriginalMember(owner = "client!AQXKJVRI", name = "<init>", descriptor = "(LCFARFRSG;B)V")
    public class2(class8 arg0, byte arg1) {
        this.field4 = arg0.method30();
        if (this.field3 != arg1) {
            throw new NullPointerException();
        }
        this.field5 = new int[this.field4];
        this.field6 = new int[this.field4][];
        for (int var3 = 0; var3 < this.field4; var3++) {
            this.field5[var3] = arg0.method30();
        }
        for (int var4 = 0; var4 < this.field4; var4++) {
            int var5 = arg0.method30();
            this.field6[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field6[var4][var6] = arg0.method30();
            }
        }
    }
}
