import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class351 extends class412 {

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "Lkn;")
    private class442 field5087 = new class442();

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Lkn;")
    private class442 field5088 = new class442();

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    private int field5089 = 0;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    private int field5090 = -1;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lkb;)V", line = 7)
    public final synchronized void method2291(class412 arg0) {
        this.field5087.method2758(0, arg0);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "([III)V", line = 13)
    private final void method2292(int[] arg0, int arg1, int arg2) {
        for (class412 var4 = (class412) this.field5087.method2752(-57); var4 != null; var4 = (class412) this.field5087.method2754(-1)) {
            var4.method2606(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([III)V", line = 28)
    public final synchronized void method724(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field5090 < 0) {
                this.method2292(arg0, arg1, arg2);
                return;
            }
            if (this.field5089 + arg2 < this.field5090) {
                this.field5089 += arg2;
                this.method2292(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field5090 - this.field5089;
            this.method2292(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field5089 += var4;
            this.method2294();
            class157 var5 = (class157) this.field5088.method2752(-79);
            synchronized (var5) {
                int var7 = var5.method1148(this);
                if (var7 < 0) {
                    var5.field2301 = 0;
                    this.method2295(var5);
                } else {
                    var5.field2301 = var7;
                    this.method2297(var5.field6074, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 74)
    private final void method2293(int arg0) {
        for (class412 var2 = (class412) this.field5087.method2752(-74); var2 != null; var2 = (class412) this.field5087.method2754(-1)) {
            var2.method722(arg0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "()V", line = 83)
    private final void method2294() {
        if (this.field5089 <= 0) {
            return;
        }
        for (class157 var1 = (class157) this.field5088.method2752(-68); var1 != null; var1 = (class157) this.field5088.method2754(-1)) {
            var1.field2301 -= this.field5089;
        }
        this.field5090 -= this.field5089;
        this.field5089 = 0;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "()I", line = 103)
    public final int method720() {
        return 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lol;)V", line = 107)
    private final void method2295(class157 arg0) {
        arg0.method2660((byte) 113);
        arg0.method1149();
        class425 var2 = this.field5088.field6329.field6074;
        if (this.field5088.field6329 == var2) {
            this.field5090 = -1;
        } else {
            this.field5090 = ((class157) var2).field2301;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "()Lkb;", line = 120)
    public final class412 method727() {
        return (class412) this.field5087.method2754(-1);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lkb;)V", line = 130)
    public final synchronized void method2296(class412 arg0) {
        arg0.method2660((byte) 123);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 137)
    public final synchronized void method722(int arg0) {
        do {
            if (this.field5090 < 0) {
                this.method2293(arg0);
                return;
            }
            if (this.field5089 + arg0 < this.field5090) {
                this.field5089 += arg0;
                this.method2293(arg0);
                return;
            }
            int var2 = this.field5090 - this.field5089;
            this.method2293(var2);
            arg0 -= var2;
            this.field5089 += var2;
            this.method2294();
            class157 var3 = (class157) this.field5088.method2752(-109);
            synchronized (var3) {
                int var5 = var3.method1148(this);
                if (var5 < 0) {
                    var3.field2301 = 0;
                    this.method2295(var3);
                } else {
                    var3.field2301 = var5;
                    this.method2297(var3.field6074, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "()Lkb;", line = 182)
    public final class412 method725() {
        return (class412) this.field5087.method2752(-124);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lge;Lol;)V", line = 186)
    private final void method2297(class425 arg0, class157 arg1) {
        while (this.field5088.field6329 != arg0 && ((class157) arg0).field2301 <= arg1.field2301) {
            arg0 = arg0.field6074;
        }
        class78.method462(-14, arg1, arg0);
        this.field5090 = ((class157) this.field5088.field6329.field6074).field2301;
    }
}
