import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class524 extends class271 {

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "J")
    private long field7707 = 0L;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    private int field7706 = 1;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "J")
    private long field7705 = 0L;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    private int field7708 = 0;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "[J")
    private long[] field7709 = new long[10];

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "J")
    private long field7710 = 0L;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)J")
    public final long method716(byte arg0) {
        if (arg0 <= 121) {
            this.field7707 = 66L;
        }
        return this.field7705;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)I")
    public final int method715(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        if (arg0 != 69) {
            this.method715(-24, 100);
        }
        this.field7705 += this.method3078(-66);
        if (this.field7707 > this.field7705) {
            class496.method2931((byte) 125, (this.field7707 - this.field7705) / 1000000L);
            this.field7710 += this.field7707 - this.field7705;
            this.field7705 += this.field7707 - this.field7705;
            this.field7707 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field7707 += var3;
        } while (var5 < 10 && this.field7707 < this.field7705);
        if (this.field7707 < this.field7705) {
            this.field7707 = this.field7705;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public final void method714(boolean arg0) {
        this.field7710 = 0L;
        if (this.field7705 < this.field7707) {
            this.field7705 += this.field7707 - this.field7705;
        }
        if (arg0) {
            this.field7708 = -120;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)J")
    private final long method3078(int arg0) {
        long var2 = class333.method1850(-3562) * 1000000L;
        long var4 = var2 - this.field7710;
        this.field7710 = var2;
        if (arg0 > -52) {
            return 101L;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field7709[this.field7708] = var4;
            this.field7708 = (this.field7708 + 1) % 10;
            if (this.field7706 < 10) {
                this.field7706++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field7706; var8++) {
            var6 += this.field7709[(this.field7708 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field7706;
    }
}
