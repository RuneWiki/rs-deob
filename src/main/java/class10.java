import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class10 extends class476 {

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Lfca;")
    private class661 field86 = new class661();

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Lfca;")
    private class661 field87 = new class661();

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    private int field89 = 0;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    private int field88 = -1;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lkm;)V", line = 6)
    public final synchronized void method30(class476 arg0) {
        arg0.method1946(-10364);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()I", line = 9)
    public final int method31() {
        return 0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lko;Lfd;)V", line = 14)
    private final void method32(class337 arg0, class314 arg1) {
        while (this.field87.field8613 != arg0 && ((class314) arg0).field3904 <= arg1.field3904) {
            arg0 = arg0.field4111;
        }
        class115.method670(1, arg0, arg1);
        this.field88 = ((class314) this.field87.field8613.field4111).field3904;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([III)V", line = 26)
    public final synchronized void method33(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field88 < 0) {
                this.method38(arg0, arg1, arg2);
                return;
            }
            if (this.field89 + arg2 < this.field88) {
                this.field89 += arg2;
                this.method38(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field88 - this.field89;
            this.method38(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field89 += var4;
            this.method37();
            class314 var5 = (class314) this.field87.method3591(0);
            synchronized (var5) {
                int var7 = var5.method1835(this);
                if (var7 < 0) {
                    var5.field3904 = 0;
                    this.method39(var5);
                } else {
                    var5.field3904 = var7;
                    this.method32(var5.field4111, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 73)
    private final void method34(int arg0) {
        for (class476 var2 = (class476) this.field86.method3591(0); var2 != null; var2 = (class476) this.field86.method3600((byte) 60)) {
            var2.method36(arg0);
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "()I", line = 85)
    public final synchronized int method35() {
        return this.field86.method3597(-67);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 92)
    public final synchronized void method36(int arg0) {
        do {
            if (this.field88 < 0) {
                this.method34(arg0);
                return;
            }
            if (this.field89 + arg0 < this.field88) {
                this.field89 += arg0;
                this.method34(arg0);
                return;
            }
            int var2 = this.field88 - this.field89;
            this.method34(var2);
            arg0 -= var2;
            this.field89 += var2;
            this.method37();
            class314 var3 = (class314) this.field87.method3591(0);
            synchronized (var3) {
                int var5 = var3.method1835(this);
                if (var5 < 0) {
                    var3.field3904 = 0;
                    this.method39(var3);
                } else {
                    var3.field3904 = var5;
                    this.method32(var3.field4111, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "()V", line = 137)
    private final void method37() {
        if (this.field89 <= 0) {
            return;
        }
        for (class314 var1 = (class314) this.field87.method3591(0); var1 != null; var1 = (class314) this.field87.method3600((byte) 124)) {
            var1.field3904 -= this.field89;
        }
        this.field88 -= this.field89;
        this.field89 = 0;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "([III)V", line = 156)
    private final void method38(int[] arg0, int arg1, int arg2) {
        for (class476 var4 = (class476) this.field86.method3591(0); var4 != null; var4 = (class476) this.field86.method3600((byte) 94)) {
            var4.method2679(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lfd;)V", line = 165)
    private final void method39(class314 arg0) {
        arg0.method1946(-10364);
        arg0.method1836();
        class337 var2 = this.field87.field8613.field4111;
        if (this.field87.field8613 == var2) {
            this.field88 = -1;
        } else {
            this.field88 = ((class314) var2).field3904;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()Lkm;", line = 184)
    public final class476 method40() {
        return (class476) this.field86.method3600((byte) 80);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Lkm;)V", line = 196)
    public final synchronized void method41(class476 arg0) {
        this.field86.method3598(arg0, true);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()Lkm;", line = 206)
    public final class476 method42() {
        return (class476) this.field86.method3591(0);
    }
}
