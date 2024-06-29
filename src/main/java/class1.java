import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AECNGNXZ")
public class class1 {

    @OriginalMember(owner = "client!AECNGNXZ", name = "a", descriptor = "I")
    private int field1 = 68;

    @OriginalMember(owner = "client!AECNGNXZ", name = "b", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!AECNGNXZ", name = "c", descriptor = "[I")
    public int[] field3;

    @OriginalMember(owner = "client!AECNGNXZ", name = "d", descriptor = "[[I")
    public int[][] field4;

    @OriginalMember(owner = "client!AECNGNXZ", name = "<init>", descriptor = "(ZLGLMIQHJI;)V")
    public class1(boolean arg0, class21 arg1) {
        this.field2 = arg1.method244();
        this.field3 = new int[this.field2];
        this.field4 = new int[this.field2][];
        for (int var3 = 0; var3 < this.field2; var3++) {
            this.field3[var3] = arg1.method244();
        }
        for (int var4 = 0; var4 < this.field2; var4++) {
            int var5 = arg1.method244();
            this.field4[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4[var4][var6] = arg1.method244();
            }
        }
        if (arg0) {
            this.field1 = -402;
        }
    }
}
