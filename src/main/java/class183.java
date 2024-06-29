import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class183 extends class134 {

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Ln;")
    private class118 field3612 = new class118();

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Ln;")
    private class118 field3613 = new class118();

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    private int field3614 = -1;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    private int field3615 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "([III)V")
    private final void method1177(int[] arg0, int arg1, int arg2) {
        for (class134 var4 = (class134) this.field3612.method753(-26703); var4 != null; var4 = (class134) this.field3612.method755((byte) 120)) {
            var4.method860(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lhb;Lu;)V")
    private final void method1178(class67 arg0, class181 arg1) {
        while (this.field3613.field2298 != arg0 && ((class181) arg0).field3590 <= arg1.field3590) {
            arg0 = arg0.field1356;
        }
        this.field3613.method745(-85, arg0, arg1);
        this.field3614 = ((class181) this.field3613.field2298.field1356).field3590;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()Log;")
    public final class134 method651() {
        return (class134) this.field3612.method753(-26703);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lu;)V")
    private final void method1179(class181 arg0) {
        arg0.method417(108);
        arg0.method1172();
        class67 var2 = this.field3613.field2298.field1356;
        if (this.field3613.field2298 == var2) {
            this.field3614 = -1;
        } else {
            this.field3614 = ((class181) var2).field3590;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    private final void method1180(int arg0) {
        for (class134 var2 = (class134) this.field3612.method753(-26703); var2 != null; var2 = (class134) this.field3612.method755((byte) 122)) {
            var2.method652(arg0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
    public final int method654() {
        return 0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Log;)V")
    public final synchronized void method1181(class134 arg0) {
        arg0.method417(16);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "()V")
    private final void method1182() {
        if (this.field3615 <= 0) {
            return;
        }
        for (class181 var1 = (class181) this.field3613.method753(-26703); var1 != null; var1 = (class181) this.field3613.method755((byte) 119)) {
            var1.field3590 -= this.field3615;
        }
        this.field3614 -= this.field3615;
        this.field3615 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public final synchronized void method652(int arg0) {
        do {
            if (this.field3614 < 0) {
                this.method1180(arg0);
                return;
            }
            if (this.field3615 + arg0 < this.field3614) {
                this.field3615 += arg0;
                this.method1180(arg0);
                return;
            }
            int var2 = this.field3614 - this.field3615;
            this.method1180(var2);
            arg0 -= var2;
            this.field3615 += var2;
            this.method1182();
            class181 var3 = (class181) this.field3613.method753(-26703);
            synchronized (var3) {
                int var5 = var3.method1171(this);
                if (var5 < 0) {
                    var3.field3590 = 0;
                    this.method1179(var3);
                } else {
                    var3.field3590 = var5;
                    this.method1178(var3.field1356, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Log;)V")
    public final synchronized void method1183(class134 arg0) {
        this.field3612.method752(arg0, 22);
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()Log;")
    public final class134 method655() {
        return (class134) this.field3612.method755((byte) 115);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([III)V")
    public final synchronized void method653(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3614 < 0) {
                this.method1177(arg0, arg1, arg2);
                return;
            }
            if (this.field3615 + arg2 < this.field3614) {
                this.field3615 += arg2;
                this.method1177(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3614 - this.field3615;
            this.method1177(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3615 += var4;
            this.method1182();
            class181 var5 = (class181) this.field3613.method753(-26703);
            synchronized (var5) {
                int var7 = var5.method1171(this);
                if (var7 < 0) {
                    var5.field3590 = 0;
                    this.method1179(var5);
                } else {
                    var5.field3590 = var7;
                    this.method1178(var5.field1356, var5);
                }
            }
        } while (arg2 != 0);
    }
}
