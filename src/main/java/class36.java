import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MXTMAEWO")
public class class36 {

    @OriginalMember(owner = "MXTMAEWO", name = "b", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "MXTMAEWO", name = "a", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "MXTMAEWO", name = "c", descriptor = "[I")
    public int[] field1116;

    @OriginalMember(owner = "MXTMAEWO", name = "d", descriptor = "[[I")
    public int[][] field1117;

    @OriginalMember(owner = "MXTMAEWO", name = "<init>", descriptor = "(BLEILHLJCE;)V")
    public class36(byte arg0, class17 arg1) {
        this.field1115 = arg1.method224();
        if (arg0 != -89) {
            this.field1114 = -143;
        }
        this.field1116 = new int[this.field1115];
        this.field1117 = new int[this.field1115][];
        for (int var3 = 0; var3 < this.field1115; var3++) {
            this.field1116[var3] = arg1.method224();
        }
        for (int var4 = 0; var4 < this.field1115; var4++) {
            int var5 = arg1.method224();
            this.field1117[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1117[var4][var6] = arg1.method224();
            }
        }
    }
}
