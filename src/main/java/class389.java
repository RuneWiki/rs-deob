import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class389 extends class446 {

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lar;")
    private class47 field5607 = new class47();

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Lar;")
    private class47 field5608 = new class47();

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    private int field5609 = 0;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    private int field5610 = -1;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "([III)V", line = 7)
    public final synchronized void method495(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5610 < 0) {
                this.method2504(arg0, arg1, arg2);
                return;
            }
            if (this.field5609 + arg2 < this.field5610) {
                this.field5609 += arg2;
                this.method2504(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5610 - this.field5609;
            this.method2504(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5609 += var4;
            this.method2500();
            class337 var5 = (class337) this.field5608.method332(-2130841184);
            synchronized (var5) {
                int var7 = var5.method2213(this);
                if (var7 < 0) {
                    var5.field4853 = 0;
                    this.method2501(var5);
                } else {
                    var5.field4853 = var7;
                    this.method2503(var5.field636, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "()V", line = 51)
    private final void method2500() {
        if (this.field5609 <= 0) {
            return;
        }
        for (class337 var1 = (class337) this.field5608.method332(-2130841184); var1 != null; var1 = (class337) this.field5608.method343((byte) -108)) {
            var1.field4853 -= this.field5609;
        }
        this.field5610 -= this.field5609;
        this.field5609 = 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lcc;)V", line = 69)
    private final void method2501(class337 arg0) {
        arg0.method322(11);
        arg0.method2214();
        class45 var2 = this.field5608.field663.field636;
        if (this.field5608.field663 == var2) {
            this.field5610 = -1;
        } else {
            this.field5610 = ((class337) var2).field4853;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lpl;)V", line = 82)
    public final synchronized void method2502(class446 arg0) {
        arg0.method322(11);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lfb;Lcc;)V", line = 87)
    private final void method2503(class45 arg0, class337 arg1) {
        while (this.field5608.field663 != arg0 && ((class337) arg0).field4853 <= arg1.field4853) {
            arg0 = arg0.field636;
        }
        class72.method529(arg1, arg0, 5);
        this.field5610 = ((class337) this.field5608.field663.field636).field4853;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "([III)V", line = 96)
    private final void method2504(int[] arg0, int arg1, int arg2) {
        for (class446 var4 = (class446) this.field5607.method332(-2130841184); var4 != null; var4 = (class446) this.field5607.method343((byte) -123)) {
            var4.method2809(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()Lpl;", line = 107)
    public final class446 method501() {
        return (class446) this.field5607.method332(-2130841184);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 115)
    private final void method2505(int arg0) {
        for (class446 var2 = (class446) this.field5607.method332(-2130841184); var2 != null; var2 = (class446) this.field5607.method343((byte) -75)) {
            var2.method470(arg0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()Lpl;", line = 124)
    public final class446 method469() {
        return (class446) this.field5607.method343((byte) -116);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 135)
    public final synchronized void method470(int arg0) {
        do {
            if (this.field5610 < 0) {
                this.method2505(arg0);
                return;
            }
            if (this.field5609 + arg0 < this.field5610) {
                this.field5609 += arg0;
                this.method2505(arg0);
                return;
            }
            int var2 = this.field5610 - this.field5609;
            this.method2505(var2);
            arg0 -= var2;
            this.field5609 += var2;
            this.method2500();
            class337 var3 = (class337) this.field5608.method332(-2130841184);
            synchronized (var3) {
                int var5 = var3.method2213(this);
                if (var5 < 0) {
                    var3.field4853 = 0;
                    this.method2501(var3);
                } else {
                    var3.field4853 = var5;
                    this.method2503(var3.field636, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lpl;)V", line = 181)
    public final synchronized void method2506(class446 arg0) {
        this.field5607.method336((byte) 123, arg0);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()I", line = 187)
    public final int method490() {
        return 0;
    }
}
