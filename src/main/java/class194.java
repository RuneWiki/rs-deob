import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class194 extends class457 {

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "J")
    private long field2516 = 0L;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "J")
    private long field2515 = 0L;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "[J")
    private long[] field2518 = new long[10];

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    private int field2519 = 1;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "J")
    private long field2520 = 0L;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    private int field2517 = 0;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BJ)I")
    public final int method1215(byte arg0, long arg1) {
        if (arg0 >= -33) {
            this.field2516 = 105L;
        }
        if (this.field2515 < this.field2516) {
            this.field2520 += this.field2516 - this.field2515;
            this.field2515 += this.field2516 - this.field2515;
            this.field2516 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field2516 += arg1;
            var4++;
        } while (var4 < 10 && this.field2515 > this.field2516);
        if (this.field2515 > this.field2516) {
            this.field2516 = this.field2515;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)J")
    private final long method1216(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field2520;
        this.field2520 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2518[this.field2517] = var4;
            if (this.field2519 < 1) {
                this.field2519++;
            }
            this.field2517 = (this.field2517 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field2519; var8++) {
            var6 += this.field2518[(this.field2517 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2519;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V")
    public final void method1217(int arg0) {
        int var2 = 114 % ((arg0 - 54) / 39);
        if (this.field2516 > this.field2515) {
            this.field2515 += this.field2516 - this.field2515;
        }
        this.field2520 = 0L;
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)J")
    public final long method1218(int arg0) {
        if (arg0 != -3152) {
            this.field2520 = 0L;
        }
        this.field2515 += this.method1216(1);
        return this.field2516 <= this.field2515 ? 0L : (this.field2516 - this.field2515) / 1000000L;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)J")
    public final long method1219(int arg0) {
        if (arg0 != -18641) {
            this.method1219(-53);
        }
        return this.field2515;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
    public class194() {
        this.field2515 = System.nanoTime();
        this.field2516 = System.nanoTime();
    }
}
