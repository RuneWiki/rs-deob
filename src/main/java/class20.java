import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class20 extends class102 {

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Lmi;")
    private class408 field343 = new class408();

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lmi;")
    private class408 field344 = new class408();

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    private int field345 = 0;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    private int field346 = -1;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()I", line = 4)
    public final int method164() {
        return 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()Laf;", line = 11)
    public final class102 method165() {
        return (class102) this.field343.method2656(0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Laf;)V", line = 15)
    public final synchronized void method166(class102 arg0) {
        arg0.method2574((byte) 117);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()Laf;", line = 23)
    public final class102 method167() {
        return (class102) this.field343.method2649(0);
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "()V", line = 26)
    private final void method168() {
        if (this.field345 <= 0) {
            return;
        }
        for (class96 var1 = (class96) this.field344.method2649(0); var1 != null; var1 = (class96) this.field344.method2656(0)) {
            var1.field1320 -= this.field345;
        }
        this.field346 -= this.field345;
        this.field345 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lo;Ljf;)V", line = 43)
    private final void method169(class393 arg0, class96 arg1) {
        while (this.field344.field6108 != arg0 && ((class96) arg0).field1320 <= arg1.field1320) {
            arg0 = arg0.field5895;
        }
        class369.method2435(arg0, arg1, 2564);
        this.field346 = ((class96) this.field344.field6108.field5895).field1320;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "([III)V", line = 56)
    public final synchronized void method170(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field346 < 0) {
                this.method173(arg0, arg1, arg2);
                return;
            }
            if (this.field345 + arg2 < this.field346) {
                this.field345 += arg2;
                this.method173(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field346 - this.field345;
            this.method173(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field345 += var4;
            this.method168();
            class96 var5 = (class96) this.field344.method2649(0);
            synchronized (var5) {
                int var7 = var5.method631(this);
                if (var7 < 0) {
                    var5.field1320 = 0;
                    this.method175(var5);
                } else {
                    var5.field1320 = var7;
                    this.method169(var5.field5895, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 107)
    private final void method171(int arg0) {
        for (class102 var2 = (class102) this.field343.method2649(0); var2 != null; var2 = (class102) this.field343.method2656(0)) {
            var2.method172(arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 119)
    public final synchronized void method172(int arg0) {
        do {
            if (this.field346 < 0) {
                this.method171(arg0);
                return;
            }
            if (this.field345 + arg0 < this.field346) {
                this.field345 += arg0;
                this.method171(arg0);
                return;
            }
            int var2 = this.field346 - this.field345;
            this.method171(var2);
            arg0 -= var2;
            this.field345 += var2;
            this.method168();
            class96 var3 = (class96) this.field344.method2649(0);
            synchronized (var3) {
                int var5 = var3.method631(this);
                if (var5 < 0) {
                    var3.field1320 = 0;
                    this.method175(var3);
                } else {
                    var3.field1320 = var5;
                    this.method169(var3.field5895, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "([III)V", line = 165)
    private final void method173(int[] arg0, int arg1, int arg2) {
        for (class102 var4 = (class102) this.field343.method2649(0); var4 != null; var4 = (class102) this.field343.method2656(0)) {
            var4.method690(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Laf;)V", line = 180)
    public final synchronized void method174(class102 arg0) {
        this.field343.method2658(arg0, 0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljf;)V", line = 188)
    private final void method175(class96 arg0) {
        arg0.method2574((byte) 114);
        arg0.method632();
        class393 var2 = this.field344.field6108.field5895;
        if (this.field344.field6108 == var2) {
            this.field346 = -1;
        } else {
            this.field346 = ((class96) var2).field1320;
        }
    }
}
