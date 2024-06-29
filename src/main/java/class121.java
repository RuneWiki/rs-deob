import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class121 extends class57 {

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "J")
    private long field1259 = 0L;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "J")
    private long field1260 = 0L;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "[J")
    private long[] field1261 = new long[10];

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "J")
    private long field1262 = 0L;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    private int field1263 = 1;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    private int field1264 = 0;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)J", line = 3)
    public final long method312(int arg0) {
        if (arg0 < 106) {
            this.method309((byte) -50, -84L);
        }
        return this.field1260;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)J", line = 14)
    public final long method311(byte arg0) {
        if (arg0 < 45) {
            return -19L;
        } else {
            this.field1260 += this.method780(125);
            return this.field1260 < this.field1259 ? (this.field1259 - this.field1260) / 1000000L : 0L;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V", line = 114)
    public class121() {
        this.field1259 = this.field1260 = jagmisc.nanoTime();
        if (this.field1260 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 34)
    public final void method310(byte arg0) {
        this.field1262 = 0L;
        int var2 = -44 % ((-arg0 - 62) / 49);
        if (this.field1260 < this.field1259) {
            this.field1260 += this.field1259 - this.field1260;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BJ)I", line = 47)
    public final int method309(byte arg0, long arg1) {
        int var4 = 83 % ((-arg0 - 71) / 51);
        if (this.field1260 < this.field1259) {
            this.field1262 += this.field1259 - this.field1260;
            this.field1260 += this.field1259 - this.field1260;
            this.field1259 += arg1;
            return 1;
        }
        int var5 = 0;
        do {
            this.field1259 += arg1;
            var5++;
        } while (var5 < 10 && this.field1260 > this.field1259);
        if (this.field1259 < this.field1260) {
            this.field1259 = this.field1260;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)J", line = 79)
    private final long method780(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1262;
        this.field1262 = var2;
        if (arg0 <= 75) {
            this.method309((byte) 84, 97L);
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1261[this.field1264] = var4;
            this.field1264 = (this.field1264 + 1) % 10;
            if (this.field1263 < 1) {
                this.field1263++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field1263; var8++) {
            var6 += this.field1261[(this.field1264 + 10 - var8) % 10];
        }
        return var6 / (long) this.field1263;
    }
}
