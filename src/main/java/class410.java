import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class410 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljo;")
    private class303 field5441;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lut;")
    private class111 field5446;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Ltl;")
    public static class565 field5444;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 7)
    public static void method2221(byte arg0) {
        if (arg0 > 106) {
            field5444 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([BZ)Z", line = 18)
    public static final boolean method2222(byte[] arg0, boolean arg1) {
        field5445++;
        class452 var2 = new class452(arg0);
        if (!arg1) {
            field5444 = null;
        }
        int var3 = var2.method2541(58);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2541(110) == 1;
        if (var4) {
            class303.method1738(0, var2);
        }
        method2225((byte) 66, var2);
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V", line = 44)
    public static final void method2223(int arg0, int arg1) {
        field5440++;
        if (arg0 >= -123) {
            field5444 = null;
        }
        class530 var2 = class242.method1402(-110, 4, arg1);
        var2.method3027((byte) -77);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)Lut;", line = 58)
    private final class111 method2224(boolean arg0) {
        if (!arg0) {
            method2223(15, 78);
        }
        if (this.field5446 == null) {
            this.field5446 = new class111();
        }
        field5447++;
        return this.field5446;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLiaa;)V", line = 74)
    private static final void method2225(byte arg0, class452 arg1) {
        int var2 = -53 / ((-arg0 - 53) / 63);
        for (int var3 = 0; var3 < class212.field2565; var3++) {
            int var4 = arg1.method2548(-29696);
            int var5 = arg1.method2574(-1758460248);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class13.field120[var4] != null) {
                class13.field120[var4].field7627 = var5;
            }
        }
        field5442++;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljo;)V", line = 101)
    public class410(class303 arg0) {
        this.field5441 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lmc;I)Lwu;", line = 110)
    public final class338 method2226(class121 arg0, int arg1) {
        field5443++;
        if (arg0 == null) {
            return null;
        }
        class406 var3 = arg0.method484(16236);
        if (class288.field3700 == var3) {
            return new class203((class684) arg0);
        } else if (class469.field6548 == var3) {
            return new class419(this.method2224(true), (class101) arg0);
        } else if (class577.field8238 == var3) {
            return new class126(this.field5441, (class120) arg0);
        } else if (class186.field2266 == var3) {
            return new class224(this.field5441, (class677) arg0);
        } else if (class212.field2567 == var3) {
            return new class50((class326) arg0);
        } else if (class516.field7386 == var3) {
            return new class358(this.field5441, (class77) arg0);
        } else if (class628.field8907 == var3) {
            return new class27(this.field5441, (class408) arg0);
        } else {
            if (arg1 != 2) {
                method2223(26, -26);
            }
            if (class595.field8451 == var3) {
                return new class425((class541) arg0);
            } else if (class383.field5128 == var3) {
                return new class514(this.field5441, (class602) arg0);
            } else {
                return null;
            }
        }
    }
}
