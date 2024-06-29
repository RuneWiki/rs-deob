import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 extends class18 {

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lud;")
    private class52 field277 = new class52();

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "Lud;")
    private class52 field278 = new class52();

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    private int field280 = -1;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    private int field279 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lie;)V", line = 10)
    private final void method127(class48 arg0) {
        arg0.method1444((byte) 89);
        arg0.method307();
        class206 var2 = this.field278.field752.field3492;
        if (this.field278.field752 == var2) {
            this.field280 = -1;
        } else {
            this.field280 = ((class48) var2).field697;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lwf;)V", line = 25)
    public final synchronized void method128(class18 arg0) {
        this.field277.method338(arg0, -1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([III)V", line = 35)
    public final synchronized void method65(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field280 < 0) {
                this.method131(arg0, arg1, arg2);
                return;
            }
            if (this.field279 + arg2 < this.field280) {
                this.field279 += arg2;
                this.method131(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field280 - this.field279;
            this.method131(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field279 += var4;
            this.method130();
            class48 var5 = (class48) this.field278.method334(-18673);
            synchronized (var5) {
                int var7 = var5.method306(this);
                if (var7 < 0) {
                    var5.field697 = 0;
                    this.method127(var5);
                } else {
                    var5.field697 = var7;
                    this.method133(var5.field3492, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 81)
    private final void method129(int arg0) {
        for (class18 var2 = (class18) this.field277.method334(-18673); var2 != null; var2 = (class18) this.field277.method335((byte) 107)) {
            var2.method69(arg0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "()V", line = 91)
    private final void method130() {
        if (this.field279 <= 0) {
            return;
        }
        for (class48 var1 = (class48) this.field278.method334(-18673); var1 != null; var1 = (class48) this.field278.method335((byte) 117)) {
            var1.field697 -= this.field279;
        }
        this.field280 -= this.field279;
        this.field279 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()Lwf;", line = 108)
    public final class18 method68() {
        return (class18) this.field277.method335((byte) 57);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "([III)V", line = 113)
    private final void method131(int[] arg0, int arg1, int arg2) {
        for (class18 var4 = (class18) this.field277.method334(-18673); var4 != null; var4 = (class18) this.field277.method335((byte) 123)) {
            var4.method78(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()Lwf;", line = 122)
    public final class18 method74() {
        return (class18) this.field277.method334(-18673);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lwf;)V", line = 128)
    public final synchronized void method132(class18 arg0) {
        arg0.method1444((byte) 89);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lai;Lie;)V", line = 132)
    private final void method133(class206 arg0, class48 arg1) {
        while (this.field278.field752 != arg0 && ((class48) arg0).field697 <= arg1.field697) {
            arg0 = arg0.field3492;
        }
        class240.method1680(-1, arg1, arg0);
        this.field280 = ((class48) this.field278.field752.field3492).field697;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()I", line = 139)
    public final int method71() {
        return 0;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 151)
    public final synchronized void method69(int arg0) {
        do {
            if (this.field280 < 0) {
                this.method129(arg0);
                return;
            }
            if (this.field279 + arg0 < this.field280) {
                this.field279 += arg0;
                this.method129(arg0);
                return;
            }
            int var2 = this.field280 - this.field279;
            this.method129(var2);
            arg0 -= var2;
            this.field279 += var2;
            this.method130();
            class48 var3 = (class48) this.field278.method334(-18673);
            synchronized (var3) {
                int var5 = var3.method306(this);
                if (var5 < 0) {
                    var3.field697 = 0;
                    this.method127(var3);
                } else {
                    var3.field697 = var5;
                    this.method133(var3.field3492, var3);
                }
            }
        } while (arg0 != 0);
    }
}
