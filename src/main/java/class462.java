import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class462 extends class201 {

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "J")
    private long field6295 = 0L;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[J")
    private long[] field6294 = new long[10];

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "J")
    private long field6297 = 0L;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    private int field6299 = 1;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "J")
    private long field6296 = 0L;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    private int field6298 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)J")
    public final long method1288(byte arg0) {
        this.field6295 += this.method2697((byte) 9);
        if (arg0 == 81) {
            return this.field6297 > this.field6295 ? (this.field6297 - this.field6295) / 1000000L : 0L;
        } else {
            return -23L;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BJ)I")
    public final int method1289(byte arg0, long arg1) {
        if (arg0 != -48) {
            this.field6295 = -106L;
        }
        if (this.field6295 < this.field6297) {
            this.field6296 += this.field6297 - this.field6295;
            this.field6295 += this.field6297 - this.field6295;
            this.field6297 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field6297 += arg1;
        } while (var4 < 10 && this.field6295 > this.field6297);
        if (this.field6295 > this.field6297) {
            this.field6297 = this.field6295;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public final void method1286(boolean arg0) {
        if (this.field6295 < this.field6297) {
            this.field6295 += this.field6297 - this.field6295;
        }
        this.field6296 = 0L;
        if (!arg0) {
            this.field6294 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)J")
    private final long method2697(byte arg0) {
        if (arg0 != 9) {
            return 100L;
        }
        long var2 = class337.method2062(false) * 1000000L;
        long var4 = var2 - this.field6296;
        this.field6296 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6294[this.field6298] = var4;
            if (this.field6299 < 10) {
                this.field6299++;
            }
            this.field6298 = (this.field6298 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6299; var8++) {
            var6 += this.field6294[(this.field6298 + 10 - var8) % 10];
        }
        return var6 / (long) this.field6299;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)J")
    public final long method1285(byte arg0) {
        if (arg0 != -9) {
            this.method1286(false);
        }
        return this.field6295;
    }
}
