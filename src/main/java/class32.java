import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LMYEIVWK")
public class class32 {

    @OriginalMember(owner = "client!LMYEIVWK", name = "a", descriptor = "Z")
    private boolean field957 = true;

    @OriginalMember(owner = "client!LMYEIVWK", name = "b", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!LMYEIVWK", name = "c", descriptor = "[I")
    public int[] field959;

    @OriginalMember(owner = "client!LMYEIVWK", name = "d", descriptor = "[[I")
    public int[][] field960;

    @OriginalMember(owner = "client!LMYEIVWK", name = "<init>", descriptor = "(LRSWRPCHR;I)V")
    public class32(class50 arg0, int arg1) {
        this.field958 = arg0.method388();
        this.field959 = new int[this.field958];
        if (arg1 != 0) {
            this.field957 = !this.field957;
        }
        this.field960 = new int[this.field958][];
        for (int var3 = 0; var3 < this.field958; var3++) {
            this.field959[var3] = arg0.method388();
        }
        for (int var4 = 0; var4 < this.field958; var4++) {
            int var5 = arg0.method388();
            this.field960[var4] = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field960[var4][var6] = arg0.method388();
            }
        }
    }
}
