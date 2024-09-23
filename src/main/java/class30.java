import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IJWJZMOM")
public class class30 {

    @OriginalMember(owner = "IJWJZMOM", name = "a", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "IJWJZMOM", name = "b", descriptor = "[I")
    public int[] field954;

    @OriginalMember(owner = "IJWJZMOM", name = "c", descriptor = "[[I")
    public int[][] field955;

    @OriginalMember(owner = "IJWJZMOM", name = "<init>", descriptor = "(ZLXOUQUKZW;)V")
    public class30(boolean arg0, class62 arg1) {
        this.field953 = arg1.method521();
        this.field954 = new int[this.field953];
        this.field955 = new int[this.field953][];
        for (int var3 = 0; var3 < this.field953; var3++) {
            this.field954[var3] = arg1.method521();
        }
        for (int var4 = 0; var4 < this.field953; var4++) {
            int var6 = arg1.method521();
            this.field955[var4] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field955[var4][var7] = arg1.method521();
            }
        }
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }
}
