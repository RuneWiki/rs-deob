import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class408 {

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "Lmt;")
    private class249 field5728 = new class249();

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    private int field5730;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    private int field5720;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "Lcp;")
    private class470 field5723;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Lkr;")
    public static class486 field5717 = new class486();

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field5725 = 0;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
    public static int field5737 = 0;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "Lpp;")
    public static class245 field5734;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)I")
    public final int method2409(int arg0) {
        field5721++;
        if (arg0 >= -107) {
            field5734 = null;
        }
        return this.field5720;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
    public final void method2410(int arg0) {
        if (arg0 != -1) {
            this.method2410(-27);
        }
        this.field5728.method1557(true);
        field5719++;
        this.field5723.method2771(-5);
        this.field5730 = this.field5720;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)I")
    public static final int method2411(byte arg0, int arg1) {
        int var2 = -1 % ((arg0 - 48) / 43);
        field5729++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZILjava/lang/Object;Lwt;)V")
    private final void method2412(boolean arg0, int arg1, Object arg2, class186 arg3) {
        field5724++;
        if (arg1 > this.field5720) {
            throw new IllegalStateException("s>cs");
        }
        this.method2422(arg0, arg3);
        this.field5730 -= arg1;
        while (this.field5730 < 0) {
            class448 var6 = (class448) this.field5728.method1559(arg0);
            this.method2414(-97, var6);
        }
        class136 var5 = new class136(arg3, arg2, arg1);
        this.field5723.method2767(-1, arg3.method1149((byte) -36), var5);
        this.field5728.method1553(-112, var5);
        var5.field3960 = 0L;
        if (arg0) {
            this.field5728 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    public static final void method2413(byte arg0) {
        field5718++;
        if (arg0 == -24) {
            class222.field3361++;
            class15.method110(class312.field4408, arg0 ^ 0x6B);
            class225.field3415.method1753(true, 0);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjm;)V")
    private final void method2414(int arg0, class448 arg1) {
        field5727++;
        if (arg0 > -95) {
            field5734 = null;
        }
        if (arg1 != null) {
            arg1.method1510((byte) -13);
            arg1.method1673((byte) 27);
            this.field5730 += arg1.field6197;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
    public final void method2415(int arg0, int arg1) {
        field5735++;
        if (class173.field2507 != null) {
            for (class448 var3 = (class448) this.field5728.method1558(true); var3 != null; var3 = (class448) this.field5728.method1554(-11541)) {
                if (var3.method862((byte) 110)) {
                    if (var3.method863(false) == null) {
                        var3.method1510((byte) -13);
                        var3.method1673((byte) 27);
                        this.field5730 += var3.field6197;
                    }
                } else if (++var3.field3960 > (long) arg1) {
                    class448 var4 = class173.field2507.method709(var3, (byte) 112);
                    this.field5723.method2767(-1, var3.field3568, var4);
                    class337.method2120(1, var3, var4);
                    var3.method1510((byte) -13);
                    var3.method1673((byte) 27);
                }
            }
        }
        if (arg0 >= -55) {
            field5717 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public final void method2416(boolean arg0) {
        for (class448 var2 = (class448) this.field5728.method1558(arg0); var2 != null; var2 = (class448) this.field5728.method1554(-11541)) {
            if (var2.method862((byte) 110)) {
                var2.method1510((byte) -13);
                var2.method1673((byte) 27);
                this.field5730 += var2.field6197;
            }
        }
        field5722++;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method2417(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class39.field512 = arg2;
        class68.field858 = arg0;
        class115.field1469 = arg4;
        class262.field3839 = arg1;
        field5726++;
        class311.field4399 = arg3;
        if (!arg5) {
            field5737 = 60;
        }
        if (class262.field3839 >= 100) {
            int var6 = class115.field1469 * 128 + 64;
            int var7 = class39.field512 * 128 + 64;
            int var8 = class132.method835(var7, class29.field394, var6, 2002) - class68.field858;
            int var9 = var6 - class490.field6904;
            int var10 = var8 - class134.field1778;
            int var11 = var7 - class343.field4996;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class214.field3219 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class30.field407 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class140.field1861 = 0;
            if (class214.field3219 < 1024) {
                class214.field3219 = 1024;
            }
            if (class214.field3219 > 3072) {
                class214.field3219 = 3072;
            }
        }
        class136.field1807 = 2;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILwt;)Ljava/lang/Object;")
    public final Object method2418(int arg0, class186 arg1) {
        field5732++;
        long var3 = arg1.method1149((byte) -36);
        class448 var5 = (class448) this.field5723.method2761(var3, (byte) -112);
        if (arg0 <= 119) {
            field5717 = null;
        }
        while (var5 != null) {
            if (var5.field6193.method1150(arg1, 31597)) {
                Object var6 = var5.method863(false);
                if (var6 != null) {
                    if (var5.method862((byte) 110)) {
                        class136 var7 = new class136(arg1, var6, var5.field6197);
                        this.field5723.method2767(-1, var5.field3568, var7);
                        this.field5728.method1553(-93, var7);
                        var7.field3960 = 0L;
                        var5.method1510((byte) -13);
                        var5.method1673((byte) 27);
                    } else {
                        this.field5728.method1553(-95, var5);
                        var5.field3960 = 0L;
                    }
                    return var6;
                }
                var5.method1510((byte) -13);
                var5.method1673((byte) 27);
                this.field5730 += var5.field6197;
            }
            var5 = (class448) this.field5723.method2765(-1);
        }
        return null;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V")
    public static void method2419(byte arg0) {
        field5717 = null;
        if (arg0 > -13) {
            method2419((byte) 52);
        }
        field5734 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/lang/Object;Lwt;)V")
    public final void method2420(int arg0, Object arg1, class186 arg2) {
        this.method2412(false, 1, arg1, arg2);
        field5733++;
        if (arg0 != -12698) {
            this.method2410(-122);
        }
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)I")
    public final int method2421(byte arg0) {
        int var2 = 126 % ((arg0 + 4) / 54);
        field5736++;
        return this.field5730;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(I)V")
    public class408(int arg0) {
        this.field5730 = arg0;
        this.field5720 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5723 = new class470(var2);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLwt;)V")
    private final void method2422(boolean arg0, class186 arg1) {
        field5731++;
        long var3 = arg1.method1149((byte) -36);
        for (class448 var5 = (class448) this.field5723.method2761(var3, (byte) -112); var5 != null; var5 = (class448) this.field5723.method2765(-1)) {
            if (var5.field6193.method1150(arg1, 31597)) {
                this.method2414(-113, var5);
                break;
            }
        }
        if (arg0) {
            method2417(59, -81, 69, 125, -127, false);
        }
    }
}
