import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class388 extends class389 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "J")
    private long field5693 = 0L;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "J")
    private long field5694 = 0L;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    private int field5696 = 1;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "J")
    private long field5697 = 0L;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[J")
    private long[] field5695 = new long[10];

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    private int field5698 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 5)
    public final void method1433(int arg0) {
        if (arg0 == 15954) {
            this.field5697 = 0L;
            if (this.field5693 > this.field5694) {
                this.field5694 += this.field5693 - this.field5694;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V", line = 104)
    public class388() {
        this.field5694 = System.nanoTime();
        this.field5693 = System.nanoTime();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)J", line = 24)
    private final long method2460(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5697;
        int var6 = 39 / ((-arg0 - 19) / 46);
        this.field5697 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5695[this.field5698] = var4;
            this.field5698 = (this.field5698 + 1) % 10;
            if (this.field5696 < 1) {
                this.field5696++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field5696; var9++) {
            var7 += this.field5695[(this.field5698 + 10 - var9) % 10];
        }
        return var7 / (long) this.field5696;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)I", line = 56)
    public final int method1431(int arg0, boolean arg1) {
        if (arg1) {
            this.field5696 = -93;
        }
        this.field5694 += this.method2460((byte) 29);
        long var3 = (long) arg0 * 1000000L;
        if (this.field5693 > this.field5694) {
            class468.method2848((this.field5693 - this.field5694) / 1000000L, (byte) 75);
            this.field5697 += this.field5693 - this.field5694;
            this.field5694 += this.field5693 - this.field5694;
            this.field5693 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5693 += var3;
        } while (var5 < 10 && this.field5694 > this.field5693);
        if (this.field5694 > this.field5693) {
            this.field5693 = this.field5694;
        }
        return var5;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)J", line = 92)
    public final long method1430(int arg0) {
        if (arg0 <= 12) {
            this.field5697 = 9L;
        }
        return this.field5694;
    }
}
