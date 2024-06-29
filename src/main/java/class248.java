import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class248 extends class307 {

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Lmc;")
    private class170 field4184 = new class170();

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Lmc;")
    private class170 field4185 = new class170();

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    private int field4186 = 0;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    private int field4187 = -1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lh;Lnm;)V", line = 4)
    private final void method1788(class206 arg0, class174 arg1) {
        while (this.field4185.field2862 != arg0 && ((class174) arg0).field2932 <= arg1.field2932) {
            arg0 = arg0.field3483;
        }
        class30.method202(0, arg1, arg0);
        this.field4187 = ((class174) this.field4185.field2862.field3483).field2932;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([III)V", line = 15)
    public final synchronized void method998(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4187 < 0) {
                this.method1791(arg0, arg1, arg2);
                return;
            }
            if (this.field4186 + arg2 < this.field4187) {
                this.field4186 += arg2;
                this.method1791(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4187 - this.field4186;
            this.method1791(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4186 += var4;
            this.method1792();
            class174 var5 = (class174) this.field4185.method1250(true);
            synchronized (var5) {
                int var7 = var5.method1287(this);
                if (var7 < 0) {
                    var5.field2932 = 0;
                    this.method1794(var5);
                } else {
                    var5.field2932 = var7;
                    this.method1788(var5.field3483, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Loj;)V", line = 61)
    public final synchronized void method1789(class307 arg0) {
        this.field4184.method1260(arg0, false);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Loj;)V", line = 69)
    public final synchronized void method1790(class307 arg0) {
        arg0.method1527(-57);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "([III)V", line = 74)
    private final void method1791(int[] arg0, int arg1, int arg2) {
        for (class307 var4 = (class307) this.field4184.method1250(true); var4 != null; var4 = (class307) this.field4184.method1256((byte) -122)) {
            var4.method2103(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "()V", line = 83)
    private final void method1792() {
        if (this.field4186 <= 0) {
            return;
        }
        for (class174 var1 = (class174) this.field4185.method1250(true); var1 != null; var1 = (class174) this.field4185.method1256((byte) -126)) {
            var1.field2932 -= this.field4186;
        }
        this.field4187 -= this.field4186;
        this.field4186 = 0;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()Loj;", line = 102)
    public final class307 method967() {
        return (class307) this.field4184.method1250(true);
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V", line = 108)
    public final synchronized void method977(int arg0) {
        do {
            if (this.field4187 < 0) {
                this.method1793(arg0);
                return;
            }
            if (this.field4186 + arg0 < this.field4187) {
                this.field4186 += arg0;
                this.method1793(arg0);
                return;
            }
            int var2 = this.field4187 - this.field4186;
            this.method1793(var2);
            arg0 -= var2;
            this.field4186 += var2;
            this.method1792();
            class174 var3 = (class174) this.field4185.method1250(true);
            synchronized (var3) {
                int var5 = var3.method1287(this);
                if (var5 < 0) {
                    var3.field2932 = 0;
                    this.method1794(var3);
                } else {
                    var3.field2932 = var5;
                    this.method1788(var3.field3483, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()I", line = 154)
    public final int method971() {
        return 0;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()Loj;", line = 163)
    public final class307 method972() {
        return (class307) this.field4184.method1256((byte) -128);
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V", line = 169)
    private final void method1793(int arg0) {
        for (class307 var2 = (class307) this.field4184.method1250(true); var2 != null; var2 = (class307) this.field4184.method1256((byte) -122)) {
            var2.method977(arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lnm;)V", line = 180)
    private final void method1794(class174 arg0) {
        arg0.method1527(112);
        arg0.method1286();
        class206 var2 = this.field4185.field2862.field3483;
        if (this.field4185.field2862 == var2) {
            this.field4187 = -1;
        } else {
            this.field4187 = ((class174) var2).field2932;
        }
    }
}
