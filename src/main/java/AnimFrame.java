import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "a", descriptor = "B")
    private static byte field87 = 4;

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    private static int field88;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "g", name = "f", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "g", name = "e", descriptor = "Lf;")
    public AnimBase field91;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field93;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field94;

    @OriginalMember(owner = "g", name = "i", descriptor = "[I")
    public int[] field95;

    @OriginalMember(owner = "g", name = "j", descriptor = "[I")
    public int[] field96;

    @OriginalMember(owner = "g", name = "c", descriptor = "[Lg;")
    public static AnimFrame[] field89;

    @OriginalMember(owner = "g", name = "a", descriptor = "(BLub;)V")
    public static void method48(byte arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method250(field87, "frame_head.dat", null), 0);
        Packet var3 = new Packet(arg1.method250(field87, "frame_tran1.dat", null), 0);
        Packet var4 = new Packet(arg1.method250(field87, "frame_tran2.dat", null), 0);
        Packet var5 = new Packet(arg1.method250(field87, "frame_del.dat", null), 0);
        int var6 = var2.method211();
        int var7 = var2.method211();
        field89 = new AnimFrame[var7 + 1];
        if (arg0 != 8) {
            field88 = 62;
        }
        int[] var8 = new int[500];
        int[] var9 = new int[500];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        for (int var12 = 0; var12 < var6; var12++) {
            int var13 = var2.method211();
            AnimFrame var14 = field89[var13] = new AnimFrame();
            var14.field90 = var5.method209();
            int var15 = var2.method211();
            AnimBase var16 = AnimBase.field83[var15];
            var14.field91 = var16;
            int var17 = var2.method209();
            int var18 = -1;
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                int var22 = var3.method209();
                if (var22 > 0) {
                    if (var16.field85[var20] != 0) {
                        for (int var23 = var20 - 1; var23 > var18; var23--) {
                            if (var16.field85[var23] == 0) {
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
                    if (var16.field85[var8[var19]] == 3) {
                        var24 = 128;
                    }
                    if ((var22 & 0x1) == 0) {
                        var9[var19] = var24;
                    } else {
                        var9[var19] = var4.method222();
                    }
                    if ((var22 & 0x2) == 0) {
                        var10[var19] = var24;
                    } else {
                        var10[var19] = var4.method222();
                    }
                    if ((var22 & 0x4) == 0) {
                        var11[var19] = var24;
                    } else {
                        var11[var19] = var4.method222();
                    }
                    var18 = var20;
                    var19++;
                }
            }
            var14.field92 = var19;
            var14.field93 = new int[var19];
            var14.field94 = new int[var19];
            var14.field95 = new int[var19];
            var14.field96 = new int[var19];
            for (int var21 = 0; var21 < var19; var21++) {
                var14.field93[var21] = var8[var21];
                var14.field94[var21] = var9[var21];
                var14.field95[var21] = var10[var21];
                var14.field96[var21] = var11[var21];
            }
        }
    }
}
