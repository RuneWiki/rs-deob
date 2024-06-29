import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class413 extends class47 {

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    private int field5979 = 0;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    private int field5981 = 1;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "J")
    private long field5982 = 0L;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "J")
    private long field5980 = 0L;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "J")
    private long field5983 = 0L;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[J")
    private long[] field5984 = new long[10];

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)J")
    public final long method339(boolean arg0) {
        return arg0 ? -34L : this.field5980;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public final void method334(byte arg0) {
        if (arg0 == -120) {
            if (this.field5982 > this.field5980) {
                this.field5980 += this.field5982 - this.field5980;
            }
            this.field5983 = 0L;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)I")
    public final int method337(int arg0, boolean arg1) {
        if (!arg1) {
            return 109;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field5980 += this.method2609(-41);
        if (this.field5982 > this.field5980) {
            class31.method245((this.field5982 - this.field5980) / 1000000L, -83);
            this.field5983 += this.field5982 - this.field5980;
            this.field5980 += this.field5982 - this.field5980;
            this.field5982 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5982 += var3;
            var5++;
        } while (var5 < 10 && this.field5982 < this.field5980);
        if (this.field5982 < this.field5980) {
            this.field5982 = this.field5980;
        }
        return var5;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)J")
    private final long method2609(int arg0) {
        long var2 = class98.method768((byte) -119) * 1000000L;
        long var4 = var2 - this.field5983;
        this.field5983 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5984[this.field5979] = var4;
            if (this.field5981 < 10) {
                this.field5981++;
            }
            this.field5979 = (this.field5979 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        int var9 = -115 % ((arg0 - 14) / 53);
        while (this.field5981 >= var8) {
            var6 += this.field5984[(this.field5979 - (var8 - 10)) % 10];
            var8++;
        }
        return var6 / (long) this.field5981;
    }
}
