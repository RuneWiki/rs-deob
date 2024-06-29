import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class59 {

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Lke;")
    private class443 field839 = new class443();

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lke;")
    private class443 field842;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)Lke;", line = 4)
    public final class443 method472(boolean arg0) {
        field840++;
        class443 var2 = this.field839.field6478;
        if (this.field839 == var2) {
            return null;
        } else {
            var2.method2619(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLco;)Lbd;", line = 20)
    public static final class180 method473(boolean arg0, class268 arg1) {
        if (arg0) {
            return null;
        }
        field834++;
        class180 var2 = new class180();
        var2.field2617 = arg1.method1745(32132);
        var2.field2616 = class377.field5545.method2475(-11743, var2.field2617);
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lvk;I)V", line = 42)
    public static final void method474(class413 arg0, int arg1) {
        class321.field4653 = arg0;
        if (arg1 == -4) {
            field837++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Lke;", line = 60)
    public final class443 method475(int arg0) {
        field833++;
        int var2 = -104 / ((-arg0 - 12) / 40);
        class443 var3 = this.field839.field6478;
        if (this.field839 == var3) {
            this.field842 = null;
            return null;
        } else {
            this.field842 = var3.field6478;
            return var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I", line = 81)
    public final int method476(int arg0) {
        field836++;
        int var2 = arg0;
        for (class443 var3 = this.field839.field6478; var3 != this.field839; var3 = var3.field6478) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lke;Z)V", line = 100)
    public final void method477(class443 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field841++;
        if (arg0.field6470 != null) {
            arg0.method2619(true);
        }
        arg0.field6470 = this.field839.field6470;
        arg0.field6478 = this.field839;
        arg0.field6470.field6478 = arg0;
        arg0.field6478.field6470 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 184)
    public class59() {
        this.field839.field6470 = this.field839;
        this.field839.field6478 = this.field839;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 129)
    public final void method478(int arg0) {
        field835++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class443 var2 = this.field839.field6478;
            if (this.field839 == var2) {
                this.field842 = null;
                return;
            }
            var2.method2619(true);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z", line = 153)
    public static final boolean method479(int arg0, int arg1) {
        if (arg1 != -4) {
            method479(80, 33);
        }
        field832++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Lke;", line = 164)
    public final class443 method480(int arg0) {
        field838++;
        if (arg0 >= -12) {
            return null;
        }
        class443 var2 = this.field842;
        if (this.field839 == var2) {
            this.field842 = null;
            return null;
        } else {
            this.field842 = var2.field6478;
            return var2;
        }
    }
}
