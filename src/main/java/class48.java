import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class48 extends class333 {

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "J")
    private long field682 = 0L;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "J")
    private long field683 = 0L;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    private int field686 = 0;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    private int field684 = 1;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "J")
    private long field687 = 0L;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "[J")
    private long[] field685 = new long[10];

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)I", line = 4)
    public final int method299(int arg0, boolean arg1) {
        if (!arg1) {
            this.method301(85);
        }
        long var3 = (long) arg0 * 1000000L;
        this.field683 += this.method302(2500);
        if (this.field683 < this.field682) {
            class463.method2773((this.field682 - this.field683) / 1000000L, 37);
            this.field687 += this.field682 - this.field683;
            this.field683 += this.field682 - this.field683;
            this.field682 += var3;
            return 1;
        }
        int var5 = 0;
        do {
            this.field682 += var3;
            var5++;
        } while (var5 < 10 && this.field683 > this.field682);
        if (this.field682 < this.field683) {
            this.field682 = this.field683;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 40)
    public final void method300(int arg0) {
        if (this.field682 > this.field683) {
            this.field683 += this.field682 - this.field683;
        }
        if (arg0 != 10240) {
            this.field686 = 11;
        }
        this.field687 = 0L;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)J", line = 54)
    public final long method301(int arg0) {
        if (arg0 != -1) {
            this.field687 = -84L;
        }
        return this.field683;
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)J", line = 64)
    private final long method302(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field687;
        this.field687 = var2;
        if (arg0 != 2500) {
            this.field685 = null;
        }
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field685[this.field686] = var4;
            if (this.field684 < 1) {
                this.field684++;
            }
            this.field686 = (this.field686 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field684; var8++) {
            var6 += this.field685[(this.field686 - (var8 - 10)) % 10];
        }
        return var6 / (long) this.field684;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 103)
    public class48() {
        this.field682 = this.field683 = jagmisc.nanoTime();
        if (this.field683 == 0L) {
            throw new RuntimeException();
        }
    }
}
