import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class327 extends class424 {

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "J")
    private long field5092 = 0L;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "J")
    private long field5093 = 0L;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    private int field5094 = 1;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "[J")
    private long[] field5095 = new long[10];

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "J")
    private long field5097 = 0L;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    private int field5096 = 0;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)J")
    public final long method385(byte arg0) {
        if (arg0 != -71) {
            this.method383(67, 5);
        }
        return this.field5093;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
    public final int method383(int arg0, int arg1) {
        if (arg1 != 0) {
            return -51;
        }
        this.field5093 += this.method2113(true);
        long var3 = (long) arg0 * 1000000L;
        if (this.field5093 < this.field5092) {
            class388.method2433((this.field5092 - this.field5093) / 1000000L, arg1 ^ 0xFFFFFFAC);
            this.field5097 += this.field5092 - this.field5093;
            this.field5093 += this.field5092 - this.field5093;
            this.field5092 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5092 += var3;
            var5++;
        } while (var5 < 10 && this.field5092 < this.field5093);
        if (this.field5092 < this.field5093) {
            this.field5092 = this.field5093;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)J")
    private final long method2113(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5097;
        this.field5097 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5095[this.field5096] = var4;
            if (this.field5094 < 1) {
                this.field5094++;
            }
            this.field5096 = (this.field5096 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0) {
            for (int var8 = 1; var8 <= this.field5094; var8++) {
                var6 += this.field5095[(this.field5096 - (var8 - 10)) % 10];
            }
            return var6 / (long) this.field5094;
        } else {
            return 87L;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method386(int arg0) {
        if (this.field5092 > this.field5093) {
            this.field5093 += this.field5092 - this.field5093;
        }
        this.field5097 = 0L;
        if (arg0 != 1206) {
            this.field5093 = -124L;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class327() {
        this.field5092 = this.field5093 = jagmisc.nanoTime();
        if (this.field5093 == 0L) {
            throw new RuntimeException();
        }
    }
}
