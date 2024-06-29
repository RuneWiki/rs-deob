import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class212 extends class48 {

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lwo;")
    private class445 field2811 = new class445();

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lwo;")
    private class445 field2812 = new class445();

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    private int field2813 = 0;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    private int field2814 = -1;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljca;Lep;)V")
    private final void method1340(class45 arg0, class416 arg1) {
        while (this.field2812.field5887 != arg0 && ((class416) arg0).field5479 <= arg1.field5479) {
            arg0 = arg0.field548;
        }
        class358.method2103(arg1, 13600, arg0);
        this.field2814 = ((class416) this.field2812.field5887.field548).field5479;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Leg;)V")
    public final synchronized void method1341(class48 arg0) {
        this.field2811.method2501(10020, arg0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lep;)V")
    private final void method1342(class416 arg0) {
        arg0.method242(true);
        arg0.method2360();
        class45 var2 = this.field2812.field5887.field548;
        if (this.field2812.field5887 == var2) {
            this.field2814 = -1;
        } else {
            this.field2814 = ((class416) var2).field5479;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "()I")
    public final synchronized int method1343() {
        return this.field2811.method2503(-82);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "([III)V")
    private final void method1344(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field2811.method2506(68); var4 != null; var4 = (class48) this.field2811.method2505(-126)) {
            var4.method258(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Leg;)V")
    public final synchronized void method1345(class48 arg0) {
        arg0.method242(true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final synchronized void method255(int arg0) {
        do {
            if (this.field2814 < 0) {
                this.method1346(arg0);
                return;
            }
            if (this.field2813 + arg0 < this.field2814) {
                this.field2813 += arg0;
                this.method1346(arg0);
                return;
            }
            int var2 = this.field2814 - this.field2813;
            this.method1346(var2);
            arg0 -= var2;
            this.field2813 += var2;
            this.method1347();
            class416 var3 = (class416) this.field2812.method2506(68);
            synchronized (var3) {
                int var5 = var3.method2359(this);
                if (var5 < 0) {
                    var3.field5479 = 0;
                    this.method1342(var3);
                } else {
                    var3.field5479 = var5;
                    this.method1340(var3.field548, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()I")
    public final int method252() {
        return 0;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    private final void method1346(int arg0) {
        for (class48 var2 = (class48) this.field2811.method2506(68); var2 != null; var2 = (class48) this.field2811.method2505(-121)) {
            var2.method255(arg0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([III)V")
    public final synchronized void method253(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2814 < 0) {
                this.method1344(arg0, arg1, arg2);
                return;
            }
            if (this.field2813 + arg2 < this.field2814) {
                this.field2813 += arg2;
                this.method1344(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2814 - this.field2813;
            this.method1344(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2813 += var4;
            this.method1347();
            class416 var5 = (class416) this.field2812.method2506(68);
            synchronized (var5) {
                int var7 = var5.method2359(this);
                if (var7 < 0) {
                    var5.field5479 = 0;
                    this.method1342(var5);
                } else {
                    var5.field5479 = var7;
                    this.method1340(var5.field548, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()Leg;")
    public final class48 method257() {
        return (class48) this.field2811.method2506(68);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()Leg;")
    public final class48 method254() {
        return (class48) this.field2811.method2505(-119);
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "()V")
    private final void method1347() {
        if (this.field2813 <= 0) {
            return;
        }
        for (class416 var1 = (class416) this.field2812.method2506(68); var1 != null; var1 = (class416) this.field2812.method2505(-127)) {
            var1.field5479 -= this.field2813;
        }
        this.field2814 -= this.field2813;
        this.field2813 = 0;
    }
}
