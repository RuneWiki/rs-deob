import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class AnimFrame {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lf;")
    public AnimBase field90;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[I")
    public int[] field92;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "[I")
    public int[] field93;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[I")
    public int[] field94;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
    public int[] field95;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "[Lg;")
    public static AnimFrame[] field88;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLub;)V")
    public static void method49(boolean arg0, Jagfile arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        Packet var2 = new Packet(363, arg1.method257("frame_head.dat", null, (byte) 2));
        Packet var3 = new Packet(363, arg1.method257("frame_tran1.dat", null, (byte) 2));
        Packet var4 = new Packet(363, arg1.method257("frame_tran2.dat", null, (byte) 2));
        Packet var5 = new Packet(363, arg1.method257("frame_del.dat", null, (byte) 2));
        int var6 = var2.method218();
        int var7 = var2.method218();
        field88 = new AnimFrame[var7 + 1];
        int[] var8 = new int[500];
        int[] var9 = new int[500];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        for (int var12 = 0; var12 < var6; var12++) {
            int var13 = var2.method218();
            AnimFrame var14 = field88[var13] = new AnimFrame();
            var14.field89 = var5.method216();
            int var15 = var2.method218();
            AnimBase var16 = AnimBase.field84[var15];
            var14.field90 = var16;
            int var17 = var2.method216();
            int var18 = -1;
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                int var22 = var3.method216();
                if (var22 > 0) {
                    if (var16.field86[var20] != 0) {
                        for (int var23 = var20 - 1; var23 > var18; var23--) {
                            if (var16.field86[var23] == 0) {
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
                    if (var16.field86[var8[var19]] == 3) {
                        var24 = 128;
                    }
                    if ((var22 & 0x1) == 0) {
                        var9[var19] = var24;
                    } else {
                        var9[var19] = var4.method229();
                    }
                    if ((var22 & 0x2) == 0) {
                        var10[var19] = var24;
                    } else {
                        var10[var19] = var4.method229();
                    }
                    if ((var22 & 0x4) == 0) {
                        var11[var19] = var24;
                    } else {
                        var11[var19] = var4.method229();
                    }
                    var18 = var20;
                    var19++;
                }
            }
            var14.field91 = var19;
            var14.field92 = new int[var19];
            var14.field93 = new int[var19];
            var14.field94 = new int[var19];
            var14.field95 = new int[var19];
            for (int var21 = 0; var21 < var19; var21++) {
                var14.field92[var21] = var8[var21];
                var14.field93[var21] = var9[var21];
                var14.field94[var21] = var10[var21];
                var14.field95[var21] = var11[var21];
            }
        }
    }
}
