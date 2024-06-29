import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 extends class177 {

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lud;")
    private class2 field489 = new class2();

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lud;")
    private class2 field490 = new class2();

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    private int field491 = -1;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    private int field492 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "([III)V")
    public final synchronized void method178(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field491 < 0) {
                this.method242(arg0, arg1, arg2);
                return;
            }
            if (this.field492 + arg2 < this.field491) {
                this.field492 += arg2;
                this.method242(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field491 - this.field492;
            this.method242(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field492 += var4;
            this.method245();
            class144 var5 = (class144) this.field490.method6(-120);
            synchronized (var5) {
                int var7 = var5.method1046(this);
                if (var7 < 0) {
                    var5.field2145 = 0;
                    this.method246(var5);
                } else {
                    var5.field2145 = var7;
                    this.method241(var5.field2006, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()Lga;")
    public final class177 method152() {
        return (class177) this.field489.method11((byte) 51);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Llb;Ldg;)V")
    private final void method241(class134 arg0, class144 arg1) {
        while (this.field490.field27 != arg0 && ((class144) arg0).field2145 <= arg1.field2145) {
            arg0 = arg0.field2006;
        }
        class145.method1051(arg1, arg0, (byte) 106);
        this.field491 = ((class144) this.field490.field27.field2006).field2145;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "([III)V")
    private final void method242(int[] arg0, int arg1, int arg2) {
        for (class177 var4 = (class177) this.field489.method6(-126); var4 != null; var4 = (class177) this.field489.method11((byte) 69)) {
            var4.method1261(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    public final synchronized void method156(int arg0) {
        do {
            if (this.field491 < 0) {
                this.method247(arg0);
                return;
            }
            if (this.field492 + arg0 < this.field491) {
                this.field492 += arg0;
                this.method247(arg0);
                return;
            }
            int var2 = this.field491 - this.field492;
            this.method247(var2);
            arg0 -= var2;
            this.field492 += var2;
            this.method245();
            class144 var3 = (class144) this.field490.method6(-123);
            synchronized (var3) {
                int var5 = var3.method1046(this);
                if (var5 < 0) {
                    var3.field2145 = 0;
                    this.method246(var3);
                } else {
                    var3.field2145 = var5;
                    this.method241(var3.field2006, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lga;)V")
    public final synchronized void method243(class177 arg0) {
        arg0.method995((byte) 108);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Lga;)V")
    public final synchronized void method244(class177 arg0) {
        this.field489.method10(arg0, true);
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()V")
    private final void method245() {
        if (this.field492 <= 0) {
            return;
        }
        for (class144 var1 = (class144) this.field490.method6(-126); var1 != null; var1 = (class144) this.field490.method11((byte) 81)) {
            var1.field2145 -= this.field492;
        }
        this.field491 -= this.field492;
        this.field492 = 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()I")
    public final int method162() {
        return 0;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()Lga;")
    public final class177 method160() {
        return (class177) this.field489.method6(-110);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ldg;)V")
    private final void method246(class144 arg0) {
        arg0.method995((byte) 115);
        arg0.method1047();
        class134 var2 = this.field490.field27.field2006;
        if (this.field490.field27 == var2) {
            this.field491 = -1;
        } else {
            this.field491 = ((class144) var2).field2145;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    private final void method247(int arg0) {
        for (class177 var2 = (class177) this.field489.method6(-117); var2 != null; var2 = (class177) this.field489.method11((byte) 34)) {
            var2.method156(arg0);
        }
    }
}
