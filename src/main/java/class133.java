import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class133 extends class80 {

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lvf;")
    private class152 field3039 = new class152();

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lvf;")
    private class152 field3040 = new class152();

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    private int field3042 = 0;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    private int field3041 = -1;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([III)V")
    public final synchronized void method326(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3041 < 0) {
                this.method1000(arg0, arg1, arg2);
                return;
            }
            if (this.field3042 + arg2 < this.field3041) {
                this.field3042 += arg2;
                this.method1000(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3041 - this.field3042;
            this.method1000(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3042 += var4;
            this.method995();
            class23 var5 = (class23) this.field3040.method1138(25852);
            synchronized (var5) {
                int var7 = var5.method144(this);
                if (var7 < 0) {
                    var5.field380 = 0;
                    this.method1001(var5);
                } else {
                    var5.field380 = var7;
                    this.method998(var5.field664, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I")
    public final int method325() {
        return 0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()Lld;")
    public final class80 method329() {
        return (class80) this.field3039.method1142(1);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()Lld;")
    public final class80 method324() {
        return (class80) this.field3039.method1138(25852);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
    private final void method995() {
        if (this.field3042 <= 0) {
            return;
        }
        for (class23 var1 = (class23) this.field3040.method1138(25852); var1 != null; var1 = (class23) this.field3040.method1142(1)) {
            var1.field380 -= this.field3042;
        }
        this.field3041 -= this.field3042;
        this.field3042 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    private final void method996(int arg0) {
        for (class80 var2 = (class80) this.field3039.method1138(25852); var2 != null; var2 = (class80) this.field3039.method1142(1)) {
            var2.method323(arg0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lld;)V")
    public final synchronized void method997(class80 arg0) {
        this.field3039.method1137(2, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lec;Lda;)V")
    private final void method998(class32 arg0, class23 arg1) {
        while (this.field3040.field3507 != arg0 && ((class23) arg0).field380 <= arg1.field380) {
            arg0 = arg0.field664;
        }
        this.field3040.method1147(arg0, arg1, (byte) -60);
        this.field3041 = ((class23) this.field3040.field3507.field664).field380;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public final synchronized void method323(int arg0) {
        do {
            if (this.field3041 < 0) {
                this.method996(arg0);
                return;
            }
            if (this.field3042 + arg0 < this.field3041) {
                this.field3042 += arg0;
                this.method996(arg0);
                return;
            }
            int var2 = this.field3041 - this.field3042;
            this.method996(var2);
            arg0 -= var2;
            this.field3042 += var2;
            this.method995();
            class23 var3 = (class23) this.field3040.method1138(25852);
            synchronized (var3) {
                int var5 = var3.method144(this);
                if (var5 < 0) {
                    var3.field380 = 0;
                    this.method1001(var3);
                } else {
                    var3.field380 = var5;
                    this.method998(var3.field664, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lld;)V")
    public final synchronized void method999(class80 arg0) {
        arg0.method217(-1264);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "([III)V")
    private final void method1000(int[] arg0, int arg1, int arg2) {
        for (class80 var4 = (class80) this.field3039.method1138(25852); var4 != null; var4 = (class80) this.field3039.method1142(1)) {
            var4.method615(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lda;)V")
    private final void method1001(class23 arg0) {
        arg0.method217(-1264);
        arg0.method143();
        class32 var2 = this.field3040.field3507.field664;
        if (this.field3040.field3507 == var2) {
            this.field3041 = -1;
        } else {
            this.field3041 = ((class23) var2).field380;
        }
    }
}
