import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class244 extends class36 {

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lmb;")
    private class160 field4392 = new class160();

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lmb;")
    private class160 field4393 = new class160();

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    private int field4394 = -1;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    private int field4395 = 0;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    private final void method1653(int arg0) {
        for (class36 var2 = (class36) this.field4392.method1151(112); var2 != null; var2 = (class36) this.field4392.method1159(102)) {
            var2.method213(arg0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()Lf;")
    public final class36 method215() {
        return (class36) this.field4392.method1159(52);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()I")
    public final int method214() {
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Loa;)V")
    private final void method1654(class99 arg0) {
        arg0.method1544((byte) -54);
        arg0.method719();
        class222 var2 = this.field4393.field2824.field4007;
        if (this.field4393.field2824 == var2) {
            this.field4394 = -1;
        } else {
            this.field4394 = ((class99) var2).field1739;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
    private final void method1655() {
        if (this.field4395 <= 0) {
            return;
        }
        for (class99 var1 = (class99) this.field4393.method1151(108); var1 != null; var1 = (class99) this.field4393.method1159(60)) {
            var1.field1739 -= this.field4395;
        }
        this.field4394 -= this.field4395;
        this.field4395 = 0;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final synchronized void method213(int arg0) {
        do {
            if (this.field4394 < 0) {
                this.method1653(arg0);
                return;
            }
            if (this.field4395 + arg0 < this.field4394) {
                this.field4395 += arg0;
                this.method1653(arg0);
                return;
            }
            int var2 = this.field4394 - this.field4395;
            this.method1653(var2);
            arg0 -= var2;
            this.field4395 += var2;
            this.method1655();
            class99 var3 = (class99) this.field4393.method1151(119);
            synchronized (var3) {
                int var5 = var3.method718(this);
                if (var5 < 0) {
                    var3.field1739 = 0;
                    this.method1654(var3);
                } else {
                    var3.field1739 = var5;
                    this.method1656(var3.field4007, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([III)V")
    public final synchronized void method209(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4394 < 0) {
                this.method1659(arg0, arg1, arg2);
                return;
            }
            if (this.field4395 + arg2 < this.field4394) {
                this.field4395 += arg2;
                this.method1659(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4394 - this.field4395;
            this.method1659(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4395 += var4;
            this.method1655();
            class99 var5 = (class99) this.field4393.method1151(99);
            synchronized (var5) {
                int var7 = var5.method718(this);
                if (var7 < 0) {
                    var5.field1739 = 0;
                    this.method1654(var5);
                } else {
                    var5.field1739 = var7;
                    this.method1656(var5.field4007, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lre;Loa;)V")
    private final void method1656(class222 arg0, class99 arg1) {
        while (this.field4393.field2824 != arg0 && ((class99) arg0).field1739 <= arg1.field1739) {
            arg0 = arg0.field4007;
        }
        class115.method831(arg1, 49, arg0);
        this.field4394 = ((class99) this.field4393.field2824.field4007).field1739;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lf;)V")
    public final synchronized void method1657(class36 arg0) {
        arg0.method1544((byte) -95);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lf;)V")
    public final synchronized void method1658(class36 arg0) {
        this.field4392.method1160(arg0, false);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()Lf;")
    public final class36 method211() {
        return (class36) this.field4392.method1151(117);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "([III)V")
    private final void method1659(int[] arg0, int arg1, int arg2) {
        for (class36 var4 = (class36) this.field4392.method1151(103); var4 != null; var4 = (class36) this.field4392.method1159(90)) {
            var4.method212(arg0, arg1, arg2);
        }
    }
}
