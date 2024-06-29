import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FGDIESUZ")
public class class18 {

    @OriginalMember(owner = "client!FGDIESUZ", name = "a", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!FGDIESUZ", name = "b", descriptor = "[I")
    public int[] field774;

    @OriginalMember(owner = "client!FGDIESUZ", name = "c", descriptor = "[[I")
    public int[][] field775;

    @OriginalMember(owner = "client!FGDIESUZ", name = "<init>", descriptor = "(LTKPFKOXP;I)V")
    public class18(class59 arg0, int arg1) {
        this.field773 = arg0.method529();
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        this.field774 = new int[this.field773];
        this.field775 = new int[this.field773][];
        for (int var3 = 0; var3 < this.field773; var3++) {
            this.field774[var3] = arg0.method529();
        }
        for (int var4 = 0; var4 < this.field773; var4++) {
            int var5 = arg0.method529();
            this.field775[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field775[var4][var6] = arg0.method529();
            }
        }
    }
}
