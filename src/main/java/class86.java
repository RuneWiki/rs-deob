import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class86 extends class71 {

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "J")
    private long field865 = 0L;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "J")
    private long field866 = 0L;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    private int field870 = 0;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    private int field867 = 1;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "J")
    private long field868 = 0L;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "[J")
    private long[] field869 = new long[10];

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(JZ)I")
    public final int method371(long arg0, boolean arg1) {
        if (arg1) {
            this.method369((byte) 100);
        }
        if (this.field866 > this.field865) {
            this.field868 += this.field866 - this.field865;
            this.field865 += this.field866 - this.field865;
            this.field866 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field866 += arg0;
            var4++;
        } while (var4 < 10 && this.field866 < this.field865);
        if (this.field866 < this.field865) {
            this.field866 = this.field865;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)J")
    public final long method370(int arg0) {
        int var2 = 63 % ((39 - arg0) / 60);
        return this.field865;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
    public final void method369(byte arg0) {
        int var2 = 85 % ((arg0 - 12) / 60);
        this.field868 = 0L;
        if (this.field865 < this.field866) {
            this.field865 += this.field866 - this.field865;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)J")
    public final long method374(int arg0) {
        this.field865 += this.method446(arg0 ^ 0x71D);
        if (this.field865 < this.field866) {
            return (this.field866 - this.field865) / 1000000L;
        } else {
            if (arg0 != -1913) {
                this.method370(82);
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)J")
    private final long method446(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field868;
        this.field868 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field869[this.field870] = var4;
            if (this.field867 < 1) {
                this.field867++;
            }
            this.field870 = (this.field870 + 1) % 10;
        }
        long var6 = 0L;
        int var8 = -11 % ((arg0 + 4) / 62);
        for (int var9 = 1; var9 <= this.field867; var9++) {
            var6 += this.field869[(this.field870 + 10 - var9) % 10];
        }
        return var6 / (long) this.field867;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    public class86() {
        this.field866 = this.field865 = jagmisc.nanoTime();
        if (this.field865 == 0L) {
            throw new RuntimeException();
        }
    }
}
