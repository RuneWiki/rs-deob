import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class342 extends class13 {

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "J")
    private long field5100 = 0L;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "J")
    private long field5099 = 0L;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    private int field5102 = 0;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "J")
    private long field5101 = 0L;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    private int field5104 = 1;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "[J")
    private long[] field5103 = new long[10];

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)J")
    public final long method69(byte arg0) {
        if (arg0 != 89) {
            this.field5101 = 84L;
        }
        return this.field5099;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)J")
    private final long method2109(int arg0) {
        if (arg0 != -8955) {
            this.method66(18);
        }
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5101;
        this.field5101 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5103[this.field5102] = var4;
            this.field5102 = (this.field5102 + 1) % 10;
            if (this.field5104 < 1) {
                this.field5104++;
            }
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5104; var8++) {
            var6 += this.field5103[(this.field5102 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5104;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public final void method66(int arg0) {
        this.field5101 = 0L;
        if (arg0 != 23913) {
            this.method66(-45);
        }
        if (this.field5100 > this.field5099) {
            this.field5099 += this.field5100 - this.field5099;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)I")
    public final int method65(int arg0, byte arg1) {
        long var3 = (long) arg0 * 1000000L;
        if (arg1 > -101) {
            this.field5103 = null;
        }
        this.field5099 += this.method2109(-8955);
        if (this.field5099 < this.field5100) {
            class414.method2437((this.field5100 - this.field5099) / 1000000L, (byte) -122);
            this.field5101 += this.field5100 - this.field5099;
            this.field5099 += this.field5100 - this.field5099;
            this.field5100 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            var5++;
            this.field5100 += var3;
        } while (var5 < 10 && this.field5099 > this.field5100);
        if (this.field5099 > this.field5100) {
            this.field5100 = this.field5099;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class342() {
        this.field5100 = this.field5099 = jagmisc.nanoTime();
        if (this.field5099 == 0L) {
            throw new RuntimeException();
        }
    }
}
