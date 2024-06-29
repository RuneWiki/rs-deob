import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class65 extends class85 {

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Lli;")
    private class18 field1025 = new class18();

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Lli;")
    private class18 field1026 = new class18();

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    private int field1027 = 0;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    private int field1028 = -1;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([III)V", line = 8)
    public final synchronized void method445(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1028 < 0) {
                this.method446(arg0, arg1, arg2);
                return;
            }
            if (this.field1027 + arg2 < this.field1028) {
                this.field1027 += arg2;
                this.method446(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1028 - this.field1027;
            this.method446(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1027 += var4;
            this.method450();
            class254 var5 = (class254) this.field1026.method169(-127);
            synchronized (var5) {
                int var7 = var5.method1762(this);
                if (var7 < 0) {
                    var5.field4219 = 0;
                    this.method456(var5);
                } else {
                    var5.field4219 = var7;
                    this.method448(var5.field2707, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "([III)V", line = 55)
    private final void method446(int[] arg0, int arg1, int arg2) {
        for (class85 var4 = (class85) this.field1025.method169(-126); var4 != null; var4 = (class85) this.field1025.method165((byte) -101)) {
            var4.method653(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()I", line = 66)
    public final int method447() {
        return 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljm;Lil;)V", line = 69)
    private final void method448(class151 arg0, class254 arg1) {
        while (this.field1026.field293 != arg0 && ((class254) arg0).field4219 <= arg1.field4219) {
            arg0 = arg0.field2707;
        }
        class31.method258((byte) 54, arg1, arg0);
        this.field1028 = ((class254) this.field1026.field293.field2707).field4219;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcb;)V", line = 77)
    public final synchronized void method449(class85 arg0) {
        arg0.method1183(false);
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()V", line = 82)
    private final void method450() {
        if (this.field1027 <= 0) {
            return;
        }
        for (class254 var1 = (class254) this.field1026.method169(-124); var1 != null; var1 = (class254) this.field1026.method165((byte) -101)) {
            var1.field4219 -= this.field1027;
        }
        this.field1028 -= this.field1027;
        this.field1027 = 0;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 102)
    private final void method451(int arg0) {
        for (class85 var2 = (class85) this.field1025.method169(-121); var2 != null; var2 = (class85) this.field1025.method165((byte) -101)) {
            var2.method455(arg0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()Lcb;", line = 111)
    public final class85 method452() {
        return (class85) this.field1025.method165((byte) -101);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()Lcb;", line = 119)
    public final class85 method453() {
        return (class85) this.field1025.method169(-128);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lcb;)V", line = 124)
    public final synchronized void method454(class85 arg0) {
        this.field1025.method163((byte) 77, arg0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 130)
    public final synchronized void method455(int arg0) {
        do {
            if (this.field1028 < 0) {
                this.method451(arg0);
                return;
            }
            if (this.field1027 + arg0 < this.field1028) {
                this.field1027 += arg0;
                this.method451(arg0);
                return;
            }
            int var2 = this.field1028 - this.field1027;
            this.method451(var2);
            arg0 -= var2;
            this.field1027 += var2;
            this.method450();
            class254 var3 = (class254) this.field1026.method169(-121);
            synchronized (var3) {
                int var5 = var3.method1762(this);
                if (var5 < 0) {
                    var3.field4219 = 0;
                    this.method456(var3);
                } else {
                    var3.field4219 = var5;
                    this.method448(var3.field2707, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lil;)V", line = 174)
    private final void method456(class254 arg0) {
        arg0.method1183(false);
        arg0.method1761();
        class151 var2 = this.field1026.field293.field2707;
        if (this.field1026.field293 == var2) {
            this.field1028 = -1;
        } else {
            this.field1028 = ((class254) var2).field4219;
        }
    }
}
