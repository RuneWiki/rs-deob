import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ETMNPRAF")
public class class11 {

    @OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "Z")
    private boolean field615 = true;

    @OriginalMember(owner = "client!ETMNPRAF", name = "b", descriptor = "Z")
    private boolean field616 = true;

    @OriginalMember(owner = "client!ETMNPRAF", name = "c", descriptor = "I")
    private int field617 = -309;

    @OriginalMember(owner = "client!ETMNPRAF", name = "d", descriptor = "I")
    private int field618 = -43582;

    @OriginalMember(owner = "client!ETMNPRAF", name = "e", descriptor = "LLXNKZOGX;")
    public class31 field619 = new class31();

    @OriginalMember(owner = "client!ETMNPRAF", name = "f", descriptor = "LLXNKZOGX;")
    private class31 field620;

    @OriginalMember(owner = "client!ETMNPRAF", name = "<init>", descriptor = "(I)V")
    public class11(int arg0) {
        this.field619.field982 = this.field619;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field619.field983 = this.field619;
    }

    @OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(LLXNKZOGX;)V")
    public void method178(class31 arg0) {
        if (arg0.field983 != null) {
            arg0.method331();
        }
        arg0.field983 = this.field619.field983;
        arg0.field982 = this.field619;
        arg0.field983.field982 = arg0;
        arg0.field982.field983 = arg0;
    }

    @OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(LLXNKZOGX;I)V")
    public void method179(class31 arg0, int arg1) {
        if (arg0.field983 != null) {
            arg0.method331();
        }
        arg0.field983 = this.field619;
        arg0.field982 = this.field619.field982;
        arg0.field983.field982 = arg0;
        if (arg1 != -6203) {
            this.field618 = 268;
        }
        arg0.field982.field983 = arg0;
        if (class31.field984) {
        }
    }

    @OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "()LLXNKZOGX;")
    public class31 method180() {
        class31 var1 = this.field619.field982;
        if (this.field619 == var1) {
            return null;
        } else {
            var1.method331();
            return var1;
        }
    }

    @OriginalMember(owner = "client!ETMNPRAF", name = "b", descriptor = "()LLXNKZOGX;")
    public class31 method181() {
        class31 var1 = this.field619.field982;
        if (this.field619 == var1) {
            this.field620 = null;
            return null;
        } else {
            this.field620 = var1.field982;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(I)LLXNKZOGX;")
    public class31 method182(int arg0) {
        class31 var2 = this.field619.field983;
        if (this.field619 == var2) {
            this.field620 = null;
            return null;
        }
        this.field620 = var2.field983;
        if (arg0 != 0) {
            this.field615 = !this.field615;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(B)LLXNKZOGX;")
    public class31 method183(byte arg0) {
        class31 var2 = this.field620;
        if (arg0 != 6) {
            this.field616 = !this.field616;
        }
        if (this.field619 == var2) {
            this.field620 = null;
            return null;
        } else {
            this.field620 = var2.field982;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ETMNPRAF", name = "a", descriptor = "(Z)LLXNKZOGX;")
    public class31 method184(boolean arg0) {
        class31 var2 = this.field620;
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field619 == var2) {
            this.field620 = null;
            return null;
        } else {
            this.field620 = var2.field983;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ETMNPRAF", name = "c", descriptor = "()V")
    public void method185() {
        if (this.field619.field982 == this.field619) {
            return;
        }
        while (true) {
            class31 var1 = this.field619.field982;
            if (this.field619 == var1) {
                return;
            }
            var1.method331();
        }
    }
}
