import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class62 extends class7 {

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "J")
    private long field648 = 0L;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "J")
    private long field649 = 0L;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    private int field650 = 0;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "J")
    private long field651 = 0L;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    private int field653 = 1;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[J")
    private long[] field652 = new long[10];

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)J", line = 3)
    public final long method49(int arg0) {
        this.field649 += this.method448(arg0 + 39495);
        if (this.field649 < this.field648) {
            return (this.field648 - this.field649) / 1000000L;
        } else {
            if (arg0 != -9305) {
                this.field648 = -32L;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 19)
    public final void method46(boolean arg0) {
        if (this.field649 < this.field648) {
            this.field649 += this.field648 - this.field649;
        }
        this.field651 = 0L;
        if (arg0) {
            this.field651 = -13L;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)J", line = 34)
    private final long method448(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field651;
        this.field651 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field652[this.field650] = var4;
            if (this.field653 < 1) {
                this.field653++;
            }
            this.field650 = (this.field650 + 1) % 10;
        }
        if (arg0 != 30190) {
            this.method52(false, 26L);
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field653; var8++) {
            var6 += this.field652[(this.field650 + 10 - var8) % 10];
        }
        return var6 / (long) this.field653;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 115)
    public class62() {
        this.field648 = this.field649 = jagmisc.nanoTime();
        if (this.field649 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZJ)I", line = 74)
    public final int method52(boolean arg0, long arg1) {
        if (arg0) {
            return -7;
        } else if (this.field649 < this.field648) {
            this.field651 += this.field648 - this.field649;
            this.field649 += this.field648 - this.field649;
            this.field648 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field648 += arg1;
                var4++;
            } while (var4 < 10 && this.field648 < this.field649);
            if (this.field648 < this.field649) {
                this.field648 = this.field649;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)J", line = 106)
    public final long method45(int arg0) {
        if (arg0 != 0) {
            this.field653 = -5;
        }
        return this.field649;
    }
}
