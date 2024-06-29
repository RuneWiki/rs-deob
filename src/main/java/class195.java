import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class195 extends class69 {

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lbo;")
    private class16 field2824 = new class16();

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lbo;")
    private class16 field2825 = new class16();

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    private int field2826 = -1;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    private int field2827 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lpn;)V", line = 3)
    private final void method1393(class156 arg0) {
        arg0.method876(8);
        arg0.method1131();
        class117 var2 = this.field2825.field272.field1659;
        if (this.field2825.field272 == var2) {
            this.field2826 = -1;
        } else {
            this.field2826 = ((class156) var2).field2257;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()I", line = 16)
    public final int method558() {
        return 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lmg;Lpn;)V", line = 19)
    private final void method1394(class117 arg0, class156 arg1) {
        while (this.field2825.field272 != arg0 && ((class156) arg0).field2257 <= arg1.field2257) {
            arg0 = arg0.field1659;
        }
        class41.method308(arg0, arg1, (byte) -80);
        this.field2826 = ((class156) this.field2825.field272.field1659).field2257;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 30)
    public final synchronized void method562(int arg0) {
        do {
            if (this.field2826 < 0) {
                this.method1399(arg0);
                return;
            }
            if (this.field2827 + arg0 < this.field2826) {
                this.field2827 += arg0;
                this.method1399(arg0);
                return;
            }
            int var2 = this.field2826 - this.field2827;
            this.method1399(var2);
            arg0 -= var2;
            this.field2827 += var2;
            this.method1395();
            class156 var3 = (class156) this.field2825.method93((byte) -25);
            synchronized (var3) {
                int var5 = var3.method1130(this);
                if (var5 < 0) {
                    var3.field2257 = 0;
                    this.method1393(var3);
                } else {
                    var3.field2257 = var5;
                    this.method1394(var3.field1659, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()V", line = 74)
    private final void method1395() {
        if (this.field2827 <= 0) {
            return;
        }
        for (class156 var1 = (class156) this.field2825.method93((byte) -109); var1 != null; var1 = (class156) this.field2825.method97(-51)) {
            var1.field2257 -= this.field2827;
        }
        this.field2826 -= this.field2827;
        this.field2827 = 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()Lvc;", line = 95)
    public final class69 method556() {
        return (class69) this.field2824.method97(-55);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "([III)V", line = 102)
    private final void method1396(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field2824.method93((byte) -74); var4 != null; var4 = (class69) this.field2824.method97(-81)) {
            var4.method557(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lvc;)V", line = 111)
    public final synchronized void method1397(class69 arg0) {
        arg0.method876(8);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Lvc;)V", line = 119)
    public final synchronized void method1398(class69 arg0) {
        this.field2824.method99(arg0, (byte) 33);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()Lvc;", line = 122)
    public final class69 method559() {
        return (class69) this.field2824.method93((byte) -127);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 135)
    private final void method1399(int arg0) {
        for (class69 var2 = (class69) this.field2824.method93((byte) -76); var2 != null; var2 = (class69) this.field2824.method97(-73)) {
            var2.method562(arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([III)V", line = 148)
    public final synchronized void method560(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2826 < 0) {
                this.method1396(arg0, arg1, arg2);
                return;
            }
            if (this.field2827 + arg2 < this.field2826) {
                this.field2827 += arg2;
                this.method1396(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2826 - this.field2827;
            this.method1396(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2827 += var4;
            this.method1395();
            class156 var5 = (class156) this.field2825.method93((byte) -88);
            synchronized (var5) {
                int var7 = var5.method1130(this);
                if (var7 < 0) {
                    var5.field2257 = 0;
                    this.method1393(var5);
                } else {
                    var5.field2257 = var7;
                    this.method1394(var5.field1659, var5);
                }
            }
        } while (arg2 != 0);
    }
}
