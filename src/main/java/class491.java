import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class491 extends class347 {

    @OriginalMember(owner = "client!li", name = "h", descriptor = "J")
    private long field6931 = 0L;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "J")
    private long field6930 = 0L;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "J")
    private long field6932 = 0L;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    private int field6933 = 1;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    private int field6935 = 0;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[J")
    private long[] field6934 = new long[10];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
    public final int method1958(int arg0, int arg1) {
        if (arg0 != 24) {
            this.method1959(-67);
        }
        this.field6931 += this.method2885(0);
        long var3 = (long) arg1 * 1000000L;
        if (this.field6931 < this.field6930) {
            class85.method433((this.field6930 - this.field6931) / 1000000L, -22);
            this.field6932 += this.field6930 - this.field6931;
            this.field6931 += this.field6930 - this.field6931;
            this.field6930 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6930 += var3;
            var5++;
        } while (var5 < 10 && this.field6931 > this.field6930);
        if (this.field6931 > this.field6930) {
            this.field6930 = this.field6931;
        }
        return var5;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public final void method1959(int arg0) {
        if (this.field6930 > this.field6931) {
            this.field6931 += this.field6930 - this.field6931;
        }
        this.field6932 = (long) arg0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)J")
    public final long method1960(int arg0) {
        int var2 = 117 / (-arg0 / 33);
        return this.field6931;
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)J")
    private final long method2885(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field6932;
        this.field6932 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6934[this.field6935] = var4;
            this.field6935 = (this.field6935 + 1) % 10;
            if (this.field6933 < 1) {
                this.field6933++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field6933; var8++) {
            var6 += this.field6934[(this.field6935 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6933;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class491() {
        this.field6930 = this.field6931 = jagmisc.nanoTime();
        if (this.field6931 == 0L) {
            throw new RuntimeException();
        }
    }
}
