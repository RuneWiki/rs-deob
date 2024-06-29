import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class86 extends class266 {

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Ljg;")
    private class303 field1618 = new class303();

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Ljg;")
    private class303 field1619 = new class303();

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    private int field1620 = 0;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    private int field1621 = -1;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()Lvg;", line = 4)
    public final class266 method611() {
        return (class266) this.field1618.method2078(-119);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()I", line = 11)
    public final int method612() {
        return 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lvg;)V", line = 14)
    public final synchronized void method613(class266 arg0) {
        arg0.method1747((byte) -111);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "([III)V", line = 19)
    private final void method614(int[] arg0, int arg1, int arg2) {
        for (class266 var4 = (class266) this.field1618.method2078(-93); var4 != null; var4 = (class266) this.field1618.method2080(5)) {
            var4.method1877(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 32)
    private final void method615(int arg0) {
        for (class266 var2 = (class266) this.field1618.method2078(-101); var2 != null; var2 = (class266) this.field1618.method2080(5)) {
            var2.method618(arg0);
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "()V", line = 41)
    private final void method616() {
        if (this.field1620 <= 0) {
            return;
        }
        for (class49 var1 = (class49) this.field1619.method2078(-108); var1 != null; var1 = (class49) this.field1619.method2080(5)) {
            var1.field881 -= this.field1620;
        }
        this.field1621 -= this.field1620;
        this.field1620 = 0;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Lvg;)V", line = 60)
    public final synchronized void method617(class266 arg0) {
        this.field1618.method2074(arg0, (byte) 52);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 67)
    public final synchronized void method618(int arg0) {
        do {
            if (this.field1621 < 0) {
                this.method615(arg0);
                return;
            }
            if (this.field1620 + arg0 < this.field1621) {
                this.field1620 += arg0;
                this.method615(arg0);
                return;
            }
            int var2 = this.field1621 - this.field1620;
            this.method615(var2);
            arg0 -= var2;
            this.field1620 += var2;
            this.method616();
            class49 var3 = (class49) this.field1619.method2078(-107);
            synchronized (var3) {
                int var5 = var3.method412(this);
                if (var5 < 0) {
                    var3.field881 = 0;
                    this.method621(var3);
                } else {
                    var3.field881 = var5;
                    this.method619(var3.field4273, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfj;Llm;)V", line = 111)
    private final void method619(class242 arg0, class49 arg1) {
        while (this.field1619.field5146 != arg0 && ((class49) arg0).field881 <= arg1.field881) {
            arg0 = arg0.field4273;
        }
        class232.method1665(arg1, 2, arg0);
        this.field1621 = ((class49) this.field1619.field5146.field4273).field881;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "()Lvg;", line = 118)
    public final class266 method620() {
        return (class266) this.field1618.method2080(5);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Llm;)V", line = 122)
    private final void method621(class49 arg0) {
        arg0.method1747((byte) -71);
        arg0.method411();
        class242 var2 = this.field1619.field5146.field4273;
        if (this.field1619.field5146 == var2) {
            this.field1621 = -1;
        } else {
            this.field1621 = ((class49) var2).field881;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([III)V", line = 143)
    public final synchronized void method622(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1621 < 0) {
                this.method614(arg0, arg1, arg2);
                return;
            }
            if (this.field1620 + arg2 < this.field1621) {
                this.field1620 += arg2;
                this.method614(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1621 - this.field1620;
            this.method614(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1620 += var4;
            this.method616();
            class49 var5 = (class49) this.field1619.method2078(-111);
            synchronized (var5) {
                int var7 = var5.method412(this);
                if (var7 < 0) {
                    var5.field881 = 0;
                    this.method621(var5);
                } else {
                    var5.field881 = var7;
                    this.method619(var5.field4273, var5);
                }
            }
        } while (arg2 != 0);
    }
}
