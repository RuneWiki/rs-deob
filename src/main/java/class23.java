import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HSGACJOH")
public class class23 {

    @OriginalMember(owner = "HSGACJOH", name = "a", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "HSGACJOH", name = "b", descriptor = "[I")
    public int[] field822;

    @OriginalMember(owner = "HSGACJOH", name = "c", descriptor = "[[I")
    public int[][] field823;

    @OriginalMember(owner = "HSGACJOH", name = "<init>", descriptor = "(BLDNRIFKTO;)V")
    public class23(byte arg0, class11 arg1) {
        this.field821 = arg1.method189();
        this.field822 = new int[this.field821];
        this.field823 = new int[this.field821][];
        if (arg0 != 70) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field821; var4++) {
            this.field822[var4] = arg1.method189();
        }
        for (int var5 = 0; var5 < this.field821; var5++) {
            int var6 = arg1.method189();
            this.field823[var5] = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field823[var5][var7] = arg1.method189();
            }
        }
    }
}
