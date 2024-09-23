import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("g")
public class AnimFrame {

    @OriginalMember(owner = "g", name = "b", descriptor = "I")
    public int delay;

    @OriginalMember(owner = "g", name = "d", descriptor = "I")
    public int length;

    @OriginalMember(owner = "g", name = "c", descriptor = "Lf;")
    public AnimBase base;

    @OriginalMember(owner = "g", name = "e", descriptor = "[I")
    public int[] groups;

    @OriginalMember(owner = "g", name = "f", descriptor = "[I")
    public int[] x;

    @OriginalMember(owner = "g", name = "g", descriptor = "[I")
    public int[] y;

    @OriginalMember(owner = "g", name = "h", descriptor = "[I")
    public int[] z;

    @OriginalMember(owner = "g", name = "a", descriptor = "[Lg;")
    public static AnimFrame[] instances;

    @OriginalMember(owner = "g", name = "a", descriptor = "(ZLub;)V")
    public static void unpack(boolean arg0, Jagfile arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        Packet var2 = new Packet(363, arg1.read("frame_head.dat", null, (byte) 2));
        Packet var3 = new Packet(363, arg1.read("frame_tran1.dat", null, (byte) 2));
        Packet var4 = new Packet(363, arg1.read("frame_tran2.dat", null, (byte) 2));
        Packet var5 = new Packet(363, arg1.read("frame_del.dat", null, (byte) 2));
        int var6 = var2.method218();
        int var7 = var2.method218();
        instances = new AnimFrame[var7 + 1];
        int[] var8 = new int[500];
        int[] var9 = new int[500];
        int[] var10 = new int[500];
        int[] var11 = new int[500];
        for (int var12 = 0; var12 < var6; var12++) {
            int var13 = var2.method218();
            AnimFrame var14 = instances[var13] = new AnimFrame();
            var14.delay = var5.method216();
            int var15 = var2.method218();
            AnimBase var16 = AnimBase.instances[var15];
            var14.base = var16;
            int var17 = var2.method216();
            int var18 = -1;
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                int var22 = var3.method216();
                if (var22 > 0) {
                    if (var16.types[var20] != 0) {
                        for (int var23 = var20 - 1; var23 > var18; var23--) {
                            if (var16.types[var23] == 0) {
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
                    if (var16.types[var8[var19]] == 3) {
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
            var14.length = var19;
            var14.groups = new int[var19];
            var14.x = new int[var19];
            var14.y = new int[var19];
            var14.z = new int[var19];
            for (int var21 = 0; var21 < var19; var21++) {
                var14.groups[var21] = var8[var21];
                var14.x[var21] = var9[var21];
                var14.y[var21] = var10[var21];
                var14.z[var21] = var11[var21];
            }
        }
    }
}
