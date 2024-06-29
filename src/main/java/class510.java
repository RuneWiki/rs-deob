import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class510 extends class158 {

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "J")
    private long field7181 = 0L;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "J")
    private long field7182 = 0L;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "J")
    private long field7183 = 0L;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    private int field7185 = 0;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "[J")
    private long[] field7184 = new long[10];

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    private int field7186 = 1;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)J", line = 3)
    public final long method451(int arg0) {
        if (arg0 > -20) {
            this.field7186 = -86;
        }
        return this.field7182;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(B)J", line = 13)
    private final long method2926(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field7183;
        this.field7183 = var2;
        if (arg0 <= 15) {
            this.field7183 = 6L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7184[this.field7185] = var4;
            this.field7185 = (this.field7185 + 1) % 10;
            if (this.field7186 < 1) {
                this.field7186++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7186; var8++) {
            var6 += this.field7184[(this.field7185 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7186;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IJ)I", line = 47)
    public final int method449(int arg0, long arg1) {
        if (arg0 != -19913) {
            return -60;
        } else if (this.field7182 < this.field7181) {
            this.field7183 += this.field7181 - this.field7182;
            this.field7182 += this.field7181 - this.field7182;
            this.field7181 += arg1;
            return 1;
        } else {
            int var4 = 0;
            do {
                this.field7181 += arg1;
                var4++;
            } while (var4 < 10 && this.field7181 < this.field7182);
            if (this.field7181 < this.field7182) {
                this.field7181 = this.field7182;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V", line = 117)
    public class510() {
        this.field7181 = this.field7182 = jagmisc.nanoTime();
        if (this.field7182 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)J", line = 84)
    public final long method448(byte arg0) {
        if (arg0 == 123) {
            this.field7182 += this.method2926((byte) 80);
            return this.field7181 > this.field7182 ? (this.field7181 - this.field7182) / 1000000L : 0L;
        } else {
            return -78L;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 105)
    public final void method450(int arg0) {
        this.field7183 = 0L;
        if (this.field7182 < this.field7181) {
            this.field7182 += this.field7181 - this.field7182;
        }
        if (arg0 >= -30) {
            this.field7184 = null;
        }
    }
}
