import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class243 extends class320 {

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "J")
    private long field3503 = 0L;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "J")
    private long field3504 = 0L;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    private int field3505 = 0;

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "I")
    private int field3507 = 1;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "J")
    private long field3508 = 0L;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "[J")
    private long[] field3506 = new long[10];

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)J", line = 3)
    public final long method1403(byte arg0) {
        this.field3503 += this.method2004(11498);
        if (this.field3504 > this.field3503) {
            return (this.field3504 - this.field3503) / 1000000L;
        } else {
            if (arg0 != 11) {
                this.method1403((byte) 105);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)J", line = 20)
    private final long method2004(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3508;
        this.field3508 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3506[this.field3505] = var4;
            if (this.field3507 < 1) {
                this.field3507++;
            }
            this.field3505 = (this.field3505 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != 11498) {
            this.method1403((byte) -3);
        }
        for (int var8 = 1; var8 <= this.field3507; var8++) {
            var6 += this.field3506[(this.field3505 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3507;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(Z)J", line = 54)
    public final long method1404(boolean arg0) {
        return arg0 ? this.field3503 : -82L;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IJ)I", line = 65)
    public final int method1401(int arg0, long arg1) {
        if (arg0 != 0) {
            this.method1404(true);
        }
        if (this.field3503 < this.field3504) {
            this.field3508 += this.field3504 - this.field3503;
            this.field3503 += this.field3504 - this.field3503;
            this.field3504 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field3504 += arg1;
            var4++;
        } while (var4 < 10 && this.field3504 < this.field3503);
        if (this.field3504 < this.field3503) {
            this.field3504 = this.field3503;
        }
        return var4;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V", line = 98)
    public final void method1402(int arg0) {
        if (arg0 != 7521) {
            this.field3506 = null;
        }
        if (this.field3504 > this.field3503) {
            this.field3503 += this.field3504 - this.field3503;
        }
        this.field3508 = 0L;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V", line = 117)
    public class243() {
        this.field3504 = this.field3503 = jagmisc.nanoTime();
        if (this.field3503 == 0L) {
            throw new RuntimeException();
        }
    }
}
