import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class408 extends class219 {

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "J")
    private long field6047 = 0L;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "J")
    private long field6048 = 0L;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "J")
    private long field6050 = 0L;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    private int field6051 = 1;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[J")
    private long[] field6049 = new long[10];

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    private int field6052 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
    public final int method369(int arg0, int arg1) {
        if (arg1 != 24168) {
            this.field6049 = null;
        }
        long var3 = (long) arg0 * 1000000L;
        this.field6047 += this.method2628(126);
        if (this.field6048 > this.field6047) {
            class144.method918((this.field6048 - this.field6047) / 1000000L, true);
            this.field6050 += this.field6048 - this.field6047;
            this.field6047 += this.field6048 - this.field6047;
            this.field6048 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field6048 += var3;
        } while (var5 < 10 && this.field6047 > this.field6048);
        if (this.field6047 > this.field6048) {
            this.field6048 = this.field6047;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)J")
    public final long method370(int arg0) {
        if (arg0 != 4) {
            this.field6051 = -7;
        }
        return this.field6047;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public final void method371(int arg0) {
        if (arg0 != 4) {
            this.method371(11);
        }
        if (this.field6048 > this.field6047) {
            this.field6047 += this.field6048 - this.field6047;
        }
        this.field6050 = 0L;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)J")
    private final long method2628(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field6050;
        this.field6050 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6049[this.field6052] = var4;
            this.field6052 = (this.field6052 + 1) % 10;
            if (this.field6051 < 1) {
                this.field6051++;
            }
        }
        long var6 = 0L;
        int var8 = 1;
        int var9 = 59 % ((1 - arg0) / 45);
        while (this.field6051 >= var8) {
            var6 += this.field6049[(this.field6052 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field6051;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class408() {
        this.field6048 = this.field6047 = jagmisc.nanoTime();
        if (this.field6047 == 0L) {
            throw new RuntimeException();
        }
    }
}
