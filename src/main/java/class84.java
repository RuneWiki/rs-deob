import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class84 extends class137 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "J")
    private long field1208 = 0L;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "J")
    private long field1209 = 0L;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "J")
    private long field1210 = 0L;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    private int field1212 = 1;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[J")
    private long[] field1213 = new long[10];

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    private int field1211 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I", line = 5)
    public final int method651(int arg0, int arg1, int arg2) {
        class186.method1304(10, (long) arg0);
        if (arg2 != 26) {
            this.field1211 = -112;
        }
        long var4 = this.method653(-63);
        long var6 = (long) arg1 * 1000000L;
        this.field1208 += var4;
        if (this.field1208 >= this.field1209) {
            int var10 = 0;
            do {
                var10++;
                this.field1209 += var6;
            } while (var10 < 10 && this.field1209 < this.field1208);
            if (this.field1209 < this.field1208) {
                this.field1209 = this.field1208;
            }
            return var10;
        }
        while (this.field1209 > this.field1208) {
            long var8 = this.field1209 - this.field1208;
            if (var8 > var4) {
                var8 = var4;
            }
            if (var8 < 1000000L) {
                var8 = 1000000L;
            }
            class186.method1304(10, (var8 + 500000L) / 1000000L);
            var4 = this.method653(-97);
            this.field1208 += var4;
        }
        this.field1209 += var6;
        return 1;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 82)
    public class84() {
        this.field1208 = System.nanoTime();
        this.field1209 = System.nanoTime();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 67)
    public final void method652(byte arg0) {
        this.field1210 = 0L;
        if (arg0 >= -101) {
            this.method651(-105, -29, 29);
        }
        if (this.field1208 < this.field1209) {
            this.field1208 += this.field1209 - this.field1208;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)J", line = 94)
    private final long method653(int arg0) {
        if (arg0 >= -20) {
            return -103L;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field1210;
        long var6 = 0L;
        this.field1210 = var2;
        if (var4 > 0L && var4 < 5000000000L) {
            this.field1213[this.field1211] = var4;
            if (this.field1212 < 1) {
                this.field1212++;
            }
            this.field1211 = (this.field1211 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field1212; var8++) {
            var6 += this.field1213[(this.field1211 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1212;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)J", line = 125)
    public final long method654(int arg0) {
        if (arg0 != 26) {
            this.method654(-33);
        }
        return this.field1208;
    }
}
