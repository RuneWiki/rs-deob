import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class492 extends class35 {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "J")
    private long field7180 = 0L;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "J")
    private long field7181 = 0L;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[J")
    private long[] field7183 = new long[10];

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    private int field7182 = 1;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "J")
    private long field7184 = 0L;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    private int field7185 = 0;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)I")
    public final int method262(int arg0, boolean arg1) {
        this.field7181 += this.method2870((byte) 123);
        if (!arg1) {
            this.field7181 = 124L;
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field7180 > this.field7181) {
            class444.method2667(-28210, (this.field7180 - this.field7181) / 1000000L);
            this.field7184 += this.field7180 - this.field7181;
            this.field7181 += this.field7180 - this.field7181;
            this.field7180 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field7180 += var3;
            var5++;
        } while (var5 < 10 && this.field7180 < this.field7181);
        if (this.field7180 < this.field7181) {
            this.field7180 = this.field7181;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public final void method264(int arg0) {
        if (arg0 != 19499) {
            this.method263(112);
        }
        this.field7184 = 0L;
        if (this.field7181 < this.field7180) {
            this.field7181 += this.field7180 - this.field7181;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)J")
    private final long method2870(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field7184;
        this.field7184 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7183[this.field7185] = var4;
            this.field7185 = (this.field7185 + 1) % 10;
            if (this.field7182 < 1) {
                this.field7182++;
            }
        }
        if (arg0 <= 122) {
            this.field7180 = 91L;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7182; var8++) {
            var6 += this.field7183[(this.field7185 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7182;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)J")
    public final long method263(int arg0) {
        return arg0 == 11854 ? this.field7181 : 48L;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class492() {
        this.field7181 = System.nanoTime();
        this.field7180 = System.nanoTime();
    }
}
