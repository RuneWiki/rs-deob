import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class240 extends class624 {

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "J")
    private long field3174 = 0L;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "J")
    private long field3175 = 0L;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    private int field3176 = 1;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    private int field3178 = 0;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "J")
    private long field3179 = 0L;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "[J")
    private long[] field3177 = new long[10];

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(JB)I")
    public final int method1515(long arg0, byte arg1) {
        if (arg1 > -121) {
            this.field3176 = -22;
        }
        if (this.field3175 > this.field3174) {
            this.field3179 += this.field3175 - this.field3174;
            this.field3174 += this.field3175 - this.field3174;
            this.field3175 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field3175 += arg0;
            var4++;
        } while (var4 < 10 && this.field3174 > this.field3175);
        if (this.field3174 > this.field3175) {
            this.field3175 = this.field3174;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)J")
    public final long method1516(byte arg0) {
        if (arg0 > -10) {
            this.field3179 = 66L;
        }
        return this.field3174;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public final void method1517(int arg0) {
        if (this.field3175 > this.field3174) {
            this.field3174 += this.field3175 - this.field3174;
        }
        this.field3179 = arg0;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)J")
    private final long method1518(boolean arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3179;
        this.field3179 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3177[this.field3178] = var4;
            if (this.field3176 < 1) {
                this.field3176++;
            }
            this.field3178 = (this.field3178 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0) {
            this.method1519((byte) -44);
        }
        for (int var8 = 1; var8 <= this.field3176; var8++) {
            var6 += this.field3177[(this.field3178 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3176;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
    public class240() {
        this.field3174 = System.nanoTime();
        this.field3175 = System.nanoTime();
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)J")
    public final long method1519(byte arg0) {
        if (arg0 <= 99) {
            return -100L;
        } else {
            this.field3174 += this.method1518(false);
            return this.field3175 <= this.field3174 ? 0L : (this.field3175 - this.field3174) / 1000000L;
        }
    }
}
