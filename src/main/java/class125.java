import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class125 extends class34 {

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Lv;")
    private class218 field2244 = new class218();

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Lv;")
    private class218 field2245 = new class218();

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    private int field2246 = -1;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    private int field2247 = 0;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ld;)V")
    public final synchronized void method752(class34 arg0) {
        this.field2244.method1356(arg0, 1);
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()I")
    public final int method256() {
        return 0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "([III)V")
    public final synchronized void method253(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2246 < 0) {
                this.method755(arg0, arg1, arg2);
                return;
            }
            if (this.field2247 + arg2 < this.field2246) {
                this.field2247 += arg2;
                this.method755(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2246 - this.field2247;
            this.method755(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2247 += var4;
            this.method754();
            class87 var5 = (class87) this.field2245.method1358(-29726);
            synchronized (var5) {
                int var7 = var5.method561(this);
                if (var7 < 0) {
                    var5.field1607 = 0;
                    this.method756(var5);
                } else {
                    var5.field1607 = var7;
                    this.method753(var5.field1887, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lji;Li;)V")
    private final void method753(class106 arg0, class87 arg1) {
        while (this.field2245.field3803 != arg0 && ((class87) arg0).field1607 <= arg1.field1607) {
            arg0 = arg0.field1887;
        }
        this.field2245.method1354(arg1, 2048, arg0);
        this.field2246 = ((class87) this.field2245.field3803.field1887).field1607;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public final synchronized void method255(int arg0) {
        do {
            if (this.field2246 < 0) {
                this.method758(arg0);
                return;
            }
            if (this.field2247 + arg0 < this.field2246) {
                this.field2247 += arg0;
                this.method758(arg0);
                return;
            }
            int var2 = this.field2246 - this.field2247;
            this.method758(var2);
            arg0 -= var2;
            this.field2247 += var2;
            this.method754();
            class87 var3 = (class87) this.field2245.method1358(-29726);
            synchronized (var3) {
                int var5 = var3.method561(this);
                if (var5 < 0) {
                    var3.field1607 = 0;
                    this.method756(var3);
                } else {
                    var3.field1607 = var5;
                    this.method753(var3.field1887, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()Ld;")
    public final class34 method250() {
        return (class34) this.field2244.method1358(-29726);
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "()V")
    private final void method754() {
        if (this.field2247 <= 0) {
            return;
        }
        for (class87 var1 = (class87) this.field2245.method1358(-29726); var1 != null; var1 = (class87) this.field2245.method1360(true)) {
            var1.field1607 -= this.field2247;
        }
        this.field2246 -= this.field2247;
        this.field2247 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()Ld;")
    public final class34 method251() {
        return (class34) this.field2244.method1360(true);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "([III)V")
    private final void method755(int[] arg0, int arg1, int arg2) {
        for (class34 var4 = (class34) this.field2244.method1358(-29726); var4 != null; var4 = (class34) this.field2244.method1360(true)) {
            var4.method252(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Li;)V")
    private final void method756(class87 arg0) {
        arg0.method636(93);
        arg0.method562();
        class106 var2 = this.field2245.field3803.field1887;
        if (this.field2245.field3803 == var2) {
            this.field2246 = -1;
        } else {
            this.field2246 = ((class87) var2).field1607;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Ld;)V")
    public final synchronized void method757(class34 arg0) {
        arg0.method636(93);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    private final void method758(int arg0) {
        for (class34 var2 = (class34) this.field2244.method1358(-29726); var2 != null; var2 = (class34) this.field2244.method1360(true)) {
            var2.method255(arg0);
        }
    }
}
