import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class116 extends class126 {

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "J")
    private long field1617 = 0L;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "J")
    private long field1618 = 0L;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    private int field1620 = 0;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    private int field1621 = 1;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[J")
    private long[] field1619 = new long[10];

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "J")
    private long field1622 = 0L;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)J", line = 3)
    public final long method921(byte arg0) {
        if (arg0 != -53) {
            this.field1618 = -12L;
        }
        return this.field1617;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 104)
    public class116() {
        this.field1618 = this.field1617 = jagmisc.nanoTime();
        if (this.field1617 == 0L) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)J", line = 17)
    private final long method922(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field1622;
        this.field1622 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field1619[this.field1620] = var4;
            this.field1620 = (this.field1620 + 1) % 10;
            if (this.field1621 < 1) {
                this.field1621++;
            }
        }
        long var6 = 0L;
        if (arg0 >= -7) {
            return -77L;
        } else {
            for (int var8 = 1; var8 <= this.field1621; var8++) {
                var6 += this.field1619[(this.field1620 + 10 - var8) % 10];
            }
            return var6 / (long) this.field1621;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)I", line = 51)
    public final int method923(boolean arg0, int arg1) {
        if (!arg0) {
            return 103;
        }
        long var3 = (long) arg1 * 1000000L;
        this.field1617 += this.method922(-25);
        if (this.field1618 > this.field1617) {
            class213.method1462((this.field1618 - this.field1617) / 1000000L, -5184);
            this.field1622 += this.field1618 - this.field1617;
            this.field1617 += this.field1618 - this.field1617;
            this.field1618 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field1618 += var3;
        } while (var5 < 10 && this.field1617 > this.field1618);
        if (this.field1617 > this.field1618) {
            this.field1618 = this.field1617;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 92)
    public final void method924(byte arg0) {
        this.field1622 = 0L;
        if (this.field1617 < this.field1618) {
            this.field1617 += this.field1618 - this.field1617;
        }
        if (arg0 <= 25) {
            this.field1619 = null;
        }
    }
}
