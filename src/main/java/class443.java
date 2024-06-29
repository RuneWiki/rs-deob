import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class443 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Lhi;")
    public static class45 field6376 = new class45(42, 2);

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field6381 = 0;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Lbr;")
    public static class146 field6380;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "[Lo;")
    public static class359[] field6382;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method2610(int arg0) {
        field6376 = null;
        field6380 = null;
        if (arg0 <= 55) {
            method2613(-14, false, true, 45, -117L);
        }
        field6382 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BIIII)V")
    public static final void method2611(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6377++;
        int var5 = 0;
        int var6 = arg4;
        if (arg0 != 76) {
            method2613(19, false, true, 60, -62L);
        }
        int var7 = -arg4;
        int var8 = -1;
        class188.method1259(arg3 - arg4, (byte) 27, arg3 + arg4, arg1, class42.field626[arg2]);
        while (var5 < var6) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class42.field626[arg2 + var6];
                int[] var10 = class42.field626[arg2 - var6];
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class188.method1259(var12, (byte) 27, var11, arg1, var9);
                class188.method1259(var12, (byte) 27, var11, arg1, var10);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class42.field626[arg2 + var5];
            int[] var16 = class42.field626[arg2 - var5];
            class188.method1259(var14, (byte) 27, var13, arg1, var15);
            class188.method1259(var14, (byte) 27, var13, arg1, var16);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIII)Lks;")
    public static final class23 method2612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6379++;
        int var7 = 121 % ((arg5 - 37) / 32);
        long var8 = (long) arg4 * 76724863L ^ (long) arg2 * 475427L ^ (long) arg3 * 67481L ^ (long) arg0 * 97549L ^ (long) arg6 * 986053L ^ (long) arg1 * 32147369L;
        class23 var10 = (class23) class188.field2771.method2767(var8, 0);
        if (var10 == null) {
            class23 var11 = class228.field3204.method540(arg3, arg0, arg2, arg6, arg1, arg4);
            class188.field2771.method2777(-1025, var11, var8);
            return var11;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IZZIJ)Ljava/lang/String;")
    public static final String method2613(int arg0, boolean arg1, boolean arg2, int arg3, long arg4) {
        if (!arg2) {
            return null;
        }
        field6378++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }
}
