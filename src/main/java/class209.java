import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class209 extends class348 {

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lsm;")
    private class249 field2957 = new class249();

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Lsm;")
    private class249 field2958 = new class249();

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    private int field2959 = 0;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    private int field2960 = -1;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()Lgh;", line = 3)
    public final class348 method278() {
        return (class348) this.field2957.method1544(-87);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 9)
    private final void method1312(int arg0) {
        for (class348 var2 = (class348) this.field2957.method1544(-96); var2 != null; var2 = (class348) this.field2957.method1546((byte) -42)) {
            var2.method294(arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lgh;)V", line = 19)
    public final synchronized void method1313(class348 arg0) {
        arg0.method1182(28818);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lag;Ljl;)V", line = 24)
    private final void method1314(class180 arg0, class405 arg1) {
        while (this.field2958.field3504 != arg0 && ((class405) arg0).field5602 <= arg1.field5602) {
            arg0 = arg0.field2610;
        }
        class67.method471(arg1, arg0, 2047);
        this.field2960 = ((class405) this.field2958.field3504.field2610).field5602;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lgh;)V", line = 33)
    public final synchronized void method1315(class348 arg0) {
        this.field2957.method1541((byte) -34, arg0);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()I", line = 37)
    public final int method286() {
        return 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V", line = 45)
    public final synchronized void method267(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2960 < 0) {
                this.method1316(arg0, arg1, arg2);
                return;
            }
            if (this.field2959 + arg2 < this.field2960) {
                this.field2959 += arg2;
                this.method1316(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2960 - this.field2959;
            this.method1316(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2959 += var4;
            this.method1318();
            class405 var5 = (class405) this.field2958.method1544(-91);
            synchronized (var5) {
                int var7 = var5.method2383(this);
                if (var7 < 0) {
                    var5.field5602 = 0;
                    this.method1317(var5);
                } else {
                    var5.field5602 = var7;
                    this.method1314(var5.field2610, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()Lgh;", line = 89)
    public final class348 method270() {
        return (class348) this.field2957.method1546((byte) -42);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 95)
    public final synchronized void method294(int arg0) {
        do {
            if (this.field2960 < 0) {
                this.method1312(arg0);
                return;
            }
            if (this.field2959 + arg0 < this.field2960) {
                this.field2959 += arg0;
                this.method1312(arg0);
                return;
            }
            int var2 = this.field2960 - this.field2959;
            this.method1312(var2);
            arg0 -= var2;
            this.field2959 += var2;
            this.method1318();
            class405 var3 = (class405) this.field2958.method1544(-95);
            synchronized (var3) {
                int var5 = var3.method2383(this);
                if (var5 < 0) {
                    var3.field5602 = 0;
                    this.method1317(var3);
                } else {
                    var3.field5602 = var5;
                    this.method1314(var3.field2610, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "([III)V", line = 150)
    private final void method1316(int[] arg0, int arg1, int arg2) {
        for (class348 var4 = (class348) this.field2957.method1544(-100); var4 != null; var4 = (class348) this.field2957.method1546((byte) -42)) {
            var4.method2084(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljl;)V", line = 159)
    private final void method1317(class405 arg0) {
        arg0.method1182(28818);
        arg0.method2382();
        class180 var2 = this.field2958.field3504.field2610;
        if (this.field2958.field3504 == var2) {
            this.field2960 = -1;
        } else {
            this.field2960 = ((class405) var2).field5602;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()V", line = 182)
    private final void method1318() {
        if (this.field2959 <= 0) {
            return;
        }
        for (class405 var1 = (class405) this.field2958.method1544(-126); var1 != null; var1 = (class405) this.field2958.method1546((byte) -42)) {
            var1.field5602 -= this.field2959;
        }
        this.field2960 -= this.field2959;
        this.field2959 = 0;
    }
}
