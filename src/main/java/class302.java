import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class302 extends class204 {

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "J")
    private long field4132 = 0L;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "J")
    private long field4131 = 0L;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "[J")
    private long[] field4135 = new long[10];

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    private int field4134 = 0;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    private int field4133 = 1;

    @OriginalMember(owner = "client!iba", name = "l", descriptor = "J")
    private long field4136 = 0L;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)J")
    public final long method1459(int arg0) {
        if (arg0 != -1045) {
            this.method1457(-21);
        }
        return this.field4131;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V")
    public final void method1460(int arg0) {
        this.field4136 = 0L;
        if (this.field4131 < this.field4132) {
            this.field4131 += this.field4132 - this.field4131;
        }
        if (arg0 >= -10) {
            this.method1890(-62);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(JI)I")
    public final int method1456(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field4135 = null;
        }
        if (this.field4131 < this.field4132) {
            this.field4136 += this.field4132 - this.field4131;
            this.field4131 += this.field4132 - this.field4131;
            this.field4132 += arg0;
            return 1;
        }
        int var4 = 0;
        do {
            this.field4132 += arg0;
            var4++;
        } while (var4 < 10 && this.field4131 > this.field4132);
        if (this.field4131 > this.field4132) {
            this.field4132 = this.field4131;
        }
        return var4;
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(I)J")
    private final long method1890(int arg0) {
        long var2 = System.nanoTime();
        long var4 = var2 - this.field4136;
        this.field4136 = var2;
        if (var4 > -5000000000L && var4 < 5000000000L) {
            this.field4135[this.field4134] = var4;
            this.field4134 = (this.field4134 + 1) % 10;
            if (this.field4133 < 1) {
                this.field4133++;
            }
        }
        long var6 = 0L;
        int var8 = 1;
        int var9 = 111 / ((arg0 - 40) / 62);
        while (this.field4133 >= var8) {
            var6 += this.field4135[(this.field4134 + 10 - var8) % 10];
            var8++;
        }
        return var6 / (long) this.field4133;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)J")
    public final long method1457(int arg0) {
        this.field4131 += this.method1890(-30);
        if (this.field4131 >= this.field4132) {
            if (arg0 != -6) {
                this.field4134 = 0;
            }
            return 0L;
        } else {
            return (this.field4132 - this.field4131) / 1000000L;
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
    public class302() {
        this.field4131 = System.nanoTime();
        this.field4132 = System.nanoTime();
    }
}
