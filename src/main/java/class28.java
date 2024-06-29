import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 extends class116 {

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lko;")
    private class348 field458 = new class348();

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lko;")
    private class348 field459 = new class348();

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    private int field460 = 0;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    private int field461 = -1;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "()I")
    public final synchronized int method220() {
        return this.field458.method2266(-1);
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "()V")
    private final void method221() {
        if (this.field460 <= 0) {
            return;
        }
        for (class75 var1 = (class75) this.field459.method2257((byte) 95); var1 != null; var1 = (class75) this.field459.method2256(-67)) {
            var1.field1244 -= this.field460;
        }
        this.field461 -= this.field460;
        this.field460 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()Lei;")
    public final class116 method222() {
        return (class116) this.field458.method2256(-123);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
    public final int method223() {
        return 0;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public final synchronized void method224(int arg0) {
        do {
            if (this.field461 < 0) {
                this.method229(arg0);
                return;
            }
            if (this.field460 + arg0 < this.field461) {
                this.field460 += arg0;
                this.method229(arg0);
                return;
            }
            int var2 = this.field461 - this.field460;
            this.method229(var2);
            arg0 -= var2;
            this.field460 += var2;
            this.method221();
            class75 var3 = (class75) this.field459.method2257((byte) 122);
            synchronized (var3) {
                int var5 = var3.method622(this);
                if (var5 < 0) {
                    var3.field1244 = 0;
                    this.method225(var3);
                } else {
                    var3.field1244 = var5;
                    this.method227(var3.field6403, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljj;)V")
    private final void method225(class75 arg0) {
        arg0.method2663(-124);
        arg0.method621();
        class439 var2 = this.field459.field5279.field6403;
        if (this.field459.field5279 == var2) {
            this.field461 = -1;
        } else {
            this.field461 = ((class75) var2).field1244;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "([III)V")
    private final void method226(int[] arg0, int arg1, int arg2) {
        for (class116 var4 = (class116) this.field458.method2257((byte) 91); var4 != null; var4 = (class116) this.field458.method2256(-73)) {
            var4.method853(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Loo;Ljj;)V")
    private final void method227(class439 arg0, class75 arg1) {
        while (this.field459.field5279 != arg0 && ((class75) arg0).field1244 <= arg1.field1244) {
            arg0 = arg0.field6403;
        }
        class359.method2315((byte) -126, arg1, arg0);
        this.field461 = ((class75) this.field459.field5279.field6403).field1244;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()Lei;")
    public final class116 method228() {
        return (class116) this.field458.method2257((byte) 108);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    private final void method229(int arg0) {
        for (class116 var2 = (class116) this.field458.method2257((byte) 127); var2 != null; var2 = (class116) this.field458.method2256(-80)) {
            var2.method224(arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lei;)V")
    public final synchronized void method230(class116 arg0) {
        this.field458.method2265((byte) -5, arg0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([III)V")
    public final synchronized void method231(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field461 < 0) {
                this.method226(arg0, arg1, arg2);
                return;
            }
            if (this.field460 + arg2 < this.field461) {
                this.field460 += arg2;
                this.method226(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field461 - this.field460;
            this.method226(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field460 += var4;
            this.method221();
            class75 var5 = (class75) this.field459.method2257((byte) 91);
            synchronized (var5) {
                int var7 = var5.method622(this);
                if (var7 < 0) {
                    var5.field1244 = 0;
                    this.method225(var5);
                } else {
                    var5.field1244 = var7;
                    this.method227(var5.field6403, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lei;)V")
    public final synchronized void method232(class116 arg0) {
        arg0.method2663(-116);
    }
}
