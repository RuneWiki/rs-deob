import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class718 implements class575 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Lpfa;")
    private class295 field10064 = new class295(128);

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "[I")
    private int[] field10077 = new int[class422.field6147.field4314];

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "[I")
    public int[] field10073 = new int[class422.field6147.field4314];

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "[J")
    public static long[] field10078 = new long[32];

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lpia;")
    public static class94 field10066 = new class94(5, 4);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field10063;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field10067;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 3)
    public static void method4002(int arg0) {
        field10078 = null;
        field10066 = null;
        if (arg0 <= 13) {
            field10066 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)I", line = 21)
    public final int method4003(boolean arg0, int arg1) {
        field10075++;
        long var3 = class652.method3700(-1);
        for (class559 var5 = arg0 ? (class559) this.field10064.method1753(0) : (class559) this.field10064.method1755(-68); var5 != null; var5 = (class559) this.field10064.method1755(-86)) {
            if ((var5.field7985 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field7985 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field1522;
                    this.field10073[var6] = this.field10077[var6];
                    var5.method864(12983);
                    return var6;
                }
                var5.method864(12983);
            }
        }
        if (arg1 == 0) {
            return -1;
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V", line = 59)
    public final void method4004(int arg0, int arg1, int arg2) {
        this.field10077[arg1] = arg2;
        field10068++;
        class559 var4 = (class559) this.field10064.method1754(false, (long) arg1);
        if (arg0 != 34065) {
            this.method3330(-12, -69);
        }
        if (var4 == null) {
            class559 var5 = new class559(4611686018427387905L);
            this.field10064.method1751(var5, 3970, (long) arg1);
        } else if (var4.field7985 != 4611686018427387905L) {
            var4.field7985 = class652.method3700(-1) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I", line = 89)
    public final int method3330(int arg0, int arg1) {
        int var3 = 43 % ((arg0 - 14) / 36);
        field10076++;
        return this.field10073[arg1];
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lrr;ZZ)V", line = 100)
    public static final void method4005(class361 arg0, boolean arg1, boolean arg2) {
        arg0.field4637 = arg2;
        if (!class625.field8980) {
            class141.method887(arg0, class642.field9188);
        } else if (arg1) {
            class727.field10181[class727.field10181.length - 1].method3369(arg0, -1);
        } else {
            int var3 = class507.method3008(arg0.field4631);
            int var4 = class78.field819[2] * arg0.method992(false) / arg0.field4639;
            int var5 = class507.method3008(arg0.field4631 - var4);
            int var6 = class507.method3008(arg0.field4631 + var4);
            if (var5 == var6) {
                class727.field10181[var3].method3369(arg0, -1);
            } else if (var6 - var5 == 1) {
                class727.field10181[class577.field8147 + var5].method3369(arg0, -1);
            } else {
                class727.field10181[class727.field10181.length - 1].method3369(arg0, -1);
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)V", line = 134)
    public final void method4006(int arg0, int arg1, byte arg2) {
        field10070++;
        class300 var4 = class628.field9019.method1408(7, arg0);
        int var5 = var4.field3726;
        if (arg2 <= 125) {
            this.field10064 = null;
        }
        int var6 = var4.field3727;
        int var7 = var4.field3725;
        int var8 = class704.field9918[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method4008(var5, arg1 << var6 & var9 | ~var9 & this.field10073[var5], -123);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZI)Z", line = 163)
    public static final boolean method4007(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field10066 = null;
        }
        field10074++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V", line = 176)
    public final void method4008(int arg0, int arg1, int arg2) {
        this.field10073[arg0] = arg1;
        field10069++;
        class559 var4 = (class559) this.field10064.method1754(false, (long) arg0);
        if (arg2 > -73) {
            this.field10064 = null;
        }
        if (var4 == null) {
            class559 var5 = new class559(class652.method3700(-1) + 500L);
            this.field10064.method1751(var5, 3970, (long) arg0);
        } else {
            var4.field7985 = class652.method3700(-1) + 500L;
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(III)V", line = 199)
    public final void method4009(int arg0, int arg1, int arg2) {
        if (arg2 != 32) {
            method4007(-28, true, -121);
        }
        field10063++;
        class300 var4 = class628.field9019.method1408(7, arg1);
        int var5 = var4.field3726;
        int var6 = var4.field3727;
        int var7 = var4.field3725;
        int var8 = class704.field9918[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method4004(34065, var5, arg0 << var6 & var9 | this.field10077[var5] & ~var9);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)I", line = 228)
    public final int method3329(byte arg0, int arg1) {
        field10067++;
        class300 var3 = class628.field9019.method1408(7, arg1);
        int var4 = var3.field3726;
        int var5 = var3.field3727;
        int var6 = var3.field3725;
        int var7 = class704.field9918[var6 - var5];
        return arg0 == -48 ? var7 & this.field10073[var4] >> var5 : 58;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V", line = 253)
    public final void method4010(int arg0) {
        field10065++;
        int var2 = 0;
        if (arg0 != 14784) {
            this.field10073 = null;
        }
        while (class422.field6147.field4314 > var2) {
            class162 var3 = class422.field6147.method1993((byte) -81, var2);
            if (var3 != null && var3.field1808 == 0) {
                this.field10077[var2] = 0;
                this.field10073[var2] = 0;
            }
            var2++;
        }
        this.field10064 = new class295(128);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lffa;B)I", line = 281)
    public static final int method4011(class185 arg0, byte arg1) {
        int var2 = -78 / ((arg1 - 25) / 54);
        field10071++;
        if (class565.field8036 == arg0) {
            return 9216;
        } else if (class156.field1717 == arg0) {
            return 34065;
        } else if (class389.field5381 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
