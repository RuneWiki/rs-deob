import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class347 extends class342 {

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "J")
    private long field4552 = 0L;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "J")
    private long field4553 = 0L;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    private int field4556 = 1;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    private int field4555 = 0;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "[J")
    private long[] field4554 = new long[10];

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "J")
    private long field4557 = 0L;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(JI)I", line = 3)
    public final int method1967(long arg0, int arg1) {
        if (arg1 != 1) {
            return -124;
        } else if (this.field4553 < this.field4552) {
            this.field4557 += this.field4552 - this.field4553;
            this.field4553 += this.field4552 - this.field4553;
            this.field4552 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field4552 += arg0;
            } while (var4 < 10 && this.field4552 < this.field4553);
            if (this.field4553 > this.field4552) {
                this.field4552 = this.field4553;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)J", line = 37)
    public final long method1969(byte arg0) {
        this.field4553 += this.method1983(true);
        if (this.field4552 > this.field4553) {
            return (this.field4552 - this.field4553) / 1000000L;
        } else {
            if (arg0 < 34) {
                this.field4556 = 5;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)J", line = 53)
    public final long method1965(int arg0) {
        if (arg0 != 1) {
            this.field4555 = 5;
        }
        return this.field4553;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V", line = 82)
    public class347() {
        this.field4552 = this.field4553 = jagmisc.nanoTime();
        if (this.field4553 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V", line = 66)
    public final void method1966(int arg0) {
        this.field4557 = 0L;
        if (arg0 != 12104) {
            this.field4554 = null;
        }
        if (this.field4552 > this.field4553) {
            this.field4553 += this.field4552 - this.field4553;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)J", line = 106)
    private final long method1983(boolean arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4557;
        this.field4557 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4554[this.field4555] = var4;
            if (this.field4556 < 1) {
                this.field4556++;
            }
            this.field4555 = (this.field4555 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4556; var8++) {
            var6 += this.field4554[(this.field4555 + 10 - var8) % 10];
        }
        if (!arg0) {
            this.method1966(10);
        }
        return var6 / (long) this.field4556;
    }
}
