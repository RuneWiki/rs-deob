import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class489 extends class216 {

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "J")
    private long field7035 = 0L;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "J")
    private long field7036 = 0L;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "J")
    private long field7038 = 0L;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    private int field7039 = 1;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    private int field7037 = 0;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "[J")
    private long[] field7040 = new long[10];

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
    public final int method1496(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != 2007665840) {
            this.method2913(-117);
        }
        this.field7036 += this.method2913(10);
        if (this.field7035 > this.field7036) {
            class434.method2690(10, (this.field7035 - this.field7036) / 1000000L);
            this.field7038 += this.field7035 - this.field7036;
            this.field7036 += this.field7035 - this.field7036;
            this.field7035 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field7035 += var3;
            var5++;
        } while (var5 < 10 && this.field7035 < this.field7036);
        if (this.field7035 < this.field7036) {
            this.field7035 = this.field7036;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)J")
    public final long method1501(int arg0) {
        if (arg0 != -26653) {
            this.method2913(-70);
        }
        return this.field7036;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)J")
    private final long method2913(int arg0) {
        if (arg0 != 10) {
            return 85L;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field7038;
        this.field7038 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7040[this.field7037] = var4;
            if (this.field7039 < 1) {
                this.field7039++;
            }
            this.field7037 = (this.field7037 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7039; var8++) {
            var6 += this.field7040[(this.field7037 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7039;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public final void method1494(int arg0) {
        int var2 = -110 % ((-arg0 - 28) / 58);
        this.field7038 = 0L;
        if (this.field7036 < this.field7035) {
            this.field7036 += this.field7035 - this.field7036;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class489() {
        this.field7035 = this.field7036 = jagmisc.nanoTime();
        if (this.field7036 == 0L) {
            throw new RuntimeException();
        }
    }
}
