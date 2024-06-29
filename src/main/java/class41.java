import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class41 extends class214 {

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "Loe;")
    private class137 field542 = new class137();

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "Loe;")
    private class137 field543 = new class137();

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
    private int field544 = 0;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    private int field545 = -1;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "()I")
    public final synchronized int method383() {
        return this.field542.method1000((byte) 121);
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "([III)V")
    private final void method384(int[] arg0, int arg1, int arg2) {
        for (class214 var4 = (class214) this.field542.method1004((byte) -112); var4 != null; var4 = (class214) this.field542.method996(1)) {
            var4.method1483(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lfp;)V")
    public final synchronized void method385(class214 arg0) {
        arg0.method2677(-22491);
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "()Lfp;")
    public final class214 method386() {
        return (class214) this.field542.method1004((byte) -85);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([III)V")
    public final synchronized void method387(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field545 < 0) {
                this.method384(arg0, arg1, arg2);
                return;
            }
            if (this.field544 + arg2 < this.field545) {
                this.field544 += arg2;
                this.method384(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field545 - this.field544;
            this.method384(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field544 += var4;
            this.method388();
            class369 var5 = (class369) this.field543.method1004((byte) -55);
            synchronized (var5) {
                int var7 = var5.method2299(this);
                if (var7 < 0) {
                    var5.field5410 = 0;
                    this.method390(var5);
                } else {
                    var5.field5410 = var7;
                    this.method395(var5.field6384, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "()V")
    private final void method388() {
        if (this.field544 <= 0) {
            return;
        }
        for (class369 var1 = (class369) this.field543.method1004((byte) -109); var1 != null; var1 = (class369) this.field543.method996(1)) {
            var1.field5410 -= this.field544;
        }
        this.field545 -= this.field544;
        this.field544 = 0;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public final synchronized void method389(int arg0) {
        do {
            if (this.field545 < 0) {
                this.method393(arg0);
                return;
            }
            if (this.field544 + arg0 < this.field545) {
                this.field544 += arg0;
                this.method393(arg0);
                return;
            }
            int var2 = this.field545 - this.field544;
            this.method393(var2);
            arg0 -= var2;
            this.field544 += var2;
            this.method388();
            class369 var3 = (class369) this.field543.method1004((byte) -78);
            synchronized (var3) {
                int var5 = var3.method2299(this);
                if (var5 < 0) {
                    var3.field5410 = 0;
                    this.method390(var3);
                } else {
                    var3.field5410 = var5;
                    this.method395(var3.field6384, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lfd;)V")
    private final void method390(class369 arg0) {
        arg0.method2677(-22491);
        arg0.method2298();
        class431 var2 = this.field543.field2077.field6384;
        if (this.field543.field2077 == var2) {
            this.field545 = -1;
        } else {
            this.field545 = ((class369) var2).field5410;
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "()I")
    public final int method391() {
        return 0;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lfp;)V")
    public final synchronized void method392(class214 arg0) {
        this.field542.method998(arg0, 100);
    }

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)V")
    private final void method393(int arg0) {
        for (class214 var2 = (class214) this.field542.method1004((byte) -125); var2 != null; var2 = (class214) this.field542.method996(1)) {
            var2.method389(arg0);
        }
    }

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "()Lfp;")
    public final class214 method394() {
        return (class214) this.field542.method996(1);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lcf;Lfd;)V")
    private final void method395(class431 arg0, class369 arg1) {
        while (this.field543.field2077 != arg0 && ((class369) arg0).field5410 <= arg1.field5410) {
            arg0 = arg0.field6384;
        }
        class287.method1852(arg1, arg0, true);
        this.field545 = ((class369) this.field543.field2077.field6384).field5410;
    }
}
