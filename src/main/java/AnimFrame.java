import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "g", name = "c", descriptor = "Lf;")
    public AnimBase field92;

    @OriginalMember(owner = "g", name = "e", descriptor = "[I")
    public int[] field94;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] field95;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field96;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field97;

    @OriginalMember(owner = "g", name = "a", descriptor = "[Lg;")
    public static AnimFrame[] field90;

    @OriginalMember(owner = "g", name = "a", descriptor = "(Lub;I)V")
    public static void method48(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(0, arg0.method250("frame_head.dat", null, 8));
        Packet var3 = new Packet(0, arg0.method250("frame_tran1.dat", null, 8));
        Packet var4 = new Packet(0, arg0.method250("frame_tran2.dat", null, 8));
        Packet var5 = new Packet(0, arg0.method250("frame_del.dat", null, 8));
        int var6 = var2.method211();
        int var7 = var2.method211();
        if (arg1 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        field90 = new AnimFrame[var7 + 1];
        int[] var9 = new int[500];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        int[] var12 = new int[500];
        for (int var13 = 0; var13 < var6; var13++) {
            int var14 = var2.method211();
            AnimFrame var15 = field90[var14] = new AnimFrame();
            var15.field91 = var5.method209();
            int var16 = var2.method211();
            AnimBase var17 = AnimBase.field86[var16];
            var15.field92 = var17;
            int var18 = var2.method209();
            int var19 = -1;
            int var20 = 0;
            for (int var21 = 0; var21 < var18; var21++) {
                int var23 = var3.method209();
                if (var23 > 0) {
                    if (var17.field88[var21] != 0) {
                        for (int var24 = var21 - 1; var24 > var19; var24--) {
                            if (var17.field88[var24] == 0) {
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
                    if (var17.field88[var9[var20]] == 3) {
                        var25 = 128;
                    }
                    if ((var23 & 0x1) == 0) {
                        var10[var20] = var25;
                    } else {
                        var10[var20] = var4.method222();
                    }
                    if ((var23 & 0x2) == 0) {
                        var11[var20] = var25;
                    } else {
                        var11[var20] = var4.method222();
                    }
                    if ((var23 & 0x4) == 0) {
                        var12[var20] = var25;
                    } else {
                        var12[var20] = var4.method222();
                    }
                    var19 = var21;
                    var20++;
                }
            }
            var15.field93 = var20;
            var15.field94 = new int[var20];
            var15.field95 = new int[var20];
            var15.field96 = new int[var20];
            var15.field97 = new int[var20];
            for (int var22 = 0; var22 < var20; var22++) {
                var15.field94[var22] = var9[var22];
                var15.field95[var22] = var10[var22];
                var15.field96[var22] = var11[var22];
                var15.field97[var22] = var12[var22];
            }
        }
    }
}
