import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class323 extends class144 {

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "J")
    private long field4799 = 0L;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "J")
    private long field4800 = 0L;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    private int field4801 = 0;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "[J")
    private long[] field4802 = new long[10];

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "J")
    private long field4803 = 0L;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    private int field4804 = 1;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I")
    public final int method536(int arg0, int arg1) {
        if (arg0 != 16711935) {
            this.method535((byte) -71);
        }
        this.field4800 += this.method2065((byte) -4);
        long var3 = (long) arg1 * 1000000L;
        if (this.field4799 > this.field4800) {
            class477.method2826((this.field4799 - this.field4800) / 1000000L, 0);
            this.field4803 += this.field4799 - this.field4800;
            this.field4800 += this.field4799 - this.field4800;
            this.field4799 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field4799 += var3;
        } while (var5 < 10 && this.field4799 < this.field4800);
        if (this.field4800 > this.field4799) {
            this.field4799 = this.field4800;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)J")
    public final long method537(int arg0) {
        if (arg0 != 16711935) {
            this.field4803 = 41L;
        }
        return this.field4800;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)J")
    private final long method2065(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4803;
        this.field4803 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4802[this.field4801] = var4;
            if (this.field4804 < 1) {
                this.field4804++;
            }
            this.field4801 = (this.field4801 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != -4) {
            this.method536(-65, 113);
        }
        for (int var8 = 1; var8 <= this.field4804; var8++) {
            var6 += this.field4802[(this.field4801 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4804;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public final void method535(byte arg0) {
        if (this.field4799 > this.field4800) {
            this.field4800 += this.field4799 - this.field4800;
        }
        int var2 = -58 % ((arg0 + 65) / 52);
        this.field4803 = 0L;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
    public class323() {
        this.field4799 = this.field4800 = jagmisc.nanoTime();
        if (this.field4800 == 0L) {
            throw new RuntimeException();
        }
    }
}
