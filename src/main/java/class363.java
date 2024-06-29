import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class363 extends class324 {

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "J")
    private long field5082 = 0L;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "J")
    private long field5083 = 0L;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "[J")
    private long[] field5087 = new long[10];

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    private int field5085 = 1;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "J")
    private long field5084 = 0L;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    private int field5086 = 0;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "(I)J")
    public final long method280(int arg0) {
        int var2 = -11 / ((arg0 - 37) / 41);
        this.field5083 += this.method2245(92);
        return this.field5082 <= this.field5083 ? 0L : (this.field5082 - this.field5083) / 1000000L;
    }

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "(I)J")
    private final long method2245(int arg0) {
        int var2 = -1 % ((arg0 - 41) / 39);
        long var3 = System.nanoTime();
        long var5 = var3 - this.field5084;
        this.field5084 = var3;
        if (var5 > -5000000000L && var5 < 5000000000L) {
            this.field5087[this.field5086] = var5;
            this.field5086 = (this.field5086 + 1) % 10;
            if (this.field5085 < 1) {
                this.field5085++;
            }
        }
        long var7 = 0L;
        for (int var9 = 1; var9 <= this.field5085; var9++) {
            var7 += this.field5087[(this.field5086 + 10 - var9) % 10];
        }
        return var7 / (long) this.field5085;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IJ)I")
    public final int method278(int arg0, long arg1) {
        if (arg0 < 19) {
            this.field5084 = -87L;
        }
        if (this.field5082 > this.field5083) {
            this.field5084 += this.field5082 - this.field5083;
            this.field5083 += this.field5082 - this.field5083;
            this.field5082 += arg1;
            return 1;
        }
        int var4 = 0;
        do {
            this.field5082 += arg1;
            var4++;
        } while (var4 < 10 && this.field5082 < this.field5083);
        if (this.field5082 < this.field5083) {
            this.field5082 = this.field5083;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)J")
    public final long method281(int arg0) {
        if (arg0 != -9060) {
            this.field5087 = null;
        }
        return this.field5083;
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public final void method282(int arg0) {
        if (this.field5083 < this.field5082) {
            this.field5083 += this.field5082 - this.field5083;
        }
        this.field5084 = 0L;
        if (arg0 != 17184) {
            this.method282(-43);
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "()V")
    public class363() {
        this.field5083 = System.nanoTime();
        this.field5082 = System.nanoTime();
    }
}
