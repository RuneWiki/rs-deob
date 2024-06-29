import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class172 extends class247 {

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Llc;")
    private class160 field2897 = new class160();

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Llc;")
    private class160 field2898 = new class160();

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    private int field2899 = -1;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    private int field2900 = 0;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lt;)V", line = 5)
    public final synchronized void method1329(class247 arg0) {
        this.field2897.method1252((byte) -60, arg0);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 15)
    public final synchronized void method303(int arg0) {
        do {
            if (this.field2899 < 0) {
                this.method1335(arg0);
                return;
            }
            if (this.field2900 + arg0 < this.field2899) {
                this.field2900 += arg0;
                this.method1335(arg0);
                return;
            }
            int var2 = this.field2899 - this.field2900;
            this.method1335(var2);
            arg0 -= var2;
            this.field2900 += var2;
            this.method1332();
            class105 var3 = (class105) this.field2898.method1251(72);
            synchronized (var3) {
                int var5 = var3.method712(this);
                if (var5 < 0) {
                    var3.field1697 = 0;
                    this.method1334(var3);
                } else {
                    var3.field1697 = var5;
                    this.method1330(var3.field2896, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()I", line = 63)
    public final int method304() {
        return 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lkj;Ldc;)V", line = 67)
    private final void method1330(class171 arg0, class105 arg1) {
        while (this.field2898.field2696 != arg0 && ((class105) arg0).field1697 <= arg1.field1697) {
            arg0 = arg0.field2896;
        }
        class114.method777(arg0, arg1, 126);
        this.field2899 = ((class105) this.field2898.field2696.field2896).field1697;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lt;)V", line = 74)
    public final synchronized void method1331(class247 arg0) {
        arg0.method1325(-2935);
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "()V", line = 77)
    private final void method1332() {
        if (this.field2900 <= 0) {
            return;
        }
        for (class105 var1 = (class105) this.field2898.method1251(-75); var1 != null; var1 = (class105) this.field2898.method1253(30)) {
            var1.field1697 -= this.field2900;
        }
        this.field2899 -= this.field2900;
        this.field2900 = 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([III)V", line = 99)
    public final synchronized void method307(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2899 < 0) {
                this.method1333(arg0, arg1, arg2);
                return;
            }
            if (this.field2900 + arg2 < this.field2899) {
                this.field2900 += arg2;
                this.method1333(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2899 - this.field2900;
            this.method1333(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2900 += var4;
            this.method1332();
            class105 var5 = (class105) this.field2898.method1251(85);
            synchronized (var5) {
                int var7 = var5.method712(this);
                if (var7 < 0) {
                    var5.field1697 = 0;
                    this.method1334(var5);
                } else {
                    var5.field1697 = var7;
                    this.method1330(var5.field2896, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "([III)V", line = 147)
    private final void method1333(int[] arg0, int arg1, int arg2) {
        for (class247 var4 = (class247) this.field2897.method1251(123); var4 != null; var4 = (class247) this.field2897.method1253(97)) {
            var4.method1801(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ldc;)V", line = 157)
    private final void method1334(class105 arg0) {
        arg0.method1325(-2935);
        arg0.method713();
        class171 var2 = this.field2898.field2696.field2896;
        if (this.field2898.field2696 == var2) {
            this.field2899 = -1;
        } else {
            this.field2899 = ((class105) var2).field1697;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()Lt;", line = 174)
    public final class247 method298() {
        return (class247) this.field2897.method1253(72);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()Lt;", line = 181)
    public final class247 method301() {
        return (class247) this.field2897.method1251(83);
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V", line = 187)
    private final void method1335(int arg0) {
        for (class247 var2 = (class247) this.field2897.method1251(-115); var2 != null; var2 = (class247) this.field2897.method1253(105)) {
            var2.method303(arg0);
        }
    }
}
