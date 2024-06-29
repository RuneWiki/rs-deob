import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class303 extends class363 {

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "Lci;")
    private class327 field4862 = new class327();

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Lci;")
    private class327 field4863 = new class327();

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    private int field4864 = -1;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    private int field4865 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljk;)V", line = 5)
    public final synchronized void method2162(class363 arg0) {
        this.field4862.method2299(false, arg0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()Ljk;", line = 8)
    public final class363 method47() {
        return (class363) this.field4862.method2306(-23);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Ljk;)V", line = 13)
    public final synchronized void method2163(class363 arg0) {
        arg0.method330(15);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()Ljk;", line = 18)
    public final class363 method43() {
        return (class363) this.field4862.method2300((byte) 112);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lec;Lni;)V", line = 23)
    private final void method2164(class45 arg0, class60 arg1) {
        while (this.field4863.field5199 != arg0 && ((class60) arg0).field1022 <= arg1.field1022) {
            arg0 = arg0.field708;
        }
        class314.method2220(arg0, arg1, (byte) -92);
        this.field4864 = ((class60) this.field4863.field5199.field708).field1022;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 32)
    private final void method2165(int arg0) {
        for (class363 var2 = (class363) this.field4862.method2300((byte) 97); var2 != null; var2 = (class363) this.field4862.method2306(-23)) {
            var2.method52(arg0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()V", line = 46)
    private final void method2166() {
        if (this.field4865 <= 0) {
            return;
        }
        for (class60 var1 = (class60) this.field4863.method2300((byte) 117); var1 != null; var1 = (class60) this.field4863.method2306(-23)) {
            var1.field1022 -= this.field4865;
        }
        this.field4864 -= this.field4865;
        this.field4865 = 0;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()I", line = 64)
    public final int method46() {
        return 0;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 71)
    public final synchronized void method52(int arg0) {
        do {
            if (this.field4864 < 0) {
                this.method2165(arg0);
                return;
            }
            if (this.field4865 + arg0 < this.field4864) {
                this.field4865 += arg0;
                this.method2165(arg0);
                return;
            }
            int var2 = this.field4864 - this.field4865;
            this.method2165(var2);
            arg0 -= var2;
            this.field4865 += var2;
            this.method2166();
            class60 var3 = (class60) this.field4863.method2300((byte) 120);
            synchronized (var3) {
                int var5 = var3.method502(this);
                if (var5 < 0) {
                    var3.field1022 = 0;
                    this.method2168(var3);
                } else {
                    var3.field1022 = var5;
                    this.method2164(var3.field708, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "([III)V", line = 125)
    public final synchronized void method53(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field4864 < 0) {
                this.method2167(arg0, arg1, arg2);
                return;
            }
            if (this.field4865 + arg2 < this.field4864) {
                this.field4865 += arg2;
                this.method2167(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field4864 - this.field4865;
            this.method2167(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field4865 += var4;
            this.method2166();
            class60 var5 = (class60) this.field4863.method2300((byte) 103);
            synchronized (var5) {
                int var7 = var5.method502(this);
                if (var7 < 0) {
                    var5.field1022 = 0;
                    this.method2168(var5);
                } else {
                    var5.field1022 = var7;
                    this.method2164(var5.field708, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "([III)V", line = 171)
    private final void method2167(int[] arg0, int arg1, int arg2) {
        for (class363 var4 = (class363) this.field4862.method2300((byte) 99); var4 != null; var4 = (class363) this.field4862.method2306(-23)) {
            var4.method2542(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lni;)V", line = 183)
    private final void method2168(class60 arg0) {
        arg0.method330(15);
        arg0.method503();
        class45 var2 = this.field4863.field5199.field708;
        if (this.field4863.field5199 == var2) {
            this.field4864 = -1;
        } else {
            this.field4864 = ((class60) var2).field1022;
        }
    }
}
