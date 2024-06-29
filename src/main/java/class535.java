import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class535 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "F")
    public static float field7277;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field7278;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field7280;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field7283;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field7284;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field7287;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field7288;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lpj;")
    public static class132 field7281;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lxa;")
    public static class461 field7289;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I")
    public static final int method2956(int arg0) {
        if (arg0 > -38) {
            method2959(-32, -84, true, -53);
        }
        field7290++;
        return class446.field6248++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII[B[BI)V")
    public static final void method2957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte[] arg7, int arg8) {
        field7282++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        int var11 = -arg5;
        if (arg2 != 11297) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg6[var10001] += arg7[arg1++];
                int var14 = arg0++;
                arg6[var14] += arg7[arg1++];
                int var15 = arg0++;
                arg6[var15] += arg7[arg1++];
                int var16 = arg0++;
                arg6[var16] += arg7[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg6[var10001] += arg7[arg1++];
            }
            arg0 += arg3;
            arg1 += arg8;
            var11++;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method2958(int arg0) {
        if (arg0 == -12450) {
            field7281 = null;
            field7289 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZI)I")
    public static final int method2959(int arg0, int arg1, boolean arg2, int arg3) {
        field7279++;
        if (arg3 != 0) {
            return -6;
        }
        class421 var4 = class172.method1175(true, arg2, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var4.field5946.length) {
            return var4.field5946[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static final void method2960(byte arg0) {
        class315.field4697 = 0;
        field7285++;
        if (arg0 >= -101) {
            method2960((byte) -27);
        }
        class487.field6761.method1269((byte) 115);
        class229.field3278 = false;
    }
}
