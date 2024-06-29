import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class345 {

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Lkr;")
    public static class602 field4908 = new class602(7, 3);

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "[Lfd;")
    public static class298[] field4907;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lpm;", line = 9)
    public static final class238 method2202(int arg0, int arg1) {
        field4911++;
        int var2 = 3 % ((arg1 - 26) / 47);
        class238 var3 = (class238) class634.field8524.method3898((byte) -42, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class238.field3542.method1572(0, 0, arg0);
        class238 var5 = new class238();
        if (var4 != null) {
            var5.method1608(false, arg0, new class63(var4));
        }
        class634.field8524.method3899(47, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V", line = 31)
    public static void method2203(byte arg0) {
        field4908 = null;
        field4907 = null;
        if (arg0 != 21) {
            method2204(91, null, 7, 119, 59, -120, -78, 90, null);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[BIIIIII[B)V", line = 42)
    public static final void method2204(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field4909++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg1[var10001] = (byte) (arg1[var10001] - arg8[arg5++]);
                int var14 = arg2++;
                arg1[var14] = (byte) (arg1[var14] - arg8[arg5++]);
                int var15 = arg2++;
                arg1[var15] = (byte) (arg1[var15] - arg8[arg5++]);
                int var16 = arg2++;
                arg1[var16] = (byte) (arg1[var16] - arg8[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg1[var10001] = (byte) (arg1[var10001] - arg8[arg5++]);
            }
            arg5 += arg4;
            arg2 += arg3;
        }
        if (arg0 != -1) {
            method2205(null, 45, -67, null, 10);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([III[II)V", line = 86)
    public static final void method2205(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 <= 48) {
            method2204(43, null, -114, -48, -80, 65, 79, 92, null);
        }
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg3[var10] < ((var10 & var9) + var7)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method2205(arg0, 73, var6 - 1, arg3, arg4);
            method2205(arg0, 123, arg2, arg3, var6 + 1);
        }
        field4912++;
    }

    @OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;", line = 150)
    public final String toString() {
        field4913++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)V", line = 158)
    public static final void method2206(int arg0, int arg1, int arg2) {
        int var3 = -92 / ((arg1 + 66) / 36);
        field4910++;
        class346 var4 = class299.method1976(0, 12, arg2);
        var4.method2209(255);
        var4.field4926 = arg0;
    }
}
