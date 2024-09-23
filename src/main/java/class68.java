import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YRWSITPW")
public class class68 {

    @OriginalMember(owner = "YRWSITPW", name = "b", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "YRWSITPW", name = "c", descriptor = "[I")
    public int[] field1634;

    @OriginalMember(owner = "YRWSITPW", name = "d", descriptor = "[[I")
    public int[][] field1635;

    @OriginalMember(owner = "YRWSITPW", name = "a", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "YRWSITPW", name = "<init>", descriptor = "(LXQPFGONL;B)V")
    public class68(class62 arg0, byte arg1) {
        this.field1633 = arg0.method478();
        this.field1634 = new int[this.field1633];
        this.field1635 = new int[this.field1633][];
        for (int var3 = 0; var3 < this.field1633; var3++) {
            this.field1634[var3] = arg0.method478();
        }
        for (int var4 = 0; var4 < this.field1633; var4++) {
            int var5 = arg0.method478();
            this.field1635[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1635[var4][var6] = arg0.method478();
            }
        }
        if (arg1 != 70) {
            this.field1632 = 243;
        }
    }
}
