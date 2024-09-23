import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimBase {

    @OriginalMember(owner = "f", name = "b", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "f", name = "c", descriptor = "[I")
    public int[] field80;

    @OriginalMember(owner = "f", name = "a", descriptor = "[Lf;")
    public static AnimBase[] field78;

    @OriginalMember(owner = "f", name = "d", descriptor = "[[I")
    public int[][] field81;

    @OriginalMember(owner = "f", name = "a", descriptor = "(ILub;)V")
    public static void method47(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method242((byte) 6, null, "base_head.dat"), 4);
        Packet var3 = new Packet(arg1.method242((byte) 6, null, "base_type.dat"), 4);
        Packet var4 = new Packet(arg1.method242((byte) 6, null, "base_label.dat"), 4);
        int var5 = var2.method203();
        int var6 = 7 / arg0;
        int var7 = var2.method203();
        field78 = new AnimBase[var7 + 1];
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var2.method203();
            int var10 = var2.method201();
            int[] var11 = new int[var10];
            int[][] var12 = new int[var10][];
            for (int var13 = 0; var13 < var10; var13++) {
                var11[var13] = var3.method201();
                int var14 = var4.method201();
                var12[var13] = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    var12[var13][var15] = var4.method201();
                }
            }
            field78[var9] = new AnimBase();
            field78[var9].field79 = var10;
            field78[var9].field80 = var11;
            field78[var9].field81 = var12;
        }
    }
}
