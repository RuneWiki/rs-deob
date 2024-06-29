import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class511 extends class449 {

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "J")
    private long field7440 = 0L;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "J")
    private long field7441 = 0L;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    private int field7442 = 0;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[J")
    private long[] field7443 = new long[10];

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    private int field7444 = 1;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "J")
    private long field7445 = 0L;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I", line = 6)
    public final int method1443(int arg0, int arg1) {
        if (arg1 != 19116) {
            this.method1440(-41);
        }
        this.field7440 += this.method3061((byte) 48);
        long var3 = (long) arg0 * 1000000L;
        if (this.field7441 > this.field7440) {
            class50.method470((this.field7441 - this.field7440) / 1000000L, -5);
            this.field7445 += this.field7441 - this.field7440;
            this.field7440 += this.field7441 - this.field7440;
            this.field7441 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field7441 += var3;
            var5++;
        } while (var5 < 10 && this.field7441 < this.field7440);
        if (this.field7441 < this.field7440) {
            this.field7441 = this.field7440;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 43)
    public final void method1440(int arg0) {
        int var2 = -11 / ((arg0 + 47) / 53);
        this.field7445 = 0L;
        if (this.field7440 < this.field7441) {
            this.field7440 += this.field7441 - this.field7440;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)J", line = 55)
    public final long method1442(boolean arg0) {
        if (arg0) {
            this.method1443(45, -114);
        }
        return this.field7440;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 104)
    public class511() {
        this.field7440 = System.nanoTime();
        this.field7441 = System.nanoTime();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)J", line = 71)
    private final long method3061(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7445;
        this.field7445 = var2;
        int var6 = 96 / ((arg0 + 60) / 62);
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7443[this.field7442] = var4;
            this.field7442 = (this.field7442 + 1) % 10;
            if (this.field7444 < 1) {
                this.field7444++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field7444; var9++) {
            var7 += this.field7443[(this.field7442 + 10 - var9) % 10];
        }
        return var7 / (long) this.field7444;
    }
}
