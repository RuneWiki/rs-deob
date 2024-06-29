import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class347 extends class413 {

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "J")
    private long field5338 = 0L;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
    private long field5339 = 0L;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    private int field5342 = 1;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    private int field5341 = 0;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "J")
    private long field5343 = 0L;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "[J")
    private long[] field5340 = new long[10];

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 3)
    public final void method1366(int arg0) {
        if (arg0 == -233) {
            if (this.field5338 > this.field5339) {
                this.field5339 += this.field5338 - this.field5339;
            }
            this.field5343 = 0L;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)I", line = 17)
    public final int method1367(boolean arg0, int arg1) {
        if (arg0) {
            this.field5343 = -57L;
        }
        this.field5339 += this.method2263(-29525);
        long var3 = (long) arg1 * 1000000L;
        if (this.field5339 < this.field5338) {
            class84.method517((byte) 122, (this.field5338 - this.field5339) / 1000000L);
            this.field5343 += this.field5338 - this.field5339;
            this.field5339 += this.field5338 - this.field5339;
            this.field5338 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5338 += var3;
            var5++;
        } while (var5 < 10 && this.field5338 < this.field5339);
        if (this.field5339 > this.field5338) {
            this.field5338 = this.field5339;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 104)
    public class347() {
        this.field5338 = this.field5339 = jagmisc.nanoTime();
        if (this.field5339 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)J", line = 57)
    public final long method1369(byte arg0) {
        if (arg0 != 83) {
            this.method1367(false, -88);
        }
        return this.field5339;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)J", line = 71)
    private final long method2263(int arg0) {
        if (arg0 != -29525) {
            this.field5343 = 59L;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5343;
        this.field5343 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5340[this.field5341] = var4;
            if (this.field5342 < 1) {
                this.field5342++;
            }
            this.field5341 = (this.field5341 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5342; var8++) {
            var6 += this.field5340[(this.field5341 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5342;
    }
}
