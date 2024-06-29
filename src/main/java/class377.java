import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class377 {

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "Lwd;")
    private class179 field5408 = new class179();

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    private int field5405;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    private int field5406;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "Llk;")
    private class638 field5398;

    @OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
    public static int field5409 = -1;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "Lff;")
    public static class308 field5403 = new class308(14, 0);

    @OriginalMember(owner = "client!mga", name = "q", descriptor = "Lff;")
    public static class308 field5412 = new class308(15, 4);

    @OriginalMember(owner = "client!mga", name = "r", descriptor = "Lff;")
    public static class308 field5413 = new class308(16, -2);

    @OriginalMember(owner = "client!mga", name = "s", descriptor = "Lff;")
    public static class308 field5414 = new class308(17, 0);

    @OriginalMember(owner = "client!mga", name = "t", descriptor = "Lff;")
    public static class308 field5415 = new class308(18, -2);

    @OriginalMember(owner = "client!mga", name = "u", descriptor = "Lff;")
    public static class308 field5416 = new class308(19, -2);

    @OriginalMember(owner = "client!mga", name = "v", descriptor = "Lff;")
    public static class308 field5417 = new class308(22, -2);

    @OriginalMember(owner = "client!mga", name = "w", descriptor = "Lff;")
    public static class308 field5418 = new class308(23, 4);

    @OriginalMember(owner = "client!mga", name = "x", descriptor = "Lff;")
    public static class308 field5419 = new class308(24, -1);

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "Lff;")
    public static class308 field5420 = new class308(26, 0);

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "Lff;")
    public static class308 field5421 = new class308(27, 0);

    @OriginalMember(owner = "client!mga", name = "A", descriptor = "Lff;")
    public static class308 field5422 = new class308(28, -2);

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "[Lff;")
    private static class308[] field5423 = new class308[32];

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!mga", name = "o", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!mga", name = "p", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!mga", name = "C", descriptor = "Lha;")
    public static class473 field5424;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)I")
    public final int method2354(boolean arg0) {
        field5397++;
        if (arg0) {
            this.method2361(null, -107);
        }
        return this.field5405;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/lang/Object;ILwt;)V")
    public final void method2355(Object arg0, int arg1, class520 arg2) {
        field5404++;
        this.method2356(1, arg2, (byte) 66, arg0);
        if (arg1 != 23) {
            this.method2357((byte) -22);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILwt;BLjava/lang/Object;)V")
    private final void method2356(int arg0, class520 arg1, byte arg2, Object arg3) {
        field5402++;
        if (arg0 > this.field5406) {
            throw new IllegalStateException("s>cs");
        }
        this.method2359(arg1, 80);
        this.field5405 -= arg0;
        if (arg2 != 66) {
            this.method2359(null, 70);
        }
        while (this.field5405 < 0) {
            class564 var6 = (class564) this.field5408.method1137((byte) 40);
            this.method2361(var6, arg2 ^ 0x62);
        }
        class37 var5 = new class37(arg1, arg3, arg0);
        this.field5398.method3666((byte) 65, arg1.method3106((byte) -127), var5);
        this.field5408.method1139((byte) -84, var5);
        var5.field581 = 0L;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V")
    public final void method2357(byte arg0) {
        field5411++;
        if (arg0 <= 59) {
            this.method2358(-111);
        }
        this.field5408.method1143(-96);
        this.field5398.method3672(0);
        this.field5405 = this.field5406;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
    public final void method2358(int arg0) {
        if (arg0 < 45) {
            this.field5408 = null;
        }
        for (class564 var2 = (class564) this.field5408.method1140(-76); var2 != null; var2 = (class564) this.field5408.method1138(124)) {
            if (var2.method293(true)) {
                var2.method527(-11229);
                var2.method416(9867);
                this.field5405 += var2.field7976;
            }
        }
        field5399++;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lwt;I)V")
    private final void method2359(class520 arg0, int arg1) {
        field5400++;
        long var3 = arg0.method3106((byte) -126);
        if (arg1 < 69) {
            field5419 = null;
        }
        for (class564 var5 = (class564) this.field5398.method3669(false, var3); var5 != null; var5 = (class564) this.field5398.method3673(-81)) {
            if (var5.field7974.method3107(arg0, (byte) 64)) {
                this.method2361(var5, 32);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IZ)V")
    public final void method2360(int arg0, boolean arg1) {
        if (class145.field1869 != null) {
            for (class564 var3 = (class564) this.field5408.method1140(-86); var3 != null; var3 = (class564) this.field5408.method1138(117)) {
                if (var3.method293(!arg1)) {
                    if (var3.method294((byte) 36) == null) {
                        var3.method527(-11229);
                        var3.method416(9867);
                        this.field5405 += var3.field7976;
                    }
                } else if (++var3.field581 > (long) arg0) {
                    class564 var4 = class145.field1869.method704(var3, -19499);
                    this.field5398.method3666((byte) 65, var3.field762, var4);
                    class235.method1609(var4, 118, var3);
                    var3.method527(-11229);
                    var3.method416(9867);
                }
            }
        }
        if (!arg1) {
            field5401++;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Law;I)V")
    private final void method2361(class564 arg0, int arg1) {
        if (arg1 != 32) {
            return;
        }
        if (arg0 != null) {
            arg0.method527(-11229);
            arg0.method416(9867);
            this.field5405 += arg0.field7976;
        }
        field5396++;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)I")
    public final int method2362(byte arg0) {
        field5407++;
        if (arg0 != 31) {
            this.method2357((byte) 95);
        }
        return this.field5406;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V")
    public static void method2363(int arg0) {
        field5421 = null;
        field5416 = null;
        field5423 = null;
        field5422 = null;
        field5415 = null;
        field5413 = null;
        field5414 = null;
        field5420 = null;
        field5412 = null;
        field5418 = null;
        field5424 = null;
        field5417 = null;
        field5419 = null;
        field5403 = null;
        if (arg0 != -3105) {
            method2363(27);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILwt;)Ljava/lang/Object;")
    public final Object method2364(int arg0, class520 arg1) {
        if (arg0 != -19800) {
            this.method2360(12, true);
        }
        field5410++;
        long var3 = arg1.method3106((byte) -128);
        for (class564 var5 = (class564) this.field5398.method3669(false, var3); var5 != null; var5 = (class564) this.field5398.method3673(-103)) {
            if (var5.field7974.method3107(arg1, (byte) 64)) {
                Object var6 = var5.method294((byte) 36);
                if (var6 != null) {
                    if (var5.method293(true)) {
                        class37 var7 = new class37(arg1, var6, var5.field7976);
                        this.field5398.method3666((byte) 65, var5.field762, var7);
                        this.field5408.method1139((byte) -84, var7);
                        var7.field581 = 0L;
                        var5.method527(-11229);
                        var5.method416(9867);
                    } else {
                        this.field5408.method1139((byte) -84, var5);
                        var5.field581 = 0L;
                    }
                    return var6;
                }
                var5.method527(-11229);
                var5.method416(9867);
                this.field5405 += var5.field7976;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V")
    public class377(int arg0) {
        this.field5405 = arg0;
        this.field5406 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5398 = new class638(var2);
    }

    static {
        class308[] var0 = class577.method3379(119);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field5423[var0[var1].field4450] = var0[var1];
        }
    }
}
