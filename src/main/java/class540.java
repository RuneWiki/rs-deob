import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class540 extends class320 {

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    private int field7933 = 1;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "J")
    private long field7931 = 0L;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[J")
    private long[] field7930 = new long[10];

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    private int field7932 = 0;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "J")
    private long field7929 = 0L;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "J")
    private long field7934 = 0L;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)J", line = 3)
    private final long method4092(int arg0) {
        long var2 = class614.method4531(-62) * 1000000L;
        long var4 = var2 - this.field7931;
        this.field7931 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7930[this.field7932] = var4;
            this.field7932 = (this.field7932 + 1) % 10;
            if (this.field7933 < 10) {
                this.field7933++;
            }
        }
        long var6 = 0L;
        if (arg0 <= 114) {
            this.method1403((byte) 64);
        }
        for (int var8 = 1; var8 <= this.field7933; var8++) {
            var6 += this.field7930[(this.field7932 + 10 - var8) % 10];
        }
        return var6 / (long) this.field7933;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)J", line = 38)
    public final long method1404(boolean arg0) {
        if (!arg0) {
            this.method1403((byte) -76);
        }
        return this.field7934;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 49)
    public final void method1402(int arg0) {
        if (arg0 == 7521) {
            this.field7931 = 0L;
            if (this.field7934 < this.field7929) {
                this.field7934 += this.field7929 - this.field7934;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)J", line = 64)
    public final long method1403(byte arg0) {
        this.field7934 += this.method4092(117);
        if (this.field7929 > this.field7934) {
            return (this.field7929 - this.field7934) / 1000000L;
        } else {
            if (arg0 != 11) {
                this.field7934 = 90L;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)I", line = 82)
    public final int method1401(int arg0, long arg1) {
        if (arg0 != 0) {
            this.field7933 = -107;
        }
        if (this.field7929 > this.field7934) {
            this.field7931 += this.field7929 - this.field7934;
            this.field7934 += this.field7929 - this.field7934;
            this.field7929 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field7929 += arg1;
            var4++;
        } while (var4 < 10 && this.field7929 < this.field7934);
        if (this.field7929 < this.field7934) {
            this.field7929 = this.field7934;
        }
        return var4;
    }
}
