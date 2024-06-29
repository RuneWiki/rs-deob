import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class440 extends class29 {

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    private int field6095 = 1;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "[J")
    private long[] field6097 = new long[10];

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "J")
    private long field6096 = 0L;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "J")
    private long field6099 = 0L;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "J")
    private long field6098 = 0L;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    private int field6100 = 0;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BJ)I")
    public final int method280(byte arg0, long arg1) {
        if (arg0 != -100) {
            return 14;
        } else if (this.field6098 < this.field6099) {
            this.field6096 += this.field6099 - this.field6098;
            this.field6098 += this.field6099 - this.field6098;
            this.field6099 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field6099 += arg1;
            } while (var4 < 10 && this.field6098 > this.field6099);
            if (this.field6099 < this.field6098) {
                this.field6099 = this.field6098;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)J")
    public final long method283(byte arg0) {
        if (arg0 <= 116) {
            return 16L;
        } else {
            this.field6098 += this.method2507(4435);
            return this.field6099 > this.field6098 ? (this.field6099 - this.field6098) / 1000000L : 0L;
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)V")
    public final void method287(byte arg0) {
        this.field6096 = 0L;
        if (arg0 != -9) {
            this.method287((byte) 101);
        }
        if (this.field6099 > this.field6098) {
            this.field6098 += this.field6099 - this.field6098;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)J")
    private final long method2507(int arg0) {
        long var2 = class577.method3295((byte) 15) * 1000000L;
        long var4 = var2 - this.field6096;
        this.field6096 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6097[this.field6100] = var4;
            this.field6100 = (this.field6100 + 1) % 10;
            if (this.field6095 < 10) {
                this.field6095++;
            }
        }
        long var6 = 0L;
        if (arg0 != 4435) {
            this.field6097 = null;
        }
        for (int var8 = 1; var8 <= this.field6095; var8++) {
            var6 += this.field6097[(this.field6100 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6095;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)J")
    public final long method284(byte arg0) {
        if (arg0 <= 31) {
            this.method2507(23);
        }
        return this.field6098;
    }
}
