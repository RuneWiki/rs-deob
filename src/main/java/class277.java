import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class277 extends class228 {

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Ldg;")
    private class317 field4904 = new class317();

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Ldg;")
    private class317 field4905 = new class317();

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    private int field4906 = -1;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    private int field4907 = 0;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 9)
    private final void method1954(int arg0) {
        for (class228 var2 = (class228) this.field4904.method2248(97); var2 != null; var2 = (class228) this.field4904.method2240(1138)) {
            var2.method131(arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lad;)V", line = 18)
    private final void method1955(class128 arg0) {
        arg0.method2221(true);
        arg0.method1016();
        class314 var2 = this.field4905.field5571.field5538;
        if (this.field4905.field5571 == var2) {
            this.field4906 = -1;
        } else {
            this.field4906 = ((class128) var2).field2353;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 34)
    public final synchronized void method131(int arg0) {
        do {
            if (this.field4906 < 0) {
                this.method1954(arg0);
                return;
            }
            if (this.field4907 + arg0 < this.field4906) {
                this.field4907 += arg0;
                this.method1954(arg0);
                return;
            }
            int var2 = this.field4906 - this.field4907;
            this.method1954(var2);
            arg0 -= var2;
            this.field4907 += var2;
            this.method1958();
            class128 var3 = (class128) this.field4905.method2248(-89);
            synchronized (var3) {
                int var5 = var3.method1017(this);
                if (var5 < 0) {
                    var3.field2353 = 0;
                    this.method1955(var3);
                } else {
                    var3.field2353 = var5;
                    this.method1959(var3.field5538, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "()Lgj;", line = 81)
    public final class228 method133() {
        return (class228) this.field4904.method2240(1138);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()I", line = 84)
    public final int method102() {
        return 0;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()Lgj;", line = 87)
    public final class228 method140() {
        return (class228) this.field4904.method2248(-79);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "([III)V", line = 92)
    private final void method1956(int[] arg0, int arg1, int arg2) {
        for (class228 var4 = (class228) this.field4904.method2248(-69); var4 != null; var4 = (class228) this.field4904.method2240(1138)) {
            var4.method1651(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lgj;)V", line = 102)
    public final synchronized void method1957(class228 arg0) {
        arg0.method2221(true);
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "()V", line = 108)
    private final void method1958() {
        if (this.field4907 <= 0) {
            return;
        }
        for (class128 var1 = (class128) this.field4905.method2248(121); var1 != null; var1 = (class128) this.field4905.method2240(1138)) {
            var1.field2353 -= this.field4907;
        }
        this.field4906 -= this.field4907;
        this.field4907 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "([III)V", line = 130)
    public final synchronized void method117(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4906 < 0) {
                this.method1956(arg0, arg1, arg2);
                return;
            }
            if (this.field4907 + arg2 < this.field4906) {
                this.field4907 += arg2;
                this.method1956(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4906 - this.field4907;
            this.method1956(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4907 += var4;
            this.method1958();
            class128 var5 = (class128) this.field4905.method2248(105);
            synchronized (var5) {
                int var7 = var5.method1017(this);
                if (var7 < 0) {
                    var5.field2353 = 0;
                    this.method1955(var5);
                } else {
                    var5.field2353 = var7;
                    this.method1959(var5.field5538, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lsi;Lad;)V", line = 174)
    private final void method1959(class314 arg0, class128 arg1) {
        while (this.field4905.field5571 != arg0 && ((class128) arg0).field2353 <= arg1.field2353) {
            arg0 = arg0.field5538;
        }
        class264.method1894(arg0, arg1, 121);
        this.field4906 = ((class128) this.field4905.field5571.field5538).field2353;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lgj;)V", line = 186)
    public final synchronized void method1960(class228 arg0) {
        this.field4904.method2249(arg0, (byte) 124);
    }
}
