import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class48 extends class250 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "J")
    private long field628 = 0L;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "J")
    private long field627 = 0L;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[J")
    private long[] field630 = new long[10];

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    private int field631 = 1;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    private int field629 = 0;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "J")
    private long field632 = 0L;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 4)
    public final void method193(byte arg0) {
        if (arg0 > -47) {
            this.field629 = 75;
        }
        if (this.field627 < this.field628) {
            this.field627 += this.field628 - this.field627;
        }
        this.field632 = 0L;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I", line = 18)
    public final int method194(int arg0, int arg1) {
        if (arg1 <= 41) {
            this.method191(true);
        }
        long var3 = (long) arg0 * 1000000L;
        this.field627 += this.method313((byte) 69);
        if (this.field627 < this.field628) {
            class259.method1790((byte) -102, (this.field628 - this.field627) / 1000000L);
            this.field632 += this.field628 - this.field627;
            this.field627 += this.field628 - this.field627;
            this.field628 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field628 += var3;
            var5++;
        } while (var5 < 10 && this.field627 > this.field628);
        if (this.field627 > this.field628) {
            this.field628 = this.field627;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)J", line = 54)
    private final long method313(byte arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field632;
        this.field632 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field630[this.field629] = var4;
            if (this.field631 < 1) {
                this.field631++;
            }
            this.field629 = (this.field629 + 1) % 10;
        }
        if (arg0 < 64) {
            this.field630 = null;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field631; var8++) {
            var6 += this.field630[(this.field629 + 10 - var8) % 10];
        }
        return var6 / (long) this.field631;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)J", line = 88)
    public final long method191(boolean arg0) {
        return arg0 ? this.field627 : -7L;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 103)
    public class48() {
        this.field628 = this.field627 = jagmisc.nanoTime();
        if (this.field627 == 0L) {
            throw new RuntimeException();
        }
    }
}
