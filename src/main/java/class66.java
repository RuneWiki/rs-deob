import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 extends class103 {

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "J")
    private long field1649;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
    public final int method52(int arg0, int arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        long var6 = this.field1649 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }
        if (arg1 < 78) {
            this.method54((byte) -49);
        }
        class96.method795(var6 / 1000000L, 102);
        long var8 = System.nanoTime();
        int var10 = 0;
        while (var10 < 10 && (var10 < 1 || var8 > this.field1649)) {
            var10++;
            this.field1649 += (long) arg2 * 1000000L;
        }
        if (var8 > this.field1649) {
            this.field1649 = var8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public final void method54(byte arg0) {
        if (arg0 < 91) {
            this.method54((byte) -25);
        }
        this.field1649 = System.nanoTime();
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class66() {
        this.method54((byte) 123);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
        this.method54((byte) 99);
        if (arg0 != 32) {
            this.field1649 = -72L;
        }
    }
}
