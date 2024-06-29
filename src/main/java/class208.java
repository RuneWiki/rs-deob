import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class208 extends class1 {

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Ljo;")
    private class150 field3156 = new class150();

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Ljo;")
    private class150 field3157 = new class150();

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    private int field3158 = -1;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private int field3159 = 0;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lro;)V", line = 5)
    public final synchronized void method1412(class1 arg0) {
        arg0.method1131(8);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()Lro;", line = 10)
    public final class1 method3() {
        return (class1) this.field3156.method1081(104);
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()I", line = 13)
    public final int method7() {
        return 0;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 18)
    private final void method1413(int arg0) {
        for (class1 var2 = (class1) this.field3156.method1081(-72); var2 != null; var2 = (class1) this.field3156.method1083((byte) 113)) {
            var2.method5(arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Lro;)V", line = 30)
    public final synchronized void method1414(class1 arg0) {
        this.field3156.method1078(arg0, (byte) 31);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)V", line = 37)
    public final synchronized void method4(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3158 < 0) {
                this.method1418(arg0, arg1, arg2);
                return;
            }
            if (this.field3159 + arg2 < this.field3158) {
                this.field3159 += arg2;
                this.method1418(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3158 - this.field3159;
            this.method1418(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3159 += var4;
            this.method1416();
            class252 var5 = (class252) this.field3157.method1081(8);
            synchronized (var5) {
                int var7 = var5.method1791(this);
                if (var7 < 0) {
                    var5.field4014 = 0;
                    this.method1415(var5);
                } else {
                    var5.field4014 = var7;
                    this.method1417(var5.field2551, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 89)
    public final synchronized void method5(int arg0) {
        do {
            if (this.field3158 < 0) {
                this.method1413(arg0);
                return;
            }
            if (this.field3159 + arg0 < this.field3158) {
                this.field3159 += arg0;
                this.method1413(arg0);
                return;
            }
            int var2 = this.field3158 - this.field3159;
            this.method1413(var2);
            arg0 -= var2;
            this.field3159 += var2;
            this.method1416();
            class252 var3 = (class252) this.field3157.method1081(96);
            synchronized (var3) {
                int var5 = var3.method1791(this);
                if (var5 < 0) {
                    var3.field4014 = 0;
                    this.method1415(var3);
                } else {
                    var3.field4014 = var5;
                    this.method1417(var3.field2551, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lac;)V", line = 134)
    private final void method1415(class252 arg0) {
        arg0.method1131(8);
        arg0.method1790();
        class159 var2 = this.field3157.field2418.field2551;
        if (this.field3157.field2418 == var2) {
            this.field3158 = -1;
        } else {
            this.field3158 = ((class252) var2).field4014;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()Lro;", line = 149)
    public final class1 method1() {
        return (class1) this.field3156.method1083((byte) 113);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "()V", line = 158)
    private final void method1416() {
        if (this.field3159 <= 0) {
            return;
        }
        for (class252 var1 = (class252) this.field3157.method1081(-127); var1 != null; var1 = (class252) this.field3157.method1083((byte) 113)) {
            var1.field4014 -= this.field3159;
        }
        this.field3158 -= this.field3159;
        this.field3159 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lak;Lac;)V", line = 176)
    private final void method1417(class159 arg0, class252 arg1) {
        while (this.field3157.field2418 != arg0 && ((class252) arg0).field4014 <= arg1.field4014) {
            arg0 = arg0.field2551;
        }
        class207.method1406(-10090, arg1, arg0);
        this.field3158 = ((class252) this.field3157.field2418.field2551).field4014;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "([III)V", line = 186)
    private final void method1418(int[] arg0, int arg1, int arg2) {
        for (class1 var4 = (class1) this.field3156.method1081(124); var4 != null; var4 = (class1) this.field3156.method1083((byte) 113)) {
            var4.method6(arg0, arg1, arg2);
        }
    }
}
