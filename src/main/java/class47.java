import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class47 extends class174 {

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lrk;")
    private class257 field1027 = new class257();

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Lrk;")
    private class257 field1028 = new class257();

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    private int field1030 = 0;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    private int field1029 = -1;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()Lk;")
    public final class174 method276() {
        return (class174) this.field1027.method1740(-8843);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lce;Lgf;)V")
    private final void method365(class207 arg0, class120 arg1) {
        while (this.field1028.field4556 != arg0 && ((class120) arg0).field2342 <= arg1.field2342) {
            arg0 = arg0.field3765;
        }
        class22.method164(false, arg0, arg1);
        this.field1029 = ((class120) this.field1028.field4556.field3765).field2342;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()I")
    public final int method302() {
        return 0;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public final synchronized void method277(int arg0) {
        do {
            if (this.field1029 < 0) {
                this.method369(arg0);
                return;
            }
            if (this.field1030 + arg0 < this.field1029) {
                this.field1030 += arg0;
                this.method369(arg0);
                return;
            }
            int var2 = this.field1029 - this.field1030;
            this.method369(var2);
            arg0 -= var2;
            this.field1030 += var2;
            this.method370();
            class120 var3 = (class120) this.field1028.method1737((byte) 74);
            synchronized (var3) {
                int var5 = var3.method852(this);
                if (var5 < 0) {
                    var3.field2342 = 0;
                    this.method367(var3);
                } else {
                    var3.field2342 = var5;
                    this.method365(var3.field3765, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lk;)V")
    public final synchronized void method366(class174 arg0) {
        arg0.method1477(1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lgf;)V")
    private final void method367(class120 arg0) {
        arg0.method1477(1);
        arg0.method851();
        class207 var2 = this.field1028.field4556.field3765;
        if (this.field1028.field4556 == var2) {
            this.field1029 = -1;
        } else {
            this.field1029 = ((class120) var2).field2342;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "([III)V")
    private final void method368(int[] arg0, int arg1, int arg2) {
        for (class174 var4 = (class174) this.field1027.method1737((byte) 74); var4 != null; var4 = (class174) this.field1027.method1740(-8843)) {
            var4.method1238(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    private final void method369(int arg0) {
        for (class174 var2 = (class174) this.field1027.method1737((byte) 74); var2 != null; var2 = (class174) this.field1027.method1740(-8843)) {
            var2.method277(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()V")
    private final void method370() {
        if (this.field1030 <= 0) {
            return;
        }
        for (class120 var1 = (class120) this.field1028.method1737((byte) 74); var1 != null; var1 = (class120) this.field1028.method1740(-8843)) {
            var1.field2342 -= this.field1030;
        }
        this.field1029 -= this.field1030;
        this.field1030 = 0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "([III)V")
    public final synchronized void method281(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1029 < 0) {
                this.method368(arg0, arg1, arg2);
                return;
            }
            if (this.field1030 + arg2 < this.field1029) {
                this.field1030 += arg2;
                this.method368(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1029 - this.field1030;
            this.method368(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1030 += var4;
            this.method370();
            class120 var5 = (class120) this.field1028.method1737((byte) 74);
            synchronized (var5) {
                int var7 = var5.method852(this);
                if (var7 < 0) {
                    var5.field2342 = 0;
                    this.method367(var5);
                } else {
                    var5.field2342 = var7;
                    this.method365(var5.field3765, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()Lk;")
    public final class174 method283() {
        return (class174) this.field1027.method1737((byte) 74);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Lk;)V")
    public final synchronized void method371(class174 arg0) {
        this.field1027.method1738(arg0, (byte) -117);
    }
}
