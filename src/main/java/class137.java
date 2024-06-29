import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class137 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lcf;")
    public class431 field2077 = new class431();

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2086 = new String[100];

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lhn;")
    public static class509 field2089 = new class509(23, -2);

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
    public static int[] field2093 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lcf;")
    private class431 field2081;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method993(int arg0) {
        if (arg0 <= 83) {
            return;
        }
        field2078++;
        while (true) {
            class431 var2 = this.field2077.field6384;
            if (this.field2077 == var2) {
                this.field2081 = null;
                return;
            }
            var2.method2677(-22491);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lcf;I)V")
    public final void method994(class431 arg0, int arg1) {
        field2080++;
        if (arg0.field6389 != null) {
            arg0.method2677(-22491);
        }
        arg0.field6384 = this.field2077;
        arg0.field6389 = this.field2077.field6389;
        arg0.field6389.field6384 = arg0;
        arg0.field6384.field6389 = arg0;
        if (arg1 != -3610) {
            field2086 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLoe;)V")
    public final void method995(byte arg0, class137 arg1) {
        this.method999(arg1, (byte) -84, this.field2077.field6384);
        field2090++;
        if (arg0 != 92) {
            this.method995((byte) -17, null);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lcf;")
    public final class431 method996(int arg0) {
        field2085++;
        class431 var2 = this.field2081;
        if (arg0 != 1) {
            this.method1001(-91);
        }
        if (this.field2077 == var2) {
            this.field2081 = null;
            return null;
        } else {
            this.field2081 = var2.field6384;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class137() {
        this.field2077.field6389 = this.field2077;
        this.field2077.field6384 = this.field2077;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method997(boolean arg0) {
        if (!arg0) {
            method997(false);
        }
        field2086 = null;
        field2089 = null;
        field2093 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lcf;I)V")
    public final void method998(class431 arg0, int arg1) {
        field2079++;
        if (arg0.field6389 != null) {
            arg0.method2677(-22491);
        }
        arg0.field6389 = this.field2077;
        arg0.field6384 = this.field2077.field6384;
        arg0.field6389.field6384 = arg0;
        if (arg1 == 100) {
            arg0.field6384.field6389 = arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Loe;BLcf;)V")
    private final void method999(class137 arg0, byte arg1, class431 arg2) {
        field2082++;
        class431 var4 = this.field2077.field6389;
        this.field2077.field6389 = arg2.field6389;
        arg2.field6389.field6384 = this.field2077;
        if (this.field2077 != arg2) {
            arg2.field6389 = arg0.field2077.field6389;
            arg2.field6389.field6384 = arg2;
            arg0.field2077.field6389 = var4;
            var4.field6384 = arg0.field2077;
        }
        if (arg1 > -76) {
            field2093 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I")
    public final int method1000(byte arg0) {
        if (arg0 <= 110) {
            this.method998(null, -49);
        }
        field2092++;
        int var2 = 0;
        for (class431 var3 = this.field2077.field6384; var3 != this.field2077; var3 = var3.field6384) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lcf;")
    public final class431 method1001(int arg0) {
        if (arg0 != -16153) {
            this.method1002((byte) -65);
        }
        field2083++;
        class431 var2 = this.field2077.field6384;
        if (this.field2077 == var2) {
            return null;
        } else {
            var2.method2677(-22491);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Lcf;")
    public final class431 method1002(byte arg0) {
        if (arg0 != 36) {
            this.field2077 = null;
        }
        field2088++;
        class431 var2 = this.field2077.field6389;
        if (this.field2077 == var2) {
            this.field2081 = null;
            return null;
        } else {
            this.field2081 = var2.field6389;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)Lcf;")
    public final class431 method1003(boolean arg0) {
        field2087++;
        if (arg0) {
            return null;
        }
        class431 var2 = this.field2081;
        if (this.field2077 == var2) {
            this.field2081 = null;
            return null;
        } else {
            this.field2081 = var2.field6389;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)Lcf;")
    public final class431 method1004(byte arg0) {
        if (arg0 > -51) {
            field2089 = null;
        }
        field2084++;
        class431 var2 = this.field2077.field6384;
        if (this.field2077 == var2) {
            this.field2081 = null;
            return null;
        } else {
            this.field2081 = var2.field6384;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)Z")
    public final boolean method1005(byte arg0) {
        int var2 = 82 / ((-arg0 - 16) / 40);
        field2091++;
        return this.field2077.field6384 == this.field2077;
    }
}
