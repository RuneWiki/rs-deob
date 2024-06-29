import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class49 extends class124 {

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "J")
    private long field565 = 0L;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "J")
    private long field566 = 0L;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    private int field567 = 1;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "J")
    private long field569 = 0L;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    private int field568 = 0;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "[J")
    private long[] field570 = new long[10];

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)J")
    public final long method299(byte arg0) {
        if (arg0 != -95) {
            this.field570 = (long[]) null;
        }
        return this.field566;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
    public final int method300(int arg0, int arg1) {
        if (arg1 != 6223) {
            this.field569 = -38L;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field566 += this.method302(1);
        if (this.field565 > this.field566) {
            class278.method1757((this.field565 - this.field566) / 1000000L, 0);
            this.field569 += this.field565 - this.field566;
            this.field566 += this.field565 - this.field566;
            this.field565 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field565 += var3;
        } while (var5 < 10 && this.field565 < this.field566);
        if (this.field565 < this.field566) {
            this.field565 = this.field566;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
    public final void method301(int arg0) {
        if (this.field566 < this.field565) {
            this.field566 += this.field565 - this.field566;
        }
        if (arg0 != -1) {
            this.method302(107);
        }
        this.field569 = 0L;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)J")
    private final long method302(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field569;
        this.field569 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field570[this.field568] = var4;
            this.field568 = (this.field568 + 1) % 10;
            if (this.field567 < 1) {
                this.field567++;
            }
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field567; var8++) {
            var6 += this.field570[(this.field568 + 10 - var8) % 10];
        }
        return var6 / (long) this.field567;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
    public class49() {
        this.field566 = System.nanoTime();
        this.field565 = System.nanoTime();
    }
}
