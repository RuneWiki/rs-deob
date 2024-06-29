import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class315 implements Runnable {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[Lva;")
    public volatile class137[] field5341 = new class137[2];

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Z")
    public volatile boolean field5345 = false;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Z")
    public volatile boolean field5338 = false;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
    public static int[] field5344 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lve;")
    public static class255 field5346 = class87.method607(111, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lfk;")
    public class40 field5343;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Lrg;")
    public static class88 field5348;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZBII)V", line = 11)
    public static final void method2173(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -44) {
            return;
        }
        if (class281.field4827) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class114.field1930 + ((class258.field4385 - class114.field1930) * var6 / 100);
            if (var7 < class119.field1986) {
                var7 = class119.field1986;
            } else if (var7 > class97.field1679) {
                var7 = class97.field1679;
            }
            int var8 = arg4 * var7 * 512 / (arg1 * 334);
            if (class275.field4723 > var8) {
                short var9 = class275.field4723;
                var7 = arg1 * var9 * 334 / (arg4 * 512);
                if (var7 > class97.field1679) {
                    var7 = class97.field1679;
                    int var10 = arg4 * var7 * 512 / (var9 * 334);
                    int var11 = (arg1 - var10) / 2;
                    if (arg2) {
                        class126.method927();
                        class126.method936(arg0, arg5, var11, arg4, 0);
                        class126.method936(arg1 + arg0 - var11, arg5, var11, arg4, 0);
                    }
                    arg1 -= var11 * 2;
                    arg0 += var11;
                }
            } else if (class15.field222 < var8) {
                short var12 = class15.field222;
                var7 = var12 * 334 * arg1 / (arg4 * 512);
                if (var7 < class119.field1986) {
                    var7 = class119.field1986;
                    int var13 = arg1 * var12 * 334 / (var7 * 512);
                    int var14 = (arg4 - var13) / 2;
                    if (arg2) {
                        class126.method927();
                        class126.method936(arg0, arg5, arg1, var14, 0);
                        class126.method936(arg0, arg4 + arg5 - var14, arg1, var14, 0);
                    }
                    arg4 -= var14 * 2;
                    arg5 += var14;
                }
            }
            class195.field3217 = arg4 * var7 / 334;
        }
        field5342++;
        class44.field682 = arg5;
        class232.field3847 = arg0;
        class153.field2597 = (short) arg1;
        class34.field547 = (short) arg4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 104)
    public static final void method2174(byte arg0) {
        field5349++;
        if (class79.field1279 > 0) {
            class234.method1623(0);
            return;
        }
        class73.field1208 = client.field4041;
        client.field4041 = null;
        if (arg0 == -68) {
            class256.method1798(arg0 ^ 0x30, 40);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 131)
    public static void method2175(byte arg0) {
        field5346 = null;
        int var1 = 79 % ((arg0) / 49);
        field5348 = null;
        field5344 = null;
    }

    @OriginalMember(owner = "client!bf", name = "run", descriptor = "()V", line = 143)
    public final void run() {
        field5339++;
        this.field5338 = true;
        try {
            while (!this.field5345) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class137 var2 = this.field5341[var1];
                    if (var2 != null) {
                        var2.method1033((byte) -107);
                    }
                }
                class137.method1027(10L, 0);
                class78.method544(58, this.field5343, (Object) null);
            }
        } catch (Exception var7) {
            class195.method1393(var7, 0, (String) null);
        } finally {
            this.field5338 = false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLve;Lrg;)Lfb;", line = 181)
    public static final class54 method2176(byte arg0, class255 arg1, class88 arg2) {
        field5337++;
        int var3 = arg2.method619(arg1, 20053);
        if (var3 == -1) {
            return new class54(0);
        }
        int var4 = -123 % ((12 - arg0) / 40);
        int[] var5 = arg2.method613(0, var3);
        class54 var6 = new class54(var5.length);
        for (int var7 = 0; var7 < var6.field846; var7++) {
            class70 var8 = new class70(arg2.method636(var3, (byte) 118, var5[var7]));
            var6.field854[var7] = var8.method479(-1);
            var6.field850[var7] = var8.method466((byte) -83);
            var6.field837[var7] = (short) var8.method423(255);
            var6.field855[var7] = (short) var8.method423(255);
            var6.field843[var7] = var8.method469(97);
        }
        return var6;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lvi;", line = 214)
    public static final class5 method2177(int arg0) {
        field5340++;
        if (arg0 != -8621) {
            return (class5) null;
        }
        class5 var1;
        if (class281.field4827) {
            var1 = new class263(class153.field2608, class154.field2632, class131.field2167[0], class298.field5098[0], class132.field2173[0], class187.field3027[0], class282.field4849[0], class18.field296);
        } else {
            var1 = new class273(class153.field2608, class154.field2632, class131.field2167[0], class298.field5098[0], class132.field2173[0], class187.field3027[0], class282.field4849[0], class18.field296);
        }
        class111.method850(-3);
        return var1;
    }
}
