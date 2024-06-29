import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class71 {

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lof;")
    private class103 field2165 = new class103();

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Lof;")
    private class103 field2166 = new class103();

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    private int field2167 = 0;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field2168 = -1;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()Lkb;")
    public final class71 method29() {
        return (class71) this.field2165.method698(-1610612736);
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    private final void method656(int arg0) {
        for (class71 var2 = (class71) this.field2165.method702((byte) -118); var2 != null; var2 = (class71) this.field2165.method698(-1610612736)) {
            var2.method20(arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Led;)V")
    private final void method657(class33 arg0) {
        arg0.method678((byte) -26);
        arg0.method261();
        class97 var2 = this.field2166.field2336.field2220;
        if (this.field2166.field2336 == var2) {
            this.field2168 = -1;
        } else {
            this.field2168 = ((class33) var2).field948;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([III)V")
    public final synchronized void method19(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2168 < 0) {
                this.method658(arg0, arg1, arg2);
                return;
            }
            if (this.field2167 + arg2 < this.field2168) {
                this.field2167 += arg2;
                this.method658(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2168 - this.field2167;
            this.method658(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2167 += var4;
            this.method661();
            class33 var5 = (class33) this.field2166.method702((byte) -121);
            synchronized (var5) {
                int var7 = var5.method262(this);
                if (var7 < 0) {
                    var5.field948 = 0;
                    this.method657(var5);
                } else {
                    var5.field948 = var7;
                    this.method659(var5.field2220, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "([III)V")
    private final void method658(int[] arg0, int arg1, int arg2) {
        for (class71 var4 = (class71) this.field2165.method702((byte) -123); var4 != null; var4 = (class71) this.field2165.method698(-1610612736)) {
            var4.method544(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lo;Led;)V")
    private final void method659(class97 arg0, class33 arg1) {
        while (this.field2166.field2336 != arg0 && ((class33) arg0).field948 <= arg1.field948) {
            arg0 = arg0.field2220;
        }
        this.field2166.method707(arg1, 32708, arg0);
        this.field2168 = ((class33) this.field2166.field2336.field2220).field948;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lkb;)V")
    public final synchronized void method660(class71 arg0) {
        arg0.method678((byte) -26);
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()V")
    private final void method661() {
        if (this.field2167 <= 0) {
            return;
        }
        for (class33 var1 = (class33) this.field2166.method702((byte) -124); var1 != null; var1 = (class33) this.field2166.method698(-1610612736)) {
            var1.field948 -= this.field2167;
        }
        this.field2168 -= this.field2167;
        this.field2167 = 0;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final synchronized void method20(int arg0) {
        do {
            if (this.field2168 < 0) {
                this.method656(arg0);
                return;
            }
            if (this.field2167 + arg0 < this.field2168) {
                this.field2167 += arg0;
                this.method656(arg0);
                return;
            }
            int var2 = this.field2168 - this.field2167;
            this.method656(var2);
            arg0 -= var2;
            this.field2167 += var2;
            this.method661();
            class33 var3 = (class33) this.field2166.method702((byte) -118);
            synchronized (var3) {
                int var5 = var3.method262(this);
                if (var5 < 0) {
                    var3.field948 = 0;
                    this.method657(var3);
                } else {
                    var3.field948 = var5;
                    this.method659(var3.field2220, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()Lkb;")
    public final class71 method23() {
        return (class71) this.field2165.method702((byte) -122);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lkb;)V")
    public final synchronized void method662(class71 arg0) {
        this.field2165.method706(-15739, arg0);
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()I")
    public final int method21() {
        return 0;
    }
}
