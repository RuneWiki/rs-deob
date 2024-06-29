import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class315 extends class168 {

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    private int field4202 = 0;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[J")
    private long[] field4200 = new long[10];

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "J")
    private long field4205 = 0L;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "J")
    private long field4203 = 0L;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    private int field4201 = 1;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "J")
    private long field4204 = 0L;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 9)
    public final void method986(int arg0) {
        if (arg0 != 9) {
            this.method1866(-57);
        }
        if (this.field4203 > this.field4204) {
            this.field4204 += this.field4203 - this.field4204;
        }
        this.field4205 = 0L;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)J", line = 29)
    public final long method985(int arg0) {
        if (arg0 != 1) {
            this.method1866(27);
        }
        return this.field4204;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I", line = 39)
    public final int method990(int arg0, int arg1) {
        this.field4204 += this.method1866(10);
        if (arg1 != 1) {
            this.field4204 = 85L;
        }
        long var3 = (long) arg0 * 1000000L;
        if (this.field4203 > this.field4204) {
            class316.method1873((this.field4203 - this.field4204) / 1000000L, false);
            this.field4205 += this.field4203 - this.field4204;
            this.field4204 += this.field4203 - this.field4204;
            this.field4203 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4203 += var3;
            var5++;
        } while (var5 < 10 && this.field4203 < this.field4204);
        if (this.field4203 < this.field4204) {
            this.field4203 = this.field4204;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)J", line = 81)
    private final long method1866(int arg0) {
        long var2 = class45.method252((byte) -8) * 1000000L;
        long var4 = var2 - this.field4205;
        this.field4205 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4200[this.field4202] = var4;
            if (this.field4201 < 10) {
                this.field4201++;
            }
            this.field4202 = (this.field4202 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 == 10) {
            for (int var8 = 1; var8 <= this.field4201; var8++) {
                var6 += this.field4200[(this.field4202 + 10 - var8) % 10];
            }
            return var6 / (long) this.field4201;
        } else {
            return 125L;
        }
    }
}
