import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class158 {

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lvd;")
    public class213 field3056 = new class213();

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[Lah;")
    public static class9[] field3051 = new class9[100];

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lob;")
    private static class141 field3044 = class175.method1195(40, " from your ignore list first)3");

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lob;")
    public static class141 field3047 = field3044;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lpe;")
    public static class154 field3046;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lvd;")
    private class213 field3063;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lca;")
    public static class22 field3058;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Lvd;")
    public final class213 method1097(int arg0) {
        field3057++;
        class213 var2 = this.field3056.field4072;
        if (arg0 != -12462) {
            this.method1101(false, null, null);
        }
        if (this.field3056 == var2) {
            return null;
        } else {
            var2.method1392(128);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILvd;)V")
    public final void method1098(int arg0, class213 arg1) {
        field3048++;
        if (arg1.field4070 != null) {
            arg1.method1392(128);
        }
        arg1.field4072 = this.field3056;
        arg1.field4070 = this.field3056.field4070;
        arg1.field4070.field4072 = arg1;
        if (arg0 != 0) {
            this.method1101(true, null, null);
        }
        arg1.field4072.field4070 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public static void method1099(int arg0) {
        if (arg0 != 100) {
            return;
        }
        field3047 = null;
        field3051 = null;
        field3058 = null;
        field3046 = null;
        field3044 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lvd;Z)V")
    public final void method1100(class213 arg0, boolean arg1) {
        field3052++;
        if (arg0.field4070 != null) {
            arg0.method1392(128);
        }
        arg0.field4072 = this.field3056.field4072;
        arg0.field4070 = this.field3056;
        if (!arg1) {
            this.method1100(null, false);
        }
        arg0.field4070.field4072 = arg0;
        arg0.field4072.field4070 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLvd;Lvd;)V")
    public final void method1101(boolean arg0, class213 arg1, class213 arg2) {
        if (arg2.field4070 != null) {
            arg2.method1392(128);
        }
        arg2.field4070 = arg1.field4070;
        if (!arg0) {
            field3049++;
            arg2.field4072 = arg1;
            arg2.field4070.field4072 = arg2;
            arg2.field4072.field4070 = arg2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public final void method1102(int arg0) {
        field3060++;
        int var2 = -21 / ((arg0 - 28) / 58);
        while (true) {
            class213 var3 = this.field3056.field4072;
            if (this.field3056 == var3) {
                return;
            }
            var3.method1392(128);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Lvd;")
    public final class213 method1103(byte arg0) {
        field3045++;
        if (arg0 != -9) {
            this.method1101(false, null, null);
        }
        class213 var2 = this.field3056.field4072;
        if (this.field3056 == var2) {
            this.field3063 = null;
            return null;
        } else {
            this.field3063 = var2.field4072;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Lvd;")
    public final class213 method1104(int arg0) {
        class213 var2 = this.field3056.field4070;
        int var3 = -39 / ((-arg0 - 18) / 41);
        field3055++;
        if (this.field3056 == var2) {
            this.field3063 = null;
            return null;
        } else {
            this.field3063 = var2.field4070;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)Lvd;")
    public final class213 method1105(int arg0) {
        field3050++;
        class213 var2 = this.field3063;
        if (this.field3056 == var2) {
            this.field3063 = null;
            return null;
        } else if (arg0 == -21824) {
            this.field3063 = var2.field4070;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)Lvd;")
    public final class213 method1106(byte arg0) {
        field3053++;
        class213 var2 = this.field3063;
        if (this.field3056 == var2) {
            this.field3063 = null;
            return null;
        } else {
            this.field3063 = var2.field4072;
            int var3 = -119 % ((40 - arg0) / 49);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class158() {
        this.field3056.field4070 = this.field3056;
        this.field3056.field4072 = this.field3056;
    }
}
