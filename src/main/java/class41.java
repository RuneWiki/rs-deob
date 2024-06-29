import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class41 extends class73 {

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "Lbu;")
    private class19 field482 = new class19();

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "Lbu;")
    private class19 field483 = new class19();

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    private int field485 = -1;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    private int field484 = 0;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "()Lkca;", line = 4)
    public final class73 method256() {
        return (class73) this.field482.method124((byte) 42);
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "()Lkca;", line = 12)
    public final class73 method257() {
        return (class73) this.field482.method120(-125);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lkca;)V", line = 15)
    public final synchronized void method258(class73 arg0) {
        arg0.method2457(-8422);
    }

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "()I", line = 18)
    public final synchronized int method259() {
        return this.field482.method127(0);
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "([III)V", line = 23)
    private final void method260(int[] arg0, int arg1, int arg2) {
        for (class73 var4 = (class73) this.field482.method124((byte) 42); var4 != null; var4 = (class73) this.field482.method120(114)) {
            var4.method587(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lkp;Lhb;)V", line = 32)
    private final void method261(class417 arg0, class620 arg1) {
        while (this.field483.field179 != arg0 && ((class620) arg0).field9148 <= arg1.field9148) {
            arg0 = arg0.field5645;
        }
        class232.method1490(arg0, arg1, 35);
        this.field485 = ((class620) this.field483.field179.field5645).field9148;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "([III)V", line = 51)
    public final synchronized void method262(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field485 < 0) {
                this.method260(arg0, arg1, arg2);
                return;
            }
            if (this.field484 + arg2 < this.field485) {
                this.field484 += arg2;
                this.method260(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field485 - this.field484;
            this.method260(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field484 += var4;
            this.method266();
            class620 var5 = (class620) this.field483.method124((byte) 42);
            synchronized (var5) {
                int var7 = var5.method3626(this);
                if (var7 < 0) {
                    var5.field9148 = 0;
                    this.method264(var5);
                } else {
                    var5.field9148 = var7;
                    this.method261(var5.field5645, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 99)
    public final synchronized void method263(int arg0) {
        do {
            if (this.field485 < 0) {
                this.method268(arg0);
                return;
            }
            if (this.field484 + arg0 < this.field485) {
                this.field484 += arg0;
                this.method268(arg0);
                return;
            }
            int var2 = this.field485 - this.field484;
            this.method268(var2);
            arg0 -= var2;
            this.field484 += var2;
            this.method266();
            class620 var3 = (class620) this.field483.method124((byte) 42);
            synchronized (var3) {
                int var5 = var3.method3626(this);
                if (var5 < 0) {
                    var3.field9148 = 0;
                    this.method264(var3);
                } else {
                    var3.field9148 = var5;
                    this.method261(var3.field5645, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lhb;)V", line = 144)
    private final void method264(class620 arg0) {
        arg0.method2457(-8422);
        arg0.method3627();
        class417 var2 = this.field483.field179.field5645;
        if (this.field483.field179 == var2) {
            this.field485 = -1;
        } else {
            this.field485 = ((class620) var2).field9148;
        }
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "()I", line = 157)
    public final int method265() {
        return 0;
    }

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "()V", line = 160)
    private final void method266() {
        if (this.field484 <= 0) {
            return;
        }
        for (class620 var1 = (class620) this.field483.method124((byte) 42); var1 != null; var1 = (class620) this.field483.method120(-84)) {
            var1.field9148 -= this.field484;
        }
        this.field485 -= this.field484;
        this.field484 = 0;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(Lkca;)V", line = 186)
    public final synchronized void method267(class73 arg0) {
        this.field482.method123(-1, arg0);
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V", line = 192)
    private final void method268(int arg0) {
        for (class73 var2 = (class73) this.field482.method124((byte) 42); var2 != null; var2 = (class73) this.field482.method120(127)) {
            var2.method263(arg0);
        }
    }
}
