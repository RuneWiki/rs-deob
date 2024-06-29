import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class172 extends class30 {

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lvf;")
    private class48 field3024 = new class48();

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Lvf;")
    private class48 field3025 = new class48();

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    private int field3027 = -1;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    private int field3026 = 0;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    private final void method1212(int arg0) {
        for (class30 var2 = (class30) this.field3024.method371((byte) 61); var2 != null; var2 = (class30) this.field3024.method370(true)) {
            var2.method54(arg0);
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()Lhk;")
    public final class30 method88() {
        return (class30) this.field3024.method370(true);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lhk;)V")
    public final synchronized void method1213(class30 arg0) {
        arg0.method1611((byte) 108);
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "()V")
    private final void method1214() {
        if (this.field3026 <= 0) {
            return;
        }
        for (class27 var1 = (class27) this.field3025.method371((byte) 61); var1 != null; var1 = (class27) this.field3025.method370(true)) {
            var1.field513 -= this.field3026;
        }
        this.field3027 -= this.field3026;
        this.field3026 = 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()Lhk;")
    public final class30 method72() {
        return (class30) this.field3024.method371((byte) 61);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Lhk;)V")
    public final synchronized void method1215(class30 arg0) {
        this.field3024.method378(arg0, 0);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()I")
    public final int method80() {
        return 0;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "([III)V")
    private final void method1216(int[] arg0, int arg1, int arg2) {
        for (class30 var4 = (class30) this.field3024.method371((byte) 61); var4 != null; var4 = (class30) this.field3024.method370(true)) {
            var4.method281(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([III)V")
    public final synchronized void method56(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3027 < 0) {
                this.method1216(arg0, arg1, arg2);
                return;
            }
            if (this.field3026 + arg2 < this.field3027) {
                this.field3026 += arg2;
                this.method1216(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3027 - this.field3026;
            this.method1216(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3026 += var4;
            this.method1214();
            class27 var5 = (class27) this.field3025.method371((byte) 61);
            synchronized (var5) {
                int var7 = var5.method269(this);
                if (var7 < 0) {
                    var5.field513 = 0;
                    this.method1218(var5);
                } else {
                    var5.field513 = var7;
                    this.method1217(var5.field4069, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public final synchronized void method54(int arg0) {
        do {
            if (this.field3027 < 0) {
                this.method1212(arg0);
                return;
            }
            if (this.field3026 + arg0 < this.field3027) {
                this.field3026 += arg0;
                this.method1212(arg0);
                return;
            }
            int var2 = this.field3027 - this.field3026;
            this.method1212(var2);
            arg0 -= var2;
            this.field3026 += var2;
            this.method1214();
            class27 var3 = (class27) this.field3025.method371((byte) 61);
            synchronized (var3) {
                int var5 = var3.method269(this);
                if (var5 < 0) {
                    var3.field513 = 0;
                    this.method1218(var3);
                } else {
                    var3.field513 = var5;
                    this.method1217(var3.field4069, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lpb;Lu;)V")
    private final void method1217(class235 arg0, class27 arg1) {
        while (this.field3025.field806 != arg0 && ((class27) arg0).field513 <= arg1.field513) {
            arg0 = arg0.field4069;
        }
        class161.method1171(arg0, arg1, true);
        this.field3027 = ((class27) this.field3025.field806.field4069).field513;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lu;)V")
    private final void method1218(class27 arg0) {
        arg0.method1611((byte) -126);
        arg0.method268();
        class235 var2 = this.field3025.field806.field4069;
        if (this.field3025.field806 == var2) {
            this.field3027 = -1;
        } else {
            this.field3027 = ((class27) var2).field513;
        }
    }
}
