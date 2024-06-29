import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class117 extends class105 {

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Lgk;")
    private class157 field1996 = new class157();

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lgk;")
    private class157 field1997 = new class157();

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    private int field1999 = -1;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    private int field1998 = 0;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lbg;)V")
    private final void method810(class234 arg0) {
        arg0.method401((byte) -118);
        arg0.method1574();
        class64 var2 = this.field1997.field2881.field1144;
        if (this.field1997.field2881 == var2) {
            this.field1999 = -1;
        } else {
            this.field1999 = ((class234) var2).field4111;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "()I")
    public final int method565() {
        return 0;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "([III)V")
    public final synchronized void method569(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1999 < 0) {
                this.method815(arg0, arg1, arg2);
                return;
            }
            if (this.field1998 + arg2 < this.field1999) {
                this.field1998 += arg2;
                this.method815(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1999 - this.field1998;
            this.method815(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1998 += var4;
            this.method816();
            class234 var5 = (class234) this.field1997.method1140(0);
            synchronized (var5) {
                int var7 = var5.method1573(this);
                if (var7 < 0) {
                    var5.field4111 = 0;
                    this.method810(var5);
                } else {
                    var5.field4111 = var7;
                    this.method811(var5.field1144, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljf;Lbg;)V")
    private final void method811(class64 arg0, class234 arg1) {
        while (this.field1997.field2881 != arg0 && ((class234) arg0).field4111 <= arg1.field4111) {
            arg0 = arg0.field1144;
        }
        class75.method540(arg1, arg0, 27578);
        this.field1999 = ((class234) this.field1997.field2881.field1144).field4111;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    private final void method812(int arg0) {
        for (class105 var2 = (class105) this.field1996.method1140(0); var2 != null; var2 = (class105) this.field1996.method1127(0)) {
            var2.method561(arg0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljj;)V")
    public final synchronized void method813(class105 arg0) {
        this.field1996.method1136(arg0, (byte) 52);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Ljj;)V")
    public final synchronized void method814(class105 arg0) {
        arg0.method401((byte) -118);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()Ljj;")
    public final class105 method556() {
        return (class105) this.field1996.method1140(0);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()Ljj;")
    public final class105 method573() {
        return (class105) this.field1996.method1127(0);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "([III)V")
    private final void method815(int[] arg0, int arg1, int arg2) {
        for (class105 var4 = (class105) this.field1996.method1140(0); var4 != null; var4 = (class105) this.field1996.method1127(0)) {
            var4.method740(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "()V")
    private final void method816() {
        if (this.field1998 <= 0) {
            return;
        }
        for (class234 var1 = (class234) this.field1997.method1140(0); var1 != null; var1 = (class234) this.field1997.method1127(0)) {
            var1.field4111 -= this.field1998;
        }
        this.field1999 -= this.field1998;
        this.field1998 = 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public final synchronized void method561(int arg0) {
        do {
            if (this.field1999 < 0) {
                this.method812(arg0);
                return;
            }
            if (this.field1998 + arg0 < this.field1999) {
                this.field1998 += arg0;
                this.method812(arg0);
                return;
            }
            int var2 = this.field1999 - this.field1998;
            this.method812(var2);
            arg0 -= var2;
            this.field1998 += var2;
            this.method816();
            class234 var3 = (class234) this.field1997.method1140(0);
            synchronized (var3) {
                int var5 = var3.method1573(this);
                if (var5 < 0) {
                    var3.field4111 = 0;
                    this.method810(var3);
                } else {
                    var3.field4111 = var5;
                    this.method811(var3.field1144, var3);
                }
            }
        } while (arg0 != 0);
    }
}
