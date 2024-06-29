import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class327 extends class642 {

    @OriginalMember(owner = "client!df", name = "f", descriptor = "J")
    private long field4248 = 0L;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "J")
    private long field4249 = 0L;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "J")
    private long field4250 = 0L;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    private int field4251 = 1;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    private int field4252 = 0;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[J")
    private long[] field4253 = new long[10];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)J", line = 4)
    public final long method612(byte arg0) {
        if (arg0 != 67) {
            this.method1891((byte) 41);
        }
        return this.field4249;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 70)
    public class327() {
        this.field4249 = System.nanoTime();
        this.field4248 = System.nanoTime();
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)J", line = 23)
    private final long method1891(byte arg0) {
        long var2 = System.nanoTime();
        if (arg0 > -60) {
            return 33L;
        }
        long var4 = var2 - this.field4250;
        this.field4250 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4253[this.field4252] = var4;
            this.field4252 = (this.field4252 + 1) % 10;
            if (this.field4251 < 1) {
                this.field4251++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4251; var8++) {
            var6 += this.field4253[(this.field4252 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4251;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)J", line = 56)
    public final long method616(int arg0) {
        this.field4249 += this.method1891((byte) -125);
        if (arg0 != 0) {
            this.field4252 = 85;
        }
        return this.field4249 < this.field4248 ? (this.field4248 - this.field4249) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 86)
    public final void method613(int arg0) {
        if (this.field4249 < this.field4248) {
            this.field4249 += this.field4248 - this.field4249;
        }
        if (arg0 > -31) {
            this.method616(92);
        }
        this.field4250 = 0L;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)I", line = 109)
    public final int method615(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method616(-8);
        }
        if (this.field4248 > this.field4249) {
            this.field4250 += this.field4248 - this.field4249;
            this.field4249 += this.field4248 - this.field4249;
            this.field4248 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field4248 += arg0;
        } while (var4 < 10 && this.field4248 < this.field4249);
        if (this.field4249 > this.field4248) {
            this.field4248 = this.field4249;
        }
        return var4;
    }
}
