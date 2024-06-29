import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class191 extends class314 {

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public int field3443 = 0;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "[I")
    public int[] field3459 = new int[5];

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "[Lrj;")
    public class18[] field3455 = new class18[5];

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
    public int field3453;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field3436 = 0;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "[I")
    public static int[] field3434 = new int[100];

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field3445 = 0;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public static int field3435 = -1;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Lud;")
    public static class279 field3437 = class130.method1024("(U0a )2 in: ", 255);

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Lud;")
    private static class279 field3433 = class130.method1024("red:", 255);

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Lud;")
    public static class279 field3431 = field3433;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "Lud;")
    public static class279 field3462 = field3433;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Lok;")
    public static class149 field3438;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Lwb;")
    public class153 field3442;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Lql;")
    public class17 field3439;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "Lpl;")
    public class191 field3464;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "Lck;")
    public class235 field3454;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "Lrm;")
    public class243 field3440;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "Ln;")
    public class281 field3447;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "Lug;")
    public class304 field3457;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "Z")
    public boolean field3446;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "Z")
    public boolean field3448;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "Z")
    public boolean field3461;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Lud;", line = 13)
    public static final class279 method1447(int arg0, int arg1) {
        if (arg0 != 5) {
            field3462 = (class279) null;
        }
        field3430++;
        return class297.method2099(10, false, true, arg1);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(III)V", line = 29)
    public class191(int arg0, int arg1, int arg2) {
        this.field3441 = arg2;
        this.field3453 = arg1;
        this.field3449 = this.field3458 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 41)
    public static void method1448(byte arg0) {
        field3433 = null;
        field3434 = null;
        field3462 = null;
        field3437 = null;
        field3431 = null;
        field3438 = null;
        if (arg0 > -111) {
            field3437 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V", line = 76)
    public static final void method1449(byte arg0) {
        field3456++;
        if (arg0 <= 80) {
            return;
        }
        int var1 = class322.field5632 * 128 + 64;
        int var2 = class214.field3758 * 128 + 64;
        int var3 = class130.method1025(var1, 1008652135, class287.field5134, var2) - class307.field5450;
        if (class322.field5633 < 100) {
            if (class306.field5438 < var3) {
                class306.field5438 += (var3 - class306.field5438) * class322.field5633 / 1000 + class195.field3504;
                if (var3 < class306.field5438) {
                    class306.field5438 = var3;
                }
            }
            if (var1 > class21.field589) {
                class21.field589 += (var1 - class21.field589) * class322.field5633 / 1000 + class195.field3504;
                if (class21.field589 > var1) {
                    class21.field589 = var1;
                }
            }
            if (class306.field5438 > var3) {
                class306.field5438 -= (class306.field5438 - var3) * class322.field5633 / 1000 + class195.field3504;
                if (var3 > class306.field5438) {
                    class306.field5438 = var3;
                }
            }
            if (var2 > class92.field1747) {
                class92.field1747 += (var2 - class92.field1747) * class322.field5633 / 1000 + class195.field3504;
                if (var2 < class92.field1747) {
                    class92.field1747 = var2;
                }
            }
            if (var2 < class92.field1747) {
                class92.field1747 -= (class92.field1747 - var2) * class322.field5633 / 1000 + class195.field3504;
                if (var2 > class92.field1747) {
                    class92.field1747 = var2;
                }
            }
            if (var1 < class21.field589) {
                class21.field589 -= (class21.field589 - var1) * class322.field5633 / 1000 + class195.field3504;
                if (var1 > class21.field589) {
                    class21.field589 = var1;
                }
            }
        } else {
            class92.field1747 = class214.field3758 * 128 + 64;
            class21.field589 = class322.field5632 * 128 + 64;
            class306.field5438 = class130.method1025(class21.field589, 1008652135, class287.field5134, class92.field1747) - class307.field5450;
        }
        int var4 = class86.field1651 * 128 + 64;
        int var5 = class113.field2083 * 128 + 64;
        int var6 = class130.method1025(var5, 1008652135, class287.field5134, var4) - class185.field3394;
        int var7 = var5 - class21.field589;
        int var8 = var4 - class92.field1747;
        int var9 = var6 - class306.field5438;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class5.field124;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class62.field1278 < var11) {
            class62.field1278 += (var11 - class62.field1278) * class171.field3094 / 1000 + class184.field3364;
            if (var11 < class62.field1278) {
                class62.field1278 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class5.field124 += class171.field3094 * var13 / 1000 + class184.field3364;
            class5.field124 &= 0x7FF;
        }
        if (var11 < class62.field1278) {
            class62.field1278 -= (class62.field1278 - var11) * class171.field3094 / 1000 + class184.field3364;
            if (class62.field1278 < var11) {
                class62.field1278 = var11;
            }
        }
        if (var13 < 0) {
            class5.field124 -= -var13 * class171.field3094 / 1000 + class184.field3364;
            class5.field124 &= 0x7FF;
        }
        int var14 = var12 - class5.field124;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class5.field124 = var12;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIBI)V", line = 285)
    public static final void method1450(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3463++;
        if (class249.field4449 <= arg2 - arg4 && (arg2 + arg4) <= class44.field929 && arg1 - arg4 >= class135.field2463 && (arg1 + arg4) <= class108.field2002) {
            class173.method1346(arg1, arg2, arg0, arg4, (byte) 127);
        } else {
            class8.method64(0, arg1, arg0, arg2, arg4);
        }
        if (arg3 < 33) {
            field3438 = (class149) null;
        }
    }
}
