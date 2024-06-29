import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class194 extends class37 {

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Lnb;")
    private class223 field3151 = new class223();

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Lnb;")
    private class223 field3152 = new class223();

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    private int field3154 = -1;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    private int field3153 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lvk;)V")
    public final synchronized void method1353(class37 arg0) {
        this.field3151.method1548(arg0, 0);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "([III)V")
    private final void method1354(int[] arg0, int arg1, int arg2) {
        for (class37 var4 = (class37) this.field3151.method1553(true); var4 != null; var4 = (class37) this.field3151.method1551(0)) {
            var4.method270(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()Lvk;")
    public final class37 method266() {
        return (class37) this.field3151.method1553(true);
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "()V")
    private final void method1355() {
        if (this.field3153 <= 0) {
            return;
        }
        for (class30 var1 = (class30) this.field3152.method1553(true); var1 != null; var1 = (class30) this.field3152.method1551(0)) {
            var1.field527 -= this.field3153;
        }
        this.field3154 -= this.field3153;
        this.field3153 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "()I")
    public final int method268() {
        return 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lbe;)V")
    private final void method1356(class30 arg0) {
        arg0.method952((byte) 88);
        arg0.method233();
        class137 var2 = this.field3152.field3510.field2216;
        if (this.field3152.field3510 == var2) {
            this.field3154 = -1;
        } else {
            this.field3154 = ((class30) var2).field527;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([III)V")
    public final synchronized void method265(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3154 < 0) {
                this.method1354(arg0, arg1, arg2);
                return;
            }
            if (this.field3153 + arg2 < this.field3154) {
                this.field3153 += arg2;
                this.method1354(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3154 - this.field3153;
            this.method1354(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3153 += var4;
            this.method1355();
            class30 var5 = (class30) this.field3152.method1553(true);
            synchronized (var5) {
                int var7 = var5.method234(this);
                if (var7 < 0) {
                    var5.field527 = 0;
                    this.method1356(var5);
                } else {
                    var5.field527 = var7;
                    this.method1358(var5.field2216, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lvk;)V")
    public final synchronized void method1357(class37 arg0) {
        arg0.method952((byte) 57);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lqi;Lbe;)V")
    private final void method1358(class137 arg0, class30 arg1) {
        while (this.field3152.field3510 != arg0 && ((class30) arg0).field527 <= arg1.field527) {
            arg0 = arg0.field2216;
        }
        class281.method1915(arg1, arg0, (byte) -42);
        this.field3154 = ((class30) this.field3152.field3510.field2216).field527;
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
    private final void method1359(int arg0) {
        for (class37 var2 = (class37) this.field3151.method1553(true); var2 != null; var2 = (class37) this.field3151.method1551(0)) {
            var2.method267(arg0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "()Lvk;")
    public final class37 method269() {
        return (class37) this.field3151.method1551(0);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public final synchronized void method267(int arg0) {
        do {
            if (this.field3154 < 0) {
                this.method1359(arg0);
                return;
            }
            if (this.field3153 + arg0 < this.field3154) {
                this.field3153 += arg0;
                this.method1359(arg0);
                return;
            }
            int var2 = this.field3154 - this.field3153;
            this.method1359(var2);
            arg0 -= var2;
            this.field3153 += var2;
            this.method1355();
            class30 var3 = (class30) this.field3152.method1553(true);
            synchronized (var3) {
                int var5 = var3.method234(this);
                if (var5 < 0) {
                    var3.field527 = 0;
                    this.method1356(var3);
                } else {
                    var3.field527 = var5;
                    this.method1358(var3.field2216, var3);
                }
            }
        } while (arg0 != 0);
    }
}
