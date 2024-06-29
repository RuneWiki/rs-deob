import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 extends class136 {

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "[Ll;")
    public static class16[] field139;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V", line = 4)
    public static void method80(byte arg0) {
        if (arg0 != 95) {
            field143 = -74;
        }
        field139 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([II[III)V", line = 15)
    public static final void method81(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        ++field140;
        if (~arg1 > ~arg3) {
            int var5 = (arg1 - -arg3) / 2;
            int var6 = arg1;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg3; ++var10) {
                if (~arg0[var10] > ~(var7 - -(var9 & var10))) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method81(arg0, arg1, arg2, var6 - 1, arg4);
            method81(arg0, var6 + 1, arg2, arg3, arg4);
        }
        if (arg4 != 0) {
            field143 = -68;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)[I", line = 73)
    public final int[] method82(int arg0, int arg1) {
        ++field142;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int[][] var4 = this.method1036(3, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class467.field6889 < ~var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        int var9 = -108 % ((67 - arg0) / 50);
        return var3;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V", line = 111)
    public class12() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V", line = 115)
    public static final void method83(int arg0, short[] arg1, String[] arg2, int arg3, int arg4) {
        ++field138;
        if (arg0 < 57) {
            method83(-15, (short[]) null, (String[]) null, 94, 97);
        }
        if (~arg4 < ~arg3) {
            int var5 = (arg3 - -arg4) / 2;
            int var6 = arg3;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; ++var9) {
                if (var7 == null || arg2[var9] != null && ~(var9 & 1) < ~arg2[var9].compareTo(var7)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method83(121, arg1, arg2, arg3, var6 + -1);
            method83(66, arg1, arg2, var6 + 1, arg4);
        }
    }
}
