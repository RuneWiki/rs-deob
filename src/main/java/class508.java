import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class508 extends class654 {

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "J")
    private long field7574 = 0L;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "J")
    private long field7575 = 0L;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    private int field7576 = 0;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "J")
    private long field7577 = 0L;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    private int field7579 = 1;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[J")
    private long[] field7578 = new long[10];

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)J")
    public final long method3813(byte arg0) {
        if (arg0 != -88) {
            this.method3814(true);
        }
        return this.field7575;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IJ)I")
    public final int method3812(int arg0, long arg1) {
        if (arg0 != 0) {
            return 9;
        } else if (this.field7575 < this.field7574) {
            this.field7577 += this.field7574 - this.field7575;
            this.field7575 += this.field7574 - this.field7575;
            this.field7574 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field7574 += arg1;
            } while (var4 < 10 && this.field7574 < this.field7575);
            if (this.field7575 > this.field7574) {
                this.field7574 = this.field7575;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)J")
    public final long method3814(boolean arg0) {
        this.field7575 += this.method3820((byte) 79);
        if (!arg0) {
            this.method3812(-78, -70L);
        }
        return this.field7575 < this.field7574 ? (this.field7574 - this.field7575) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)J")
    private final long method3820(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field7577;
        this.field7577 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7578[this.field7576] = var4;
            if (this.field7579 < 1) {
                this.field7579++;
            }
            this.field7576 = (this.field7576 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7579; var8++) {
            var6 += this.field7578[(this.field7576 + 10 - var8) % 10];
        }
        if (arg0 < 50) {
            this.field7575 = -87L;
        }
        return var6 / (long) this.field7579;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public final void method3815(byte arg0) {
        int var2 = 33 / ((39 - arg0) / 63);
        if (this.field7575 < this.field7574) {
            this.field7575 += this.field7574 - this.field7575;
        }
        this.field7577 = 0L;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class508() {
        this.field7574 = this.field7575 = jagmisc.nanoTime();
        if (this.field7575 == 0L) {
            throw new RuntimeException();
        }
    }
}
