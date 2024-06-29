import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class146 {

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "J")
    private long field1620;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I")
    public final int method535(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        long var6 = this.field1620 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        if (arg0 != 1772870664) {
            this.method536(119);
        }
        class148.method1183(0, var6 / 1000000L);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || this.field1620 < var8)) {
            var10++;
            this.field1620 += (long) arg1 * 1000000L;
        }
        if (var8 > this.field1620) {
            this.field1620 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public final void method536(int arg0) {
        this.field1620 = System.nanoTime();
        if (arg0 >= -64) {
            this.field1620 = 94L;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class74() {
        this.method536(-105);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public final void method537(byte arg0) {
        if (arg0 > -39) {
            this.field1620 = -78L;
        }
        this.method536(-83);
    }
}
