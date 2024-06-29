import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EZXKBAZY")
public class class17 {

    @OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "I")
    private int field728 = 270;

    @OriginalMember(owner = "client!EZXKBAZY", name = "b", descriptor = "Z")
    private boolean field729 = true;

    @OriginalMember(owner = "client!EZXKBAZY", name = "c", descriptor = "LBRISMNPP;")
    public class8 field730 = new class8();

    @OriginalMember(owner = "client!EZXKBAZY", name = "d", descriptor = "LBRISMNPP;")
    private class8 field731;

    @OriginalMember(owner = "client!EZXKBAZY", name = "<init>", descriptor = "(Z)V")
    public class17(boolean arg0) {
        this.field730.field111 = this.field730;
        this.field730.field112 = this.field730;
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "(LBRISMNPP;)V")
    public void method203(class8 arg0) {
        if (arg0.field112 != null) {
            arg0.method20();
        }
        arg0.field112 = this.field730.field112;
        arg0.field111 = this.field730;
        arg0.field112.field111 = arg0;
        arg0.field111.field112 = arg0;
    }

    @OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "(ILBRISMNPP;)V")
    public void method204(int arg0, class8 arg1) {
        if (arg1.field112 != null) {
            arg1.method20();
        }
        arg1.field112 = this.field730;
        arg1.field111 = this.field730.field111;
        arg1.field112.field111 = arg1;
        if (arg0 != 6) {
            this.field728 = 318;
        }
        arg1.field111.field112 = arg1;
        if (class8.field113) {
        }
    }

    @OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "()LBRISMNPP;")
    public class8 method205() {
        class8 var1 = this.field730.field111;
        if (this.field730 == var1) {
            return null;
        } else {
            var1.method20();
            return var1;
        }
    }

    @OriginalMember(owner = "client!EZXKBAZY", name = "b", descriptor = "()LBRISMNPP;")
    public class8 method206() {
        class8 var1 = this.field730.field111;
        if (this.field730 == var1) {
            this.field731 = null;
            return null;
        } else {
            this.field731 = var1.field111;
            return var1;
        }
    }

    @OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "(Z)LBRISMNPP;")
    public class8 method207(boolean arg0) {
        if (arg0) {
            this.field729 = !this.field729;
        }
        class8 var2 = this.field730.field112;
        if (this.field730 == var2) {
            this.field731 = null;
            return null;
        } else {
            this.field731 = var2.field112;
            return var2;
        }
    }

    @OriginalMember(owner = "client!EZXKBAZY", name = "a", descriptor = "(I)LBRISMNPP;")
    public class8 method208(int arg0) {
        class8 var2 = this.field731;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field730 == var2) {
            this.field731 = null;
            return null;
        } else {
            this.field731 = var2.field111;
            return var2;
        }
    }

    @OriginalMember(owner = "client!EZXKBAZY", name = "b", descriptor = "(Z)LBRISMNPP;")
    public class8 method209(boolean arg0) {
        class8 var2 = this.field731;
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field730 == var2) {
            this.field731 = null;
            return null;
        } else {
            this.field731 = var2.field112;
            return var2;
        }
    }

    @OriginalMember(owner = "client!EZXKBAZY", name = "c", descriptor = "()V")
    public void method210() {
        if (this.field730.field111 == this.field730) {
            return;
        }
        while (true) {
            class8 var1 = this.field730.field111;
            if (this.field730 == var1) {
                return;
            }
            var1.method20();
        }
    }
}
