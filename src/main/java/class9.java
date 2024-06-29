import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class9 extends class427 {

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Lfea;")
    private class47 field83 = new class47();

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Lfea;")
    private class47 field84 = new class47();

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    private int field85 = 0;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    private int field86 = -1;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "()Lps;", line = 3)
    public final class427 method36() {
        return (class427) this.field83.method420(false);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lps;)V", line = 9)
    public final synchronized void method37(class427 arg0) {
        this.field83.method415((byte) 105, arg0);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "([III)V", line = 16)
    public final synchronized void method38(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field86 < 0) {
                this.method42(arg0, arg1, arg2);
                return;
            }
            if (this.field85 + arg2 < this.field86) {
                this.field85 += arg2;
                this.method42(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field86 - this.field85;
            this.method42(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field85 += var4;
            this.method43();
            class296 var5 = (class296) this.field84.method427(true);
            synchronized (var5) {
                int var7 = var5.method1859(this);
                if (var7 < 0) {
                    var5.field4259 = 0;
                    this.method40(var5);
                } else {
                    var5.field4259 = var7;
                    this.method41(var5.field1802, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "()I", line = 62)
    public final int method39() {
        return 0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lav;)V", line = 67)
    private final void method40(class296 arg0) {
        arg0.method911(-52);
        arg0.method1860();
        class108 var2 = this.field84.field659.field1802;
        if (this.field84.field659 == var2) {
            this.field86 = -1;
        } else {
            this.field86 = ((class296) var2).field4259;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lum;Lav;)V", line = 81)
    private final void method41(class108 arg0, class296 arg1) {
        while (this.field84.field659 != arg0 && ((class296) arg0).field4259 <= arg1.field4259) {
            arg0 = arg0.field1802;
        }
        class246.method1563(arg0, arg1, (byte) 114);
        this.field86 = ((class296) this.field84.field659.field1802).field4259;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "([III)V", line = 92)
    private final void method42(int[] arg0, int arg1, int arg2) {
        for (class427 var4 = (class427) this.field83.method427(true); var4 != null; var4 = (class427) this.field83.method420(false)) {
            var4.method2550(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "()V", line = 104)
    private final void method43() {
        if (this.field85 <= 0) {
            return;
        }
        for (class296 var1 = (class296) this.field84.method427(true); var1 != null; var1 = (class296) this.field84.method420(false)) {
            var1.field4259 -= this.field85;
        }
        this.field86 -= this.field85;
        this.field85 = 0;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lps;)V", line = 123)
    public final synchronized void method44(class427 arg0) {
        arg0.method911(-52);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "()Lps;", line = 127)
    public final class427 method45() {
        return (class427) this.field83.method427(true);
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "()I", line = 130)
    public final synchronized int method46() {
        return this.field83.method419(108);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 137)
    private final void method47(int arg0) {
        for (class427 var2 = (class427) this.field83.method427(true); var2 != null; var2 = (class427) this.field83.method420(false)) {
            var2.method48(arg0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 149)
    public final synchronized void method48(int arg0) {
        do {
            if (this.field86 < 0) {
                this.method47(arg0);
                return;
            }
            if (this.field85 + arg0 < this.field86) {
                this.field85 += arg0;
                this.method47(arg0);
                return;
            }
            int var2 = this.field86 - this.field85;
            this.method47(var2);
            arg0 -= var2;
            this.field85 += var2;
            this.method43();
            class296 var3 = (class296) this.field84.method427(true);
            synchronized (var3) {
                int var5 = var3.method1859(this);
                if (var5 < 0) {
                    var3.field4259 = 0;
                    this.method40(var3);
                } else {
                    var3.field4259 = var5;
                    this.method41(var3.field1802, var3);
                }
            }
        } while (arg0 != 0);
    }
}
