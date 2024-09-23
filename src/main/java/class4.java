import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ANHDGPPA")
public class class4 {

    @OriginalMember(owner = "ANHDGPPA", name = "a", descriptor = "Z")
    private boolean field36 = false;

    @OriginalMember(owner = "ANHDGPPA", name = "b", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "ANHDGPPA", name = "c", descriptor = "[I")
    public int[] field38;

    @OriginalMember(owner = "ANHDGPPA", name = "d", descriptor = "[[I")
    public int[][] field39;

    @OriginalMember(owner = "ANHDGPPA", name = "<init>", descriptor = "(ILXJCNBMKS;)V")
    public class4(int arg0, class68 arg1) {
        this.field37 = arg1.method534();
        this.field38 = new int[this.field37];
        if (arg0 <= 0) {
            this.field36 = !this.field36;
        }
        this.field39 = new int[this.field37][];
        for (int var3 = 0; var3 < this.field37; var3++) {
            this.field38[var3] = arg1.method534();
        }
        for (int var4 = 0; var4 < this.field37; var4++) {
            int var5 = arg1.method534();
            this.field39[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field39[var4][var6] = arg1.method534();
            }
        }
    }
}
