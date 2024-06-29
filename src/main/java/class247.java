import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class247 extends class178 {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "J")
    private long field3918 = 0L;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "J")
    private long field3919 = 0L;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "J")
    private long field3921 = 0L;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    private int field3923 = 0;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    private int field3920 = 1;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[J")
    private long[] field3922 = new long[10];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)J", line = 5)
    public final long method451(int arg0) {
        return arg0 < 51 ? 63L : this.field3919;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)J", line = 16)
    private final long method1753(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3921;
        if (arg0 > -30) {
            this.method1753(56);
        }
        long var6 = 0L;
        this.field3921 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3922[this.field3923] = var4;
            if (this.field3920 < 1) {
                this.field3920++;
            }
            this.field3923 = (this.field3923 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field3920; var8++) {
            var6 += this.field3922[(this.field3923 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3920;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 50)
    public final void method452(byte arg0) {
        if (this.field3918 > this.field3919) {
            this.field3919 += this.field3918 - this.field3919;
        }
        this.field3921 = 0L;
        if (arg0 != 105) {
            this.field3923 = -72;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I", line = 65)
    public final int method453(int arg0, int arg1, int arg2) {
        if (arg0 > -19) {
            this.method1753(52);
        }
        long var4 = (long) arg2 * 1000000L;
        class177.method1246((long) arg1, -32644);
        this.field3919 += this.method1753(-104);
        if (this.field3918 > this.field3919) {
            class177.method1246((this.field3918 - this.field3919) / 1000000L, -32644);
            this.field3921 += this.field3918 - this.field3919;
            this.field3919 += this.field3918 - this.field3919;
            this.field3918 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field3918 += var4;
        } while (var6 < 10 && this.field3919 > this.field3918);
        if (this.field3919 > this.field3918) {
            this.field3918 = this.field3919;
        }
        return var6;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 106)
    public class247() {
        this.field3919 = System.nanoTime();
        this.field3918 = System.nanoTime();
    }
}
