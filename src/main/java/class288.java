import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class288 extends class349 {

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "J")
    private long field4011 = 0L;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "J")
    private long field4012 = 0L;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    private int field4013 = 0;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[J")
    private long[] field4014 = new long[10];

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "J")
    private long field4015 = 0L;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    private int field4016 = 1;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)J")
    public final long method1715(boolean arg0) {
        if (!arg0) {
            this.field4012 = -73L;
        }
        return this.field4012;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZJ)I")
    public final int method1714(boolean arg0, long arg1) {
        if (arg0) {
            this.field4014 = null;
        }
        if (this.field4012 < this.field4011) {
            this.field4015 += this.field4011 - this.field4012;
            this.field4012 += this.field4011 - this.field4012;
            this.field4011 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field4011 += arg1;
        } while (var4 < 10 && this.field4011 < this.field4012);
        if (this.field4012 > this.field4011) {
            this.field4011 = this.field4012;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)J")
    private final long method1785(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4015;
        this.field4015 = var2;
        if (arg0 <= 110) {
            return -91L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4014[this.field4013] = var4;
            if (this.field4016 < 1) {
                this.field4016++;
            }
            this.field4013 = (this.field4013 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4016; var8++) {
            var6 += this.field4014[(this.field4013 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4016;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public final void method1717(int arg0) {
        if (arg0 != 31913) {
            this.method1785(127);
        }
        this.field4015 = 0L;
        if (this.field4012 < this.field4011) {
            this.field4012 += this.field4011 - this.field4012;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)J")
    public final long method1718(int arg0) {
        this.field4012 += this.method1785(112);
        if (arg0 == -16722) {
            return this.field4012 < this.field4011 ? (this.field4011 - this.field4012) / 1000000L : 0L;
        } else {
            return 29L;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class288() {
        this.field4012 = System.nanoTime();
        this.field4011 = System.nanoTime();
    }
}
