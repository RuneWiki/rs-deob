import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class154 extends class79 {

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "[Z")
    public static boolean[] field2452 = new boolean[8];

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Lck;")
    public static class119 field2454 = class298.method1987((byte) 120, "mod_icons");

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "[J")
    public static long[] field2459 = new long[32];

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "Z")
    public static boolean field2463 = false;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "Lck;")
    public static class119 field2456 = class298.method1987((byte) 118, ":assist:");

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "J")
    public static volatile long field2465 = 0L;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2462 = Calendar.getInstance();

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "Lve;")
    public static class33 field2467 = null;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lck;")
    public static class119 field2468 = class298.method1987((byte) 123, "www");

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "Lvk;")
    public static class67 field2469 = new class67(64);

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public int field2450;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Lck;")
    public class119 field2458;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "Lcf;")
    public static class174 field2464;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "[Lck;")
    public class119[] field2451;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "[[[Li;")
    public static class104[][][] field2460;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I", line = 12)
    public static final int method981(byte arg0) {
        field2457++;
        if (arg0 != 10) {
            field2468 = (class119) null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII)I", line = 40)
    public static final int method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2461++;
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg2;
            arg2 = var7;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 1 + 7 - (arg4 + arg6);
        } else {
            int var9 = 49 / ((39 - arg3) / 40);
            return 1 - (arg2 - (7 - arg0));
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBIII)V", line = 71)
    public static final void method983(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2449++;
        class36.method282(arg2 + arg3, arg3 - arg2, arg0, class256.field4113[arg4], 26175);
        int var5 = 0;
        int var6 = arg2;
        if (arg1 > -14) {
            method982(95, 110, 106, -1, 124, -30, 23);
        }
        int var7 = -arg2;
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class256.field4113[arg4 + var6];
                int[] var10 = class256.field4113[arg4 - var6];
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                class36.method282(var12, var11, arg0, var9, 26175);
                class36.method282(var12, var11, arg0, var10, 26175);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class256.field4113[arg4 + var5];
            int[] var16 = class256.field4113[arg4 - var5];
            class36.method282(var13, var14, arg0, var15, 26175);
            class36.method282(var13, var14, arg0, var16, 26175);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 122)
    public static void method984(int arg0) {
        field2469 = null;
        field2452 = null;
        field2454 = null;
        field2456 = null;
        field2468 = null;
        field2462 = null;
        field2460 = (class104[][][]) null;
        field2464 = null;
        if (arg0 == 16) {
            field2467 = null;
            field2459 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 151)
    public static final int method985(int arg0, int arg1) {
        field2466++;
        if (arg1 != -1337402072) {
            field2465 = -117L;
        }
        return arg0 >>> 8;
    }
}
