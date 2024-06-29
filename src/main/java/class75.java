import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class75 extends class203 {

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lhe;")
    private class47 field1132 = new class47();

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "Lhe;")
    private class47 field1133 = new class47();

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    private int field1134 = -1;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    private int field1135 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "()V")
    private final void method505() {
        if (this.field1135 <= 0) {
            return;
        }
        for (class225 var1 = (class225) this.field1133.method315(-31594); var1 != null; var1 = (class225) this.field1133.method312(1012)) {
            var1.field3849 -= this.field1135;
        }
        this.field1134 -= this.field1135;
        this.field1135 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "([III)V")
    private final void method506(int[] arg0, int arg1, int arg2) {
        for (class203 var4 = (class203) this.field1132.method315(-31594); var4 != null; var4 = (class203) this.field1132.method312(1012)) {
            var4.method1324(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Llc;)V")
    public final synchronized void method507(class203 arg0) {
        this.field1132.method310(-15062, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lii;)V")
    private final void method508(class225 arg0) {
        arg0.method1234(17216);
        arg0.method1467();
        class190 var2 = this.field1133.field631.field3307;
        if (this.field1133.field631 == var2) {
            this.field1134 = -1;
        } else {
            this.field1134 = ((class225) var2).field3849;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()Llc;")
    public final class203 method135() {
        return (class203) this.field1132.method315(-31594);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Llc;)V")
    public final synchronized void method509(class203 arg0) {
        arg0.method1234(17216);
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public final synchronized void method153(int arg0) {
        do {
            if (this.field1134 < 0) {
                this.method510(arg0);
                return;
            }
            if (this.field1135 + arg0 < this.field1134) {
                this.field1135 += arg0;
                this.method510(arg0);
                return;
            }
            int var2 = this.field1134 - this.field1135;
            this.method510(var2);
            arg0 -= var2;
            this.field1135 += var2;
            this.method505();
            class225 var3 = (class225) this.field1133.method315(-31594);
            synchronized (var3) {
                int var5 = var3.method1466(this);
                if (var5 < 0) {
                    var3.field3849 = 0;
                    this.method508(var3);
                } else {
                    var3.field3849 = var5;
                    this.method511(var3.field3307, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()Llc;")
    public final class203 method150() {
        return (class203) this.field1132.method312(1012);
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    private final void method510(int arg0) {
        for (class203 var2 = (class203) this.field1132.method315(-31594); var2 != null; var2 = (class203) this.field1132.method312(1012)) {
            var2.method153(arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Llf;Lii;)V")
    private final void method511(class190 arg0, class225 arg1) {
        while (this.field1133.field631 != arg0 && ((class225) arg0).field3849 <= arg1.field3849) {
            arg0 = arg0.field3307;
        }
        this.field1133.method314(-29403, arg1, arg0);
        this.field1134 = ((class225) this.field1133.field631.field3307).field3849;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "([III)V")
    public final synchronized void method120(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1134 < 0) {
                this.method506(arg0, arg1, arg2);
                return;
            }
            if (this.field1135 + arg2 < this.field1134) {
                this.field1135 += arg2;
                this.method506(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1134 - this.field1135;
            this.method506(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1135 += var4;
            this.method505();
            class225 var5 = (class225) this.field1133.method315(-31594);
            synchronized (var5) {
                int var7 = var5.method1466(this);
                if (var7 < 0) {
                    var5.field3849 = 0;
                    this.method508(var5);
                } else {
                    var5.field3849 = var7;
                    this.method511(var5.field3307, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()I")
    public final int method133() {
        return 0;
    }
}
