import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class408 extends class437 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "J")
    private long field5903 = 0L;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    private int field5904 = 1;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[J")
    private long[] field5906 = new long[10];

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "J")
    private long field5905 = 0L;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "J")
    private long field5907 = 0L;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    private int field5908 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public final void method137(byte arg0) {
        if (this.field5903 > this.field5905) {
            this.field5905 += this.field5903 - this.field5905;
        }
        this.field5907 = 0L;
        if (arg0 != -57) {
            this.method136(48, -24);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)J")
    public final long method139(boolean arg0) {
        if (!arg0) {
            this.field5908 = -37;
        }
        return this.field5905;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)J")
    private final long method2541(int arg0) {
        long var2 = class442.method2730(25207) * 1000000L;
        long var4 = var2 - this.field5907;
        this.field5907 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5906[this.field5908] = var4;
            this.field5908 = (this.field5908 + 1) % 10;
            if (this.field5904 < 10) {
                this.field5904++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5904; var8++) {
            var6 += this.field5906[(this.field5908 + 10 - var8) % 10];
        }
        if (arg0 <= 78) {
            this.field5903 = 74L;
        }
        return var6 / (long) this.field5904;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
    public final int method136(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field5905 += this.method2541(arg0 + 84);
        if (arg0 != 1) {
            this.method2541(113);
        }
        if (this.field5905 < this.field5903) {
            class370.method2235((this.field5903 - this.field5905) / 1000000L, 10);
            this.field5907 += this.field5903 - this.field5905;
            this.field5905 += this.field5903 - this.field5905;
            this.field5903 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5903 += var3;
        } while (var5 < 10 && this.field5905 > this.field5903);
        if (this.field5905 > this.field5903) {
            this.field5903 = this.field5905;
        }
        return var5;
    }
}
