import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class151 extends class156 {

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lli;")
    private class191 field2752 = new class191();

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lli;")
    private class191 field2753 = new class191();

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private int field2754 = 0;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    private int field2755 = -1;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()I")
    public final int method993() {
        return 0;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()Laf;")
    public final class156 method994() {
        return (class156) this.field2752.method1292((byte) 109);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([III)V")
    public final synchronized void method995(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2755 < 0) {
                this.method1002(arg0, arg1, arg2);
                return;
            }
            if (this.field2754 + arg2 < this.field2755) {
                this.field2754 += arg2;
                this.method1002(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2755 - this.field2754;
            this.method1002(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2754 += var4;
            this.method999();
            class220 var5 = (class220) this.field2753.method1294(false);
            synchronized (var5) {
                int var7 = var5.method1501(this);
                if (var7 < 0) {
                    var5.field3999 = 0;
                    this.method1003(var5);
                } else {
                    var5.field3999 = var7;
                    this.method1001(var5.field1164, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public final synchronized void method996(int arg0) {
        do {
            if (this.field2755 < 0) {
                this.method997(arg0);
                return;
            }
            if (this.field2754 + arg0 < this.field2755) {
                this.field2754 += arg0;
                this.method997(arg0);
                return;
            }
            int var2 = this.field2755 - this.field2754;
            this.method997(var2);
            arg0 -= var2;
            this.field2754 += var2;
            this.method999();
            class220 var3 = (class220) this.field2753.method1294(false);
            synchronized (var3) {
                int var5 = var3.method1501(this);
                if (var5 < 0) {
                    var3.field3999 = 0;
                    this.method1003(var3);
                } else {
                    var3.field3999 = var5;
                    this.method1001(var3.field1164, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    private final void method997(int arg0) {
        for (class156 var2 = (class156) this.field2752.method1294(false); var2 != null; var2 = (class156) this.field2752.method1292((byte) 107)) {
            var2.method996(arg0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Laf;)V")
    public final synchronized void method998(class156 arg0) {
        this.field2752.method1297((byte) 23, arg0);
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "()V")
    private final void method999() {
        if (this.field2754 <= 0) {
            return;
        }
        for (class220 var1 = (class220) this.field2753.method1294(false); var1 != null; var1 = (class220) this.field2753.method1292((byte) 114)) {
            var1.field3999 -= this.field2754;
        }
        this.field2755 -= this.field2754;
        this.field2754 = 0;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Laf;)V")
    public final synchronized void method1000(class156 arg0) {
        arg0.method349(0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lje;Lmd;)V")
    private final void method1001(class61 arg0, class220 arg1) {
        while (this.field2753.field3504 != arg0 && ((class220) arg0).field3999 <= arg1.field3999) {
            arg0 = arg0.field1164;
        }
        class244.method1620(arg1, (byte) -127, arg0);
        this.field2755 = ((class220) this.field2753.field3504.field1164).field3999;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "([III)V")
    private final void method1002(int[] arg0, int arg1, int arg2) {
        for (class156 var4 = (class156) this.field2752.method1294(false); var4 != null; var4 = (class156) this.field2752.method1292((byte) 80)) {
            var4.method1025(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lmd;)V")
    private final void method1003(class220 arg0) {
        arg0.method349(0);
        arg0.method1502();
        class61 var2 = this.field2753.field3504.field1164;
        if (this.field2753.field3504 == var2) {
            this.field2755 = -1;
        } else {
            this.field2755 = ((class220) var2).field3999;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()Laf;")
    public final class156 method1004() {
        return (class156) this.field2752.method1294(false);
    }
}
