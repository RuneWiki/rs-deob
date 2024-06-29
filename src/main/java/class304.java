import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class304 extends class461 {

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Loe;")
    private class183 field4061 = new class183();

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Loe;")
    private class183 field4062 = new class183();

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    private int field4063 = 0;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    private int field4064 = -1;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lpba;)V")
    private final void method1801(class303 arg0) {
        arg0.method3045(true);
        arg0.method1800();
        class513 var2 = this.field4062.field2232.field7520;
        if (this.field4062.field2232 == var2) {
            this.field4064 = -1;
        } else {
            this.field4064 = ((class303) var2).field4060;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lmi;)V")
    public final synchronized void method1802(class461 arg0) {
        this.field4061.method1133(arg0, -121);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final synchronized void method1225(int arg0) {
        do {
            if (this.field4064 < 0) {
                this.method1803(arg0);
                return;
            }
            if (this.field4063 + arg0 < this.field4064) {
                this.field4063 += arg0;
                this.method1803(arg0);
                return;
            }
            int var2 = this.field4064 - this.field4063;
            this.method1803(var2);
            arg0 -= var2;
            this.field4063 += var2;
            this.method1808();
            class303 var3 = (class303) this.field4062.method1132((byte) -111);
            synchronized (var3) {
                int var5 = var3.method1799(this);
                if (var5 < 0) {
                    var3.field4060 = 0;
                    this.method1801(var3);
                } else {
                    var3.field4060 = var5;
                    this.method1807(var3.field7520, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    private final void method1803(int arg0) {
        for (class461 var2 = (class461) this.field4061.method1132((byte) -102); var2 != null; var2 = (class461) this.field4061.method1134(8446)) {
            var2.method1225(arg0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lmi;")
    public final class461 method1229() {
        return (class461) this.field4061.method1132((byte) -118);
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()I")
    public final int method1223() {
        return 0;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "([III)V")
    private final void method1804(int[] arg0, int arg1, int arg2) {
        for (class461 var4 = (class461) this.field4061.method1132((byte) 101); var4 != null; var4 = (class461) this.field4061.method1134(8446)) {
            var4.method2718(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([III)V")
    public final synchronized void method1228(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4064 < 0) {
                this.method1804(arg0, arg1, arg2);
                return;
            }
            if (this.field4063 + arg2 < this.field4064) {
                this.field4063 += arg2;
                this.method1804(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4064 - this.field4063;
            this.method1804(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4063 += var4;
            this.method1808();
            class303 var5 = (class303) this.field4062.method1132((byte) -119);
            synchronized (var5) {
                int var7 = var5.method1799(this);
                if (var7 < 0) {
                    var5.field4060 = 0;
                    this.method1801(var5);
                } else {
                    var5.field4060 = var7;
                    this.method1807(var5.field7520, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()Lmi;")
    public final class461 method1221() {
        return (class461) this.field4061.method1134(8446);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lmi;)V")
    public final synchronized void method1805(class461 arg0) {
        arg0.method3045(true);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()I")
    public final synchronized int method1806() {
        return this.field4061.method1142(-22382);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lii;Lpba;)V")
    private final void method1807(class513 arg0, class303 arg1) {
        while (this.field4062.field2232 != arg0 && ((class303) arg0).field4060 <= arg1.field4060) {
            arg0 = arg0.field7520;
        }
        class55.method577(arg0, arg1, (byte) 42);
        this.field4064 = ((class303) this.field4062.field2232.field7520).field4060;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "()V")
    private final void method1808() {
        if (this.field4063 <= 0) {
            return;
        }
        for (class303 var1 = (class303) this.field4062.method1132((byte) 62); var1 != null; var1 = (class303) this.field4062.method1134(8446)) {
            var1.field4060 -= this.field4063;
        }
        this.field4064 -= this.field4063;
        this.field4063 = 0;
    }
}
