import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "g", name = "c", descriptor = "Lf;")
    public AnimBase field91;

    @OriginalMember(owner = "g", name = "e", descriptor = "[I")
    public int[] field93;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] field94;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field95;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field96;

    @OriginalMember(owner = "g", name = "a", descriptor = "[Lg;")
    public static AnimFrame[] field89;

    @OriginalMember(owner = "g", name = "a", descriptor = "(Lub;Z)V")
    public static void method49(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet((byte) 64, arg0.method257(null, "frame_head.dat", -31149));
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        Packet var4 = new Packet((byte) 64, arg0.method257(null, "frame_tran1.dat", -31149));
        Packet var5 = new Packet((byte) 64, arg0.method257(null, "frame_tran2.dat", -31149));
        Packet var6 = new Packet((byte) 64, arg0.method257(null, "frame_del.dat", -31149));
        int var7 = var2.method218();
        int var8 = var2.method218();
        field89 = new AnimFrame[var8 + 1];
        int[] var9 = new int[500];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        int[] var12 = new int[500];
        for (int var13 = 0; var13 < var7; var13++) {
            int var14 = var2.method218();
            AnimFrame var15 = field89[var14] = new AnimFrame();
            var15.field90 = var6.method216();
            int var16 = var2.method218();
            AnimBase var17 = AnimBase.field85[var16];
            var15.field91 = var17;
            int var18 = var2.method216();
            int var19 = -1;
            int var20 = 0;
            for (int var21 = 0; var21 < var18; var21++) {
                int var23 = var4.method216();
                if (var23 > 0) {
                    if (var17.field87[var21] != 0) {
                        for (int var24 = var21 - 1; var24 > var19; var24--) {
                            if (var17.field87[var24] == 0) {
                                var9[var20] = var24;
                                var10[var20] = 0;
                                var11[var20] = 0;
                                var12[var20] = 0;
                                var20++;
                                break;
                            }
                        }
                    }
                    var9[var20] = var21;
                    short var25 = 0;
                    if (var17.field87[var9[var20]] == 3) {
                        var25 = 128;
                    }
                    if ((var23 & 0x1) == 0) {
                        var10[var20] = var25;
                    } else {
                        var10[var20] = var5.method229();
                    }
                    if ((var23 & 0x2) == 0) {
                        var11[var20] = var25;
                    } else {
                        var11[var20] = var5.method229();
                    }
                    if ((var23 & 0x4) == 0) {
                        var12[var20] = var25;
                    } else {
                        var12[var20] = var5.method229();
                    }
                    var19 = var21;
                    var20++;
                }
            }
            var15.field92 = var20;
            var15.field93 = new int[var20];
            var15.field94 = new int[var20];
            var15.field95 = new int[var20];
            var15.field96 = new int[var20];
            for (int var22 = 0; var22 < var20; var22++) {
                var15.field93[var22] = var9[var22];
                var15.field94[var22] = var10[var22];
                var15.field95[var22] = var11[var22];
                var15.field96[var22] = var12[var22];
            }
        }
    }
}
