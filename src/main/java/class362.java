import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class362 extends class64 {

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lmk;")
    private class154 field5108 = new class154();

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lmk;")
    private class154 field5109 = new class154();

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    private int field5110 = -1;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    private int field5111 = 0;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V", line = 6)
    private final void method2208(int arg0) {
        for (class64 var2 = (class64) this.field5108.method814((byte) 90); var2 != null; var2 = (class64) this.field5108.method827(-127)) {
            var2.method360(arg0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lgl;Lka;)V", line = 18)
    private final void method2209(class338 arg0, class406 arg1) {
        while (this.field5109.field1942 != arg0 && ((class406) arg0).field5902 <= arg1.field5902) {
            arg0 = arg0.field4505;
        }
        class444.method2754(arg0, -24521, arg1);
        this.field5110 = ((class406) this.field5109.field1942.field4505).field5902;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lle;)V", line = 29)
    public final synchronized void method2210(class64 arg0) {
        this.field5108.method820(arg0, (byte) 73);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "([III)V", line = 34)
    private final void method2211(int[] arg0, int arg1, int arg2) {
        for (class64 var4 = (class64) this.field5108.method814((byte) 90); var4 != null; var4 = (class64) this.field5108.method827(-128)) {
            var4.method364(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()Lle;", line = 46)
    public final class64 method363() {
        return (class64) this.field5108.method814((byte) 90);
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()V", line = 49)
    private final void method2212() {
        if (this.field5111 <= 0) {
            return;
        }
        for (class406 var1 = (class406) this.field5109.method814((byte) 90); var1 != null; var1 = (class406) this.field5109.method827(-4)) {
            var1.field5902 -= this.field5111;
        }
        this.field5110 -= this.field5111;
        this.field5111 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 71)
    public final synchronized void method360(int arg0) {
        do {
            if (this.field5110 < 0) {
                this.method2208(arg0);
                return;
            }
            if (this.field5111 + arg0 < this.field5110) {
                this.field5111 += arg0;
                this.method2208(arg0);
                return;
            }
            int var2 = this.field5110 - this.field5111;
            this.method2208(var2);
            arg0 -= var2;
            this.field5111 += var2;
            this.method2212();
            class406 var3 = (class406) this.field5109.method814((byte) 90);
            synchronized (var3) {
                int var5 = var3.method2539(this);
                if (var5 < 0) {
                    var3.field5902 = 0;
                    this.method2214(var3);
                } else {
                    var3.field5902 = var5;
                    this.method2209(var3.field4505, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lle;)V", line = 120)
    public final synchronized void method2213(class64 arg0) {
        arg0.method1967(-1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lle;", line = 123)
    public final class64 method361() {
        return (class64) this.field5108.method827(-126);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()I", line = 126)
    public final int method365() {
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([III)V", line = 133)
    public final synchronized void method359(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5110 < 0) {
                this.method2211(arg0, arg1, arg2);
                return;
            }
            if (this.field5111 + arg2 < this.field5110) {
                this.field5111 += arg2;
                this.method2211(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5110 - this.field5111;
            this.method2211(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5111 += var4;
            this.method2212();
            class406 var5 = (class406) this.field5109.method814((byte) 90);
            synchronized (var5) {
                int var7 = var5.method2539(this);
                if (var7 < 0) {
                    var5.field5902 = 0;
                    this.method2214(var5);
                } else {
                    var5.field5902 = var7;
                    this.method2209(var5.field4505, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lka;)V", line = 182)
    private final void method2214(class406 arg0) {
        arg0.method1967(-1);
        arg0.method2540();
        class338 var2 = this.field5109.field1942.field4505;
        if (this.field5109.field1942 == var2) {
            this.field5110 = -1;
        } else {
            this.field5110 = ((class406) var2).field5902;
        }
    }
}
