import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class216 {

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Laf;")
    private class168 field3378 = new class168();

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    private int field3374;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lac;")
    private class153 field3383;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[[S")
    public static short[][] field3370 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static volatile int field3371 = 0;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[S")
    public static short[] field3385 = new short[256];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lnj;")
    public static class215 field3380;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public final void method1510(int arg0) {
        for (class64 var2 = (class64) this.field3378.method1146(-113); var2 != null; var2 = (class64) this.field3378.method1148((byte) 113)) {
            if (var2.method409((byte) 59)) {
                var2.method1764(64);
                var2.method378((byte) -118);
                this.field3376++;
            }
        }
        if (arg0 != 10283) {
            method1521(-119, 101, -106, 92, 122, 127, (byte) -69, (class231) null);
        }
        field3375++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method1511(byte arg0) {
        this.field3378.method1147(126);
        field3369++;
        if (arg0 <= 87) {
            this.method1517(-21L, (byte) 16);
        }
        this.field3383.method1057(127);
        this.field3376 = this.field3374;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLvl;)I")
    public static final int method1512(boolean arg0, class73 arg1) {
        int var2 = 0;
        if (arg1.method509(27635, class5.field72)) {
            var2++;
        }
        if (arg0) {
            return 36;
        }
        field3387++;
        if (arg1.method509(27635, class265.field4311)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static void method1513(int arg0) {
        field3380 = null;
        if (arg0 > 113) {
            field3370 = null;
            field3385 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
    public final void method1514(int arg0, byte arg1) {
        if (arg1 != -55) {
            return;
        }
        if (class223.field3491 != null) {
            for (class64 var3 = (class64) this.field3378.method1146(101); var3 != null; var3 = (class64) this.field3378.method1148((byte) 113)) {
                if (var3.method409((byte) 59)) {
                    if (var3.method413(arg1 - 9) == null) {
                        var3.method1764(64);
                        var3.method378((byte) -111);
                        this.field3376++;
                    }
                } else if (((long) arg0) < (++var3.field874)) {
                    class64 var4 = class223.field3491.method126(116, var3);
                    this.field3383.method1054(arg1 - 3455, var4, var3.field4018);
                    class13.method73(1, var3, var4);
                    var3.method1764(64);
                    var3.method378((byte) -105);
                }
            }
        }
        field3377++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lvl;Lvl;Z)V")
    public static final void method1515(class73 arg0, class73 arg1, boolean arg2) {
        class97.field1461 = arg0;
        class74.field1123 = arg1;
        class97.field1461.method481(2688, 36);
        if (arg2) {
            method1521(70, -113, 87, 8, 110, 14, (byte) -127, (class231) null);
        }
        field3386++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(JI)V")
    public final void method1516(long arg0, int arg1) {
        field3379++;
        class64 var4 = (class64) this.field3383.method1064(-1, arg0);
        if (arg1 != 12) {
            this.field3374 = 75;
        }
        if (var4 != null) {
            var4.method1764(64);
            var4.method378((byte) -120);
            this.field3376++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method1517(long arg0, byte arg1) {
        class64 var4 = (class64) this.field3383.method1064(-1, arg0);
        field3384++;
        int var5 = 103 % ((-arg1 - 56) / 55);
        if (var4 == null) {
            return null;
        }
        Object var6 = var4.method413(-64);
        if (var6 == null) {
            var4.method1764(64);
            var4.method378((byte) -116);
            this.field3376++;
            return null;
        }
        if (var4.method409((byte) 59)) {
            class200 var7 = new class200(var6);
            this.field3383.method1054(-3510, var7, var4.field4018);
            this.field3378.method1149(4336, var7);
            var7.field874 = 0L;
            var4.method1764(64);
            var4.method378((byte) -113);
        } else {
            this.field3378.method1149(4336, var4);
            var4.field874 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
    public final void method1518(Object arg0, long arg1, byte arg2) {
        field3381++;
        this.method1516(arg1, 12);
        if (this.field3376 == 0) {
            class64 var5 = (class64) this.field3378.method1145(false);
            var5.method1764(64);
            var5.method378((byte) -116);
        } else {
            this.field3376--;
        }
        class200 var6 = new class200(arg0);
        this.field3383.method1054(-3510, var6, arg1);
        this.field3378.method1149(4336, var6);
        var6.field874 = 0L;
        if (arg2 != 75) {
            field3371 = -120;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static final void method1519(int arg0) {
        class281.field4581.method1511((byte) 97);
        field3373++;
        if (arg0 <= 53) {
            method1521(-53, 84, -66, 26, 50, -110, (byte) -78, (class231) null);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)I")
    public final int method1520(byte arg0) {
        field3372++;
        int var2 = 0;
        for (class64 var3 = (class64) this.field3378.method1146(-24); var3 != null; var3 = (class64) this.field3378.method1148((byte) 113)) {
            if (!var3.method409((byte) 59)) {
                var2++;
            }
        }
        if (arg0 < 59) {
            this.field3378 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIBLfe;)V")
    public static final void method1521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class231 arg7) {
        if (class72.field1073) {
            class262.field4266 = 32;
        } else {
            class262.field4266 = 0;
        }
        field3382++;
        if (arg6 < 32) {
            method1519(59);
        }
        class72.field1073 = false;
        if (class284.field4606 != 0) {
            if (arg5 >= arg0 && (arg0 + 16) > arg5 && arg4 >= arg1 && (arg1 + 16) > arg4) {
                arg7.field3661 -= 4;
                class247.method1761(arg7, (byte) -101);
            } else if (arg0 <= arg5 && arg5 < arg0 + 16 && arg2 + arg1 - 16 <= arg4 && arg4 < (arg1 + arg2)) {
                arg7.field3661 += 4;
                class247.method1761(arg7, (byte) -97);
            } else if (arg0 - class262.field4266 <= arg5 && arg5 < (arg0 + class262.field4266 + 16) && (arg1 + 16) <= arg4 && arg4 < arg2 + arg1 - 16) {
                int var8 = (arg2 - 32) * arg2 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - var8 - 32;
                int var10 = arg4 - (var8 / 2) - arg1 - 16;
                arg7.field3661 = (arg3 - arg2) * var10 / var9;
                class247.method1761(arg7, (byte) -107);
                class72.field1073 = true;
            }
        }
        if (class256.field4185 == 0) {
            return;
        }
        int var11 = arg7.field3730;
        if (arg5 >= arg0 - var11 && arg4 >= arg1 && arg5 < arg0 + 16 && (arg1 + arg2) >= arg4) {
            arg7.field3661 += class256.field4185 * 45;
            class247.method1761(arg7, (byte) -108);
            return;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
    public class216(int arg0) {
        int var2 = 1;
        this.field3374 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field3376 = arg0;
        this.field3383 = new class153(var2);
    }
}
