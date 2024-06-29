import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TULKBDIJ")
public class class56 {

    @OriginalMember(owner = "client!TULKBDIJ", name = "a", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!TULKBDIJ", name = "b", descriptor = "[I")
    public int[] field1449;

    @OriginalMember(owner = "client!TULKBDIJ", name = "c", descriptor = "[[I")
    public int[][] field1450;

    @OriginalMember(owner = "client!TULKBDIJ", name = "<init>", descriptor = "(LEYMNCFMK;Z)V")
    public class56(class18 arg0, boolean arg1) {
        this.field1448 = arg0.method239();
        this.field1449 = new int[this.field1448];
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1450 = new int[this.field1448][];
        for (int var4 = 0; var4 < this.field1448; var4++) {
            this.field1449[var4] = arg0.method239();
        }
        for (int var5 = 0; var5 < this.field1448; var5++) {
            int var6 = arg0.method239();
            this.field1450[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1450[var5][var7] = arg0.method239();
            }
        }
    }
}
