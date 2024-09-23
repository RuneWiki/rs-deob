import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "b", descriptor = "Z")
    private static boolean field86 = true;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "g", name = "f", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "g", name = "e", descriptor = "Lf;")
    public AnimBase field89;

    @OriginalMember(owner = "g", name = "a", descriptor = "Z")
    private static boolean field85;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field91;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field92;

    @OriginalMember(owner = "g", name = "i", descriptor = "[I")
    public int[] field93;

    @OriginalMember(owner = "g", name = "j", descriptor = "[I")
    public int[] field94;

    @OriginalMember(owner = "g", name = "c", descriptor = "[Lg;")
    public static AnimFrame[] field87;

    @OriginalMember(owner = "g", name = "a", descriptor = "(BLub;)V")
    public static void method48(byte arg0, Jagfile arg1) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            field85 = !field85;
        }
        Packet var3 = new Packet(arg1.method249("frame_head.dat", true, null), field86);
        Packet var4 = new Packet(arg1.method249("frame_tran1.dat", true, null), field86);
        Packet var5 = new Packet(arg1.method249("frame_tran2.dat", true, null), field86);
        Packet var6 = new Packet(arg1.method249("frame_del.dat", true, null), field86);
        int var7 = var3.method210();
        int var8 = var3.method210();
        field87 = new AnimFrame[var8 + 1];
        int[] var9 = new int[500];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        int[] var12 = new int[500];
        for (int var13 = 0; var13 < var7; var13++) {
            int var14 = var3.method210();
            AnimFrame var15 = field87[var14] = new AnimFrame();
            var15.field88 = var6.method208();
            int var16 = var3.method210();
            AnimBase var17 = AnimBase.field81[var16];
            var15.field89 = var17;
            int var18 = var3.method208();
            int var19 = -1;
            int var20 = 0;
            for (int var21 = 0; var21 < var18; var21++) {
                int var23 = var4.method208();
                if (var23 > 0) {
                    if (var17.field83[var21] != 0) {
                        for (int var24 = var21 - 1; var24 > var19; var24--) {
                            if (var17.field83[var24] == 0) {
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
                    if (var17.field83[var9[var20]] == 3) {
                        var25 = 128;
                    }
                    if ((var23 & 0x1) == 0) {
                        var10[var20] = var25;
                    } else {
                        var10[var20] = var5.method221();
                    }
                    if ((var23 & 0x2) == 0) {
                        var11[var20] = var25;
                    } else {
                        var11[var20] = var5.method221();
                    }
                    if ((var23 & 0x4) == 0) {
                        var12[var20] = var25;
                    } else {
                        var12[var20] = var5.method221();
                    }
                    var19 = var21;
                    var20++;
                }
            }
            var15.field90 = var20;
            var15.field91 = new int[var20];
            var15.field92 = new int[var20];
            var15.field93 = new int[var20];
            var15.field94 = new int[var20];
            for (int var22 = 0; var22 < var20; var22++) {
                var15.field91[var22] = var9[var22];
                var15.field92[var22] = var10[var22];
                var15.field93[var22] = var11[var22];
                var15.field94[var22] = var12[var22];
            }
        }
    }
}
