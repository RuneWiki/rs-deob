import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class113 extends class130 {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "J")
    private long field1598 = 0L;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "J")
    private long field1599 = 0L;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    private int field1600 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[J")
    private long[] field1601 = new long[10];

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    private int field1602 = 1;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "J")
    private long field1603 = 0L;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)I")
    public final int method754(long arg0, int arg1) {
        if (arg1 != 255) {
            this.field1599 = -9L;
        }
        if (this.field1598 < this.field1599) {
            this.field1603 += this.field1599 - this.field1598;
            this.field1598 += this.field1599 - this.field1598;
            this.field1599 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            this.field1599 += arg0;
        } while (var4 < 10 && this.field1598 > this.field1599);
        if (this.field1599 < this.field1598) {
            this.field1599 = this.field1598;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)J")
    public final long method755(int arg0) {
        if (arg0 != 30706) {
            this.method758(92);
        }
        return this.field1598;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J")
    public final long method756(byte arg0) {
        this.field1598 += this.method758(-2503);
        if (this.field1598 < this.field1599) {
            return (this.field1599 - this.field1598) / 1000000L;
        } else {
            if (arg0 < 80) {
                this.field1603 = -43L;
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method757(int arg0) {
        if (this.field1598 < this.field1599) {
            this.field1598 += this.field1599 - this.field1598;
        }
        if (arg0 != 15749) {
            this.field1600 = 127;
        }
        this.field1603 = 0L;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)J")
    private final long method758(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1603;
        this.field1603 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1601[this.field1600] = var4;
            if (this.field1602 < 1) {
                this.field1602++;
            }
            this.field1600 = (this.field1600 + 1) % 10;
        }
        long var6 = 0L;
        if (arg0 == -2503) {
            for (int var8 = 1; var8 <= this.field1602; var8++) {
                var6 += this.field1601[(this.field1600 + 10 - var8) % 10];
            }
            return var6 / (long) this.field1602;
        } else {
            return 13L;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class113() {
        this.field1599 = this.field1598 = jagmisc.nanoTime();
        if (this.field1598 == 0L) {
            throw new RuntimeException();
        }
    }
}
