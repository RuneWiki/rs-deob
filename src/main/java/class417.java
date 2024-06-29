import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class417 extends class325 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "J")
    private long field6001 = 0L;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "J")
    private long field6002 = 0L;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[J")
    private long[] field6004 = new long[10];

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "J")
    private long field6003 = 0L;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    private int field6005 = 1;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    private int field6006 = 0;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)J", line = 4)
    public final long method718(boolean arg0) {
        if (arg0) {
            this.field6006 = -60;
        }
        return this.field6002;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)J", line = 15)
    private final long method2481(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field6003;
        this.field6003 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field6004[this.field6006] = var4;
            this.field6006 = (this.field6006 + 1) % 10;
            if (this.field6005 < 1) {
                this.field6005++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field6005; var8++) {
            var6 += this.field6004[(this.field6006 + 10 - var8) % 10];
        }
        return arg0 >= -87 ? 4L : var6 / (long) this.field6005;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I", line = 49)
    public final int method719(int arg0, int arg1) {
        int var3 = 82 % ((2 - arg0) / 43);
        long var4 = (long) arg1 * 1000000L;
        this.field6002 += this.method2481(-103);
        if (this.field6001 > this.field6002) {
            class325.method2005(true, (this.field6001 - this.field6002) / 1000000L);
            this.field6003 += this.field6001 - this.field6002;
            this.field6002 += this.field6001 - this.field6002;
            this.field6001 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field6001 += var4;
        } while (var6 < 10 && this.field6002 > this.field6001);
        if (this.field6001 < this.field6002) {
            this.field6001 = this.field6002;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 84)
    public final void method716(byte arg0) {
        if (arg0 > -35) {
            this.field6002 = 120L;
        }
        if (this.field6002 < this.field6001) {
            this.field6002 += this.field6001 - this.field6002;
        }
        this.field6003 = 0L;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 102)
    public class417() {
        this.field6002 = System.nanoTime();
        this.field6001 = System.nanoTime();
    }
}
