import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class58 extends class262 {

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lab;")
    private class148 field827 = new class148();

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Lab;")
    private class148 field828 = new class148();

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    private int field829 = 0;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    private int field830 = -1;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()V")
    private final void method353() {
        if (this.field829 <= 0) {
            return;
        }
        for (class263 var1 = (class263) this.field828.method990(-94); var1 != null; var1 = (class263) this.field828.method993(-72)) {
            var1.field3960 -= this.field829;
        }
        this.field830 -= this.field829;
        this.field829 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljg;Lii;)V")
    private final void method354(class171 arg0, class263 arg1) {
        while (this.field828.field2054 != arg0 && ((class263) arg0).field3960 <= arg1.field3960) {
            arg0 = arg0.field2378;
        }
        class171.method1122(arg1, false, arg0);
        this.field830 = ((class263) this.field828.field2054.field2378).field3960;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()Lta;")
    public final class262 method355() {
        return (class262) this.field827.method990(-75);
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    public final synchronized void method356(int arg0) {
        do {
            if (this.field830 < 0) {
                this.method364(arg0);
                return;
            }
            if (this.field829 + arg0 < this.field830) {
                this.field829 += arg0;
                this.method364(arg0);
                return;
            }
            int var2 = this.field830 - this.field829;
            this.method364(var2);
            arg0 -= var2;
            this.field829 += var2;
            this.method353();
            class263 var3 = (class263) this.field828.method990(-73);
            synchronized (var3) {
                int var5 = var3.method1728(this);
                if (var5 < 0) {
                    var3.field3960 = 0;
                    this.method363(var3);
                } else {
                    var3.field3960 = var5;
                    this.method354(var3.field2378, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "([III)V")
    private final void method357(int[] arg0, int arg1, int arg2) {
        for (class262 var4 = (class262) this.field827.method990(-93); var4 != null; var4 = (class262) this.field827.method993(-98)) {
            var4.method1727(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()Lta;")
    public final class262 method358() {
        return (class262) this.field827.method993(-25);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lta;)V")
    public final synchronized void method359(class262 arg0) {
        this.field827.method991(arg0, 91);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Lta;)V")
    public final synchronized void method360(class262 arg0) {
        arg0.method1115(-120);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "([III)V")
    public final synchronized void method361(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field830 < 0) {
                this.method357(arg0, arg1, arg2);
                return;
            }
            if (this.field829 + arg2 < this.field830) {
                this.field829 += arg2;
                this.method357(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field830 - this.field829;
            this.method357(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field829 += var4;
            this.method353();
            class263 var5 = (class263) this.field828.method990(-108);
            synchronized (var5) {
                int var7 = var5.method1728(this);
                if (var7 < 0) {
                    var5.field3960 = 0;
                    this.method363(var5);
                } else {
                    var5.field3960 = var7;
                    this.method354(var5.field2378, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()I")
    public final int method362() {
        return 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lii;)V")
    private final void method363(class263 arg0) {
        arg0.method1115(-125);
        arg0.method1729();
        class171 var2 = this.field828.field2054.field2378;
        if (this.field828.field2054 == var2) {
            this.field830 = -1;
        } else {
            this.field830 = ((class263) var2).field3960;
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    private final void method364(int arg0) {
        for (class262 var2 = (class262) this.field827.method990(-117); var2 != null; var2 = (class262) this.field827.method993(-54)) {
            var2.method356(arg0);
        }
    }
}
