import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class11 extends class113 {

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Le;")
    private class86 field302 = new class86();

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Le;")
    private class86 field303 = new class86();

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    private int field304 = -1;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    private int field305 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()I")
    public final int method71() {
        return 0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([III)V")
    public final synchronized void method72(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field304 < 0) {
                this.method73(arg0, arg1, arg2);
                return;
            }
            if (this.field305 + arg2 < this.field304) {
                this.field305 += arg2;
                this.method73(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field304 - this.field305;
            this.method73(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field305 += var4;
            this.method77();
            class77 var5 = (class77) this.field303.method689(1001);
            synchronized (var5) {
                int var7 = var5.method577(this);
                if (var7 < 0) {
                    var5.field1442 = 0;
                    this.method79(var5);
                } else {
                    var5.field1442 = var7;
                    this.method78(var5.field642, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "([III)V")
    private final void method73(int[] arg0, int arg1, int arg2) {
        for (class113 var4 = (class113) this.field302.method689(1001); var4 != null; var4 = (class113) this.field302.method688(-86)) {
            var4.method820(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lui;)V")
    public final synchronized void method74(class113 arg0) {
        this.field302.method677(arg0, -1);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()Lui;")
    public final class113 method75() {
        return (class113) this.field302.method689(1001);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    private final void method76(int arg0) {
        for (class113 var2 = (class113) this.field302.method689(1001); var2 != null; var2 = (class113) this.field302.method688(-26)) {
            var2.method81(arg0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()V")
    private final void method77() {
        if (this.field305 <= 0) {
            return;
        }
        for (class77 var1 = (class77) this.field303.method689(1001); var1 != null; var1 = (class77) this.field303.method688(-38)) {
            var1.field1442 -= this.field305;
        }
        this.field304 -= this.field305;
        this.field305 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lph;Ljg;)V")
    private final void method78(class32 arg0, class77 arg1) {
        while (this.field303.field1657 != arg0 && ((class77) arg0).field1442 <= arg1.field1442) {
            arg0 = arg0.field642;
        }
        this.field303.method678(-1, arg1, arg0);
        this.field304 = ((class77) this.field303.field1657.field642).field1442;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljg;)V")
    private final void method79(class77 arg0) {
        arg0.method267(-35);
        arg0.method576();
        class32 var2 = this.field303.field1657.field642;
        if (this.field303.field1657 == var2) {
            this.field304 = -1;
        } else {
            this.field304 = ((class77) var2).field1442;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lui;)V")
    public final synchronized void method80(class113 arg0) {
        arg0.method267(124);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final synchronized void method81(int arg0) {
        do {
            if (this.field304 < 0) {
                this.method76(arg0);
                return;
            }
            if (this.field305 + arg0 < this.field304) {
                this.field305 += arg0;
                this.method76(arg0);
                return;
            }
            int var2 = this.field304 - this.field305;
            this.method76(var2);
            arg0 -= var2;
            this.field305 += var2;
            this.method77();
            class77 var3 = (class77) this.field303.method689(1001);
            synchronized (var3) {
                int var5 = var3.method577(this);
                if (var5 < 0) {
                    var3.field1442 = 0;
                    this.method79(var3);
                } else {
                    var3.field1442 = var5;
                    this.method78(var3.field642, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lui;")
    public final class113 method82() {
        return (class113) this.field302.method688(-44);
    }
}
