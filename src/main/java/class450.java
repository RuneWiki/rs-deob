import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class450 {

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Lje;")
    private class265 field5763;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    private int field5755;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field5761;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lil;")
    private class68 field5749;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Z")
    public static boolean field5747 = false;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lqfa;")
    public static class372 field5756 = new class372("", 14);

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field5767 = 1;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
    public final int method2404(byte arg0) {
        field5748++;
        int var2 = 0;
        class677 var3 = (class677) this.field5763.method1546((byte) -72);
        if (arg0 < 27) {
            field5747 = true;
        }
        while (var3 != null) {
            if (!var3.method369(-116)) {
                var2++;
            }
            var3 = (class677) this.field5763.method1536(1252027233);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLqj;IIII)Lar;")
    public static final class4 method2405(byte arg0, class548 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5757++;
        if (arg0 != -87) {
            field5767 = 4;
        }
        if (!arg1.field7586 && (!class4.method36(arg2, (byte) 98) || !class4.method36(arg4, (byte) 98))) {
            return arg1.field7540 ? new class4(arg1, 34037, arg5, arg3, arg2, arg4, true) : new class4(arg1, arg5, arg3, arg2, arg4, class391.method2101(arg2, arg0 + 215), class391.method2101(arg4, arg0 ^ 0xFFFFFF29), true);
        } else {
            return new class4(arg1, 3553, arg5, arg3, arg2, arg4, true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public final void method2406(int arg0) {
        if (arg0 != 18385) {
            field5767 = -32;
        }
        this.field5763.method1540(1252027233);
        field5762++;
        this.field5749.method398(true);
        this.field5761 = this.field5755;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static void method2407(byte arg0) {
        field5756 = null;
        if (arg0 < 109) {
            field5767 = 28;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
    public final int method2408(int arg0) {
        if (arg0 > -78) {
            this.method2408(68);
        }
        field5753++;
        return this.field5755;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method2409(long arg0, Object arg1, int arg2) {
        this.method2415((byte) -124, arg2, arg0, arg1);
        field5760++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method2410(boolean arg0) {
        field5764++;
        class677 var2 = (class677) this.field5749.method407((byte) 124);
        if (!arg0) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method368(-1);
            if (var3 != null) {
                return var3;
            }
            class677 var4 = var2;
            var2 = (class677) this.field5749.method403(12561);
            var4.method1871(-12);
            var4.method2744((byte) -103);
            this.field5761 += var4.field9505;
        }
        return null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
    public final void method2411(boolean arg0, int arg1) {
        if (!arg0) {
            this.method2412((byte) 123);
        }
        field5765++;
        if (class127.field1591 == null) {
            return;
        }
        for (class677 var3 = (class677) this.field5763.method1546((byte) -77); var3 != null; var3 = (class677) this.field5763.method1536(1252027233)) {
            if (var3.method369(-105)) {
                if (var3.method368(-1) == null) {
                    var3.method1871(-80);
                    var3.method2744((byte) -69);
                    this.field5761++;
                }
            } else if ((long) arg1 < ++var3.field6874) {
                class677 var4 = class127.field1591.method1869(18855, var3);
                this.field5749.method402(var4, (byte) -55, var3.field4199);
                class494.method2666(var3, 2, var4);
                var3.method1871(-102);
                var3.method2744((byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public final void method2412(byte arg0) {
        field5754++;
        class677 var2 = (class677) this.field5763.method1546((byte) -79);
        int var3 = -89 / ((-arg0 - 82) / 36);
        while (var2 != null) {
            if (var2.method369(-85)) {
                var2.method1871(-97);
                var2.method2744((byte) -86);
                this.field5761 += var2.field9505;
            }
            var2 = (class677) this.field5763.method1536(1252027233);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
    public class450(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)I")
    public final int method2413(int arg0) {
        if (arg0 < 47) {
            return 49;
        } else {
            field5766++;
            return this.field5761;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBI)V")
    public static final void method2414(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 118) {
            field5756 = null;
        }
        field5750++;
        class424 var4 = class683.field9599[arg0][arg1];
        class372.method2030(arg3, var4 == null ? class286.field3552 : var4, -124);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIJLjava/lang/Object;)V")
    public final void method2415(byte arg0, int arg1, long arg2, Object arg3) {
        field5758++;
        if (this.field5755 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method2419(34037, arg2);
        this.field5761 -= arg1;
        while (this.field5761 < 0) {
            class677 var7 = (class677) this.field5763.method1537(-21957);
            this.method2416(var7, 5106);
        }
        class510 var6 = new class510(arg3, arg1);
        this.field5749.method402(var6, (byte) -76, arg2);
        this.field5763.method1541(75, var6);
        var6.field6874 = 0L;
        if (arg0 >= -116) {
            this.method2419(1, -57L);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lsp;I)V")
    private final void method2416(class677 arg0, int arg1) {
        field5751++;
        if (arg1 == 5106 && arg0 != null) {
            arg0.method1871(arg1 - 5187);
            arg0.method2744((byte) -63);
            this.field5761 += arg0.field9505;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2417(int arg0) {
        field5759++;
        if (arg0 != -26973) {
            this.method2412((byte) -21);
        }
        class677 var2 = (class677) this.field5749.method403(12561);
        while (var2 != null) {
            Object var3 = var2.method368(-1);
            if (var3 != null) {
                return var3;
            }
            class677 var4 = var2;
            var2 = (class677) this.field5749.method403(12561);
            var4.method1871(-91);
            var4.method2744((byte) -101);
            this.field5761 += var4.field9505;
        }
        return null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method2418(long arg0, byte arg1) {
        field5752++;
        if (arg1 != 100) {
            return null;
        }
        class677 var4 = (class677) this.field5749.method399(arg1 - 32848, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method368(arg1 ^ 0xFFFFFF9B);
        if (var5 == null) {
            var4.method1871(arg1 ^ 0xFFFFFF86);
            var4.method2744((byte) -59);
            this.field5761 += var4.field9505;
            return null;
        }
        if (var4.method369(-101)) {
            class510 var6 = new class510(var5, var4.field9505);
            this.field5749.method402(var6, (byte) -101, var4.field4199);
            this.field5763.method1541(75, var6);
            var6.field6874 = 0L;
            var4.method1871(arg1 ^ 0xFFFFFFF9);
            var4.method2744((byte) -85);
        } else {
            this.field5763.method1541(75, var4);
            var4.field6874 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJ)V")
    private final void method2419(int arg0, long arg1) {
        field5768++;
        class677 var4 = (class677) this.field5749.method399(-32748, arg1);
        if (arg0 != 34037) {
            this.field5763 = null;
        }
        this.method2416(var4, 5106);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
    public class450(int arg0, int arg1) {
        this.field5763 = new class265();
        this.field5755 = arg0;
        this.field5761 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && arg1 > var3; var3 += var3) {
        }
        this.field5749 = new class68(var3);
    }
}
