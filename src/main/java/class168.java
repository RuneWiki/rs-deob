import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class168 extends class105 {

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lnd;")
    private class122 field3354 = new class122();

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lnd;")
    private class122 field3355 = new class122();

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    private int field3356 = 0;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    private int field3357 = -1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lee;Lff;)V")
    private final void method1131(class44 arg0, class54 arg1) {
        while (this.field3355.field2252 != arg0 && ((class54) arg0).field899 <= arg1.field899) {
            arg0 = arg0.field716;
        }
        this.field3355.method690(arg0, arg1, -65);
        this.field3357 = ((class54) this.field3355.field2252.field716).field899;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    private final void method1132(int arg0) {
        for (class105 var2 = (class105) this.field3354.method692(false); var2 != null; var2 = (class105) this.field3354.method695(512)) {
            var2.method116(arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "([III)V")
    public final synchronized void method119(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3357 < 0) {
                this.method1135(arg0, arg1, arg2);
                return;
            }
            if (this.field3356 + arg2 < this.field3357) {
                this.field3356 += arg2;
                this.method1135(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3357 - this.field3356;
            this.method1135(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3356 += var4;
            this.method1134();
            class54 var5 = (class54) this.field3355.method692(false);
            synchronized (var5) {
                int var7 = var5.method296(this);
                if (var7 < 0) {
                    var5.field899 = 0;
                    this.method1136(var5);
                } else {
                    var5.field899 = var7;
                    this.method1131(var5.field716, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lle;)V")
    public final synchronized void method1133(class105 arg0) {
        arg0.method235(false);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()Lle;")
    public final class105 method117() {
        return (class105) this.field3354.method692(false);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "()V")
    private final void method1134() {
        if (this.field3356 <= 0) {
            return;
        }
        for (class54 var1 = (class54) this.field3355.method692(false); var1 != null; var1 = (class54) this.field3355.method695(512)) {
            var1.field899 -= this.field3356;
        }
        this.field3357 -= this.field3356;
        this.field3356 = 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
    public final int method113() {
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "([III)V")
    private final void method1135(int[] arg0, int arg1, int arg2) {
        for (class105 var4 = (class105) this.field3354.method692(false); var4 != null; var4 = (class105) this.field3354.method695(512)) {
            var4.method579(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lff;)V")
    private final void method1136(class54 arg0) {
        arg0.method235(false);
        arg0.method295();
        class44 var2 = this.field3355.field2252.field716;
        if (this.field3355.field2252 == var2) {
            this.field3357 = -1;
        } else {
            this.field3357 = ((class54) var2).field899;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lle;)V")
    public final synchronized void method1137(class105 arg0) {
        this.field3354.method699(arg0, 102);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public final synchronized void method116(int arg0) {
        do {
            if (this.field3357 < 0) {
                this.method1132(arg0);
                return;
            }
            if (this.field3356 + arg0 < this.field3357) {
                this.field3356 += arg0;
                this.method1132(arg0);
                return;
            }
            int var2 = this.field3357 - this.field3356;
            this.method1132(var2);
            arg0 -= var2;
            this.field3356 += var2;
            this.method1134();
            class54 var3 = (class54) this.field3355.method692(false);
            synchronized (var3) {
                int var5 = var3.method296(this);
                if (var5 < 0) {
                    var3.field899 = 0;
                    this.method1136(var3);
                } else {
                    var3.field899 = var5;
                    this.method1131(var3.field716, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()Lle;")
    public final class105 method109() {
        return (class105) this.field3354.method695(512);
    }
}
