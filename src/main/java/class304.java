import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class304 extends class287 {

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "J")
    private long field4363 = 0L;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "[J")
    private long[] field4364 = new long[10];

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    private int field4365 = 0;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "J")
    private long field4366 = 0L;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    private int field4367 = 1;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "J")
    private long field4368 = 0L;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)J")
    private final long method1926(int arg0) {
        long var2 = class464.method2773((byte) 103) * 1000000L;
        long var4 = var2 - this.field4363;
        this.field4363 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4364[this.field4365] = var4;
            this.field4365 = (this.field4365 + 1) % 10;
            if (this.field4367 < 10) {
                this.field4367++;
            }
        }
        long var6 = 0L;
        int var8 = 90 % ((76 - arg0) / 36);
        for (int var9 = 1; var9 <= this.field4367; var9++) {
            var6 += this.field4364[(this.field4365 + 10 - var9) % 10];
        }
        return var6 / (long) this.field4367;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public final void method1031(int arg0) {
        this.field4363 = 0L;
        if (arg0 < 114) {
            this.field4363 = -82L;
        }
        if (this.field4366 > this.field4368) {
            this.field4368 += this.field4366 - this.field4368;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)J")
    public final long method1028(int arg0) {
        if (arg0 != 0) {
            this.field4366 = -128L;
        }
        return this.field4368;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)I")
    public final int method1029(int arg0, int arg1) {
        long var3 = (long) arg0 * 1000000L;
        if (arg1 >= -16) {
            this.field4365 = 1;
        }
        this.field4368 += this.method1926(127);
        if (this.field4368 < this.field4366) {
            class185.method1285(122, (this.field4366 - this.field4368) / 1000000L);
            this.field4363 += this.field4366 - this.field4368;
            this.field4368 += this.field4366 - this.field4368;
            this.field4366 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4366 += var3;
        } while (var5 < 10 && this.field4366 < this.field4368);
        if (this.field4368 > this.field4366) {
            this.field4366 = this.field4368;
        }
        return var5;
    }
}
