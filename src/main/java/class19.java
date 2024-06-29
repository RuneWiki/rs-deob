import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IIXTARMC")
public class class19 {

    @OriginalMember(owner = "client!IIXTARMC", name = "a", descriptor = "Z")
    private boolean field833 = true;

    @OriginalMember(owner = "client!IIXTARMC", name = "b", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!IIXTARMC", name = "c", descriptor = "[I")
    public int[] field835;

    @OriginalMember(owner = "client!IIXTARMC", name = "d", descriptor = "[[I")
    public int[][] field836;

    @OriginalMember(owner = "client!IIXTARMC", name = "<init>", descriptor = "(LEMWAMCXW;I)V")
    public class19(class14 arg0, int arg1) {
        this.field834 = arg0.method217();
        this.field835 = new int[this.field834];
        this.field836 = new int[this.field834][];
        for (int var3 = 0; var3 < this.field834; var3++) {
            this.field835[var3] = arg0.method217();
        }
        for (int var4 = 0; var4 < this.field834; var4++) {
            int var5 = arg0.method217();
            this.field836[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field836[var4][var6] = arg0.method217();
            }
        }
        if (arg1 != 9) {
            this.field833 = !this.field833;
        }
    }
}
