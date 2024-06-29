import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class448 extends class439 {

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "J")
    private long field6210 = 0L;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "J")
    private long field6211 = 0L;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "[J")
    private long[] field6213 = new long[10];

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    private int field6212 = 1;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    private int field6214 = 0;

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "J")
    private long field6215 = 0L;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)J")
    public final long method2080(int arg0) {
        if (arg0 <= 58) {
            this.method2082(-55);
        }
        return this.field6210;
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
    public final void method2082(int arg0) {
        if (arg0 != 328) {
            this.method2081(-87, -99L);
        }
        if (this.field6210 < this.field6211) {
            this.field6210 += this.field6211 - this.field6210;
        }
        this.field6215 = 0L;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)J")
    public final long method2083(int arg0) {
        this.field6210 += this.method2673(true);
        if (this.field6211 <= this.field6210) {
            return arg0 == -1 ? 0L : 116L;
        } else {
            return (this.field6211 - this.field6210) / 1000000L;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IJ)I")
    public final int method2081(int arg0, long arg1) {
        int var4 = 35 / ((arg0) / 61);
        if (this.field6211 > this.field6210) {
            this.field6215 += this.field6211 - this.field6210;
            this.field6210 += this.field6211 - this.field6210;
            this.field6211 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field6211 += arg1;
        } while (var5 < 10 && this.field6210 > this.field6211);
        if (this.field6210 > this.field6211) {
            this.field6211 = this.field6210;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)J")
    private final long method2673(boolean arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6215;
        this.field6215 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6213[this.field6214] = var4;
            if (this.field6212 < 1) {
                this.field6212++;
            }
            this.field6214 = (this.field6214 + 1) % 10;
        }
        long var6 = 0L;
        if (!arg0) {
            this.field6214 = 19;
        }
        for (int var8 = 1; var8 <= this.field6212; var8++) {
            var6 += this.field6213[(this.field6214 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6212;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
    public class448() {
        this.field6210 = System.nanoTime();
        this.field6211 = System.nanoTime();
    }
}
