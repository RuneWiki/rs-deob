import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class177 extends class304 {

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Lpk;")
    private class133 field2505 = new class133();

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Lpk;")
    private class133 field2506 = new class133();

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    private int field2507 = -1;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    private int field2508 = 0;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "()I")
    public final synchronized int method1240() {
        return this.field2505.method1026(0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lti;)V")
    public final synchronized void method1241(class304 arg0) {
        this.field2505.method1011(1245184, arg0);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Lti;)V")
    public final synchronized void method1242(class304 arg0) {
        arg0.method1525((byte) 86);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()Lti;")
    public final class304 method173() {
        return (class304) this.field2505.method1022((byte) -112);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "([III)V")
    private final void method1243(int[] arg0, int arg1, int arg2) {
        for (class304 var4 = (class304) this.field2505.method1018(88); var4 != null; var4 = (class304) this.field2505.method1022((byte) -112)) {
            var4.method1896(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "()Lti;")
    public final class304 method151() {
        return (class304) this.field2505.method1018(114);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lwr;)V")
    private final void method1244(class317 arg0) {
        arg0.method1525((byte) -123);
        arg0.method1979();
        class223 var2 = this.field2506.field1918.field3275;
        if (this.field2506.field1918 == var2) {
            this.field2507 = -1;
        } else {
            this.field2507 = ((class317) var2).field4505;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lvu;Lwr;)V")
    private final void method1245(class223 arg0, class317 arg1) {
        while (this.field2506.field1918 != arg0 && ((class317) arg0).field4505 <= arg1.field4505) {
            arg0 = arg0.field3275;
        }
        class463.method2779(arg0, arg1, 65);
        this.field2507 = ((class317) this.field2506.field1918.field3275).field4505;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    private final void method1246(int arg0) {
        for (class304 var2 = (class304) this.field2505.method1018(107); var2 != null; var2 = (class304) this.field2505.method1022((byte) -112)) {
            var2.method136(arg0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "()V")
    private final void method1247() {
        if (this.field2508 <= 0) {
            return;
        }
        for (class317 var1 = (class317) this.field2506.method1018(88); var1 != null; var1 = (class317) this.field2506.method1022((byte) -112)) {
            var1.field4505 -= this.field2508;
        }
        this.field2507 -= this.field2508;
        this.field2508 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "()I")
    public final int method143() {
        return 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public final synchronized void method136(int arg0) {
        do {
            if (this.field2507 < 0) {
                this.method1246(arg0);
                return;
            }
            if (this.field2508 + arg0 < this.field2507) {
                this.field2508 += arg0;
                this.method1246(arg0);
                return;
            }
            int var2 = this.field2507 - this.field2508;
            this.method1246(var2);
            arg0 -= var2;
            this.field2508 += var2;
            this.method1247();
            class317 var3 = (class317) this.field2506.method1018(53);
            synchronized (var3) {
                int var5 = var3.method1980(this);
                if (var5 < 0) {
                    var3.field4505 = 0;
                    this.method1244(var3);
                } else {
                    var3.field4505 = var5;
                    this.method1245(var3.field3275, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([III)V")
    public final synchronized void method147(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2507 < 0) {
                this.method1243(arg0, arg1, arg2);
                return;
            }
            if (this.field2508 + arg2 < this.field2507) {
                this.field2508 += arg2;
                this.method1243(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2507 - this.field2508;
            this.method1243(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2508 += var4;
            this.method1247();
            class317 var5 = (class317) this.field2506.method1018(112);
            synchronized (var5) {
                int var7 = var5.method1980(this);
                if (var7 < 0) {
                    var5.field4505 = 0;
                    this.method1244(var5);
                } else {
                    var5.field4505 = var7;
                    this.method1245(var5.field3275, var5);
                }
            }
        } while (arg2 != 0);
    }
}
