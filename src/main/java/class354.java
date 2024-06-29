import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class354 extends class71 {

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    private int field4768 = 1;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "[J")
    private long[] field4766 = new long[10];

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "J")
    private long field4769 = 0L;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    private int field4770 = 0;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "J")
    private long field4767 = 0L;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "J")
    private long field4771 = 0L;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 3)
    public final void method369(byte arg0) {
        if (this.field4769 > this.field4771) {
            this.field4771 += this.field4769 - this.field4771;
        }
        this.field4767 = 0L;
        int var2 = 0 % ((arg0 - 12) / 60);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)I", line = 18)
    public final int method371(long arg0, boolean arg1) {
        if (arg1) {
            this.method371(-10L, false);
        }
        if (this.field4769 > this.field4771) {
            this.field4767 += this.field4769 - this.field4771;
            this.field4771 += this.field4769 - this.field4771;
            this.field4769 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field4769 += arg0;
            var4++;
        } while (var4 < 10 && this.field4771 > this.field4769);
        if (this.field4771 > this.field4769) {
            this.field4769 = this.field4771;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)J", line = 50)
    private final long method2093(int arg0) {
        long var2 = class557.method3157(-73) * 1000000L;
        long var4 = var2 - this.field4767;
        this.field4767 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4766[this.field4770] = var4;
            this.field4770 = (this.field4770 + 1) % 10;
            if (this.field4768 < 10) {
                this.field4768++;
            }
        }
        long var6 = 0L;
        for (int var8 = arg0; var8 <= this.field4768; var8++) {
            var6 += this.field4766[(this.field4770 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4768;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J", line = 89)
    public final long method370(int arg0) {
        int var2 = 65 % ((arg0 - 39) / 60);
        return this.field4771;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)J", line = 105)
    public final long method374(int arg0) {
        this.field4771 += this.method2093(arg0 ^ 0xFFFFF886);
        if (arg0 != -1913) {
            this.field4767 = 103L;
        }
        return this.field4771 < this.field4769 ? (this.field4769 - this.field4771) / 1000000L : 0L;
    }
}
