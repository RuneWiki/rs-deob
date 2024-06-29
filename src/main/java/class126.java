import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class126 extends class190 {

    @OriginalMember(owner = "client!md", name = "j", descriptor = "J")
    private long field2141 = 0L;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "J")
    private long field2142 = 0L;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[J")
    private long[] field2144 = new long[10];

    @OriginalMember(owner = "client!md", name = "n", descriptor = "J")
    private long field2145 = 0L;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    private int field2143 = 0;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    private int field2146 = 1;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)J", line = 7)
    private final long method981(int arg0) {
        long var2 = 0L;
        long var4 = System.nanoTime();
        long var6 = var4 - this.field2145;
        this.field2145 = var4;
        if (arg0 != -1) {
            this.method36(35, -122, (byte) -33);
        }
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field2144[this.field2143] = var6;
            this.field2143 = (this.field2143 + 1) % 10;
            if (this.field2146 < 1) {
                this.field2146++;
            }
        }
        for (int var8 = 1; var8 <= this.field2146; var8++) {
            var2 += this.field2144[(this.field2143 + 10 - var8) % 10];
        }
        return var2 / (long) this.field2146;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 95)
    public class126() {
        this.field2142 = System.nanoTime();
        this.field2141 = System.nanoTime();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 42)
    public final void method37(byte arg0) {
        if (this.field2142 < this.field2141) {
            this.field2142 += this.field2141 - this.field2142;
        }
        this.field2145 = 0L;
        if (arg0 != -105) {
            this.method39((byte) -22);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)I", line = 57)
    public final int method36(int arg0, int arg1, byte arg2) {
        if (arg2 < 57) {
            this.field2143 = 7;
        }
        class283.method2076((byte) 30, (long) arg1);
        long var4 = (long) arg0 * 1000000L;
        this.field2142 += this.method981(-1);
        if (this.field2141 > this.field2142) {
            class283.method2076((byte) -122, (this.field2141 - this.field2142) / 1000000L);
            this.field2145 += this.field2141 - this.field2142;
            this.field2142 += this.field2141 - this.field2142;
            this.field2141 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field2141 += var4;
        } while (var6 < 10 && this.field2142 > this.field2141);
        if (this.field2141 < this.field2142) {
            this.field2141 = this.field2142;
        }
        return var6;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)J", line = 105)
    public final long method39(byte arg0) {
        if (arg0 != -32) {
            this.method39((byte) -14);
        }
        return this.field2142;
    }
}
