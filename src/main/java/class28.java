import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JLLLGAIH")
public class class28 {

    @OriginalMember(owner = "client!JLLLGAIH", name = "a", descriptor = "Z")
    private boolean field881 = false;

    @OriginalMember(owner = "client!JLLLGAIH", name = "b", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!JLLLGAIH", name = "c", descriptor = "[I")
    public int[] field883;

    @OriginalMember(owner = "client!JLLLGAIH", name = "d", descriptor = "[[I")
    public int[][] field884;

    @OriginalMember(owner = "client!JLLLGAIH", name = "<init>", descriptor = "(LBSNPYLEV;Z)V")
    public class28(class7 arg0, boolean arg1) {
        this.field882 = arg0.method47();
        if (arg1) {
            this.field881 = !this.field881;
        }
        this.field883 = new int[this.field882];
        this.field884 = new int[this.field882][];
        for (int var3 = 0; var3 < this.field882; var3++) {
            this.field883[var3] = arg0.method47();
        }
        for (int var4 = 0; var4 < this.field882; var4++) {
            int var5 = arg0.method47();
            this.field884[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field884[var4][var6] = arg0.method47();
            }
        }
    }
}
