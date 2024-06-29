import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class340 extends class281 {

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Lft;")
    private class4 field5073 = new class4();

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "Lft;")
    private class4 field5074 = new class4();

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    private int field5075 = -1;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    private int field5076 = 0;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "()I")
    public final synchronized int method2095() {
        return this.field5073.method6(18328);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lfp;)V")
    private final void method2096(class204 arg0) {
        arg0.method1121(false);
        arg0.method1260();
        class179 var2 = this.field5074.field45.field2799;
        if (this.field5074.field45 == var2) {
            this.field5075 = -1;
        } else {
            this.field5075 = ((class204) var2).field3213;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lwg;)V")
    public final synchronized void method2097(class281 arg0) {
        this.field5073.method11(-118, arg0);
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "([III)V")
    private final void method2098(int[] arg0, int arg1, int arg2) {
        for (class281 var4 = (class281) this.field5073.method8((byte) -98); var4 != null; var4 = (class281) this.field5073.method17((byte) 60)) {
            var4.method1713(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Lwg;)V")
    public final synchronized void method2099(class281 arg0) {
        arg0.method1121(false);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lol;Lfp;)V")
    private final void method2100(class179 arg0, class204 arg1) {
        while (this.field5074.field45 != arg0 && ((class204) arg0).field3213 <= arg1.field3213) {
            arg0 = arg0.field2799;
        }
        class18.method97(arg1, 1839, arg0);
        this.field5075 = ((class204) this.field5074.field45.field2799).field3213;
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
    private final void method2101(int arg0) {
        for (class281 var2 = (class281) this.field5073.method8((byte) -98); var2 != null; var2 = (class281) this.field5073.method17((byte) -62)) {
            var2.method633(arg0);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "()Lwg;")
    public final class281 method652() {
        return (class281) this.field5073.method8((byte) -98);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "([III)V")
    public final synchronized void method643(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5075 < 0) {
                this.method2098(arg0, arg1, arg2);
                return;
            }
            if (this.field5076 + arg2 < this.field5075) {
                this.field5076 += arg2;
                this.method2098(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5075 - this.field5076;
            this.method2098(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5076 += var4;
            this.method2102();
            class204 var5 = (class204) this.field5074.method8((byte) -98);
            synchronized (var5) {
                int var7 = var5.method1259(this);
                if (var7 < 0) {
                    var5.field3213 = 0;
                    this.method2096(var5);
                } else {
                    var5.field3213 = var7;
                    this.method2100(var5.field2799, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
    public final synchronized void method633(int arg0) {
        do {
            if (this.field5075 < 0) {
                this.method2101(arg0);
                return;
            }
            if (this.field5076 + arg0 < this.field5075) {
                this.field5076 += arg0;
                this.method2101(arg0);
                return;
            }
            int var2 = this.field5075 - this.field5076;
            this.method2101(var2);
            arg0 -= var2;
            this.field5076 += var2;
            this.method2102();
            class204 var3 = (class204) this.field5074.method8((byte) -98);
            synchronized (var3) {
                int var5 = var3.method1259(this);
                if (var5 < 0) {
                    var3.field3213 = 0;
                    this.method2096(var3);
                } else {
                    var3.field3213 = var5;
                    this.method2100(var3.field2799, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "()Lwg;")
    public final class281 method650() {
        return (class281) this.field5073.method17((byte) 44);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "()I")
    public final int method639() {
        return 0;
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "()V")
    private final void method2102() {
        if (this.field5076 <= 0) {
            return;
        }
        for (class204 var1 = (class204) this.field5074.method8((byte) -98); var1 != null; var1 = (class204) this.field5074.method17((byte) 70)) {
            var1.field3213 -= this.field5076;
        }
        this.field5075 -= this.field5076;
        this.field5076 = 0;
    }
}
