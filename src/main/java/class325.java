import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class325 extends class162 {

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "Lll;")
    private class54 field4761 = new class54();

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "Lll;")
    private class54 field4762 = new class54();

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    private int field4763 = 0;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    private int field4764 = -1;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([III)V", line = 7)
    public final synchronized void method286(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4764 < 0) {
                this.method2249(arg0, arg1, arg2);
                return;
            }
            if (this.field4763 + arg2 < this.field4764) {
                this.field4763 += arg2;
                this.method2249(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4764 - this.field4763;
            this.method2249(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4763 += var4;
            this.method2245();
            class60 var5 = (class60) this.field4762.method413(1253231568);
            synchronized (var5) {
                int var7 = var5.method447(this);
                if (var7 < 0) {
                    var5.field760 = 0;
                    this.method2244(var5);
                } else {
                    var5.field760 = var7;
                    this.method2248(var5.field301, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lwm;)V", line = 51)
    private final void method2244(class60 arg0) {
        arg0.method179((byte) 51);
        arg0.method446();
        class26 var2 = this.field4762.field704.field301;
        if (this.field4762.field704 == var2) {
            this.field4764 = -1;
        } else {
            this.field4764 = ((class60) var2).field760;
        }
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "()V", line = 66)
    private final void method2245() {
        if (this.field4763 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field4762.method413(1253231568); var1 != null; var1 = (class60) this.field4762.method419(92)) {
            var1.field760 -= this.field4763;
        }
        this.field4764 -= this.field4763;
        this.field4763 = 0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ltf;)V", line = 86)
    public final synchronized void method2246(class162 arg0) {
        arg0.method179((byte) 51);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V", line = 95)
    public final synchronized void method282(int arg0) {
        do {
            if (this.field4764 < 0) {
                this.method2247(arg0);
                return;
            }
            if (this.field4763 + arg0 < this.field4764) {
                this.field4763 += arg0;
                this.method2247(arg0);
                return;
            }
            int var2 = this.field4764 - this.field4763;
            this.method2247(var2);
            arg0 -= var2;
            this.field4763 += var2;
            this.method2245();
            class60 var3 = (class60) this.field4762.method413(1253231568);
            synchronized (var3) {
                int var5 = var3.method447(this);
                if (var5 < 0) {
                    var3.field760 = 0;
                    this.method2244(var3);
                } else {
                    var3.field760 = var5;
                    this.method2248(var3.field301, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V", line = 146)
    private final void method2247(int arg0) {
        for (class162 var2 = (class162) this.field4761.method413(1253231568); var2 != null; var2 = (class162) this.field4761.method419(96)) {
            var2.method282(arg0);
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "()Ltf;", line = 155)
    public final class162 method285() {
        return (class162) this.field4761.method419(39);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lni;Lwm;)V", line = 158)
    private final void method2248(class26 arg0, class60 arg1) {
        while (this.field4762.field704 != arg0 && ((class60) arg0).field760 <= arg1.field760) {
            arg0 = arg0.field301;
        }
        class142.method1094(arg0, (byte) -123, arg1);
        this.field4764 = ((class60) this.field4762.field704.field301).field760;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "()I", line = 166)
    public final int method289() {
        return 0;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "([III)V", line = 171)
    private final void method2249(int[] arg0, int arg1, int arg2) {
        for (class162 var4 = (class162) this.field4761.method413(1253231568); var4 != null; var4 = (class162) this.field4761.method419(95)) {
            var4.method1231(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "()Ltf;", line = 181)
    public final class162 method284() {
        return (class162) this.field4761.method413(1253231568);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Ltf;)V", line = 191)
    public final synchronized void method2250(class162 arg0) {
        this.field4761.method410(arg0, (byte) -76);
    }
}
