import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class483 extends class548 {

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "J")
    private long field7080 = 0L;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "J")
    private long field7081 = 0L;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    private int field7082 = 0;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "J")
    private long field7085 = 0L;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    private int field7083 = 1;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "[J")
    private long[] field7084 = new long[10];

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)J")
    public final long method1605(int arg0) {
        if (arg0 == 12948) {
            this.field7081 += this.method2923(1);
            return this.field7080 > this.field7081 ? (this.field7080 - this.field7081) / 1000000L : 0L;
        } else {
            return -34L;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public final void method1606(byte arg0) {
        int var2 = -127 % ((-arg0 - 69) / 41);
        if (this.field7081 < this.field7080) {
            this.field7081 += this.field7080 - this.field7081;
        }
        this.field7085 = 0L;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)J")
    public final long method1607(byte arg0) {
        return arg0 > -71 ? -19L : this.field7081;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(JI)I")
    public final int method1604(long arg0, int arg1) {
        if (arg1 != 50) {
            this.field7082 = -39;
        }
        if (this.field7080 > this.field7081) {
            this.field7085 += this.field7080 - this.field7081;
            this.field7081 += this.field7080 - this.field7081;
            this.field7080 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field7080 += arg0;
            var4++;
        } while (var4 < 10 && this.field7081 > this.field7080);
        if (this.field7081 > this.field7080) {
            this.field7080 = this.field7081;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)J")
    private final long method2923(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7085;
        this.field7085 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7084[this.field7082] = var4;
            if (this.field7083 < 1) {
                this.field7083++;
            }
            this.field7082 = (this.field7082 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field7083; var8++) {
            var6 += this.field7084[(this.field7082 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7083;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
    public class483() {
        this.field7081 = System.nanoTime();
        this.field7080 = System.nanoTime();
    }
}
