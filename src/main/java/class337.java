import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class337 extends class13 {

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "J")
    private long field5045 = 0L;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "J")
    private long field5046 = 0L;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    private int field5047 = 1;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    private int field5049 = 0;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[J")
    private long[] field5048 = new long[10];

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "J")
    private long field5050 = 0L;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)I", line = 6)
    public final int method65(int arg0, byte arg1) {
        this.field5046 += this.method2088(false);
        if (arg1 >= -101) {
            this.field5046 = -111L;
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field5045 > this.field5046) {
            class414.method2437((this.field5045 - this.field5046) / 1000000L, (byte) -122);
            this.field5050 += this.field5045 - this.field5046;
            this.field5046 += this.field5045 - this.field5046;
            this.field5045 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field5045 += var3;
            var5++;
        } while (var5 < 10 && this.field5045 < this.field5046);
        if (this.field5045 < this.field5046) {
            this.field5045 = this.field5046;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)J", line = 42)
    private final long method2088(boolean arg0) {
        if (arg0) {
            this.field5049 = 108;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field5050;
        this.field5050 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5048[this.field5049] = var4;
            this.field5049 = (this.field5049 + 1) % 10;
            if (this.field5047 < 1) {
                this.field5047++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5047; var8++) {
            var6 += this.field5048[(this.field5049 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field5047;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 104)
    public class337() {
        this.field5046 = System.nanoTime();
        this.field5045 = System.nanoTime();
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)J", line = 80)
    public final long method69(byte arg0) {
        if (arg0 != 89) {
            this.method66(102);
        }
        return this.field5046;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 90)
    public final void method66(int arg0) {
        this.field5050 = 0L;
        if (arg0 == 23913 && this.field5045 > this.field5046) {
            this.field5046 += this.field5045 - this.field5046;
        }
    }
}
