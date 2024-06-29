import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class242 extends class624 {

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "J")
    private long field3181 = 0L;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "J")
    private long field3182 = 0L;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "[J")
    private long[] field3184 = new long[10];

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "J")
    private long field3183 = 0L;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    private int field3185 = 1;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    private int field3186 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)J")
    public final long method1516(byte arg0) {
        if (arg0 >= -10) {
            this.method1517(79);
        }
        return this.field3182;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method1517(int arg0) {
        this.field3183 = arg0;
        if (this.field3181 > this.field3182) {
            this.field3182 += this.field3181 - this.field3182;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)J")
    private final long method1520(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3183;
        this.field3183 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3184[this.field3186] = var4;
            this.field3186 = (this.field3186 + 1) % 10;
            if (this.field3185 < 1) {
                this.field3185++;
            }
        }
        long var6 = 0L;
        if (arg0 > -25) {
            this.field3182 = -16L;
        }
        for (int var8 = 1; var8 <= this.field3185; var8++) {
            var6 += this.field3184[(this.field3186 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3185;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JB)I")
    public final int method1515(long arg0, byte arg1) {
        if (arg1 > -121) {
            return 31;
        } else if (this.field3182 < this.field3181) {
            this.field3183 += this.field3181 - this.field3182;
            this.field3182 += this.field3181 - this.field3182;
            this.field3181 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field3181 += arg0;
                var4++;
            } while (var4 < 10 && this.field3181 < this.field3182);
            if (this.field3182 > this.field3181) {
                this.field3181 = this.field3182;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)J")
    public final long method1519(byte arg0) {
        this.field3182 += this.method1520((byte) -43);
        if (this.field3182 < this.field3181) {
            return (this.field3181 - this.field3182) / 1000000L;
        } else {
            if (arg0 < 99) {
                this.method1517(50);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class242() {
        this.field3181 = this.field3182 = jagmisc.nanoTime();
        if (this.field3182 == 0L) {
            throw new RuntimeException();
        }
    }
}
