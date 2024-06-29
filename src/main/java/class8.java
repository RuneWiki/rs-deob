import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 extends class120 {

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Lma;")
    private class83 field213 = new class83();

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lma;")
    private class83 field214 = new class83();

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    private int field215 = -1;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    private int field216 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([III)V")
    public final synchronized void method95(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field215 < 0) {
                this.method103(arg0, arg1, arg2);
                return;
            }
            if (this.field216 + arg2 < this.field215) {
                this.field216 += arg2;
                this.method103(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field215 - this.field216;
            this.method103(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field216 += var4;
            this.method97();
            class123 var5 = (class123) this.field214.method722(120);
            synchronized (var5) {
                int var7 = var5.method1020(this);
                if (var7 < 0) {
                    var5.field2989 = 0;
                    this.method98(var5);
                } else {
                    var5.field2989 = var7;
                    this.method99(var5.field1146, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lre;)V")
    public final synchronized void method96(class120 arg0) {
        arg0.method394((byte) -113);
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "()V")
    private final void method97() {
        if (this.field216 <= 0) {
            return;
        }
        for (class123 var1 = (class123) this.field214.method722(120); var1 != null; var1 = (class123) this.field214.method716(true)) {
            var1.field2989 -= this.field216;
        }
        this.field215 -= this.field216;
        this.field216 = 0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lsc;)V")
    private final void method98(class123 arg0) {
        arg0.method394((byte) 75);
        arg0.method1021();
        class47 var2 = this.field214.field2059.field1146;
        if (this.field214.field2059 == var2) {
            this.field215 = -1;
        } else {
            this.field215 = ((class123) var2).field2989;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lge;Lsc;)V")
    private final void method99(class47 arg0, class123 arg1) {
        while (this.field214.field2059 != arg0 && ((class123) arg0).field2989 <= arg1.field2989) {
            arg0 = arg0.field1146;
        }
        this.field214.method713(116, arg0, arg1);
        this.field215 = ((class123) this.field214.field2059.field1146).field2989;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()Lre;")
    public final class120 method100() {
        return (class120) this.field213.method722(112);
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    private final void method101(int arg0) {
        for (class120 var2 = (class120) this.field213.method722(110); var2 != null; var2 = (class120) this.field213.method716(true)) {
            var2.method105(arg0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
    public final int method102() {
        return 0;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "([III)V")
    private final void method103(int[] arg0, int arg1, int arg2) {
        for (class120 var4 = (class120) this.field213.method722(117); var4 != null; var4 = (class120) this.field213.method716(true)) {
            var4.method1007(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Lre;)V")
    public final synchronized void method104(class120 arg0) {
        this.field213.method724(arg0, 0);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public final synchronized void method105(int arg0) {
        do {
            if (this.field215 < 0) {
                this.method101(arg0);
                return;
            }
            if (this.field216 + arg0 < this.field215) {
                this.field216 += arg0;
                this.method101(arg0);
                return;
            }
            int var2 = this.field215 - this.field216;
            this.method101(var2);
            arg0 -= var2;
            this.field216 += var2;
            this.method97();
            class123 var3 = (class123) this.field214.method722(108);
            synchronized (var3) {
                int var5 = var3.method1020(this);
                if (var5 < 0) {
                    var3.field2989 = 0;
                    this.method98(var3);
                } else {
                    var3.field2989 = var5;
                    this.method99(var3.field1146, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()Lre;")
    public final class120 method106() {
        return (class120) this.field213.method716(true);
    }
}
