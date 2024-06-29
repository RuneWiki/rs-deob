import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EPQQXCGW")
public class class16 {

    @OriginalMember(owner = "client!EPQQXCGW", name = "a", descriptor = "Z")
    private boolean field728 = false;

    @OriginalMember(owner = "client!EPQQXCGW", name = "b", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!EPQQXCGW", name = "c", descriptor = "[I")
    public int[] field730;

    @OriginalMember(owner = "client!EPQQXCGW", name = "d", descriptor = "[[I")
    public int[][] field731;

    @OriginalMember(owner = "client!EPQQXCGW", name = "<init>", descriptor = "(ZLIUVBENCV;)V")
    public class16(boolean arg0, class25 arg1) {
        this.field729 = arg1.method245();
        this.field730 = new int[this.field729];
        if (!arg0) {
            this.field728 = !this.field728;
        }
        this.field731 = new int[this.field729][];
        for (int var3 = 0; var3 < this.field729; var3++) {
            this.field730[var3] = arg1.method245();
        }
        for (int var4 = 0; var4 < this.field729; var4++) {
            int var5 = arg1.method245();
            this.field731[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field731[var4][var6] = arg1.method245();
            }
        }
    }
}
