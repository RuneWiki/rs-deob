import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class36 extends class250 {

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "J")
    private long field450 = 0L;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "J")
    private long field449 = 0L;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    private int field451 = 0;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "J")
    private long field453 = 0L;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    private int field454 = 1;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[J")
    private long[] field452 = new long[10];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)J", line = 4)
    public final long method191(boolean arg0) {
        return arg0 ? this.field450 : 28L;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 103)
    public class36() {
        this.field450 = System.nanoTime();
        this.field449 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)J", line = 20)
    private final long method192(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field453;
        this.field453 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field452[this.field451] = var4;
            if (this.field454 < 1) {
                this.field454++;
            }
            this.field451 = (this.field451 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field454; var8++) {
            var6 += this.field452[(this.field451 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field454;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 51)
    public final void method193(byte arg0) {
        if (arg0 <= -47) {
            if (this.field450 < this.field449) {
                this.field450 += this.field449 - this.field450;
            }
            this.field453 = 0L;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I", line = 69)
    public final int method194(int arg0, int arg1) {
        this.field450 += this.method192(1);
        long var3 = (long) arg0 * 1000000L;
        if (arg1 <= 41) {
            this.field449 = 45L;
        }
        if (this.field449 > this.field450) {
            class259.method1790((byte) -77, (this.field449 - this.field450) / 1000000L);
            this.field453 += this.field449 - this.field450;
            this.field450 += this.field449 - this.field450;
            this.field449 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field449 += var3;
        } while (var5 < 10 && this.field449 < this.field450);
        if (this.field449 < this.field450) {
            this.field449 = this.field450;
        }
        return var5;
    }
}
