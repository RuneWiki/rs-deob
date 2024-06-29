import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class389 extends class543 {

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "J")
    private long field5611 = 0L;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "J")
    private long field5610 = 0L;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[J")
    private long[] field5614 = new long[10];

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    private int field5613 = 1;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    private int field5612 = 0;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "J")
    private long field5615 = 0L;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)J", line = 3)
    public final long method2444(int arg0) {
        if (arg0 > -45) {
            this.method2448(-128);
        }
        return this.field5611;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)J", line = 13)
    public final long method2445(boolean arg0) {
        if (arg0) {
            this.field5611 += this.method2447((byte) 78);
            return this.field5610 > this.field5611 ? (this.field5610 - this.field5611) / 1000000L : 0L;
        } else {
            return 104L;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IJ)I", line = 29)
    public final int method2446(int arg0, long arg1) {
        if (arg0 != 23122) {
            this.field5613 = -121;
        }
        if (this.field5611 < this.field5610) {
            this.field5615 += this.field5610 - this.field5611;
            this.field5611 += this.field5610 - this.field5611;
            this.field5610 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field5610 += arg1;
            var4++;
        } while (var4 < 10 && this.field5610 < this.field5611);
        if (this.field5611 > this.field5610) {
            this.field5610 = this.field5611;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)J", line = 63)
    private final long method2447(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5615;
        this.field5615 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5614[this.field5612] = var4;
            if (this.field5613 < 1) {
                this.field5613++;
            }
            this.field5612 = (this.field5612 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = 1;
        if (arg0 != 78) {
            this.method2448(25);
        }
        while (this.field5613 >= var8) {
            var6 += this.field5614[(this.field5612 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field5613;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 117)
    public class389() {
        this.field5610 = this.field5611 = jagmisc.nanoTime();
        if (this.field5611 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 104)
    public final void method2448(int arg0) {
        if (arg0 <= 66) {
            this.method2446(20, 112L);
        }
        this.field5615 = 0L;
        if (this.field5610 > this.field5611) {
            this.field5611 += this.field5610 - this.field5611;
        }
    }
}
