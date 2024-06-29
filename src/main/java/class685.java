import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class685 extends class130 {

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    private int field9620 = 1;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "J")
    private long field9619 = 0L;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "J")
    private long field9621 = 0L;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "J")
    private long field9623 = 0L;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    private int field9622 = 0;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "[J")
    private long[] field9624 = new long[10];

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(B)J")
    private final long method3911(byte arg0) {
        if (arg0 != -120) {
            this.field9623 = -126L;
        }
        long var2 = class224.method1457((byte) -62) * 1000000L;
        long var4 = var2 - this.field9619;
        this.field9619 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field9624[this.field9622] = var4;
            if (this.field9620 < 10) {
                this.field9620++;
            }
            this.field9622 = (this.field9622 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field9620; var8++) {
            var6 += this.field9624[(this.field9622 + 10 - var8) % 10];
        }
        return var6 / (long) this.field9620;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)J")
    public final long method755(int arg0) {
        if (arg0 != 30706) {
            this.field9624 = null;
        }
        return this.field9621;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)J")
    public final long method756(byte arg0) {
        this.field9621 += this.method3911((byte) -120);
        if (arg0 <= 80) {
            this.field9622 = 27;
        }
        return this.field9623 > this.field9621 ? (this.field9623 - this.field9621) / 1000000L : 0L;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(JI)I")
    public final int method754(long arg0, int arg1) {
        if (arg1 != 255) {
            return -5;
        } else if (this.field9623 > this.field9621) {
            this.field9619 += this.field9623 - this.field9621;
            this.field9621 += this.field9623 - this.field9621;
            this.field9623 += arg0;
            return 1;
        } else {
            int var4 = 0;
            do {
                var4++;
                this.field9623 += arg0;
            } while (var4 < 10 && this.field9623 < this.field9621);
            if (this.field9623 < this.field9621) {
                this.field9623 = this.field9621;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public final void method757(int arg0) {
        if (this.field9623 > this.field9621) {
            this.field9621 += this.field9623 - this.field9621;
        }
        this.field9619 = 0L;
        if (arg0 != 15749) {
            this.method756((byte) 6);
        }
    }
}
