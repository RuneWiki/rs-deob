import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class26 extends class335 {

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    private int field353 = 0;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "[J")
    private long[] field354 = new long[10];

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "J")
    private long field352 = 0L;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    private int field355 = 1;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "J")
    private long field356 = 0L;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "J")
    private long field357 = 0L;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)J")
    public final long method160(byte arg0) {
        return arg0 < 2 ? -20L : this.field352;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
    public final void method161(int arg0) {
        this.field356 = 0L;
        if (this.field352 < this.field357) {
            this.field352 += this.field357 - this.field352;
        }
        int var2 = 99 / ((arg0 + 65) / 48);
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)J")
    private final long method162(int arg0) {
        long var2 = class479.method2864((byte) -83) * 1000000L;
        long var4 = var2 - this.field356;
        this.field356 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field354[this.field353] = var4;
            if (this.field355 < 10) {
                this.field355++;
            }
            this.field353 = (this.field353 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field355; var8++) {
            var6 += this.field354[(this.field353 + 10 - var8) % 10];
        }
        return var6 / (long) this.field355;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IJ)I")
    public final int method163(int arg0, long arg1) {
        if (arg0 != 70) {
            return -127;
        } else if (this.field352 < this.field357) {
            this.field356 += this.field357 - this.field352;
            this.field352 += this.field357 - this.field352;
            this.field357 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field357 += arg1;
            } while (var4 < 10 && this.field357 < this.field352);
            if (this.field357 < this.field352) {
                this.field357 = this.field352;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)J")
    public final long method164(int arg0) {
        if (arg0 != -9876) {
            this.field352 = -33L;
        }
        this.field352 += this.method162(1);
        return this.field357 > this.field352 ? (this.field357 - this.field352) / 1000000L : 0L;
    }
}
