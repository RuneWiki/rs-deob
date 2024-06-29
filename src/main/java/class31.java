import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class31 extends class160 {

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lbh;")
    private class234 field373 = new class234();

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "Lbh;")
    private class234 field374 = new class234();

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    private int field375 = 0;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    private int field376 = -1;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([III)V")
    public final synchronized void method188(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field376 < 0) {
                this.method198(arg0, arg1, arg2);
                return;
            }
            if (this.field375 + arg2 < this.field376) {
                this.field375 += arg2;
                this.method198(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field376 - this.field375;
            this.method198(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field375 += var4;
            this.method192();
            class250 var5 = (class250) this.field374.method1532(-109);
            synchronized (var5) {
                int var7 = var5.method1606(this);
                if (var7 < 0) {
                    var5.field3622 = 0;
                    this.method197(var5);
                } else {
                    var5.field3622 = var7;
                    this.method194(var5.field4487, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lic;)V")
    public final synchronized void method189(class160 arg0) {
        arg0.method1935(112);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public final synchronized void method190(int arg0) {
        do {
            if (this.field376 < 0) {
                this.method199(arg0);
                return;
            }
            if (this.field375 + arg0 < this.field376) {
                this.field375 += arg0;
                this.method199(arg0);
                return;
            }
            int var2 = this.field376 - this.field375;
            this.method199(var2);
            arg0 -= var2;
            this.field375 += var2;
            this.method192();
            class250 var3 = (class250) this.field374.method1532(-124);
            synchronized (var3) {
                int var5 = var3.method1606(this);
                if (var5 < 0) {
                    var3.field3622 = 0;
                    this.method197(var3);
                } else {
                    var3.field3622 = var5;
                    this.method194(var3.field4487, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Lic;)V")
    public final synchronized void method191(class160 arg0) {
        this.field373.method1527(arg0, 73);
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "()V")
    private final void method192() {
        if (this.field375 <= 0) {
            return;
        }
        for (class250 var1 = (class250) this.field374.method1532(-86); var1 != null; var1 = (class250) this.field374.method1523(-128)) {
            var1.field3622 -= this.field375;
        }
        this.field376 -= this.field375;
        this.field375 = 0;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()I")
    public final int method193() {
        return 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lnh;Ltc;)V")
    private final void method194(class288 arg0, class250 arg1) {
        while (this.field374.field3374 != arg0 && ((class250) arg0).field3622 <= arg1.field3622) {
            arg0 = arg0.field4487;
        }
        class35.method215(false, arg0, arg1);
        this.field376 = ((class250) this.field374.field3374.field4487).field3622;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()Lic;")
    public final class160 method195() {
        return (class160) this.field373.method1523(-120);
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "()Lic;")
    public final class160 method196() {
        return (class160) this.field373.method1532(-67);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ltc;)V")
    private final void method197(class250 arg0) {
        arg0.method1935(120);
        arg0.method1607();
        class288 var2 = this.field374.field3374.field4487;
        if (this.field374.field3374 == var2) {
            this.field376 = -1;
        } else {
            this.field376 = ((class250) var2).field3622;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "([III)V")
    private final void method198(int[] arg0, int arg1, int arg2) {
        for (class160 var4 = (class160) this.field373.method1532(-87); var4 != null; var4 = (class160) this.field373.method1523(-109)) {
            var4.method1064(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
    private final void method199(int arg0) {
        for (class160 var2 = (class160) this.field373.method1532(-95); var2 != null; var2 = (class160) this.field373.method1523(-87)) {
            var2.method190(arg0);
        }
    }
}
