import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class113 extends class117 {

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lie;")
    private class61 field2808 = new class61();

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Lie;")
    private class61 field2809 = new class61();

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    private int field2810 = 0;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    private int field2811 = -1;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lqf;)V")
    public final synchronized void method916(class117 arg0) {
        arg0.method1147((byte) -72);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lue;Lbb;)V")
    private final void method917(class141 arg0, class10 arg1) {
        while (this.field2809.field1598 != arg0 && ((class10) arg0).field318 <= arg1.field318) {
            arg0 = arg0.field3506;
        }
        this.field2809.method508(arg1, arg0, (byte) 106);
        this.field2811 = ((class10) this.field2809.field1598.field3506).field318;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()Lqf;")
    public final class117 method454() {
        return (class117) this.field2808.method517(-114);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    private final void method918(int arg0) {
        for (class117 var2 = (class117) this.field2808.method514((byte) -79); var2 != null; var2 = (class117) this.field2808.method517(-50)) {
            var2.method470(arg0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public final synchronized void method470(int arg0) {
        do {
            if (this.field2811 < 0) {
                this.method918(arg0);
                return;
            }
            if (this.field2810 + arg0 < this.field2811) {
                this.field2810 += arg0;
                this.method918(arg0);
                return;
            }
            int var2 = this.field2811 - this.field2810;
            this.method918(var2);
            arg0 -= var2;
            this.field2810 += var2;
            this.method920();
            class10 var3 = (class10) this.field2809.method514((byte) -79);
            synchronized (var3) {
                int var5 = var3.method95(this);
                if (var5 < 0) {
                    var3.field318 = 0;
                    this.method919(var3);
                } else {
                    var3.field318 = var5;
                    this.method917(var3.field3506, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lbb;)V")
    private final void method919(class10 arg0) {
        arg0.method1147((byte) -64);
        arg0.method94();
        class141 var2 = this.field2809.field1598.field3506;
        if (this.field2809.field1598 == var2) {
            this.field2811 = -1;
        } else {
            this.field2811 = ((class10) var2).field318;
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()V")
    private final void method920() {
        if (this.field2810 <= 0) {
            return;
        }
        for (class10 var1 = (class10) this.field2809.method514((byte) -79); var1 != null; var1 = (class10) this.field2809.method517(-49)) {
            var1.field318 -= this.field2810;
        }
        this.field2811 -= this.field2810;
        this.field2810 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "([III)V")
    private final void method921(int[] arg0, int arg1, int arg2) {
        for (class117 var4 = (class117) this.field2808.method514((byte) -79); var4 != null; var4 = (class117) this.field2808.method517(-110)) {
            var4.method1020(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lqf;")
    public final class117 method468() {
        return (class117) this.field2808.method514((byte) -79);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lqf;)V")
    public final synchronized void method922(class117 arg0) {
        this.field2808.method510(-29474, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([III)V")
    public final synchronized void method463(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2811 < 0) {
                this.method921(arg0, arg1, arg2);
                return;
            }
            if (this.field2810 + arg2 < this.field2811) {
                this.field2810 += arg2;
                this.method921(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2811 - this.field2810;
            this.method921(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2810 += var4;
            this.method920();
            class10 var5 = (class10) this.field2809.method514((byte) -79);
            synchronized (var5) {
                int var7 = var5.method95(this);
                if (var7 < 0) {
                    var5.field318 = 0;
                    this.method919(var5);
                } else {
                    var5.field318 = var7;
                    this.method917(var5.field3506, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()I")
    public final int method447() {
        return 0;
    }
}
