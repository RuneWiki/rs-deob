import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class154 extends class333 {

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "J")
    private long field2044 = 0L;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "J")
    private long field2046 = 0L;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
    private int field2048 = 1;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "J")
    private long field2045 = 0L;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "[J")
    private long[] field2047 = new long[10];

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    private int field2049 = 0;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZ)I", line = 3)
    public final int method299(int arg0, boolean arg1) {
        long var3 = (long) arg0 * 1000000L;
        this.field2044 += this.method1051((byte) 116);
        if (!arg1) {
            this.field2049 = 113;
        }
        if (this.field2045 > this.field2044) {
            class463.method2773((this.field2045 - this.field2044) / 1000000L, 30);
            this.field2046 += this.field2045 - this.field2044;
            this.field2044 += this.field2045 - this.field2044;
            this.field2045 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2045 += var3;
            var5++;
        } while (var5 < 10 && this.field2045 < this.field2044);
        if (this.field2044 > this.field2045) {
            this.field2045 = this.field2044;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)J", line = 39)
    public final long method301(int arg0) {
        if (arg0 != -1) {
            this.method300(-93);
        }
        return this.field2044;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)J", line = 73)
    private final long method1051(byte arg0) {
        long var2 = class173.method1134(true) * 1000000L;
        long var4 = var2 - this.field2046;
        this.field2046 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2047[this.field2049] = var4;
            if (this.field2048 < 10) {
                this.field2048++;
            }
            this.field2049 = (this.field2049 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 <= 102) {
            return 77L;
        } else {
            for (int var8 = 1; var8 <= this.field2048; var8++) {
                var6 += this.field2047[(this.field2049 + 10 - var8) % 10];
            }
            return var6 / (long) this.field2048;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V", line = 106)
    public final void method300(int arg0) {
        if (this.field2044 < this.field2045) {
            this.field2044 += this.field2045 - this.field2044;
        }
        this.field2046 = 0L;
        if (arg0 != 10240) {
            this.method299(-108, false);
        }
    }
}
