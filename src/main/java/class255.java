import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class255 extends class82 {

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "Lnv;")
    private class44 field4108 = new class44();

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "Lnv;")
    private class44 field4109 = new class44();

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
    private int field4110 = -1;

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "I")
    private int field4111 = 0;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lrf;)V", line = 3)
    private final void method1800(class84 arg0) {
        arg0.method947((byte) 117);
        arg0.method760();
        class130 var2 = this.field4109.field690.field1934;
        if (this.field4109.field690 == var2) {
            this.field4110 = -1;
        } else {
            this.field4110 = ((class84) var2).field1381;
        }
    }

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "()I", line = 22)
    public final synchronized int method1801() {
        return this.field4108.method297(0);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V", line = 28)
    public final synchronized void method721(int arg0) {
        do {
            if (this.field4110 < 0) {
                this.method1806(arg0);
                return;
            }
            if (this.field4111 + arg0 < this.field4110) {
                this.field4111 += arg0;
                this.method1806(arg0);
                return;
            }
            int var2 = this.field4110 - this.field4111;
            this.method1806(var2);
            arg0 -= var2;
            this.field4111 += var2;
            this.method1804();
            class84 var3 = (class84) this.field4109.method295((byte) -19);
            synchronized (var3) {
                int var5 = var3.method759(this);
                if (var5 < 0) {
                    var3.field1381 = 0;
                    this.method1800(var3);
                } else {
                    var3.field1381 = var5;
                    this.method1805(var3.field1934, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "([III)V", line = 76)
    public final synchronized void method725(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4110 < 0) {
                this.method1803(arg0, arg1, arg2);
                return;
            }
            if (this.field4111 + arg2 < this.field4110) {
                this.field4111 += arg2;
                this.method1803(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4110 - this.field4111;
            this.method1803(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4111 += var4;
            this.method1804();
            class84 var5 = (class84) this.field4109.method295((byte) 119);
            synchronized (var5) {
                int var7 = var5.method759(this);
                if (var7 < 0) {
                    var5.field1381 = 0;
                    this.method1800(var5);
                } else {
                    var5.field1381 = var7;
                    this.method1805(var5.field1934, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "()Lms;", line = 120)
    public final class82 method720() {
        return (class82) this.field4108.method295((byte) 3);
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "()I", line = 124)
    public final int method722() {
        return 0;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lms;)V", line = 127)
    public final synchronized void method1802(class82 arg0) {
        arg0.method947((byte) 93);
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "([III)V", line = 133)
    private final void method1803(int[] arg0, int arg1, int arg2) {
        for (class82 var4 = (class82) this.field4108.method295((byte) 117); var4 != null; var4 = (class82) this.field4108.method296(true)) {
            var4.method723(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "()V", line = 148)
    private final void method1804() {
        if (this.field4111 <= 0) {
            return;
        }
        for (class84 var1 = (class84) this.field4109.method295((byte) -14); var1 != null; var1 = (class84) this.field4109.method296(true)) {
            var1.field1381 -= this.field4111;
        }
        this.field4110 -= this.field4111;
        this.field4111 = 0;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Ldd;Lrf;)V", line = 165)
    private final void method1805(class130 arg0, class84 arg1) {
        while (this.field4109.field690 != arg0 && ((class84) arg0).field1381 <= arg1.field1381) {
            arg0 = arg0.field1934;
        }
        class536.method3153(arg1, -35, arg0);
        this.field4110 = ((class84) this.field4109.field690.field1934).field1381;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V", line = 177)
    private final void method1806(int arg0) {
        for (class82 var2 = (class82) this.field4108.method295((byte) -88); var2 != null; var2 = (class82) this.field4108.method296(true)) {
            var2.method721(arg0);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(Lms;)V", line = 188)
    public final synchronized void method1807(class82 arg0) {
        this.field4108.method288(arg0, 28);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "()Lms;", line = 194)
    public final class82 method719() {
        return (class82) this.field4108.method296(true);
    }
}
