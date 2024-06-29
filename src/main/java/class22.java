import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class22 extends class264 {

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Lhh;")
    private class169 field309 = new class169();

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Lhh;")
    private class169 field310 = new class169();

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    private int field311 = 0;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    private int field312 = -1;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([III)V", line = 7)
    public final synchronized void method116(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field312 < 0) {
                this.method123(arg0, arg1, arg2);
                return;
            }
            if (this.field311 + arg2 < this.field312) {
                this.field311 += arg2;
                this.method123(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field312 - this.field311;
            this.method123(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field311 += var4;
            this.method121();
            class305 var5 = (class305) this.field310.method1240(3);
            synchronized (var5) {
                int var7 = var5.method2171(this);
                if (var7 < 0) {
                    var5.field4778 = 0;
                    this.method124(var5);
                } else {
                    var5.field4778 = var7;
                    this.method122(var5.field2747, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V", line = 53)
    private final void method117(int arg0) {
        for (class264 var2 = (class264) this.field309.method1240(3); var2 != null; var2 = (class264) this.field309.method1235(false)) {
            var2.method127(arg0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lsm;)V", line = 63)
    public final synchronized void method118(class264 arg0) {
        arg0.method1212((byte) 107);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()Lsm;", line = 68)
    public final class264 method119() {
        return (class264) this.field309.method1240(3);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Lsm;)V", line = 76)
    public final synchronized void method120(class264 arg0) {
        this.field309.method1231(-45, arg0);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "()V", line = 83)
    private final void method121() {
        if (this.field311 <= 0) {
            return;
        }
        for (class305 var1 = (class305) this.field310.method1240(3); var1 != null; var1 = (class305) this.field310.method1235(false)) {
            var1.field4778 -= this.field311;
        }
        this.field312 -= this.field311;
        this.field311 = 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ltf;Lhb;)V", line = 102)
    private final void method122(class165 arg0, class305 arg1) {
        while (this.field310.field2793 != arg0 && ((class305) arg0).field4778 <= arg1.field4778) {
            arg0 = arg0.field2747;
        }
        class289.method2072(arg0, arg1, (byte) 26);
        this.field312 = ((class305) this.field310.field2793.field2747).field4778;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "([III)V", line = 113)
    private final void method123(int[] arg0, int arg1, int arg2) {
        for (class264 var4 = (class264) this.field309.method1240(3); var4 != null; var4 = (class264) this.field309.method1235(false)) {
            var4.method1887(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lhb;)V", line = 124)
    private final void method124(class305 arg0) {
        arg0.method1212((byte) 113);
        arg0.method2172();
        class165 var2 = this.field310.field2793.field2747;
        if (this.field310.field2793 == var2) {
            this.field312 = -1;
        } else {
            this.field312 = ((class305) var2).field4778;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()Lsm;", line = 138)
    public final class264 method125() {
        return (class264) this.field309.method1235(false);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()I", line = 142)
    public final int method126() {
        return 0;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 148)
    public final synchronized void method127(int arg0) {
        do {
            if (this.field312 < 0) {
                this.method117(arg0);
                return;
            }
            if (this.field311 + arg0 < this.field312) {
                this.field311 += arg0;
                this.method117(arg0);
                return;
            }
            int var2 = this.field312 - this.field311;
            this.method117(var2);
            arg0 -= var2;
            this.field311 += var2;
            this.method121();
            class305 var3 = (class305) this.field310.method1240(3);
            synchronized (var3) {
                int var5 = var3.method2171(this);
                if (var5 < 0) {
                    var3.field4778 = 0;
                    this.method124(var3);
                } else {
                    var3.field4778 = var5;
                    this.method122(var3.field2747, var3);
                }
            }
        } while (arg0 != 0);
    }
}
