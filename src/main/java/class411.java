import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class411 extends class487 {

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "Lv;")
    private class165 field5758 = new class165();

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "Lv;")
    private class165 field5759 = new class165();

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    private int field5760 = -1;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    private int field5761 = 0;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public final synchronized void method599(int arg0) {
        do {
            if (this.field5760 < 0) {
                this.method2511(arg0);
                return;
            }
            if (this.field5761 + arg0 < this.field5760) {
                this.field5761 += arg0;
                this.method2511(arg0);
                return;
            }
            int var2 = this.field5760 - this.field5761;
            this.method2511(var2);
            arg0 -= var2;
            this.field5761 += var2;
            this.method2505();
            class27 var3 = (class27) this.field5759.method1041(1048832);
            synchronized (var3) {
                int var5 = var3.method116(this);
                if (var5 < 0) {
                    var3.field233 = 0;
                    this.method2507(var3);
                } else {
                    var3.field233 = var5;
                    this.method2506(var3.field767, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "()V")
    private final void method2505() {
        if (this.field5761 <= 0) {
            return;
        }
        for (class27 var1 = (class27) this.field5759.method1041(1048832); var1 != null; var1 = (class27) this.field5759.method1033(-1)) {
            var1.field233 -= this.field5761;
        }
        this.field5760 -= this.field5761;
        this.field5761 = 0;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "()Lqp;")
    public final class487 method615() {
        return (class487) this.field5758.method1033(-1);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lsja;Lmi;)V")
    private final void method2506(class69 arg0, class27 arg1) {
        while (this.field5759.field2103 != arg0 && ((class27) arg0).field233 <= arg1.field233) {
            arg0 = arg0.field767;
        }
        class673.method3836(arg0, arg1, 98);
        this.field5760 = ((class27) this.field5759.field2103.field767).field233;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lmi;)V")
    private final void method2507(class27 arg0) {
        arg0.method527(-11229);
        arg0.method115();
        class69 var2 = this.field5759.field2103.field767;
        if (this.field5759.field2103 == var2) {
            this.field5760 = -1;
        } else {
            this.field5760 = ((class27) var2).field233;
        }
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "([III)V")
    private final void method2508(int[] arg0, int arg1, int arg2) {
        for (class487 var4 = (class487) this.field5758.method1041(1048832); var4 != null; var4 = (class487) this.field5758.method1033(-1)) {
            var4.method2890(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "()I")
    public final synchronized int method2509() {
        return this.field5758.method1036((byte) -67);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lqp;)V")
    public final synchronized void method2510(class487 arg0) {
        this.field5758.method1042(arg0, 1048832);
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V")
    private final void method2511(int arg0) {
        for (class487 var2 = (class487) this.field5758.method1041(1048832); var2 != null; var2 = (class487) this.field5758.method1033(-1)) {
            var2.method599(arg0);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "()Lqp;")
    public final class487 method614() {
        return (class487) this.field5758.method1041(1048832);
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "()I")
    public final int method613() {
        return 0;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(Lqp;)V")
    public final synchronized void method2512(class487 arg0) {
        arg0.method527(-11229);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([III)V")
    public final synchronized void method604(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5760 < 0) {
                this.method2508(arg0, arg1, arg2);
                return;
            }
            if (this.field5761 + arg2 < this.field5760) {
                this.field5761 += arg2;
                this.method2508(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5760 - this.field5761;
            this.method2508(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5761 += var4;
            this.method2505();
            class27 var5 = (class27) this.field5759.method1041(1048832);
            synchronized (var5) {
                int var7 = var5.method116(this);
                if (var7 < 0) {
                    var5.field233 = 0;
                    this.method2507(var5);
                } else {
                    var5.field233 = var7;
                    this.method2506(var5.field767, var5);
                }
            }
        } while (arg2 != 0);
    }
}
