import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class288 {

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "Lpo;")
    private class375 field4365 = new class375();

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    private int field4361;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
    private int field4374;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "Lke;")
    private class407 field4371;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "Loe;")
    public static class127 field4370 = new class127(72, 10);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Lmo;")
    public static class507 field4362;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 5)
    public static void method1747(byte arg0) {
        if (arg0 < 98) {
            method1747((byte) 110);
        }
        field4362 = null;
        field4370 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)I", line = 23)
    public final int method1748(int arg0) {
        if (arg0 >= -35) {
            this.method1755(37, null, -54, 90L);
        }
        field4367++;
        return this.field4361;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V", line = 34)
    public final void method1749(byte arg0) {
        field4360++;
        int var2 = 53 / ((arg0 - 66) / 57);
        for (class241 var3 = (class241) this.field4365.method2260((byte) 72); var3 != null; var3 = (class241) this.field4365.method2258(0)) {
            if (var3.method1450(8191)) {
                var3.method1121(false);
                var3.method1512((byte) 119);
                this.field4374 += var3.field3633;
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I", line = 61)
    public final int method1750(int arg0) {
        int var2 = 60 / ((arg0 - 40) / 55);
        field4357++;
        return this.field4374;
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 72)
    public final Object method1751(byte arg0) {
        field4372++;
        class241 var2 = (class241) this.field4371.method2415((byte) -86);
        if (arg0 >= -11) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method1449(-16);
            if (var3 != null) {
                return var3;
            }
            class241 var4 = var2;
            var2 = (class241) this.field4371.method2416((byte) -123);
            var4.method1121(false);
            var4.method1512((byte) 121);
            this.field4374 += var2.field3633;
        }
        return null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 105)
    public final Object method1752(int arg0, long arg1) {
        field4354++;
        class241 var4 = (class241) this.field4371.method2409(false, arg1);
        if (var4 == null) {
            return null;
        } else if (arg0 == 0) {
            Object var5 = var4.method1449(121);
            if (var5 == null) {
                var4.method1121(false);
                var4.method1512((byte) 123);
                this.field4374 += var4.field3633;
                return null;
            }
            if (var4.method1450(arg0 ^ 0x1FFF)) {
                class511 var6 = new class511(var5, var4.field3633);
                this.field4371.method2413(var4.field2798, -1, var6);
                this.field4365.method2256(var6, 30978);
                var6.field3839 = 0L;
                var4.method1121(false);
                var4.method1512((byte) 119);
            } else {
                this.field4365.method2256(var4, 30978);
                var4.field3839 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lwu;B)V", line = 149)
    private final void method1753(class241 arg0, byte arg1) {
        if (arg1 <= 12) {
            this.field4374 = -66;
        }
        field4355++;
        if (arg0 != null) {
            arg0.method1121(false);
            arg0.method1512((byte) 120);
            this.field4374 += arg0.field3633;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ltq;I)V", line = 166)
    public static final void method1754(class427 arg0, int arg1) {
        if (arg1 != 0) {
            field4370 = null;
        }
        if (class476.field7258 == arg0.field6245) {
            class77.field1376[arg0.field6232] = true;
        }
        field4363++;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/Object;IJ)V", line = 182)
    private final void method1755(int arg0, Object arg1, int arg2, long arg3) {
        field4364++;
        if (this.field4361 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method1757(arg3, 1);
        this.field4374 -= arg2;
        while (this.field4374 < 0) {
            class241 var7 = (class241) this.field4365.method2254((byte) -105);
            this.method1753(var7, (byte) 115);
        }
        class511 var6 = new class511(arg1, arg2);
        this.field4371.method2413(arg3, -1, var6);
        this.field4365.method2256(var6, 30978);
        if (arg0 > 67) {
            var6.field3839 = 0L;
        }
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 212)
    public final Object method1756(int arg0) {
        field4369++;
        if (arg0 != -1219) {
            field4370 = null;
        }
        class241 var2 = (class241) this.field4371.method2416((byte) -119);
        while (var2 != null) {
            Object var3 = var2.method1449(123);
            if (var3 != null) {
                return var3;
            }
            class241 var4 = var2;
            var2 = (class241) this.field4371.method2416((byte) -118);
            var4.method1121(false);
            var4.method1512((byte) 123);
            this.field4374 += var2.field3633;
        }
        return null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(JI)V", line = 247)
    private final void method1757(long arg0, int arg1) {
        if (arg1 != 1) {
            this.method1755(51, null, -43, -119L);
        }
        field4359++;
        class241 var4 = (class241) this.field4371.method2409(false, arg0);
        this.method1753(var4, (byte) 118);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/Object;J)V", line = 261)
    public final void method1758(int arg0, Object arg1, long arg2) {
        field4368++;
        this.method1755(104, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)V", line = 273)
    public static final void method1759(int arg0) {
        class328.field4921 = 0;
        field4353++;
        for (int var1 = arg0; var1 < 2048; var1++) {
            class58.field997[var1] = null;
            class86.field1498[var1] = 1;
            class60.field1010[var1] = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V", line = 294)
    public final void method1760(int arg0, int arg1) {
        if (class274.field4155 != null) {
            for (class241 var3 = (class241) this.field4365.method2260((byte) 62); var3 != null; var3 = (class241) this.field4365.method2258(0)) {
                if (var3.method1450(8191)) {
                    if (var3.method1449(124) == null) {
                        var3.method1121(false);
                        var3.method1512((byte) 124);
                        this.field4374++;
                    }
                } else if (++var3.field3839 > (long) arg0) {
                    class241 var4 = class274.field4155.method2446((byte) 19, var3);
                    this.field4371.method2413(var3.field2798, -1, var4);
                    class46.method324(var4, -124, var3);
                    var3.method1121(false);
                    var3.method1512((byte) 124);
                }
            }
        }
        if (arg1 == 30398) {
            field4358++;
        }
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V", line = 343)
    public final void method1761(int arg0) {
        field4356++;
        if (arg0 <= -105) {
            this.field4365.method2257((byte) 42);
            this.field4371.method2412(119);
            this.field4374 = this.field4361;
        }
    }

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)I", line = 357)
    public final int method1762(int arg0) {
        field4366++;
        int var2 = arg0;
        for (class241 var3 = (class241) this.field4365.method2260((byte) 91); var3 != null; var3 = (class241) this.field4365.method2258(0)) {
            if (!var3.method1450(8191)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V", line = 381)
    public class288(int arg0) {
        this.field4361 = arg0;
        this.field4374 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4371 = new class407(var2);
    }
}
