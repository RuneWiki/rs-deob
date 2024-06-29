import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class222 extends class186 {

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Lrg;")
    private class84 field3756 = new class84();

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "Lrg;")
    private class84 field3757 = new class84();

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    private int field3758 = -1;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    private int field3759 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()Luh;")
    public final class186 method408() {
        return (class186) this.field3756.method545(104);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lii;)V")
    private final void method1421(class28 arg0) {
        arg0.method741(3);
        arg0.method167();
        class103 var2 = this.field3757.field1362.field1716;
        if (this.field3757.field1362 == var2) {
            this.field3758 = -1;
        } else {
            this.field3758 = ((class28) var2).field432;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "([III)V")
    public final synchronized void method425(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3758 < 0) {
                this.method1425(arg0, arg1, arg2);
                return;
            }
            if (this.field3759 + arg2 < this.field3758) {
                this.field3759 += arg2;
                this.method1425(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3758 - this.field3759;
            this.method1425(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3759 += var4;
            this.method1423();
            class28 var5 = (class28) this.field3757.method550(-48);
            synchronized (var5) {
                int var7 = var5.method168(this);
                if (var7 < 0) {
                    var5.field432 = 0;
                    this.method1421(var5);
                } else {
                    var5.field432 = var7;
                    this.method1424(var5.field1716, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Luh;)V")
    public final synchronized void method1422(class186 arg0) {
        this.field3756.method558((byte) 127, arg0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()Luh;")
    public final class186 method414() {
        return (class186) this.field3756.method550(-108);
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public final synchronized void method404(int arg0) {
        do {
            if (this.field3758 < 0) {
                this.method1427(arg0);
                return;
            }
            if (this.field3759 + arg0 < this.field3758) {
                this.field3759 += arg0;
                this.method1427(arg0);
                return;
            }
            int var2 = this.field3758 - this.field3759;
            this.method1427(var2);
            arg0 -= var2;
            this.field3759 += var2;
            this.method1423();
            class28 var3 = (class28) this.field3757.method550(-105);
            synchronized (var3) {
                int var5 = var3.method168(this);
                if (var5 < 0) {
                    var3.field432 = 0;
                    this.method1421(var3);
                } else {
                    var3.field432 = var5;
                    this.method1424(var3.field1716, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "()V")
    private final void method1423() {
        if (this.field3759 <= 0) {
            return;
        }
        for (class28 var1 = (class28) this.field3757.method550(-125); var1 != null; var1 = (class28) this.field3757.method545(104)) {
            var1.field432 -= this.field3759;
        }
        this.field3758 -= this.field3759;
        this.field3759 = 0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lki;Lii;)V")
    private final void method1424(class103 arg0, class28 arg1) {
        while (this.field3757.field1362 != arg0 && ((class28) arg0).field432 <= arg1.field432) {
            arg0 = arg0.field1716;
        }
        class84.method553(arg0, arg1, (byte) 118);
        this.field3758 = ((class28) this.field3757.field1362.field1716).field432;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "([III)V")
    private final void method1425(int[] arg0, int arg1, int arg2) {
        for (class186 var4 = (class186) this.field3756.method550(-72); var4 != null; var4 = (class186) this.field3756.method545(104)) {
            var4.method1235(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()I")
    public final int method395() {
        return 0;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Luh;)V")
    public final synchronized void method1426(class186 arg0) {
        arg0.method741(3);
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    private final void method1427(int arg0) {
        for (class186 var2 = (class186) this.field3756.method550(-20); var2 != null; var2 = (class186) this.field3756.method545(104)) {
            var2.method404(arg0);
        }
    }
}
