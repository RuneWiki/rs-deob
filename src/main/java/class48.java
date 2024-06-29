import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class48 extends class123 {

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "Ljia;")
    private class645 field733 = new class645();

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "Ljia;")
    private class645 field734 = new class645();

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    private int field736 = 0;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    private int field735 = -1;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lri;)V", line = 9)
    public final synchronized void method350(class123 arg0) {
        this.field733.method3587(0, arg0);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 15)
    public final synchronized void method351(int arg0) {
        do {
            if (this.field735 < 0) {
                this.method358(arg0);
                return;
            }
            if (this.field736 + arg0 < this.field735) {
                this.field736 += arg0;
                this.method358(arg0);
                return;
            }
            int var2 = this.field735 - this.field736;
            this.method358(var2);
            arg0 -= var2;
            this.field736 += var2;
            this.method357();
            class140 var3 = (class140) this.field734.method3589((byte) -127);
            synchronized (var3) {
                int var5 = var3.method1143(this);
                if (var5 < 0) {
                    var3.field2373 = 0;
                    this.method359(var3);
                } else {
                    var3.field2373 = var5;
                    this.method361(var3.field2524, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lri;)V", line = 59)
    public final synchronized void method352(class123 arg0) {
        arg0.method1207(96);
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "([III)V", line = 64)
    private final void method353(int[] arg0, int arg1, int arg2) {
        for (class123 var4 = (class123) this.field733.method3589((byte) -128); var4 != null; var4 = (class123) this.field733.method3591(0)) {
            var4.method1069(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "()I", line = 76)
    public final int method354() {
        return 0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "()Lri;", line = 80)
    public final class123 method355() {
        return (class123) this.field733.method3591(0);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "([III)V", line = 88)
    public final synchronized void method356(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field735 < 0) {
                this.method353(arg0, arg1, arg2);
                return;
            }
            if (this.field736 + arg2 < this.field735) {
                this.field736 += arg2;
                this.method353(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field735 - this.field736;
            this.method353(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field736 += var4;
            this.method357();
            class140 var5 = (class140) this.field734.method3589((byte) -127);
            synchronized (var5) {
                int var7 = var5.method1143(this);
                if (var7 < 0) {
                    var5.field2373 = 0;
                    this.method359(var5);
                } else {
                    var5.field2373 = var7;
                    this.method361(var5.field2524, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "()V", line = 132)
    private final void method357() {
        if (this.field736 <= 0) {
            return;
        }
        for (class140 var1 = (class140) this.field734.method3589((byte) -128); var1 != null; var1 = (class140) this.field734.method3591(0)) {
            var1.field2373 -= this.field736;
        }
        this.field735 -= this.field736;
        this.field736 = 0;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 151)
    private final void method358(int arg0) {
        for (class123 var2 = (class123) this.field733.method3589((byte) -127); var2 != null; var2 = (class123) this.field733.method3591(0)) {
            var2.method351(arg0);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lfg;)V", line = 164)
    private final void method359(class140 arg0) {
        arg0.method1207(125);
        arg0.method1144();
        class154 var2 = this.field734.field8920.field2524;
        if (this.field734.field8920 == var2) {
            this.field735 = -1;
        } else {
            this.field735 = ((class140) var2).field2373;
        }
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "()I", line = 177)
    public final synchronized int method360() {
        return this.field733.method3595((byte) -118);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lwk;Lfg;)V", line = 180)
    private final void method361(class154 arg0, class140 arg1) {
        while (this.field734.field8920 != arg0 && ((class140) arg0).field2373 <= arg1.field2373) {
            arg0 = arg0.field2524;
        }
        class505.method2884(arg1, arg0, 127);
        this.field735 = ((class140) this.field734.field8920.field2524).field2373;
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "()Lri;", line = 190)
    public final class123 method362() {
        return (class123) this.field733.method3589((byte) -127);
    }
}
