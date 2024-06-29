import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class110 extends class129 {

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "J")
    private long field1771 = 0L;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "J")
    private long field1770 = 0L;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[J")
    private long[] field1772 = new long[10];

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    private int field1773 = 0;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "J")
    private long field1774 = 0L;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    private int field1775 = 1;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(JI)I", line = 3)
    public final int method896(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method897(true);
        }
        if (this.field1770 > this.field1771) {
            this.field1774 += this.field1770 - this.field1771;
            this.field1771 += this.field1770 - this.field1771;
            this.field1770 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field1770 += arg0;
        } while (var4 < 10 && this.field1771 > this.field1770);
        if (this.field1770 < this.field1771) {
            this.field1770 = this.field1771;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)J", line = 35)
    private final long method897(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1774;
        this.field1774 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1772[this.field1773] = var4;
            if (this.field1775 < 1) {
                this.field1775++;
            }
            this.field1773 = (this.field1773 + 1) % 10;
        }
        long var6 = 0L;
        if (!arg0) {
            this.field1770 = 52L;
        }
        for (int var8 = 1; var8 <= this.field1775; var8++) {
            var6 += this.field1772[(this.field1773 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1775;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)J", line = 70)
    public final long method898(int arg0) {
        if (arg0 != -8905) {
            this.field1774 = 107L;
        }
        return this.field1771;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)J", line = 80)
    public final long method899(int arg0) {
        this.field1771 += this.method897(true);
        if (arg0 != 92) {
            this.field1774 = 15L;
        }
        return this.field1771 < this.field1770 ? (this.field1770 - this.field1771) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 115)
    public class110() {
        this.field1770 = this.field1771 = jagmisc.nanoTime();
        if (this.field1771 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 103)
    public final void method900(boolean arg0) {
        this.field1774 = 0L;
        if (!arg0) {
            this.method897(true);
        }
        if (this.field1771 < this.field1770) {
            this.field1771 += this.field1770 - this.field1771;
        }
    }
}
