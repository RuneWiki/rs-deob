import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class80 extends class192 {

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "J")
    private long field1172 = 0L;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "J")
    private long field1169 = 0L;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[J")
    private long[] field1167 = new long[10];

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "J")
    private long field1170 = 0L;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    private int field1168 = 0;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field1171 = 1;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)I")
    public final int method457(byte arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field1169 += this.method694((byte) 70);
        if (arg0 != 119) {
            this.field1168 = -59;
        }
        if (this.field1170 > this.field1169) {
            class89.method752(0, (this.field1170 - this.field1169) / 1000000L);
            this.field1172 += this.field1170 - this.field1169;
            this.field1169 += this.field1170 - this.field1169;
            this.field1170 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1170 += var3;
        } while (var5 < 10 && this.field1170 < this.field1169);
        if (this.field1170 < this.field1169) {
            this.field1170 = this.field1169;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)J")
    private final long method694(byte arg0) {
        long var2 = class10.method51(-3183) * 1000000L;
        long var4 = var2 - this.field1172;
        this.field1172 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1167[this.field1168] = var4;
            this.field1168 = (this.field1168 + 1) % 10;
            if (this.field1171 < 10) {
                this.field1171++;
            }
        }
        int var6 = 60 % ((arg0 - 19) / 40);
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field1171; var9++) {
            var7 += this.field1167[(this.field1168 + 10 - var9) % 10];
        }
        return var7 / (long) this.field1171;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)J")
    public final long method458(int arg0) {
        int var2 = -27 % ((arg0 - 77) / 35);
        return this.field1169;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public final void method460(int arg0) {
        if (this.field1169 < this.field1170) {
            this.field1169 += this.field1170 - this.field1169;
        }
        if (arg0 > 22) {
            this.field1172 = 0L;
        }
    }
}
