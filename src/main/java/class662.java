import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class662 {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Z")
    public static boolean field9134 = false;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field9145 = 0;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[I")
    public static int[] field9144 = new int[32];

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Z")
    public static boolean field9151 = false;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "B")
    public byte field9133;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "B")
    public byte field9140;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "B")
    public byte field9146;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "B")
    public byte field9149;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "B")
    public byte field9152;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "B")
    public byte field9153;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "B")
    public byte field9157;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "F")
    public static float field9132;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public int field9135;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field9141;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public int field9154;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "S")
    public short field9137;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Z")
    public boolean field9138;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Z")
    public boolean field9139;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Z")
    public boolean field9142;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Z")
    public boolean field9143;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Z")
    public boolean field9147;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "Z")
    public boolean field9150;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "Z")
    public boolean field9155;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "Z")
    public boolean field9158;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V", line = 7)
    public static void method3656(boolean arg0) {
        if (!arg0) {
            method3658(null, -37, 124, null, -28, -48, 23, -2, true);
        }
        field9144 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Lvc;", line = 24)
    public static final class337 method3657(byte arg0) {
        field9156++;
        if (arg0 != 52) {
            field9144 = null;
        }
        return class515.method2993(arg0 - 55, 1);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BII[BIIIIZ)V", line = 37)
    public static final void method3658(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field9148++;
        int var9 = -(arg5 >> 2);
        if (arg8) {
            return;
        }
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg3[var10001] = (byte) (arg3[var10001] - arg0[arg6++]);
                int var14 = arg4++;
                arg3[var14] = (byte) (arg3[var14] - arg0[arg6++]);
                int var15 = arg4++;
                arg3[var15] = (byte) (arg3[var15] - arg0[arg6++]);
                int var16 = arg4++;
                arg3[var16] = (byte) (arg3[var16] - arg0[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg3[var10001] = (byte) (arg3[var10001] - arg0[arg6++]);
            }
            arg6 += arg2;
            arg4 += arg1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLgaa;)I", line = 103)
    public static final int method3659(byte arg0, class315 arg1) {
        field9136++;
        if (arg0 > -36) {
            field9132 = 1.4421065F;
        }
        int var2 = arg1.method1993(-1, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method1993(-1, 5);
        } else if (var2 == 2) {
            var3 = arg1.method1993(-1, 8);
        } else {
            var3 = arg1.method1993(-1, 11);
        }
        return var3;
    }
}
