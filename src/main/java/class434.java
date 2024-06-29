import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class434 extends class413 {

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "J")
    private long field6403 = 0L;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    private int field6402 = 0;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    private int field6406 = 1;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "J")
    private long field6404 = 0L;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "J")
    private long field6405 = 0L;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[J")
    private long[] field6407 = new long[10];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)I")
    public final int method1367(boolean arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field6404 += this.method2679(true);
        if (arg0) {
            this.field6405 = 125L;
        }
        if (this.field6404 < this.field6403) {
            class84.method517((byte) -36, (this.field6403 - this.field6404) / 1000000L);
            this.field6405 += this.field6403 - this.field6404;
            this.field6404 += this.field6403 - this.field6404;
            this.field6403 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field6403 += var3;
            var5++;
        } while (var5 < 10 && this.field6403 < this.field6404);
        if (this.field6403 < this.field6404) {
            this.field6403 = this.field6404;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)J")
    public final long method1369(byte arg0) {
        if (arg0 != 83) {
            this.method2679(false);
        }
        return this.field6404;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public final void method1366(int arg0) {
        this.field6405 = 0L;
        if (this.field6403 > this.field6404) {
            this.field6404 += this.field6403 - this.field6404;
        }
        if (arg0 != -233) {
            this.method1366(-53);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)J")
    private final long method2679(boolean arg0) {
        long var2 = class46.method297(27104) * 1000000L;
        long var4 = var2 - this.field6405;
        this.field6405 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6407[this.field6402] = var4;
            if (this.field6406 < 10) {
                this.field6406++;
            }
            this.field6402 = (this.field6402 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0) {
            for (int var8 = 1; var8 <= this.field6406; var8++) {
                var6 += this.field6407[(this.field6402 + 10 - var8) % 10];
            }
            return var6 / (long) this.field6406;
        } else {
            return -37L;
        }
    }
}
