import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class531 extends class583 {

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "J")
    private long field7239 = 0L;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "J")
    private long field7240 = 0L;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    private int field7241 = 0;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "J")
    private long field7242 = 0L;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[J")
    private long[] field7243 = new long[10];

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    private int field7244 = 1;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)J")
    public final long method604(byte arg0) {
        return arg0 <= 63 ? -114L : this.field7240;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)J")
    private final long method3045(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field7242;
        this.field7242 = var2;
        if (arg0 != 112) {
            this.method600((byte) 78);
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7243[this.field7241] = var4;
            this.field7241 = (this.field7241 + 1) % 10;
            if (this.field7244 < 1) {
                this.field7244++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7244; var8++) {
            var6 += this.field7243[(this.field7241 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7244;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method600(byte arg0) {
        this.field7242 = 0L;
        int var2 = -26 / ((17 - arg0) / 54);
        if (this.field7240 < this.field7239) {
            this.field7240 += this.field7239 - this.field7240;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(JI)I")
    public final int method603(long arg0, int arg1) {
        if (arg1 != -21626) {
            this.field7242 = 7L;
        }
        if (this.field7240 < this.field7239) {
            this.field7242 += this.field7239 - this.field7240;
            this.field7240 += this.field7239 - this.field7240;
            this.field7239 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field7239 += arg0;
            var4++;
        } while (var4 < 10 && this.field7240 > this.field7239);
        if (this.field7239 < this.field7240) {
            this.field7239 = this.field7240;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)J")
    public final long method601(byte arg0) {
        if (arg0 != -96) {
            this.method3045((byte) -35);
        }
        this.field7240 += this.method3045((byte) 112);
        return this.field7239 > this.field7240 ? (this.field7239 - this.field7240) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class531() {
        this.field7239 = this.field7240 = jagmisc.nanoTime();
        if (this.field7240 == 0L) {
            throw new RuntimeException();
        }
    }
}
