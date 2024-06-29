import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class175 extends class154 {

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Len;")
    private class49 field2894 = new class49();

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Len;")
    private class49 field2895 = new class49();

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    private int field2896 = -1;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    private int field2897 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 8)
    public final synchronized void method828(int arg0) {
        do {
            if (this.field2896 < 0) {
                this.method1241(arg0);
                return;
            }
            if (this.field2897 + arg0 < this.field2896) {
                this.field2897 += arg0;
                this.method1241(arg0);
                return;
            }
            int var2 = this.field2896 - this.field2897;
            this.method1241(var2);
            arg0 -= var2;
            this.field2897 += var2;
            this.method1244();
            class126 var3 = (class126) this.field2895.method431(0);
            synchronized (var3) {
                int var5 = var3.method903(this);
                if (var5 < 0) {
                    var3.field2207 = 0;
                    this.method1243(var3);
                } else {
                    var3.field2207 = var5;
                    this.method1245(var3.field1290, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V", line = 57)
    public final synchronized void method827(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2896 < 0) {
                this.method1246(arg0, arg1, arg2);
                return;
            }
            if (this.field2897 + arg2 < this.field2896) {
                this.field2897 += arg2;
                this.method1246(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2896 - this.field2897;
            this.method1246(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2897 += var4;
            this.method1244();
            class126 var5 = (class126) this.field2895.method431(0);
            synchronized (var5) {
                int var7 = var5.method903(this);
                if (var7 < 0) {
                    var5.field2207 = 0;
                    this.method1243(var5);
                } else {
                    var5.field2207 = var7;
                    this.method1245(var5.field1290, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 103)
    private final void method1241(int arg0) {
        for (class154 var2 = (class154) this.field2894.method431(0); var2 != null; var2 = (class154) this.field2894.method439(-28512)) {
            var2.method828(arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lmh;)V", line = 116)
    public final synchronized void method1242(class154 arg0) {
        this.field2894.method434(0, arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lsa;)V", line = 122)
    private final void method1243(class126 arg0) {
        arg0.method535(-2801);
        arg0.method904();
        class70 var2 = this.field2895.field1022.field1290;
        if (this.field2895.field1022 == var2) {
            this.field2896 = -1;
        } else {
            this.field2896 = ((class126) var2).field2207;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()V", line = 141)
    private final void method1244() {
        if (this.field2897 <= 0) {
            return;
        }
        for (class126 var1 = (class126) this.field2895.method431(0); var1 != null; var1 = (class126) this.field2895.method439(-28512)) {
            var1.field2207 -= this.field2897;
        }
        this.field2896 -= this.field2897;
        this.field2897 = 0;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()Lmh;", line = 160)
    public final class154 method825() {
        return (class154) this.field2894.method439(-28512);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lmh;", line = 165)
    public final class154 method829() {
        return (class154) this.field2894.method431(0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lqk;Lsa;)V", line = 169)
    private final void method1245(class70 arg0, class126 arg1) {
        while (this.field2895.field1022 != arg0 && ((class126) arg0).field2207 <= arg1.field2207) {
            arg0 = arg0.field1290;
        }
        class23.method197(arg0, arg1, (byte) 58);
        this.field2896 = ((class126) this.field2895.field1022.field1290).field2207;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()I", line = 177)
    public final int method820() {
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "([III)V", line = 183)
    private final void method1246(int[] arg0, int arg1, int arg2) {
        for (class154 var4 = (class154) this.field2894.method431(0); var4 != null; var4 = (class154) this.field2894.method439(-28512)) {
            var4.method1099(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lmh;)V", line = 196)
    public final synchronized void method1247(class154 arg0) {
        arg0.method535(-2801);
    }
}
