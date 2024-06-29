import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class28 extends class437 {

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "J")
    private long field267 = 0L;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "J")
    private long field268 = 0L;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "J")
    private long field269 = 0L;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[J")
    private long[] field270 = new long[10];

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    private int field271 = 1;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    private int field272 = 0;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I", line = 5)
    public final int method136(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        this.field267 += this.method138(-28375);
        if (arg0 != 1) {
            return -67;
        } else if (this.field267 < this.field268) {
            class370.method2235((this.field268 - this.field267) / 1000000L, 10);
            this.field269 += this.field268 - this.field267;
            this.field267 += this.field268 - this.field267;
            this.field268 += var3;
            return 1;
        } else {
            int var5 = 0;
            do {
                this.field268 += var3;
                var5++;
            } while (var5 < 10 && this.field268 < this.field267);
            if (this.field268 < this.field267) {
                this.field268 = this.field267;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 43)
    public final void method137(byte arg0) {
        this.field269 = 0L;
        if (arg0 == -57 && this.field267 < this.field268) {
            this.field267 += this.field268 - this.field267;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 105)
    public class28() {
        this.field267 = System.nanoTime();
        this.field268 = System.nanoTime();
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)J", line = 61)
    private final long method138(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field269;
        this.field269 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field270[this.field272] = var4;
            if (this.field271 < 1) {
                this.field271++;
            }
            this.field272 = (this.field272 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 != -28375) {
            this.field268 = 105L;
        }
        for (int var8 = 1; var8 <= this.field271; var8++) {
            var6 += this.field270[(this.field272 + 10 - var8) % 10];
        }
        return var6 / (long) this.field271;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)J", line = 97)
    public final long method139(boolean arg0) {
        return arg0 ? this.field267 : 62L;
    }
}
