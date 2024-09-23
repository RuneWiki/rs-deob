import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DIQFKGVT")
public class class10 {

    @OriginalMember(owner = "DIQFKGVT", name = "a", descriptor = "Z")
    private boolean field708 = false;

    @OriginalMember(owner = "DIQFKGVT", name = "b", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "DIQFKGVT", name = "c", descriptor = "[I")
    public int[] field710;

    @OriginalMember(owner = "DIQFKGVT", name = "d", descriptor = "[[I")
    public int[][] field711;

    @OriginalMember(owner = "DIQFKGVT", name = "<init>", descriptor = "(LZOMNSJJM;I)V")
    public class10(class69 arg0, int arg1) {
        this.field709 = arg0.method547();
        this.field710 = new int[this.field709];
        this.field711 = new int[this.field709][];
        for (int var3 = 0; var3 < this.field709; var3++) {
            this.field710[var3] = arg0.method547();
        }
        for (int var4 = 0; var4 < this.field709; var4++) {
            int var5 = arg0.method547();
            this.field711[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field711[var4][var6] = arg0.method547();
            }
        }
        while (arg1 >= 0) {
            this.field708 = !this.field708;
        }
    }
}
