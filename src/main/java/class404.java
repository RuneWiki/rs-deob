import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class404 extends class375 {

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Lat;")
    private class412 field5885 = new class412();

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "Lat;")
    private class412 field5886 = new class412();

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    private int field5887 = 0;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    private int field5888 = -1;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Luh;)V", line = 3)
    public final synchronized void method2415(class375 arg0) {
        arg0.method283(2);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lvb;)V", line = 8)
    private final void method2416(class215 arg0) {
        arg0.method283(2);
        arg0.method1435();
        class35 var2 = this.field5886.field5951.field434;
        if (this.field5886.field5951 == var2) {
            this.field5888 = -1;
        } else {
            this.field5888 = ((class215) var2).field3211;
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 23)
    private final void method2417(int arg0) {
        for (class375 var2 = (class375) this.field5885.method2456(32101); var2 != null; var2 = (class375) this.field5885.method2461(301)) {
            var2.method58(arg0);
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()Luh;", line = 32)
    public final class375 method86() {
        return (class375) this.field5885.method2456(32101);
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "()Luh;", line = 37)
    public final class375 method85() {
        return (class375) this.field5885.method2461(301);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Luh;)V", line = 44)
    public final synchronized void method2418(class375 arg0) {
        this.field5885.method2465((byte) 108, arg0);
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V", line = 54)
    public final synchronized void method58(int arg0) {
        do {
            if (this.field5888 < 0) {
                this.method2417(arg0);
                return;
            }
            if (this.field5887 + arg0 < this.field5888) {
                this.field5887 += arg0;
                this.method2417(arg0);
                return;
            }
            int var2 = this.field5888 - this.field5887;
            this.method2417(var2);
            arg0 -= var2;
            this.field5887 += var2;
            this.method2421();
            class215 var3 = (class215) this.field5886.method2456(32101);
            synchronized (var3) {
                int var5 = var3.method1434(this);
                if (var5 < 0) {
                    var3.field3211 = 0;
                    this.method2416(var3);
                } else {
                    var3.field3211 = var5;
                    this.method2420(var3.field434, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "([III)V", line = 101)
    private final void method2419(int[] arg0, int arg1, int arg2) {
        for (class375 var4 = (class375) this.field5885.method2456(32101); var4 != null; var4 = (class375) this.field5885.method2461(301)) {
            var4.method2312(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "([III)V", line = 116)
    public final synchronized void method48(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5888 < 0) {
                this.method2419(arg0, arg1, arg2);
                return;
            }
            if (this.field5887 + arg2 < this.field5888) {
                this.field5887 += arg2;
                this.method2419(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5888 - this.field5887;
            this.method2419(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5887 += var4;
            this.method2421();
            class215 var5 = (class215) this.field5886.method2456(32101);
            synchronized (var5) {
                int var7 = var5.method1434(this);
                if (var7 < 0) {
                    var5.field3211 = 0;
                    this.method2416(var5);
                } else {
                    var5.field3211 = var7;
                    this.method2420(var5.field434, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "()I", line = 161)
    public final int method49() {
        return 0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfi;Lvb;)V", line = 176)
    private final void method2420(class35 arg0, class215 arg1) {
        while (this.field5886.field5951 != arg0 && ((class215) arg0).field3211 <= arg1.field3211) {
            arg0 = arg0.field434;
        }
        class313.method1936(119, arg1, arg0);
        this.field5888 = ((class215) this.field5886.field5951.field434).field3211;
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "()V", line = 183)
    private final void method2421() {
        if (this.field5887 <= 0) {
            return;
        }
        for (class215 var1 = (class215) this.field5886.method2456(32101); var1 != null; var1 = (class215) this.field5886.method2461(301)) {
            var1.field3211 -= this.field5887;
        }
        this.field5888 -= this.field5887;
        this.field5887 = 0;
    }
}
