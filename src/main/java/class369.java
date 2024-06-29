import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class369 extends class550 {

    @OriginalMember(owner = "client!po", name = "f", descriptor = "[J")
    private long[] field5318 = new long[10];

    @OriginalMember(owner = "client!po", name = "g", descriptor = "J")
    private long field5319 = 0L;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    private int field5317 = 1;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "J")
    private long field5320 = 0L;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    private int field5322 = 0;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "J")
    private long field5321 = 0L;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZJ)I")
    public final int method2299(boolean arg0, long arg1) {
        if (!arg0) {
            this.method2300((byte) 119);
        }
        if (this.field5321 < this.field5319) {
            this.field5320 += this.field5319 - this.field5321;
            this.field5321 += this.field5319 - this.field5321;
            this.field5319 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field5319 += arg1;
            var4++;
        } while (var4 < 10 && this.field5319 < this.field5321);
        if (this.field5321 > this.field5319) {
            this.field5319 = this.field5321;
        }
        return var4;
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(B)V")
    public final void method2300(byte arg0) {
        if (this.field5319 > this.field5321) {
            this.field5321 += this.field5319 - this.field5321;
        }
        this.field5320 = 0L;
        if (arg0 <= 100) {
            this.field5318 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)J")
    private final long method2301(int arg0) {
        long var2 = class683.method3903((byte) 4) * 1000000L;
        long var4 = var2 - this.field5320;
        this.field5320 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5318[this.field5322] = var4;
            this.field5322 = (this.field5322 + 1) % 10;
            if (this.field5317 < 10) {
                this.field5317++;
            }
        }
        long var6 = (long) arg0;
        for (int var8 = 1; var8 <= this.field5317; var8++) {
            var6 += this.field5318[(this.field5322 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5317;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(B)J")
    public final long method2302(byte arg0) {
        this.field5321 += this.method2301(0);
        if (this.field5319 > this.field5321) {
            return (this.field5319 - this.field5321) / 1000000L;
        } else {
            int var2 = -83 / ((arg0 - 71) / 40);
            return 0L;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)J")
    public final long method2303(byte arg0) {
        int var2 = 2 % ((-arg0 - 70) / 48);
        return this.field5321;
    }
}
