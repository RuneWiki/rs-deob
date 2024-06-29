import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class543 extends class401 {

    @OriginalMember(owner = "client!md", name = "e", descriptor = "J")
    private long field7488 = 0L;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "J")
    private long field7487 = 0L;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field7490 = 0;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "J")
    private long field7489 = 0L;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[J")
    private long[] field7491 = new long[10];

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    private int field7492 = 1;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)J", line = 3)
    private final long method3136(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field7489;
        this.field7489 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7491[this.field7490] = var4;
            if (this.field7492 < 1) {
                this.field7492++;
            }
            this.field7490 = (this.field7490 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != 10) {
            this.method3136(107);
        }
        for (int var8 = 1; var8 <= this.field7492; var8++) {
            var6 += this.field7491[(this.field7490 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7492;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)J", line = 36)
    public final long method1698(int arg0) {
        this.field7488 += this.method3136(10);
        if (arg0 > -60) {
            return -8L;
        } else if (this.field7488 < this.field7487) {
            return (this.field7487 - this.field7488) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 52)
    public final void method1699(byte arg0) {
        if (arg0 <= 88) {
            this.method1699((byte) 111);
        }
        this.field7489 = 0L;
        if (this.field7487 > this.field7488) {
            this.field7488 += this.field7487 - this.field7488;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)J", line = 66)
    public final long method1696(int arg0) {
        return arg0 == -18931 ? this.field7488 : -56L;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 83)
    public class543() {
        this.field7487 = this.field7488 = jagmisc.nanoTime();
        if (this.field7488 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IJ)I", line = 96)
    public final int method1697(int arg0, long arg1) {
        if (arg0 != 71) {
            this.method1697(41, -7L);
        }
        if (this.field7488 < this.field7487) {
            this.field7489 += this.field7487 - this.field7488;
            this.field7488 += this.field7487 - this.field7488;
            this.field7487 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field7487 += arg1;
        } while (var4 < 10 && this.field7488 > this.field7487);
        if (this.field7488 > this.field7487) {
            this.field7487 = this.field7488;
        }
        return var4;
    }
}
