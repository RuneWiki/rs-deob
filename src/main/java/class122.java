import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class122 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lsb;")
    public static class98 field2236 = class47.method368(" GMT", 0);

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lgj;")
    public static class226 field2240 = new class226(50);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lsc;")
    public class119 field2241;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lwa;")
    public static class219 field2234;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
    public static final void method907(int arg0, byte arg1) {
        field2235++;
        class211.field3614.method1561(-99, arg0);
        int var2 = -6 % ((56 - arg1) / 40);
        class156.field2843.method1561(-56, arg0);
        class121.field2230.method1561(-95, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method908(boolean arg0) {
        if (!arg0) {
            field2236 = null;
        }
        field2234 = null;
        field2240 = null;
        field2236 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILq;)Z")
    public static final boolean method909(int arg0, class148 arg1) {
        field2238++;
        if (arg1.field2691 == 205) {
            class214.field3642 = 250;
            return true;
        } else {
            if (arg0 != 0) {
                field2239 = -128;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Lv;")
    public static final class205 method910(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class205 var4 = var3.field1133;
            var3.field1133 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lmi;[BII)V")
    public static final void method911(class171 arg0, byte[] arg1, int arg2, int arg3) {
        field2237++;
        class99 var4 = new class99();
        var4.field4061 = (long) arg2;
        var4.field1743 = 0;
        if (arg3 != 32) {
            field2240 = null;
        }
        var4.field1739 = arg1;
        var4.field1748 = arg0;
        class48 var5 = class239.field4123;
        synchronized (class239.field4123) {
            class239.field4123.method376((byte) 13, var4);
        }
        class156.method1133(1);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method912(int arg0) {
        field2242++;
        if (arg0 != 1) {
            field2236 = null;
        }
        while (class144.field2536.method478(class47.field789, -25) >= 27) {
            int var1 = class144.field2536.method483(8, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class180.field3109[var1] == null) {
                class180.field3109[var1] = new class108();
                var2 = true;
            }
            class108 var3 = class180.field3109[var1];
            class87.field1546[class222.field3837++] = var1;
            var3.field4456 = class236.field4071;
            int var4 = class144.field2536.method483(8, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class144.field2536.method483(8, 1);
            if (var5 == 1) {
                class244.field4240[class104.field1855++] = var1;
            }
            int var6 = class144.field2536.method483(8, 1);
            int var7 = class144.field2536.method483(8, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field1928 = class210.method1414(class144.field2536.method483(8, 14), (byte) 111);
            int var8 = class28.field527[class144.field2536.method483(8, 3)];
            var3.field4512 = var3.field1928.field2188;
            var3.field4497 = var3.field1928.field2192;
            var3.field4517 = var3.field1928.field2155;
            var3.field4510 = var3.field1928.field2176;
            var3.field4521 = var3.field1928.field2213;
            var3.field4508 = var3.field1928.field2169;
            var3.field4463 = var3.field1928.field2202;
            var3.field4462 = var3.field1928.field2179;
            var3.field4486 = var3.field1928.field2165;
            if (var2) {
                var3.field4480 = var3.field4527 = var8;
            }
            if (var3.field4497 == 0) {
                var3.field4527 = 0;
            }
            var3.method1765(var6 == 1, class163.field2943.field4501[0] + var7, class163.field2943.field4491[0] - -var4, (byte) 51);
            if (var3.field1928.method893(-9737)) {
                class205.method1382(var3.field4501[0], (class21) null, (class192) null, var3.field4491[0], var3, 0, true, class265.field4640);
            }
        }
        class144.field2536.method479((byte) 126);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method913(int arg0, int arg1) {
        field2232++;
        class134 var2 = class115.method861(2, (byte) 32, arg0);
        var2.method1014(arg1 ^ 0x1B2636B);
        if (arg1 != -5762) {
            method909(-29, (class148) null);
        }
    }
}
