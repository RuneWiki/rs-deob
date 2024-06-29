import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class120 extends class280 {

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    private final int field1881;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    private final int field1889;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    private final int field1885;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    private final int field1890;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static volatile int field1887 = 0;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field1886 = 0;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Luj;")
    public static class156 field1893 = new class156();

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1880++;
        if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
            class283.field4672 = -1;
            class49.field741 = -1;
            return;
        }
        int var8 = class207.method1304(class10.field189, (byte) 79, arg0, arg2) - arg3;
        int var9 = arg2 - class70.field1097;
        int var10 = var8 - class281.field4638;
        int var11 = arg0 - class62.field987;
        int var12 = class284.field4698[class86.field1290];
        int var13 = class284.field4699[class86.field1290];
        int var14 = class284.field4698[class140.field2251];
        int var15 = class284.field4699[class140.field2251];
        int var16 = var9 * var14 + (var11 * var15) >> 16;
        int var17 = var9 * var15 - (var11 * var14) >> 16;
        if (arg7 >= -32) {
            return;
        }
        int var19 = var10 * var13 - (var12 * var17) >> 16;
        int var20 = var10 * var12 + var13 * var17 >> 16;
        if (var20 >= 50) {
            int var22 = arg5 * 512 >> 8;
            int var23 = arg6 * 512 >> 8;
            class283.field4672 = var19 * var22 / var20 + arg4;
            class49.field741 = arg1 + (var16 * var23 / var20);
        } else {
            class49.field741 = -1;
            class283.field4672 = -1;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 68)
    public static void method802(byte arg0) {
        field1893 = null;
        if (arg0 < 11) {
            field1893 = (class156) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V", line = 80)
    public final void method530(int arg0, int arg1, int arg2) {
        field1879++;
        if (arg0 != 2) {
            method803(35, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V", line = 91)
    public final void method528(int arg0, int arg1, int arg2) {
        field1891++;
        if (arg0 != 12623) {
            this.method532(28, (byte) -91, -119);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)Ldc;", line = 116)
    public static final class19 method803(int arg0, byte arg1) {
        field1888++;
        class19 var2 = (class19) class169.field2680.method524((byte) 118, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class42.field629.method261(-1, arg0, 0);
        if (var3 == null) {
            return null;
        }
        class19 var4 = new class19();
        class3 var5 = new class3(var3);
        var5.field44 = var5.field101.length - 2;
        int var6 = var5.method63((byte) 1);
        int var7 = var5.field101.length - var6 - 2 - 12;
        var5.field44 = var7;
        int var8 = -55 / ((arg1 + 43) / 37);
        int var9 = var5.method71(-668527048);
        var4.field256 = var5.method63((byte) 1);
        var4.field258 = var5.method63((byte) 1);
        var4.field243 = var5.method63((byte) 1);
        var4.field240 = var5.method63((byte) 1);
        int var10 = var5.method64((byte) -88);
        if (var10 > 0) {
            var4.field261 = new class212[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var5.method63((byte) 1);
                class212 var13 = new class212(class140.method925(var12, (byte) 106));
                var4.field261[var11] = var13;
                while (var12-- > 0) {
                    int var14 = var5.method71(-668527048);
                    int var15 = var5.method71(-668527048);
                    var13.method1326((long) var14, (byte) -125, new class204(var15));
                }
            }
        }
        var5.field44 = 0;
        var4.field249 = var5.method36(-521528824);
        var4.field260 = new int[var9];
        var4.field245 = new int[var9];
        int var16 = 0;
        var4.field252 = new class119[var9];
        while (var5.field44 < var7) {
            int var17 = var5.method63((byte) 1);
            if (var17 == 3) {
                var4.field252[var16] = var5.method41((byte) -126);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field245[var16] = var5.method64((byte) -88);
            } else {
                var4.field245[var16] = var5.method71(-668527048);
            }
            var4.field260[var16++] = var17;
        }
        class169.field2680.method527((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)V", line = 205)
    public final void method532(int arg0, byte arg1, int arg2) {
        field1883++;
        int var4 = this.field1890 * arg2 >> 12;
        int var5 = this.field1881 * arg2 >> 12;
        int var6 = this.field1889 * arg0 >> 12;
        if (arg1 < -71) {
            int var7 = this.field1885 * arg0 >> 12;
            class8.method92(var5, var4, var6, 71, var7, this.field4635);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIII)V", line = 224)
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1881 = arg2;
        this.field1889 = arg1;
        this.field1885 = arg3;
        this.field1890 = arg0;
    }
}
