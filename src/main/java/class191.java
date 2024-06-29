import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class191 {

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lvg;")
    private class8 field3122 = new class8();

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Z")
    public static boolean field3121 = true;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "[Z")
    public static boolean[] field3130 = new boolean[200];

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field3131 = 100;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lik;")
    public static class17 field3117 = new class17();

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Lli;")
    public static class22 field3127;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lqm;")
    public static class334 field3129;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Lvg;")
    private class8 field3125;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lvg;B)V", line = 10)
    public final void method1412(class8 arg0, byte arg1) {
        field3124++;
        if (arg0.field115 != null) {
            arg0.method42((byte) -68);
        }
        arg0.field114 = this.field3122;
        arg0.field115 = this.field3122.field115;
        arg0.field115.field114 = arg0;
        arg0.field114.field115 = arg0;
        if (arg1 != -2) {
            field3131 = 68;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Lvg;", line = 28)
    public final class8 method1413(int arg0) {
        class8 var2 = this.field3122.field114;
        field3116++;
        if (this.field3122 == var2) {
            return null;
        } else if (arg0 == 0) {
            var2.method42((byte) -79);
            return var2;
        } else {
            return (class8) null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V", line = 50)
    public static void method1414(int arg0) {
        if (arg0 > 25) {
            field3129 = null;
            field3117 = null;
            field3130 = null;
            field3127 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILak;)V", line = 64)
    public static final void method1415(int arg0, class172 arg1) {
        field3126++;
        if (arg0 != 0) {
            method1414(65);
        }
        class8.field112 = arg1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Lvg;", line = 76)
    public final class8 method1416(byte arg0) {
        field3118++;
        class8 var2 = this.field3125;
        if (this.field3122 == var2) {
            this.field3125 = null;
            return null;
        } else {
            this.field3125 = var2.field114;
            int var3 = 90 % ((-arg0 - 76) / 42);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 178)
    public class191() {
        this.field3122.field114 = this.field3122;
        this.field3122.field115 = this.field3122;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I", line = 108)
    public final int method1417(int arg0) {
        field3119++;
        class8 var2 = this.field3122.field114;
        if (arg0 != 100) {
            field3127 = (class22) null;
        }
        int var3 = 0;
        while (this.field3122 != var2) {
            var2 = var2.field114;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V", line = 136)
    public final void method1418(int arg0) {
        while (true) {
            class8 var2 = this.field3122.field114;
            if (this.field3122 == var2) {
                if (arg0 != 0) {
                    field3129 = (class334) null;
                }
                field3128++;
                this.field3125 = null;
                return;
            }
            var2.method42((byte) -91);
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)Lvg;", line = 160)
    public final class8 method1419(int arg0) {
        field3120++;
        class8 var2 = this.field3122.field114;
        if (arg0 != 200) {
            return (class8) null;
        } else if (this.field3122 == var2) {
            this.field3125 = null;
            return null;
        } else {
            this.field3125 = var2.field114;
            return var2;
        }
    }
}
