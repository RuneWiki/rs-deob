import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class AnimBase {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
    public int[] field86;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[Lf;")
    public static AnimBase[] field84;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
    public int[][] field87;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLub;)V")
    public static void method48(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(363, arg1.method257("base_head.dat", null, (byte) 2));
        Packet var3 = new Packet(363, arg1.method257("base_type.dat", null, (byte) 2));
        Packet var4 = new Packet(363, arg1.method257("base_label.dat", null, (byte) 2));
        int var5 = var2.method218();
        int var6 = var2.method218();
        field84 = new AnimBase[var6 + 1];
        if (arg0) {
            throw new NullPointerException();
        }
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
            field84[var8] = new AnimBase();
            field84[var8].field85 = var9;
            field84[var8].field86 = var10;
            field84[var8].field87 = var11;
        }
    }
}
