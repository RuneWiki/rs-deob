import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class273 extends class333 {

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public int field3402 = 0;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[C")
    private static char[] field3392 = new char[64];

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Lps;")
    public static class469 field3415;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public int field3396;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public int field3418;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "Lwn;")
    public class236 field3413;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lwda;")
    public class253 field3390;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "Lwda;")
    public class253 field3420;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lug;")
    public class450 field3398;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "Lug;")
    public class450 field3414;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Loh;")
    public class600 field3394;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lqp;")
    public class638 field3403;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lam;")
    public class704 field3405;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Lam;")
    public class704 field3406;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Z")
    public boolean field3389;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Z")
    public boolean field3393;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Z")
    public boolean field3399;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "[I")
    public int[] field3409;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "[I")
    public static int[] field3419;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3392[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3392[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3392[var2] = (char) (var2 + 48 - 52);
        }
        field3392[63] = '/';
        field3392[62] = '+';
        field3415 = new class469(11, 3);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 13)
    public static void method1601(int arg0) {
        field3392 = null;
        field3415 = null;
        if (arg0 != 23522) {
            field3392 = null;
        }
        field3419 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BII)[B", line = 39)
    public static final byte[] method1602(byte[] arg0, int arg1, int arg2) {
        field3412++;
        byte[] var3 = new byte[arg2];
        if (arg1 != -27934) {
            method1605(-62, null);
        }
        class567.method3213(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBII)V", line = 81)
    public static final void method1603(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -79) {
            method1604(-11);
        }
        field3408++;
        if (arg2 == arg4) {
            class390.method2220(arg5, arg2, arg0, arg1, true);
        } else if (arg1 - arg2 >= class412.field5526 && class72.field740 >= (arg1 + arg2) && class93.field949 <= (arg5 - arg4) && class360.field4834 >= arg4 + arg5) {
            class15.method66(-127, arg0, arg2, arg1, arg4, arg5);
        } else {
            class670.method3705(arg1, arg0, arg2, arg4, true, arg5);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lqq;", line = 105)
    public static final class653 method1604(int arg0) {
        field3397++;
        return class381.field5163 == arg0 ? new class653() : class364.field4885[--class381.field5163];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Canvas;)Lsca;", line = 120)
    public static final class239 method1605(int arg0, Canvas arg1) {
        field3407++;
        try {
            Class var2 = Class.forName("to");
            if (arg0 == -1211) {
                class239 var3 = (class239) var2.getDeclaredConstructor().newInstance();
                var3.method1369(arg1, (byte) 118);
                return var3;
            } else {
                return null;
            }
        } catch (Throwable var5) {
            class227 var4 = new class227();
            var4.method1369(arg1, (byte) -78);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 157)
    public final void method1606(int arg0) {
        field3410++;
        int var2 = this.field3418;
        int var3 = -69 % ((1 - arg0) / 52);
        boolean var4 = this.field3393;
        if (this.field3403 != null) {
            class638 var7 = this.field3403.method3597(-1, class628.field8859);
            if (var7 == null) {
                this.field3395 = 0;
                this.field3400 = 0;
                this.field3421 = 0;
                this.field3409 = null;
                this.field3418 = -1;
                this.field3389 = false;
                this.field3393 = false;
                this.field3401 = 0;
            } else {
                this.field3395 = var7.field9011;
                this.field3418 = var7.field9022;
                this.field3393 = var7.field8984;
                this.field3389 = var7.field8981;
                this.field3400 = var7.field8980 << 9;
                this.field3401 = var7.field9012;
                this.field3421 = var7.field9070;
                this.field3409 = var7.field8992;
            }
        } else if (this.field3394 != null) {
            int var5 = class213.method1262(-73, this.field3394);
            if (var2 != var5) {
                this.field3418 = var5;
                class210 var6 = this.field3394.field8461;
                if (var6.field2492 != null) {
                    var6 = var6.method1247((byte) 57, class628.field8859);
                }
                if (var6 == null) {
                    this.field3393 = this.field3394.field8461.field2475;
                    this.field3395 = this.field3400 = 0;
                } else {
                    this.field3393 = var6.field2475;
                    this.field3400 = var6.field2534 << 9;
                    this.field3395 = var6.field2521;
                }
            }
        } else if (this.field3413 != null) {
            this.field3418 = class68.method364(-9184, this.field3413);
            this.field3393 = this.field3413.field2898;
            this.field3400 = this.field3413.field2934 << 9;
            this.field3395 = this.field3413.field2940;
        }
        if (this.field3418 == var2 && var4 == this.field3393) {
            return;
        }
        if (this.field3406 == null) {
            return;
        }
        class209.field2471.method3885(this.field3406);
        this.field3406 = null;
        this.field3398 = null;
        this.field3390 = null;
    }
}
