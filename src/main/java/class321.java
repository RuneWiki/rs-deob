import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class321 extends class642 {

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "J")
    private long field4083 = 0L;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "J")
    private long field4084 = 0L;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "J")
    private long field4087 = 0L;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    private int field4085 = 0;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[J")
    private long[] field4086 = new long[10];

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    private int field4088 = 1;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)J")
    private final long method1769(int arg0) {
        if (arg0 != 10) {
            this.field4085 = 94;
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field4087;
        this.field4087 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4086[this.field4085] = var4;
            this.field4085 = (this.field4085 + 1) % 10;
            if (this.field4088 < 1) {
                this.field4088++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field4088; var8++) {
            var6 += this.field4086[(this.field4085 + 10 - var8) % 10];
        }
        return var6 / (long) this.field4088;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public final void method1770(int arg0) {
        this.field4087 = 0L;
        if (arg0 != 21308) {
            this.field4083 = 35L;
        }
        if (this.field4084 > this.field4083) {
            this.field4083 += this.field4084 - this.field4083;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BJ)I")
    public final int method1771(byte arg0, long arg1) {
        int var4 = -58 % ((-arg0 - 64) / 59);
        if (this.field4083 < this.field4084) {
            this.field4087 += this.field4084 - this.field4083;
            this.field4083 += this.field4084 - this.field4083;
            this.field4084 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field4084 += arg1;
            var5++;
        } while (var5 < 10 && this.field4083 > this.field4084);
        if (this.field4084 < this.field4083) {
            this.field4084 = this.field4083;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)J")
    public final long method1772(byte arg0) {
        return arg0 < 119 ? -89L : this.field4083;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)J")
    public final long method1773(int arg0) {
        this.field4083 += this.method1769(10);
        if (this.field4084 > this.field4083) {
            return (this.field4084 - this.field4083) / 1000000L;
        } else {
            if (arg0 != -5866) {
                this.field4087 = -6L;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class321() {
        this.field4084 = this.field4083 = jagmisc.nanoTime();
        if (this.field4083 == 0L) {
            throw new RuntimeException();
        }
    }
}
