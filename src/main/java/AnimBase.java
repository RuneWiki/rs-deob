import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field87;

    @OriginalMember(owner = "f", name = "a", descriptor = "[Lf;")
    public static AnimBase[] field85;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field88;

    @OriginalMember(owner = "f", name = "a", descriptor = "(Lub;Z)V")
    public static void method48(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet((byte) 64, arg0.method257(null, "base_head.dat", -31149));
        if (!arg1) {
            throw new NullPointerException();
        }
        Packet var3 = new Packet((byte) 64, arg0.method257(null, "base_type.dat", -31149));
        Packet var4 = new Packet((byte) 64, arg0.method257(null, "base_label.dat", -31149));
        int var5 = var2.method218();
        int var6 = var2.method218();
        field85 = new AnimBase[var6 + 1];
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = var2.method218();
            int var9 = var2.method216();
            int[] var10 = new int[var9];
            int[][] var11 = new int[var9][];
            for (int var12 = 0; var12 < var9; var12++) {
                var10[var12] = var3.method216();
                int var13 = var4.method216();
                var11[var12] = new int[var13];
                for (int var14 = 0; var14 < var13; var14++) {
                    var11[var12][var14] = var4.method216();
                }
            }
            field85[var8] = new AnimBase();
            field85[var8].field86 = var9;
            field85[var8].field87 = var10;
            field85[var8].field88 = var11;
        }
    }
}
