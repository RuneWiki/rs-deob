import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class142 extends class306 {

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "Lnk;")
    public static class16 field2222;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "Lkc;")
    public static class43 field2214;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V", line = 4)
    public static final void method993(Object[] arg0, int arg1, int arg2, long[] arg3, int arg4) {
        if (arg2 != -14017) {
            method995((byte) -34, -74, 83);
        }
        field2223++;
        if (arg4 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg1;
        long var7 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var7;
        Object var9 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var9;
        for (int var10 = arg1; var10 < arg4; var10++) {
            if (((long) (var10 & 0x1) + var7) > arg3[var10]) {
                long var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                Object var13 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var13;
            }
        }
        arg3[arg4] = arg3[var6];
        arg3[var6] = var7;
        arg0[arg4] = arg0[var6];
        arg0[var6] = var9;
        method993(arg0, arg1, -14017, arg3, var6 - 1);
        method993(arg0, var6 + 1, -14017, arg3, arg4);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)V", line = 58)
    public static final void method994(boolean arg0, int arg1) {
        class245.field3860.method387(arg1, false);
        class293.field4614.method387(arg1, false);
        if (!arg0) {
            method999(30, 118, -80, 51, -57);
        }
        field2219++;
        class112.field1558.method387(arg1, !arg0);
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V", line = 75)
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BII)V", line = 82)
    public static final void method995(byte arg0, int arg1, int arg2) {
        class190 var3 = class197.method1374((byte) -74, arg1);
        int var4 = var3.field2850;
        field2221++;
        int var5 = var3.field2853;
        int var6 = var3.field2857;
        int var7 = class108.field1486[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        if (arg0 != 106) {
            field2217 = -112;
        }
        class75.method474(~var8 & class323.field5113[var4] | var8 & arg2 << var5, (byte) -97, var4);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BZ)V", line = 110)
    public static final void method996(byte arg0, boolean arg1) {
        byte[][] var2;
        if (class272.field4317 && arg1) {
            var2 = class119.field1658;
        } else {
            var2 = class256.field4049;
        }
        if (arg0 < 41) {
            field2214 = (class43) null;
        }
        field2218++;
        int var3 = class316.field4951.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class218.field3277[var4] >> 8) * 64 - class322.field4999;
                int var7 = (class218.field3277[var4] & 0xFF) * 64 - class16.field160;
                class108.method698(-127);
                class85.method539(var7, arg1, var6, -123, class247.field3914, var5);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)I", line = 148)
    private final int method997(int arg0, int arg1, int arg2) {
        field2216++;
        if (arg1 != 15265) {
            field2214 = (class43) null;
        }
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 ^ var4 << 1;
        return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)V", line = 163)
    public static void method998(int arg0) {
        field2214 = null;
        field2222 = null;
        if (arg0 != -29921) {
            method999(75, 123, -4, -18, 19);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)[I", line = 175)
    public final int[] method47(int arg0, int arg1) {
        field2215++;
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        int[] var3 = this.field4757.method903(arg0, -125);
        if (this.field4757.field1898) {
            int var4 = class111.field1553[arg0];
            for (int var5 = 0; var5 < class31.field367; var5++) {
                var3[var5] = this.method997(var4, arg1 + 1546352800, class25.field288[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIII)V", line = 211)
    public static final void method999(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 64) {
            field2217 = -76;
        }
        field2220++;
        class279 var5 = class147.method1085(arg3, -19443, 10);
        var5.method1989(arg1 - 64);
        var5.field4397 = arg2;
        var5.field4394 = arg4;
        var5.field4388 = arg0;
    }
}
