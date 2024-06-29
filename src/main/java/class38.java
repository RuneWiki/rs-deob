import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class38 extends class158 {

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "J")
    private long field636 = 0L;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "J")
    private long field637 = 0L;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "J")
    private long field638 = 0L;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    private int field639 = 1;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "[J")
    private long[] field640 = new long[10];

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
    private int field641 = 0;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)J", line = 6)
    private final long method447(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field638;
        this.field638 = var2;
        if (arg0 != -15549) {
            return 124L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field640[this.field641] = var4;
            if (this.field639 < 1) {
                this.field639++;
            }
            this.field641 = (this.field641 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field639; var8++) {
            var6 += this.field640[(this.field641 + 10 - var8) % 10];
        }
        return var6 / (long) this.field639;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)J", line = 39)
    public final long method448(byte arg0) {
        this.field637 += this.method447(arg0 - 15672);
        if (arg0 == 123) {
            return this.field637 >= this.field636 ? 0L : (this.field636 - this.field637) / 1000000L;
        } else {
            return -84L;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V", line = 107)
    public class38() {
        this.field637 = System.nanoTime();
        this.field636 = System.nanoTime();
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IJ)I", line = 59)
    public final int method449(int arg0, long arg1) {
        if (arg0 != -19913) {
            return -14;
        } else if (this.field636 > this.field637) {
            this.field638 += this.field636 - this.field637;
            this.field637 += this.field636 - this.field637;
            this.field636 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field636 += arg1;
            } while (var4 < 10 && this.field637 > this.field636);
            if (this.field636 < this.field637) {
                this.field636 = this.field637;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V", line = 95)
    public final void method450(int arg0) {
        if (this.field637 < this.field636) {
            this.field637 += this.field636 - this.field637;
        }
        this.field638 = 0L;
        if (arg0 > -30) {
            this.field636 = 73L;
        }
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)J", line = 124)
    public final long method451(int arg0) {
        if (arg0 > -20) {
            this.method451(105);
        }
        return this.field637;
    }
}
