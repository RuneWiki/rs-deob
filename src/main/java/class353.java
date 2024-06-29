import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class353 extends class330 {

    @OriginalMember(owner = "client!f", name = "k", descriptor = "J")
    private long field4800 = 0L;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "J")
    private long field4801 = 0L;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    private int field4803 = 1;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "J")
    private long field4804 = 0L;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    private int field4802 = 0;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "[J")
    private long[] field4805 = new long[10];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I", line = 4)
    public final int method1985(byte arg0, int arg1) {
        if (arg0 != 105) {
            this.field4803 = -5;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field4800 += this.method2242((byte) 88);
        if (this.field4801 > this.field4800) {
            class219.method1330((this.field4801 - this.field4800) / 1000000L, true);
            this.field4804 += this.field4801 - this.field4800;
            this.field4800 += this.field4801 - this.field4800;
            this.field4801 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4801 += var3;
            var5++;
        } while (var5 < 10 && this.field4800 > this.field4801);
        if (this.field4800 > this.field4801) {
            this.field4801 = this.field4800;
        }
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)J", line = 42)
    public final long method1986(byte arg0) {
        if (arg0 < 44) {
            this.method2242((byte) -114);
        }
        return this.field4800;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 104)
    public class353() {
        this.field4800 = System.nanoTime();
        this.field4801 = System.nanoTime();
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)J", line = 57)
    private final long method2242(byte arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4804;
        this.field4804 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4805[this.field4802] = var4;
            this.field4802 = (this.field4802 + 1) % 10;
            if (this.field4803 < 1) {
                this.field4803++;
            }
        }
        long var6 = 0L;
        if (arg0 <= 67) {
            this.field4800 = -2L;
        }
        for (int var8 = 1; var8 <= this.field4803; var8++) {
            var6 += this.field4805[(this.field4802 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4803;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 89)
    public final void method1984(byte arg0) {
        this.field4804 = 0L;
        if (arg0 != 117) {
            this.method2242((byte) 10);
        }
        if (this.field4800 < this.field4801) {
            this.field4800 += this.field4801 - this.field4800;
        }
    }
}
