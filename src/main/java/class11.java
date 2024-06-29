import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class206 {

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "J")
    private long field136 = 0L;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "J")
    private long field135 = 0L;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    private int field137 = 1;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "[J")
    private long[] field138 = new long[10];

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    private int field139 = 0;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "J")
    private long field140 = 0L;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)J", line = 3)
    private final long method67(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field140;
        this.field140 = var2;
        if (!arg0) {
            return 86L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field138[this.field139] = var4;
            this.field139 = (this.field139 + 1) % 10;
            if (this.field137 < 1) {
                this.field137++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field137; var8++) {
            var6 += this.field138[(this.field139 + 10 - var8) % 10];
        }
        return var6 / (long) this.field137;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)J", line = 38)
    public final long method68(int arg0) {
        this.field135 += this.method67(true);
        if (this.field136 > this.field135) {
            return (this.field136 - this.field135) / 1000000L;
        } else {
            int var2 = 45 / ((45 - arg0) / 47);
            return 0L;
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V", line = 55)
    public final void method69(int arg0) {
        this.field140 = arg0;
        if (this.field136 > this.field135) {
            this.field135 += this.field136 - this.field135;
        }
    }

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "(I)J", line = 66)
    public final long method70(int arg0) {
        int var2 = -107 % ((30 - arg0) / 63);
        return this.field135;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(JI)I", line = 76)
    public final int method71(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method70(-99);
        }
        if (this.field136 > this.field135) {
            this.field140 += this.field136 - this.field135;
            this.field135 += this.field136 - this.field135;
            this.field136 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field136 += arg0;
        } while (var4 < 10 && this.field136 < this.field135);
        if (this.field136 < this.field135) {
            this.field136 = this.field135;
        }
        return var4;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V", line = 113)
    public class11() {
        this.field136 = this.field135 = jagmisc.nanoTime();
        if (this.field135 == 0L) {
            throw new RuntimeException();
        }
    }
}
