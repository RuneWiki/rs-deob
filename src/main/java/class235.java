import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class235 extends class194 {

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Loj;")
    private class246 field3778 = new class246();

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Loj;")
    private class246 field3779 = new class246();

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    private int field3780 = -1;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    private int field3781 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lhd;Lkm;)V")
    private final void method1591(class128 arg0, class54 arg1) {
        while (this.field3779.field3926 != arg0 && ((class54) arg0).field899 <= arg1.field899) {
            arg0 = arg0.field2022;
        }
        class309.method2066(arg1, 12, arg0);
        this.field3780 = ((class54) this.field3779.field3926.field2022).field899;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V")
    public final synchronized void method734(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3780 < 0) {
                this.method1595(arg0, arg1, arg2);
                return;
            }
            if (this.field3781 + arg2 < this.field3780) {
                this.field3781 += arg2;
                this.method1595(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3780 - this.field3781;
            this.method1595(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3781 += var4;
            this.method1597();
            class54 var5 = (class54) this.field3779.method1643((byte) -77);
            synchronized (var5) {
                int var7 = var5.method375(this);
                if (var7 < 0) {
                    var5.field899 = 0;
                    this.method1593(var5);
                } else {
                    var5.field899 = var7;
                    this.method1591(var5.field2022, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
    private final void method1592(int arg0) {
        for (class194 var2 = (class194) this.field3778.method1643((byte) -119); var2 != null; var2 = (class194) this.field3778.method1642((byte) 41)) {
            var2.method723(arg0);
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public final synchronized void method723(int arg0) {
        do {
            if (this.field3780 < 0) {
                this.method1592(arg0);
                return;
            }
            if (this.field3781 + arg0 < this.field3780) {
                this.field3781 += arg0;
                this.method1592(arg0);
                return;
            }
            int var2 = this.field3780 - this.field3781;
            this.method1592(var2);
            arg0 -= var2;
            this.field3781 += var2;
            this.method1597();
            class54 var3 = (class54) this.field3779.method1643((byte) 123);
            synchronized (var3) {
                int var5 = var3.method375(this);
                if (var5 < 0) {
                    var3.field899 = 0;
                    this.method1593(var3);
                } else {
                    var3.field899 = var5;
                    this.method1591(var3.field2022, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lkm;)V")
    private final void method1593(class54 arg0) {
        arg0.method913(-3542);
        arg0.method374();
        class128 var2 = this.field3779.field3926.field2022;
        if (this.field3779.field3926 == var2) {
            this.field3780 = -1;
        } else {
            this.field3780 = ((class54) var2).field899;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lpd;)V")
    public final synchronized void method1594(class194 arg0) {
        arg0.method913(-3542);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "([III)V")
    private final void method1595(int[] arg0, int arg1, int arg2) {
        for (class194 var4 = (class194) this.field3778.method1643((byte) 103); var4 != null; var4 = (class194) this.field3778.method1642((byte) 47)) {
            var4.method1365(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Lpd;)V")
    public final synchronized void method1596(class194 arg0) {
        this.field3778.method1645(35, arg0);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Lpd;")
    public final class194 method728() {
        return (class194) this.field3778.method1643((byte) 114);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()I")
    public final int method729() {
        return 0;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()Lpd;")
    public final class194 method714() {
        return (class194) this.field3778.method1642((byte) 65);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "()V")
    private final void method1597() {
        if (this.field3781 <= 0) {
            return;
        }
        for (class54 var1 = (class54) this.field3779.method1643((byte) 109); var1 != null; var1 = (class54) this.field3779.method1642((byte) 71)) {
            var1.field899 -= this.field3781;
        }
        this.field3780 -= this.field3781;
        this.field3781 = 0;
    }
}
