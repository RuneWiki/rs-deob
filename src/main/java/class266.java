import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class266 extends class206 {

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "J")
    private long field3355 = 0L;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "J")
    private long field3356 = 0L;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "J")
    private long field3357 = 0L;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    private int field3358 = 1;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
    private int field3359 = 0;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "[J")
    private long[] field3360 = new long[10];

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)J")
    public final long method70(int arg0) {
        int var2 = -11 / ((arg0 - 30) / 63);
        return this.field3356;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)J")
    public final long method68(int arg0) {
        this.field3356 += this.method1591(29193);
        int var2 = -5 % ((arg0 - 45) / 47);
        return this.field3356 < this.field3355 ? (this.field3355 - this.field3356) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)J")
    private final long method1591(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3357;
        this.field3357 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3360[this.field3359] = var4;
            if (this.field3358 < 1) {
                this.field3358++;
            }
            this.field3359 = (this.field3359 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != 29193) {
            this.field3356 = -15L;
        }
        for (int var8 = 1; var8 <= this.field3358; var8++) {
            var6 += this.field3360[(this.field3359 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3358;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
    public final void method69(int arg0) {
        if (this.field3355 > this.field3356) {
            this.field3356 += this.field3355 - this.field3356;
        }
        this.field3357 = arg0;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V")
    public class266() {
        this.field3356 = System.nanoTime();
        this.field3355 = System.nanoTime();
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(JI)I")
    public final int method71(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field3359 = -96;
        }
        if (this.field3356 < this.field3355) {
            this.field3357 += this.field3355 - this.field3356;
            this.field3356 += this.field3355 - this.field3356;
            this.field3355 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field3355 += arg0;
            var4++;
        } while (var4 < 10 && this.field3356 > this.field3355);
        if (this.field3356 > this.field3355) {
            this.field3355 = this.field3356;
        }
        return var4;
    }
}
