import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class162 {

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Lvi;")
    public class311 field2296 = new class311();

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field2295 = 0;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
    public static int[] field2298 = new int[5];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "Lvi;")
    private class311 field2300;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Lvi;")
    public final class311 method1160(byte arg0) {
        field2294++;
        class311 var2 = this.field2296.field4223;
        if (this.field2296 == var2) {
            return null;
        } else {
            var2.method1884(false);
            int var3 = -20 % ((-arg0 - 13) / 36);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljm;I)V")
    public final void method1161(class162 arg0, int arg1) {
        if (arg1 != -30515) {
            this.method1160((byte) -93);
        }
        field2299++;
        this.method1164(this.field2296.field4223, false, arg0);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILvi;)V")
    public final void method1162(int arg0, class311 arg1) {
        field2292++;
        if (arg1.field4225 != null) {
            arg1.method1884(false);
        }
        arg1.field4223 = this.field2296;
        arg1.field4225 = this.field2296.field4225;
        if (arg0 <= 111) {
            this.method1162(-95, (class311) null);
        }
        arg1.field4225.field4223 = arg1;
        arg1.field4223.field4225 = arg1;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Lvi;")
    public final class311 method1163(byte arg0) {
        field2290++;
        if (arg0 != 33) {
            return null;
        }
        class311 var2 = this.field2296.field4225;
        if (this.field2296 == var2) {
            this.field2300 = null;
            return null;
        } else {
            this.field2300 = var2.field4225;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lvi;ZLjm;)V")
    private final void method1164(class311 arg0, boolean arg1, class162 arg2) {
        field2289++;
        class311 var4 = this.field2296.field4225;
        this.field2296.field4225 = arg0.field4225;
        arg0.field4225.field4223 = this.field2296;
        if (arg1) {
            this.field2300 = null;
        }
        if (this.field2296 != arg0) {
            arg0.field4225 = arg2.field2296.field4225;
            arg0.field4225.field4223 = arg0;
            var4.field4223 = arg2.field2296;
            arg2.field2296.field4225 = var4;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)Lvi;")
    public final class311 method1165(boolean arg0) {
        field2291++;
        class311 var2 = this.field2300;
        if (this.field2296 == var2) {
            this.field2300 = null;
            return null;
        }
        if (!arg0) {
            field2295 = -63;
        }
        this.field2300 = var2.field4223;
        return var2;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)V")
    public static void method1166(byte arg0) {
        field2298 = null;
        if (arg0 > -126) {
            field2295 = -104;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
    public final boolean method1167(int arg0) {
        if (arg0 >= -27) {
            field2295 = 115;
        }
        field2301++;
        return this.field2296.field4223 == this.field2296;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public final void method1168(int arg0) {
        while (true) {
            class311 var2 = this.field2296.field4223;
            if (this.field2296 == var2) {
                if (arg0 <= 121) {
                    this.method1171(26);
                }
                field2297++;
                this.field2300 = null;
                return;
            }
            var2.method1884(false);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lvi;Z)V")
    public final void method1169(class311 arg0, boolean arg1) {
        if (arg0.field4225 != null) {
            arg0.method1884(false);
        }
        field2286++;
        arg0.field4225 = this.field2296;
        if (!arg1) {
            arg0.field4223 = this.field2296.field4223;
            arg0.field4225.field4223 = arg0;
            arg0.field4223.field4225 = arg0;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)I")
    public final int method1170(boolean arg0) {
        field2285++;
        int var2 = 0;
        if (!arg0) {
            return 31;
        }
        class311 var3 = this.field2296.field4223;
        while (this.field2296 != var3) {
            var3 = var3.field4223;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Lvi;")
    public final class311 method1171(int arg0) {
        field2287++;
        class311 var2 = this.field2300;
        if (this.field2296 == var2) {
            this.field2300 = null;
            return null;
        } else {
            this.field2300 = var2.field4225;
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZBI)I")
    public static final int method1172(boolean arg0, byte arg1, int arg2) {
        field2288++;
        if (arg0) {
            return 0;
        }
        class57 var3 = class2.method5(arg0, arg2, true);
        if (var3 == null) {
            return class71.method562((byte) -128, arg2).field1134;
        }
        int var4 = 59 / ((arg1 - 53) / 55);
        int var5 = 0;
        for (int var6 = 0; var6 < var3.field741.length; var6++) {
            if (var3.field741[var6] == -1) {
                var5++;
            }
        }
        return var5 + (class71.method562((byte) -128, arg2).field1134 - var3.field741.length);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
    public class162() {
        this.field2296.field4225 = this.field2296;
        this.field2296.field4223 = this.field2296;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)Lvi;")
    public final class311 method1173(int arg0) {
        field2302++;
        class311 var2 = this.field2296.field4223;
        if (arg0 != 0) {
            this.field2300 = null;
        }
        if (this.field2296 == var2) {
            this.field2300 = null;
            return null;
        } else {
            this.field2300 = var2.field4223;
            return var2;
        }
    }
}
