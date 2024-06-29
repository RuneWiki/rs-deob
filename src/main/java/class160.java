import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class160 extends class96 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[J")
    private long[] field2407 = new long[10];

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "J")
    private long field2405 = 0L;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    private int field2406 = 1;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "J")
    private long field2409 = 0L;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    private int field2410 = 0;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "J")
    private long field2408 = 0L;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)J", line = 5)
    public final long method705(byte arg0) {
        if (arg0 < 44) {
            this.method708(-11, -10);
        }
        return this.field2405;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)J", line = 16)
    private final long method1053(int arg0) {
        if (arg0 != 29800) {
            return 13L;
        }
        long var2 = class246.method1483(5957) * 1000000L;
        long var4 = var2 - this.field2409;
        this.field2409 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2407[this.field2410] = var4;
            if (this.field2406 < 10) {
                this.field2406++;
            }
            this.field2410 = (this.field2410 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2406; var8++) {
            var6 += this.field2407[(this.field2410 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2406;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I", line = 53)
    public final int method708(int arg0, int arg1) {
        this.field2405 += this.method1053(29800);
        if (arg1 != -1) {
            this.method709(-68);
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field2405 < this.field2408) {
            class157.method1046(-128, (this.field2408 - this.field2405) / 1000000L);
            this.field2409 += this.field2408 - this.field2405;
            this.field2405 += this.field2408 - this.field2405;
            this.field2408 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field2408 += var3;
        } while (var5 < 10 && this.field2405 > this.field2408);
        if (this.field2408 < this.field2405) {
            this.field2408 = this.field2405;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 100)
    public final void method709(int arg0) {
        if (arg0 != 64) {
            this.method709(-90);
        }
        this.field2409 = 0L;
        if (this.field2408 > this.field2405) {
            this.field2405 += this.field2408 - this.field2405;
        }
    }
}
