import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class46 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Ltl;")
    private class403 field627 = new class403();

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lh;")
    public static class434 field632 = new class434(94, 3);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ltl;")
    private class403 field630;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIILnk;)V")
    public static final void method330(boolean arg0, int arg1, int arg2, class464 arg3) {
        field625++;
        if (class385.field5314 != null || class385.field5334 || !arg0 || arg3 == null || class78.method517(arg3, (byte) 79) == null) {
            return;
        }
        class385.field5314 = arg3;
        class65.field858 = class78.method517(arg3, (byte) 79);
        class450.field6115 = 0;
        class252.field3365 = false;
        class291.field3910 = arg2;
        class200.field2714 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Ltl;")
    public final class403 method331(byte arg0) {
        field629++;
        class403 var2 = this.field630;
        if (arg0 <= 86) {
            return null;
        } else if (this.field627 == var2) {
            this.field630 = null;
            return null;
        } else {
            this.field630 = var2.field5529;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Ltl;")
    public final class403 method332(int arg0) {
        field633++;
        if (arg0 != 17948) {
            this.method333(-69);
        }
        class403 var2 = this.field627.field5529;
        if (this.field627 == var2) {
            this.field630 = null;
            return null;
        } else {
            this.field630 = var2.field5529;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
    public final int method333(int arg0) {
        field626++;
        int var2 = arg0;
        for (class403 var3 = this.field627.field5529; var3 != this.field627; var3 = var3.field5529) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Ltl;")
    public final class403 method334(int arg0) {
        field624++;
        class403 var2 = this.field627.field5529;
        if (this.field627 == var2) {
            return null;
        }
        if (arg0 != 27830) {
            this.field627 = null;
        }
        var2.method2441((byte) -88);
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static void method335(int arg0) {
        if (arg0 == 27336) {
            field632 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILtl;)V")
    public final void method336(int arg0, class403 arg1) {
        field631++;
        if (arg1.field5534 != null) {
            arg1.method2441((byte) -116);
        }
        arg1.field5534 = this.field627.field5534;
        arg1.field5529 = this.field627;
        arg1.field5534.field5529 = arg1;
        arg1.field5529.field5534 = arg1;
        int var3 = -72 / ((arg0 + 74) / 37);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public final void method337(byte arg0) {
        if (arg0 < 94) {
            return;
        }
        while (true) {
            class403 var2 = this.field627.field5529;
            if (this.field627 == var2) {
                field628++;
                this.field630 = null;
                return;
            }
            var2.method2441((byte) -80);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class46() {
        this.field627.field5534 = this.field627;
        this.field627.field5529 = this.field627;
    }
}
