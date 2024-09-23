import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "g", name = "c", descriptor = "Lf;")
    public AnimBase field84;

    @OriginalMember(owner = "g", name = "e", descriptor = "[I")
    public int[] field86;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] field87;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field88;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field89;

    @OriginalMember(owner = "g", name = "a", descriptor = "[Lg;")
    public static AnimFrame[] field82;

    @OriginalMember(owner = "g", name = "a", descriptor = "(ILub;)V")
    public static void method48(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method242((byte) 6, null, "frame_head.dat"), 4);
        Packet var3 = new Packet(arg1.method242((byte) 6, null, "frame_tran1.dat"), 4);
        Packet var4 = new Packet(arg1.method242((byte) 6, null, "frame_tran2.dat"), 4);
        Packet var5 = new Packet(arg1.method242((byte) 6, null, "frame_del.dat"), 4);
        int var6 = 31 / arg0;
        int var7 = var2.method203();
        int var8 = var2.method203();
        field82 = new AnimFrame[var8 + 1];
        int[] var9 = new int[500];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        int[] var12 = new int[500];
        for (int var13 = 0; var13 < var7; var13++) {
            int var14 = var2.method203();
            AnimFrame var15 = field82[var14] = new AnimFrame();
            var15.field83 = var5.method201();
            int var16 = var2.method203();
            AnimBase var17 = AnimBase.field78[var16];
            var15.field84 = var17;
            int var18 = var2.method201();
            int var19 = -1;
            int var20 = 0;
            for (int var21 = 0; var21 < var18; var21++) {
                int var23 = var3.method201();
                if (var23 > 0) {
                    if (var17.field80[var21] != 0) {
                        for (int var24 = var21 - 1; var24 > var19; var24--) {
                            if (var17.field80[var24] == 0) {
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
                    if (var17.field80[var9[var20]] == 3) {
                        var25 = 128;
                    }
                    if ((var23 & 0x1) == 0) {
                        var10[var20] = var25;
                    } else {
                        var10[var20] = var4.method214();
                    }
                    if ((var23 & 0x2) == 0) {
                        var11[var20] = var25;
                    } else {
                        var11[var20] = var4.method214();
                    }
                    if ((var23 & 0x4) == 0) {
                        var12[var20] = var25;
                    } else {
                        var12[var20] = var4.method214();
                    }
                    var19 = var21;
                    var20++;
                }
            }
            var15.field85 = var20;
            var15.field86 = new int[var20];
            var15.field87 = new int[var20];
            var15.field88 = new int[var20];
            var15.field89 = new int[var20];
            for (int var22 = 0; var22 < var20; var22++) {
                var15.field86[var22] = var9[var22];
                var15.field87[var22] = var10[var22];
                var15.field88[var22] = var11[var22];
                var15.field89[var22] = var12[var22];
            }
        }
    }
}
