import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class392 {

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Lvv;")
    private class531 field5658 = new class531();

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    private int field5650;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    private int field5648;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Lew;")
    private class270 field5647;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "Lhi;")
    public static class45 field5664 = new class45(10, 3);

    @OriginalMember(owner = "client!it", name = "t", descriptor = "[B")
    public static byte[] field5665;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "Ldk;")
    public static class421 field5667;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)I")
    public final int method2323(boolean arg0) {
        field5657++;
        if (arg0) {
            this.method2324(122);
        }
        return this.field5648;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
    public final int method2324(int arg0) {
        field5652++;
        if (arg0 != -27165) {
            this.field5648 = -100;
        }
        return this.field5650;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
    public final void method2325(int arg0, int arg1) {
        if (class71.field1021 != null) {
            for (class225 var3 = (class225) this.field5658.method3152(false); var3 != null; var3 = (class225) this.field5658.method3153((byte) 62)) {
                if (var3.method1396((byte) 65)) {
                    if (var3.method1395((byte) -42) == null) {
                        var3.method2791((byte) 112);
                        var3.method1645(-110);
                        this.field5648 += var3.field3180;
                    }
                } else if ((long) arg0 < ++var3.field3883) {
                    class225 var4 = class71.field1021.method843(var3, -128);
                    this.field5647.method1586(var4, var3.field6883, 1);
                    class347.method2086(var3, var4, 0);
                    var3.method2791((byte) 112);
                    var3.method1645(33);
                }
            }
        }
        int var5 = -64 % ((-arg1 - 38) / 45);
        field5649++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/Object;ILjo;)V")
    private final void method2326(int arg0, Object arg1, int arg2, class381 arg3) {
        field5662++;
        if (this.field5650 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method2328(arg3, true);
        this.field5648 -= arg2;
        while (this.field5648 < 0) {
            class225 var7 = (class225) this.field5658.method3148(true);
            this.method2327(var7, 256);
        }
        int var5 = -105 % ((-arg0 - 22) / 32);
        class463 var6 = new class463(arg3, arg1, arg2);
        this.field5647.method1586(var6, arg3.method1785(16088), 1);
        this.field5658.method3150(16711680, var6);
        var6.field3883 = 0L;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lnb;I)V")
    private final void method2327(class225 arg0, int arg1) {
        field5651++;
        if (arg0 != null) {
            arg0.method2791((byte) 112);
            arg0.method1645(-118);
            this.field5648 += arg0.field3180;
        }
        if (arg1 != 256) {
            field5656 = 17;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljo;Z)V")
    private final void method2328(class381 arg0, boolean arg1) {
        field5646++;
        long var3 = arg0.method1785(16088);
        if (!arg1) {
            return;
        }
        for (class225 var5 = (class225) this.field5647.method1592((byte) -25, var3); var5 != null; var5 = (class225) this.field5647.method1590((byte) 88)) {
            if (var5.field3179.method1788(69, arg0)) {
                this.method2327(var5, 256);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)V")
    public static void method2329(boolean arg0) {
        field5665 = null;
        field5664 = null;
        if (!arg0) {
            field5665 = null;
        }
        field5667 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public final void method2330(byte arg0) {
        field5660++;
        for (class225 var2 = (class225) this.field5658.method3152(false); var2 != null; var2 = (class225) this.field5658.method3153((byte) 62)) {
            if (var2.method1396((byte) 65)) {
                var2.method2791((byte) 112);
                var2.method1645(arg0 ^ 0x46);
                this.field5648 += var2.field3180;
            }
        }
        if (arg0 != 22) {
            field5655 = 109;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjo;)Ljava/lang/Object;")
    public final Object method2331(int arg0, class381 arg1) {
        field5654++;
        long var3 = arg1.method1785(16088);
        if (arg0 > -82) {
            return null;
        }
        for (class225 var5 = (class225) this.field5647.method1592((byte) -25, var3); var5 != null; var5 = (class225) this.field5647.method1590((byte) 20)) {
            if (var5.field3179.method1788(117, arg1)) {
                Object var6 = var5.method1395((byte) -20);
                if (var6 != null) {
                    if (var5.method1396((byte) 65)) {
                        class463 var7 = new class463(arg1, var6, var5.field3180);
                        this.field5647.method1586(var7, var5.field6883, 1);
                        this.field5658.method3150(16711680, var7);
                        var7.field3883 = 0L;
                        var5.method2791((byte) 112);
                        var5.method1645(-114);
                    } else {
                        this.field5658.method3150(16711680, var5);
                        var5.field3883 = 0L;
                    }
                    return var6;
                }
                var5.method2791((byte) 112);
                var5.method1645(-103);
                this.field5648 += var5.field3180;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)I")
    public static final int method2332(int arg0, int arg1, int arg2) {
        field5661++;
        if (arg1 >= -109) {
            method2332(-112, -124, 20);
        }
        return arg0 == 4 || arg0 == 5 ? class322.field4425[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public final void method2333(int arg0) {
        field5653++;
        this.field5658.method3149(65280);
        this.field5647.method1583(116);
        int var2 = 55 / ((arg0 + 42) / 42);
        this.field5648 = this.field5650;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/Object;Ljo;)V")
    public final void method2334(int arg0, Object arg1, class381 arg2) {
        this.method2326(110, arg1, 1, arg2);
        if (arg0 != 25338) {
            this.method2323(false);
        }
        field5659++;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(I)V")
    public class392(int arg0) {
        this.field5650 = arg0;
        this.field5648 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5647 = new class270(var2);
    }

    static {
        int var0 = 0;
        field5665 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5665[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
    }
}
