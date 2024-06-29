import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class218 extends class69 {

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Lae;")
    private class40 field2676 = new class40();

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lae;")
    private class40 field2677 = new class40();

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    private int field2678 = 0;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    private int field2679 = -1;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "()V", line = 6)
    private final void method1290() {
        if (this.field2678 <= 0) {
            return;
        }
        for (class435 var1 = (class435) this.field2677.method237(98); var1 != null; var1 = (class435) this.field2677.method245((byte) 70)) {
            var1.field5438 -= this.field2678;
        }
        this.field2679 -= this.field2678;
        this.field2678 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()Lpn;", line = 23)
    public final class69 method413() {
        return (class69) this.field2676.method245((byte) 34);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 31)
    public final synchronized void method410(int arg0) {
        do {
            if (this.field2679 < 0) {
                this.method1291(arg0);
                return;
            }
            if (this.field2678 + arg0 < this.field2679) {
                this.field2678 += arg0;
                this.method1291(arg0);
                return;
            }
            int var2 = this.field2679 - this.field2678;
            this.method1291(var2);
            arg0 -= var2;
            this.field2678 += var2;
            this.method1290();
            class435 var3 = (class435) this.field2677.method237(108);
            synchronized (var3) {
                int var5 = var3.method2285(this);
                if (var5 < 0) {
                    var3.field5438 = 0;
                    this.method1293(var3);
                } else {
                    var3.field5438 = var5;
                    this.method1292(var3.field4201, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 78)
    private final void method1291(int arg0) {
        for (class69 var2 = (class69) this.field2676.method237(125); var2 != null; var2 = (class69) this.field2676.method245((byte) 110)) {
            var2.method410(arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "()I", line = 89)
    public final int method415() {
        return 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ld;Lwba;)V", line = 93)
    private final void method1292(class329 arg0, class435 arg1) {
        while (this.field2677.field541 != arg0 && ((class435) arg0).field5438 <= arg1.field5438) {
            arg0 = arg0.field4201;
        }
        class404.method2151(arg1, arg0, 4);
        this.field2679 = ((class435) this.field2677.field541.field4201).field5438;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lwba;)V", line = 100)
    private final void method1293(class435 arg0) {
        arg0.method1871(-122);
        arg0.method2286();
        class329 var2 = this.field2677.field541.field4201;
        if (this.field2677.field541 == var2) {
            this.field2679 = -1;
        } else {
            this.field2679 = ((class435) var2).field5438;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "([III)V", line = 117)
    public final synchronized void method412(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2679 < 0) {
                this.method1294(arg0, arg1, arg2);
                return;
            }
            if (this.field2678 + arg2 < this.field2679) {
                this.field2678 += arg2;
                this.method1294(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2679 - this.field2678;
            this.method1294(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2678 += var4;
            this.method1290();
            class435 var5 = (class435) this.field2677.method237(103);
            synchronized (var5) {
                int var7 = var5.method2285(this);
                if (var7 < 0) {
                    var5.field5438 = 0;
                    this.method1293(var5);
                } else {
                    var5.field5438 = var7;
                    this.method1292(var5.field4201, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "([III)V", line = 168)
    private final void method1294(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field2676.method237(99); var4 != null; var4 = (class69) this.field2676.method245((byte) 73)) {
            var4.method411(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lpn;)V", line = 177)
    public final synchronized void method1295(class69 arg0) {
        arg0.method1871(-92);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lpn;)V", line = 182)
    public final synchronized void method1296(class69 arg0) {
        this.field2676.method236(arg0, (byte) 23);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()Lpn;", line = 186)
    public final class69 method409() {
        return (class69) this.field2676.method237(122);
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "()I", line = 190)
    public final synchronized int method1297() {
        return this.field2676.method241(-121);
    }
}
