import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class395 {

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "Llj;")
    private class59 field5931 = new class59();

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "I")
    private int field5929;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    private int field5930;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lcb;")
    private class78 field5919;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lfaa;")
    public static class273 field5915 = new class273();

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
    public final int method2393(byte arg0) {
        field5913++;
        int var2 = 0;
        for (class89 var3 = (class89) this.field5931.method475(-74); var3 != null; var3 = (class89) this.field5931.method480(-56)) {
            if (!var3.method800((byte) -26)) {
                var2++;
            }
        }
        int var4 = 11 / ((68 - arg0) / 38);
        return var2;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IJLjava/lang/Object;I)V")
    private final void method2394(int arg0, long arg1, Object arg2, int arg3) {
        field5923++;
        if (arg0 != 2192) {
            this.field5931 = null;
        }
        if (arg3 > this.field5930) {
            throw new IllegalStateException("s>cs");
        }
        this.method2403(arg1, (byte) 81);
        this.field5929 -= arg3;
        while (this.field5929 < 0) {
            class89 var7 = (class89) this.field5931.method472(true);
            this.method2399((byte) -77, var7);
        }
        class639 var6 = new class639(arg2, arg3);
        this.field5919.method737(arg1, (byte) 92, var6);
        this.field5931.method477(var6, false);
        var6.field6471 = 0L;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method2395(boolean arg0) {
        if (!arg0) {
            this.method2403(-44L, (byte) 122);
        }
        field5924++;
        class89 var2 = (class89) this.field5919.method736(-1);
        while (var2 != null) {
            Object var3 = var2.method798(-66);
            if (var3 != null) {
                return var3;
            }
            class89 var4 = var2;
            var2 = (class89) this.field5919.method736(-1);
            var4.method911(-52);
            var4.method2619(true);
            this.field5929 += var2.field1600;
        }
        return null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)I")
    public final int method2396(int arg0) {
        if (arg0 == 55) {
            field5914++;
            return this.field5930;
        } else {
            return -110;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IB)V")
    public final void method2397(int arg0, byte arg1) {
        if (arg1 > -45) {
            this.field5931 = null;
        }
        field5918++;
        if (class576.field8202 == null) {
            return;
        }
        for (class89 var3 = (class89) this.field5931.method475(-128); var3 != null; var3 = (class89) this.field5931.method480(-118)) {
            if (var3.method800((byte) -26)) {
                if (var3.method798(-42) == null) {
                    var3.method911(-52);
                    var3.method2619(true);
                    this.field5929++;
                }
            } else if (((long) arg0) < (++var3.field6471)) {
                class89 var4 = class576.field8202.method1063(var3, (byte) 11);
                this.field5919.method737(var3.field1798, (byte) 92, var4);
                class322.method2006(var3, var4, (byte) 32);
                var3.method911(-52);
                var3.method2619(true);
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)Lcn;")
    public static final class21 method2398(int arg0) {
        field5927++;
        if (arg0 != -553) {
            field5915 = null;
        }
        class21 var1 = (class21) class74.field1380.method475(arg0 + 498);
        if (var1 != null) {
            var1.method911(-52);
            var1.method2619(true);
            return var1;
        }
        class21 var2;
        do {
            var2 = (class21) class471.field6776.method475(80);
            if (var2 == null) {
                return null;
            }
            if (var2.method229(17173856) > class508.method2860(false)) {
                return null;
            }
            var2.method911(-52);
            var2.method2619(true);
        } while ((var2.field6471 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BLow;)V")
    private final void method2399(byte arg0, class89 arg1) {
        field5925++;
        if (arg0 == -77 && arg1 != null) {
            arg1.method911(-52);
            arg1.method2619(true);
            this.field5929 += arg1.field1600;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
    public final int method2400(int arg0) {
        if (arg0 > -105) {
            this.field5931 = null;
        }
        field5920++;
        return this.field5929;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2401(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return false;
        }
        field5917++;
        if (((arg2 & 0x10000) != 0 | class219.method1469((byte) 67, arg2, arg1)) || class441.method2611(91, arg2, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class586.method3358(55, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)V")
    public static void method2402(int arg0) {
        if (arg0 > 104) {
            field5915 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(JB)V")
    private final void method2403(long arg0, byte arg1) {
        field5916++;
        if (arg1 < 30) {
            this.method2395(true);
        }
        class89 var4 = (class89) this.field5919.method740(0, arg0);
        this.method2399((byte) -77, var4);
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
    public final void method2404(byte arg0) {
        if (arg0 > -41) {
            return;
        }
        for (class89 var2 = (class89) this.field5931.method475(36); var2 != null; var2 = (class89) this.field5931.method480(-49)) {
            if (var2.method800((byte) -26)) {
                var2.method911(-52);
                var2.method2619(true);
                this.field5929 += var2.field1600;
            }
        }
        field5926++;
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2405(int arg0) {
        field5928++;
        if (arg0 != 55) {
            this.method2395(true);
        }
        class89 var2 = (class89) this.field5919.method734(arg0 - 55);
        while (var2 != null) {
            Object var3 = var2.method798(-39);
            if (var3 != null) {
                return var3;
            }
            class89 var4 = var2;
            var2 = (class89) this.field5919.method736(-1);
            var4.method911(-52);
            var4.method2619(true);
            this.field5929 += var2.field1600;
        }
        return null;
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)V")
    public final void method2406(int arg0) {
        field5932++;
        this.field5931.method478(0);
        this.field5919.method739(2048);
        int var2 = -116 % ((-arg0 - 79) / 37);
        this.field5929 = this.field5930;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZJ)Ljava/lang/Object;")
    public final Object method2407(boolean arg0, long arg1) {
        field5922++;
        class89 var4 = (class89) this.field5919.method740(0, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0) {
            this.method2397(-52, (byte) -32);
        }
        Object var5 = var4.method798(-97);
        if (var5 == null) {
            var4.method911(-52);
            var4.method2619(true);
            this.field5929 += var4.field1600;
            return null;
        }
        if (var4.method800((byte) -26)) {
            class639 var6 = new class639(var5, var4.field1600);
            this.field5919.method737(var4.field1798, (byte) 92, var6);
            this.field5931.method477(var6, false);
            var6.field6471 = 0L;
            var4.method911(-52);
            var4.method2619(true);
        } else {
            this.field5931.method477(var4, false);
            var4.field6471 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method2408(Object arg0, long arg1, int arg2) {
        if (arg2 > -107) {
            method2402(102);
        }
        this.method2394(2192, arg1, arg0, 1);
        field5921++;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(I)V")
    public class395(int arg0) {
        this.field5929 = arg0;
        this.field5930 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5919 = new class78(var2);
    }
}
