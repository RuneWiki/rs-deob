import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class61 extends class68 {

    @OriginalMember(owner = "client!si", name = "i", descriptor = "J")
    private long field837 = 0L;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "J")
    private long field838 = 0L;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[J")
    private long[] field840 = new long[10];

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    private int field841 = 1;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "J")
    private long field842 = 0L;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    private int field839 = 0;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public final void method381(byte arg0) {
        this.field842 = 0L;
        if (arg0 > 34 && this.field838 < this.field837) {
            this.field838 += this.field837 - this.field838;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)J")
    public final long method382(byte arg0) {
        if (arg0 != 97) {
            this.field841 = 56;
        }
        return this.field838;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)J")
    private final long method383(int arg0) {
        long var2 = System.nanoTime();
        long var4 = (long) arg0;
        long var6 = var2 - this.field842;
        this.field842 = var2;
        if (var6 > -5000000000L && var6 < 5000000000L) {
            this.field840[this.field839] = var6;
            if (this.field841 < 1) {
                this.field841++;
            }
            this.field839 = (this.field839 + 1) % 10;
        }
        for (int var8 = 1; var8 <= this.field841; var8++) {
            var4 += this.field840[(this.field839 + 10 - var8) % 10];
        }
        return var4 / (long) this.field841;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)I")
    public final int method384(byte arg0, int arg1, int arg2) {
        class17.method116(-116, (long) arg1);
        this.field838 += this.method383(0);
        int var4 = -33 % ((arg0 + 44) / 59);
        long var5 = (long) arg2 * 1000000L;
        if (this.field838 < this.field837) {
            class17.method116(107, (this.field837 - this.field838) / 1000000L);
            this.field842 += this.field837 - this.field838;
            this.field838 += this.field837 - this.field838;
            this.field837 += var5;
            return 1;
        }
        int var7 = 0;
        do {
            var7++;
            this.field837 += var5;
        } while (var7 < 10 && this.field837 < this.field838);
        if (this.field838 > this.field837) {
            this.field837 = this.field838;
        }
        return var7;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class61() {
        this.field838 = System.nanoTime();
        this.field837 = System.nanoTime();
    }
}
