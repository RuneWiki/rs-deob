import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class417 extends class642 {

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    private int field5424 = 1;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "J")
    private long field5422 = 0L;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "J")
    private long field5423 = 0L;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "J")
    private long field5426 = 0L;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    private int field5425 = 0;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "[J")
    private long[] field5427 = new long[10];

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)J")
    private final long method2376(int arg0) {
        long var2 = class190.method1030(false) * 1000000L;
        long var4 = var2 - this.field5423;
        this.field5423 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5427[this.field5425] = var4;
            this.field5425 = (this.field5425 + 1) % 10;
            if (this.field5424 < 10) {
                this.field5424++;
            }
        }
        long var6 = 0L;
        if (arg0 != 28800) {
            this.field5425 = 39;
        }
        for (int var8 = 1; var8 <= this.field5424; var8++) {
            var6 += this.field5427[(this.field5425 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5424;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public final void method1770(int arg0) {
        this.field5423 = 0L;
        if (arg0 == 21308 && this.field5426 < this.field5422) {
            this.field5426 += this.field5422 - this.field5426;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)J")
    public final long method1772(byte arg0) {
        return arg0 <= 119 ? 88L : this.field5426;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)J")
    public final long method1773(int arg0) {
        this.field5426 += this.method2376(28800);
        if (arg0 != -5866) {
            this.method2376(-114);
        }
        return this.field5422 > this.field5426 ? (this.field5422 - this.field5426) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BJ)I")
    public final int method1771(byte arg0, long arg1) {
        int var4 = 122 / ((-arg0 - 64) / 59);
        if (this.field5422 > this.field5426) {
            this.field5423 += this.field5422 - this.field5426;
            this.field5426 += this.field5422 - this.field5426;
            this.field5422 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5422 += arg1;
        } while (var5 < 10 && this.field5426 > this.field5422);
        if (this.field5426 > this.field5422) {
            this.field5422 = this.field5426;
        }
        return var5;
    }
}
