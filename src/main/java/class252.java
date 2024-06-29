import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class252 extends class417 {

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "J")
    private long field3535 = 0L;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "J")
    private long field3534 = 0L;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    private int field3536 = 1;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "J")
    private long field3537 = 0L;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    private int field3538 = 0;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "[J")
    private long[] field3539 = new long[10];

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)J", line = 3)
    private final long method1567(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field3537;
        this.field3537 = var2;
        int var6 = -2 / ((33 - arg0) / 54);
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3539[this.field3538] = var4;
            this.field3538 = (this.field3538 + 1) % 10;
            if (this.field3536 < 1) {
                this.field3536++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field3536; var9++) {
            var7 += this.field3539[(this.field3538 + 10 - var9) % 10];
        }
        return var7 / (long) this.field3536;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V", line = 102)
    public class252() {
        this.field3535 = this.field3534 = jagmisc.nanoTime();
        if (this.field3534 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)J", line = 41)
    public final long method1568(int arg0) {
        int var2 = -45 % ((-arg0 - 20) / 62);
        return this.field3534;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)I", line = 50)
    public final int method1569(byte arg0, int arg1) {
        this.field3534 += this.method1567(97);
        long var3 = (long) arg1 * 1000000L;
        if (arg0 <= 90) {
            this.field3539 = null;
        }
        if (this.field3534 < this.field3535) {
            class258.method1603(-649, (this.field3535 - this.field3534) / 1000000L);
            this.field3537 += this.field3535 - this.field3534;
            this.field3534 += this.field3535 - this.field3534;
            this.field3535 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field3535 += var3;
        } while (var5 < 10 && this.field3535 < this.field3534);
        if (this.field3535 < this.field3534) {
            this.field3535 = this.field3534;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 87)
    public final void method1570(int arg0) {
        if (this.field3534 < this.field3535) {
            this.field3534 += this.field3535 - this.field3534;
        }
        this.field3537 = 0L;
        if (arg0 <= 29) {
            this.method1568(127);
        }
    }
}
