import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field83;

    @OriginalMember(owner = "f", name = "a", descriptor = "[Lf;")
    public static AnimBase[] field81;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field84;

    @OriginalMember(owner = "f", name = "a", descriptor = "(Lub;B)V")
    public static void method47(Jagfile arg0, byte arg1) {
        Packet var2 = new Packet(575, arg0.method250(null, 3, "base_head.dat"));
        Packet var3 = new Packet(575, arg0.method250(null, 3, "base_type.dat"));
        Packet var4 = new Packet(575, arg0.method250(null, 3, "base_label.dat"));
        int var5 = var2.method211();
        int var6 = var2.method211();
        field81 = new AnimBase[var6 + 1];
        for (int var7 = 0; var7 < var5; var7++) {
            int var9 = var2.method211();
            int var10 = var2.method209();
            int[] var11 = new int[var10];
            int[][] var12 = new int[var10][];
            for (int var13 = 0; var13 < var10; var13++) {
                var11[var13] = var3.method209();
                int var14 = var4.method209();
                var12[var13] = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    var12[var13][var15] = var4.method209();
                }
            }
            field81[var9] = new AnimBase();
            field81[var9].field82 = var10;
            field81[var9].field83 = var11;
            field81[var9].field84 = var12;
        }
        if (arg1 != 6) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }
}
