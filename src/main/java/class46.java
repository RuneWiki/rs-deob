import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OAUECDUZ")
public class class46 {

    @OriginalMember(owner = "OAUECDUZ", name = "a", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "OAUECDUZ", name = "b", descriptor = "[I")
    public int[] field1307;

    @OriginalMember(owner = "OAUECDUZ", name = "c", descriptor = "[[I")
    public int[][] field1308;

    @OriginalMember(owner = "OAUECDUZ", name = "<init>", descriptor = "(LEGCCHUZS;I)V")
    public class46(class15 arg0, int arg1) {
        if (arg1 != 39234) {
            throw new NullPointerException();
        }
        this.field1306 = arg0.method261();
        this.field1307 = new int[this.field1306];
        this.field1308 = new int[this.field1306][];
        for (int var3 = 0; var3 < this.field1306; var3++) {
            this.field1307[var3] = arg0.method261();
        }
        for (int var4 = 0; var4 < this.field1306; var4++) {
            int var5 = arg0.method261();
            this.field1308[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1308[var4][var6] = arg0.method261();
            }
        }
    }
}
