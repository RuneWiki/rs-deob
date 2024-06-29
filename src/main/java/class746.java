import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class746 extends class310 {

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "[J")
    private long[] field10365 = new long[10];

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    private int field10366 = 0;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "J")
    private long field10368 = 0L;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
    private int field10369 = 1;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "J")
    private long field10367 = 0L;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "J")
    private long field10370 = 0L;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(JI)I")
    public final int method1835(long arg0, int arg1) {
        if (arg1 != 3) {
            return 77;
        } else if (this.field10368 < this.field10370) {
            this.field10367 += this.field10370 - this.field10368;
            this.field10368 += this.field10370 - this.field10368;
            this.field10370 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field10370 += arg0;
                var4++;
            } while (var4 < 10 && this.field10368 > this.field10370);
            if (this.field10368 > this.field10370) {
                this.field10370 = this.field10368;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)J")
    public final long method1836(boolean arg0) {
        this.field10368 += this.method4173(90);
        if (!arg0) {
            this.field10369 = -124;
        }
        return this.field10368 < this.field10370 ? (this.field10370 - this.field10368) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)J")
    public final long method1831(int arg0) {
        if (arg0 != -2) {
            this.method1836(true);
        }
        return this.field10368;
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)J")
    private final long method4173(int arg0) {
        long var2 = class349.method2069(true) * 1000000L;
        long var4 = var2 - this.field10367;
        this.field10367 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field10365[this.field10366] = var4;
            this.field10366 = (this.field10366 + 1) % 10;
            if (this.field10369 < 10) {
                this.field10369++;
            }
        }
        long var6 = 0L;
        int var8 = 97 % ((5 - arg0) / 63);
        for (int var9 = 1; var9 <= this.field10369; var9++) {
            var6 += this.field10365[(this.field10366 - (var9 - 10)) % 10];
        }
        return var6 / (long) this.field10369;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
    public final void method1833(byte arg0) {
        if (arg0 < 16) {
            this.method1836(true);
        }
        this.field10367 = 0L;
        if (this.field10370 > this.field10368) {
            this.field10368 += this.field10370 - this.field10368;
        }
    }
}
