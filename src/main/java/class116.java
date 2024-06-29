import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class116 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "[I")
    public static int[] field2035 = new int[4];

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2040 = -1;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2034 = -1;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field2046 = 0;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2047 = "Connecting to update server";

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lnl;")
    public static class304 field2044;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILga;IIII)Z", line = 8)
    public static final boolean method764(int arg0, int arg1, class31 arg2, int arg3, int arg4, int arg5, int arg6) {
        field2043++;
        class327 var7 = class106.method693(arg2.field611, arg4 ^ 0x4780);
        if (var7.field4993 == -1) {
            return true;
        }
        int var8;
        if (arg2.field623) {
            int var9 = arg2.field584 + arg0;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class113 var10 = var7.method2268(arg2.field593, 21130, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg2.field589;
        int var12 = var10.field1971;
        int var13 = var10.field1973;
        int var14 = arg2.field616;
        if ((var8 & 0x1) == 1) {
            var14 = arg2.field589;
            var11 = arg2.field616;
        }
        if (var7.field4998) {
            var13 = var14 * 4;
            var12 = var11 * 4;
        }
        if (var7.field4996 == 0) {
            var10.method725((arg3 * 4) + 48, (-arg6 + -var14 + 104) * 4 + 48, var12, var13);
        } else {
            var10.method733((arg3 * 4) + 48, 48 - -((-var14 + 104 + -arg6) * 4), var12, var13, var7.field4996);
        }
        if (arg4 != -18306) {
            field2040 = 65;
        }
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[I)[I", line = 63)
    public static final int[] method765(byte arg0, int[] arg1) {
        field2042++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        class129.method853(arg1, 0, var2, 0, arg1.length);
        if (arg0 != 15) {
            method765((byte) 16, (int[]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 91)
    public static void method766(int arg0) {
        field2047 = null;
        field2044 = null;
        if (arg0 != -4751) {
            field2035 = (int[]) null;
        }
        field2035 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;)J", line = 107)
    public static final long method767(int arg0, String arg1) {
        long var2 = 0L;
        field2037++;
        if (arg0 > -124) {
            return -55L;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (1 - (65 - var6));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 157)
    public static final void method768(int arg0) {
        field2041++;
        class71.method543();
        if (arg0 == -5) {
            for (int var1 = 0; var1 < 4; var1++) {
                class326.field4990[var1].method216(-128);
            }
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)I", line = 184)
    public static final int method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
        }
        field2048++;
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg1;
        } else {
            if (arg6 != 1915) {
                field2046 = 114;
            }
            return var8 == 2 ? 8 - arg4 - arg0 : -arg3 - (-1 - (7 - arg1));
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 222)
    public static final void method770(int arg0) {
        class227.field3586.method1877(arg0 + 275);
        if (arg0 == -29977) {
            field2036++;
            class216.field3453.method1877(arg0 ^ 0x11D);
            class114.field2026.method1877(arg0 + 275);
            class293.field4478.method1877(-29702);
        }
    }
}
