import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "g", name = "c", descriptor = "Lf;")
    public AnimBase field87;

    @OriginalMember(owner = "g", name = "e", descriptor = "[I")
    public int[] field89;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] field90;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] field91;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] field92;

    @OriginalMember(owner = "g", name = "a", descriptor = "[Lg;")
    public static AnimFrame[] field85;

    @OriginalMember(owner = "g", name = "a", descriptor = "(Lub;B)V")
    public static void method48(Jagfile arg0, byte arg1) {
        Packet var2 = new Packet(575, arg0.method250(null, 3, "frame_head.dat"));
        Packet var3 = new Packet(575, arg0.method250(null, 3, "frame_tran1.dat"));
        Packet var4 = new Packet(575, arg0.method250(null, 3, "frame_tran2.dat"));
        Packet var5 = new Packet(575, arg0.method250(null, 3, "frame_del.dat"));
        if (arg1 == 6) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = var2.method211();
        int var9 = var2.method211();
        field85 = new AnimFrame[var9 + 1];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        int[] var12 = new int[500];
        int[] var13 = new int[500];
        for (int var14 = 0; var14 < var8; var14++) {
            int var15 = var2.method211();
            AnimFrame var16 = field85[var15] = new AnimFrame();
            var16.field86 = var5.method209();
            int var17 = var2.method211();
            AnimBase var18 = AnimBase.field81[var17];
            var16.field87 = var18;
            int var19 = var2.method209();
            int var20 = -1;
            int var21 = 0;
            for (int var22 = 0; var22 < var19; var22++) {
                int var24 = var3.method209();
                if (var24 > 0) {
                    if (var18.field83[var22] != 0) {
                        for (int var25 = var22 - 1; var25 > var20; var25--) {
                            if (var18.field83[var25] == 0) {
                                var10[var21] = var25;
                                var11[var21] = 0;
                                var12[var21] = 0;
                                var13[var21] = 0;
                                var21++;
                                break;
                            }
                        }
                    }
                    var10[var21] = var22;
                    short var26 = 0;
                    if (var18.field83[var10[var21]] == 3) {
                        var26 = 128;
                    }
                    if ((var24 & 0x1) == 0) {
                        var11[var21] = var26;
                    } else {
                        var11[var21] = var4.method222();
                    }
                    if ((var24 & 0x2) == 0) {
                        var12[var21] = var26;
                    } else {
                        var12[var21] = var4.method222();
                    }
                    if ((var24 & 0x4) == 0) {
                        var13[var21] = var26;
                    } else {
                        var13[var21] = var4.method222();
                    }
                    var20 = var22;
                    var21++;
                }
            }
            var16.field88 = var21;
            var16.field89 = new int[var21];
            var16.field90 = new int[var21];
            var16.field91 = new int[var21];
            var16.field92 = new int[var21];
            for (int var23 = 0; var23 < var21; var23++) {
                var16.field89[var23] = var10[var23];
                var16.field90[var23] = var11[var23];
                var16.field91[var23] = var12[var23];
                var16.field92[var23] = var13[var23];
            }
        }
    }
}
