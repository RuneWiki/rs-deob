import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class173 extends class88 {

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lre;")
    private class266 field2920 = new class266();

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lre;")
    private class266 field2921 = new class266();

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    private int field2922 = -1;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    private int field2923 = 0;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "([III)V")
    private final void method1238(int[] arg0, int arg1, int arg2) {
        for (class88 var4 = (class88) this.field2920.method1807(-99); var4 != null; var4 = (class88) this.field2920.method1808((byte) 42)) {
            var4.method686(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()Lmi;")
    public final class88 method193() {
        return (class88) this.field2920.method1807(-116);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([III)V")
    public final synchronized void method205(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2922 < 0) {
                this.method1238(arg0, arg1, arg2);
                return;
            }
            if (this.field2923 + arg2 < this.field2922) {
                this.field2923 += arg2;
                this.method1238(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2922 - this.field2923;
            this.method1238(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2923 += var4;
            this.method1243();
            class188 var5 = (class188) this.field2921.method1807(-104);
            synchronized (var5) {
                int var7 = var5.method1299(this);
                if (var7 < 0) {
                    var5.field3075 = 0;
                    this.method1244(var5);
                } else {
                    var5.field3075 = var7;
                    this.method1241(var5.field2407, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    private final void method1239(int arg0) {
        for (class88 var2 = (class88) this.field2920.method1807(-109); var2 != null; var2 = (class88) this.field2920.method1808((byte) 74)) {
            var2.method211(arg0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lmi;)V")
    public final synchronized void method1240(class88 arg0) {
        this.field2920.method1810(arg0, 7);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()I")
    public final int method208() {
        return 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lhb;Lvk;)V")
    private final void method1241(class146 arg0, class188 arg1) {
        while (this.field2921.field4249 != arg0 && ((class188) arg0).field3075 <= arg1.field3075) {
            arg0 = arg0.field2407;
        }
        class11.method76((byte) 83, arg1, arg0);
        this.field2922 = ((class188) this.field2921.field4249.field2407).field3075;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lmi;)V")
    public final synchronized void method1242(class88 arg0) {
        arg0.method1074((byte) -126);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()Lmi;")
    public final class88 method215() {
        return (class88) this.field2920.method1808((byte) 57);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()V")
    private final void method1243() {
        if (this.field2923 <= 0) {
            return;
        }
        for (class188 var1 = (class188) this.field2921.method1807(-120); var1 != null; var1 = (class188) this.field2921.method1808((byte) 125)) {
            var1.field3075 -= this.field2923;
        }
        this.field2922 -= this.field2923;
        this.field2923 = 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lvk;)V")
    private final void method1244(class188 arg0) {
        arg0.method1074((byte) -117);
        arg0.method1298();
        class146 var2 = this.field2921.field4249.field2407;
        if (this.field2921.field4249 == var2) {
            this.field2922 = -1;
        } else {
            this.field2922 = ((class188) var2).field3075;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final synchronized void method211(int arg0) {
        do {
            if (this.field2922 < 0) {
                this.method1239(arg0);
                return;
            }
            if (this.field2923 + arg0 < this.field2922) {
                this.field2923 += arg0;
                this.method1239(arg0);
                return;
            }
            int var2 = this.field2922 - this.field2923;
            this.method1239(var2);
            arg0 -= var2;
            this.field2923 += var2;
            this.method1243();
            class188 var3 = (class188) this.field2921.method1807(-108);
            synchronized (var3) {
                int var5 = var3.method1299(this);
                if (var5 < 0) {
                    var3.field3075 = 0;
                    this.method1244(var3);
                } else {
                    var3.field3075 = var5;
                    this.method1241(var3.field2407, var3);
                }
            }
        } while (arg0 != 0);
    }
}
