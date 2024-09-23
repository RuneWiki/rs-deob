import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TMLYUVVT")
public class class52 {

    @OriginalMember(owner = "TMLYUVVT", name = "a", descriptor = "Z")
    private boolean field1361 = false;

    @OriginalMember(owner = "TMLYUVVT", name = "b", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "TMLYUVVT", name = "c", descriptor = "[I")
    public int[] field1363;

    @OriginalMember(owner = "TMLYUVVT", name = "d", descriptor = "[[I")
    public int[][] field1364;

    @OriginalMember(owner = "TMLYUVVT", name = "<init>", descriptor = "(ILUAWAYCTK;)V")
    public class52(int arg0, class55 arg1) {
        this.field1362 = arg1.method455();
        this.field1363 = new int[this.field1362];
        if (arg0 < 9 || arg0 > 9) {
            this.field1361 = !this.field1361;
        }
        this.field1364 = new int[this.field1362][];
        for (int var3 = 0; var3 < this.field1362; var3++) {
            this.field1363[var3] = arg1.method455();
        }
        for (int var4 = 0; var4 < this.field1362; var4++) {
            int var5 = arg1.method455();
            this.field1364[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1364[var4][var6] = arg1.method455();
            }
        }
    }
}
