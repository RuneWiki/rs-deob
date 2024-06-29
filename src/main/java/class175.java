import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class175 extends class409 {

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "J")
    private long field2474 = 0L;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    private int field2473 = 0;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "J")
    private long field2476 = 0L;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[J")
    private long[] field2477 = new long[10];

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "J")
    private long field2475 = 0L;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    private int field2478 = 1;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public final void method492(int arg0) {
        this.field2476 = 0L;
        int var2 = 125 % ((50 - arg0) / 60);
        if (this.field2474 < this.field2475) {
            this.field2474 += this.field2475 - this.field2474;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)J")
    public final long method491(int arg0) {
        return arg0 == -30419 ? this.field2474 : 34L;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)I")
    public final int method493(byte arg0, int arg1) {
        if (arg0 != -126) {
            this.method1174(true);
        }
        this.field2474 += this.method1174(false);
        long var3 = (long) arg1 * 1000000L;
        if (this.field2474 < this.field2475) {
            class4.method28((this.field2475 - this.field2474) / 1000000L, -103);
            this.field2476 += this.field2475 - this.field2474;
            this.field2474 += this.field2475 - this.field2474;
            this.field2475 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field2475 += var3;
            var5++;
        } while (var5 < 10 && this.field2474 > this.field2475);
        if (this.field2475 < this.field2474) {
            this.field2475 = this.field2474;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)J")
    private final long method1174(boolean arg0) {
        long var2 = class224.method1425(-26805) * 1000000L;
        long var4 = var2 - this.field2476;
        this.field2476 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2477[this.field2473] = var4;
            this.field2473 = (this.field2473 + 1) % 10;
            if (this.field2478 < 10) {
                this.field2478++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2478; var8++) {
            var6 += this.field2477[(this.field2473 + 10 - var8) % 10];
        }
        if (arg0) {
            this.method1174(false);
        }
        return var6 / (long) this.field2478;
    }
}
