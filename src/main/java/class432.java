import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class432 extends class193 {

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "J")
    private long field6141 = 0L;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "J")
    private long field6142 = 0L;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    private int field6143 = 0;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "J")
    private long field6144 = 0L;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "[J")
    private long[] field6146 = new long[10];

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    private int field6145 = 1;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)J")
    private final long method2565(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6144;
        this.field6144 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6146[this.field6143] = var4;
            this.field6143 = (this.field6143 + 1) % 10;
            if (this.field6145 < 1) {
                this.field6145++;
            }
        }
        long var6 = 0L;
        if (arg0 == -17481) {
            for (int var8 = 1; var8 <= this.field6145; var8++) {
                var6 += this.field6146[(this.field6143 + 10 - var8) % 10];
            }
            return var6 / (long) this.field6145;
        } else {
            return -100L;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)J")
    public final long method573(byte arg0) {
        if (arg0 <= 38) {
            this.method571(-33);
        }
        this.field6141 += this.method2565(-17481);
        return this.field6142 > this.field6141 ? (this.field6142 - this.field6141) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)J")
    public final long method571(int arg0) {
        if (arg0 <= 105) {
            this.field6141 = 42L;
        }
        return this.field6141;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IJ)I")
    public final int method574(int arg0, long arg1) {
        if (arg0 != 2) {
            this.field6146 = null;
        }
        if (this.field6141 < this.field6142) {
            this.field6144 += this.field6142 - this.field6141;
            this.field6141 += this.field6142 - this.field6141;
            this.field6142 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field6142 += arg1;
        } while (var4 < 10 && this.field6142 < this.field6141);
        if (this.field6142 < this.field6141) {
            this.field6142 = this.field6141;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public final void method570(boolean arg0) {
        if (arg0) {
            this.field6146 = null;
        }
        this.field6144 = 0L;
        if (this.field6142 > this.field6141) {
            this.field6141 += this.field6142 - this.field6141;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class432() {
        this.field6141 = System.nanoTime();
        this.field6142 = System.nanoTime();
    }
}
