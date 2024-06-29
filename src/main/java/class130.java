import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class5 {

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Lcd;")
    private class19 field2862 = new class19();

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Lcd;")
    private class19 field2863 = new class19();

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    private int field2865 = 0;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    private int field2864 = -1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lad;)V")
    public final synchronized void method1049(class5 arg0) {
        this.field2862.method194(22, arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
    public final synchronized void method48(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2864 < 0) {
                this.method1051(arg0, arg1, arg2);
                return;
            }
            if (this.field2865 + arg2 < this.field2864) {
                this.field2865 += arg2;
                this.method1051(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2864 - this.field2865;
            this.method1051(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2865 += var4;
            this.method1055();
            class10 var5 = (class10) this.field2863.method195((byte) 103);
            synchronized (var5) {
                int var7 = var5.method89(this);
                if (var7 < 0) {
                    var5.field234 = 0;
                    this.method1050(var5);
                } else {
                    var5.field234 = var7;
                    this.method1053(var5.field263, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lbb;)V")
    private final void method1050(class10 arg0) {
        arg0.method101((byte) 114);
        arg0.method88();
        class12 var2 = this.field2863.field483.field263;
        if (this.field2863.field483 == var2) {
            this.field2864 = -1;
        } else {
            this.field2864 = ((class10) var2).field234;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "([III)V")
    private final void method1051(int[] arg0, int arg1, int arg2) {
        for (class5 var4 = (class5) this.field2862.method195((byte) 109); var4 != null; var4 = (class5) this.field2862.method198((byte) -111)) {
            var4.method52(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public final synchronized void method49(int arg0) {
        do {
            if (this.field2864 < 0) {
                this.method1052(arg0);
                return;
            }
            if (this.field2865 + arg0 < this.field2864) {
                this.field2865 += arg0;
                this.method1052(arg0);
                return;
            }
            int var2 = this.field2864 - this.field2865;
            this.method1052(var2);
            arg0 -= var2;
            this.field2865 += var2;
            this.method1055();
            class10 var3 = (class10) this.field2863.method195((byte) 110);
            synchronized (var3) {
                int var5 = var3.method89(this);
                if (var5 < 0) {
                    var3.field234 = 0;
                    this.method1050(var3);
                } else {
                    var3.field234 = var5;
                    this.method1053(var3.field263, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()Lad;")
    public final class5 method53() {
        return (class5) this.field2862.method195((byte) 126);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()Lad;")
    public final class5 method50() {
        return (class5) this.field2862.method198((byte) -52);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
    public final int method47() {
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    private final void method1052(int arg0) {
        for (class5 var2 = (class5) this.field2862.method195((byte) 115); var2 != null; var2 = (class5) this.field2862.method198((byte) -87)) {
            var2.method49(arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lbd;Lbb;)V")
    private final void method1053(class12 arg0, class10 arg1) {
        while (this.field2863.field483 != arg0 && ((class10) arg0).field234 <= arg1.field234) {
            arg0 = arg0.field263;
        }
        this.field2863.method187(arg1, (byte) -112, arg0);
        this.field2864 = ((class10) this.field2863.field483.field263).field234;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Lad;)V")
    public final synchronized void method1054(class5 arg0) {
        arg0.method101((byte) 81);
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "()V")
    private final void method1055() {
        if (this.field2865 <= 0) {
            return;
        }
        for (class10 var1 = (class10) this.field2863.method195((byte) 111); var1 != null; var1 = (class10) this.field2863.method198((byte) -87)) {
            var1.field234 -= this.field2865;
        }
        this.field2864 -= this.field2865;
        this.field2865 = 0;
    }
}
