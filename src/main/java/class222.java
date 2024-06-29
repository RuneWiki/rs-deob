import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class222 extends class16 {

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Ljk;")
    private class76 field3594 = new class76();

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Ljk;")
    private class76 field3595 = new class76();

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    private int field3596 = -1;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    private int field3597 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()I", line = 4)
    public final int method67() {
        return 0;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()Lrh;", line = 8)
    public final class16 method72() {
        return (class16) this.field3594.method442(65293);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lrh;)V", line = 15)
    public final synchronized void method1527(class16 arg0) {
        this.field3594.method446(arg0, -27762);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lwk;)V", line = 18)
    private final void method1528(class186 arg0) {
        arg0.method124((byte) 54);
        arg0.method1316();
        class24 var2 = this.field3595.field1013.field295;
        if (this.field3595.field1013 == var2) {
            this.field3596 = -1;
        } else {
            this.field3596 = ((class186) var2).field2953;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Llj;Lwk;)V", line = 32)
    private final void method1529(class24 arg0, class186 arg1) {
        while (this.field3595.field1013 != arg0 && ((class186) arg0).field2953 <= arg1.field2953) {
            arg0 = arg0.field295;
        }
        class45.method245(arg0, arg1, (byte) -59);
        this.field3596 = ((class186) this.field3595.field1013.field295).field2953;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 42)
    public final synchronized void method68(int arg0) {
        do {
            if (this.field3596 < 0) {
                this.method1532(arg0);
                return;
            }
            if (this.field3597 + arg0 < this.field3596) {
                this.field3597 += arg0;
                this.method1532(arg0);
                return;
            }
            int var2 = this.field3596 - this.field3597;
            this.method1532(var2);
            arg0 -= var2;
            this.field3597 += var2;
            this.method1530();
            class186 var3 = (class186) this.field3595.method442(65293);
            synchronized (var3) {
                int var5 = var3.method1315(this);
                if (var5 < 0) {
                    var3.field2953 = 0;
                    this.method1528(var3);
                } else {
                    var3.field2953 = var5;
                    this.method1529(var3.field295, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "()V", line = 86)
    private final void method1530() {
        if (this.field3597 <= 0) {
            return;
        }
        for (class186 var1 = (class186) this.field3595.method442(65293); var1 != null; var1 = (class186) this.field3595.method440(3)) {
            var1.field2953 -= this.field3597;
        }
        this.field3596 -= this.field3597;
        this.field3597 = 0;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "([III)V", line = 107)
    private final void method1531(int[] arg0, int arg1, int arg2) {
        for (class16 var4 = (class16) this.field3594.method442(65293); var4 != null; var4 = (class16) this.field3594.method440(3)) {
            var4.method70(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()Lrh;", line = 118)
    public final class16 method71() {
        return (class16) this.field3594.method440(3);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 126)
    private final void method1532(int arg0) {
        for (class16 var2 = (class16) this.field3594.method442(65293); var2 != null; var2 = (class16) this.field3594.method440(3)) {
            var2.method68(arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lrh;)V", line = 140)
    public final synchronized void method1533(class16 arg0) {
        arg0.method124((byte) 89);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([III)V", line = 153)
    public final synchronized void method73(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3596 < 0) {
                this.method1531(arg0, arg1, arg2);
                return;
            }
            if (this.field3597 + arg2 < this.field3596) {
                this.field3597 += arg2;
                this.method1531(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3596 - this.field3597;
            this.method1531(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3597 += var4;
            this.method1530();
            class186 var5 = (class186) this.field3595.method442(65293);
            synchronized (var5) {
                int var7 = var5.method1315(this);
                if (var7 < 0) {
                    var5.field2953 = 0;
                    this.method1528(var5);
                } else {
                    var5.field2953 = var7;
                    this.method1529(var5.field295, var5);
                }
            }
        } while (arg2 != 0);
    }
}
