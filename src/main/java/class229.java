import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class229 extends class29 {

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "J")
    private long field3174 = 0L;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "J")
    private long field3175 = 0L;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "J")
    private long field3176 = 0L;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[J")
    private long[] field3177 = new long[10];

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    private int field3179 = 1;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    private int field3178 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)J", line = 3)
    public final long method283(byte arg0) {
        this.field3174 += this.method1449((byte) -128);
        if (this.field3175 > this.field3174) {
            return (this.field3175 - this.field3174) / 1000000L;
        } else {
            if (arg0 <= 116) {
                this.field3178 = 118;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 71)
    public class229() {
        this.field3175 = this.field3174 = jagmisc.nanoTime();
        if (this.field3174 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)J", line = 23)
    public final long method284(byte arg0) {
        if (arg0 < 31) {
            this.method1449((byte) -62);
        }
        return this.field3174;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)J", line = 34)
    private final long method1449(byte arg0) {
        if (arg0 != -128) {
            return 22L;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3176;
        this.field3176 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3177[this.field3178] = var4;
            if (this.field3179 < 1) {
                this.field3179++;
            }
            this.field3178 = (this.field3178 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field3179; var8++) {
            var6 += this.field3177[(this.field3178 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3179;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BJ)I", line = 83)
    public final int method280(byte arg0, long arg1) {
        if (arg0 != -100) {
            this.method283((byte) -128);
        }
        if (this.field3175 > this.field3174) {
            this.field3176 += this.field3175 - this.field3174;
            this.field3174 += this.field3175 - this.field3174;
            this.field3175 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field3175 += arg1;
            var4++;
        } while (var4 < 10 && this.field3174 > this.field3175);
        if (this.field3174 > this.field3175) {
            this.field3175 = this.field3174;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V", line = 124)
    public final void method287(byte arg0) {
        this.field3176 = 0L;
        if (this.field3174 < this.field3175) {
            this.field3174 += this.field3175 - this.field3174;
        }
        if (arg0 != -9) {
            this.method280((byte) -112, 10L);
        }
    }
}
