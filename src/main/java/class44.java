import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class44 extends class80 {

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lea;")
    private class204 field764 = new class204();

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lea;")
    private class204 field765 = new class204();

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    private int field766 = 0;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    private int field767 = -1;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lcl;)V", line = 4)
    private final void method353(class133 arg0) {
        arg0.method1701(-121);
        arg0.method1006();
        class240 var2 = this.field765.field3233.field3739;
        if (this.field765.field3233 == var2) {
            this.field767 = -1;
        } else {
            this.field767 = ((class133) var2).field2119;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lvl;)V", line = 20)
    public final synchronized void method354(class80 arg0) {
        this.field764.method1495(arg0, -1);
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 29)
    public final synchronized void method286(int arg0) {
        do {
            if (this.field767 < 0) {
                this.method357(arg0);
                return;
            }
            if (this.field766 + arg0 < this.field767) {
                this.field766 += arg0;
                this.method357(arg0);
                return;
            }
            int var2 = this.field767 - this.field766;
            this.method357(var2);
            arg0 -= var2;
            this.field766 += var2;
            this.method359();
            class133 var3 = (class133) this.field765.method1490(200);
            synchronized (var3) {
                int var5 = var3.method1005(this);
                if (var5 < 0) {
                    var3.field2119 = 0;
                    this.method353(var3);
                } else {
                    var3.field2119 = var5;
                    this.method355(var3.field3739, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lfj;Lcl;)V", line = 73)
    private final void method355(class240 arg0, class133 arg1) {
        while (this.field765.field3233 != arg0 && ((class133) arg0).field2119 <= arg1.field2119) {
            arg0 = arg0.field3739;
        }
        class217.method1574(arg0, arg1, -102);
        this.field767 = ((class133) this.field765.field3233.field3739).field2119;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "([III)V", line = 83)
    private final void method356(int[] arg0, int arg1, int arg2) {
        for (class80 var4 = (class80) this.field764.method1490(200); var4 != null; var4 = (class80) this.field764.method1487((byte) 117)) {
            var4.method584(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()I", line = 92)
    public final int method293() {
        return 0;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()Lvl;", line = 95)
    public final class80 method295() {
        return (class80) this.field764.method1490(200);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()Lvl;", line = 101)
    public final class80 method294() {
        return (class80) this.field764.method1487((byte) 117);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 110)
    private final void method357(int arg0) {
        for (class80 var2 = (class80) this.field764.method1490(200); var2 != null; var2 = (class80) this.field764.method1487((byte) 117)) {
            var2.method286(arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Lvl;)V", line = 122)
    public final synchronized void method358(class80 arg0) {
        arg0.method1701(-111);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "()V", line = 132)
    private final void method359() {
        if (this.field766 <= 0) {
            return;
        }
        for (class133 var1 = (class133) this.field765.method1490(200); var1 != null; var1 = (class133) this.field765.method1487((byte) 117)) {
            var1.field2119 -= this.field766;
        }
        this.field767 -= this.field766;
        this.field766 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)V", line = 160)
    public final synchronized void method275(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field767 < 0) {
                this.method356(arg0, arg1, arg2);
                return;
            }
            if (this.field766 + arg2 < this.field767) {
                this.field766 += arg2;
                this.method356(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field767 - this.field766;
            this.method356(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field766 += var4;
            this.method359();
            class133 var5 = (class133) this.field765.method1490(200);
            synchronized (var5) {
                int var7 = var5.method1005(this);
                if (var7 < 0) {
                    var5.field2119 = 0;
                    this.method353(var5);
                } else {
                    var5.field2119 = var7;
                    this.method355(var5.field3739, var5);
                }
            }
        } while (arg2 != 0);
    }
}
