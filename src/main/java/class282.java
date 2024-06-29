import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class282 extends class241 {

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "Lbq;")
    private class289 field3434 = new class289();

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Lbq;")
    private class289 field3435 = new class289();

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    private int field3436 = -1;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    private int field3437 = 0;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "()I", line = 3)
    public final synchronized int method1683() {
        return this.field3434.method1727(115);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 9)
    public final synchronized void method649(int arg0) {
        do {
            if (this.field3436 < 0) {
                this.method1686(arg0);
                return;
            }
            if (this.field3437 + arg0 < this.field3436) {
                this.field3437 += arg0;
                this.method1686(arg0);
                return;
            }
            int var2 = this.field3436 - this.field3437;
            this.method1686(var2);
            arg0 -= var2;
            this.field3437 += var2;
            this.method1685();
            class612 var3 = (class612) this.field3435.method1719(65280);
            synchronized (var3) {
                int var5 = var3.method3462(this);
                if (var5 < 0) {
                    var3.field8769 = 0;
                    this.method1688(var3);
                } else {
                    var3.field8769 = var5;
                    this.method1687(var3.field1521, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()Leia;", line = 53)
    public final class241 method681() {
        return (class241) this.field3434.method1723(-20665);
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "()Leia;", line = 56)
    public final class241 method678() {
        return (class241) this.field3434.method1719(65280);
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "([III)V", line = 61)
    private final void method1684(int[] arg0, int arg1, int arg2) {
        for (class241 var4 = (class241) this.field3434.method1719(65280); var4 != null; var4 = (class241) this.field3434.method1723(-20665)) {
            var4.method1415(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "()V", line = 71)
    private final void method1685() {
        if (this.field3437 <= 0) {
            return;
        }
        for (class612 var1 = (class612) this.field3435.method1719(65280); var1 != null; var1 = (class612) this.field3435.method1723(-20665)) {
            var1.field8769 -= this.field3437;
        }
        this.field3436 -= this.field3437;
        this.field3437 = 0;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 93)
    private final void method1686(int arg0) {
        for (class241 var2 = (class241) this.field3434.method1719(65280); var2 != null; var2 = (class241) this.field3434.method1723(-20665)) {
            var2.method649(arg0);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lmc;Lte;)V", line = 102)
    private final void method1687(class134 arg0, class612 arg1) {
        while (this.field3435.field3563 != arg0 && ((class612) arg0).field8769 <= arg1.field8769) {
            arg0 = arg0.field1521;
        }
        class109.method745(arg0, (byte) -43, arg1);
        this.field3436 = ((class612) this.field3435.field3563.field1521).field8769;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "()I", line = 113)
    public final int method669() {
        return 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([III)V", line = 127)
    public final synchronized void method659(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3436 < 0) {
                this.method1684(arg0, arg1, arg2);
                return;
            }
            if (this.field3437 + arg2 < this.field3436) {
                this.field3437 += arg2;
                this.method1684(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3436 - this.field3437;
            this.method1684(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3437 += var4;
            this.method1685();
            class612 var5 = (class612) this.field3435.method1719(65280);
            synchronized (var5) {
                int var7 = var5.method3462(this);
                if (var7 < 0) {
                    var5.field8769 = 0;
                    this.method1688(var5);
                } else {
                    var5.field8769 = var7;
                    this.method1687(var5.field1521, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lte;)V", line = 171)
    private final void method1688(class612 arg0) {
        arg0.method864(12983);
        arg0.method3463();
        class134 var2 = this.field3435.field3563.field1521;
        if (this.field3435.field3563 == var2) {
            this.field3436 = -1;
        } else {
            this.field3436 = ((class612) var2).field8769;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Leia;)V", line = 188)
    public final synchronized void method1689(class241 arg0) {
        this.field3434.method1731(arg0, (byte) 119);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Leia;)V", line = 191)
    public final synchronized void method1690(class241 arg0) {
        arg0.method864(12983);
    }
}
