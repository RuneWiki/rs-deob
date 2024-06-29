import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class53 extends class69 {

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "J")
    private long field1281;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 4)
    public final void method430(int arg0) {
        if (arg0 != 2) {
            this.field1281 = -77L;
        }
        this.method432((byte) -128);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I", line = 15)
    public final int method431(int arg0, int arg1, int arg2) {
        long var4 = (long) arg2 * 1000000L;
        if (arg0 != -271) {
            this.field1281 = -84L;
        }
        long var6 = this.field1281 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        int var8 = 0;
        class84.method653(var6 / 1000000L, (byte) 124);
        long var9 = System.nanoTime();
        while (var8 < 10 && (var8 < 1 || var9 > this.field1281)) {
            var8++;
            this.field1281 += (long) arg1 * 1000000L;
        }
        if (var9 > this.field1281) {
            this.field1281 = var9;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 46)
    public final void method432(byte arg0) {
        this.field1281 = System.nanoTime();
        int var2 = -72 % ((arg0 + 32) / 56);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 54)
    public class53() {
        this.method432((byte) -100);
    }
}
