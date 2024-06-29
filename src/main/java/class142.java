import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class142 extends class71 {

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Ljd;")
    private class66 field3230 = new class66();

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Ljd;")
    private class66 field3231 = new class66();

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    private int field3233 = 0;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    private int field3232 = -1;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "([III)V")
    private final void method1101(int[] arg0, int arg1, int arg2) {
        for (class71 var4 = (class71) this.field3230.method496(10153); var4 != null; var4 = (class71) this.field3230.method500(-1)) {
            var4.method545(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final synchronized void method104(int arg0) {
        do {
            if (this.field3232 < 0) {
                this.method1102(arg0);
                return;
            }
            if (this.field3233 + arg0 < this.field3232) {
                this.field3233 += arg0;
                this.method1102(arg0);
                return;
            }
            int var2 = this.field3232 - this.field3233;
            this.method1102(var2);
            arg0 -= var2;
            this.field3233 += var2;
            this.method1105();
            class110 var3 = (class110) this.field3231.method496(10153);
            synchronized (var3) {
                int var5 = var3.method895(this);
                if (var5 < 0) {
                    var3.field2663 = 0;
                    this.method1107(var3);
                } else {
                    var3.field2663 = var5;
                    this.method1103(var3.field2920, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()Lkb;")
    public final class71 method87() {
        return (class71) this.field3230.method496(10153);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()Lkb;")
    public final class71 method109() {
        return (class71) this.field3230.method500(-1);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    private final void method1102(int arg0) {
        for (class71 var2 = (class71) this.field3230.method496(10153); var2 != null; var2 = (class71) this.field3230.method500(-1)) {
            var2.method104(arg0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()I")
    public final int method113() {
        return 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lsc;Lpf;)V")
    private final void method1103(class128 arg0, class110 arg1) {
        while (this.field3231.field1623 != arg0 && ((class110) arg0).field2663 <= arg1.field2663) {
            arg0 = arg0.field2920;
        }
        this.field3231.method497(arg0, (byte) -83, arg1);
        this.field3232 = ((class110) this.field3231.field1623.field2920).field2663;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lkb;)V")
    public final synchronized void method1104(class71 arg0) {
        arg0.method1009((byte) 82);
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
    private final void method1105() {
        if (this.field3233 <= 0) {
            return;
        }
        for (class110 var1 = (class110) this.field3231.method496(10153); var1 != null; var1 = (class110) this.field3231.method500(-1)) {
            var1.field2663 -= this.field3233;
        }
        this.field3232 -= this.field3233;
        this.field3233 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lkb;)V")
    public final synchronized void method1106(class71 arg0) {
        this.field3230.method505(arg0, 10);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "([III)V")
    public final synchronized void method120(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3232 < 0) {
                this.method1101(arg0, arg1, arg2);
                return;
            }
            if (this.field3233 + arg2 < this.field3232) {
                this.field3233 += arg2;
                this.method1101(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3232 - this.field3233;
            this.method1101(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3233 += var4;
            this.method1105();
            class110 var5 = (class110) this.field3231.method496(10153);
            synchronized (var5) {
                int var7 = var5.method895(this);
                if (var7 < 0) {
                    var5.field2663 = 0;
                    this.method1107(var5);
                } else {
                    var5.field2663 = var7;
                    this.method1103(var5.field2920, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lpf;)V")
    private final void method1107(class110 arg0) {
        arg0.method1009((byte) 71);
        arg0.method896();
        class128 var2 = this.field3231.field1623.field2920;
        if (this.field3231.field1623 == var2) {
            this.field3232 = -1;
        } else {
            this.field3232 = ((class110) var2).field2663;
        }
    }
}
