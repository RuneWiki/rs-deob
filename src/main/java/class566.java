import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class566 extends class528 {

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ltf;")
    private class524 field8253 = new class524();

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Ltf;")
    private class524 field8254 = new class524();

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    private int field8256 = -1;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    private int field8255 = 0;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "([III)V", line = 7)
    public final synchronized void method927(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field8256 < 0) {
                this.method4228(arg0, arg1, arg2);
                return;
            }
            if (this.field8255 + arg2 < this.field8256) {
                this.field8255 += arg2;
                this.method4228(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field8256 - this.field8255;
            this.method4228(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field8255 += var4;
            this.method4226();
            class148 var5 = (class148) this.field8254.method3977((byte) -92);
            synchronized (var5) {
                int var7 = var5.method1268(this);
                if (var7 < 0) {
                    var5.field1897 = 0;
                    this.method4225(var5);
                } else {
                    var5.field1897 = var7;
                    this.method4231(var5.field8373, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 54)
    public final synchronized void method937(int arg0) {
        do {
            if (this.field8256 < 0) {
                this.method4229(arg0);
                return;
            }
            if (this.field8255 + arg0 < this.field8256) {
                this.field8255 += arg0;
                this.method4229(arg0);
                return;
            }
            int var2 = this.field8256 - this.field8255;
            this.method4229(var2);
            arg0 -= var2;
            this.field8255 += var2;
            this.method4226();
            class148 var3 = (class148) this.field8254.method3977((byte) -85);
            synchronized (var3) {
                int var5 = var3.method1268(this);
                if (var5 < 0) {
                    var3.field1897 = 0;
                    this.method4225(var3);
                } else {
                    var3.field1897 = var5;
                    this.method4231(var3.field8373, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lma;)V", line = 98)
    private final void method4225(class148 arg0) {
        arg0.method4294(0);
        arg0.method1269();
        class578 var2 = this.field8254.field7630.field8373;
        if (this.field8254.field7630 == var2) {
            this.field8256 = -1;
        } else {
            this.field8256 = ((class148) var2).field1897;
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()V", line = 116)
    private final void method4226() {
        if (this.field8255 <= 0) {
            return;
        }
        for (class148 var1 = (class148) this.field8254.method3977((byte) -61); var1 != null; var1 = (class148) this.field8254.method3987(0)) {
            var1.field1897 -= this.field8255;
        }
        this.field8256 -= this.field8255;
        this.field8255 = 0;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()I", line = 133)
    public final synchronized int method4227() {
        return this.field8253.method3981(0);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "([III)V", line = 142)
    private final void method4228(int[] arg0, int arg1, int arg2) {
        for (class528 var4 = (class528) this.field8253.method3977((byte) -103); var4 != null; var4 = (class528) this.field8253.method3987(0)) {
            var4.method4006(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()Ljn;", line = 153)
    public final class528 method931() {
        return (class528) this.field8253.method3977((byte) -39);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 160)
    private final void method4229(int arg0) {
        for (class528 var2 = (class528) this.field8253.method3977((byte) -76); var2 != null; var2 = (class528) this.field8253.method3987(0)) {
            var2.method937(arg0);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljn;)V", line = 171)
    public final synchronized void method4230(class528 arg0) {
        this.field8253.method3983(81, arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lwb;Lma;)V", line = 174)
    private final void method4231(class578 arg0, class148 arg1) {
        while (this.field8254.field7630 != arg0 && ((class148) arg0).field1897 <= arg1.field1897) {
            arg0 = arg0.field8373;
        }
        class438.method3415(arg0, arg1, (byte) -63);
        this.field8256 = ((class148) this.field8254.field7630.field8373).field1897;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()Ljn;", line = 183)
    public final class528 method919() {
        return (class528) this.field8253.method3987(0);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Ljn;)V", line = 187)
    public final synchronized void method4232(class528 arg0) {
        arg0.method4294(0);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()I", line = 200)
    public final int method917() {
        return 0;
    }
}
