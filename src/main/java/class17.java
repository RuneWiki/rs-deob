import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ETJKXQLD")
public class class17 {

    @OriginalMember(owner = "ETJKXQLD", name = "a", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "ETJKXQLD", name = "b", descriptor = "[I")
    public int[] field706;

    @OriginalMember(owner = "ETJKXQLD", name = "c", descriptor = "[[I")
    public int[][] field707;

    @OriginalMember(owner = "ETJKXQLD", name = "<init>", descriptor = "(ZLLDILQFVA;)V")
    public class17(boolean arg0, class34 arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        this.field705 = arg1.method402();
        this.field706 = new int[this.field705];
        this.field707 = new int[this.field705][];
        for (int var3 = 0; var3 < this.field705; var3++) {
            this.field706[var3] = arg1.method402();
        }
        for (int var4 = 0; var4 < this.field705; var4++) {
            int var5 = arg1.method402();
            this.field707[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field707[var4][var6] = arg1.method402();
            }
        }
    }
}
