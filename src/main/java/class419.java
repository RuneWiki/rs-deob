import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class419 {

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lka;")
    private class473 field6069 = new class473(64);

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Ldk;")
    private class421 field6070;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field6063;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Z")
    public static boolean field6065 = false;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lrb;")
    public static class283 field6067 = new class283(1, 12);

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Lkc;")
    public static class157 field6073 = new class157("K", "T", "K", "K");

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field6074 = 0;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lks;")
    public static class23 field6072;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lta;BLat;ILo;III)V")
    public static final void method2475(class336 arg0, byte arg1, class444 arg2, int arg3, class359 arg4, int arg5, int arg6, int arg7) {
        field6066++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class247.field3363 == 4) {
            var8 = (int) class191.field2797 & 0x3FFF;
        } else {
            var8 = (int) class191.field2797 + class457.field6666 & 0x3FFF;
        }
        if (arg1 > -93) {
            field6073 = null;
        }
        int var9 = Math.max(arg2.field6470 / 2, arg2.field6453 / 2) + 10;
        int var10 = arg5 * arg5 + arg6 * arg6;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class51.field743[var8];
        int var12 = class51.field731[var8];
        if (class247.field3363 != 4) {
            var12 = var12 * 256 / (class532.field7816 + 256);
            var11 = var11 * 256 / (class532.field7816 + 256);
        }
        int var13 = arg5 * var12 + arg6 * var11 >> 15;
        int var14 = arg6 * var12 - (arg5 * var11) >> 15;
        arg4.method203(arg2.field6470 / 2 + (arg3 - (arg4.method204() / 2 - var13)), arg2.field6453 / 2 + (arg7 - var14 - arg4.method207() / 2), arg0, arg3, arg7);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZILsv;)V")
    public static final void method2476(boolean arg0, int arg1, class319 arg2) {
        if (class274.field3724 != null) {
            try {
                class274.field3724.method1076(0L, -72);
                class274.field3724.method1083(24, arg2.field4336, -1, arg1);
            } catch (Exception var3) {
            }
        }
        field6062++;
        if (!arg0) {
            method2476(true, 64, null);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method2477(byte arg0) {
        field6073 = null;
        field6067 = null;
        field6072 = null;
        if (arg0 <= 23) {
            field6072 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BZZII)I")
    public static final int method2478(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field6064++;
        class412 var5 = class379.method2261(arg0 + 3609, arg1, arg3);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg0 != -12) {
            field6065 = false;
        }
        for (int var7 = 0; var7 < var5.field5865.length; var7++) {
            if (var5.field5865[var7] >= 0 && var5.field5865[var7] < class534.field7872.field7602) {
                class297 var8 = class534.field7872.method3089(var5.field5865[var7], arg0 ^ 0xFFFFFF89);
                int var9 = var8.method1730(class365.field5241.method2181((byte) 111, arg4).field2140, arg4, (byte) -72);
                if (arg2) {
                    var6 += var5.field5866[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)Lgt;")
    public final class66 method2479(int arg0, byte arg1) {
        field6071++;
        class473 var3 = this.field6069;
        class66 var4;
        synchronized (this.field6069) {
            var4 = (class66) this.field6069.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 10) {
            method2480(-13);
        }
        class421 var5 = this.field6070;
        byte[] var6;
        synchronized (this.field6070) {
            var6 = this.field6070.method2512(19, (byte) -93, arg0);
        }
        class66 var7 = new class66();
        if (var6 != null) {
            var7.method430(-1, new class319(var6));
        }
        class473 var8 = this.field6069;
        synchronized (this.field6069) {
            this.field6069.method2777(-1025, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
    public static final int method2480(int arg0) {
        field6068++;
        class295 var1 = class275.field3737;
        boolean var2 = false;
        if (class195.field2849 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class295.method1715(0, 0, var3, null, null, (byte) 100);
            var2 = true;
        }
        long var4 = class254.method1522((byte) -51);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method469(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class254.method1522((byte) -51) - var4);
        var1.method1712(100, 0, -16777216, 100, 0, 0);
        if (var2) {
            var1.method1713(-1);
        }
        int var8 = -23 % ((52 - arg0) / 49);
        return var7;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class419(class12 arg0, int arg1, class421 arg2) {
        this.field6070 = arg2;
        this.field6063 = this.field6070.method2509(0, 19);
    }
}
