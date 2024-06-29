import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class249 extends class463 {

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lws;")
    private class333 field3204 = new class333();

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Lws;")
    private class333 field3205 = new class333();

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    private int field3207 = -1;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    private int field3206 = 0;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lmi;)V", line = 7)
    public final synchronized void method1485(class463 arg0) {
        this.field3204.method1907(30081, arg0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 15)
    public final synchronized void method1486(int arg0) {
        do {
            if (this.field3207 < 0) {
                this.method1494(arg0);
                return;
            }
            if (this.field3206 + arg0 < this.field3207) {
                this.field3206 += arg0;
                this.method1494(arg0);
                return;
            }
            int var2 = this.field3207 - this.field3206;
            this.method1494(var2);
            arg0 -= var2;
            this.field3206 += var2;
            this.method1491();
            class412 var3 = (class412) this.field3205.method1909(true);
            synchronized (var3) {
                int var5 = var3.method2308(this);
                if (var5 < 0) {
                    var3.field5284 = 0;
                    this.method1492(var3);
                } else {
                    var3.field5284 = var5;
                    this.method1497(var3.field3320, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()Lmi;", line = 59)
    public final class463 method1487() {
        return (class463) this.field3204.method1916((byte) 96);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "()I", line = 63)
    public final synchronized int method1488() {
        return this.field3204.method1912(16);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lmi;)V", line = 66)
    public final synchronized void method1489(class463 arg0) {
        arg0.method1566(-48);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "([III)V", line = 71)
    private final void method1490(int[] arg0, int arg1, int arg2) {
        for (class463 var4 = (class463) this.field3204.method1909(true); var4 != null; var4 = (class463) this.field3204.method1916((byte) 110)) {
            var4.method2535(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "()V", line = 80)
    private final void method1491() {
        if (this.field3206 <= 0) {
            return;
        }
        for (class412 var1 = (class412) this.field3205.method1909(true); var1 != null; var1 = (class412) this.field3205.method1916((byte) 110)) {
            var1.field5284 -= this.field3206;
        }
        this.field3207 -= this.field3206;
        this.field3206 = 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lbn;)V", line = 99)
    private final void method1492(class412 arg0) {
        arg0.method1566(-73);
        arg0.method2309();
        class263 var2 = this.field3205.field4121.field3320;
        if (this.field3205.field4121 == var2) {
            this.field3207 = -1;
        } else {
            this.field3207 = ((class412) var2).field5284;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([III)V", line = 118)
    public final synchronized void method1493(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3207 < 0) {
                this.method1490(arg0, arg1, arg2);
                return;
            }
            if (this.field3206 + arg2 < this.field3207) {
                this.field3206 += arg2;
                this.method1490(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3207 - this.field3206;
            this.method1490(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3206 += var4;
            this.method1491();
            class412 var5 = (class412) this.field3205.method1909(true);
            synchronized (var5) {
                int var7 = var5.method2308(this);
                if (var7 < 0) {
                    var5.field5284 = 0;
                    this.method1492(var5);
                } else {
                    var5.field5284 = var7;
                    this.method1497(var5.field3320, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 164)
    private final void method1494(int arg0) {
        for (class463 var2 = (class463) this.field3204.method1909(true); var2 != null; var2 = (class463) this.field3204.method1916((byte) 93)) {
            var2.method1486(arg0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()I", line = 180)
    public final int method1495() {
        return 0;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()Lmi;", line = 185)
    public final class463 method1496() {
        return (class463) this.field3204.method1909(true);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lkd;Lbn;)V", line = 202)
    private final void method1497(class263 arg0, class412 arg1) {
        while (this.field3205.field4121 != arg0 && ((class412) arg0).field5284 <= arg1.field5284) {
            arg0 = arg0.field3320;
        }
        class628.method3510(36, arg1, arg0);
        this.field3207 = ((class412) this.field3205.field4121.field3320).field5284;
    }
}
