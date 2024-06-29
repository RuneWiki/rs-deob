import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class204 {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[C")
    public static char[] field2786 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2784 = "";

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZII)V", line = 5)
    public static final void method1316(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method1318((byte) 52);
        }
        field2787++;
        class489 var4 = class704.method3942(arg0, 9, 0);
        var4.method2797(-1);
        var4.field6942 = arg3;
        var4.field6952 = arg2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([II[[BI[B[[B[IB)I", line = 29)
    public static final int method1317(int[] arg0, int arg1, byte[][] arg2, int arg3, byte[] arg4, byte[][] arg5, int[] arg6, byte arg7) {
        field2785++;
        int var8 = arg0[arg1];
        int var9 = var8 + arg6[arg1];
        int var10 = arg0[arg3];
        int var11 = arg6[arg3] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg4[arg1] & 0xFF;
        if (var14 > (arg4[arg3] & 0xFF)) {
            var14 = arg4[arg3] & 0xFF;
        }
        byte[] var15 = arg5[arg1];
        byte[] var16 = arg2[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var21 = var15[var17++] + var16[var18++];
            if (var14 > var21) {
                var14 = var21;
            }
        }
        int var20 = 7 % ((-arg7 - 34) / 59);
        return -var14;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 86)
    public static void method1318(byte arg0) {
        field2786 = null;
        if (arg0 == -95) {
            field2784 = null;
        }
    }
}
