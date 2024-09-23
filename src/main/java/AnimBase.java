import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("e")
public class AnimBase {

    @OriginalMember(owner = "e", name = "b", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "e", name = "c", descriptor = "[I")
    public int[] field70;

    @OriginalMember(owner = "e", name = "a", descriptor = "[Le;")
    public static AnimBase[] field68;

    @OriginalMember(owner = "e", name = "d", descriptor = "[[I")
    public int[][] field71;

    @OriginalMember(owner = "e", name = "a", descriptor = "(BLtb;)V")
    public static void method33(byte arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method225(0, null, "base_head.dat"), (byte) 63);
        Packet var3 = new Packet(arg1.method225(0, null, "base_type.dat"), (byte) 63);
        if (arg0 != 4) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        Packet var5 = new Packet(arg1.method225(0, null, "base_label.dat"), (byte) 63);
        int var6 = var2.method187();
        int var7 = var2.method187();
        field68 = new AnimBase[var7 + 1];
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = var2.method187();
            int var10 = var2.method185();
            int[] var11 = new int[var10];
            int[][] var12 = new int[var10][];
            for (int var13 = 0; var13 < var10; var13++) {
                var11[var13] = var3.method185();
                int var14 = var5.method185();
                var12[var13] = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    var12[var13][var15] = var5.method185();
                }
            }
            field68[var9] = new AnimBase();
            field68[var9].field69 = var10;
            field68[var9].field70 = var11;
            field68[var9].field71 = var12;
        }
    }
}
