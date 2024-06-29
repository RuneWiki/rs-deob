import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class314 extends class40 {

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Laj;")
    private class1 field5413 = new class1();

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Laj;")
    private class1 field5414 = new class1();

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    private int field5416 = 0;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    private int field5415 = -1;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()Lec;", line = 5)
    public final class40 method270() {
        return (class40) this.field5413.method13(0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Luc;)V", line = 8)
    private final void method2185(class192 arg0) {
        arg0.method1325(0);
        arg0.method1360();
        class184 var2 = this.field5414.field8.field3373;
        if (this.field5414.field8 == var2) {
            this.field5415 = -1;
        } else {
            this.field5415 = ((class192) var2).field3478;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lec;)V", line = 21)
    public final synchronized void method2186(class40 arg0) {
        arg0.method1325(0);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V", line = 26)
    private final void method2187(int arg0) {
        for (class40 var2 = (class40) this.field5413.method13(0); var2 != null; var2 = (class40) this.field5413.method15((byte) 47)) {
            var2.method272(arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "()Lec;", line = 39)
    public final class40 method276() {
        return (class40) this.field5413.method15((byte) 47);
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "()V", line = 42)
    private final void method2188() {
        if (this.field5416 <= 0) {
            return;
        }
        for (class192 var1 = (class192) this.field5414.method13(0); var1 != null; var1 = (class192) this.field5414.method15((byte) 47)) {
            var1.field3478 -= this.field5416;
        }
        this.field5415 -= this.field5416;
        this.field5416 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 62)
    public final synchronized void method272(int arg0) {
        do {
            if (this.field5415 < 0) {
                this.method2187(arg0);
                return;
            }
            if (this.field5416 + arg0 < this.field5415) {
                this.field5416 += arg0;
                this.method2187(arg0);
                return;
            }
            int var2 = this.field5415 - this.field5416;
            this.method2187(var2);
            arg0 -= var2;
            this.field5416 += var2;
            this.method2188();
            class192 var3 = (class192) this.field5414.method13(0);
            synchronized (var3) {
                int var5 = var3.method1361(this);
                if (var5 < 0) {
                    var3.field3478 = 0;
                    this.method2185(var3);
                } else {
                    var3.field3478 = var5;
                    this.method2190(var3.field3373, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "([III)V", line = 108)
    private final void method2189(int[] arg0, int arg1, int arg2) {
        for (class40 var4 = (class40) this.field5413.method13(0); var4 != null; var4 = (class40) this.field5413.method15((byte) 47)) {
            var4.method273(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "()I", line = 118)
    public final int method275() {
        return 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lmc;Luc;)V", line = 123)
    private final void method2190(class184 arg0, class192 arg1) {
        while (this.field5414.field8 != arg0 && ((class192) arg0).field3478 <= arg1.field3478) {
            arg0 = arg0.field3373;
        }
        class185.method1333(arg1, (byte) 59, arg0);
        this.field5415 = ((class192) this.field5414.field8.field3373).field3478;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Lec;)V", line = 133)
    public final synchronized void method2191(class40 arg0) {
        this.field5413.method14((byte) 75, arg0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([III)V", line = 143)
    public final synchronized void method271(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5415 < 0) {
                this.method2189(arg0, arg1, arg2);
                return;
            }
            if (this.field5416 + arg2 < this.field5415) {
                this.field5416 += arg2;
                this.method2189(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5415 - this.field5416;
            this.method2189(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5416 += var4;
            this.method2188();
            class192 var5 = (class192) this.field5414.method13(0);
            synchronized (var5) {
                int var7 = var5.method1361(this);
                if (var7 < 0) {
                    var5.field3478 = 0;
                    this.method2185(var5);
                } else {
                    var5.field3478 = var7;
                    this.method2190(var5.field3373, var5);
                }
            }
        } while (arg2 != 0);
    }
}
