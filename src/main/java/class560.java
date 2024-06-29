import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class560 extends class97 {

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Lifa;")
    private class450 field7761 = new class450();

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "Lifa;")
    private class450 field7762 = new class450();

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    private int field7763 = 0;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    private int field7764 = -1;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Loq;Lkea;)V")
    private final void method3255(class379 arg0, class252 arg1) {
        while (this.field7762.field6367 != arg0 && ((class252) arg0).field2950 <= arg1.field2950) {
            arg0 = arg0.field4806;
        }
        class413.method2464(arg0, arg1, 4096);
        this.field7764 = ((class252) this.field7762.field6367.field4806).field2950;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "([III)V")
    private final void method3256(int[] arg0, int arg1, int arg2) {
        for (class97 var4 = (class97) this.field7761.method2725(37); var4 != null; var4 = (class97) this.field7761.method2726(-113)) {
            var4.method841(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Loia;)V")
    public final synchronized void method3257(class97 arg0) {
        arg0.method2219(13630);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public final synchronized void method751(int arg0) {
        do {
            if (this.field7764 < 0) {
                this.method3259(arg0);
                return;
            }
            if (this.field7763 + arg0 < this.field7764) {
                this.field7763 += arg0;
                this.method3259(arg0);
                return;
            }
            int var2 = this.field7764 - this.field7763;
            this.method3259(var2);
            arg0 -= var2;
            this.field7763 += var2;
            this.method3261();
            class252 var3 = (class252) this.field7762.method2725(37);
            synchronized (var3) {
                int var5 = var3.method1502(this);
                if (var5 < 0) {
                    var3.field2950 = 0;
                    this.method3262(var3);
                } else {
                    var3.field2950 = var5;
                    this.method3255(var3.field4806, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(Loia;)V")
    public final synchronized void method3258(class97 arg0) {
        this.field7761.method2727(arg0, -98);
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "()Loia;")
    public final class97 method763() {
        return (class97) this.field7761.method2726(-116);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "()I")
    public final int method752() {
        return 0;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "()Loia;")
    public final class97 method745() {
        return (class97) this.field7761.method2725(37);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
    private final void method3259(int arg0) {
        for (class97 var2 = (class97) this.field7761.method2725(37); var2 != null; var2 = (class97) this.field7761.method2726(-122)) {
            var2.method751(arg0);
        }
    }

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "()I")
    public final synchronized int method3260() {
        return this.field7761.method2736(-12418);
    }

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "()V")
    private final void method3261() {
        if (this.field7763 <= 0) {
            return;
        }
        for (class252 var1 = (class252) this.field7762.method2725(37); var1 != null; var1 = (class252) this.field7762.method2726(-116)) {
            var1.field2950 -= this.field7763;
        }
        this.field7764 -= this.field7763;
        this.field7763 = 0;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "([III)V")
    public final synchronized void method760(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field7764 < 0) {
                this.method3256(arg0, arg1, arg2);
                return;
            }
            if (this.field7763 + arg2 < this.field7764) {
                this.field7763 += arg2;
                this.method3256(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field7764 - this.field7763;
            this.method3256(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field7763 += var4;
            this.method3261();
            class252 var5 = (class252) this.field7762.method2725(37);
            synchronized (var5) {
                int var7 = var5.method1502(this);
                if (var7 < 0) {
                    var5.field2950 = 0;
                    this.method3262(var5);
                } else {
                    var5.field2950 = var7;
                    this.method3255(var5.field4806, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lkea;)V")
    private final void method3262(class252 arg0) {
        arg0.method2219(13630);
        arg0.method1503();
        class379 var2 = this.field7762.field6367.field4806;
        if (this.field7762.field6367 == var2) {
            this.field7764 = -1;
        } else {
            this.field7764 = ((class252) var2).field2950;
        }
    }
}
