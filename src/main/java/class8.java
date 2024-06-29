import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class8 {

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "[B")
    public static byte[] field71 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static volatile int field72 = 0;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "[I")
    public static int[] field73 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([IB[III)V", line = 5)
    public static final void method48(int[] arg0, byte arg1, int[] arg2, int arg3, int arg4) {
        int var5 = 33 % ((-arg1 - 13) / 32);
        if (arg3 > arg4) {
            int var6 = (arg3 + arg4) / 2;
            int var7 = arg4;
            int var8 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var8;
            int var9 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var9;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (arg2[var10] < ((var10 & 0x1) + var8)) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var7];
                    arg2[var7] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var7];
                    arg0[var7++] = var12;
                }
            }
            arg2[arg3] = arg2[var7];
            arg2[var7] = var8;
            arg0[arg3] = arg0[var7];
            arg0[var7] = var9;
            method48(arg0, (byte) 121, arg2, var7 - 1, arg4);
            method48(arg0, (byte) 47, arg2, arg3, var7 + 1);
        }
        field70++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)I", line = 62)
    public static final int method49(boolean arg0, int arg1) {
        field74++;
        if (!arg0) {
            method48((int[]) null, (byte) -13, (int[]) null, 9, -17);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 80)
    public static void method50(int arg0) {
        field73 = null;
        if (arg0 != 10733) {
            field71 = null;
        }
        field71 = null;
    }
}
