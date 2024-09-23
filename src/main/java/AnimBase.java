import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimBase {

    @OriginalMember(owner = "g", name = "a", descriptor = "Z")
    private boolean field170 = false;

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    private int field171 = 32319;

    @OriginalMember(owner = "g", name = "c", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "g", name = "d", descriptor = "[I")
    public int[] field173;

    @OriginalMember(owner = "g", name = "e", descriptor = "[[I")
    public int[][] field174;

    @OriginalMember(owner = "g", name = "<init>", descriptor = "(ZLmb;)V")
    public AnimBase(boolean arg0, Packet arg1) {
        this.field172 = arg1.method239();
        if (arg0) {
            this.field171 = -65;
        }
        this.field173 = new int[this.field172];
        this.field174 = new int[this.field172][];
        for (int var3 = 0; var3 < this.field172; var3++) {
            this.field173[var3] = arg1.method239();
        }
        for (int var4 = 0; var4 < this.field172; var4++) {
            int var5 = arg1.method239();
            this.field174[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field174[var4][var6] = arg1.method239();
            }
        }
    }
}
