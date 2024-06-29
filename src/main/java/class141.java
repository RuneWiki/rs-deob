import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class141 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2446 = -1;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[Lak;")
    public static class138[] field2454 = new class138[14];

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lcf;")
    public static class93 field2457 = class147.method1066("<col=ffff00>", -48);

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Z")
    public static boolean field2453 = false;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Lcf;")
    private static class93 field2460 = class147.method1066("Connected to update server", -48);

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lcf;")
    public static class93 field2459 = class147.method1066("<col=ffff00>", -48);

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Lcf;")
    public static class93 field2464 = class147.method1066(" )2> <col=ffff00>", -48);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lcf;")
    public static class93 field2444 = field2460;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Z")
    public static boolean field2448;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([[IB)V")
    public static final void method1023(int[][] arg0, byte arg1) {
        int var2 = 30 % ((arg1 + 30) / 33);
        class76.field1406 = arg0;
        field2461++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([SIII[Lcf;)V")
    public static final void method1024(short[] arg0, int arg1, int arg2, int arg3, class93[] arg4) {
        field2458++;
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            class93 var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].method661(var7, -1)) {
                    class93 var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method1024(arg0, arg1, var6 - 1, -31452, arg4);
            method1024(arg0, var6 + 1, arg2, -31452, arg4);
        }
        if (arg3 != -31452) {
            method1024((short[]) null, 6, 117, 120, (class93[]) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILee;I)V")
    private final void method1025(int arg0, class280 arg1, int arg2) {
        if (~arg0 == arg2) {
            this.field2463 = arg1.method1891(-126);
            this.field2462 = arg1.method1907(arg2 ^ 0xFFFFBE3E);
            this.field2456 = arg1.method1907(arg2 + 16834);
        }
        field2451++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method1026(int arg0) {
        field2454 = null;
        field2457 = null;
        field2460 = null;
        field2444 = null;
        if (arg0 != -1) {
            field2444 = null;
        }
        field2464 = null;
        field2459 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZI)I")
    public static final int method1027(int arg0, int arg1, boolean arg2, int arg3) {
        field2449++;
        if (arg2) {
            field2448 = true;
        }
        if (arg1 < arg0) {
            return arg0;
        } else if (arg1 > arg3) {
            return arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILee;)V")
    public final void method1028(int arg0, class280 arg1) {
        if (arg0 != -1) {
            method1023((int[][]) null, (byte) 93);
        }
        field2450++;
        while (true) {
            int var3 = arg1.method1907(16832);
            if (var3 == 0) {
                return;
            }
            this.method1025(var3, arg1, arg0 ^ 0x1);
        }
    }
}
