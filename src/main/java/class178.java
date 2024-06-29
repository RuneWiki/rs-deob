import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class178 extends class177 {

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lma;")
    private class5 field2899 = new class5();

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lma;")
    private class5 field2900 = new class5();

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    private int field2901 = -1;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    private int field2902 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ltb;)V", line = 11)
    public final synchronized void method1313(class177 arg0) {
        arg0.method2028(13329);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Ltb;)V", line = 16)
    public final synchronized void method1314(class177 arg0) {
        this.field2899.method28(arg0, 11759);
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()V", line = 19)
    private final void method1315() {
        if (this.field2902 <= 0) {
            return;
        }
        for (class330 var1 = (class330) this.field2900.method22((byte) 120); var1 != null; var1 = (class330) this.field2900.method26((byte) -122)) {
            var1.field5155 -= this.field2902;
        }
        this.field2901 -= this.field2902;
        this.field2902 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lwn;)V", line = 36)
    private final void method1316(class330 arg0) {
        arg0.method2028(13329);
        arg0.method2308();
        class287 var2 = this.field2900.field50.field4427;
        if (this.field2900.field50 == var2) {
            this.field2901 = -1;
        } else {
            this.field2901 = ((class330) var2).field5155;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 53)
    public final synchronized void method157(int arg0) {
        do {
            if (this.field2901 < 0) {
                this.method1318(arg0);
                return;
            }
            if (this.field2902 + arg0 < this.field2901) {
                this.field2902 += arg0;
                this.method1318(arg0);
                return;
            }
            int var2 = this.field2901 - this.field2902;
            this.method1318(var2);
            arg0 -= var2;
            this.field2902 += var2;
            this.method1315();
            class330 var3 = (class330) this.field2900.method22((byte) 119);
            synchronized (var3) {
                int var5 = var3.method2307(this);
                if (var5 < 0) {
                    var3.field5155 = 0;
                    this.method1316(var3);
                } else {
                    var3.field5155 = var5;
                    this.method1319(var3.field4427, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "([III)V", line = 104)
    private final void method1317(int[] arg0, int arg1, int arg2) {
        for (class177 var4 = (class177) this.field2899.method22((byte) 119); var4 != null; var4 = (class177) this.field2899.method26((byte) -121)) {
            var4.method1312(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()Ltb;", line = 114)
    public final class177 method178() {
        return (class177) this.field2899.method26((byte) -115);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V", line = 120)
    private final void method1318(int arg0) {
        for (class177 var2 = (class177) this.field2899.method22((byte) 120); var2 != null; var2 = (class177) this.field2899.method26((byte) -121)) {
            var2.method157(arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([III)V", line = 133)
    public final synchronized void method179(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2901 < 0) {
                this.method1317(arg0, arg1, arg2);
                return;
            }
            if (this.field2902 + arg2 < this.field2901) {
                this.field2902 += arg2;
                this.method1317(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2901 - this.field2902;
            this.method1317(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2902 += var4;
            this.method1315();
            class330 var5 = (class330) this.field2900.method22((byte) 119);
            synchronized (var5) {
                int var7 = var5.method2307(this);
                if (var7 < 0) {
                    var5.field5155 = 0;
                    this.method1316(var5);
                } else {
                    var5.field5155 = var7;
                    this.method1319(var5.field4427, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()I", line = 177)
    public final int method153() {
        return 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lmh;Lwn;)V", line = 180)
    private final void method1319(class287 arg0, class330 arg1) {
        while (this.field2900.field50 != arg0 && ((class330) arg0).field5155 <= arg1.field5155) {
            arg0 = arg0.field4427;
        }
        class335.method2329((byte) 112, arg0, arg1);
        this.field2901 = ((class330) this.field2900.field50.field4427).field5155;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()Ltb;", line = 187)
    public final class177 method187() {
        return (class177) this.field2899.method22((byte) 125);
    }
}
