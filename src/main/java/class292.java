import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class292 extends class225 {

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "J")
    private long field4690 = 0L;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "J")
    private long field4691 = 0L;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "[J")
    private long[] field4693 = new long[10];

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    private int field4695 = 0;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "J")
    private long field4694 = 0L;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    private int field4692 = 1;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)J")
    private final long method1982(int arg0) {
        if (arg0 != -1) {
            this.field4693 = null;
        }
        long var2 = 0L;
        long var4 = jagmisc.nanoTime();
        long var6 = var4 - this.field4694;
        this.field4694 = var4;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field4693[this.field4695] = var6;
            if (this.field4692 < 1) {
                this.field4692++;
            }
            this.field4695 = (this.field4695 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field4692; var8++) {
            var2 += this.field4693[(this.field4695 - (var8 - 10)) % 10];
        }
        return var2 / (long) this.field4692;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public final void method178(boolean arg0) {
        if (this.field4691 > this.field4690) {
            this.field4690 += this.field4691 - this.field4690;
        }
        this.field4694 = 0L;
        if (arg0) {
            this.field4692 = 104;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)I")
    public final int method176(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.method1982(-52);
        }
        class7.method43(-90, (long) arg0);
        this.field4690 += this.method1982(-1);
        long var4 = (long) arg1 * 1000000L;
        if (this.field4691 > this.field4690) {
            class7.method43(-114, (this.field4691 - this.field4690) / 1000000L);
            this.field4694 += this.field4691 - this.field4690;
            this.field4690 += this.field4691 - this.field4690;
            this.field4691 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            this.field4691 += var4;
            var6++;
        } while (var6 < 10 && this.field4691 < this.field4690);
        if (this.field4691 < this.field4690) {
            this.field4691 = this.field4690;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)J")
    public final long method177(byte arg0) {
        int var2 = -22 % ((70 - arg0) / 54);
        return this.field4690;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class292() {
        this.field4691 = this.field4690 = jagmisc.nanoTime();
        if (this.field4690 == 0L) {
            throw new RuntimeException();
        }
    }
}
