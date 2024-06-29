import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class91 extends class12 {

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lgb;")
    private class149 field1460 = new class149();

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lgb;")
    private class149 field1461 = new class149();

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    private int field1462 = -1;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    private int field1463 = 0;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lfg;)V")
    public final synchronized void method718(class12 arg0) {
        arg0.method693(125);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()I")
    public final int method127() {
        return 0;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    private final void method719(int arg0) {
        for (class12 var2 = (class12) this.field1460.method1010(112); var2 != null; var2 = (class12) this.field1460.method1008((byte) 88)) {
            var2.method124(arg0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([III)V")
    public final synchronized void method126(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1462 < 0) {
                this.method724(arg0, arg1, arg2);
                return;
            }
            if (this.field1463 + arg2 < this.field1462) {
                this.field1463 += arg2;
                this.method724(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1462 - this.field1463;
            this.method724(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1463 += var4;
            this.method720();
            class125 var5 = (class125) this.field1461.method1010(112);
            synchronized (var5) {
                int var7 = var5.method893(this);
                if (var7 < 0) {
                    var5.field1965 = 0;
                    this.method723(var5);
                } else {
                    var5.field1965 = var7;
                    this.method721(var5.field1407, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()V")
    private final void method720() {
        if (this.field1463 <= 0) {
            return;
        }
        for (class125 var1 = (class125) this.field1461.method1010(109); var1 != null; var1 = (class125) this.field1461.method1008((byte) 88)) {
            var1.field1965 -= this.field1463;
        }
        this.field1462 -= this.field1463;
        this.field1463 = 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lnc;Lgf;)V")
    private final void method721(class86 arg0, class125 arg1) {
        while (this.field1461.field2299 != arg0 && ((class125) arg0).field1965 <= arg1.field1965) {
            arg0 = arg0.field1407;
        }
        class51.method423(957, arg1, arg0);
        this.field1462 = ((class125) this.field1461.field2299.field1407).field1965;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lfg;")
    public final class12 method125() {
        return (class12) this.field1460.method1008((byte) 88);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lfg;)V")
    public final synchronized void method722(class12 arg0) {
        this.field1460.method1007((byte) 89, arg0);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public final synchronized void method124(int arg0) {
        do {
            if (this.field1462 < 0) {
                this.method719(arg0);
                return;
            }
            if (this.field1463 + arg0 < this.field1462) {
                this.field1463 += arg0;
                this.method719(arg0);
                return;
            }
            int var2 = this.field1462 - this.field1463;
            this.method719(var2);
            arg0 -= var2;
            this.field1463 += var2;
            this.method720();
            class125 var3 = (class125) this.field1461.method1010(114);
            synchronized (var3) {
                int var5 = var3.method893(this);
                if (var5 < 0) {
                    var3.field1965 = 0;
                    this.method723(var3);
                } else {
                    var3.field1965 = var5;
                    this.method721(var3.field1407, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lgf;)V")
    private final void method723(class125 arg0) {
        arg0.method693(78);
        arg0.method894();
        class86 var2 = this.field1461.field2299.field1407;
        if (this.field1461.field2299 == var2) {
            this.field1462 = -1;
        } else {
            this.field1462 = ((class125) var2).field1965;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "([III)V")
    private final void method724(int[] arg0, int arg1, int arg2) {
        for (class12 var4 = (class12) this.field1460.method1010(110); var4 != null; var4 = (class12) this.field1460.method1008((byte) 88)) {
            var4.method128(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()Lfg;")
    public final class12 method123() {
        return (class12) this.field1460.method1010(125);
    }
}
