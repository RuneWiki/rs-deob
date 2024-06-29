import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class251 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Ljg;")
    public static class241 field3753 = new class241(64);

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[J")
    public static long[] field3755 = new long[100];

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lpf;")
    public static class425 field3760 = new class425(79, 4);

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljg;")
    public static class241 field3762 = new class241(128);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Liq;")
    public static class134 field3761;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lkr;")
    public static class234[] field3754;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class192.field2917 <= (arg4 - arg0) && class39.field497 >= (arg4 + arg0) && class189.field2831 <= (arg6 - arg0) && class204.field3060 >= arg0 + arg6) {
            class388.method2393(arg3, arg1, arg2, (byte) -112, arg6, arg4, arg0);
        } else {
            class454.method2825(false, arg6, arg4, arg0, arg1, arg2, arg3);
        }
        field3758++;
        int var7 = 87 / ((76 - arg5) / 47);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIILgr;IB)V")
    public static final void method1528(boolean arg0, int arg1, int arg2, int arg3, class379 arg4, int arg5, byte arg6) {
        field3756++;
        if (class5.field64 >= 50 || arg4 == null || arg4.field5534 == null || arg1 >= arg4.field5534.length || arg4.field5534[arg1] == null) {
            return;
        }
        int var7 = arg4.field5534[arg1][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        int var10 = var7 & 0x1F;
        if (arg4.field5534[arg1].length > 1) {
            int var11 = (int) ((double) arg4.field5534[arg1].length * Math.random());
            if (var11 > 0) {
                var8 = arg4.field5534[arg1][var11];
            }
        }
        if (var10 == 0) {
            if (arg0) {
                class189.method1151(255, var8, 0, var9, (byte) -104);
            }
        } else if (client.field6666 != 0) {
            class177.field2688[class5.field64] = var8;
            if (arg6 != -118) {
                field3755 = null;
            }
            class174.field2664[class5.field64] = var9;
            class38.field469[class5.field64] = 0;
            class278.field4230[class5.field64] = null;
            class438.field6445[class5.field64] = 255;
            int var12 = (arg3 - 64) / 128;
            int var13 = (arg2 - 64) / 128;
            class20.field272[class5.field64] = (arg5 << 24) + (var12 << 16) + (var13 << 8) + var10;
            class5.field64++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lqk;B)Lqk;")
    public abstract class6 method1529(class6 arg0, byte arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lrs;")
    public static final class195 method1530(int arg0, int arg1) {
        field3757++;
        class241 var2 = class295.field4482;
        class195 var3;
        synchronized (class295.field4482) {
            var3 = (class195) class295.field4482.method1491((long) arg0, 0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = field3761.method823(class433.method2665(arg0, (byte) 121), -20334, class286.method1769(255, arg0));
        class195 var5 = new class195();
        if (arg1 < 65) {
            method1528(false, -57, -93, -25, (class379) null, -114, (byte) 78);
        }
        var5.field2940 = arg0;
        if (var4 != null) {
            var5.method1167((byte) -29, new class385(var4));
        }
        class241 var6 = class295.field4482;
        synchronized (class295.field4482) {
            class295.field4482.method1488(128, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
    public static final void method1531(int arg0, boolean arg1) {
        field3759++;
        if (!arg1 && class207.field3095 == null || arg0 > class207.field3095.length) {
            class207.field3095 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1532(int arg0) {
        field3762 = null;
        if (arg0 >= -49) {
            return;
        }
        field3753 = null;
        field3754 = null;
        field3761 = null;
        field3755 = null;
        field3760 = null;
    }
}
