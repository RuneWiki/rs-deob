import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field88;

    @OriginalMember(owner = "f", name = "a", descriptor = "[Lf;")
    public static AnimBase[] field86;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field89;

    @OriginalMember(owner = "f", name = "a", descriptor = "(Lub;I)V")
    public static void method47(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(0, arg0.method250("base_head.dat", null, 8));
        Packet var3 = new Packet(0, arg0.method250("base_type.dat", null, 8));
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        Packet var5 = new Packet(0, arg0.method250("base_label.dat", null, 8));
        int var6 = var2.method211();
        int var7 = var2.method211();
        field86 = new AnimBase[var7 + 1];
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
            field86[var9] = new AnimBase();
            field86[var9].field87 = var10;
            field86[var9].field88 = var11;
            field86[var9].field89 = var12;
        }
    }
}
