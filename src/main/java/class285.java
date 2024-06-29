import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class285 extends class135 {

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "J")
    private long field4577 = 0L;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "J")
    private long field4578 = 0L;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "[J")
    private long[] field4579 = new long[10];

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    private int field4580 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    private int field4582 = 1;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "J")
    private long field4581 = 0L;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBI)I")
    public final int method127(int arg0, byte arg1, int arg2) {
        long var4 = (long) arg0 * 1000000L;
        class155.method1130(1, (long) arg2);
        if (arg1 <= 109) {
            this.method125(true);
        }
        this.field4578 += this.method1959(-2);
        if (this.field4577 > this.field4578) {
            class155.method1130(1, (this.field4577 - this.field4578) / 1000000L);
            this.field4581 += this.field4577 - this.field4578;
            this.field4578 += this.field4577 - this.field4578;
            this.field4577 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field4577 += var4;
        } while (var6 < 10 && this.field4578 > this.field4577);
        if (this.field4577 < this.field4578) {
            this.field4577 = this.field4578;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)J")
    public final long method125(boolean arg0) {
        if (arg0) {
            this.field4577 = 57L;
        }
        return this.field4578;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 != 13640) {
            this.field4578 = -24L;
        }
        if (this.field4578 < this.field4577) {
            this.field4578 += this.field4577 - this.field4578;
        }
        this.field4581 = 0L;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)J")
    private final long method1959(int arg0) {
        long var2 = System.nanoTime();
        long var4 = 0L;
        long var6 = var2 - this.field4581;
        this.field4581 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field4579[this.field4580] = var6;
            this.field4580 = (this.field4580 + 1) % 10;
            if (this.field4582 < 1) {
                this.field4582++;
            }
        }
        int var8 = 1;
        if (arg0 != -2) {
            return -124L;
        }
        while (var8 <= this.field4582) {
            var4 += this.field4579[(this.field4580 + 10 - var8) % 10];
            var8++;
        }
        return var4 / (long) this.field4582;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class285() {
        this.field4578 = System.nanoTime();
        this.field4577 = System.nanoTime();
    }
}
