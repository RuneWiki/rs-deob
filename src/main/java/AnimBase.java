import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "a", descriptor = "B")
    private static byte field82 = 4;

    @OriginalMember(owner = "f", name = "c", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "f", name = "d", descriptor = "[I")
    public int[] field85;

    @OriginalMember(owner = "f", name = "b", descriptor = "[Lf;")
    public static AnimBase[] field83;

    @OriginalMember(owner = "f", name = "e", descriptor = "[[I")
    public int[][] field86;

    @OriginalMember(owner = "f", name = "a", descriptor = "(BLub;)V")
    public static void method47(byte arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method250(field82, "base_head.dat", null), 0);
        Packet var3 = new Packet(arg1.method250(field82, "base_type.dat", null), 0);
        if (arg0 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        Packet var5 = new Packet(arg1.method250(field82, "base_label.dat", null), 0);
        int var6 = var2.method211();
        int var7 = var2.method211();
        field83 = new AnimBase[var7 + 1];
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = var2.method211();
            int var10 = var2.method209();
            int[] var11 = new int[var10];
            int[][] var12 = new int[var10][];
            for (int var13 = 0; var13 < var10; var13++) {
                var11[var13] = var3.method209();
                int var14 = var5.method209();
                var12[var13] = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    var12[var13][var15] = var5.method209();
                }
            }
            field83[var9] = new AnimBase();
            field83[var9].field84 = var10;
            field83[var9].field85 = var11;
            field83[var9].field86 = var12;
        }
    }
}
