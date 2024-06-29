import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class220 extends class610 {

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "J")
    private long field2996 = 0L;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "J")
    private long field2997 = 0L;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    private int field2999 = 1;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "[J")
    private long[] field3000 = new long[10];

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "J")
    private long field2998 = 0L;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    private int field3001 = 0;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IJ)I", line = 3)
    public final int method842(int arg0, long arg1) {
        if (arg0 > -45) {
            this.method842(-95, 89L);
        }
        if (this.field2996 > this.field2997) {
            this.field2998 += this.field2996 - this.field2997;
            this.field2997 += this.field2996 - this.field2997;
            this.field2996 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field2996 += arg1;
        } while (var4 < 10 && this.field2996 < this.field2997);
        if (this.field2997 > this.field2996) {
            this.field2996 = this.field2997;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)J", line = 36)
    public final long method839(int arg0) {
        int var2 = 61 % ((arg0 - 44) / 37);
        return this.field2997;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)J", line = 45)
    public final long method841(byte arg0) {
        this.field2997 += this.method1436((byte) -93);
        if (arg0 <= 97) {
            return -64L;
        } else if (this.field2997 < this.field2996) {
            return (this.field2996 - this.field2997) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 62)
    public final void method840(byte arg0) {
        this.field2998 = 0L;
        if (this.field2997 < this.field2996) {
            this.field2997 += this.field2996 - this.field2997;
        }
        int var2 = 51 % ((arg0 + 41) / 42);
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(B)J", line = 76)
    private final long method1436(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field2998;
        this.field2998 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field3000[this.field3001] = var4;
            if (this.field2999 < 1) {
                this.field2999++;
            }
            this.field3001 = (this.field3001 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 > -35) {
            this.method840((byte) -126);
        }
        for (int var8 = 1; var8 <= this.field2999; var8++) {
            var6 += this.field3000[(this.field3001 + 10 - var8) % 10];
        }
        return var6 / (long) this.field2999;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V", line = 116)
    public class220() {
        this.field2996 = this.field2997 = jagmisc.nanoTime();
        if (this.field2997 == 0L) {
            throw new RuntimeException();
        }
    }
}
