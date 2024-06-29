import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class19 extends class240 {

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Lb;")
    private class48 field358 = new class48();

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Lb;")
    private class48 field359 = new class48();

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    private int field361 = 0;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    private int field360 = -1;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    private final void method176(int arg0) {
        for (class240 var2 = (class240) this.field358.method478(0); var2 != null; var2 = (class240) this.field358.method476((byte) 13)) {
            var2.method187(arg0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Loa;)V")
    public final synchronized void method177(class240 arg0) {
        this.field358.method475(arg0, true);
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "()V")
    private final void method178() {
        if (this.field361 <= 0) {
            return;
        }
        for (class274 var1 = (class274) this.field359.method478(0); var1 != null; var1 = (class274) this.field359.method476((byte) 13)) {
            var1.field4797 -= this.field361;
        }
        this.field360 -= this.field361;
        this.field361 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "()Loa;")
    public final class240 method179() {
        return (class240) this.field358.method478(0);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "([III)V")
    private final void method180(int[] arg0, int arg1, int arg2) {
        for (class240 var4 = (class240) this.field358.method478(0); var4 != null; var4 = (class240) this.field358.method476((byte) 13)) {
            var4.method1696(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Loj;)V")
    private final void method181(class274 arg0) {
        arg0.method1681(false);
        arg0.method1865();
        class236 var2 = this.field359.field1099.field4211;
        if (this.field359.field1099 == var2) {
            this.field360 = -1;
        } else {
            this.field360 = ((class274) var2).field4797;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "()Loa;")
    public final class240 method182() {
        return (class240) this.field358.method476((byte) 13);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([III)V")
    public final synchronized void method183(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field360 < 0) {
                this.method180(arg0, arg1, arg2);
                return;
            }
            if (this.field361 + arg2 < this.field360) {
                this.field361 += arg2;
                this.method180(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field360 - this.field361;
            this.method180(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field361 += var4;
            this.method178();
            class274 var5 = (class274) this.field359.method478(0);
            synchronized (var5) {
                int var7 = var5.method1866(this);
                if (var7 < 0) {
                    var5.field4797 = 0;
                    this.method181(var5);
                } else {
                    var5.field4797 = var7;
                    this.method184(var5.field4211, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lcb;Loj;)V")
    private final void method184(class236 arg0, class274 arg1) {
        while (this.field359.field1099 != arg0 && ((class274) arg0).field4797 <= arg1.field4797) {
            arg0 = arg0.field4211;
        }
        class193.method1397(arg1, (byte) 125, arg0);
        this.field360 = ((class274) this.field359.field1099.field4211).field4797;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "()I")
    public final int method185() {
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Loa;)V")
    public final synchronized void method186(class240 arg0) {
        arg0.method1681(false);
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public final synchronized void method187(int arg0) {
        do {
            if (this.field360 < 0) {
                this.method176(arg0);
                return;
            }
            if (this.field361 + arg0 < this.field360) {
                this.field361 += arg0;
                this.method176(arg0);
                return;
            }
            int var2 = this.field360 - this.field361;
            this.method176(var2);
            arg0 -= var2;
            this.field361 += var2;
            this.method178();
            class274 var3 = (class274) this.field359.method478(0);
            synchronized (var3) {
                int var5 = var3.method1866(this);
                if (var5 < 0) {
                    var3.field4797 = 0;
                    this.method181(var3);
                } else {
                    var3.field4797 = var5;
                    this.method184(var3.field4211, var3);
                }
            }
        } while (arg0 != 0);
    }
}
