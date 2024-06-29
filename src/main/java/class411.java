import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class411 {

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "Ljp;")
    public class276 field6207 = new class276();

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "Lrr;")
    public static class280 field6223 = new class280(13, 0, 1, 0);

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "Llo;")
    public static class306 field6225 = new class306("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "Ljp;")
    private class276 field6224;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)Ljp;")
    public final class276 method2534(int arg0) {
        field6220++;
        class276 var2 = this.field6224;
        if (arg0 != -4) {
            return null;
        } else if (this.field6207 == var2) {
            this.field6224 = null;
            return null;
        } else {
            this.field6224 = var2.field4530;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)Ljp;")
    public final class276 method2535(byte arg0) {
        field6212++;
        class276 var2 = this.field6224;
        if (arg0 > -47) {
            this.method2544((byte) 3);
        }
        if (this.field6207 == var2) {
            this.field6224 = null;
            return null;
        } else {
            this.field6224 = var2.field4535;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method2536(byte arg0, int arg1) {
        field6208++;
        String var2 = Integer.toString(arg1);
        if (arg0 != 49) {
            return null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class337.field5292.method1954(class300.field4813, -30366) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class346.field5430.method1954(class300.field4813, -30366) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
    public static final Object method2537(boolean arg0, byte[] arg1, boolean arg2) {
        field6218++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class415.field6300) {
            try {
                class190 var3 = (class190) Class.forName("sk").getDeclaredConstructor().newInstance();
                var3.method1284(arg1, (byte) -28);
                return var3;
            } catch (Throwable var4) {
                class415.field6300 = true;
            }
        }
        if (arg0) {
            field6223 = null;
        }
        return arg2 ? class7.method44(arg0, arg1) : arg1;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Ljp;")
    public final class276 method2538(int arg0) {
        field6211++;
        if (arg0 != -3) {
            return null;
        }
        class276 var2 = this.field6207.field4535;
        if (this.field6207 == var2) {
            this.field6224 = null;
            return null;
        } else {
            this.field6224 = var2.field4535;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)Ljp;")
    public final class276 method2539(int arg0) {
        field6222++;
        class276 var2 = this.field6207.field4535;
        if (arg0 != 0) {
            this.field6224 = null;
        }
        if (this.field6207 == var2) {
            return null;
        } else {
            var2.method1821((byte) 113);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljp;Lpu;I)V")
    private final void method2540(class276 arg0, class411 arg1, int arg2) {
        field6216++;
        class276 var4 = this.field6207.field4530;
        this.field6207.field4530 = arg0.field4530;
        if (arg2 != 1038) {
            return;
        }
        arg0.field4530.field4535 = this.field6207;
        if (this.field6207 != arg0) {
            arg0.field4530 = arg1.field6207.field4530;
            arg0.field4530.field4535 = arg0;
            var4.field4535 = arg1.field6207;
            arg1.field6207.field4530 = var4;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjp;)V")
    public final void method2541(int arg0, class276 arg1) {
        if (arg1.field4530 != null) {
            arg1.method1821((byte) -123);
        }
        if (arg0 != 0) {
            method2537(true, null, true);
        }
        field6217++;
        arg1.field4530 = this.field6207.field4530;
        arg1.field4535 = this.field6207;
        arg1.field4530.field4535 = arg1;
        arg1.field4535.field4530 = arg1;
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)I")
    public final int method2542(int arg0) {
        field6219++;
        int var2 = -22 % ((arg0 + 36) / 63);
        int var3 = 0;
        for (class276 var4 = this.field6207.field4535; var4 != this.field6207; var4 = var4.field4535) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
    public final void method2543(int arg0) {
        if (arg0 != 7655) {
            return;
        }
        field6209++;
        while (true) {
            class276 var2 = this.field6207.field4535;
            if (this.field6207 == var2) {
                this.field6224 = null;
                return;
            }
            var2.method1821((byte) 62);
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)Z")
    public final boolean method2544(byte arg0) {
        field6215++;
        if (arg0 == 61) {
            return this.field6207.field4535 == this.field6207;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljp;I)V")
    public final void method2545(class276 arg0, int arg1) {
        field6221++;
        if (arg1 != 4009) {
            this.field6224 = null;
        }
        if (arg0.field4530 != null) {
            arg0.method1821((byte) 33);
        }
        arg0.field4535 = this.field6207.field4535;
        arg0.field4530 = this.field6207;
        arg0.field4530.field4535 = arg0;
        arg0.field4535.field4530 = arg0;
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(B)Ljp;")
    public final class276 method2546(byte arg0) {
        field6214++;
        class276 var2 = this.field6207.field4530;
        if (this.field6207 == var2) {
            this.field6224 = null;
            return null;
        }
        if (arg0 > -80) {
            this.field6224 = null;
        }
        this.field6224 = var2.field4530;
        return var2;
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(B)V")
    public static void method2547(byte arg0) {
        field6225 = null;
        field6223 = null;
        if (arg0 != -18) {
            field6223 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lpu;I)V")
    public final void method2548(class411 arg0, int arg1) {
        field6213++;
        this.method2540(this.field6207.field4535, arg0, 1038);
        if (arg1 != 12480) {
            field6225 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
    public class411() {
        this.field6207.field4530 = this.field6207;
        this.field6207.field4535 = this.field6207;
    }
}
