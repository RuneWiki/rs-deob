import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class113 extends class156 {

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lof;")
    private class145 field2096 = new class145();

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lof;")
    private class145 field2097 = new class145();

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    private int field2098 = -1;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    private int field2099 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lpg;)V")
    public final synchronized void method685(class156 arg0) {
        this.field2096.method925(255, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Lpg;)V")
    public final synchronized void method686(class156 arg0) {
        arg0.method824((byte) -123);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)V")
    public final synchronized void method108(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2098 < 0) {
                this.method690(arg0, arg1, arg2);
                return;
            }
            if (this.field2099 + arg2 < this.field2098) {
                this.field2099 += arg2;
                this.method690(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2098 - this.field2099;
            this.method690(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2099 += var4;
            this.method687();
            class6 var5 = (class6) this.field2097.method915(-1);
            synchronized (var5) {
                int var7 = var5.method44(this);
                if (var7 < 0) {
                    var5.field127 = 0;
                    this.method689(var5);
                } else {
                    var5.field127 = var7;
                    this.method691(var5.field2434, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "()V")
    private final void method687() {
        if (this.field2099 <= 0) {
            return;
        }
        for (class6 var1 = (class6) this.field2097.method915(-1); var1 != null; var1 = (class6) this.field2097.method910((byte) 88)) {
            var1.field127 -= this.field2099;
        }
        this.field2098 -= this.field2099;
        this.field2099 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()Lpg;")
    public final class156 method116() {
        return (class156) this.field2096.method910((byte) 88);
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    private final void method688(int arg0) {
        for (class156 var2 = (class156) this.field2096.method915(-1); var2 != null; var2 = (class156) this.field2096.method910((byte) 88)) {
            var2.method91(arg0);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lae;)V")
    private final void method689(class6 arg0) {
        arg0.method824((byte) -126);
        arg0.method45();
        class129 var2 = this.field2097.field2723.field2434;
        if (this.field2097.field2723 == var2) {
            this.field2098 = -1;
        } else {
            this.field2098 = ((class6) var2).field127;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()I")
    public final int method115() {
        return 0;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "([III)V")
    private final void method690(int[] arg0, int arg1, int arg2) {
        for (class156 var4 = (class156) this.field2096.method915(-1); var4 != null; var4 = (class156) this.field2096.method910((byte) 88)) {
            var4.method1031(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ln;Lae;)V")
    private final void method691(class129 arg0, class6 arg1) {
        while (this.field2097.field2723 != arg0 && ((class6) arg0).field127 <= arg1.field127) {
            arg0 = arg0.field2434;
        }
        this.field2097.method909(0, arg0, arg1);
        this.field2098 = ((class6) this.field2097.field2723.field2434).field127;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public final synchronized void method91(int arg0) {
        do {
            if (this.field2098 < 0) {
                this.method688(arg0);
                return;
            }
            if (this.field2099 + arg0 < this.field2098) {
                this.field2099 += arg0;
                this.method688(arg0);
                return;
            }
            int var2 = this.field2098 - this.field2099;
            this.method688(var2);
            arg0 -= var2;
            this.field2099 += var2;
            this.method687();
            class6 var3 = (class6) this.field2097.method915(-1);
            synchronized (var3) {
                int var5 = var3.method44(this);
                if (var5 < 0) {
                    var3.field127 = 0;
                    this.method689(var3);
                } else {
                    var3.field127 = var5;
                    this.method691(var3.field2434, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "()Lpg;")
    public final class156 method101() {
        return (class156) this.field2096.method915(-1);
    }
}
