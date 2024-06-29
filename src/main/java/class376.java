import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class376 {

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Luaa;")
    private class395 field5532 = new class395(64);

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lgp;")
    private class561 field5530;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lgp;")
    public class561 field5524;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Lio;")
    public static class151 field5527 = new class151(14, 0, 4, 1);

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[Lmb;")
    public static class285[] field5528 = new class285[14];

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field5531 = 0;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 5)
    public final void method2282(int arg0) {
        field5522++;
        class395 var2 = this.field5532;
        synchronized (this.field5532) {
            this.field5532.method2406(-123);
        }
        if (arg0 <= 19) {
            field5521 = 110;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Ljd;", line = 24)
    public final class496 method2283(int arg0, int arg1) {
        field5523++;
        class395 var3 = this.field5532;
        class496 var4;
        synchronized (this.field5532) {
            var4 = (class496) this.field5532.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field5530;
        byte[] var6;
        synchronized (this.field5530) {
            var6 = this.field5530.method3175(arg1, (byte) -53, 3);
            if (arg0 <= 108) {
                field5527 = null;
            }
        }
        class496 var7 = new class496();
        var7.field6960 = this;
        if (var6 != null) {
            var7.method2826(new class268(var6), (byte) 124);
        }
        class395 var8 = this.field5532;
        synchronized (this.field5532) {
            this.field5532.method2408(var7, (long) arg1, -111);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V", line = 54)
    public final void method2284(byte arg0, int arg1) {
        int var3 = 81 / ((-arg0 - 37) / 57);
        field5525++;
        class395 var4 = this.field5532;
        synchronized (this.field5532) {
            this.field5532.method2397(arg1, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 66)
    public static void method2285(int arg0) {
        if (arg0 != -8) {
            field5521 = -3;
        }
        field5527 = null;
        field5528 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 78)
    public static final void method2286(boolean arg0, String arg1, int arg2) {
        field5520++;
        int var3 = class43.field586;
        int[] var4 = class343.field4927;
        boolean var5 = false;
        if (!arg0) {
            field5528 = null;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class400 var7 = class39.field536[var4[var6]];
            if (var7 != null && class644.field9367 != var7 && var7.field5958 != null && var7.field5958.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg2 == 1) {
                    class65.field902++;
                    class624.method3537(-116, class146.field2245);
                    class127.field2088.method1718(-3, var4[var6]);
                    class127.field2088.method1737((byte) -121, 0);
                } else if (arg2 == 4) {
                    class461.field6682++;
                    class624.method3537(-108, class264.field3840);
                    class127.field2088.method1747(var4[var6], -29356);
                    class127.field2088.method1698((byte) -106, 0);
                } else if (arg2 == 5) {
                    class362.field5146++;
                    class624.method3537(-97, class340.field4890);
                    class127.field2088.method1718(-3, var4[var6]);
                    class127.field2088.method1710(0, 106);
                } else if (arg2 == 6) {
                    class624.method3537(-123, class516.field7146);
                    client.field8765++;
                    class127.field2088.method1737((byte) -76, 0);
                    class127.field2088.method1699(true, var4[var6]);
                } else if (arg2 == 7) {
                    class624.method3537(-87, class387.field5756);
                    class361.field5120++;
                    class127.field2088.method1737((byte) -53, 0);
                    class127.field2088.method1747(var4[var6], -29356);
                }
                break;
            }
        }
        if (!var5) {
            class83.method758((byte) 125, class93.field1640.method3220(false, class538.field7500) + arg1);
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 171)
    public final void method2287(int arg0) {
        class395 var2 = this.field5532;
        synchronized (this.field5532) {
            this.field5532.method2404((byte) -82);
        }
        if (arg0 <= -117) {
            field5526++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Lhca;", line = 184)
    public static final class179 method2288(int arg0, int arg1) {
        field5529++;
        class179[] var2 = class143.method1056((byte) -18);
        int var3 = 0;
        if (arg1 < 56) {
            method2285(104);
        }
        while (var2.length > var3) {
            class179 var4 = var2[var3];
            if (var4.field2611 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljc;ILgp;Lgp;)V", line = 216)
    public class376(class584 arg0, int arg1, class561 arg2, class561 arg3) {
        this.field5530 = arg2;
        this.field5524 = arg3;
        this.field5530.method3164(3, true);
    }
}
