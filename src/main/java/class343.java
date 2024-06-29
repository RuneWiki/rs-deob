import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class343 extends class232 {

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "Lmf;")
    private class291 field5137 = new class291();

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "Lmf;")
    private class291 field5138 = new class291();

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
    private int field5139 = -1;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    private int field5140 = 0;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "()Lsc;", line = 8)
    public final class232 method627() {
        return (class232) this.field5137.method1892(116);
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "()Lsc;", line = 13)
    public final class232 method641() {
        return (class232) this.field5137.method1893((byte) -2);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lnq;)V", line = 17)
    private final void method2154(class323 arg0) {
        arg0.method1676(true);
        arg0.method2063();
        class261 var2 = this.field5138.field4458.field3972;
        if (this.field5138.field4458 == var2) {
            this.field5139 = -1;
        } else {
            this.field5139 = ((class323) var2).field4928;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "([III)V", line = 37)
    public final synchronized void method618(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5139 < 0) {
                this.method2158(arg0, arg1, arg2);
                return;
            }
            if (this.field5140 + arg2 < this.field5139) {
                this.field5140 += arg2;
                this.method2158(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5139 - this.field5140;
            this.method2158(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5140 += var4;
            this.method2156();
            class323 var5 = (class323) this.field5138.method1892(100);
            synchronized (var5) {
                int var7 = var5.method2062(this);
                if (var7 < 0) {
                    var5.field4928 = 0;
                    this.method2154(var5);
                } else {
                    var5.field4928 = var7;
                    this.method2161(var5.field3972, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 84)
    public final synchronized void method648(int arg0) {
        do {
            if (this.field5139 < 0) {
                this.method2159(arg0);
                return;
            }
            if (this.field5140 + arg0 < this.field5139) {
                this.field5140 += arg0;
                this.method2159(arg0);
                return;
            }
            int var2 = this.field5139 - this.field5140;
            this.method2159(var2);
            arg0 -= var2;
            this.field5140 += var2;
            this.method2156();
            class323 var3 = (class323) this.field5138.method1892(96);
            synchronized (var3) {
                int var5 = var3.method2062(this);
                if (var5 < 0) {
                    var3.field4928 = 0;
                    this.method2154(var3);
                } else {
                    var3.field4928 = var5;
                    this.method2161(var3.field3972, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "()I", line = 129)
    public final synchronized int method2155() {
        return this.field5137.method1886(-31340);
    }

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "()V", line = 133)
    private final void method2156() {
        if (this.field5140 <= 0) {
            return;
        }
        for (class323 var1 = (class323) this.field5138.method1892(90); var1 != null; var1 = (class323) this.field5138.method1893((byte) -2)) {
            var1.field4928 -= this.field5140;
        }
        this.field5139 -= this.field5140;
        this.field5140 = 0;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lsc;)V", line = 150)
    public final synchronized void method2157(class232 arg0) {
        arg0.method1676(true);
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "([III)V", line = 155)
    private final void method2158(int[] arg0, int arg1, int arg2) {
        for (class232 var4 = (class232) this.field5137.method1892(107); var4 != null; var4 = (class232) this.field5137.method1893((byte) -2)) {
            var4.method1533(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V", line = 167)
    private final void method2159(int arg0) {
        for (class232 var2 = (class232) this.field5137.method1892(98); var2 != null; var2 = (class232) this.field5137.method1893((byte) -2)) {
            var2.method648(arg0);
        }
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "()I", line = 176)
    public final int method639() {
        return 0;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(Lsc;)V", line = 182)
    public final synchronized void method2160(class232 arg0) {
        this.field5137.method1887((byte) 126, arg0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Les;Lnq;)V", line = 186)
    private final void method2161(class261 arg0, class323 arg1) {
        while (this.field5138.field4458 != arg0 && ((class323) arg0).field4928 <= arg1.field4928) {
            arg0 = arg0.field3972;
        }
        class520.method3082(arg1, arg0, (byte) 74);
        this.field5139 = ((class323) this.field5138.field4458.field3972).field4928;
    }
}
