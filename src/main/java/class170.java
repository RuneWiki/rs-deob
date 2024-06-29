import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class170 extends class642 {

    @OriginalMember(owner = "client!al", name = "f", descriptor = "J")
    private long field2106 = 0L;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "J")
    private long field2107 = 0L;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "J")
    private long field2108 = 0L;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "[J")
    private long[] field2109 = new long[10];

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    private int field2110 = 1;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    private int field2111 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 3)
    public final void method613(int arg0) {
        if (arg0 <= -31) {
            if (this.field2107 < this.field2106) {
                this.field2107 += this.field2106 - this.field2107;
            }
            this.field2108 = 0L;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JI)I", line = 17)
    public final int method615(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field2106 = 94L;
        }
        if (this.field2106 > this.field2107) {
            this.field2108 += this.field2106 - this.field2107;
            this.field2107 += this.field2106 - this.field2107;
            this.field2106 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field2106 += arg0;
            var4++;
        } while (var4 < 10 && this.field2107 > this.field2106);
        if (this.field2106 < this.field2107) {
            this.field2106 = this.field2107;
        }
        return var4;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)J", line = 50)
    public final long method616(int arg0) {
        this.field2107 += this.method1161(126);
        if (arg0 == 0) {
            return this.field2107 < this.field2106 ? (this.field2106 - this.field2107) / 1000000L : 0L;
        } else {
            return -96L;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)J", line = 68)
    private final long method1161(int arg0) {
        if (arg0 < 5) {
            return 78L;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2108;
        this.field2108 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field2109[this.field2111] = var4;
            this.field2111 = (this.field2111 + 1) % 10;
            if (this.field2110 < 1) {
                this.field2110++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field2110; var8++) {
            var6 += this.field2109[(this.field2111 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2110;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)J", line = 103)
    public final long method612(byte arg0) {
        if (arg0 != 67) {
            this.method612((byte) 89);
        }
        return this.field2107;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 119)
    public class170() {
        this.field2106 = this.field2107 = jagmisc.nanoTime();
        if (this.field2107 == 0L) {
            throw new RuntimeException();
        }
    }
}
