import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class8 extends class65 {

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Lan;")
    private class337 field110 = new class337();

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Lan;")
    private class337 field111 = new class337();

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    private int field112 = -1;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    private int field113 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lfb;)V", line = 4)
    public final synchronized void method27(class65 arg0) {
        arg0.method2285(true);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "([III)V", line = 11)
    private final void method28(int[] arg0, int arg1, int arg2) {
        for (class65 var4 = (class65) this.field110.method2331((byte) 77); var4 != null; var4 = (class65) this.field110.method2332(-112)) {
            var4.method407(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "()V", line = 20)
    private final void method29() {
        if (this.field113 <= 0) {
            return;
        }
        for (class151 var1 = (class151) this.field111.method2331((byte) 106); var1 != null; var1 = (class151) this.field111.method2332(-79)) {
            var1.field2089 -= this.field113;
        }
        this.field112 -= this.field113;
        this.field113 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "()Lfb;", line = 39)
    public final class65 method30() {
        return (class65) this.field110.method2331((byte) 100);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lfb;)V", line = 46)
    public final synchronized void method31(class65 arg0) {
        this.field110.method2330(arg0, (byte) 80);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ld;)V", line = 51)
    private final void method32(class151 arg0) {
        arg0.method2285(true);
        arg0.method1012();
        class332 var2 = this.field111.field5201.field5073;
        if (this.field111.field5201 == var2) {
            this.field112 = -1;
        } else {
            this.field112 = ((class151) var2).field2089;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()Lfb;", line = 65)
    public final class65 method33() {
        return (class65) this.field110.method2332(-118);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "([III)V", line = 74)
    public final synchronized void method34(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field112 < 0) {
                this.method28(arg0, arg1, arg2);
                return;
            }
            if (this.field113 + arg2 < this.field112) {
                this.field113 += arg2;
                this.method28(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field112 - this.field113;
            this.method28(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field113 += var4;
            this.method29();
            class151 var5 = (class151) this.field111.method2331((byte) 8);
            synchronized (var5) {
                int var7 = var5.method1013(this);
                if (var7 < 0) {
                    var5.field2089 = 0;
                    this.method32(var5);
                } else {
                    var5.field2089 = var7;
                    this.method38(var5.field5073, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 121)
    public final synchronized void method35(int arg0) {
        do {
            if (this.field112 < 0) {
                this.method36(arg0);
                return;
            }
            if (this.field113 + arg0 < this.field112) {
                this.field113 += arg0;
                this.method36(arg0);
                return;
            }
            int var2 = this.field112 - this.field113;
            this.method36(var2);
            arg0 -= var2;
            this.field113 += var2;
            this.method29();
            class151 var3 = (class151) this.field111.method2331((byte) 104);
            synchronized (var3) {
                int var5 = var3.method1013(this);
                if (var5 < 0) {
                    var3.field2089 = 0;
                    this.method32(var3);
                } else {
                    var3.field2089 = var5;
                    this.method38(var3.field5073, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)V", line = 167)
    private final void method36(int arg0) {
        for (class65 var2 = (class65) this.field110.method2331((byte) 71); var2 != null; var2 = (class65) this.field110.method2332(-34)) {
            var2.method35(arg0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "()I", line = 178)
    public final int method37() {
        return 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lsi;Ld;)V", line = 183)
    private final void method38(class332 arg0, class151 arg1) {
        while (this.field111.field5201 != arg0 && ((class151) arg0).field2089 <= arg1.field2089) {
            arg0 = arg0.field5073;
        }
        class272.method1970((byte) -99, arg0, arg1);
        this.field112 = ((class151) this.field111.field5201.field5073).field2089;
    }
}
