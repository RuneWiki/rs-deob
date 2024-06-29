import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class152 extends class266 {

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "J")
    private long field2248 = 0L;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "J")
    private long field2249 = 0L;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    private int field2251 = 0;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "J")
    private long field2250 = 0L;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    private int field2253 = 1;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[J")
    private long[] field2252 = new long[10];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)I")
    public final int method954(int arg0, boolean arg1) {
        if (!arg1) {
            return -68;
        }
        this.field2248 += this.method956(false);
        long var3 = (long) arg0 * 1000000L;
        if (this.field2248 < this.field2249) {
            class111.method713(-98, (this.field2249 - this.field2248) / 1000000L);
            this.field2250 += this.field2249 - this.field2248;
            this.field2248 += this.field2249 - this.field2248;
            this.field2249 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field2249 += var3;
        } while (var5 < 10 && this.field2249 < this.field2248);
        if (this.field2249 < this.field2248) {
            this.field2249 = this.field2248;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
    public final void method955(boolean arg0) {
        this.field2250 = 0L;
        if (this.field2248 < this.field2249) {
            this.field2248 += this.field2249 - this.field2248;
        }
        if (arg0) {
            this.method957((byte) -122);
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(Z)J")
    private final long method956(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2250;
        this.field2250 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2252[this.field2251] = var4;
            if (this.field2253 < 1) {
                this.field2253++;
            }
            this.field2251 = (this.field2251 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0) {
            this.method955(false);
        }
        for (int var8 = 1; var8 <= this.field2253; var8++) {
            var6 += this.field2252[(this.field2251 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2253;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)J")
    public final long method957(byte arg0) {
        return arg0 > -8 ? -27L : this.field2248;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class152() {
        this.field2249 = this.field2248 = jagmisc.nanoTime();
        if (this.field2248 == 0L) {
            throw new RuntimeException();
        }
    }
}
