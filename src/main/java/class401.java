import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class401 extends class601 {

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "J")
    private long field5348 = 0L;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "J")
    private long field5349 = 0L;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "J")
    private long field5350 = 0L;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[J")
    private long[] field5351 = new long[10];

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    private int field5352 = 0;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    private int field5353 = 1;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)J")
    private final long method2189(int arg0) {
        long var2 = jagmisc.nanoTime();
        if (arg0 != -670) {
            return 125L;
        }
        long var4 = var2 - this.field5350;
        this.field5350 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5351[this.field5352] = var4;
            this.field5352 = (this.field5352 + 1) % 10;
            if (this.field5353 < 1) {
                this.field5353++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5353; var8++) {
            var6 += this.field5351[(this.field5352 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5353;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    public final void method999(boolean arg0) {
        if (arg0) {
            this.field5348 = -81L;
        }
        if (this.field5349 > this.field5348) {
            this.field5348 += this.field5349 - this.field5348;
        }
        this.field5350 = 0L;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BJ)I")
    public final int method1001(byte arg0, long arg1) {
        int var4 = -85 / ((-arg0 - 38) / 43);
        if (this.field5349 > this.field5348) {
            this.field5350 += this.field5349 - this.field5348;
            this.field5348 += this.field5349 - this.field5348;
            this.field5349 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5349 += arg1;
        } while (var5 < 10 && this.field5349 < this.field5348);
        if (this.field5349 < this.field5348) {
            this.field5349 = this.field5348;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)J")
    public final long method1002(boolean arg0) {
        if (arg0) {
            this.field5350 = 121L;
        }
        this.field5348 += this.method2189(-670);
        return this.field5349 > this.field5348 ? (this.field5349 - this.field5348) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)J")
    public final long method1000(byte arg0) {
        return arg0 == -19 ? this.field5348 : -38L;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class401() {
        this.field5349 = this.field5348 = jagmisc.nanoTime();
        if (this.field5348 == 0L) {
            throw new RuntimeException();
        }
    }
}
