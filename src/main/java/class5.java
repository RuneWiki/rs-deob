import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CKXVXQFJ")
public class class5 {

    @OriginalMember(owner = "client!CKXVXQFJ", name = "a", descriptor = "Z")
    private boolean field78 = false;

    @OriginalMember(owner = "client!CKXVXQFJ", name = "b", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!CKXVXQFJ", name = "c", descriptor = "[I")
    public int[] field80;

    @OriginalMember(owner = "client!CKXVXQFJ", name = "d", descriptor = "[[I")
    public int[][] field81;

    @OriginalMember(owner = "client!CKXVXQFJ", name = "<init>", descriptor = "(ZLNQUAUMDT;)V")
    public class5(boolean arg0, class36 arg1) {
        this.field79 = arg1.method339();
        this.field80 = new int[this.field79];
        this.field81 = new int[this.field79][];
        if (arg0) {
            this.field78 = !this.field78;
        }
        for (int var3 = 0; var3 < this.field79; var3++) {
            this.field80[var3] = arg1.method339();
        }
        for (int var4 = 0; var4 < this.field79; var4++) {
            int var5 = arg1.method339();
            this.field81[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field81[var4][var6] = arg1.method339();
            }
        }
    }
}
