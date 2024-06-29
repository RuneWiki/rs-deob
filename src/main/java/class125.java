import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class125 extends class164 {

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    private int field2086 = 1;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "J")
    private long field2087 = 0L;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "[J")
    private long[] field2085 = new long[10];

    @OriginalMember(owner = "client!al", name = "i", descriptor = "J")
    private long field2084 = 0L;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "J")
    private long field2083 = 0L;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    private int field2088 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public final void method919(int arg0) {
        if (this.field2083 < this.field2087) {
            this.field2083 += this.field2087 - this.field2083;
        }
        if (arg0 != -8) {
            this.method919(-60);
        }
        this.field2084 = 0L;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)J")
    public final long method920(int arg0) {
        if (arg0 != -2657) {
            this.field2086 = 74;
        }
        return this.field2083;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
    public final int method921(int arg0, int arg1, int arg2) {
        if (arg1 != 6) {
            return 110;
        }
        class234.method1550(-28773, (long) arg2);
        this.field2083 += this.method922(false);
        long var4 = (long) arg0 * 1000000L;
        if (this.field2087 > this.field2083) {
            class234.method1550(-28773, (this.field2087 - this.field2083) / 1000000L);
            this.field2084 += this.field2087 - this.field2083;
            this.field2083 += this.field2087 - this.field2083;
            this.field2087 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field2087 += var4;
            var6++;
        } while (var6 < 10 && this.field2083 > this.field2087);
        if (this.field2087 < this.field2083) {
            this.field2087 = this.field2083;
        }
        return var6;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)J")
    private final long method922(boolean arg0) {
        long var2 = class62.method472(88) * 1000000L;
        if (arg0) {
            this.method921(-44, -47, -109);
        }
        long var4 = var2 - this.field2084;
        long var6 = 0L;
        this.field2084 = var2;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field2085[this.field2088] = var4;
            if (this.field2086 < 10) {
                this.field2086++;
            }
            this.field2088 = (this.field2088 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field2086; var8++) {
            var6 += this.field2085[(this.field2088 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2086;
    }
}
