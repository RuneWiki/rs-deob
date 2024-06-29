import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class728 extends class418 {

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lnt;")
    private class220 field10166 = new class220();

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lnt;")
    private class220 field10167 = new class220();

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    private int field10168 = -1;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    private int field10169 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()I", line = 3)
    public final int method1673() {
        return 0;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()Lep;", line = 6)
    public final class418 method1693() {
        return (class418) this.field10166.method1527((byte) 79);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "([III)V", line = 14)
    private final void method4047(int[] arg0, int arg1, int arg2) {
        for (class418 var4 = (class418) this.field10166.method1522(true); var4 != null; var4 = (class418) this.field10166.method1527((byte) 96)) {
            var4.method2549(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()V", line = 23)
    private final void method4048() {
        if (this.field10169 <= 0) {
            return;
        }
        for (class383 var1 = (class383) this.field10167.method1522(true); var1 != null; var1 = (class383) this.field10167.method1527((byte) 66)) {
            var1.field5364 -= this.field10169;
        }
        this.field10168 -= this.field10169;
        this.field10169 = 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lbp;)V", line = 45)
    private final void method4049(class383 arg0) {
        arg0.method3617(1);
        arg0.method2406();
        class626 var2 = this.field10167.field3131.field8990;
        if (this.field10167.field3131 == var2) {
            this.field10168 = -1;
        } else {
            this.field10168 = ((class383) var2).field5364;
        }
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "()I", line = 59)
    public final synchronized int method4050() {
        return this.field10166.method1531(0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lep;)V", line = 65)
    public final synchronized void method4051(class418 arg0) {
        arg0.method3617(1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ltq;Lbp;)V", line = 70)
    private final void method4052(class626 arg0, class383 arg1) {
        while (this.field10167.field3131 != arg0 && ((class383) arg0).field5364 <= arg1.field5364) {
            arg0 = arg0.field8990;
        }
        class319.method2054(arg1, 123, arg0);
        this.field10168 = ((class383) this.field10167.field3131.field8990).field5364;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([III)V", line = 81)
    public final synchronized void method1687(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field10168 < 0) {
                this.method4047(arg0, arg1, arg2);
                return;
            }
            if (this.field10169 + arg2 < this.field10168) {
                this.field10169 += arg2;
                this.method4047(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field10168 - this.field10169;
            this.method4047(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field10169 += var4;
            this.method4048();
            class383 var5 = (class383) this.field10167.method1522(true);
            synchronized (var5) {
                int var7 = var5.method2405(this);
                if (var7 < 0) {
                    var5.field5364 = 0;
                    this.method4049(var5);
                } else {
                    var5.field5364 = var7;
                    this.method4052(var5.field8990, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lep;)V", line = 127)
    public final synchronized void method4053(class418 arg0) {
        this.field10166.method1524(43, arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()Lep;", line = 130)
    public final class418 method1696() {
        return (class418) this.field10166.method1522(true);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 135)
    private final void method4054(int arg0) {
        for (class418 var2 = (class418) this.field10166.method1522(true); var2 != null; var2 = (class418) this.field10166.method1527((byte) 50)) {
            var2.method1663(arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 148)
    public final synchronized void method1663(int arg0) {
        do {
            if (this.field10168 < 0) {
                this.method4054(arg0);
                return;
            }
            if (this.field10169 + arg0 < this.field10168) {
                this.field10169 += arg0;
                this.method4054(arg0);
                return;
            }
            int var2 = this.field10168 - this.field10169;
            this.method4054(var2);
            arg0 -= var2;
            this.field10169 += var2;
            this.method4048();
            class383 var3 = (class383) this.field10167.method1522(true);
            synchronized (var3) {
                int var5 = var3.method2405(this);
                if (var5 < 0) {
                    var3.field5364 = 0;
                    this.method4049(var3);
                } else {
                    var3.field5364 = var5;
                    this.method4052(var3.field8990, var3);
                }
            }
        } while (arg0 != 0);
    }
}
