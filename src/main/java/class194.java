import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class194 extends class133 {

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Lsr;")
    private class167 field2499 = new class167();

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "Lsr;")
    private class167 field2500 = new class167();

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    private int field2501 = 0;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    private int field2502 = -1;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "()Lvb;", line = 6)
    public final class133 method596() {
        return (class133) this.field2499.method976((byte) -123);
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)V", line = 13)
    private final void method1107(int arg0) {
        for (class133 var2 = (class133) this.field2499.method970(12); var2 != null; var2 = (class133) this.field2499.method976((byte) -5)) {
            var2.method580(arg0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "()I", line = 22)
    public final synchronized int method1108() {
        return this.field2499.method978(120);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lpe;Lco;)V", line = 27)
    private final void method1109(class435 arg0, class78 arg1) {
        while (this.field2500.field2165 != arg0 && ((class78) arg0).field965 <= arg1.field965) {
            arg0 = arg0.field6344;
        }
        class389.method2358(arg0, -1, arg1);
        this.field2502 = ((class78) this.field2500.field2165.field6344).field965;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lvb;)V", line = 36)
    public final synchronized void method1110(class133 arg0) {
        this.field2499.method971(12, arg0);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lco;)V", line = 42)
    private final void method1111(class78 arg0) {
        arg0.method2674(true);
        arg0.method445();
        class435 var2 = this.field2500.field2165.field6344;
        if (this.field2500.field2165 == var2) {
            this.field2502 = -1;
        } else {
            this.field2502 = ((class78) var2).field965;
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "()Lvb;", line = 56)
    public final class133 method602() {
        return (class133) this.field2499.method970(12);
    }

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "()V", line = 60)
    private final void method1112() {
        if (this.field2501 <= 0) {
            return;
        }
        for (class78 var1 = (class78) this.field2500.method970(12); var1 != null; var1 = (class78) this.field2500.method976((byte) 79)) {
            var1.field965 -= this.field2501;
        }
        this.field2502 -= this.field2501;
        this.field2501 = 0;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "([III)V", line = 81)
    public final synchronized void method572(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2502 < 0) {
                this.method1113(arg0, arg1, arg2);
                return;
            }
            if (this.field2501 + arg2 < this.field2502) {
                this.field2501 += arg2;
                this.method1113(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2502 - this.field2501;
            this.method1113(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2501 += var4;
            this.method1112();
            class78 var5 = (class78) this.field2500.method970(12);
            synchronized (var5) {
                int var7 = var5.method446(this);
                if (var7 < 0) {
                    var5.field965 = 0;
                    this.method1111(var5);
                } else {
                    var5.field965 = var7;
                    this.method1109(var5.field6344, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "([III)V", line = 128)
    private final void method1113(int[] arg0, int arg1, int arg2) {
        for (class133 var4 = (class133) this.field2499.method970(12); var4 != null; var4 = (class133) this.field2499.method976((byte) -128)) {
            var4.method806(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "()I", line = 137)
    public final int method594() {
        return 0;
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V", line = 144)
    public final synchronized void method580(int arg0) {
        do {
            if (this.field2502 < 0) {
                this.method1107(arg0);
                return;
            }
            if (this.field2501 + arg0 < this.field2502) {
                this.field2501 += arg0;
                this.method1107(arg0);
                return;
            }
            int var2 = this.field2502 - this.field2501;
            this.method1107(var2);
            arg0 -= var2;
            this.field2501 += var2;
            this.method1112();
            class78 var3 = (class78) this.field2500.method970(12);
            synchronized (var3) {
                int var5 = var3.method446(this);
                if (var5 < 0) {
                    var3.field965 = 0;
                    this.method1111(var3);
                } else {
                    var3.field965 = var5;
                    this.method1109(var3.field6344, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lvb;)V", line = 195)
    public final synchronized void method1114(class133 arg0) {
        arg0.method2674(true);
    }
}
