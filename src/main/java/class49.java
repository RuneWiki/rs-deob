import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class49 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lmu;")
    private class198 field554 = new class198();

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lho;")
    public static class103 field550 = new class103(34, -1);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lmu;")
    private class198 field561;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lfo;")
    public static class361 field558;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lmu;")
    public final class198 method282(int arg0) {
        field549++;
        class198 var2 = this.field554.field2552;
        if (this.field554 == var2) {
            this.field561 = null;
            return null;
        } else if (arg0 == 34) {
            this.field561 = var2.field2552;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public final void method283(int arg0) {
        while (true) {
            class198 var2 = this.field554.field2553;
            if (this.field554 == var2) {
                if (arg0 != 28837) {
                    field550 = null;
                }
                field548++;
                this.field561 = null;
                return;
            }
            var2.method1239(73);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lmu;")
    public final class198 method284(int arg0) {
        field553++;
        class198 var2 = this.field561;
        if (this.field554 == var2) {
            this.field561 = null;
            return null;
        }
        if (arg0 != 10748) {
            this.method290(-5);
        }
        this.field561 = var2.field2553;
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Lmu;")
    public final class198 method285(int arg0) {
        if (arg0 != 34) {
            this.method284(-119);
        }
        field555++;
        class198 var2 = this.field554.field2553;
        if (this.field554 == var2) {
            return null;
        } else {
            var2.method1239(71);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLmu;)V")
    public final void method286(byte arg0, class198 arg1) {
        field552++;
        int var3 = -128 % ((84 - arg0) / 37);
        if (arg1.field2552 != null) {
            arg1.method1239(93);
        }
        arg1.field2552 = this.field554.field2552;
        arg1.field2553 = this.field554;
        arg1.field2552.field2553 = arg1;
        arg1.field2553.field2552 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method287(boolean arg0) {
        field558 = null;
        field550 = null;
        if (arg0) {
            method287(true);
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Z")
    public final boolean method288(int arg0) {
        if (arg0 < 22) {
            this.method286((byte) -26, null);
        }
        field551++;
        return this.field554.field2553 == this.field554;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)I")
    public final int method289(boolean arg0) {
        field559++;
        int var2 = 0;
        class198 var3 = this.field554.field2553;
        if (!arg0) {
            field556 = 49;
        }
        while (this.field554 != var3) {
            var2++;
            var3 = var3.field2553;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)Lmu;")
    public final class198 method290(int arg0) {
        if (arg0 != -1) {
            this.method290(-62);
        }
        field557++;
        class198 var2 = this.field554.field2553;
        if (this.field554 == var2) {
            this.field561 = null;
            return null;
        } else {
            this.field561 = var2.field2553;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class49() {
        this.field554.field2553 = this.field554;
        this.field554.field2552 = this.field554;
    }
}
