import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class18 extends class254 {

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lmi;")
    private class12 field215 = new class12();

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lmi;")
    private class12 field216 = new class12();

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    private int field217 = 0;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    private int field218 = -1;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()Lpd;", line = 3)
    public final class254 method110() {
        return (class254) this.field215.method87((byte) -80);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lwd;)V", line = 10)
    private final void method111(class77 arg0) {
        arg0.method1054((byte) 77);
        arg0.method558();
        class154 var2 = this.field216.field162.field2636;
        if (this.field216.field162 == var2) {
            this.field218 = -1;
        } else {
            this.field218 = ((class77) var2).field1332;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpd;)V", line = 23)
    public final synchronized void method112(class254 arg0) {
        arg0.method1054((byte) 84);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([III)V", line = 31)
    public final synchronized void method113(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field218 < 0) {
                this.method117(arg0, arg1, arg2);
                return;
            }
            if (this.field217 + arg2 < this.field218) {
                this.field217 += arg2;
                this.method117(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field218 - this.field217;
            this.method117(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field217 += var4;
            this.method115();
            class77 var5 = (class77) this.field216.method83(-111);
            synchronized (var5) {
                int var7 = var5.method557(this);
                if (var7 < 0) {
                    var5.field1332 = 0;
                    this.method111(var5);
                } else {
                    var5.field1332 = var7;
                    this.method119(var5.field2636, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 85)
    public final synchronized void method114(int arg0) {
        do {
            if (this.field218 < 0) {
                this.method118(arg0);
                return;
            }
            if (this.field217 + arg0 < this.field218) {
                this.field217 += arg0;
                this.method118(arg0);
                return;
            }
            int var2 = this.field218 - this.field217;
            this.method118(var2);
            arg0 -= var2;
            this.field217 += var2;
            this.method115();
            class77 var3 = (class77) this.field216.method83(-109);
            synchronized (var3) {
                int var5 = var3.method557(this);
                if (var5 < 0) {
                    var3.field1332 = 0;
                    this.method111(var3);
                } else {
                    var3.field1332 = var5;
                    this.method119(var3.field2636, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "()V", line = 131)
    private final void method115() {
        if (this.field217 <= 0) {
            return;
        }
        for (class77 var1 = (class77) this.field216.method83(-74); var1 != null; var1 = (class77) this.field216.method87((byte) -80)) {
            var1.field1332 -= this.field217;
        }
        this.field218 -= this.field217;
        this.field217 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lpd;)V", line = 150)
    public final synchronized void method116(class254 arg0) {
        this.field215.method79(arg0, -126);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "([III)V", line = 155)
    private final void method117(int[] arg0, int arg1, int arg2) {
        for (class254 var4 = (class254) this.field215.method83(-107); var4 != null; var4 = (class254) this.field215.method87((byte) -80)) {
            var4.method1717(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 167)
    private final void method118(int arg0) {
        for (class254 var2 = (class254) this.field215.method83(-95); var2 != null; var2 = (class254) this.field215.method87((byte) -80)) {
            var2.method114(arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lkh;Lwd;)V", line = 181)
    private final void method119(class154 arg0, class77 arg1) {
        while (this.field216.field162 != arg0 && ((class77) arg0).field1332 <= arg1.field1332) {
            arg0 = arg0.field2636;
        }
        class204.method1357(arg0, arg1, -14783);
        this.field218 = ((class77) this.field216.field162.field2636).field1332;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()I", line = 189)
    public final int method120() {
        return 0;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "()Lpd;", line = 193)
    public final class254 method121() {
        return (class254) this.field215.method83(-109);
    }
}
