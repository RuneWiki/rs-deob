import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class446 extends class47 {

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "J")
    private long field6418 = 0L;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "J")
    private long field6419 = 0L;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    private int field6422 = 0;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "J")
    private long field6420 = 0L;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    private int field6421 = 1;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "[J")
    private long[] field6423 = new long[10];

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)I", line = 5)
    public final int method337(int arg0, boolean arg1) {
        this.field6418 += this.method2771(arg1);
        long var3 = (long) arg0 * 1000000L;
        if (this.field6418 < this.field6419) {
            class31.method245((this.field6419 - this.field6418) / 1000000L, 118);
            this.field6420 += this.field6419 - this.field6418;
            this.field6418 += this.field6419 - this.field6418;
            this.field6419 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6419 += var3;
            var5++;
        } while (var5 < 10 && this.field6419 < this.field6418);
        if (this.field6419 < this.field6418) {
            this.field6419 = this.field6418;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)J", line = 39)
    public final long method339(boolean arg0) {
        return arg0 ? 81L : this.field6418;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V", line = 101)
    public class446() {
        this.field6418 = System.nanoTime();
        this.field6419 = System.nanoTime();
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 52)
    public final void method334(byte arg0) {
        if (arg0 != -120) {
            this.method339(false);
        }
        this.field6420 = 0L;
        if (this.field6419 > this.field6418) {
            this.field6418 += this.field6419 - this.field6418;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(Z)J", line = 66)
    private final long method2771(boolean arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6420;
        this.field6420 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6423[this.field6422] = var4;
            this.field6422 = (this.field6422 + 1) % 10;
            if (this.field6421 < 1) {
                this.field6421++;
            }
        }
        long var6 = 0L;
        if (!arg0) {
            this.method334((byte) 82);
        }
        for (int var8 = 1; var8 <= this.field6421; var8++) {
            var6 += this.field6423[(this.field6422 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6421;
    }
}
