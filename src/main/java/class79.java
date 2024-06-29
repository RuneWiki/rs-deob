import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class79 extends class69 {

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "J")
    private long field1245 = 0L;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    private int field1246 = 0;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[J")
    private long[] field1247 = new long[10];

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    private int field1248 = 1;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "J")
    private long field1249 = 0L;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "J")
    private long field1250 = 0L;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBI)I")
    public final int method547(int arg0, byte arg1, int arg2) {
        client.method323((long) arg0, -117);
        if (arg1 != -41) {
            this.field1250 = 1L;
        }
        this.field1249 += this.method628(-125);
        long var4 = (long) arg2 * 1000000L;
        if (this.field1249 < this.field1250) {
            client.method323((this.field1250 - this.field1249) / 1000000L, -118);
            this.field1245 += this.field1250 - this.field1249;
            this.field1249 += this.field1250 - this.field1249;
            this.field1250 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1250 += var4;
        } while (var6 < 10 && this.field1250 < this.field1249);
        if (this.field1249 > this.field1250) {
            this.field1250 = this.field1249;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)J")
    public final long method551(byte arg0) {
        if (arg0 != 114) {
            this.field1249 = -57L;
        }
        return this.field1249;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)J")
    private final long method628(int arg0) {
        long var2 = class257.method1736(14361) * 1000000L;
        long var4 = var2 - this.field1245;
        long var6 = 0L;
        this.field1245 = var2;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field1247[this.field1246] = var4;
            this.field1246 = (this.field1246 + 1) % 10;
            if (this.field1248 < 10) {
                this.field1248++;
            }
        }
        if (arg0 > -124) {
            this.field1245 = -43L;
        }
        for (int var8 = 1; var8 <= this.field1248; var8++) {
            var6 += this.field1247[(this.field1246 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1248;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public final void method546(int arg0) {
        if (arg0 == 32768) {
            if (this.field1250 > this.field1249) {
                this.field1249 += this.field1250 - this.field1249;
            }
            this.field1245 = 0L;
        }
    }
}
