import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YPJRJNAP")
public class class69 {

    @OriginalMember(owner = "YPJRJNAP", name = "a", descriptor = "I")
    private int field1697 = -958;

    @OriginalMember(owner = "YPJRJNAP", name = "b", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "YPJRJNAP", name = "c", descriptor = "[I")
    public int[] field1699;

    @OriginalMember(owner = "YPJRJNAP", name = "d", descriptor = "[[I")
    public int[][] field1700;

    @OriginalMember(owner = "YPJRJNAP", name = "<init>", descriptor = "(LIMUIZRAF;I)V")
    public class69(class24 arg0, int arg1) {
        this.field1698 = arg0.method238();
        this.field1699 = new int[this.field1698];
        if (arg1 != 0) {
            this.field1697 = 46;
        }
        this.field1700 = new int[this.field1698][];
        for (int var3 = 0; var3 < this.field1698; var3++) {
            this.field1699[var3] = arg0.method238();
        }
        for (int var4 = 0; var4 < this.field1698; var4++) {
            int var5 = arg0.method238();
            this.field1700[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1700[var4][var6] = arg0.method238();
            }
        }
    }
}
