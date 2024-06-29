import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class70 extends class116 {

    @OriginalMember(owner = "client!l", name = "h", descriptor = "J")
    private long field1140 = 0L;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[J")
    private long[] field1141 = new long[10];

    @OriginalMember(owner = "client!l", name = "j", descriptor = "J")
    private long field1142 = 0L;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    private int field1143 = 1;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "J")
    private long field1145 = 0L;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    private int field1144 = 0;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)J")
    public final long method425(byte arg0) {
        if (arg0 != 109) {
            this.field1142 = -103L;
        }
        return this.field1145;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        this.field1140 = 0L;
        if (arg0 >= -6) {
            this.field1140 = -88L;
        }
        if (this.field1142 > this.field1145) {
            this.field1145 += this.field1142 - this.field1145;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBI)I")
    public final int method427(int arg0, byte arg1, int arg2) {
        if (arg1 <= 39) {
            this.field1145 = 115L;
        }
        long var4 = (long) arg0 * 1000000L;
        class245.method1636(false, (long) arg2);
        this.field1145 += this.method428(-11);
        if (this.field1142 > this.field1145) {
            class245.method1636(false, (this.field1142 - this.field1145) / 1000000L);
            this.field1140 += this.field1142 - this.field1145;
            this.field1145 += this.field1142 - this.field1145;
            this.field1142 += var4;
            return 1;
        }
        int var6 = 0;
        do {
            var6++;
            this.field1142 += var4;
        } while (var6 < 10 && this.field1142 < this.field1145);
        if (this.field1142 < this.field1145) {
            this.field1142 = this.field1145;
        }
        return var6;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)J")
    private final long method428(int arg0) {
        if (arg0 != -11) {
            this.field1143 = 78;
        }
        long var2 = class232.method1544((byte) -114) * 1000000L;
        long var4 = 0L;
        long var6 = var2 - this.field1140;
        this.field1140 = var2;
        if (var6 > 0L && var6 < 5000000000L) {
            this.field1141[this.field1144] = var6;
            if (this.field1143 < 10) {
                this.field1143++;
            }
            this.field1144 = (this.field1144 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field1143; var8++) {
            var4 += this.field1141[(this.field1144 + 10 - var8) % 10];
        }
        return var4 / (long) this.field1143;
    }
}
