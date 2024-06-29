import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class175 extends class29 {

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Lea;")
    private class40 field3367 = new class40();

    @OriginalMember(owner = "client!td", name = "x", descriptor = "Lea;")
    private class40 field3368 = new class40();

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    private int field3369 = 0;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    private int field3370 = -1;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lmb;Loh;)V")
    private final void method1169(class110 arg0, class134 arg1) {
        while (this.field3368.field780 != arg0 && ((class134) arg0).field2647 <= arg1.field2647) {
            arg0 = arg0.field2280;
        }
        this.field3368.method349(arg0, 0, arg1);
        this.field3370 = ((class134) this.field3368.field780.field2280).field2647;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Loh;)V")
    private final void method1170(class134 arg0) {
        arg0.method885(3);
        arg0.method980();
        class110 var2 = this.field3368.field780.field2280;
        if (this.field3368.field780 == var2) {
            this.field3370 = -1;
        } else {
            this.field3370 = ((class134) var2).field2647;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
    public final int method127() {
        return 0;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    private final void method1171(int arg0) {
        for (class29 var2 = (class29) this.field3367.method345(-91); var2 != null; var2 = (class29) this.field3367.method348(13949)) {
            var2.method136(arg0);
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
    private final void method1172() {
        if (this.field3369 <= 0) {
            return;
        }
        for (class134 var1 = (class134) this.field3368.method345(-95); var1 != null; var1 = (class134) this.field3368.method348(13949)) {
            var1.field2647 -= this.field3369;
        }
        this.field3370 -= this.field3369;
        this.field3369 = 0;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public final synchronized void method136(int arg0) {
        do {
            if (this.field3370 < 0) {
                this.method1171(arg0);
                return;
            }
            if (this.field3369 + arg0 < this.field3370) {
                this.field3369 += arg0;
                this.method1171(arg0);
                return;
            }
            int var2 = this.field3370 - this.field3369;
            this.method1171(var2);
            arg0 -= var2;
            this.field3369 += var2;
            this.method1172();
            class134 var3 = (class134) this.field3368.method345(-106);
            synchronized (var3) {
                int var5 = var3.method981(this);
                if (var5 < 0) {
                    var3.field2647 = 0;
                    this.method1170(var3);
                } else {
                    var3.field2647 = var5;
                    this.method1169(var3.field2280, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "([III)V")
    private final void method1173(int[] arg0, int arg1, int arg2) {
        for (class29 var4 = (class29) this.field3367.method345(-100); var4 != null; var4 = (class29) this.field3367.method348(13949)) {
            var4.method253(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lch;)V")
    public final synchronized void method1174(class29 arg0) {
        this.field3367.method346(8, arg0);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Lch;)V")
    public final synchronized void method1175(class29 arg0) {
        arg0.method885(3);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([III)V")
    public final synchronized void method151(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3370 < 0) {
                this.method1173(arg0, arg1, arg2);
                return;
            }
            if (this.field3369 + arg2 < this.field3370) {
                this.field3369 += arg2;
                this.method1173(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3370 - this.field3369;
            this.method1173(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3369 += var4;
            this.method1172();
            class134 var5 = (class134) this.field3368.method345(-122);
            synchronized (var5) {
                int var7 = var5.method981(this);
                if (var7 < 0) {
                    var5.field2647 = 0;
                    this.method1170(var5);
                } else {
                    var5.field2647 = var7;
                    this.method1169(var5.field2280, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()Lch;")
    public final class29 method128() {
        return (class29) this.field3367.method348(13949);
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()Lch;")
    public final class29 method153() {
        return (class29) this.field3367.method345(-95);
    }
}
