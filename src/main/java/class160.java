import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class160 {

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "Lpw;")
    private class649 field2398 = new class649();

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "I")
    private int field2399;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "Loj;")
    private class346 field2389;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lrd;I)V")
    private final void method1103(class306 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method2971(arg1 ^ 0x6D51);
            arg0.method3691((byte) -119);
            this.field2387 += arg0.field4503;
        }
        if (arg1 != 27984) {
            this.field2389 = null;
        }
        field2393++;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lwea;I)V")
    private final void method1104(class142 arg0, int arg1) {
        field2394++;
        int var3 = -80 / ((8 - arg1) / 35);
        long var4 = arg0.method1006((byte) 108);
        for (class306 var6 = (class306) this.field2389.method2061(-17305, var4); var6 != null; var6 = (class306) this.field2389.method2064(6654)) {
            if (var6.field4502.method1005(arg0, 127)) {
                this.method1103(var6, 27984);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V")
    public final void method1105(int arg0, int arg1) {
        if (class634.field8877 != null) {
            for (class306 var3 = (class306) this.field2398.method3611(255); var3 != null; var3 = (class306) this.field2398.method3610(-30295)) {
                if (var3.method366(126)) {
                    if (var3.method367(arg0 ^ 0xFFFFBC76) == null) {
                        var3.method2971(1);
                        var3.method3691((byte) -119);
                        this.field2387 += var3.field4503;
                    }
                } else if (++var3.field9371 > (long) arg1) {
                    class306 var4 = class634.field8877.method1972((byte) 53, var3);
                    this.field2389.method2063(var3.field7311, 1, var4);
                    class545.method3000(arg0 + 5, var4, var3);
                    var3.method2971(1);
                    var3.method3691((byte) -119);
                }
            }
        }
        if (arg0 != 0) {
            this.method1108(null, 16, -69, null);
        }
        field2402++;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public final void method1106(byte arg0) {
        if (arg0 != 34) {
            this.field2398 = null;
        }
        field2395++;
        this.field2398.method3616(-129);
        this.field2389.method2060(0);
        this.field2387 = this.field2399;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)I")
    public final int method1107(int arg0) {
        if (arg0 != 0) {
            this.method1111(null, (byte) -18, null);
        }
        field2392++;
        return this.field2387;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/Object;IILwea;)V")
    private final void method1108(Object arg0, int arg1, int arg2, class142 arg3) {
        field2401++;
        if (arg1 > this.field2399) {
            throw new IllegalStateException("s>cs");
        }
        this.method1104(arg3, -109);
        this.field2387 -= arg1;
        while (this.field2387 < 0) {
            class306 var6 = (class306) this.field2398.method3613(-119);
            this.method1103(var6, 27984);
        }
        class532 var5 = new class532(arg3, arg0, arg1);
        this.field2389.method2063(arg3.method1006((byte) 96), arg2, var5);
        this.field2398.method3615(arg2 - 31532, var5);
        var5.field9371 = 0L;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLwea;)Ljava/lang/Object;")
    public final Object method1109(byte arg0, class142 arg1) {
        field2391++;
        if (arg0 < 104) {
            this.method1110(106);
        }
        long var3 = arg1.method1006((byte) 61);
        for (class306 var5 = (class306) this.field2389.method2061(-17305, var3); var5 != null; var5 = (class306) this.field2389.method2064(6654)) {
            if (var5.field4502.method1005(arg1, 126)) {
                Object var6 = var5.method367(-17290);
                if (var6 != null) {
                    if (var5.method366(124)) {
                        class532 var7 = new class532(arg1, var6, var5.field4503);
                        this.field2389.method2063(var5.field7311, 1, var7);
                        this.field2398.method3615(-31531, var7);
                        var7.field9371 = 0L;
                        var5.method2971(1);
                        var5.method3691((byte) -119);
                    } else {
                        this.field2398.method3615(-31531, var5);
                        var5.field9371 = 0L;
                    }
                    return var6;
                }
                var5.method2971(1);
                var5.method3691((byte) -119);
                this.field2387 += var5.field4503;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)V")
    public final void method1110(int arg0) {
        class306 var2 = (class306) this.field2398.method3611(255);
        if (arg0 != 18438) {
            return;
        }
        while (var2 != null) {
            if (var2.method366(-14)) {
                var2.method2971(arg0 - 18437);
                var2.method3691((byte) -119);
                this.field2387 += var2.field4503;
            }
            var2 = (class306) this.field2398.method3610(-30295);
        }
        field2397++;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/Object;BLwea;)V")
    public final void method1111(Object arg0, byte arg1, class142 arg2) {
        this.method1108(arg0, 1, 1, arg2);
        field2396++;
        if (arg1 > -29) {
            this.method1107(83);
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)I")
    public final int method1112(int arg0) {
        field2388++;
        if (arg0 != 3771) {
            this.method1109((byte) 52, null);
        }
        return this.field2399;
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V")
    public class160(int arg0) {
        this.field2387 = arg0;
        this.field2399 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2389 = new class346(var2);
    }
}
