import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class275 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lsc;")
    private class347 field3368 = new class347();

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lpfa;")
    private class295 field3378;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lha;")
    public static class58 field3370;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLon;Ljava/lang/Object;)V", line = 5)
    public final void method1623(byte arg0, class335 arg1, Object arg2) {
        int var4 = 90 / ((arg0 + 18) / 47);
        field3382++;
        this.method1632(1, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I", line = 16)
    public final int method1624(int arg0) {
        field3383++;
        if (arg0 != -7995) {
            field3367 = 10;
        }
        return this.field3381;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILbda;IIZI)V", line = 31)
    public static final void method1625(int arg0, int arg1, class504 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class212.method1259(arg3, arg2.field4635, arg6, arg2.field4628, arg2.field4629, 0, (byte) 102, arg1, arg4, arg0);
        if (!arg5) {
            field3371++;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 42)
    public final void method1626(int arg0) {
        this.field3368.method2062(false);
        field3380++;
        if (arg0 == 0) {
            this.field3378.method1758(126);
            this.field3381 = this.field3376;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lon;Z)V", line = 58)
    private final void method1627(class335 arg0, boolean arg1) {
        field3384++;
        long var3 = arg0.method1402(23607);
        for (class338 var5 = (class338) this.field3378.method1754(arg1, var3); var5 != null; var5 = (class338) this.field3378.method1759(-1)) {
            if (var5.field4353.method1403(arg0, true)) {
                this.method1630(0, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V", line = 80)
    public final void method1628(int arg0) {
        for (class338 var2 = (class338) this.field3368.method2067(22462); var2 != null; var2 = (class338) this.field3368.method2066(0)) {
            if (var2.method754(0)) {
                var2.method864(12983);
                var2.method3562((byte) -100);
                this.field3381 += var2.field4352;
            }
        }
        if (arg0 != 7347) {
            this.field3368 = null;
        }
        field3374++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V", line = 107)
    public final void method1629(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field3376 = -35;
        }
        field3379++;
        if (class325.field4145 == null) {
            return;
        }
        for (class338 var3 = (class338) this.field3368.method2067(22462); var3 != null; var3 = (class338) this.field3368.method2066(arg0)) {
            if (var3.method754(0)) {
                if (var3.method753(arg0 + 15640) == null) {
                    var3.method864(arg0 + 12983);
                    var3.method3562((byte) -45);
                    this.field3381 += var3.field4352;
                }
            } else if ((++var3.field8919) > ((long) arg1)) {
                class338 var4 = class325.field4145.method297(arg0, var3);
                this.field3378.method1751(var4, 3970, var3.field1522);
                class716.method3996(var4, arg0 - 4874, var3);
                var3.method864(12983);
                var3.method3562((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjg;)V", line = 159)
    private final void method1630(int arg0, class338 arg1) {
        if (arg0 != 0) {
            return;
        }
        if (arg1 != null) {
            arg1.method864(12983);
            arg1.method3562((byte) -101);
            this.field3381 += arg1.field4352;
        }
        field3377++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I", line = 176)
    public final int method1631(byte arg0) {
        field3372++;
        if (arg0 < 71) {
            this.method1629(115, -91);
        }
        return this.field3376;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILon;ILjava/lang/Object;)V", line = 193)
    private final void method1632(int arg0, class335 arg1, int arg2, Object arg3) {
        field3375++;
        if (arg0 > this.field3376) {
            throw new IllegalStateException("s>cs");
        }
        this.method1627(arg1, false);
        this.field3381 -= arg0;
        while (this.field3381 < 0) {
            class338 var6 = (class338) this.field3368.method2070(-13418);
            this.method1630(0, var6);
        }
        class293 var5 = new class293(arg1, arg3, arg0);
        this.field3378.method1751(var5, 3970, arg1.method1402(arg2 ^ 0x5C37));
        this.field3368.method2068(-128, var5);
        var5.field8919 = arg2;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V", line = 220)
    public static void method1633(byte arg0) {
        if (arg0 >= -81) {
            field3369 = -89;
        }
        field3370 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V", line = 234)
    public class275(int arg0) {
        this.field3376 = arg0;
        this.field3381 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3378 = new class295(var2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lon;I)Ljava/lang/Object;", line = 252)
    public final Object method1634(class335 arg0, int arg1) {
        if (arg1 != 0) {
            field3367 = 38;
        }
        field3373++;
        long var3 = arg0.method1402(23607);
        for (class338 var5 = (class338) this.field3378.method1754(false, var3); var5 != null; var5 = (class338) this.field3378.method1759(-1)) {
            if (var5.field4353.method1403(arg0, true)) {
                Object var6 = var5.method753(arg1 + 15640);
                if (var6 != null) {
                    if (var5.method754(0)) {
                        class293 var7 = new class293(arg0, var6, var5.field4352);
                        this.field3378.method1751(var7, arg1 + 3970, var5.field1522);
                        this.field3368.method2068(arg1 ^ 0xFFFFFF81, var7);
                        var7.field8919 = 0L;
                        var5.method864(12983);
                        var5.method3562((byte) -79);
                    } else {
                        this.field3368.method2068(-127, var5);
                        var5.field8919 = 0L;
                    }
                    return var6;
                }
                var5.method864(12983);
                var5.method3562((byte) -100);
                this.field3381 += var5.field4352;
            }
        }
        return null;
    }
}
