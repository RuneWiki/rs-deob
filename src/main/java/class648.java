import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class648 extends class342 {

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "J")
    private long field9199 = 0L;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "J")
    private long field9200 = 0L;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    private int field9202 = 0;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    private int field9203 = 1;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "J")
    private long field9201 = 0L;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[J")
    private long[] field9204 = new long[10];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public final void method1966(int arg0) {
        if (arg0 != 12104) {
            this.field9201 = -51L;
        }
        this.field9201 = 0L;
        if (this.field9200 > this.field9199) {
            this.field9199 += this.field9200 - this.field9199;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)J")
    private final long method3661(boolean arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field9201;
        this.field9201 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9204[this.field9202] = var4;
            this.field9202 = (this.field9202 + 1) % 10;
            if (this.field9203 < 1) {
                this.field9203++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9203; var8++) {
            var6 += this.field9204[(this.field9202 + 10 - var8) % 10];
        }
        if (arg0) {
            this.method1969((byte) 4);
        }
        return var6 / (long) this.field9203;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)J")
    public final long method1969(byte arg0) {
        this.field9199 += this.method3661(false);
        if (arg0 <= 34) {
            return -36L;
        } else if (this.field9200 > this.field9199) {
            return (this.field9200 - this.field9199) / 1000000L;
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)J")
    public final long method1965(int arg0) {
        return arg0 == 1 ? this.field9199 : -74L;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)I")
    public final int method1967(long arg0, int arg1) {
        if (arg1 != 1) {
            return 44;
        } else if (this.field9199 < this.field9200) {
            this.field9201 += this.field9200 - this.field9199;
            this.field9199 += this.field9200 - this.field9199;
            this.field9200 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field9200 += arg0;
            } while (var4 < 10 && this.field9200 < this.field9199);
            if (this.field9199 > this.field9200) {
                this.field9200 = this.field9199;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class648() {
        this.field9199 = System.nanoTime();
        this.field9200 = System.nanoTime();
    }
}
