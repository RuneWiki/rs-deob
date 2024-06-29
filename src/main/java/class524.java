import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class524 extends class19 {

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Lau;")
    private class692 field7699 = new class692();

    @OriginalMember(owner = "client!op", name = "v", descriptor = "Lau;")
    private class692 field7700 = new class692();

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    private int field7702 = 0;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    private int field7701 = -1;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "()V", line = 4)
    private final void method3086() {
        if (this.field7702 <= 0) {
            return;
        }
        for (class280 var1 = (class280) this.field7700.method3905(-108); var1 != null; var1 = (class280) this.field7700.method3899(0)) {
            var1.field3942 -= this.field7702;
        }
        this.field7701 -= this.field7702;
        this.field7702 = 0;
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "()Lnr;", line = 22)
    public final class19 method207() {
        return (class19) this.field7699.method3899(0);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "()I", line = 26)
    public final int method205() {
        return 0;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "([III)V", line = 31)
    private final void method3087(int[] arg0, int arg1, int arg2) {
        for (class19 var4 = (class19) this.field7699.method3905(-109); var4 != null; var4 = (class19) this.field7699.method3899(0)) {
            var4.method204(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lnr;)V", line = 45)
    public final synchronized void method3088(class19 arg0) {
        this.field7699.method3902(arg0, 0);
    }

    @OriginalMember(owner = "client!op", name = "f", descriptor = "()I", line = 48)
    public final synchronized int method3089() {
        return this.field7699.method3890(0);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V", line = 54)
    private final void method3090(int arg0) {
        for (class19 var2 = (class19) this.field7699.method3905(-125); var2 != null; var2 = (class19) this.field7699.method3899(0)) {
            var2.method201(arg0);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lih;)V", line = 65)
    private final void method3091(class280 arg0) {
        arg0.method2549((byte) 40);
        arg0.method1732();
        class435 var2 = this.field7700.field9799.field6259;
        if (this.field7700.field9799 == var2) {
            this.field7701 = -1;
        } else {
            this.field7701 = ((class280) var2).field3942;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "([III)V", line = 84)
    public final synchronized void method203(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field7701 < 0) {
                this.method3087(arg0, arg1, arg2);
                return;
            }
            if (this.field7702 + arg2 < this.field7701) {
                this.field7702 += arg2;
                this.method3087(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field7701 - this.field7702;
            this.method3087(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field7702 += var4;
            this.method3086();
            class280 var5 = (class280) this.field7700.method3905(-118);
            synchronized (var5) {
                int var7 = var5.method1731(this);
                if (var7 < 0) {
                    var5.field3942 = 0;
                    this.method3091(var5);
                } else {
                    var5.field3942 = var7;
                    this.method3093(var5.field6259, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "()Lnr;", line = 130)
    public final class19 method202() {
        return (class19) this.field7699.method3905(-105);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 137)
    public final synchronized void method201(int arg0) {
        do {
            if (this.field7701 < 0) {
                this.method3090(arg0);
                return;
            }
            if (this.field7702 + arg0 < this.field7701) {
                this.field7702 += arg0;
                this.method3090(arg0);
                return;
            }
            int var2 = this.field7701 - this.field7702;
            this.method3090(var2);
            arg0 -= var2;
            this.field7702 += var2;
            this.method3086();
            class280 var3 = (class280) this.field7700.method3905(-107);
            synchronized (var3) {
                int var5 = var3.method1731(this);
                if (var5 < 0) {
                    var3.field3942 = 0;
                    this.method3091(var3);
                } else {
                    var3.field3942 = var5;
                    this.method3093(var3.field6259, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(Lnr;)V", line = 181)
    public final synchronized void method3092(class19 arg0) {
        arg0.method2549((byte) 36);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ltv;Lih;)V", line = 185)
    private final void method3093(class435 arg0, class280 arg1) {
        while (this.field7700.field9799 != arg0 && ((class280) arg0).field3942 <= arg1.field3942) {
            arg0 = arg0.field6259;
        }
        class701.method3943(arg1, -15818, arg0);
        this.field7701 = ((class280) this.field7700.field9799.field6259).field3942;
    }
}
