import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class167 extends class117 {

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "[Lgd;")
    public class180[] field2406 = new class180[5];

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "[I")
    public int[] field2413 = new int[5];

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public int field2409 = 0;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2388 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "Lth;")
    public static class57 field2414 = new class57(50);

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field2417 = 0;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "B")
    public byte field2391;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Llg;")
    public class100 field2415;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lge;")
    public class11 field2387;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "Lmc;")
    public class167 field2416;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Ldf;")
    public class172 field2394;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Ldj;")
    public class235 field2404;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Lsm;")
    public class47 field2402;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Ltn;")
    public class85 field2390;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "Lkm;")
    public class94 field2412;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Z")
    public boolean field2389;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Z")
    public boolean field2396;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Z")
    public boolean field2410;

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(III)V", line = 2)
    public class167(int arg0, int arg1, int arg2) {
        this.field2399 = arg2;
        this.field2401 = this.field2398 = arg0;
        this.field2392 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIB)V", line = 21)
    public static final void method1186(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 108) {
            return;
        }
        for (class349 var5 = (class349) class247.field3654.method93((byte) -117); var5 != null; var5 = (class349) class247.field3654.method97(-111)) {
            class281.method2046(arg2, arg1, var5, arg3, arg4 ^ 0x8, arg0);
        }
        field2393++;
        for (class349 var6 = (class349) class158.field2282.method93((byte) -74); var6 != null; var6 = (class349) class158.field2282.method97(arg4 ^ 0xFFFFFFA2)) {
            byte var7 = 1;
            class15 var8 = var6.field5384.method2355(true);
            if (var6.field5384.field5096 == var8.field262) {
                var7 = 0;
            } else if (var6.field5384.field5096 == var8.field232 || var6.field5384.field5096 == var8.field253 || var6.field5384.field5096 == var8.field240 || var6.field5384.field5096 == var8.field220) {
                var7 = 2;
            } else if (var6.field5384.field5096 == var8.field241 || var6.field5384.field5096 == var8.field238 || var6.field5384.field5096 == var8.field257 || var6.field5384.field5096 == var8.field252) {
                var7 = 3;
            }
            if (var6.field5398 != var7) {
                int var9 = class312.method2186(var6.field5384, 255);
                if (var6.field5399 != var9) {
                    if (var6.field5405 != null) {
                        class179.field2576.method1397(var6.field5405);
                        var6.field5405 = null;
                    }
                    var6.field5399 = var9;
                }
                var6.field5398 = var7;
            }
            var6.field5386 = var6.field5384.field5137;
            var6.field5396 = var6.field5384.field5137 + (var6.field5384.method1700(arg4 ^ 0xFFFFFFEB) * 64);
            var6.field5403 = var6.field5384.field5165;
            var6.field5389 = var6.field5384.field5165 + var6.field5384.method1700(-123) * 64;
            class281.method2046(arg2, arg1, var6, arg3, 100, arg0);
        }
        for (class349 var10 = (class349) class50.field746.method1406(0); var10 != null; var10 = (class349) class50.field746.method1404(-85)) {
            byte var11 = 1;
            class15 var12 = var10.field5404.method2355(true);
            if (var10.field5404.field5096 == var12.field262) {
                var11 = 0;
            } else if (var10.field5404.field5096 == var12.field232 || var10.field5404.field5096 == var12.field253 || var10.field5404.field5096 == var12.field240 || var10.field5404.field5096 == var12.field220) {
                var11 = 2;
            } else if (var10.field5404.field5096 == var12.field241 || var10.field5404.field5096 == var12.field238 || var10.field5404.field5096 == var12.field257 || var10.field5404.field5096 == var12.field252) {
                var11 = 3;
            }
            if (var10.field5398 != var11) {
                int var13 = class180.method1249(var10.field5404, 0);
                if (var10.field5399 != var13) {
                    if (var10.field5405 != null) {
                        class179.field2576.method1397(var10.field5405);
                        var10.field5405 = null;
                    }
                    var10.field5399 = var13;
                }
                var10.field5398 = var11;
            }
            var10.field5386 = var10.field5404.field5137;
            var10.field5396 = var10.field5404.field5137 + var10.field5404.method1700(-126) * 64;
            var10.field5403 = var10.field5404.field5165;
            var10.field5389 = var10.field5404.field5165 + var10.field5404.method1700(-121) * 64;
            class281.method2046(arg2, arg1, var10, arg3, 100, arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V", line = 161)
    public static final void method1187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2400++;
        int var7 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg6);
        int var8 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg2);
        int var9 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1);
        int var10 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg5);
        int var11 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg0 + arg6);
        int var12 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg2 - arg0);
        for (int var13 = var7; var13 < var11; var13++) {
            class329.method2285(var9, class274.field4158[var13], (byte) -119, var10, arg3);
        }
        if (arg4 != 28727) {
            return;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class329.method2285(var9, class274.field4158[var14], (byte) -123, var10, arg3);
        }
        int var15 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg0 + arg1);
        int var16 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg5 - arg0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class274.field4158[var17];
            class329.method2285(var9, var18, (byte) -53, var15, arg3);
            class329.method2285(var16, var18, (byte) 76, var10, arg3);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V", line = 221)
    public static void method1188(byte arg0) {
        field2414 = null;
        field2388 = null;
        if (arg0 > -8) {
            field2388 = (BigInteger) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V", line = 240)
    public static final void method1189(byte arg0) {
        if (arg0 != 59) {
            field2388 = (BigInteger) null;
        }
        field2411++;
        class147.field2111 = null;
        class349.method2448(0, class286.field4312, 0, 0, (byte) 127, class19.field301, 0, class257.field3850, -1);
        if (class147.field2111 != null) {
            class14.method82(class147.field2111, 28, class286.field4312, class17.field287, 0, class19.field301, 0, -1412584499, class51.field764.field5491, class284.field4292);
            class147.field2111 = null;
        }
    }
}
