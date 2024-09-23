import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("f")
public class AnimFrame {

    @OriginalMember(owner = "f", name = "a", descriptor = "I")
    private static int field72 = -377;

    @OriginalMember(owner = "f", name = "c", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "f", name = "e", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "f", name = "d", descriptor = "Le;")
    public AnimBase field75;

    @OriginalMember(owner = "f", name = "f", descriptor = "[I")
    public int[] field77;

    @OriginalMember(owner = "f", name = "g", descriptor = "[I")
    public int[] field78;

    @OriginalMember(owner = "f", name = "h", descriptor = "[I")
    public int[] field79;

    @OriginalMember(owner = "f", name = "i", descriptor = "[I")
    public int[] field80;

    @OriginalMember(owner = "f", name = "b", descriptor = "[Lf;")
    public static AnimFrame[] field73;

    @OriginalMember(owner = "f", name = "a", descriptor = "(BLtb;)V")
    public static void method34(byte arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method225(0, null, "frame_head.dat"), (byte) 63);
        Packet var3 = new Packet(arg1.method225(0, null, "frame_tran1.dat"), (byte) 63);
        Packet var4 = new Packet(arg1.method225(0, null, "frame_tran2.dat"), (byte) 63);
        if (arg0 != 4) {
            field72 = 85;
        }
        Packet var5 = new Packet(arg1.method225(0, null, "frame_del.dat"), (byte) 63);
        int var6 = var2.method187();
        int var7 = var2.method187();
        field73 = new AnimFrame[var7 + 1];
        int[] var8 = new int[500];
        int[] var9 = new int[500];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        for (int var12 = 0; var12 < var6; var12++) {
            int var13 = var2.method187();
            AnimFrame var14 = field73[var13] = new AnimFrame();
            var14.field74 = var5.method185();
            int var15 = var2.method187();
            AnimBase var16 = AnimBase.field68[var15];
            var14.field75 = var16;
            int var17 = var2.method185();
            int var18 = -1;
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                int var22 = var3.method185();
                if (var22 > 0) {
                    if (var16.field70[var20] != 0) {
                        for (int var23 = var20 - 1; var23 > var18; var23--) {
                            if (var16.field70[var23] == 0) {
                                var8[var19] = var23;
                                var9[var19] = 0;
                                var10[var19] = 0;
                                var11[var19] = 0;
                                var19++;
                                break;
                            }
                        }
                    }
                    var8[var19] = var20;
                    short var24 = 0;
                    if (var16.field70[var8[var19]] == 3) {
                        var24 = 128;
                    }
                    if ((var22 & 0x1) == 0) {
                        var9[var19] = var24;
                    } else {
                        var9[var19] = var4.method198();
                    }
                    if ((var22 & 0x2) == 0) {
                        var10[var19] = var24;
                    } else {
                        var10[var19] = var4.method198();
                    }
                    if ((var22 & 0x4) == 0) {
                        var11[var19] = var24;
                    } else {
                        var11[var19] = var4.method198();
                    }
                    var18 = var20;
                    var19++;
                }
            }
            var14.field76 = var19;
            var14.field77 = new int[var19];
            var14.field78 = new int[var19];
            var14.field79 = new int[var19];
            var14.field80 = new int[var19];
            for (int var21 = 0; var21 < var19; var21++) {
                var14.field77[var21] = var8[var21];
                var14.field78[var21] = var9[var21];
                var14.field79[var21] = var10[var21];
                var14.field80[var21] = var11[var21];
            }
        }
    }
}
