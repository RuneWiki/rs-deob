import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MJXROMKT")
public class class32 {

    @OriginalMember(owner = "client!MJXROMKT", name = "a", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!MJXROMKT", name = "b", descriptor = "[I")
    public int[] field986;

    @OriginalMember(owner = "client!MJXROMKT", name = "c", descriptor = "[[I")
    public int[][] field987;

    @OriginalMember(owner = "client!MJXROMKT", name = "<init>", descriptor = "(ZLSVWJKJVI;)V")
    public class32(boolean arg0, class52 arg1) {
        this.field985 = arg1.method461();
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field986 = new int[this.field985];
        this.field987 = new int[this.field985][];
        for (int var3 = 0; var3 < this.field985; var3++) {
            this.field986[var3] = arg1.method461();
        }
        for (int var4 = 0; var4 < this.field985; var4++) {
            int var5 = arg1.method461();
            this.field987[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field987[var4][var6] = arg1.method461();
            }
        }
    }
}
