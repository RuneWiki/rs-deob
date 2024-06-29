import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class53 extends class225 {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "J")
    private long field764 = 0L;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "J")
    private long field765 = 0L;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[J")
    private long[] field766 = new long[10];

    @OriginalMember(owner = "client!il", name = "g", descriptor = "J")
    private long field767 = 0L;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    private int field769 = 0;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    private int field768 = 1;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)J")
    private final long method356(int arg0) {
        long var2 = (long) arg0;
        long var4 = System.nanoTime();
        long var6 = var4 - this.field767;
        this.field767 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field766[this.field769] = var6;
            this.field769 = (this.field769 + 1) % 10;
            if (this.field768 < 1) {
                this.field768++;
            }
        }
        for (int var8 = 1; var8 <= this.field768; var8++) {
            var2 += this.field766[(this.field769 + 10 - var8) % 10];
        }
        return var2 / (long) this.field768;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)I")
    public final int method176(int arg0, int arg1, int arg2) {
        class7.method43(-107, (long) arg0);
        this.field765 += this.method356(0);
        if (arg2 != 2) {
            this.method178(true);
        }
        long var4 = (long) arg1 * 1000000L;
        if (this.field764 > this.field765) {
            class7.method43(arg2 ^ 0xFFFFFFC5, (this.field764 - this.field765) / 1000000L);
            this.field767 += this.field764 - this.field765;
            this.field765 += this.field764 - this.field765;
            this.field764 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field764 += var4;
        } while (var6 < 10 && this.field764 < this.field765);
        if (this.field765 > this.field764) {
            this.field764 = this.field765;
        }
        return var6;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public final void method178(boolean arg0) {
        if (!arg0) {
            this.field767 = 0L;
            if (this.field764 > this.field765) {
                this.field765 += this.field764 - this.field765;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)J")
    public final long method177(byte arg0) {
        int var2 = 96 / ((arg0 - 70) / 54);
        return this.field765;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class53() {
        this.field765 = System.nanoTime();
        this.field764 = System.nanoTime();
    }
}
