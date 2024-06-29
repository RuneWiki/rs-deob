import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class354 extends class71 {

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "J")
    private long field5116 = 0L;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "J")
    private long field5117 = 0L;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "[J")
    private long[] field5118 = new long[10];

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    private int field5119 = 1;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    private int field5121 = 0;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "J")
    private long field5120 = 0L;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)J", line = 6)
    private final long method2121(byte arg0) {
        long var2 = System.nanoTime();
        if (arg0 <= 64) {
            this.field5120 = 44L;
        }
        long var4 = var2 - this.field5120;
        this.field5120 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5118[this.field5121] = var4;
            if (this.field5119 < 1) {
                this.field5119++;
            }
            this.field5121 = (this.field5121 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5119; var8++) {
            var6 += this.field5118[(this.field5121 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5119;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 40)
    public final void method152(int arg0) {
        if (this.field5116 > this.field5117) {
            this.field5117 += this.field5116 - this.field5117;
        }
        this.field5120 = 0L;
        if (arg0 != -1) {
            this.method2121((byte) 109);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)I", line = 55)
    public final int method151(byte arg0, int arg1) {
        this.field5117 += this.method2121((byte) 75);
        long var3 = (long) arg1 * 1000000L;
        if (arg0 > -78) {
            this.field5120 = 10L;
        }
        if (this.field5117 < this.field5116) {
            class334.method2047((this.field5116 - this.field5117) / 1000000L, 0);
            this.field5120 += this.field5116 - this.field5117;
            this.field5117 += this.field5116 - this.field5117;
            this.field5116 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5116 += var3;
            var5++;
        } while (var5 < 10 && this.field5116 < this.field5117);
        if (this.field5117 > this.field5116) {
            this.field5116 = this.field5117;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 104)
    public class354() {
        this.field5117 = System.nanoTime();
        this.field5116 = System.nanoTime();
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)J", line = 93)
    public final long method153(int arg0) {
        return arg0 == 10 ? this.field5117 : 16L;
    }
}
