import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class393 extends class184 {

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Lki;")
    private class364 field5018 = new class364();

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Lki;")
    private class364 field5019 = new class364();

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    private int field5020 = 0;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    private int field5021 = -1;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)V", line = 7)
    public final synchronized void method1010(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5021 < 0) {
                this.method2241(arg0, arg1, arg2);
                return;
            }
            if (this.field5020 + arg2 < this.field5021) {
                this.field5020 += arg2;
                this.method2241(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5021 - this.field5020;
            this.method2241(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5020 += var4;
            this.method2243();
            class115 var5 = (class115) this.field5019.method2090(true);
            synchronized (var5) {
                int var7 = var5.method867(this);
                if (var7 < 0) {
                    var5.field1490 = 0;
                    this.method2237(var5);
                } else {
                    var5.field1490 = var7;
                    this.method2239(var5.field5500, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lega;)V", line = 51)
    public final synchronized void method2236(class184 arg0) {
        arg0.method2438((byte) 116);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Leda;)V", line = 55)
    private final void method2237(class115 arg0) {
        arg0.method2438((byte) -127);
        arg0.method866();
        class424 var2 = this.field5019.field4702.field5500;
        if (this.field5019.field4702 == var2) {
            this.field5021 = -1;
        } else {
            this.field5021 = ((class115) var2).field1490;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()I", line = 69)
    public final int method1022() {
        return 0;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()Lega;", line = 72)
    public final class184 method997() {
        return (class184) this.field5018.method2090(true);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 82)
    private final void method2238(int arg0) {
        for (class184 var2 = (class184) this.field5018.method2090(true); var2 != null; var2 = (class184) this.field5018.method2088(-152)) {
            var2.method1020(arg0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lfaa;Leda;)V", line = 92)
    private final void method2239(class424 arg0, class115 arg1) {
        while (this.field5019.field4702 != arg0 && ((class115) arg0).field1490 <= arg1.field1490) {
            arg0 = arg0.field5500;
        }
        class481.method2657(0, arg0, arg1);
        this.field5021 = ((class115) this.field5019.field4702.field5500).field1490;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lega;)V", line = 101)
    public final synchronized void method2240(class184 arg0) {
        this.field5018.method2082((byte) -117, arg0);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "([III)V", line = 106)
    private final void method2241(int[] arg0, int arg1, int arg2) {
        for (class184 var4 = (class184) this.field5018.method2090(true); var4 != null; var4 = (class184) this.field5018.method2088(-152)) {
            var4.method1232(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 119)
    public final synchronized void method1020(int arg0) {
        do {
            if (this.field5021 < 0) {
                this.method2238(arg0);
                return;
            }
            if (this.field5020 + arg0 < this.field5021) {
                this.field5020 += arg0;
                this.method2238(arg0);
                return;
            }
            int var2 = this.field5021 - this.field5020;
            this.method2238(var2);
            arg0 -= var2;
            this.field5020 += var2;
            this.method2243();
            class115 var3 = (class115) this.field5019.method2090(true);
            synchronized (var3) {
                int var5 = var3.method867(this);
                if (var5 < 0) {
                    var3.field1490 = 0;
                    this.method2237(var3);
                } else {
                    var3.field1490 = var5;
                    this.method2239(var3.field5500, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()Lega;", line = 164)
    public final class184 method1005() {
        return (class184) this.field5018.method2088(-152);
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "()I", line = 177)
    public final synchronized int method2242() {
        return this.field5018.method2094((byte) -66);
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "()V", line = 181)
    private final void method2243() {
        if (this.field5020 <= 0) {
            return;
        }
        for (class115 var1 = (class115) this.field5019.method2090(true); var1 != null; var1 = (class115) this.field5019.method2088(-152)) {
            var1.field1490 -= this.field5020;
        }
        this.field5021 -= this.field5020;
        this.field5020 = 0;
    }
}
