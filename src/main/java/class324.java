import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class324 extends class439 {

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "J")
    private long field4603 = 0L;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "J")
    private long field4602 = 0L;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "[J")
    private long[] field4605 = new long[10];

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "J")
    private long field4606 = 0L;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    private int field4604 = 0;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    private int field4607 = 1;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)J")
    private final long method2079(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4606;
        this.field4606 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4605[this.field4604] = var4;
            this.field4604 = (this.field4604 + 1) % 10;
            if (this.field4607 < 1) {
                this.field4607++;
            }
        }
        if (arg0 != -13) {
            return 63L;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4607; var8++) {
            var6 += this.field4605[(this.field4604 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4607;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)J")
    public final long method2080(int arg0) {
        if (arg0 < 58) {
            this.field4606 = -29L;
        }
        return this.field4603;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IJ)I")
    public final int method2081(int arg0, long arg1) {
        int var4 = 100 / (-arg0 / 61);
        if (this.field4602 > this.field4603) {
            this.field4606 += this.field4602 - this.field4603;
            this.field4603 += this.field4602 - this.field4603;
            this.field4602 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4602 += arg1;
            var5++;
        } while (var5 < 10 && this.field4603 > this.field4602);
        if (this.field4603 > this.field4602) {
            this.field4602 = this.field4603;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
    public final void method2082(int arg0) {
        if (arg0 != 328) {
            this.field4606 = -127L;
        }
        this.field4606 = 0L;
        if (this.field4603 < this.field4602) {
            this.field4603 += this.field4602 - this.field4603;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)J")
    public final long method2083(int arg0) {
        this.field4603 += this.method2079((byte) -13);
        if (this.field4603 < this.field4602) {
            return (this.field4602 - this.field4603) / 1000000L;
        } else {
            if (arg0 != -1) {
                this.method2080(-86);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
    public class324() {
        this.field4602 = this.field4603 = jagmisc.nanoTime();
        if (this.field4603 == 0L) {
            throw new RuntimeException();
        }
    }
}
