import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class216 extends class637 {

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field3083 = -1;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Lvp;")
    public static class176 field3081 = new class176();

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "[I")
    public static int[] field3088 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "Ljava/awt/Frame;")
    public static Frame field3087;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIII)Z", line = 3)
    public static final boolean method1377(int arg0, int arg1, int arg2, int arg3) {
        if (!class572.method3142(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class348.field4782;
            int var5 = arg2 << class348.field4782;
            return class312.method1861(var4 + 1, class218.field3099[arg0].method195(arg1, arg2) + arg3, var5 + 1) && class312.method1861(class587.field7787 + var4 - 1, class218.field3099[arg0].method195(arg1 + 1, arg2) + arg3, var5 + 1) && class312.method1861(class587.field7787 + var4 - 1, class218.field3099[arg0].method195(arg1 + 1, arg2 + 1) + arg3, class587.field7787 + var5 - 1) && class312.method1861(var4 + 1, class218.field3099[arg0].method195(arg1, arg2 + 1) + arg3, class587.field7787 + var5 - 1);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V", line = 17)
    public static final void method1378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3085;
        int var7 = arg1 + arg6;
        int var8 = -arg1 + arg3;
        for (int var9 = arg6; var7 > var9; ++var9) {
            class475.method2668(arg0, arg4, 7, class236.field3325[var9], arg2);
        }
        int var10 = arg3;
        if (arg5 != 16711680) {
            method1380((byte) 17);
        }
        while (var10 > var8) {
            class475.method2668(arg0, arg4, 7, class236.field3325[var10], arg2);
            --var10;
        }
        int var11 = arg1 + arg2;
        int var12 = -arg1 + arg4;
        for (int var13 = var7; ~var13 >= ~var8; ++var13) {
            int[] var14 = class236.field3325[var13];
            class475.method2668(arg0, var11, arg5 + -16711673, var14, arg2);
            class475.method2668(arg0, arg4, arg5 + -16711673, var14, var12);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)[[I", line = 62)
    public final int[][] method223(int arg0, int arg1) {
        ++field3082;
        if (arg0 != 2) {
            return null;
        } else {
            int[][] var3 = super.field8129.method2654(false, arg1);
            if (super.field8129.field6315 && this.method3521(true)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field8579 * super.field8579;
                for (int var8 = 0; var8 < class505.field6740; ++var8) {
                    int var9 = super.field8577[var7 - -(var8 % super.field8582)];
                    var6[var8] = class571.method3139(255, var9) << 4;
                    var5[var8] = class571.method3139(var9, 65280) >> 4;
                    var4[var8] = class571.method3139(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V", line = 115)
    public static void method1379(int arg0) {
        if (arg0 < 82) {
            method1377(-117, 22, 35, 16);
        }
        field3087 = null;
        field3088 = null;
        field3081 = null;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)[Llj;", line = 127)
    public static final class570[] method1380(byte arg0) {
        ++field3084;
        int var1 = 127 / ((arg0 - 32) / 38);
        return new class570[] { class587.field7784, class191.field2806, class415.field5682, class128.field2143, class702.field9895, class488.field6589, class46.field656, class160.field2536, class194.field2833, class384.field5120, class164.field2567, class677.field9564, class415.field5675, class363.field4886 };
    }
}
