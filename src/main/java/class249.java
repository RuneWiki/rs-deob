import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class249 extends class260 {

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "J")
    private long field3719 = 0L;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "J")
    private long field3718 = 0L;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    private int field3720 = 0;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[J")
    private long[] field3721 = new long[10];

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "J")
    private long field3722 = 0L;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    private int field3723 = 1;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)J")
    private final long method1625(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field3722;
        this.field3722 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3721[this.field3720] = var4;
            this.field3720 = (this.field3720 + 1) % 10;
            if (this.field3723 < 1) {
                this.field3723++;
            }
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field3723; var8++) {
            var6 += this.field3721[(this.field3720 + 10 - var8) % 10];
        }
        return var6 / (long) this.field3723;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)J")
    public final long method267(int arg0) {
        if (arg0 <= 116) {
            this.field3718 = -19L;
        }
        return this.field3719;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
    public final void method266(int arg0) {
        if (arg0 == -9282) {
            this.field3722 = 0L;
            if (this.field3718 > this.field3719) {
                this.field3719 += this.field3718 - this.field3719;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)I")
    public final int method265(byte arg0, int arg1) {
        this.field3719 += this.method1625(1);
        long var3 = (long) arg1 * 1000000L;
        int var5 = 24 % ((-arg0 - 5) / 37);
        if (this.field3718 > this.field3719) {
            class52.method411((this.field3718 - this.field3719) / 1000000L, (byte) 114);
            this.field3722 += this.field3718 - this.field3719;
            this.field3719 += this.field3718 - this.field3719;
            this.field3718 += var3;
            return 1;
        }
        int var6 = 0;
        do {
            this.field3718 += var3;
            var6++;
        } while (var6 < 10 && this.field3719 > this.field3718);
        if (this.field3719 > this.field3718) {
            this.field3718 = this.field3719;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class249() {
        this.field3719 = System.nanoTime();
        this.field3718 = System.nanoTime();
    }
}
