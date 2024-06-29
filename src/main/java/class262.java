import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class262 {

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lh;")
    public class249 field4593 = new class249();

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Loa;")
    public static class262 field4592 = new class262();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lh;")
    private class249 field4599;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method1809(byte arg0) {
        if (arg0 >= -81) {
            method1818((byte) -126, 65);
        }
        field4592 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Lh;")
    public final class249 method1810(boolean arg0) {
        field4591++;
        class249 var2 = this.field4599;
        if (this.field4593 == var2) {
            this.field4599 = null;
            return null;
        } else {
            this.field4599 = var2.field4307;
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lh;")
    public final class249 method1811(int arg0) {
        field4588++;
        if (arg0 != 2) {
            return null;
        }
        class249 var2 = this.field4593.field4307;
        if (this.field4593 == var2) {
            this.field4599 = null;
            return null;
        } else {
            this.field4599 = var2.field4307;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)I")
    public static final int method1812(boolean arg0) {
        field4594++;
        if (class201.field3485) {
            return 0;
        }
        if (!arg0) {
            method1809((byte) 65);
        }
        if (class106.method786(94)) {
            return class248.field4292 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)Lh;")
    public final class249 method1813(boolean arg0) {
        if (!arg0) {
            method1809((byte) -4);
        }
        class249 var2 = this.field4599;
        field4587++;
        if (this.field4593 == var2) {
            this.field4599 = null;
            return null;
        } else {
            this.field4599 = var2.field4302;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILh;)V")
    public final void method1814(int arg0, class249 arg1) {
        field4595++;
        if (arg1.field4302 != null) {
            arg1.method1743((byte) 31);
        }
        if (arg0 == 1) {
            arg1.field4302 = this.field4593.field4302;
            arg1.field4307 = this.field4593;
            arg1.field4302.field4307 = arg1;
            arg1.field4307.field4302 = arg1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lh;")
    public final class249 method1815(int arg0) {
        class249 var2 = this.field4593.field4307;
        if (arg0 != 9) {
            return null;
        }
        field4597++;
        if (this.field4593 == var2) {
            return null;
        } else {
            var2.method1743((byte) 92);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)Lh;")
    public final class249 method1816(byte arg0) {
        class249 var2 = this.field4593.field4302;
        field4586++;
        if (this.field4593 == var2) {
            this.field4599 = null;
            return null;
        }
        this.field4599 = var2.field4302;
        if (arg0 < 90) {
            this.field4599 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method1817(int arg0) {
        field4589++;
        if (arg0 != 1) {
            this.method1813(false);
        }
        while (true) {
            class249 var2 = this.field4593.field4307;
            if (this.field4593 == var2) {
                this.field4599 = null;
                return;
            }
            var2.method1743((byte) 24);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V")
    public static final void method1818(byte arg0, int arg1) {
        field4590++;
        class43 var2 = class270.method1847(arg1, -10277, 9);
        var2.method339(true);
        if (arg0 != 13) {
            method1818((byte) -22, 120);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(ILh;)V")
    public final void method1819(int arg0, class249 arg1) {
        if (arg1.field4302 != null) {
            arg1.method1743((byte) 68);
        }
        field4596++;
        arg1.field4307 = this.field4593.field4307;
        arg1.field4302 = this.field4593;
        arg1.field4302.field4307 = arg1;
        arg1.field4307.field4302 = arg1;
        if (arg0 != -9166) {
            this.field4599 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class262() {
        this.field4593.field4302 = this.field4593;
        this.field4593.field4307 = this.field4593;
    }
}
