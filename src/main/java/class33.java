import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class33 {

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Ldh;")
    public class30 field645 = new class30();

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field644 = 0;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field636 = Calendar.getInstance();

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Lia;")
    public static class257 field651 = class28.method234(-74, "hint_mapedge");

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "[I")
    public static int[] field648 = new int[2];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lvb;")
    public static class226 field635;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Ldh;")
    private class30 field653;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "[I")
    public static int[] field637;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method276(byte arg0) {
        field646++;
        if (arg0 == 70) {
            class39.field783.method833(0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Ldh;")
    public final class30 method277(int arg0) {
        class30 var2 = this.field653;
        field649++;
        if (this.field645 == var2) {
            this.field653 = null;
            return null;
        } else {
            this.field653 = var2.field577;
            return arg0 == 1 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)I")
    public final int method278(byte arg0) {
        field634++;
        int var2 = 0;
        int var3 = 22 / ((-arg0 - 60) / 57);
        class30 var4 = this.field645.field577;
        while (this.field645 != var4) {
            var4 = var4.field577;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Ldh;")
    public final class30 method279(int arg0) {
        if (arg0 != -22101) {
            return null;
        }
        field647++;
        class30 var2 = this.field653;
        if (this.field645 == var2) {
            this.field653 = null;
            return null;
        } else {
            this.field653 = var2.field568;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Ldh;")
    public final class30 method280(byte arg0) {
        field639++;
        class30 var2 = this.field645.field568;
        if (this.field645 == var2) {
            this.field653 = null;
            return null;
        }
        this.field653 = var2.field568;
        if (arg0 > -41) {
            this.method282(-44);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
    public static void method281(byte arg0) {
        if (arg0 <= 79) {
            field650 = -47;
        }
        field648 = null;
        field651 = null;
        field635 = null;
        field637 = null;
        field636 = null;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public final void method282(int arg0) {
        field641++;
        while (true) {
            class30 var2 = this.field645.field577;
            if (this.field645 == var2) {
                if (arg0 >= -111) {
                    return;
                } else {
                    this.field653 = null;
                    return;
                }
            }
            var2.method254(1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)V")
    public static final void method283(int arg0, long arg1) {
        if (arg0 > -10) {
            return;
        }
        field652++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class39.method317(126, arg1 - 1L);
            class39.method317(126, 1L);
        } else {
            class39.method317(-42, arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ldh;I)V")
    public final void method284(class30 arg0, int arg1) {
        if (arg0.field568 != null) {
            arg0.method254(1);
        }
        arg0.field568 = this.field645;
        field638++;
        arg0.field577 = this.field645.field577;
        arg0.field568.field577 = arg0;
        if (arg1 != 27886) {
            this.method285(23);
        }
        arg0.field577.field568 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Ldh;")
    public final class30 method285(int arg0) {
        field633++;
        if (arg0 != 0) {
            field651 = null;
        }
        class30 var2 = this.field645.field577;
        if (this.field645 == var2) {
            return null;
        } else {
            var2.method254(arg0 + 1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ldh;ZLdh;)V")
    public final void method286(class30 arg0, boolean arg1, class30 arg2) {
        if (arg2.field568 != null) {
            arg2.method254(1);
        }
        if (!arg1) {
            field637 = null;
        }
        arg2.field568 = arg0.field568;
        arg2.field577 = arg0;
        field643++;
        arg2.field568.field577 = arg2;
        arg2.field577.field568 = arg2;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Ldh;I)V")
    public final void method287(class30 arg0, int arg1) {
        if (arg1 != 0) {
            field636 = null;
        }
        if (arg0.field568 != null) {
            arg0.method254(1);
        }
        field640++;
        arg0.field577 = this.field645;
        arg0.field568 = this.field645.field568;
        arg0.field568.field577 = arg0;
        arg0.field577.field568 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Ldh;")
    public final class30 method288(int arg0) {
        field642++;
        class30 var2 = this.field645.field577;
        if (this.field645 == var2) {
            this.field653 = null;
            return null;
        } else {
            this.field653 = var2.field577;
            return arg0 == 26111 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class33() {
        this.field645.field568 = this.field645;
        this.field645.field577 = this.field645;
    }
}
