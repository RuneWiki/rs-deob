import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class685 extends class391 {

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "J")
    private long field9355 = 0L;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "J")
    private long field9356 = 0L;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    private int field9358 = 0;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[J")
    private long[] field9359 = new long[10];

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "J")
    private long field9357 = 0L;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    private int field9360 = 1;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public final void method799(byte arg0) {
        if (this.field9356 < this.field9355) {
            this.field9356 += this.field9355 - this.field9356;
        }
        this.field9357 = 0L;
        int var2 = 108 % ((-arg0 - 51) / 47);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)J")
    private final long method3781(boolean arg0) {
        long var2 = System.nanoTime();
        if (!arg0) {
            return 69L;
        }
        long var4 = var2 - this.field9357;
        this.field9357 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9359[this.field9358] = var4;
            if (this.field9360 < 1) {
                this.field9360++;
            }
            this.field9358 = (this.field9358 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9360; var8++) {
            var6 += this.field9359[(this.field9358 + 10 - var8) % 10];
        }
        return var6 / (long) this.field9360;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)J")
    public final long method800(boolean arg0) {
        this.field9356 += this.method3781(true);
        if (this.field9356 >= this.field9355) {
            if (arg0) {
                this.field9358 = 34;
            }
            return 0L;
        } else {
            return (this.field9355 - this.field9356) / 1000000L;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)I")
    public final int method802(long arg0, int arg1) {
        if (arg1 >= -62) {
            this.field9360 = 4;
        }
        if (this.field9356 < this.field9355) {
            this.field9357 += this.field9355 - this.field9356;
            this.field9356 += this.field9355 - this.field9356;
            this.field9355 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field9355 += arg0;
        } while (var4 < 10 && this.field9355 < this.field9356);
        if (this.field9356 > this.field9355) {
            this.field9355 = this.field9356;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)J")
    public final long method798(int arg0) {
        if (arg0 != 2) {
            this.field9355 = 117L;
        }
        return this.field9356;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class685() {
        this.field9356 = System.nanoTime();
        this.field9355 = System.nanoTime();
    }
}
