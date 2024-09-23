import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private static int field79 = 4;

    @OriginalMember(owner = "f", name = "b", descriptor = "Z")
    private static boolean field80 = true;

    @OriginalMember(owner = "f", name = "d", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "f", name = "e", descriptor = "[I")
    public int[] field83;

    @OriginalMember(owner = "f", name = "c", descriptor = "[Lf;")
    public static AnimBase[] field81;

    @OriginalMember(owner = "f", name = "f", descriptor = "[[I")
    public int[][] field84;

    @OriginalMember(owner = "f", name = "a", descriptor = "(BLub;)V")
    public static void method47(byte arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method249("base_head.dat", true, null), field80);
        Packet var3 = new Packet(arg1.method249("base_type.dat", true, null), field80);
        Packet var4 = new Packet(arg1.method249("base_label.dat", true, null), field80);
        int var5 = var2.method210();
        if (arg0 == 6) {
            boolean var6 = false;
        } else {
            field79 = 266;
        }
        int var7 = var2.method210();
        field81 = new AnimBase[var7 + 1];
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var2.method210();
            int var10 = var2.method208();
            int[] var11 = new int[var10];
            int[][] var12 = new int[var10][];
            for (int var13 = 0; var13 < var10; var13++) {
                var11[var13] = var3.method208();
                int var14 = var4.method208();
                var12[var13] = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    var12[var13][var15] = var4.method208();
                }
            }
            field81[var9] = new AnimBase();
            field81[var9].field82 = var10;
            field81[var9].field83 = var11;
            field81[var9].field84 = var12;
        }
    }
}
