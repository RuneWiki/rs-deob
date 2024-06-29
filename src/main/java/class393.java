import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class393 extends class283 {

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lbd;")
    private class37 field5897 = new class37();

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lbd;")
    private class37 field5898 = new class37();

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    private int field5899 = 0;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private int field5900 = -1;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "()I")
    public final int method1067() {
        return 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lkp;")
    public final class283 method1066() {
        return (class283) this.field5897.method253((byte) -6);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lkp;)V")
    public final synchronized void method2479(class283 arg0) {
        arg0.method1120(82);
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
    private final void method2480(int arg0) {
        for (class283 var2 = (class283) this.field5897.method253((byte) -6); var2 != null; var2 = (class283) this.field5897.method247((byte) -120)) {
            var2.method1065(arg0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ltf;Ldb;)V")
    private final void method2481(class161 arg0, class175 arg1) {
        while (this.field5898.field459 != arg0 && ((class175) arg0).field2904 <= arg1.field2904) {
            arg0 = arg0.field2537;
        }
        class284.method1929(arg1, (byte) 85, arg0);
        this.field5900 = ((class175) this.field5898.field459.field2537).field2904;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public final synchronized void method1065(int arg0) {
        do {
            if (this.field5900 < 0) {
                this.method2480(arg0);
                return;
            }
            if (this.field5899 + arg0 < this.field5900) {
                this.field5899 += arg0;
                this.method2480(arg0);
                return;
            }
            int var2 = this.field5900 - this.field5899;
            this.method2480(var2);
            arg0 -= var2;
            this.field5899 += var2;
            this.method2485();
            class175 var3 = (class175) this.field5898.method253((byte) -6);
            synchronized (var3) {
                int var5 = var3.method1222(this);
                if (var5 < 0) {
                    var3.field2904 = 0;
                    this.method2483(var3);
                } else {
                    var3.field2904 = var5;
                    this.method2481(var3.field2537, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lkp;)V")
    public final synchronized void method2482(class283 arg0) {
        this.field5897.method250(arg0, 27);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lkp;")
    public final class283 method1064() {
        return (class283) this.field5897.method247((byte) -126);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ldb;)V")
    private final void method2483(class175 arg0) {
        arg0.method1120(65);
        arg0.method1223();
        class161 var2 = this.field5898.field459.field2537;
        if (this.field5898.field459 == var2) {
            this.field5900 = -1;
        } else {
            this.field5900 = ((class175) var2).field2904;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "([III)V")
    private final void method2484(int[] arg0, int arg1, int arg2) {
        for (class283 var4 = (class283) this.field5897.method253((byte) -6); var4 != null; var4 = (class283) this.field5897.method247((byte) 4)) {
            var4.method1927(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([III)V")
    public final synchronized void method1072(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5900 < 0) {
                this.method2484(arg0, arg1, arg2);
                return;
            }
            if (this.field5899 + arg2 < this.field5900) {
                this.field5899 += arg2;
                this.method2484(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5900 - this.field5899;
            this.method2484(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5899 += var4;
            this.method2485();
            class175 var5 = (class175) this.field5898.method253((byte) -6);
            synchronized (var5) {
                int var7 = var5.method1222(this);
                if (var7 < 0) {
                    var5.field2904 = 0;
                    this.method2483(var5);
                } else {
                    var5.field2904 = var7;
                    this.method2481(var5.field2537, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "()V")
    private final void method2485() {
        if (this.field5899 <= 0) {
            return;
        }
        for (class175 var1 = (class175) this.field5898.method253((byte) -6); var1 != null; var1 = (class175) this.field5898.method247((byte) -122)) {
            var1.field2904 -= this.field5899;
        }
        this.field5900 -= this.field5899;
        this.field5899 = 0;
    }
}
