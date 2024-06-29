import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class204 {

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Lri;")
    private class273 field3348 = new class273();

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    private int field3357;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    private int field3353;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lkb;")
    private class80 field3343;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "[I")
    public static int[] field3346 = new int[100];

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field3349 = 2301979;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "[[S")
    public static short[][] field3351;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 9)
    public static void method1423(int arg0) {
        if (arg0 >= 114) {
            field3346 = null;
            field3351 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 21)
    public final Object method1424(long arg0, byte arg1) {
        if (arg1 <= 75) {
            this.method1426(65L, (byte) -57);
        }
        field3345++;
        class141 var4 = (class141) this.field3343.method493(arg0, 100);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method972(-3490);
        if (var5 == null) {
            var4.method124((byte) 23);
            var4.method1464((byte) 84);
            this.field3353++;
            return null;
        }
        if (var4.method974(0)) {
            class197 var6 = new class197(var5);
            this.field3343.method490(var6, var4.field292, true);
            this.field3348.method1890(var6, false);
            var6.field3454 = 0L;
            var4.method124((byte) 108);
            var4.method1464((byte) 84);
        } else {
            this.field3348.method1890(var4, false);
            var4.field3454 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lfh;II[B)V", line = 63)
    public static final void method1425(class110 arg0, int arg1, int arg2, byte[] arg3) {
        field3350++;
        class138 var4 = new class138();
        var4.field2126 = 0;
        var4.field2129 = arg0;
        var4.field292 = (long) arg2;
        var4.field2128 = arg3;
        if (arg1 != -2193) {
            field3351 = (short[][]) ((short[][]) null);
        }
        class76 var5 = class40.field500;
        synchronized (class40.field500) {
            class40.field500.method451(-91453648, var4);
        }
        class175.method1262((byte) 10);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(JB)V", line = 87)
    public final void method1426(long arg0, byte arg1) {
        if (arg1 != 1) {
            return;
        }
        class141 var4 = (class141) this.field3343.method493(arg0, 75);
        if (var4 != null) {
            var4.method124((byte) 84);
            var4.method1464((byte) 84);
            this.field3353++;
        }
        field3352++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V", line = 128)
    public static final void method1427(int arg0, int arg1, int arg2) {
        class76 var3 = class71.field952[class79.field1127][arg2][arg0];
        field3355++;
        if (var3 == null) {
            class164.method1148(class79.field1127, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class18 var5 = (class18) var3.method442(65293);
        class18 var6 = null;
        while (var5 != null) {
            class238 var7 = class284.method1963((byte) -89, var5.field202.field555);
            int var8 = var7.field3828;
            if (var7.field3847 == 1) {
                var8 = (var5.field202.field557 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var6 = var5;
            }
            var5 = (class18) var3.method440(3);
        }
        if (var6 == null) {
            class164.method1148(class79.field1127, arg2, arg0);
            return;
        }
        var3.method446(var6, -27762);
        class18 var9 = (class18) var3.method442(65293);
        if (arg1 != -25477) {
            method1432(-58, 82, true, -8, 3, -52);
        }
        class45 var10 = null;
        class45 var11 = null;
        while (var9 != null) {
            class45 var12 = var9.field202;
            if (var6.field202.field555 != var12.field555) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field555 != var12.field555 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class18) var3.method440(3);
        }
        long var13 = (long) (arg2 + (arg0 << 7) + 1610612736);
        class57.method320(class79.field1127, arg2, arg0, class62.method349(128, class79.field1127, arg0 * 128 + 64, arg2 * 128 + 64), var6.field202, var13, var10, var11);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V", line = 203)
    public final void method1428(int arg0, int arg1) {
        if (class110.field1712 != null) {
            for (class141 var3 = (class141) this.field3348.method1884(11109); var3 != null; var3 = (class141) this.field3348.method1885((byte) 0)) {
                if (var3.method974(0)) {
                    if (var3.method972(-3490) == null) {
                        var3.method124((byte) 110);
                        var3.method1464((byte) 84);
                        this.field3353++;
                    }
                } else if ((++var3.field3454) > ((long) arg0)) {
                    class141 var4 = class110.field1712.method869(true, var3);
                    this.field3343.method490(var4, var3.field292, true);
                    class151.method1037(var3, var4, 1133047462);
                    var3.method124((byte) 98);
                    var3.method1464((byte) 84);
                }
            }
        }
        field3354++;
        if (arg1 != 29946) {
            field3351 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 253)
    public final void method1429(byte arg0) {
        this.field3348.method1883(arg0 ^ 0x7D);
        this.field3343.method500(0);
        this.field3353 = this.field3357;
        field3347++;
        if (arg0 != 120) {
            this.field3353 = -108;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 269)
    public final void method1430(Object arg0, long arg1, int arg2) {
        field3344++;
        this.method1426(arg1, (byte) 1);
        if (this.field3353 == 0) {
            class141 var5 = (class141) this.field3348.method1886(arg2 ^ 0xFFFFCB2A);
            var5.method124((byte) 102);
            var5.method1464((byte) 84);
        } else {
            this.field3353--;
        }
        class197 var6 = new class197(arg0);
        this.field3343.method490(var6, arg1, true);
        this.field3348.method1890(var6, false);
        var6.field3454 = 0L;
        if (arg2 != 13487) {
            method1427(116, 0, 9);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 306)
    public final void method1431(byte arg0) {
        if (arg0 <= 116) {
            this.method1431((byte) 110);
        }
        field3358++;
        for (class141 var2 = (class141) this.field3348.method1884(11109); var2 != null; var2 = (class141) this.field3348.method1885((byte) 0)) {
            if (var2.method974(0)) {
                var2.method124((byte) 127);
                var2.method1464((byte) 84);
                this.field3353++;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V", line = 332)
    public class204(int arg0) {
        this.field3357 = arg0;
        this.field3353 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3343 = new class80(var2);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZIII)V", line = 348)
    public static final void method1432(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            method1425((class110) null, 57, 72, (byte[]) null);
        }
        int var9 = arg1 + 1;
        class133.method925(14678, arg3, arg5, arg0, class284.field4810[arg1]);
        field3342++;
        int var10 = arg4 - 1;
        class133.method925(14678, arg3, arg5, arg0, class284.field4810[arg4]);
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var7 = class284.field4810[var6];
            var7[arg3] = var7[arg0] = arg5;
        }
    }
}
