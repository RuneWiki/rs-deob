import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class395 extends class160 {

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "Lfr;")
    private class497 field5909 = new class497();

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "Lfr;")
    private class497 field5910 = new class497();

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
    private int field5911 = 0;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    private int field5912 = -1;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "()V", line = 5)
    private final void method2370() {
        if (this.field5911 <= 0) {
            return;
        }
        for (class124 var1 = (class124) this.field5910.method2957(-63); var1 != null; var1 = (class124) this.field5910.method2947(77)) {
            var1.field1872 -= this.field5911;
        }
        this.field5912 -= this.field5911;
        this.field5911 = 0;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 26)
    public final synchronized void method1135(int arg0) {
        do {
            if (this.field5912 < 0) {
                this.method2377(arg0);
                return;
            }
            if (this.field5911 + arg0 < this.field5912) {
                this.field5911 += arg0;
                this.method2377(arg0);
                return;
            }
            int var2 = this.field5912 - this.field5911;
            this.method2377(var2);
            arg0 -= var2;
            this.field5911 += var2;
            this.method2370();
            class124 var3 = (class124) this.field5910.method2957(122);
            synchronized (var3) {
                int var5 = var3.method919(this);
                if (var5 < 0) {
                    var3.field1872 = 0;
                    this.method2373(var3);
                } else {
                    var3.field1872 = var5;
                    this.method2375(var3.field1741, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "([III)V", line = 73)
    private final void method2371(int[] arg0, int arg1, int arg2) {
        for (class160 var4 = (class160) this.field5909.method2957(-46); var4 != null; var4 = (class160) this.field5909.method2947(40)) {
            var4.method1133(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lbs;)V", line = 82)
    public final synchronized void method2372(class160 arg0) {
        arg0.method876((byte) -96);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "()Lbs;", line = 85)
    public final class160 method1131() {
        return (class160) this.field5909.method2957(94);
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "([III)V", line = 94)
    public final synchronized void method1136(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5912 < 0) {
                this.method2371(arg0, arg1, arg2);
                return;
            }
            if (this.field5911 + arg2 < this.field5912) {
                this.field5911 += arg2;
                this.method2371(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5912 - this.field5911;
            this.method2371(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5911 += var4;
            this.method2370();
            class124 var5 = (class124) this.field5910.method2957(121);
            synchronized (var5) {
                int var7 = var5.method919(this);
                if (var7 < 0) {
                    var5.field1872 = 0;
                    this.method2373(var5);
                } else {
                    var5.field1872 = var7;
                    this.method2375(var5.field1741, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lih;)V", line = 138)
    private final void method2373(class124 arg0) {
        arg0.method876((byte) -96);
        arg0.method918();
        class115 var2 = this.field5910.field7365.field1741;
        if (this.field5910.field7365 == var2) {
            this.field5912 = -1;
        } else {
            this.field5912 = ((class124) var2).field1872;
        }
    }

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "()I", line = 152)
    public final synchronized int method2374() {
        return this.field5909.method2960(false);
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "()Lbs;", line = 158)
    public final class160 method1137() {
        return (class160) this.field5909.method2947(-88);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lea;Lih;)V", line = 165)
    private final void method2375(class115 arg0, class124 arg1) {
        while (this.field5910.field7365 != arg0 && ((class124) arg0).field1872 <= arg1.field1872) {
            arg0 = arg0.field1741;
        }
        class116.method877(-97, arg1, arg0);
        this.field5912 = ((class124) this.field5910.field7365.field1741).field1872;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(Lbs;)V", line = 176)
    public final synchronized void method2376(class160 arg0) {
        this.field5909.method2953(arg0, (byte) 43);
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "()I", line = 184)
    public final int method1134() {
        return 0;
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V", line = 189)
    private final void method2377(int arg0) {
        for (class160 var2 = (class160) this.field5909.method2957(-98); var2 != null; var2 = (class160) this.field5909.method2947(111)) {
            var2.method1135(arg0);
        }
    }
}
