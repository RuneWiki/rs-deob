import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class309 extends class244 {

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field4195 = 0;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "[J")
    private long[] field4197 = new long[10];

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "J")
    private long field4198 = 0L;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "J")
    private long field4196 = 0L;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "J")
    private long field4199 = 0L;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    private int field4200 = 1;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)J")
    public final long method775(byte arg0) {
        int var2 = 117 / ((41 - arg0) / 62);
        return this.field4196;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)J")
    private final long method1984(int arg0) {
        long var2 = class108.method902((byte) -93) * 1000000L;
        long var4 = var2 - this.field4198;
        this.field4198 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4197[this.field4195] = var4;
            this.field4195 = (this.field4195 + 1) % 10;
            if (this.field4200 < 10) {
                this.field4200++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field4200; var8++) {
            var6 += this.field4197[(this.field4195 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4200;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)I")
    public final int method777(int arg0, byte arg1) {
        if (arg1 != -79) {
            this.field4195 = -75;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field4196 += this.method1984(0);
        if (this.field4196 < this.field4199) {
            class229.method1541(114, (this.field4199 - this.field4196) / 1000000L);
            this.field4198 += this.field4199 - this.field4196;
            this.field4196 += this.field4199 - this.field4196;
            this.field4199 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4199 += var3;
            var5++;
        } while (var5 < 10 && this.field4196 > this.field4199);
        if (this.field4199 < this.field4196) {
            this.field4199 = this.field4196;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    public final void method776(byte arg0) {
        this.field4198 = 0L;
        if (this.field4199 > this.field4196) {
            this.field4196 += this.field4199 - this.field4196;
        }
        if (arg0 != 100) {
            this.field4197 = null;
        }
    }
}
