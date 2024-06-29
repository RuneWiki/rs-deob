import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class118 extends class274 {

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
    private long field1643 = 0L;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "J")
    private long field1642 = 0L;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    private int field1644 = 1;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "J")
    private long field1645 = 0L;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    private int field1646 = 0;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "[J")
    private long[] field1647 = new long[10];

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)J", line = 4)
    public final long method249(int arg0) {
        return arg0 == 0 ? this.field1642 : -80L;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 14)
    public final void method246(byte arg0) {
        if (arg0 <= 124) {
            this.field1644 = -46;
        }
        this.field1645 = 0L;
        if (this.field1642 < this.field1643) {
            this.field1642 += this.field1643 - this.field1642;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)J", line = 30)
    private final long method771(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1645;
        if (arg0 > -118) {
            return 87L;
        }
        long var6 = 0L;
        this.field1645 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1647[this.field1646] = var4;
            if (this.field1644 < 1) {
                this.field1644++;
            }
            this.field1646 = (this.field1646 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field1644; var8++) {
            var6 += this.field1647[(this.field1646 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1644;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)I", line = 64)
    public final int method248(int arg0, byte arg1, int arg2) {
        if (arg1 < 64) {
            return 111;
        }
        class19.method140((long) arg0, 16711680);
        this.field1642 += this.method771((byte) -124);
        long var4 = (long) arg2 * 1000000L;
        if (this.field1642 < this.field1643) {
            class19.method140((this.field1643 - this.field1642) / 1000000L, 16711680);
            this.field1645 += this.field1643 - this.field1642;
            this.field1642 += this.field1643 - this.field1642;
            this.field1643 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field1643 += var4;
            var6++;
        } while (var6 < 10 && this.field1642 > this.field1643);
        if (this.field1642 > this.field1643) {
            this.field1643 = this.field1642;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 106)
    public class118() {
        this.field1643 = this.field1642 = jagmisc.nanoTime();
        if (this.field1642 == 0L) {
            throw new RuntimeException();
        }
    }
}
