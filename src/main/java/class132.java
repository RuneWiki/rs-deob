import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class132 extends class271 {

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Lpj;")
    private class284 field1943 = new class284();

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Lpj;")
    private class284 field1944 = new class284();

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    private int field1946 = -1;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    private int field1945 = 0;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()Lgj;")
    public final class271 method259() {
        return (class271) this.field1943.method1894((byte) -90);
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V")
    private final void method907(int arg0) {
        for (class271 var2 = (class271) this.field1943.method1894((byte) -90); var2 != null; var2 = (class271) this.field1943.method1886(-40)) {
            var2.method280(arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()I")
    public final int method275() {
        return 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lgj;)V")
    public final synchronized void method908(class271 arg0) {
        arg0.method1193(121);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lug;Luk;)V")
    private final void method909(class181 arg0, class118 arg1) {
        while (this.field1944.field4357 != arg0 && ((class118) arg0).field1773 <= arg1.field1773) {
            arg0 = arg0.field2633;
        }
        class42.method344(arg0, 109, arg1);
        this.field1946 = ((class118) this.field1944.field4357.field2633).field1773;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Luk;)V")
    private final void method910(class118 arg0) {
        arg0.method1193(109);
        arg0.method832();
        class181 var2 = this.field1944.field4357.field2633;
        if (this.field1944.field4357 == var2) {
            this.field1946 = -1;
        } else {
            this.field1946 = ((class118) var2).field1773;
        }
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "()V")
    private final void method911() {
        if (this.field1945 <= 0) {
            return;
        }
        for (class118 var1 = (class118) this.field1944.method1894((byte) -90); var1 != null; var1 = (class118) this.field1944.method1886(-125)) {
            var1.field1773 -= this.field1945;
        }
        this.field1946 -= this.field1945;
        this.field1945 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "([III)V")
    private final void method912(int[] arg0, int arg1, int arg2) {
        for (class271 var4 = (class271) this.field1943.method1894((byte) -90); var4 != null; var4 = (class271) this.field1943.method1886(-39)) {
            var4.method1822(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "()Lgj;")
    public final class271 method250() {
        return (class271) this.field1943.method1886(-90);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([III)V")
    public final synchronized void method262(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1946 < 0) {
                this.method912(arg0, arg1, arg2);
                return;
            }
            if (this.field1945 + arg2 < this.field1946) {
                this.field1945 += arg2;
                this.method912(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1946 - this.field1945;
            this.method912(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1945 += var4;
            this.method911();
            class118 var5 = (class118) this.field1944.method1894((byte) -90);
            synchronized (var5) {
                int var7 = var5.method831(this);
                if (var7 < 0) {
                    var5.field1773 = 0;
                    this.method910(var5);
                } else {
                    var5.field1773 = var7;
                    this.method909(var5.field2633, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public final synchronized void method280(int arg0) {
        do {
            if (this.field1946 < 0) {
                this.method907(arg0);
                return;
            }
            if (this.field1945 + arg0 < this.field1946) {
                this.field1945 += arg0;
                this.method907(arg0);
                return;
            }
            int var2 = this.field1946 - this.field1945;
            this.method907(var2);
            arg0 -= var2;
            this.field1945 += var2;
            this.method911();
            class118 var3 = (class118) this.field1944.method1894((byte) -90);
            synchronized (var3) {
                int var5 = var3.method831(this);
                if (var5 < 0) {
                    var3.field1773 = 0;
                    this.method910(var3);
                } else {
                    var3.field1773 = var5;
                    this.method909(var3.field2633, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Lgj;)V")
    public final synchronized void method913(class271 arg0) {
        this.field1943.method1882((byte) 96, arg0);
    }
}
