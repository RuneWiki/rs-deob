import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class419 extends class204 {

    @OriginalMember(owner = "client!gia", name = "h", descriptor = "J")
    private long field5989 = 0L;

    @OriginalMember(owner = "client!gia", name = "g", descriptor = "J")
    private long field5988 = 0L;

    @OriginalMember(owner = "client!gia", name = "j", descriptor = "I")
    private int field5991 = 1;

    @OriginalMember(owner = "client!gia", name = "i", descriptor = "J")
    private long field5990 = 0L;

    @OriginalMember(owner = "client!gia", name = "l", descriptor = "I")
    private int field5993 = 0;

    @OriginalMember(owner = "client!gia", name = "k", descriptor = "[J")
    private long[] field5992 = new long[10];

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)J")
    public final long method1457(int arg0) {
        this.field5989 += this.method2550(10);
        if (arg0 == -6) {
            return this.field5989 < this.field5988 ? (this.field5988 - this.field5989) / 1000000L : 0L;
        } else {
            return 61L;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(JI)I")
    public final int method1456(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method2550(122);
        }
        if (this.field5989 < this.field5988) {
            this.field5990 += this.field5988 - this.field5989;
            this.field5989 += this.field5988 - this.field5989;
            this.field5988 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field5988 += arg0;
            var4++;
        } while (var4 < 10 && this.field5989 > this.field5988);
        if (this.field5988 < this.field5989) {
            this.field5988 = this.field5989;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)J")
    public final long method1459(int arg0) {
        if (arg0 != -1045) {
            this.field5991 = -31;
        }
        return this.field5989;
    }

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)V")
    public final void method1460(int arg0) {
        if (this.field5988 > this.field5989) {
            this.field5989 += this.field5988 - this.field5989;
        }
        this.field5990 = 0L;
        if (arg0 >= -10) {
            this.field5992 = null;
        }
    }

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "(I)J")
    private final long method2550(int arg0) {
        long var2 = jagmisc.nanoTime();
        long var4 = var2 - this.field5990;
        if (arg0 != 10) {
            this.field5993 = 111;
        }
        this.field5990 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field5992[this.field5993] = var4;
            if (this.field5991 < 1) {
                this.field5991++;
            }
            this.field5993 = (this.field5993 + 1) % 10;
        }
        long var6 = 0L;
        for (int var8 = 1; var8 <= this.field5991; var8++) {
            var6 += this.field5992[(this.field5993 + 10 - var8) % 10];
        }
        return var6 / (long) this.field5991;
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
    public class419() {
        this.field5988 = this.field5989 = jagmisc.nanoTime();
        if (this.field5989 == 0L) {
            throw new RuntimeException();
        }
    }
}
