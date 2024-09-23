import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int length;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] types;

    @OriginalMember(owner = "f", name = "a", descriptor = "[Lf;")
    public static AnimBase[] instances;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] labels;

    @OriginalMember(owner = "f", name = "a", descriptor = "(ZLub;)V")
    public static void unpack(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(363, arg1.read("base_head.dat", null, (byte) 2));
        Packet var3 = new Packet(363, arg1.read("base_type.dat", null, (byte) 2));
        Packet var4 = new Packet(363, arg1.read("base_label.dat", null, (byte) 2));
        int var5 = var2.method218();
        int var6 = var2.method218();
        instances = new AnimBase[var6 + 1];
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
            instances[var8] = new AnimBase();
            instances[var8].length = var9;
            instances[var8].types = var10;
            instances[var8].labels = var11;
        }
    }
}
